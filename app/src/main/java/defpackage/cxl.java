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
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeResponse;
import com.ucare.we.model.CheckAutoPayStatusResponse;
import com.ucare.we.model.ProfilePostPaidResponse;
import com.ucare.we.model.SocialMediaModel.SocialMediaStatusResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.profile.postpaidprofile.DisableAutoPayConfirmationActivity;
import com.ucare.we.presentation.profile.postpaidprofile.EnableAutoPayTopG.EnableAutoPayTopGActivity;
import com.ucare.we.presentation.profile.postpaidprofile.ShowCreditCardConfirmationCodeActivity;
import com.ucare.we.view.AppCompatTextView;
import defpackage.au;
import defpackage.dgp;
import defpackage.lu;
import java.util.Arrays;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cxl */
/* loaded from: classes2.dex */
public class cxl extends dab implements dgo, dgp.a, dju {
    private static int ay = 3;
    private static int az = 4;
    private Button H;
    private AppCompatTextView I;
    private AppCompatTextView J;
    private AppCompatTextView K;
    private AppCompatTextView L;
    private AppCompatTextView M;
    private AppCompatTextView N;
    private AppCompatTextView O;
    private AppCompatTextView P;
    private AppCompatTextView Q;
    private AppCompatTextView R;
    private AppCompatTextView S;
    private AppCompatTextView T;
    private AppCompatTextView U;
    private AppCompatTextView V;
    private AppCompatTextView W;
    private AppCompatTextView X;
    private AppCompatTextView Y;
    private AppCompatTextView Z;
    @Inject
    dhn a;
    private String aA;
    private tl aC;
    private GoogleSignInOptions aD;
    private AppCompatTextView aE;
    private AppCompatTextView aF;
    private AppCompatTextView aG;
    private Boolean aH;
    private Boolean aI;
    private Boolean aJ;
    private Boolean aK;
    private Boolean aL;
    private ImageView aM;
    private ImageView aN;
    private LinearLayout aO;
    private LinearLayout aP;
    private LinearLayout aQ;
    private View aR;
    private int aS;
    private AppCompatTextView aa;
    private AppCompatTextView ab;
    private FrameLayout ac;
    private Context ad;
    private AppCompatTextView ae;
    private LinearLayout af;
    private LinearLayout ag;
    private LinearLayout ah;
    private LinearLayout ai;
    private LinearLayout aj;
    private LinearLayout ak;
    private LinearLayout al;
    private LinearLayout am;
    private LinearLayout an;
    private LinearLayout ao;
    private EditText ap;
    private EditText aq;
    private ProfilePostPaidResponse ar;
    private boolean as;
    private AppCompatTextView au;
    private AppCompatTextView av;
    private AppCompatTextView aw;
    private AppCompatTextView ax;
    @Inject
    dil b;
    @Inject
    dja c;
    @Inject
    djx d;
    @Inject
    dio e;
    @Inject
    djx f;
    @Inject
    djw g;
    @Inject
    djg h;
    @Inject
    djb i;
    rw j;
    lu k;
    dgn l;
    private String E = "Arabic";
    private String F = "English";
    private final int G = 1;
    private boolean at = false;
    private boolean aB = true;
    View.OnClickListener m = new View.OnClickListener() { // from class: cxl.1
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxl.this.startActivity(new Intent(cxl.this.ad, ModifyPasswordActivity.class));
        }
    };
    View.OnClickListener n = new View.OnClickListener() { // from class: cxl.12
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(cxl.this.ad, dgl.class);
            intent.putExtra("Dial", cxl.this.ar.body.customerProfile.msisdn);
            intent.putExtra("Mail", cxl.this.ar.body.customerProfile.email);
            cxl.this.startActivity(intent);
        }
    };
    View.OnClickListener o = new View.OnClickListener() { // from class: cxl.13
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxl.a(cxl.this.getActivity());
            cxl.this.ap.setText("");
            cxl.this.O.setText(cxl.this.ad.getString(R.string.edit_bill_limit));
            cxl.this.S.setText(cxl.this.ar.body.customerProfile.email);
            cxl.this.I.setVisibility(8);
            cxl.this.S.setVisibility(0);
            cxl.this.ap.setVisibility(8);
        }
    };
    View.OnClickListener p = new View.OnClickListener() { // from class: cxl.14
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxl.a(cxl.this.getActivity());
            cxl.this.aq.setText("");
            cxl.this.Z.setText(cxl.this.ad.getString(R.string.edit_bill_limit));
            cxl.this.Q.setText(cxl.this.ar.body.customerProfile.contactNumber);
            cxl.this.aa.setVisibility(8);
            cxl.this.Q.setVisibility(0);
            cxl.this.aq.setVisibility(8);
        }
    };
    View.OnClickListener q = new View.OnClickListener() { // from class: cxl.15
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String charSequence = cxl.this.S.getText().toString();
            if (TextUtils.isEmpty(cxl.this.ap.getText().toString().trim())) {
                cxl.this.S.setVisibility(8);
                cxl.this.ap.setVisibility(0);
                cxl.this.ap.requestFocusFromTouch();
                cxl.this.d();
                cxl.this.ap.setText(cxl.this.S.getText().toString());
                cxl.this.ap.setSelection(cxl.this.ap.getText().length());
                cxl.this.O.setText(cxl.this.ad.getString(R.string.save_bill_limit));
                cxl.this.I.setVisibility(0);
                return;
            }
            String obj = cxl.this.ap.getText().toString();
            if (cxl.c(obj)) {
                cxl.this.l.a(obj, charSequence);
                cxl.this.ap.setText("");
                cxl.this.O.setText(cxl.this.ad.getString(R.string.edit_bill_limit));
                cxl.a(cxl.this.getActivity());
                return;
            }
            cxl.this.ap.setError(cxl.this.ad.getString(R.string.valid_mail));
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: cxl.16
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new dgp().show(cxl.this.getChildFragmentManager(), "SELECT_LANGUAGE_BOTTOM_SHEET");
        }
    };
    View.OnClickListener s = new View.OnClickListener() { // from class: cxl.17
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String charSequence = cxl.this.Q.getText().toString();
            if (TextUtils.isEmpty(cxl.this.aq.getText().toString().trim())) {
                cxl.this.Q.setVisibility(8);
                cxl.this.aq.setVisibility(0);
                cxl.this.aq.requestFocusFromTouch();
                cxl.this.d();
                cxl.this.aq.setText(cxl.this.Q.getText().toString());
                cxl.this.aq.setSelection(cxl.this.aq.getText().length());
                cxl.this.Z.setText(cxl.this.ad.getString(R.string.save_bill_limit));
                cxl.this.aa.setVisibility(0);
                return;
            }
            String obj = cxl.this.aq.getText().toString();
            if (cxl.a(cxl.this, obj)) {
                cxl.this.l.b(obj, charSequence);
                cxl.this.aq.setText("");
                cxl.this.Z.setText(cxl.this.ad.getString(R.string.edit_bill_limit));
                cxl.a(cxl.this.getActivity());
                return;
            }
            cxl.this.aq.setError(cxl.this.ad.getString(R.string.valid_mobile_number));
        }
    };
    private au.b<JSONObject> aT = new au.b<JSONObject>() { // from class: cxl.18
        {
            cxl.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            cxl.this.h.a();
            Gson gson = new Gson();
            if (cxl.this.aB) {
                cxl.this.ar = (ProfilePostPaidResponse) gson.a(jSONObject2.toString(), (Class<Object>) ProfilePostPaidResponse.class);
                if (cxl.this.ar == null || !cxl.this.ar.header.responseCode.equals("0")) {
                    if (cxl.this.ar == null || !cxl.this.ar.header.responseCode.equals("1200")) {
                        return;
                    }
                    cxl.this.b(1);
                } else if (cxl.this.ar.body == null || cxl.this.ar.body.customerProfile == null || cxl.this.ar.body.customerProfile.customerName == null) {
                } else {
                    cxl.this.K.setText(cxl.this.ar.body.customerProfile.customerName);
                    cxl.this.S.setText(cxl.this.ar.body.customerProfile.email);
                    cxl.this.U.setText(cxl.this.ar.body.billMedium.email);
                    cxl.this.N.setText(cxl.this.ar.body.customerProfile.gender);
                    cxl.this.M.setText(cxl.this.ar.body.customerProfile.getPreferredLanguage());
                    cxl.this.R.setText(cxl.this.ar.body.customerProfile.birthday);
                    if (cxl.this.e.g()) {
                        cxl.this.Q.setText(cxl.this.ar.body.customerProfile.contactNumber);
                        cxl.this.ab.setText(cxl.this.ad.getString(R.string.contact_number));
                    } else {
                        cxl.this.Q.setText(cxl.this.ar.body.customerProfile.msisdn);
                        cxl.this.ab.setText(cxl.this.ad.getString(R.string.mobile_number));
                        cxl.this.Z.setVisibility(8);
                    }
                    if (cxl.this.ar.body.customerProfile.contactAddress != null) {
                        cxl.this.L.setText(cxl.this.ar.body.customerProfile.contactAddress.get(0));
                    }
                    if (!TextUtils.isEmpty(cxl.this.ar.body.billMedium.email)) {
                        cxl.this.ag.setVisibility(0);
                        cxl.this.U.setText(cxl.this.ar.body.billMedium.email);
                    }
                    if (TextUtils.isEmpty(cxl.this.ar.body.billMedium.msisdn)) {
                        return;
                    }
                    cxl.this.af.setVisibility(0);
                    cxl.this.V.setText(cxl.this.ar.body.billMedium.msisdn);
                }
            }
        }
    };
    private au.a aU = new au.a() { // from class: cxl.19
        {
            cxl.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxl.this.h.a();
            UnNavigateResponseActivity.a(cxl.this.ad, cxl.this.ad.getString(R.string.something_went_wrong), cxl.this.ad.getString(R.string.please_try_again), true);
        }
    };
    View.OnClickListener t = new View.OnClickListener() { // from class: cxl.2
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxl.this.as) {
                cxl.this.startActivityForResult(new Intent(cxl.this.getActivity(), dgk.class), 6);
                return;
            }
            cxl.this.l.c();
        }
    };
    View.OnClickListener u = new View.OnClickListener() { // from class: cxl.3
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxl.this.startActivityForResult(new Intent(cxl.this.ad, DisableAutoPayConfirmationActivity.class), cxl.ay);
        }
    };
    View.OnClickListener v = new View.OnClickListener() { // from class: -$$Lambda$cxl$oTAULEgxJ8Z74cNMiJEz7h4sX54
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxl.lambda$oTAULEgxJ8Z74cNMiJEz7h4sX54(cxl.this, view);
        }
    };
    View.OnClickListener w = new View.OnClickListener() { // from class: cxl.4
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxl.this.startActivityForResult(new Intent(cxl.this.ad, ShowCreditCardConfirmationCodeActivity.class), cxl.az);
        }
    };
    View.OnClickListener x = new View.OnClickListener() { // from class: cxl.5
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxl.this.l.a();
            cxl.this.h.a(cxl.this.ad, cxl.this.ad.getString(R.string.loading));
        }
    };
    View.OnClickListener y = new View.OnClickListener() { // from class: cxl.6
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxl.this.aH.booleanValue()) {
                if (cxl.this.aK.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(cxl.this.ad, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", cxl.this.getString(R.string.enable_fb_login));
                intent.putExtra("confirmation_hint", cxl.this.getString(R.string.enable_fb_login_confirmation));
                cxl.this.startActivityForResult(intent, 20);
                return;
            }
            Toast.makeText(cxl.this.ad, (int) R.string.link_fb_account_first, 0).show();
        }
    };
    View.OnClickListener z = new View.OnClickListener() { // from class: cxl.7
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxl.this.aI.booleanValue()) {
                if (cxl.this.aL.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(cxl.this.ad, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", cxl.this.getString(R.string.enable_google_login));
                intent.putExtra("confirmation_hint", cxl.this.getString(R.string.enable_google_login_disclaimer));
                cxl.this.startActivityForResult(intent, 30);
                return;
            }
            Toast.makeText(cxl.this.ad, (int) R.string.link_google_account_first, 0).show();
        }
    };
    View.OnClickListener A = new View.OnClickListener() { // from class: cxl.8
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxl.this.aH.booleanValue()) {
                rw.a().b();
                cxl.this.l.f();
                return;
            }
            cxl.this.j.a(cxl.this, Arrays.asList(NotificationCompat.CATEGORY_EMAIL, "public_profile"));
        }
    };
    View.OnClickListener B = new View.OnClickListener() { // from class: cxl.9
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxl.this.aJ.booleanValue()) {
                cxl.this.l.g();
            } else {
                cxl.i();
            }
        }
    };
    View.OnClickListener C = new View.OnClickListener() { // from class: cxl.10
        {
            cxl.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxl.this.aI.booleanValue()) {
                cxl.this.aC.b();
                cxl.this.l.e();
                return;
            }
            cxl.D(cxl.this);
        }
    };
    lw<ry> D = new lw<ry>() { // from class: cxl.11
        @Override // defpackage.lw
        public final void a(FacebookException facebookException) {
        }

        {
            cxl.this = this;
        }

        @Override // defpackage.lw
        public final /* synthetic */ void a(ry ryVar) {
            cxl.this.l.c(ryVar.a.e);
        }
    };

    static /* synthetic */ void i() {
    }

    public static /* synthetic */ void lambda$oTAULEgxJ8Z74cNMiJEz7h4sX54(cxl cxlVar, View view) {
        cxlVar.a(view);
    }

    public static cxl a() {
        return new cxl();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.auto_payment_fragment, viewGroup, false);
        if (this.g.v().equalsIgnoreCase("postpaid")) {
            this.aB = true;
        } else {
            this.aB = false;
        }
        this.K = (AppCompatTextView) inflate.findViewById(R.id.txtName);
        this.S = (AppCompatTextView) inflate.findViewById(R.id.txtEmail);
        this.M = (AppCompatTextView) inflate.findViewById(R.id.txtPreferredLanguage);
        this.P = (AppCompatTextView) inflate.findViewById(R.id.txtChangePreferredLanguage);
        this.N = (AppCompatTextView) inflate.findViewById(R.id.txtGender);
        this.aq = (EditText) inflate.findViewById(R.id.edtMobileNumber);
        this.aa = (AppCompatTextView) inflate.findViewById(R.id.txtCancelMobileNumber);
        this.Z = (AppCompatTextView) inflate.findViewById(R.id.txtChangeMobileNumber);
        this.L = (AppCompatTextView) inflate.findViewById(R.id.txtAddress);
        this.J = (AppCompatTextView) inflate.findViewById(R.id.txtAccountID);
        this.Q = (AppCompatTextView) inflate.findViewById(R.id.txtMobileNumber);
        this.ab = (AppCompatTextView) inflate.findViewById(R.id.tvServiceOrContactNumber);
        this.T = (AppCompatTextView) inflate.findViewById(R.id.txtChangeNotificationMethod);
        this.aO = (LinearLayout) inflate.findViewById(R.id.login_using_social_container);
        this.aP = (LinearLayout) inflate.findViewById(R.id.link_to_social_container);
        this.aQ = (LinearLayout) inflate.findViewById(R.id.llSocialMediaContainer);
        this.V = (AppCompatTextView) inflate.findViewById(R.id.txtMSISDN);
        this.U = (AppCompatTextView) inflate.findViewById(R.id.txtMail);
        this.R = (AppCompatTextView) inflate.findViewById(R.id.txtDateOfBirth);
        this.ap = (EditText) inflate.findViewById(R.id.edtMail);
        this.ac = (FrameLayout) inflate.findViewById(R.id.txtChangePassword);
        this.af = (LinearLayout) inflate.findViewById(R.id.lnrSMS);
        this.ag = (LinearLayout) inflate.findViewById(R.id.lnrMail);
        this.an = (LinearLayout) inflate.findViewById(R.id.lnCFacebookLoginPart);
        this.ao = (LinearLayout) inflate.findViewById(R.id.lnCGoogleLoginPart);
        this.ag = (LinearLayout) inflate.findViewById(R.id.lnrMail);
        this.O = (AppCompatTextView) inflate.findViewById(R.id.txtChangeMail);
        this.al = (LinearLayout) inflate.findViewById(R.id.lLHuawei);
        this.aR = inflate.findViewById(R.id.lLHuaweiView);
        this.am = (LinearLayout) inflate.findViewById(R.id.lnGooglePart);
        this.I = (AppCompatTextView) inflate.findViewById(R.id.txtCancel);
        this.au = (AppCompatTextView) inflate.findViewById(R.id.txtAutoPayEnableButton);
        this.av = (AppCompatTextView) inflate.findViewById(R.id.txtDisable);
        this.W = (AppCompatTextView) inflate.findViewById(R.id.tvAutoPayStatusMessage);
        this.Y = (AppCompatTextView) inflate.findViewById(R.id.txtAutoPayEnableButton);
        this.ah = (LinearLayout) inflate.findViewById(R.id.lnCreditCardNumberPart);
        this.aw = (AppCompatTextView) inflate.findViewById(R.id.tvShowCreditCard);
        this.ax = (AppCompatTextView) inflate.findViewById(R.id.tvEditCreditCard);
        this.H = (Button) inflate.findViewById(R.id.btn_modify_password);
        this.ae = (AppCompatTextView) inflate.findViewById(R.id.txtMasterCardNumber);
        this.X = (AppCompatTextView) inflate.findViewById(R.id.txtAutoPayRetryButton);
        this.ai = (LinearLayout) inflate.findViewById(R.id.auto_pay_view_container);
        this.aj = (LinearLayout) inflate.findViewById(R.id.llDateOfBirthContainer);
        this.ak = (LinearLayout) inflate.findViewById(R.id.llAccountIdContainer);
        this.aE = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkFacebook);
        this.aF = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkGoogle);
        this.aG = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkHuawei);
        this.aM = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingFacebook);
        this.aN = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingGoogle);
        this.aI = Boolean.FALSE;
        this.aH = Boolean.FALSE;
        this.aL = Boolean.FALSE;
        this.aK = Boolean.FALSE;
        if (this.e.h() || !this.a.f.isAutopaymentEnabled()) {
            this.ai.setVisibility(8);
        }
        this.j = rw.a();
        this.k = lu.a.a();
        if (diw.a(requireContext())) {
            this.aD = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(getString(R.string.we_google_app_id)).b(getString(R.string.we_google_app_id)).a().c();
            this.aC = tj.a((Activity) requireActivity(), this.aD);
        } else {
            this.am.setVisibility(8);
        }
        if (!diw.b(requireContext())) {
            this.aR.setVisibility(8);
            this.al.setVisibility(8);
        }
        this.T.setOnClickListener(this.n);
        this.ac.setOnClickListener(this.m);
        this.H.setOnClickListener(this.m);
        this.I.setOnClickListener(this.o);
        this.aa.setOnClickListener(this.p);
        this.O.setOnClickListener(this.q);
        this.P.setOnClickListener(this.r);
        this.Z.setOnClickListener(this.s);
        this.au.setOnClickListener(this.t);
        this.av.setOnClickListener(this.u);
        this.aw.setOnClickListener(this.w);
        this.ax.setOnClickListener(this.v);
        this.X.setOnClickListener(this.x);
        this.aE.setOnClickListener(this.A);
        this.aF.setOnClickListener(this.C);
        this.aG.setOnClickListener(this.B);
        this.j.a(this.k, this.D);
        this.an.setOnClickListener(this.y);
        this.ao.setOnClickListener(this.z);
        if (this.e.f() && d(this.g.U())) {
            a(this.g.U(), this.g.V());
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.ad = activity;
        dgn dgnVar = new dgn(activity, this, this);
        this.l = dgnVar;
        dgnVar.h();
        try {
            this.h.a(this.ad, this.ad.getString(R.string.loading));
            if (!this.aB) {
                djl.a(getContext()).f(this.aT, this.aU);
            } else {
                djl.a(getContext()).e(this.aT, this.aU);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dgo
    public final void b() {
        djg djgVar = this.h;
        Context context = this.ad;
        djgVar.a(context, context.getString(R.string.loading));
        try {
            if (!this.aB) {
                djl.a(getContext()).f(this.aT, this.aU);
            } else {
                djl.a(getContext()).e(this.aT, this.aU);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dgo
    public final void a(AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse) {
        Intent intent = new Intent(this.ad, EnableAutoPayTopGActivity.class);
        intent.putExtra("hashcode", autoPaymentAddCreditCardInitializeResponse.getBody().getHashcode());
        intent.putExtra("topgManageCCTransactionId", autoPaymentAddCreditCardInitializeResponse.getBody().getTopgManageCCTransactionId());
        startActivity(intent);
    }

    @Override // defpackage.dgo
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.h;
            Context context = this.ad;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.h.a();
    }

    @Override // defpackage.dgo
    public final void a(String str) {
        this.S.setVisibility(0);
        this.ap.setVisibility(8);
        this.I.setVisibility(8);
        this.S.setText(str);
    }

    @Override // defpackage.dgo
    public final void c() {
        this.Q.setVisibility(0);
        this.aq.setVisibility(8);
        this.aa.setVisibility(8);
    }

    @Override // defpackage.dgo
    public final void a(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
        if (checkAutoPayStatusResponse != null) {
            this.as = checkAutoPayStatusResponse.body.a.booleanValue();
        }
    }

    @Override // defpackage.dgo
    public final void b(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
        if (checkAutoPayStatusResponse != null) {
            this.at = checkAutoPayStatusResponse.body.a.booleanValue();
            this.h.a();
            if (this.at) {
                this.au.setVisibility(8);
                this.av.setVisibility(0);
                this.W.setText(R.string.enabled_auto_pay);
                this.W.setBackgroundResource(R.color.green);
                this.ah.setVisibility(0);
                this.X.setVisibility(8);
                return;
            }
            this.au.setVisibility(0);
            this.av.setVisibility(8);
            this.W.setText(R.string.disabled_auto_pay);
            this.W.setBackgroundResource(R.color.gray);
            this.ah.setVisibility(8);
            this.X.setVisibility(8);
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.ad, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            try {
                this.h.a(this.ad, this.ad.getString(R.string.loading));
                if (!this.aB) {
                    djl.a(getContext()).f(this.aT, this.aU);
                } else {
                    djl.a(getContext()).e(this.aT, this.aU);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            j();
        } else if (i == 9) {
            this.l.a();
        } else if (i == 4) {
            this.l.h();
        } else if (i == 6) {
            String charSequence = this.Q.getText().toString();
            this.l.b(this.aq.getText().toString(), charSequence);
        } else if (i != 7) {
        } else {
            int i2 = this.aS;
            if (i2 == 1) {
                this.l.e(this.F);
            } else if (i2 != 2) {
            } else {
                this.l.e(this.E);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.k.a(i, i2, intent);
        if (i == 6) {
            if (i2 != -1) {
                return;
            }
            this.l.d();
        } else if (i == ay) {
            if (i2 != -1) {
                return;
            }
            this.l.b();
        } else if (i == az) {
            if (i2 != -1) {
                return;
            }
            this.aA = intent.getStringExtra("smsCode");
            j();
        } else if (i == 10) {
            try {
                this.l.b(tj.a(intent).a(ApiException.class).c);
            } catch (ApiException e) {
                e.getMessage();
                Context context = this.ad;
                UnNavigateResponseActivity.a(context, context.getString(R.string.something_went_wrong), this.ad.getString(R.string.please_try_again), true);
            }
        } else if (i == 20) {
            if (i2 != -1) {
                return;
            }
            this.l.d("FACEBOOK");
        } else if (i != 30 || i2 != -1) {
        } else {
            this.l.d("GOOGLE");
        }
    }

    public final void d() {
        ((InputMethodManager) getActivity().getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    public static void a(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    private void j() {
        if (d(this.aA)) {
            this.l.a(this.aA);
        }
    }

    @Override // defpackage.dgo
    public final void a(String str, String str2) {
        Drawable drawable;
        this.g.z(str2);
        this.g.y(str);
        this.ae.setText(str);
        if (str2.equalsIgnoreCase("visa")) {
            drawable = getContext().getResources().getDrawable(R.drawable.ic_visa);
        } else {
            drawable = getContext().getResources().getDrawable(R.drawable.ic_master_card);
        }
        this.ae.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.aw.setVisibility(8);
        this.ax.setVisibility(0);
    }

    @Override // defpackage.dgo
    public final void b(String str) {
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        this.X.setVisibility(0);
        this.ah.setVisibility(8);
        this.W.setText(str);
        this.W.setBackgroundResource(R.color.red);
    }

    private static boolean d(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    @Override // defpackage.dgo
    public final void e() {
        this.l.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        uc.a(this.ad);
        if (this.a.f.isAutopaymentEnabled()) {
            this.l.a();
        }
        if (this.a.f.getFeature_socialMedia() && this.g.S()) {
            this.l.h();
        } else {
            this.aQ.setVisibility(8);
        }
        if (!this.g.S()) {
            this.ac.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // defpackage.dgo
    public final void a(SocialMediaStatusResponse socialMediaStatusResponse) {
        if (socialMediaStatusResponse != null) {
            for (int i = 0; i < socialMediaStatusResponse.getProviderStatusObjects().size(); i++) {
                if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("FACEBOOK")) {
                    this.aH = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.aK = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("GOOGLE")) {
                    this.aI = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.aL = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("HUAWEI")) {
                    this.aJ = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                }
            }
            if (this.aH.booleanValue()) {
                this.aE.setText(this.ad.getString(R.string.unlink));
            } else {
                this.aE.setText(this.ad.getString(R.string.link));
            }
            if (this.aI.booleanValue()) {
                this.aF.setText(this.ad.getString(R.string.unlink));
            } else {
                this.aF.setText(this.ad.getString(R.string.link));
            }
            if (this.aJ.booleanValue()) {
                this.aG.setText(this.ad.getString(R.string.unlink));
            } else {
                this.aG.setText(this.ad.getString(R.string.link));
            }
            if (this.aK.booleanValue()) {
                this.aM.setVisibility(0);
            } else {
                this.aM.setVisibility(4);
            }
            if (this.aL.booleanValue()) {
                this.aN.setVisibility(0);
            } else {
                this.aN.setVisibility(4);
            }
        }
    }

    @Override // defpackage.dgo
    public final void f() {
        this.aO.setVisibility(8);
        this.aP.setVisibility(8);
    }

    @Override // defpackage.dgp.a
    public final void a(int i) {
        this.aS = i;
        if (i == 1) {
            this.l.e(this.F);
        } else if (i != 2) {
        } else {
            this.l.e(this.E);
        }
    }

    @Override // defpackage.dgo
    public final void b(AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse) {
        Intent intent = new Intent(this.ad, EnableAutoPayTopGActivity.class);
        intent.putExtra("hashcode", autoPaymentAddCreditCardInitializeResponse.getBody().getHashcode());
        intent.putExtra("topgManageCCTransactionId", autoPaymentAddCreditCardInitializeResponse.getBody().getTopgManageCCTransactionId());
        intent.putExtra(EnableAutoPayTopGActivity.c, "update");
        startActivity(intent);
    }

    public /* synthetic */ void a(View view) {
        this.l.i();
    }

    static /* synthetic */ boolean c(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    static /* synthetic */ boolean a(cxl cxlVar, String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= cxlVar.getResources().getInteger(R.integer.mobile_number)) {
            return str.substring(0, 1).equalsIgnoreCase("0") || str.substring(0, 1).equalsIgnoreCase("٠");
        }
        return false;
    }

    static /* synthetic */ void D(cxl cxlVar) {
        cxlVar.startActivityForResult(cxlVar.aC.a(), 10);
    }
}
