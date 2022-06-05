package com.ucare.we.billsummary;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.BillSummaryModel.ResponseFinalizeBillSummary;
import com.ucare.we.model.BillSummaryModel.ResponseInitiateBillSummary;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.util.OTPView;
import defpackage.au;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfirmDownloadingBillSummaryActivity extends dae implements dju {
    TextView a;
    byte[] b;
    String c;
    String d;
    @Inject
    djg e;
    @Inject
    djw f;
    private TextView s;
    private TextView t;
    private TextView u;
    private OTPView x;
    private String y;
    private final int j = 1;
    private final int k = 2;
    private final int l = 3;
    private final BroadcastReceiver m = new BroadcastReceiver() { // from class: com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity.1
        {
            ConfirmDownloadingBillSummaryActivity.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).i != 0) {
                    return;
                }
                if (ConfirmDownloadingBillSummaryActivity.this.getCallingActivity() != null && !ConfirmDownloadingBillSummaryActivity.this.getCallingActivity().getPackageName().equals("com.ucare.we")) {
                    return;
                }
                try {
                    ConfirmDownloadingBillSummaryActivity.this.startActivityForResult((Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT"), 499);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
    };
    private final au.a n = new au.a() { // from class: com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity.2
        {
            ConfirmDownloadingBillSummaryActivity.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ConfirmDownloadingBillSummaryActivity.this.e.a();
            ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity = ConfirmDownloadingBillSummaryActivity.this;
            ResponseActivity.a(confirmDownloadingBillSummaryActivity, confirmDownloadingBillSummaryActivity.getString(R.string.error), ConfirmDownloadingBillSummaryActivity.this.getString(R.string.generic_error), true);
            ConfirmDownloadingBillSummaryActivity.this.finish();
        }
    };
    private final au.a o = new au.a() { // from class: com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity.3
        {
            ConfirmDownloadingBillSummaryActivity.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ConfirmDownloadingBillSummaryActivity.this.e.a();
            ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity = ConfirmDownloadingBillSummaryActivity.this;
            ResponseActivity.a(confirmDownloadingBillSummaryActivity, confirmDownloadingBillSummaryActivity.getString(R.string.error), ConfirmDownloadingBillSummaryActivity.this.getString(R.string.generic_error), true);
            ConfirmDownloadingBillSummaryActivity.this.finish();
        }
    };
    private final au.b<byte[]> p = new au.b<byte[]>() { // from class: com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity.4
        {
            ConfirmDownloadingBillSummaryActivity.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(byte[] bArr) {
            ConfirmDownloadingBillSummaryActivity.this.e.a();
            ConfirmDownloadingBillSummaryActivity.this.b = bArr;
            if (ConfirmDownloadingBillSummaryActivity.a(ConfirmDownloadingBillSummaryActivity.this)) {
                if (Build.VERSION.SDK_INT >= 30) {
                    new StringBuilder("https://api-my.te.eg/").append(ConfirmDownloadingBillSummaryActivity.this.d);
                    new cyh(ConfirmDownloadingBillSummaryActivity.this).a("bill_summary.pdf", ConfirmDownloadingBillSummaryActivity.this.b);
                    ConfirmDownloadingBillSummaryActivity.this.finish();
                    return;
                }
                ConfirmDownloadingBillSummaryActivity.b(ConfirmDownloadingBillSummaryActivity.this);
                return;
            }
            ConfirmDownloadingBillSummaryActivity.this.a();
        }
    };
    private final au.a q = new au.a() { // from class: com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity.5
        {
            ConfirmDownloadingBillSummaryActivity.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ConfirmDownloadingBillSummaryActivity.this.e.a();
            ConfirmDownloadingBillSummaryActivity.this.finish();
            if (volleyError.a != null) {
                if (volleyError.a.a == 404) {
                    ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity = ConfirmDownloadingBillSummaryActivity.this;
                    UnNavigateResponseActivity.a(confirmDownloadingBillSummaryActivity, confirmDownloadingBillSummaryActivity.getString(R.string.file_not_found), ConfirmDownloadingBillSummaryActivity.this.getString(R.string.please_try_again), true);
                    return;
                } else if (volleyError.a.a == 500) {
                    ConfirmDownloadingBillSummaryActivity.this.b(3);
                    return;
                } else if (volleyError.a.a == 400) {
                    ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity2 = ConfirmDownloadingBillSummaryActivity.this;
                    UnNavigateResponseActivity.a(confirmDownloadingBillSummaryActivity2, confirmDownloadingBillSummaryActivity2.getString(R.string.file_not_found), ConfirmDownloadingBillSummaryActivity.this.getString(R.string.please_try_again), true);
                    return;
                } else if (volleyError.a.a != 502) {
                    return;
                } else {
                    ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity3 = ConfirmDownloadingBillSummaryActivity.this;
                    UnNavigateResponseActivity.a(confirmDownloadingBillSummaryActivity3, confirmDownloadingBillSummaryActivity3.getString(R.string.file_not_found), ConfirmDownloadingBillSummaryActivity.this.getString(R.string.please_try_again), true);
                    return;
                }
            }
            ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity4 = ConfirmDownloadingBillSummaryActivity.this;
            UnNavigateResponseActivity.a(confirmDownloadingBillSummaryActivity4, confirmDownloadingBillSummaryActivity4.getString(R.string.file_not_found), ConfirmDownloadingBillSummaryActivity.this.getString(R.string.please_try_again), true);
        }
    };
    private final au.b<JSONObject> r = new au.b<JSONObject>() { // from class: com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity.6
        {
            ConfirmDownloadingBillSummaryActivity.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ConfirmDownloadingBillSummaryActivity.this.e.a();
            ResponseInitiateBillSummary responseInitiateBillSummary = (ResponseInitiateBillSummary) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseInitiateBillSummary.class);
            if (responseInitiateBillSummary.getHeader().getResponseCode().equals("1200")) {
                ConfirmDownloadingBillSummaryActivity.this.b(2);
            } else if (!responseInitiateBillSummary.getHeader().getResponseCode().equals("0")) {
            } else {
                ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity = ConfirmDownloadingBillSummaryActivity.this;
                String maskedMsisdn = responseInitiateBillSummary.getBody().getMaskedMsisdn();
                if (maskedMsisdn == null) {
                    return;
                }
                if (confirmDownloadingBillSummaryActivity.f.k().equalsIgnoreCase("ar")) {
                    TextView textView = confirmDownloadingBillSummaryActivity.a;
                    textView.setText(confirmDownloadingBillSummaryActivity.getString(R.string.download_bill_confirmation_code_hint_p1) + djm.d(maskedMsisdn) + confirmDownloadingBillSummaryActivity.getString(R.string.download_bill_confirmation_code_hint_p2));
                    return;
                }
                TextView textView2 = confirmDownloadingBillSummaryActivity.a;
                textView2.setText(confirmDownloadingBillSummaryActivity.getString(R.string.download_bill_confirmation_code_hint_p1) + maskedMsisdn + confirmDownloadingBillSummaryActivity.getString(R.string.download_bill_confirmation_code_hint_p2));
            }
        }
    };
    View.OnClickListener g = new View.OnClickListener() { // from class: com.ucare.we.billsummary.-$$Lambda$ConfirmDownloadingBillSummaryActivity$Z4FtnNTJ4bnJGK4Ad3izjXY4ECM
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmDownloadingBillSummaryActivity.lambda$Z4FtnNTJ4bnJGK4Ad3izjXY4ECM(ConfirmDownloadingBillSummaryActivity.this, view);
        }
    };
    View.OnClickListener h = new View.OnClickListener() { // from class: com.ucare.we.billsummary.-$$Lambda$ConfirmDownloadingBillSummaryActivity$kMf95NjjKfM7i_jpKoX-TfbqMw8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmDownloadingBillSummaryActivity.m15lambda$kMf95NjjKfM7i_jpKoXTfbqMw8(ConfirmDownloadingBillSummaryActivity.this, view);
        }
    };
    View.OnClickListener i = new View.OnClickListener() { // from class: com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity.7
        {
            ConfirmDownloadingBillSummaryActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity = ConfirmDownloadingBillSummaryActivity.this;
            confirmDownloadingBillSummaryActivity.c = confirmDownloadingBillSummaryActivity.x.getStringFromFields();
            ConfirmDownloadingBillSummaryActivity.d(ConfirmDownloadingBillSummaryActivity.this);
        }
    };
    private final au.b<JSONObject> z = new au.b<JSONObject>() { // from class: com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity.8
        {
            ConfirmDownloadingBillSummaryActivity.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            Gson gson = new Gson();
            ConfirmDownloadingBillSummaryActivity.this.e.a();
            ResponseFinalizeBillSummary responseFinalizeBillSummary = (ResponseFinalizeBillSummary) gson.a(jSONObject2.toString(), (Class<Object>) ResponseFinalizeBillSummary.class);
            if (responseFinalizeBillSummary != null && responseFinalizeBillSummary.getHeader() != null && responseFinalizeBillSummary.getHeader().responseCode.equals("0")) {
                for (int i = 0; i < responseFinalizeBillSummary.getBody().size(); i++) {
                    if (responseFinalizeBillSummary.getBody().get(i).getInvoiceNo().equals(ConfirmDownloadingBillSummaryActivity.this.y)) {
                        if (responseFinalizeBillSummary.getBody().get(i).getInvoiceURL() != null) {
                            ConfirmDownloadingBillSummaryActivity.this.f.p(jSONObject2.toString());
                            ConfirmDownloadingBillSummaryActivity.this.d = responseFinalizeBillSummary.getBody().get(i).getInvoiceURL();
                            ConfirmDownloadingBillSummaryActivity.this.a();
                            ConfirmDownloadingBillSummaryActivity.a(ConfirmDownloadingBillSummaryActivity.this, responseFinalizeBillSummary.getBody().get(i).getInvoiceURL());
                            return;
                        }
                        ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity = ConfirmDownloadingBillSummaryActivity.this;
                        ResponseActivity.a(confirmDownloadingBillSummaryActivity, confirmDownloadingBillSummaryActivity.getString(R.string.error), ConfirmDownloadingBillSummaryActivity.this.getString(R.string.unavailable_link), true);
                        return;
                    }
                }
            } else if (responseFinalizeBillSummary != null && responseFinalizeBillSummary.getHeader() != null && responseFinalizeBillSummary.getHeader().responseCode.equals("0")) {
                ConfirmDownloadingBillSummaryActivity.this.b(1);
            } else {
                UnNavigateResponseActivity.a(ConfirmDownloadingBillSummaryActivity.this, responseFinalizeBillSummary.getHeader().responseMessage, ConfirmDownloadingBillSummaryActivity.this.getApplicationContext().getString(R.string.try_again), true);
            }
        }
    };

    /* renamed from: lambda$8VPpNqT0atDXYtEi-q3DMF19c64 */
    public static /* synthetic */ void m14lambda$8VPpNqT0atDXYtEiq3DMF19c64(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity) {
        confirmDownloadingBillSummaryActivity.d();
    }

    public static /* synthetic */ dmg lambda$DuCe7DoMMdUP7_1If5YW4Qn2p8o(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity, Boolean bool) {
        return confirmDownloadingBillSummaryActivity.a(bool);
    }

    public static /* synthetic */ void lambda$Z4FtnNTJ4bnJGK4Ad3izjXY4ECM(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity, View view) {
        confirmDownloadingBillSummaryActivity.b(view);
    }

    /* renamed from: lambda$kMf95NjjKfM7i_jpKoX-TfbqMw8 */
    public static /* synthetic */ void m15lambda$kMf95NjjKfM7i_jpKoXTfbqMw8(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity, View view) {
        confirmDownloadingBillSummaryActivity.a(view);
    }

    public static /* synthetic */ dmg lambda$xOxS74dCmBoFvXBGlaKW2yfF1vY(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity, String str) {
        return confirmDownloadingBillSummaryActivity.b(str);
    }

    public /* synthetic */ void b(View view) {
        finish();
    }

    public /* synthetic */ void a(View view) {
        b();
        Toast.makeText(this, (int) R.string.code_resent, 0).show();
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_downloading_bill_summary);
        this.y = getIntent().getStringExtra("invoiceNo");
        TextView textView = (TextView) findViewById(R.id.txtOK);
        this.s = textView;
        textView.setEnabled(false);
        this.s.setAlpha(0.15f);
        this.t = (TextView) findViewById(R.id.txtCancel);
        this.u = (TextView) findViewById(R.id.txtResendSMS);
        this.a = (TextView) findViewById(R.id.txtConfirmationHint);
        this.x = (OTPView) findViewById(R.id.otp_view);
        this.s.setOnClickListener(this.i);
        this.t.setOnClickListener(this.g);
        this.u.setOnClickListener(this.h);
        this.x.setOnCharacterUpdatedListener(new dow() { // from class: com.ucare.we.billsummary.-$$Lambda$ConfirmDownloadingBillSummaryActivity$DuCe7DoMMdUP7_1If5YW4Qn2p8o
            @Override // defpackage.dow
            public final Object invoke(Object obj) {
                return ConfirmDownloadingBillSummaryActivity.lambda$DuCe7DoMMdUP7_1If5YW4Qn2p8o(ConfirmDownloadingBillSummaryActivity.this, (Boolean) obj);
            }
        });
        this.x.setOnFinishListener(new dow() { // from class: com.ucare.we.billsummary.-$$Lambda$ConfirmDownloadingBillSummaryActivity$xOxS74dCmBoFvXBGlaKW2yfF1vY
            @Override // defpackage.dow
            public final Object invoke(Object obj) {
                return ConfirmDownloadingBillSummaryActivity.lambda$xOxS74dCmBoFvXBGlaKW2yfF1vY(ConfirmDownloadingBillSummaryActivity.this, (String) obj);
            }
        });
        b();
    }

    private void b() {
        c();
        try {
            this.e.a(this, getString(R.string.loading));
            djl.a(this).i(this.r, this.n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ dmg a(Boolean bool) {
        if (!bool.booleanValue()) {
            this.s.setEnabled(false);
            this.s.setAlpha(0.15f);
            return null;
        }
        this.s.setEnabled(true);
        this.s.setAlpha(1.0f);
        return null;
    }

    public /* synthetic */ dmg b(String str) {
        if (str.trim().length() != 6) {
            this.s.setEnabled(false);
            this.s.setAlpha(0.15f);
            return null;
        }
        this.s.setEnabled(true);
        this.s.setAlpha(1.0f);
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            try {
                if (this.b == null) {
                    return;
                }
                openFileOutput("bill_summary.pdf", 32768);
                String file = Environment.getExternalStorageDirectory().toString();
                File file2 = new File(file + "/saved_bills_summary");
                file2.mkdirs();
                File file3 = new File(file2, "bill_summary.pdf");
                try {
                    if (file3.exists()) {
                        file3.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    fileOutputStream.write(this.b);
                    fileOutputStream.close();
                    this.e.a();
                    a(file3);
                    finish();
                    return;
                } catch (Exception e) {
                    e.getMessage();
                    this.e.a();
                    UnNavigateResponseActivity.a(this, getString(R.string.file_not_found), getString(R.string.please_try_again), true);
                    finish();
                    return;
                }
            } catch (Exception unused) {
                this.e.a();
                UnNavigateResponseActivity.a(this, getString(R.string.file_not_found), getString(R.string.please_try_again), true);
                finish();
                return;
            }
        }
        Toast.makeText(this, "Permission denied to write on your External storage", 0).show();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            try {
                djl.a(this).a(this.c, this.z, this.o);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            b();
        } else if (i != 3) {
        } else {
            try {
                djl.a(this).b(this.d, this.p, this.q);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    private void a(File file) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(1);
            intent.setDataAndType(FileProvider.getUriForFile(this, "com.ucare.we.provider", file), "application/pdf");
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "File Location:" + file.toString(), 1).show();
        }
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 499 && i2 == -1) {
            this.x.setText(intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE").replaceAll("[^0-9]", ""));
            this.s.setEnabled(true);
            this.s.setAlpha(1.0f);
            this.s.post(new Runnable() { // from class: com.ucare.we.billsummary.-$$Lambda$ConfirmDownloadingBillSummaryActivity$8VPpNqT0atDXYtEi-q3DMF19c64
                @Override // java.lang.Runnable
                public final void run() {
                    ConfirmDownloadingBillSummaryActivity.m14lambda$8VPpNqT0atDXYtEiq3DMF19c64(ConfirmDownloadingBillSummaryActivity.this);
                }
            });
        }
    }

    private void c() {
        tf.a((Activity) this).a().a($$Lambda$ConfirmDownloadingBillSummaryActivity$wIw9l6UHErnJR1ohOdRMsDrB7w.INSTANCE);
    }

    public static /* synthetic */ void a(bwl bwlVar) {
        if (!bwlVar.e()) {
            bwlVar.a().printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        registerReceiver(this.m, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.m);
    }

    public /* synthetic */ void d() {
        this.s.performClick();
    }

    static /* synthetic */ boolean a(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity) {
        return ContextCompat.checkSelfPermission((Context) Objects.requireNonNull(confirmDownloadingBillSummaryActivity.getApplicationContext()), "android.permission.READ_EXTERNAL_STORAGE") == 0 && ContextCompat.checkSelfPermission((Context) Objects.requireNonNull(confirmDownloadingBillSummaryActivity.getApplicationContext()), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    static /* synthetic */ void b(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity) {
        try {
            if (confirmDownloadingBillSummaryActivity.b == null) {
                return;
            }
            confirmDownloadingBillSummaryActivity.openFileOutput("bill_summary.pdf", 32768);
            String file = Environment.getExternalStorageDirectory().toString();
            File file2 = new File(file + "/saved_bills_summary");
            file2.mkdirs();
            File file3 = new File(file2, "bill_summary.pdf");
            try {
                if (file3.exists()) {
                    file3.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(confirmDownloadingBillSummaryActivity.b);
                fileOutputStream.close();
                confirmDownloadingBillSummaryActivity.e.a();
                confirmDownloadingBillSummaryActivity.a(file3);
                confirmDownloadingBillSummaryActivity.finish();
            } catch (Exception e) {
                e.getMessage();
                confirmDownloadingBillSummaryActivity.e.a();
                UnNavigateResponseActivity.a(confirmDownloadingBillSummaryActivity, confirmDownloadingBillSummaryActivity.getString(R.string.file_not_found), confirmDownloadingBillSummaryActivity.getString(R.string.please_try_again), true);
                confirmDownloadingBillSummaryActivity.finish();
            }
        } catch (Exception unused) {
            confirmDownloadingBillSummaryActivity.e.a();
            UnNavigateResponseActivity.a(confirmDownloadingBillSummaryActivity, confirmDownloadingBillSummaryActivity.getString(R.string.file_not_found), confirmDownloadingBillSummaryActivity.getString(R.string.please_try_again), true);
            confirmDownloadingBillSummaryActivity.finish();
        }
    }

    static /* synthetic */ void d(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity) {
        try {
            confirmDownloadingBillSummaryActivity.e.a(confirmDownloadingBillSummaryActivity, confirmDownloadingBillSummaryActivity.getString(R.string.loading));
            djl.a(confirmDownloadingBillSummaryActivity).a(confirmDownloadingBillSummaryActivity.c, confirmDownloadingBillSummaryActivity.z, confirmDownloadingBillSummaryActivity.o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ void a(ConfirmDownloadingBillSummaryActivity confirmDownloadingBillSummaryActivity, String str) {
        try {
            confirmDownloadingBillSummaryActivity.e.a(confirmDownloadingBillSummaryActivity, confirmDownloadingBillSummaryActivity.getString(R.string.loading));
            djl.a(confirmDownloadingBillSummaryActivity).b(str, confirmDownloadingBillSummaryActivity.p, confirmDownloadingBillSummaryActivity.q);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
