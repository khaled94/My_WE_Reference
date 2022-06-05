package defpackage;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.Status;
import com.ucare.we.R;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.usagedetails.DetailedLineUsageItem;
import com.ucare.we.util.OTPView;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: cwo */
/* loaded from: classes2.dex */
public class cwo extends dab implements cwp, dju {
    @Inject
    djw a;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private Context j;
    private djg k;
    private cwm l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private OTPView q;
    private Button r;
    private String s;
    private final BroadcastReceiver d = new BroadcastReceiver() { // from class: cwo.1
        {
            cwo.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).i != 0) {
                    return;
                }
                try {
                    cwo.this.startActivityForResult((Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT"), 499);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
    };
    View.OnClickListener b = new View.OnClickListener() { // from class: cwo.2
        {
            cwo.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cwo.this.l.a(cwo.this.e, cwo.this.f);
            cwo.this.a();
        }
    };
    View.OnClickListener c = new View.OnClickListener() { // from class: cwo.3
        {
            cwo.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cwo cwoVar = cwo.this;
            cwoVar.s = cwoVar.q.getStringFromFields().trim();
            if (!TextUtils.isEmpty(cwo.this.s)) {
                cwo.this.l.a(cwo.this.e, cwo.this.f, cwo.this.s, cwo.this.h, cwo.this.i);
            }
        }
    };

    public static /* synthetic */ dmg lambda$bFBIW79fFLN3ReNdCesV7WaLt8o(cwo cwoVar, Boolean bool) {
        return cwoVar.a(bool);
    }

    public static /* synthetic */ dmg lambda$gt8X2AicqRaK2_bCnFeKo2RYTQc(cwo cwoVar, String str) {
        return cwoVar.b(str);
    }

    @Override // defpackage.cwp
    public final void a(String str) {
    }

    @Override // defpackage.cwp
    public final void a(ArrayList<AssociatedNumberResponseBody> arrayList) {
    }

    @Override // defpackage.cwp
    public final void b(ArrayList<DetailedLineUsageItem> arrayList) {
    }

    public static cwo a(String str, String str2, String str3, String str4, String str5) {
        cwo cwoVar = new cwo();
        Bundle bundle = new Bundle();
        bundle.putString("TRANSFERRED_NUMBER", str);
        bundle.putString("QUOTA_TYPE", str2);
        bundle.putString("QUOTA_UNIT_ID", str3);
        bundle.putString("AMOUNT", str4);
        bundle.putString("MASKED_MSISDN", str5);
        cwoVar.setArguments(bundle);
        return cwoVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.e = getArguments().getString("TRANSFERRED_NUMBER");
            this.h = getArguments().getString("QUOTA_TYPE");
            this.i = getArguments().getString("QUOTA_UNIT_ID");
            this.f = getArguments().getString("AMOUNT");
            this.g = getArguments().getString("MASKED_MSISDN");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.j = activity;
        this.l = new cwm(activity, this, this);
        a();
        this.k = new djg();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_quota_transfer_third, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.btn_transfer);
        this.r = button;
        button.setEnabled(false);
        this.r.setAlpha(0.15f);
        this.q = (OTPView) inflate.findViewById(R.id.otp_view);
        this.o = (TextView) inflate.findViewById(R.id.tvBalanceTransferHint);
        this.m = (TextView) inflate.findViewById(R.id.tv_transfer_to);
        this.n = (TextView) inflate.findViewById(R.id.tv_transfer_amount);
        this.p = (TextView) inflate.findViewById(R.id.tv_resend_code);
        this.m.setText(this.e);
        TextView textView = this.n;
        textView.setText(this.f + getString(R.string.gb));
        if (this.a.k().equalsIgnoreCase("ar")) {
            TextView textView2 = this.o;
            textView2.setText(getString(R.string.confirmation_P1) + djm.d(this.g) + getString(R.string.confirmation_P2));
        } else {
            TextView textView3 = this.o;
            textView3.setText(getString(R.string.confirmation_P1) + this.g + getString(R.string.confirmation_P2));
        }
        this.r.setOnClickListener(this.c);
        this.p.setOnClickListener(this.b);
        this.q.setOnCharacterUpdatedListener(new dow() { // from class: -$$Lambda$cwo$bFBIW79fFLN3ReNdCesV7WaLt8o
            @Override // defpackage.dow
            public final Object invoke(Object obj) {
                return cwo.lambda$bFBIW79fFLN3ReNdCesV7WaLt8o(cwo.this, (Boolean) obj);
            }
        });
        this.q.setOnFinishListener(new dow() { // from class: -$$Lambda$cwo$gt8X2AicqRaK2_bCnFeKo2RYTQc
            @Override // defpackage.dow
            public final Object invoke(Object obj) {
                return cwo.lambda$gt8X2AicqRaK2_bCnFeKo2RYTQc(cwo.this, (String) obj);
            }
        });
        return inflate;
    }

    public /* synthetic */ dmg a(Boolean bool) {
        if (!bool.booleanValue()) {
            this.r.setEnabled(false);
            this.r.setAlpha(0.15f);
            return null;
        }
        this.r.setEnabled(true);
        this.r.setAlpha(1.0f);
        return null;
    }

    public /* synthetic */ dmg b(String str) {
        if (str.trim().length() != 6) {
            this.r.setEnabled(false);
            this.r.setAlpha(0.15f);
            return null;
        }
        this.r.setEnabled(true);
        this.r.setAlpha(1.0f);
        return null;
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.j, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 3) {
            this.l.a(this.e, this.f, this.s, this.h, this.i);
        }
    }

    @Override // defpackage.cwp
    public final void a(boolean z) {
        if (z) {
            this.k.a(this.j, getString(R.string.loading));
        } else {
            this.k.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getActivity().registerReceiver(this.d, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getActivity().unregisterReceiver(this.d);
    }

    public void a() {
        tf.a(this.j).a().a($$Lambda$cwo$BZB8ezsDS0qDjA6zducTapPuw3s.INSTANCE);
    }

    public static /* synthetic */ void a(bwl bwlVar) {
        if (!bwlVar.e()) {
            bwlVar.a().printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 499 && i2 == -1) {
            this.q.setText(intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE").replaceAll("[^0-9]", ""));
            this.r.setEnabled(true);
            this.r.post(new Runnable() { // from class: cwo.4
                {
                    cwo.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cwo.this.r.performClick();
                }
            });
        }
    }
}
