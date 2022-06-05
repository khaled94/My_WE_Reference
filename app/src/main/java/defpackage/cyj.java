package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.android.volley.VolleyError;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.gson.Gson;
import com.ucare.we.ModifyPasswordActivity;
import com.ucare.we.R;
import com.ucare.we.genericconfirmationscreen.GenericConfirmationActivity;
import com.ucare.we.model.CheckAutoPayStatusResponse;
import com.ucare.we.model.ProfilePostPaidResponse;
import com.ucare.we.model.ProfilePrepaidModel.ProfilePrePaidResponse;
import com.ucare.we.model.SocialMediaModel.SocialMediaStatusResponse;
import defpackage.au;
import defpackage.lu;
import java.util.Arrays;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cyj  reason: default package */
/* loaded from: classes2.dex */
public class cyj extends dab implements cyl, dju {
    private static int x = 3;
    private static int y = 4;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private TextView I;
    private TextView J;
    private TextView K;
    private TextView L;
    private TextView M;
    private TextView N;
    private Context O;
    private TextView P;
    private LinearLayout Q;
    private LinearLayout R;
    private LinearLayout S;
    private EditText T;
    private ProfilePostPaidResponse U;
    private ProfilePrePaidResponse V;
    private cyk W;
    private boolean X;
    private TextView Z;
    @Inject
    dil a;
    private TextView aa;
    private TextView ab;
    private String ac;
    private tl ae;
    private GoogleSignInOptions af;
    private TextView ag;
    private TextView ah;
    private Boolean ai;
    private Boolean aj;
    private Boolean ak;
    private Boolean al;
    private ImageView am;
    private ImageView an;
    private LinearLayout ao;
    private LinearLayout ap;
    @Inject
    dja b;
    @Inject
    djx c;
    @Inject
    dio d;
    @Inject
    djx e;
    @Inject
    djw f;
    @Inject
    djg g;
    @Inject
    djb h;
    rw i;
    lu j;
    private final int z = 1;
    View.OnClickListener k = new View.OnClickListener() { // from class: cyj.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    };
    View.OnClickListener l = new View.OnClickListener() { // from class: cyj.10
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    };
    View.OnClickListener m = new View.OnClickListener() { // from class: cyj.11
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    };
    View.OnClickListener n = new View.OnClickListener() { // from class: cyj.12
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    };
    View.OnClickListener o = new View.OnClickListener() { // from class: cyj.13
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cyj.this.startActivity(new Intent(cyj.this.O, ModifyPasswordActivity.class));
        }
    };
    View.OnClickListener p = new View.OnClickListener() { // from class: cyj.14
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cyj.this.aj.booleanValue()) {
                if (cyj.this.al.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(cyj.this.O, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", "Enable Google login");
                intent.putExtra("confirmation_hint", "Are you sure you want to enable Google login?");
                cyj.this.startActivityForResult(intent, 30);
                return;
            }
            Toast.makeText(cyj.this.O, "Please link Google account first", 0).show();
        }
    };
    View.OnClickListener q = new View.OnClickListener() { // from class: cyj.15
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cyj.a(cyj.this.getActivity());
            cyj.this.T.setText("");
            cyj.this.D.setText(cyj.this.O.getString(R.string.edit_bill_limit));
            cyj.this.F.setText(cyj.this.U.body.customerProfile.email);
            cyj.this.A.setVisibility(8);
            cyj.this.F.setVisibility(0);
            cyj.this.T.setVisibility(8);
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: cyj.16
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((InputMethodManager) cyj.this.getActivity().getSystemService("input_method")).toggleSoftInput(2, 0);
            if (TextUtils.isEmpty(cyj.this.T.getText().toString().trim())) {
                cyj.this.F.setVisibility(8);
                cyj.this.T.setVisibility(0);
                cyj.this.T.requestFocusFromTouch();
                cyj.this.T.setText(cyj.this.F.getText().toString());
                cyj.this.D.setText(cyj.this.O.getString(R.string.save_bill_limit));
                cyj.this.A.setVisibility(0);
                return;
            }
            String obj = cyj.this.T.getText().toString();
            if (cyj.c(obj)) {
                cyk cykVar = cyj.this.W;
                try {
                    cykVar.c.a(true);
                    cykVar.h = obj;
                    djl.a(cykVar.b).i(obj, cykVar.j, cykVar.k);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                cyj.this.T.setText("");
                cyj.this.D.setText(cyj.this.O.getString(R.string.edit_bill_limit));
                return;
            }
            cyj.this.T.setError(cyj.this.O.getString(R.string.valid_mail));
        }
    };
    View.OnClickListener s = new View.OnClickListener() { // from class: cyj.17
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cyk cykVar = cyj.this.W;
            try {
                djl.a(cykVar.b).n(cykVar.m, cykVar.l);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            cyj.this.g.a(cyj.this.O, cyj.this.O.getString(R.string.loading));
        }
    };
    lw<ry> t = new lw<ry>() { // from class: cyj.2
        @Override // defpackage.lw
        public final void a(FacebookException facebookException) {
        }

        @Override // defpackage.lw
        public final /* synthetic */ void a(ry ryVar) {
            lk lkVar = ryVar.a;
            cyk cykVar = cyj.this.W;
            String str = lkVar.e;
            try {
                cykVar.c.a(true);
                djl.a(cykVar.b).a(str, "FACEBOOK", false, cykVar.g, cykVar.d);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    };
    private boolean Y = false;
    private boolean ad = true;
    View.OnClickListener u = new View.OnClickListener() { // from class: cyj.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cyj.this.aj.booleanValue()) {
                cyk cykVar = cyj.this.W;
                try {
                    cykVar.c.a(true);
                    djl.a(cykVar.b).l("GOOGLE", cykVar.g, cykVar.d);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            cyj.j(cyj.this);
        }
    };
    View.OnClickListener v = new View.OnClickListener() { // from class: cyj.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cyj.this.ai.booleanValue()) {
                if (cyj.this.ak.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(cyj.this.O, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", "Enable Facebook login");
                intent.putExtra("confirmation_hint", "Are you sure you want to enable Facebook login?");
                cyj.this.startActivityForResult(intent, 20);
                return;
            }
            Toast.makeText(cyj.this.O, "Please link Facebook account first", 0).show();
        }
    };
    View.OnClickListener w = new View.OnClickListener() { // from class: cyj.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cyj.this.ai.booleanValue()) {
                cyk cykVar = cyj.this.W;
                try {
                    cykVar.c.a(true);
                    djl.a(cykVar.b).l("FACEBOOK", cykVar.g, cykVar.d);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            cyj.this.i.a(cyj.this, Arrays.asList(NotificationCompat.CATEGORY_EMAIL, "public_profile"));
        }
    };
    private au.b<JSONObject> aq = new au.b<JSONObject>() { // from class: cyj.6
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cyj.this.g.a();
            Gson gson = new Gson();
            cyj.this.U = (ProfilePostPaidResponse) gson.a(jSONObject.toString(), (Class<Object>) ProfilePostPaidResponse.class);
            if (cyj.this.U == null || !cyj.this.U.header.responseCode.equals("0")) {
                if (cyj.this.U == null || !cyj.this.U.header.responseCode.equals("1200")) {
                    return;
                }
                cyj.this.b(1);
            } else if (cyj.this.U.body != null && cyj.this.U.body.customerProfile != null && cyj.this.U.body.customerProfile.customerName != null) {
                cyj.this.B.setText(cyj.this.U.body.customerProfile.customerName);
                cyj.this.F.setText(cyj.this.U.body.customerProfile.email);
                cyj.this.I.setText(cyj.this.U.body.billMedium.email);
                cyj.this.E.setText(cyj.this.U.body.customerProfile.msisdn);
                if (cyj.this.U.body.customerProfile.contactAddress != null) {
                    cyj.this.C.setText(cyj.this.U.body.customerProfile.contactAddress.get(0));
                }
                String o = cyj.this.f.o();
                String str = "";
                for (int i = 0; i < o.length(); i++) {
                    str = str.concat("*");
                }
                cyj.this.G.setText(str);
                if (!TextUtils.isEmpty(cyj.this.U.body.billMedium.email)) {
                    cyj.this.R.setVisibility(0);
                    cyj.this.I.setText(cyj.this.U.body.billMedium.email);
                }
                if (TextUtils.isEmpty(cyj.this.U.body.billMedium.msisdn)) {
                    return;
                }
                cyj.this.Q.setVisibility(0);
                cyj.this.J.setText(cyj.this.U.body.billMedium.msisdn);
            }
        }
    };
    private au.a ar = new au.a() { // from class: cyj.7
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyj.this.g.a();
        }
    };
    private au.b<JSONObject> as = new au.b<JSONObject>() { // from class: cyj.8
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cyj.this.g.a();
            Gson gson = new Gson();
            cyj.this.V = (ProfilePrePaidResponse) gson.a(jSONObject.toString(), (Class<Object>) ProfilePrePaidResponse.class);
            if (cyj.this.V == null || !cyj.this.V.header.responseCode.equals("0")) {
                if (cyj.this.V == null || !cyj.this.V.header.responseCode.equals("1200")) {
                    return;
                }
                cyj.this.b(1);
            } else if (cyj.this.V.body != null && cyj.this.V.body.customerName != null) {
                cyj.this.B.setText(cyj.this.V.body.customerName);
                cyj.this.F.setText(cyj.this.V.body.email);
                cyj.this.I.setText(cyj.this.V.body.email);
                cyj.this.E.setText(cyj.this.V.body.msisdn);
                if (cyj.this.V.body.contactAddress != null) {
                    cyj.this.C.setText(cyj.this.V.body.contactAddress.get(0));
                }
                String o = cyj.this.f.o();
                String str = "";
                for (int i = 0; i < o.length(); i++) {
                    str = str.concat("*");
                }
                cyj.this.G.setText(str);
            }
        }
    };
    private au.a at = new au.a() { // from class: cyj.9
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyj.this.g.a();
        }
    };

    public static void a(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_corporate_my_account, viewGroup, false);
        this.B = (TextView) inflate.findViewById(R.id.txtName);
        this.F = (TextView) inflate.findViewById(R.id.txtEmail);
        this.C = (TextView) inflate.findViewById(R.id.txtAddress);
        this.G = (TextView) inflate.findViewById(R.id.txtPassword);
        this.E = (TextView) inflate.findViewById(R.id.txtMobileNumber);
        this.H = (TextView) inflate.findViewById(R.id.txtChangeNotificationMethod);
        this.J = (TextView) inflate.findViewById(R.id.txtMSISDN);
        this.I = (TextView) inflate.findViewById(R.id.txtMail);
        this.T = (EditText) inflate.findViewById(R.id.edtMail);
        this.K = (TextView) inflate.findViewById(R.id.txtChangePassword);
        this.Q = (LinearLayout) inflate.findViewById(R.id.lnrSMS);
        this.R = (LinearLayout) inflate.findViewById(R.id.lnrMail);
        this.D = (TextView) inflate.findViewById(R.id.txtChangeMail);
        if (this.f.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_DEFAULT_USER")) {
            this.D.setEnabled(false);
            this.D.setClickable(false);
        } else {
            this.D.setEnabled(true);
            this.D.setClickable(true);
        }
        this.A = (TextView) inflate.findViewById(R.id.txtCancel);
        this.Z = (TextView) inflate.findViewById(R.id.txtAutoPayEnableButton);
        this.aa = (TextView) inflate.findViewById(R.id.txtDisable);
        this.L = (TextView) inflate.findViewById(R.id.tvAutoPayStatusMessage);
        this.N = (TextView) inflate.findViewById(R.id.txtAutoPayEnableButton);
        this.S = (LinearLayout) inflate.findViewById(R.id.lnCreditCardNumberPart);
        this.ab = (TextView) inflate.findViewById(R.id.tvShowCreditCard);
        this.P = (TextView) inflate.findViewById(R.id.txtMasterCardNumber);
        this.M = (TextView) inflate.findViewById(R.id.txtAutoPayRetryButton);
        this.ao = (LinearLayout) inflate.findViewById(R.id.lnCFacebookLoginPart);
        this.ap = (LinearLayout) inflate.findViewById(R.id.lnCGoogleLoginPart);
        this.ag = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkFacebook);
        this.ah = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkGoogle);
        this.am = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingFacebook);
        this.an = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingGoogle);
        this.aj = Boolean.FALSE;
        this.ai = Boolean.FALSE;
        this.al = Boolean.FALSE;
        this.ak = Boolean.FALSE;
        this.i = rw.a();
        this.j = lu.a.a();
        this.af = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(getString(R.string.we_google_app_id)).b(getString(R.string.we_google_app_id)).a().c();
        this.ae = tj.a((Activity) getActivity(), this.af);
        this.H.setOnClickListener(this.k);
        this.K.setOnClickListener(this.o);
        this.A.setOnClickListener(this.q);
        this.D.setOnClickListener(this.r);
        this.Z.setOnClickListener(this.l);
        this.aa.setOnClickListener(this.m);
        this.ab.setOnClickListener(this.n);
        this.M.setOnClickListener(this.s);
        this.ag.setOnClickListener(this.w);
        this.ah.setOnClickListener(this.u);
        this.i.a(this.j, this.t);
        this.ao.setOnClickListener(this.v);
        this.ap.setOnClickListener(this.p);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.O = activity;
        cyk cykVar = new cyk(activity, this, this);
        this.W = cykVar;
        cykVar.a();
        try {
            this.g.a(this.O, this.O.getString(R.string.loading));
            if (this.f.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_DEFAULT_USER")) {
                djl.a(getContext()).f(this.as, this.at);
            } else {
                djl.a(getContext()).e(this.aq, this.ar);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.cyl
    public final void a() {
        djg djgVar = this.g;
        Context context = this.O;
        djgVar.a(context, context.getString(R.string.loading));
        try {
            if (this.f.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_DEFAULT_USER")) {
                djl.a(getContext()).f(this.as, this.at);
            } else {
                djl.a(getContext()).e(this.aq, this.ar);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.cyl
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.g;
            Context context = this.O;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.g.a();
    }

    @Override // defpackage.cyl
    public final void a(String str) {
        this.F.setVisibility(0);
        this.T.setVisibility(8);
        this.A.setVisibility(8);
        this.F.setText(str);
    }

    @Override // defpackage.cyl
    public final void a(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
        if (checkAutoPayStatusResponse != null) {
            this.X = checkAutoPayStatusResponse.body.a.booleanValue();
        }
    }

    @Override // defpackage.cyl
    public final void b(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
        if (checkAutoPayStatusResponse != null) {
            this.Y = checkAutoPayStatusResponse.body.a.booleanValue();
            this.g.a();
            if (this.Y) {
                this.Z.setVisibility(8);
                this.aa.setVisibility(0);
                this.L.setText(R.string.enabled_auto_pay);
                this.L.setBackgroundResource(R.color.green);
                this.S.setVisibility(0);
                this.M.setVisibility(8);
                return;
            }
            this.Z.setVisibility(0);
            this.aa.setVisibility(8);
            this.L.setText(R.string.disabled_auto_pay);
            this.L.setBackgroundResource(R.color.gray);
            this.S.setVisibility(8);
            this.M.setVisibility(8);
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.O, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            b();
            return;
        }
        try {
            this.g.a(this.O, this.O.getString(R.string.loading));
            if (this.f.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_DEFAULT_USER")) {
                djl.a(getContext()).f(this.as, this.at);
            } else {
                djl.a(getContext()).e(this.aq, this.ar);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.j.a(i, i2, intent);
        if (i == 1) {
            if (i2 != -1) {
            }
        } else if (i == x) {
            if (i2 != -1) {
                return;
            }
            cyk cykVar = this.W;
            try {
                djl.a(cykVar.b).p(cykVar.n, cykVar.o);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == y) {
            if (i2 != -1) {
                return;
            }
            this.ac = intent.getStringExtra("smsCode");
            b();
        } else if (i != 10) {
            if (i == 20) {
                if (i2 != -1) {
                    return;
                }
                this.W.b("FACEBOOK");
            } else if (i != 30 || i2 != -1) {
            } else {
                this.W.b("GOOGLE");
            }
        } else {
            try {
                String str = tj.a(intent).a(ApiException.class).c;
                cyk cykVar2 = this.W;
                try {
                    cykVar2.c.a(true);
                    djl.a(cykVar2.b).a(str, "GOOGLE", false, cykVar2.g, cykVar2.d);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } catch (ApiException unused) {
                Context context = this.O;
                Toast.makeText(context, context.getString(R.string.please_try_again), 0).show();
            }
        }
    }

    private void b() {
        if (d(this.ac)) {
            this.W.a(this.ac);
        }
    }

    @Override // defpackage.cyl
    public final void a(String str, String str2) {
        Drawable drawable;
        this.P.setText(str);
        if (str2.equalsIgnoreCase("visa")) {
            drawable = getContext().getResources().getDrawable(R.drawable.ic_visa);
        } else {
            drawable = getContext().getResources().getDrawable(R.drawable.ic_master_card);
        }
        this.P.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.ab.setVisibility(4);
    }

    @Override // defpackage.cyl
    public final void b(String str) {
        this.Z.setVisibility(8);
        this.aa.setVisibility(8);
        this.M.setVisibility(0);
        this.S.setVisibility(8);
        this.L.setText(str);
        this.L.setBackgroundResource(R.color.red);
    }

    private static boolean d(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        uc.a(this.O);
    }

    @Override // defpackage.cyl
    public final void a(SocialMediaStatusResponse socialMediaStatusResponse) {
        if (socialMediaStatusResponse != null) {
            for (int i = 0; i < socialMediaStatusResponse.getProviderStatusObjects().size(); i++) {
                if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("FACEBOOK")) {
                    this.ai = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.ak = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("GOOGLE")) {
                    this.aj = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.al = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                }
            }
            if (this.ai.booleanValue()) {
                this.ag.setText(this.O.getString(R.string.unlink));
            } else {
                this.ag.setText(this.O.getString(R.string.link));
            }
            if (this.aj.booleanValue()) {
                this.ah.setText(this.O.getString(R.string.unlink));
            } else {
                this.ah.setText(this.O.getString(R.string.link));
            }
            if (this.ak.booleanValue()) {
                this.am.setVisibility(0);
            } else {
                this.am.setVisibility(4);
            }
            if (this.al.booleanValue()) {
                this.an.setVisibility(0);
            } else {
                this.an.setVisibility(4);
            }
        }
    }

    static /* synthetic */ boolean c(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    static /* synthetic */ void j(cyj cyjVar) {
        cyjVar.startActivityForResult(cyjVar.ae.a(), 10);
    }
}
