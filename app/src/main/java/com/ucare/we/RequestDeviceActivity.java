package com.ucare.we;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.adapters.TicketsImageListAdapter;
import com.ucare.we.model.DeviceTypes;
import com.ucare.we.model.ticket.TroubleTicketsResponseTypes;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class RequestDeviceActivity extends czy implements dhq {
    private static final String n = RequestDeviceActivity.class.getSimpleName();
    @BindView(R.id.addImage)
    ImageView addImage;
    @BindView(R.id.address)
    TextInputEditText address;
    @Inject
    djg b;
    @BindView(R.id.btn_get_started)
    Button btnGetStarted;
    @Inject
    djw c;
    @Inject
    dij d;
    ArrayList<DeviceTypes> e;
    @BindView(R.id.email)
    TextInputEditText email;
    String i;
    @BindView(R.id.imagesRecyclerView)
    RecyclerView imagesRecyclerView;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    ArrayList<Bitmap> j;
    ArrayList<String> k;
    TicketsImageListAdapter l;
    @BindView(R.id.need_installation)
    TextView needInstallationTextView;
    @BindView(R.id.number)
    TextInputEditText number;
    @BindView(R.id.requestReason)
    EditText requestReasonEditText;
    @BindView(R.id.til_address)
    TextInputLayout til_address;
    @BindView(R.id.til_email)
    TextInputLayout til_email;
    @BindView(R.id.til_number)
    TextInputLayout til_number;
    @BindView(R.id.tvDeviceType)
    TextView tvDeviceType;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    private final int o = 4;
    private final int p = 3;
    public dje<Pair<String, Boolean>> a = new dje<>();
    private final TextWatcher q = new TextWatcher() { // from class: com.ucare.we.RequestDeviceActivity.1
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        {
            RequestDeviceActivity.this = this;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (RequestDeviceActivity.this.tvDeviceType.getText().toString().length() == 0 || RequestDeviceActivity.this.needInstallationTextView.getText().toString().length() == 0 || RequestDeviceActivity.this.address.getText().toString().length() == 0 || RequestDeviceActivity.this.number.toString().trim().length() == 0 || RequestDeviceActivity.this.email.getText().equals(RequestDeviceActivity.this.getString(R.string.not_set))) {
                RequestDeviceActivity.this.btnGetStarted.setAlpha(0.6f);
                RequestDeviceActivity.this.btnGetStarted.setEnabled(false);
                return;
            }
            RequestDeviceActivity.this.btnGetStarted.setAlpha(1.0f);
            RequestDeviceActivity.this.btnGetStarted.setEnabled(true);
        }
    };
    private int r = 2;
    private int s = 1;
    String f = "";
    String g = "";
    String h = "";
    String m = "";

    public static /* synthetic */ void c(View view, boolean z) {
    }

    public static /* synthetic */ void lambda$EY3qGlZY1MhELW4oV7wobEk3Cdw(RequestDeviceActivity requestDeviceActivity, View view, boolean z) {
        requestDeviceActivity.a(view, z);
    }

    /* renamed from: lambda$hO4K0UwxqUDWmcc-a29HXWob_dU */
    public static /* synthetic */ void m5lambda$hO4K0UwxqUDWmcca29HXWob_dU(RequestDeviceActivity requestDeviceActivity, View view, boolean z) {
        requestDeviceActivity.b(view, z);
    }

    /* renamed from: lambda$ij5fuXMWWR-NxP60N5wN8bi_F_c */
    public static /* synthetic */ void m6lambda$ij5fuXMWWRNxP60N5wN8bi_F_c(RequestDeviceActivity requestDeviceActivity, Set set, Pair pair) {
        requestDeviceActivity.a(set, pair);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.request_device_activity);
        ButterKnife.bind(this);
        a(getString(R.string.request_device), false, false);
        this.btnGetStarted.setAlpha(0.6f);
        this.btnGetStarted.setEnabled(false);
        this.j = new ArrayList<>();
        this.e = new ArrayList<>();
        this.k = new ArrayList<>();
        this.d.a = this;
        this.d.b();
        this.d.a();
        this.tvDeviceType.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.RequestDeviceActivity.2
            {
                RequestDeviceActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!RequestDeviceActivity.this.e.isEmpty()) {
                    Intent intent = new Intent(RequestDeviceActivity.this, DeviceTypeActivity.class);
                    intent.putParcelableArrayListExtra("DEVICE_TYPE_LIST", RequestDeviceActivity.this.e);
                    intent.putExtra("DEVICE_TYPE_ID", RequestDeviceActivity.this.g);
                    RequestDeviceActivity requestDeviceActivity = RequestDeviceActivity.this;
                    requestDeviceActivity.startActivityForResult(intent, requestDeviceActivity.r);
                    return;
                }
                Toast.makeText(RequestDeviceActivity.this.getBaseContext(), RequestDeviceActivity.this.getString(R.string.please_try_again), 1).show();
            }
        });
        this.needInstallationTextView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.RequestDeviceActivity.3
            {
                RequestDeviceActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent(RequestDeviceActivity.this, NeedInstallationActivity.class);
                intent.putExtra("NEED_INSTLATION_VALUE", RequestDeviceActivity.this.h);
                RequestDeviceActivity requestDeviceActivity = RequestDeviceActivity.this;
                requestDeviceActivity.startActivityForResult(intent, requestDeviceActivity.s);
            }
        });
        this.txtTitle.setText(getString(R.string.request_device));
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.RequestDeviceActivity.4
            {
                RequestDeviceActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestDeviceActivity.this.finish();
                djm.a((Activity) RequestDeviceActivity.this);
            }
        });
        this.l = new TicketsImageListAdapter(this);
        this.imagesRecyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.imagesRecyclerView.setAdapter(this.l);
        this.tvDeviceType.addTextChangedListener(this.q);
        this.address.addTextChangedListener(this.q);
        this.number.addTextChangedListener(this.q);
        this.email.addTextChangedListener(this.q);
        this.address.setOnFocusChangeListener($$Lambda$RequestDeviceActivity$8HXPtAlhaIu3EnYBCWVYUv389xo.INSTANCE);
        this.number.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.-$$Lambda$RequestDeviceActivity$hO4K0UwxqUDWmcc-a29HXWob_dU
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                RequestDeviceActivity.m5lambda$hO4K0UwxqUDWmcca29HXWob_dU(RequestDeviceActivity.this, view, z);
            }
        });
        this.email.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.-$$Lambda$RequestDeviceActivity$EY3qGlZY1MhELW4oV7wobEk3Cdw
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                RequestDeviceActivity.lambda$EY3qGlZY1MhELW4oV7wobEk3Cdw(RequestDeviceActivity.this, view, z);
            }
        });
        this.needInstallationTextView.addTextChangedListener(this.q);
        this.addImage.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.RequestDeviceActivity.5
            {
                RequestDeviceActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestDeviceActivity.c(RequestDeviceActivity.this);
            }
        });
        this.btnGetStarted.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.RequestDeviceActivity.6
            {
                RequestDeviceActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestDeviceActivity.d(RequestDeviceActivity.this);
            }
        });
        this.b.a(this, getString(R.string.loading));
        final HashSet hashSet = new HashSet();
        this.a.observe(this, new Observer() { // from class: com.ucare.we.-$$Lambda$RequestDeviceActivity$ij5fuXMWWR-NxP60N5wN8bi_F_c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                RequestDeviceActivity.m6lambda$ij5fuXMWWRNxP60N5wN8bi_F_c(RequestDeviceActivity.this, hashSet, (Pair) obj);
            }
        });
    }

    public /* synthetic */ void a(Set set, Pair pair) {
        char c;
        String str = (String) pair.first;
        int hashCode = str.hashCode();
        if (hashCode != -1820631284) {
            if (hashCode == 2013139542 && str.equals("DEVICE")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("TICKET")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            set.add(pair.first);
        } else if (c == 1) {
            set.add(pair.first);
        }
        if (set.size() == 2) {
            this.b.a();
        }
    }

    public /* synthetic */ void b(View view, boolean z) {
        if (!z) {
            d();
            return;
        }
        this.til_number.setErrorEnabled(false);
        this.til_number.setError(null);
        c(this.number);
    }

    public /* synthetic */ void a(View view, boolean z) {
        if (!z) {
            d();
            return;
        }
        this.til_email.setErrorEnabled(false);
        this.til_email.setError(null);
        c(this.email);
    }

    private void c() {
        String[] strArr = {getString(R.string.gallery), getString(R.string.camera)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.ucare.we.RequestDeviceActivity.7
            {
                RequestDeviceActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    RequestDeviceActivity.this.startActivityForResult(intent, 3);
                } else if (i != 1) {
                } else {
                    RequestDeviceActivity.this.startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE"), 4);
                }
            }
        });
        builder.show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Cursor query;
        super.onActivityResult(i, i2, intent);
        if (i == this.r) {
            if (i2 == -1) {
                this.f = intent.getStringExtra("DEVICE_TYPE");
                this.g = intent.getStringExtra("DEVICE_TYPE_ID");
                if (!this.f.isEmpty()) {
                    this.tvDeviceType.setText(this.f);
                }
            }
        } else if (i == this.s && i2 == -1) {
            this.h = intent.getStringExtra("NEED_INSTLATION_VALUE");
            this.i = intent.getStringExtra("NEED_INSTLATION_DEFAULT_VALUE");
            if (!this.h.isEmpty()) {
                this.needInstallationTextView.setText(this.h);
            }
        }
        String str2 = null;
        if (i == 3) {
            if (i2 != -1) {
                Toast.makeText(this, "You haven't picked Image", 1).show();
                return;
            }
            String[] strArr = {"_data"};
            Cursor query2 = getApplicationContext().getContentResolver().query(intent.getData(), strArr, null, null, null);
            if (query2 != null) {
                if (query2.moveToFirst()) {
                    str2 = query2.getString(query2.getColumnIndexOrThrow(strArr[0]));
                }
                query2.close();
            }
            if (str2 == null) {
                str2 = "Not found";
            }
            this.j.add(BitmapFactory.decodeFile(str2));
            this.k.add(str2);
            this.l.notifyDataSetChanged();
        } else if (i != 4 || i2 != -1 || i != 4 || i2 != -1) {
        } else {
            Bitmap bitmap = (Bitmap) intent.getExtras().get("data");
            Context applicationContext = getApplicationContext();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
            Uri parse = Uri.parse(MediaStore.Images.Media.insertImage(applicationContext.getContentResolver(), bitmap, "Title", (String) null));
            this.j.add(bitmap);
            ArrayList<String> arrayList = this.k;
            if (getContentResolver() == null || (query = getContentResolver().query(parse, null, null, null, null)) == null) {
                str = "";
            } else {
                query.moveToFirst();
                str = query.getString(query.getColumnIndex("_data"));
                query.close();
            }
            arrayList.add(str);
            this.l.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 2 && iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
            c();
        }
    }

    @Override // defpackage.dhq
    public final void a(String str) {
        this.b.a();
        if (this.k.size() > 0) {
            this.d.a(this.k, str);
            return;
        }
        String string = getString(R.string.successfully);
        UnNavigateResponseActivity.a(this, string, getString(R.string.your_request_has_been_submitted_successfully) + "\n" + getString(R.string.ticket_numbet) + ": " + str, false);
        finish();
    }

    @Override // defpackage.dhq
    public final void b(String str) {
        this.b.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dhq
    public final void a(TroubleTicketsResponseTypes troubleTicketsResponseTypes) {
        this.a.postValue(new Pair<>("TICKET", Boolean.TRUE));
        this.m = troubleTicketsResponseTypes.getRequestDeviceArrayList().get(0).getId();
    }

    @Override // defpackage.dhq
    public final void c(String str) {
        this.a.postValue(new Pair<>("TICKET", Boolean.FALSE));
    }

    @Override // defpackage.dhq
    public final Bitmap a(int i) {
        return this.j.get(i);
    }

    @Override // defpackage.dhq
    public final void b(int i) {
        this.j.remove(i);
        this.k.remove(i);
        this.l.notifyDataSetChanged();
    }

    @Override // defpackage.dhq
    public final ArrayList<Bitmap> a() {
        return this.j;
    }

    @Override // defpackage.dhq
    public final void a(String str, String str2) {
        String string = getString(R.string.successful);
        UnNavigateResponseActivity.a(this, string, getString(R.string.your_request_has_been_submitted_successfully) + "\n" + getString(R.string.ticket_numbet) + ": " + str2, false);
        finish();
    }

    @Override // defpackage.dhq
    public final void b() {
        this.tvDeviceType.setEnabled(false);
        this.needInstallationTextView.setEnabled(false);
        this.address.setClickable(false);
        this.number.setClickable(false);
        this.email.setEnabled(false);
        UnNavigateResponseActivity.a(this, "", getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dhq
    public final void a(ArrayList<DeviceTypes> arrayList) {
        this.a.postValue(new Pair<>("DEVICE", Boolean.TRUE));
        this.e = arrayList;
    }

    @Override // defpackage.dhq
    public final void d(String str) {
        this.a.postValue(new Pair<>("DEVICE", Boolean.FALSE));
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
    }

    private boolean d() {
        if (TextUtils.isEmpty(this.number.getText().toString())) {
            this.til_number.setError(getResources().getString(R.string.no_mobile_number));
            a(this.number);
            return false;
        } else if (!this.number.getText().toString().startsWith("027") && this.number.getText().toString().length() < getResources().getInteger(R.integer.mobile_number)) {
            this.til_number.setError(getResources().getString(R.string.default_service_number_validation));
            a(this.number);
            return false;
        } else if (!this.number.getText().toString().substring(0, 1).equals("0") && !this.number.getText().toString().substring(0, 1).equals("٠")) {
            this.til_number.setError(getResources().getString(R.string.add_account_number_validation));
            a(this.number);
            return false;
        } else {
            b(this.number);
            this.til_number.setError(null);
            return true;
        }
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void b(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void c(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_focused));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    static /* synthetic */ void c(RequestDeviceActivity requestDeviceActivity) {
        int checkSelfPermission = ContextCompat.checkSelfPermission(requestDeviceActivity, "android.permission.WRITE_EXTERNAL_STORAGE");
        int checkSelfPermission2 = ContextCompat.checkSelfPermission(requestDeviceActivity, "android.permission.READ_EXTERNAL_STORAGE");
        if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
            requestDeviceActivity.c();
        } else {
            ActivityCompat.requestPermissions(requestDeviceActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void d(com.ucare.we.RequestDeviceActivity r6) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ucare.we.RequestDeviceActivity.d(com.ucare.we.RequestDeviceActivity):void");
    }
}
