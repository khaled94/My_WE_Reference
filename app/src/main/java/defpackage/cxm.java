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
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeResponseBody;
import com.ucare.we.model.CheckAutoPayStatusResponse;
import com.ucare.we.model.CustomerProfile;
import com.ucare.we.model.PrePaidProfileModel.PrePaidProfileResponse;
import com.ucare.we.model.ProfilePostPaidResponse;
import com.ucare.we.model.SocialMediaModel.SocialMediaStatusResponse;
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

/* renamed from: cxm  reason: default package */
/* loaded from: classes2.dex */
public class cxm extends dab implements dgp.a, dgs, dju {
    private static int aC = 3;
    private static int aD = 4;
    private static int aE = 5;
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
    private AppCompatTextView aA;
    private AppCompatTextView aB;
    private String aF;
    private tl aH;
    private GoogleSignInOptions aI;
    private AppCompatTextView aJ;
    private AppCompatTextView aK;
    private AppCompatTextView aL;
    private Boolean aM;
    private Boolean aN;
    private Boolean aO;
    private Boolean aP;
    private Boolean aQ;
    private ImageView aR;
    private ImageView aS;
    private LinearLayout aT;
    private LinearLayout aU;
    private LinearLayout aV;
    private int aW;
    private int aX;
    private String aY;
    private EditText aZ;
    private AppCompatTextView aa;
    private AppCompatTextView ab;
    private AppCompatTextView ac;
    private FrameLayout ad;
    private Button ae;
    private Context af;
    private AppCompatTextView ag;
    private LinearLayout ah;
    private LinearLayout ai;
    private LinearLayout aj;
    private LinearLayout ak;
    private LinearLayout al;
    private LinearLayout am;
    private LinearLayout an;
    private LinearLayout ao;
    private LinearLayout ap;
    private LinearLayout aq;
    private EditText ar;
    private EditText as;
    private ProfilePostPaidResponse at;
    private CustomerProfile au;
    private PrePaidProfileResponse av;
    private boolean aw;
    private AppCompatTextView ay;
    private AppCompatTextView az;
    @Inject
    dil b;
    private EditText ba;
    private int bb;
    private View bc;
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
    dgr l;
    private String F = "Arabic";
    private String G = "English";
    private final int H = 1;
    private boolean ax = false;
    private boolean aG = true;
    View.OnClickListener m = new View.OnClickListener() { // from class: cxm.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxm.this.startActivity(new Intent(cxm.this.af, ModifyPasswordActivity.class));
        }
    };
    View.OnClickListener n = new View.OnClickListener() { // from class: cxm.12
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(cxm.this.af, dgl.class);
            intent.putExtra("Dial", cxm.this.au.msisdn);
            intent.putExtra("Mail", cxm.this.au.email);
            cxm.this.startActivity(intent);
        }
    };
    View.OnClickListener o = new View.OnClickListener() { // from class: cxm.15
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxm.a(cxm.this.getActivity());
            cxm.this.ar.setText("");
            cxm.this.O.setText(cxm.this.af.getString(R.string.edit_bill_limit));
            cxm.this.S.setText(cxm.this.au.email);
            cxm.this.I.setVisibility(8);
            cxm.this.S.setVisibility(0);
            cxm.this.ar.setVisibility(8);
        }
    };
    View.OnClickListener p = new View.OnClickListener() { // from class: cxm.16
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxm.a(cxm.this.getActivity());
            cxm.this.as.setText("");
            cxm.this.Z.setText(cxm.this.af.getString(R.string.edit_bill_limit));
            cxm.this.Q.setText(cxm.this.au.contactNumber);
            cxm.this.aa.setVisibility(8);
            cxm.this.Q.setVisibility(0);
            cxm.this.as.setVisibility(8);
        }
    };
    View.OnClickListener q = new View.OnClickListener() { // from class: cxm.17
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String charSequence = cxm.this.S.getText().toString();
            if (TextUtils.isEmpty(cxm.this.ar.getText().toString().trim())) {
                cxm.this.S.setVisibility(8);
                cxm.this.ar.setVisibility(0);
                cxm.this.ar.requestFocusFromTouch();
                cxm.this.c();
                cxm.this.ar.setText(cxm.this.S.getText().toString());
                cxm.this.ar.setSelection(cxm.this.ar.getText().length());
                cxm.this.O.setText(cxm.this.af.getString(R.string.save_bill_limit));
                cxm.this.I.setVisibility(0);
                return;
            }
            String obj = cxm.this.ar.getText().toString();
            if (cxm.e(obj)) {
                cxm.this.l.a(obj, charSequence);
                cxm.this.ar.setText("");
                cxm.this.O.setText(cxm.this.af.getString(R.string.edit_bill_limit));
                cxm.a(cxm.this.getActivity());
                return;
            }
            cxm.this.ar.setError(cxm.this.af.getString(R.string.valid_mail));
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: cxm.18
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new dgp().show(cxm.this.getChildFragmentManager(), "SELECT_LANGUAGE_BOTTOM_SHEET");
        }
    };
    View.OnClickListener s = new View.OnClickListener() { // from class: cxm.19
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String charSequence = cxm.this.Q.getText().toString();
            if (TextUtils.isEmpty(cxm.this.as.getText().toString().trim())) {
                cxm.this.Q.setVisibility(8);
                cxm.this.as.setVisibility(0);
                cxm.this.as.requestFocusFromTouch();
                cxm.this.c();
                cxm.this.as.setText(cxm.this.Q.getText().toString());
                cxm.this.as.setSelection(cxm.this.as.getText().length());
                cxm.this.Z.setText(cxm.this.af.getString(R.string.save_bill_limit));
                cxm.this.aa.setVisibility(0);
                return;
            }
            String obj = cxm.this.as.getText().toString();
            if (cxm.a(cxm.this, obj)) {
                cxm.this.l.b(obj, charSequence);
                cxm.this.as.setText("");
                cxm.this.Z.setText(cxm.this.af.getString(R.string.edit_bill_limit));
                cxm.a(cxm.this.getActivity());
                return;
            }
            cxm.this.as.setError(cxm.this.af.getString(R.string.valid_mobile_number));
        }
    };
    private au.b<JSONObject> bd = new au.b<JSONObject>() { // from class: cxm.20
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            cxm.this.h.a();
            Gson gson = new Gson();
            if (!cxm.this.aG) {
                cxm.this.av = (PrePaidProfileResponse) gson.a(jSONObject2.toString(), (Class<Object>) PrePaidProfileResponse.class);
                cxm cxmVar = cxm.this;
                cxmVar.au = cxmVar.av.body;
                if (cxm.this.av == null || !cxm.this.av.header.responseCode.equals("0")) {
                    if (cxm.this.at == null || !cxm.this.at.header.responseCode.equals("1200")) {
                        return;
                    }
                    cxm.this.b(1);
                } else if (cxm.this.au == null) {
                } else {
                    cxm.this.K.setText(cxm.this.au.customerName);
                    cxm.this.S.setText(cxm.this.au.email);
                    cxm.this.U.setText(cxm.this.au.email);
                    cxm.this.N.setText(cxm.this.au.gender);
                    cxm.this.M.setText(cxm.this.au.getPreferredLanguage());
                    cxm.this.R.setText(cxm.this.au.birthday);
                    if (cxm.this.e.g()) {
                        cxm.this.Q.setText(cxm.this.au.contactNumber);
                        cxm.this.ab.setText(cxm.this.af.getString(R.string.contact_number));
                    } else {
                        cxm.this.Q.setText(cxm.this.au.msisdn);
                        cxm.this.ab.setText(cxm.this.af.getString(R.string.mobile_number));
                        cxm.this.Z.setVisibility(8);
                    }
                    if (cxm.this.au.contactAddress == null) {
                        return;
                    }
                    cxm.this.L.setText(cxm.this.au.contactAddress.get(0));
                }
            }
        }
    };
    private au.a be = new au.a() { // from class: cxm.21
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxm.this.h.a();
        }
    };
    View.OnClickListener t = new View.OnClickListener() { // from class: cxm.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxm.this.aw) {
                cxm.this.startActivityForResult(new Intent(cxm.this.getActivity(), dgk.class), 6);
                return;
            }
            cxm.this.d();
        }
    };
    View.OnClickListener u = new View.OnClickListener() { // from class: cxm.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxm.this.startActivityForResult(new Intent(cxm.this.af, DisableAutoPayConfirmationActivity.class), cxm.aC);
        }
    };
    View.OnClickListener v = new View.OnClickListener() { // from class: cxm.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxm.this.startActivityForResult(new Intent(cxm.this.af, ShowCreditCardConfirmationCodeActivity.class), cxm.aD);
        }
    };
    View.OnClickListener w = new View.OnClickListener() { // from class: cxm.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxm.this.l.c();
        }
    };
    View.OnClickListener x = new View.OnClickListener() { // from class: cxm.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxm.this.l.a();
            cxm.this.h.a(cxm.this.af, cxm.this.af.getString(R.string.loading));
        }
    };
    View.OnClickListener y = new View.OnClickListener() { // from class: cxm.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!cxm.d(cxm.this.aZ.getText().toString().trim())) {
                cxm.this.aZ.setError(cxm.this.getString(R.string.wrong_amount));
            } else if (!cxm.d(cxm.this.ba.getText().toString().trim())) {
                cxm.this.ba.setError(cxm.this.getString(R.string.recharge_day_error_text));
            } else if (Integer.valueOf(cxm.this.aZ.getText().toString().trim()).intValue() < Integer.valueOf(cxm.this.a.f.getAuto_recharge_min_value()).intValue()) {
                EditText editText = cxm.this.aZ;
                editText.setError(cxm.this.getString(R.string.min_amount_value_auto_recharge) + cxm.this.a.f.getAuto_recharge_min_value() + cxm.this.af.getString(R.string.egp));
            } else {
                cxm cxmVar = cxm.this;
                cxmVar.aW = Integer.valueOf(cxmVar.aZ.getText().toString().trim()).intValue();
                cxm cxmVar2 = cxm.this;
                cxmVar2.aX = Integer.valueOf(cxmVar2.ba.getText().toString().trim()).intValue();
                if (cxm.this.aX <= 0 || cxm.this.aX > 28) {
                    cxm.this.ba.setError(cxm.this.getString(R.string.recharge_day_error_text));
                } else {
                    cxm.this.l.a(cxm.this.aX, cxm.this.aW);
                }
            }
        }
    };
    View.OnClickListener z = new View.OnClickListener() { // from class: cxm.8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxm.this.aM.booleanValue()) {
                if (cxm.this.aP.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(cxm.this.af, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", cxm.this.getString(R.string.enable_fb_login));
                intent.putExtra("confirmation_hint", cxm.this.getString(R.string.enable_fb_login_confirmation));
                cxm.this.startActivityForResult(intent, 20);
                return;
            }
            Toast.makeText(cxm.this.af, (int) R.string.link_fb_account_first, 0).show();
        }
    };
    View.OnClickListener A = new View.OnClickListener() { // from class: cxm.9
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxm.this.aN.booleanValue()) {
                if (cxm.this.aQ.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(cxm.this.af, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", cxm.this.getString(R.string.enable_google_login));
                intent.putExtra("confirmation_hint", cxm.this.getString(R.string.enable_google_login_disclaimer));
                cxm.this.startActivityForResult(intent, 30);
                return;
            }
            Toast.makeText(cxm.this.af, (int) R.string.link_google_account_first, 0).show();
        }
    };
    View.OnClickListener B = new View.OnClickListener() { // from class: cxm.10
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxm.this.aM.booleanValue()) {
                rw.a().b();
                cxm.this.l.i();
                return;
            }
            cxm.this.j.a(cxm.this, Arrays.asList(NotificationCompat.CATEGORY_EMAIL, "public_profile"));
        }
    };
    View.OnClickListener C = new View.OnClickListener() { // from class: cxm.11
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxm.this.aO.booleanValue()) {
                cxm.this.l.h();
            } else {
                cxm.h();
            }
        }
    };
    View.OnClickListener D = new View.OnClickListener() { // from class: cxm.13
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxm.this.aN.booleanValue()) {
                cxm.this.aH.b();
                cxm.this.l.g();
                return;
            }
            cxm.G(cxm.this);
        }
    };
    lw<ry> E = new lw<ry>() { // from class: cxm.14
        @Override // defpackage.lw
        public final void a(FacebookException facebookException) {
        }

        @Override // defpackage.lw
        public final /* synthetic */ void a(ry ryVar) {
            cxm.this.l.c(ryVar.a.e);
        }
    };

    static /* synthetic */ void h() {
    }

    public static cxm a() {
        return new cxm();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.auto_rechare_fragment, viewGroup, false);
        if (this.g.v().equalsIgnoreCase("postpaid")) {
            this.aG = true;
        } else {
            this.aG = false;
        }
        this.K = (AppCompatTextView) inflate.findViewById(R.id.txtName);
        this.S = (AppCompatTextView) inflate.findViewById(R.id.txtEmail);
        this.M = (AppCompatTextView) inflate.findViewById(R.id.txtPreferredLanguage);
        this.P = (AppCompatTextView) inflate.findViewById(R.id.txtChangePreferredLanguage);
        this.N = (AppCompatTextView) inflate.findViewById(R.id.txtGender);
        this.as = (EditText) inflate.findViewById(R.id.edtMobileNumber);
        this.aa = (AppCompatTextView) inflate.findViewById(R.id.txtCancelMobileNumber);
        this.Z = (AppCompatTextView) inflate.findViewById(R.id.txtChangeMobileNumber);
        this.L = (AppCompatTextView) inflate.findViewById(R.id.txtAddress);
        this.J = (AppCompatTextView) inflate.findViewById(R.id.txtAccountID);
        this.Q = (AppCompatTextView) inflate.findViewById(R.id.txtMobileNumber);
        this.ab = (AppCompatTextView) inflate.findViewById(R.id.tvServiceOrContactNumber);
        this.T = (AppCompatTextView) inflate.findViewById(R.id.txtChangeNotificationMethod);
        this.aT = (LinearLayout) inflate.findViewById(R.id.login_using_social_container);
        this.aU = (LinearLayout) inflate.findViewById(R.id.link_to_social_container);
        this.aV = (LinearLayout) inflate.findViewById(R.id.llSocialMediaContainer);
        this.V = (AppCompatTextView) inflate.findViewById(R.id.txtMSISDN);
        this.U = (AppCompatTextView) inflate.findViewById(R.id.txtMail);
        this.R = (AppCompatTextView) inflate.findViewById(R.id.txtDateOfBirth);
        this.ar = (EditText) inflate.findViewById(R.id.edtMail);
        this.ad = (FrameLayout) inflate.findViewById(R.id.txtChangePassword);
        this.ae = (Button) inflate.findViewById(R.id.btn_modify_password);
        this.ah = (LinearLayout) inflate.findViewById(R.id.lnrSMS);
        this.ai = (LinearLayout) inflate.findViewById(R.id.lnrMail);
        this.ap = (LinearLayout) inflate.findViewById(R.id.lnCFacebookLoginPart);
        this.aq = (LinearLayout) inflate.findViewById(R.id.lnCGoogleLoginPart);
        this.ai = (LinearLayout) inflate.findViewById(R.id.lnrMail);
        this.O = (AppCompatTextView) inflate.findViewById(R.id.txtChangeMail);
        this.aZ = (EditText) inflate.findViewById(R.id.etAutoRechargeAmount);
        this.ba = (EditText) inflate.findViewById(R.id.etAutoRechargeDay);
        this.I = (AppCompatTextView) inflate.findViewById(R.id.txtCancel);
        this.ay = (AppCompatTextView) inflate.findViewById(R.id.txtAutoPayEnableButton);
        this.az = (AppCompatTextView) inflate.findViewById(R.id.txtDisable);
        this.W = (AppCompatTextView) inflate.findViewById(R.id.tvAutoPayStatusMessage);
        this.Y = (AppCompatTextView) inflate.findViewById(R.id.txtAutoPayEnableButton);
        this.aj = (LinearLayout) inflate.findViewById(R.id.lnCreditCardNumberPart);
        this.ac = (AppCompatTextView) inflate.findViewById(R.id.tvUpdateAutoRechargeValues);
        this.aA = (AppCompatTextView) inflate.findViewById(R.id.tvShowCreditCard);
        this.aB = (AppCompatTextView) inflate.findViewById(R.id.tvEditCreditCard);
        this.ag = (AppCompatTextView) inflate.findViewById(R.id.txtMasterCardNumber);
        this.X = (AppCompatTextView) inflate.findViewById(R.id.txtAutoPayRetryButton);
        this.ak = (LinearLayout) inflate.findViewById(R.id.auto_pay_view_container);
        this.al = (LinearLayout) inflate.findViewById(R.id.llDateOfBirthContainer);
        this.am = (LinearLayout) inflate.findViewById(R.id.llAccountIdContainer);
        this.an = (LinearLayout) inflate.findViewById(R.id.lLHuawei);
        this.bc = inflate.findViewById(R.id.lLHuaweiView);
        this.ao = (LinearLayout) inflate.findViewById(R.id.lnGooglePart);
        this.aJ = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkFacebook);
        this.aK = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkGoogle);
        this.aL = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkHuawei);
        this.aR = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingFacebook);
        this.aS = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingGoogle);
        this.aN = Boolean.FALSE;
        this.aM = Boolean.FALSE;
        this.aO = Boolean.FALSE;
        this.aQ = Boolean.FALSE;
        this.aP = Boolean.FALSE;
        if (!this.a.f.isFeatureAutorecharge()) {
            this.ak.setVisibility(8);
        }
        this.j = rw.a();
        this.k = lu.a.a();
        if (diw.a(requireContext())) {
            this.aI = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(getString(R.string.we_google_app_id)).b(getString(R.string.we_google_app_id)).a().c();
            this.aH = tj.a((Activity) requireActivity(), this.aI);
        } else {
            this.ao.setVisibility(8);
        }
        if (!diw.b(requireContext())) {
            this.bc.setVisibility(8);
            this.an.setVisibility(8);
        }
        this.T.setOnClickListener(this.n);
        this.ad.setOnClickListener(this.m);
        this.ae.setOnClickListener(this.m);
        this.I.setOnClickListener(this.o);
        this.aa.setOnClickListener(this.p);
        this.O.setOnClickListener(this.q);
        this.P.setOnClickListener(this.r);
        this.Z.setOnClickListener(this.s);
        this.ay.setOnClickListener(this.t);
        this.az.setOnClickListener(this.u);
        this.ac.setOnClickListener(this.y);
        this.aA.setOnClickListener(this.v);
        this.aB.setOnClickListener(this.w);
        this.X.setOnClickListener(this.x);
        this.aJ.setOnClickListener(this.B);
        this.aK.setOnClickListener(this.D);
        this.aL.setOnClickListener(this.C);
        this.j.a(this.k, this.E);
        this.ap.setOnClickListener(this.z);
        this.aq.setOnClickListener(this.A);
        if (d(this.g.U())) {
            a(this.g.U(), this.g.V());
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.af = activity;
        dgr dgrVar = new dgr(activity, this, this);
        this.l = dgrVar;
        dgrVar.e();
        try {
            this.h.a(this.af, this.af.getString(R.string.loading));
            djl.a(getContext()).f(this.bd, this.be);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dgs
    public final void b() {
        djg djgVar = this.h;
        Context context = this.af;
        djgVar.a(context, context.getString(R.string.loading));
        try {
            djl.a(getContext()).f(this.bd, this.be);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dgs
    public final void a(AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse) {
        if (!d(this.aZ.getText().toString().trim())) {
            this.aZ.setError(getString(R.string.wrong_amount));
        } else if (!d(this.ba.getText().toString().trim())) {
            this.ba.setError(getString(R.string.recharge_day_error_text));
        } else if (Integer.valueOf(this.aZ.getText().toString().trim()).intValue() < Integer.valueOf(this.a.f.getAuto_recharge_min_value()).intValue()) {
            EditText editText = this.aZ;
            editText.setError(getString(R.string.min_amount_value_auto_recharge) + this.a.f.getAuto_recharge_min_value() + this.af.getString(R.string.egp));
        } else {
            this.aW = Integer.valueOf(this.aZ.getText().toString().trim()).intValue();
            int intValue = Integer.valueOf(this.ba.getText().toString().trim()).intValue();
            this.aX = intValue;
            if (intValue <= 0 || intValue > 28) {
                this.ba.setError(getString(R.string.recharge_day_error_text));
                return;
            }
            Intent intent = new Intent(this.af, EnableAutoPayTopGActivity.class);
            intent.putExtra("hashcode", autoPaymentAddCreditCardInitializeResponse.getBody().getHashcode());
            intent.putExtra("topgManageCCTransactionId", autoPaymentAddCreditCardInitializeResponse.getBody().getTopgManageCCTransactionId());
            intent.putExtra(EnableAutoPayTopGActivity.b, this.aW);
            intent.putExtra("confirmationCode", this.aY);
            intent.putExtra(EnableAutoPayTopGActivity.a, this.aX);
            startActivity(intent);
        }
    }

    @Override // defpackage.dgs
    public final void b(AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse) {
        Intent intent = new Intent(this.af, EnableAutoPayTopGActivity.class);
        intent.putExtra("hashcode", autoPaymentAddCreditCardInitializeResponse.getBody().getHashcode());
        intent.putExtra("topgManageCCTransactionId", autoPaymentAddCreditCardInitializeResponse.getBody().getTopgManageCCTransactionId());
        intent.putExtra(EnableAutoPayTopGActivity.b, this.aW);
        intent.putExtra(EnableAutoPayTopGActivity.a, this.aX);
        intent.putExtra(EnableAutoPayTopGActivity.c, "update");
        startActivity(intent);
    }

    @Override // defpackage.dgs
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.h;
            Context context = this.af;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.h.a();
    }

    @Override // defpackage.dgs
    public final void a(String str) {
        this.S.setVisibility(0);
        this.ar.setVisibility(8);
        this.I.setVisibility(8);
        this.S.setText(str);
    }

    @Override // defpackage.dgs
    public final void b(String str) {
        this.Q.setVisibility(0);
        this.as.setVisibility(8);
        this.aa.setVisibility(8);
    }

    @Override // defpackage.dgs
    public final void a(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
        if (checkAutoPayStatusResponse != null) {
            this.aw = checkAutoPayStatusResponse.body.a.booleanValue();
        }
    }

    @Override // defpackage.dgs
    public final void b(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
        if (checkAutoPayStatusResponse != null) {
            this.ax = checkAutoPayStatusResponse.body.a.booleanValue();
            this.h.a();
            if (this.ax) {
                this.ay.setVisibility(8);
                this.az.setVisibility(0);
                this.W.setText(R.string.enabled_auto_recharge);
                this.ac.setVisibility(0);
                this.W.setBackgroundResource(R.color.green);
                this.aj.setVisibility(0);
                this.X.setVisibility(8);
                return;
            }
            this.ay.setVisibility(0);
            this.az.setVisibility(8);
            this.W.setText(R.string.disabled_auto_recharge);
            this.ac.setVisibility(8);
            this.W.setBackgroundResource(R.color.gray);
            this.aj.setVisibility(8);
            this.X.setVisibility(8);
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.af, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            try {
                this.h.a(this.af, this.af.getString(R.string.loading));
                djl.a(getContext()).f(this.bd, this.be);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            i();
        } else if (i == 4) {
            this.l.j();
        } else if (i == 9) {
            this.l.a();
        } else if (i == 6) {
            String charSequence = this.Q.getText().toString();
            this.l.b(this.as.getText().toString(), charSequence);
        } else if (i == 7) {
            int i2 = this.bb;
            if (i2 == 1) {
                this.l.e(this.G);
            } else if (i2 != 2) {
            } else {
                this.l.e(this.F);
            }
        } else if (i == 8) {
            this.l.e();
        } else if (i == 9) {
            this.l.a(this.aX, this.aW);
        } else if (i != 10) {
        } else {
            this.l.f();
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
        } else if (i == aC) {
            if (i2 != -1) {
                return;
            }
            this.l.f();
        } else if (i == aD) {
            if (i2 != -1) {
                return;
            }
            this.aF = intent.getStringExtra("smsCode");
            i();
        } else if (i == aE) {
            if (i2 != -1) {
                return;
            }
            this.aY = "";
            this.aY = intent.getStringExtra("smsCode");
            String stringExtra = intent.getStringExtra(ShowCreditCardConfirmationCodeActivity.d);
            String stringExtra2 = intent.getStringExtra(ShowCreditCardConfirmationCodeActivity.c);
            AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = new AutoPaymentAddCreditCardInitializeResponse();
            AutoPaymentAddCreditCardInitializeResponseBody autoPaymentAddCreditCardInitializeResponseBody = new AutoPaymentAddCreditCardInitializeResponseBody();
            autoPaymentAddCreditCardInitializeResponseBody.setHashcode(stringExtra);
            autoPaymentAddCreditCardInitializeResponseBody.setTopgManageCCTransactionId(stringExtra2);
            autoPaymentAddCreditCardInitializeResponse.setBody(autoPaymentAddCreditCardInitializeResponseBody);
            a(autoPaymentAddCreditCardInitializeResponse);
        } else if (i == 10) {
            try {
                this.l.b(tj.a(intent).a(ApiException.class).c);
            } catch (ApiException unused) {
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

    public final void c() {
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

    private void i() {
        if (d(this.aF)) {
            this.l.a(this.aF);
        }
    }

    @Override // defpackage.dgs
    public final void a(String str, String str2) {
        Drawable drawable;
        this.g.z(str2);
        this.g.y(str);
        this.ag.setText(str);
        if (str2.equalsIgnoreCase("visa")) {
            drawable = getContext().getResources().getDrawable(R.drawable.ic_visa);
        } else {
            drawable = getContext().getResources().getDrawable(R.drawable.ic_master_card);
        }
        this.ag.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.aA.setVisibility(8);
        this.aB.setVisibility(0);
    }

    @Override // defpackage.dgs
    public final void c(String str) {
        this.ay.setVisibility(8);
        this.az.setVisibility(8);
        this.X.setVisibility(0);
        this.aj.setVisibility(8);
        this.W.setText(str);
        this.W.setBackgroundResource(R.color.red);
    }

    public static boolean d(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    @Override // defpackage.dgs
    public final void d() {
        if (!d(this.aZ.getText().toString().trim())) {
            this.aZ.setError(getString(R.string.wrong_amount));
        } else if (!d(this.ba.getText().toString().trim())) {
            this.ba.setError(getString(R.string.recharge_day_error_text));
        } else if (Integer.valueOf(this.aZ.getText().toString().trim()).intValue() < Integer.valueOf(this.a.f.getAuto_recharge_min_value()).intValue()) {
            EditText editText = this.aZ;
            editText.setError(getString(R.string.min_amount_value_auto_recharge) + this.a.f.getAuto_recharge_min_value() + this.af.getString(R.string.egp));
        } else {
            this.aW = Integer.valueOf(this.aZ.getText().toString().trim()).intValue();
            int intValue = Integer.valueOf(this.ba.getText().toString().trim()).intValue();
            this.aX = intValue;
            if (intValue <= 0 || intValue > 28) {
                this.ba.setError(getString(R.string.recharge_day_error_text));
                return;
            }
            Intent intent = new Intent(this.af, ShowCreditCardConfirmationCodeActivity.class);
            intent.putExtra("CONFIRMATION_CODE_TYPE", "1");
            intent.putExtra(EnableAutoPayTopGActivity.b, this.aW);
            intent.putExtra(EnableAutoPayTopGActivity.a, this.aX);
            startActivityForResult(intent, aE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        uc.a(this.af);
        if (this.a.f.isAutopaymentEnabled()) {
            this.l.a();
            this.l.b();
        }
        if (this.a.f.getFeature_socialMedia() && this.g.S()) {
            this.l.j();
        } else {
            this.aV.setVisibility(8);
        }
        if (!this.g.S()) {
            this.ad.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // defpackage.dgs
    public final void a(SocialMediaStatusResponse socialMediaStatusResponse) {
        if (socialMediaStatusResponse != null) {
            for (int i = 0; i < socialMediaStatusResponse.getProviderStatusObjects().size(); i++) {
                if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("FACEBOOK")) {
                    this.aM = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.aP = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("GOOGLE")) {
                    this.aN = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.aQ = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("HUAWEI")) {
                    this.aO = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                }
            }
            if (this.aM.booleanValue()) {
                this.aJ.setText(this.af.getString(R.string.unlink));
            } else {
                this.aJ.setText(this.af.getString(R.string.link));
            }
            if (this.aN.booleanValue()) {
                this.aK.setText(this.af.getString(R.string.unlink));
            } else {
                this.aK.setText(this.af.getString(R.string.link));
            }
            if (this.aO.booleanValue()) {
                this.aL.setText(this.af.getString(R.string.unlink));
            } else {
                this.aL.setText(this.af.getString(R.string.link));
            }
            if (this.aP.booleanValue()) {
                this.aR.setVisibility(0);
            } else {
                this.aR.setVisibility(4);
            }
            if (this.aQ.booleanValue()) {
                this.aS.setVisibility(0);
            } else {
                this.aS.setVisibility(4);
            }
        }
    }

    @Override // defpackage.dgs
    public final void e() {
        this.aT.setVisibility(8);
        this.aU.setVisibility(8);
    }

    @Override // defpackage.dgs
    public final void a(int i, int i2) {
        this.aZ.setText(String.valueOf(i2));
        this.ba.setText(String.valueOf(i));
    }

    @Override // defpackage.dgp.a
    public final void a(int i) {
        this.bb = i;
        if (i == 1) {
            this.l.e(this.G);
        } else if (i != 2) {
        } else {
            this.l.e(this.F);
        }
    }

    static /* synthetic */ boolean e(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    static /* synthetic */ boolean a(cxm cxmVar, String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= cxmVar.getResources().getInteger(R.integer.mobile_number)) {
            return str.substring(0, 1).equalsIgnoreCase("0") || str.substring(0, 1).equalsIgnoreCase("٠");
        }
        return false;
    }

    static /* synthetic */ void G(cxm cxmVar) {
        cxmVar.startActivityForResult(cxmVar.aH.a(), 10);
    }
}
