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
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.ucare.we.R;
import com.ucare.we.util.OTPView;
import javax.inject.Inject;

/* renamed from: ddo */
/* loaded from: classes2.dex */
public final class ddo extends dab implements ddq, dju {
    @Inject
    protected djb a;
    cwi b;
    OTPView d;
    @Inject
    djg e;
    @Inject
    djw f;
    private Button h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private String m;
    private ddp n;
    private int o;
    private Context q;
    private final BroadcastReceiver g = new BroadcastReceiver() { // from class: ddo.1
        {
            ddo.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).i != 0) {
                    return;
                }
                try {
                    ddo.this.startActivityForResult((Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT"), 499);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
    };
    String c = "";
    private boolean p = false;

    public static /* synthetic */ dmg lambda$Imr4auya_oOS_kijXzOE5VKx3_U(ddo ddoVar, Boolean bool) {
        return ddoVar.a(bool);
    }

    public static /* synthetic */ void lambda$JTFiyPCCtgCW9bNoeO3C199yPuU(ddo ddoVar, View view) {
        ddoVar.a(view);
    }

    public static /* synthetic */ dmg lambda$LwlKTAII1Am5J8QPhryA4K5FO9c(ddo ddoVar, String str) {
        return ddoVar.b(str);
    }

    /* renamed from: lambda$NQ_VtI8rknNvIbsfEEmtn-lqKhM */
    public static /* synthetic */ void m103lambda$NQ_VtI8rknNvIbsfEEmtnlqKhM(ddo ddoVar, View view) {
        ddoVar.b(view);
    }

    public ddo(cwi cwiVar, int i) {
        this.b = cwiVar;
        this.o = i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_third_registration_new, viewGroup, false);
        new LinearLayout.LayoutParams(-1, -2).gravity = 1;
        this.d = (OTPView) inflate.findViewById(R.id.otp_view);
        this.n = new ddp(getActivity(), this, this);
        if (this.p) {
            this.e.a(this.q, getString(R.string.loading));
            this.n.a(this.o);
        }
        ((InputMethodManager) getActivity().getSystemService("input_method")).toggleSoftInput(2, 0);
        this.i = (TextView) inflate.findViewById(R.id.tv_resend_code);
        this.j = (TextView) inflate.findViewById(R.id.tvConfirmationCode);
        this.k = (TextView) inflate.findViewById(R.id.tvConfirmationP1);
        this.l = (TextView) inflate.findViewById(R.id.tvConfirmationP2);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$ddo$NQ_VtI8rknNvIbsfEEmtn-lqKhM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddo.m103lambda$NQ_VtI8rknNvIbsfEEmtnlqKhM(ddo.this, view);
            }
        });
        Button button = (Button) inflate.findViewById(R.id.btn_continue_2);
        this.h = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$ddo$JTFiyPCCtgCW9bNoeO3C199yPuU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddo.lambda$JTFiyPCCtgCW9bNoeO3C199yPuU(ddo.this, view);
            }
        });
        this.h.setEnabled(false);
        this.h.setAlpha(0.15f);
        this.d.setOnCharacterUpdatedListener(new dow() { // from class: -$$Lambda$ddo$Imr4auya_oOS_kijXzOE5VKx3_U
            @Override // defpackage.dow
            public final Object invoke(Object obj) {
                return ddo.lambda$Imr4auya_oOS_kijXzOE5VKx3_U(ddo.this, (Boolean) obj);
            }
        });
        this.d.setOnFinishListener(new dow() { // from class: -$$Lambda$ddo$LwlKTAII1Am5J8QPhryA4K5FO9c
            @Override // defpackage.dow
            public final Object invoke(Object obj) {
                return ddo.lambda$LwlKTAII1Am5J8QPhryA4K5FO9c(ddo.this, (String) obj);
            }
        });
        return inflate;
    }

    public /* synthetic */ void b(View view) {
        this.b.b(2, 1, null);
    }

    public /* synthetic */ void a(View view) {
        String stringFromFields = this.d.getStringFromFields();
        this.c = stringFromFields;
        if (TextUtils.isEmpty(stringFromFields) || this.c.length() != 6) {
            return;
        }
        this.b.b(2, 2, this.c);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.q = getActivity();
    }

    @Override // defpackage.ddq
    public final void a(String str) {
        if (str != null) {
            this.m = str;
            if (this.f.k().equalsIgnoreCase("ar")) {
                TextView textView = this.k;
                textView.setText(getString(R.string.balance_transfer_confirmation_code_p1) + djm.d(str) + " " + getString(R.string.balance_transfer_confirmation_code_p2));
                return;
            }
            TextView textView2 = this.k;
            textView2.setText(getString(R.string.balance_transfer_confirmation_code_p1) + str + " " + getString(R.string.balance_transfer_confirmation_code_p2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 499 && i2 == -1) {
            this.d.setText(intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE").replaceAll("[^0-9]", ""));
            this.h.setEnabled(true);
            this.h.setAlpha(1.0f);
            this.h.post(new Runnable() { // from class: ddo.2
                {
                    ddo.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ddo.this.h.performClick();
                }
            });
        }
    }

    public static /* synthetic */ void a(bwl bwlVar) {
        if (!bwlVar.e()) {
            bwlVar.a().printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getActivity().registerReceiver(this.g, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
        tf.a(this.q).a().a($$Lambda$ddo$LRozh0GiSLWFBEzjH4Q_JuQXIns.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getActivity().unregisterReceiver(this.g);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        ddp ddpVar;
        super.setUserVisibleHint(z);
        this.p = z;
        if (!z || (ddpVar = this.n) == null) {
            return;
        }
        ddpVar.a(this.o);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.q, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 1) {
            return;
        }
        this.n.a(this.o);
    }

    public /* synthetic */ dmg a(Boolean bool) {
        if (!bool.booleanValue()) {
            this.h.setEnabled(false);
            this.h.setAlpha(0.15f);
            return null;
        }
        this.h.setEnabled(true);
        this.h.setAlpha(1.0f);
        return null;
    }

    public /* synthetic */ dmg b(String str) {
        if (str.trim().length() != 6) {
            this.h.setEnabled(false);
            this.h.setAlpha(0.15f);
            return null;
        }
        this.h.setEnabled(true);
        this.h.setAlpha(1.0f);
        return null;
    }
}
