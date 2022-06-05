package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
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
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dgm */
/* loaded from: classes2.dex */
public class dgm extends dab implements dgo, dgp.a, dju {
    private static int aj = 3;
    private static int ak = 4;
    private AppCompatTextView H;
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
    private FrameLayout W;
    private Context X;
    private LinearLayout Y;
    private LinearLayout Z;
    @Inject
    dhn a;
    private ImageView aA;
    private ImageView aB;
    private ImageView aC;
    private LinearLayout aD;
    private LinearLayout aE;
    private LinearLayout aF;
    private View aG;
    private int aH;
    private LinearLayout aa;
    private LinearLayout ab;
    private LinearLayout ac;
    private LinearLayout ad;
    private EditText ae;
    private EditText af;
    private ProfilePostPaidResponse ag;
    private boolean ah;
    private String al;
    private tl an;
    private GoogleSignInOptions ao;
    private AppCompatTextView ap;
    private AppCompatTextView aq;
    private AppCompatTextView ar;
    private AppCompatTextView as;
    private AppCompatTextView at;
    private AppCompatTextView au;
    private Boolean av;
    private Boolean aw;
    private Boolean ax;
    private Boolean ay;
    private Boolean az;
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
    private boolean ai = false;
    private boolean am = true;
    View.OnClickListener m = new View.OnClickListener() { // from class: dgm.1
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgm.this.startActivity(new Intent(dgm.this.X, ModifyPasswordActivity.class));
        }
    };
    View.OnClickListener n = new View.OnClickListener() { // from class: dgm.12
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(dgm.this.X, dgl.class);
            intent.putExtra("Dial", dgm.this.ag.body.customerProfile.msisdn);
            intent.putExtra("Mail", dgm.this.ag.body.customerProfile.email);
            dgm.this.startActivity(intent);
        }
    };
    View.OnClickListener o = new View.OnClickListener() { // from class: dgm.13
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgm.a(dgm.this.getActivity());
            dgm.this.ae.setText("");
            dgm.this.O.setText(dgm.this.X.getString(R.string.edit_bill_limit));
            dgm.this.S.setText(dgm.this.ag.body.customerProfile.email);
            dgm.this.I.setVisibility(8);
            dgm.this.S.setVisibility(0);
            dgm.this.ae.setVisibility(8);
        }
    };
    View.OnClickListener p = new View.OnClickListener() { // from class: dgm.14
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgm.a(dgm.this.getActivity());
            dgm.this.af.setText("");
            dgm.this.T.setText(dgm.this.X.getString(R.string.edit_bill_limit));
            dgm.this.Q.setText(dgm.this.ag.body.customerProfile.contactNumber);
            dgm.this.U.setVisibility(8);
            dgm.this.Q.setVisibility(0);
            dgm.this.af.setVisibility(8);
        }
    };
    View.OnClickListener q = new View.OnClickListener() { // from class: dgm.15
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String charSequence = dgm.this.S.getText().toString();
            if (TextUtils.isEmpty(dgm.this.ae.getText().toString().trim())) {
                dgm.this.S.setVisibility(8);
                dgm.this.ae.setVisibility(0);
                dgm.this.ae.requestFocusFromTouch();
                dgm.this.d();
                dgm.this.ae.setText(dgm.this.S.getText().toString());
                dgm.this.ae.setSelection(dgm.this.ae.getText().length());
                dgm.this.O.setText(dgm.this.X.getString(R.string.save_bill_limit));
                dgm.this.I.setVisibility(0);
                return;
            }
            String obj = dgm.this.ae.getText().toString();
            if (dgm.c(obj)) {
                dgm.this.l.a(obj, charSequence);
                dgm.this.ae.setText("");
                dgm.this.O.setText(dgm.this.X.getString(R.string.edit_bill_limit));
                dgm.a(dgm.this.getActivity());
                return;
            }
            dgm.this.ae.setError(dgm.this.X.getString(R.string.valid_mail));
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: dgm.16
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new dgp().show(dgm.this.getChildFragmentManager(), "SELECT_LANGUAGE_BOTTOM_SHEET");
        }
    };
    View.OnClickListener s = new View.OnClickListener() { // from class: dgm.17
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String charSequence = dgm.this.Q.getText().toString();
            if (TextUtils.isEmpty(dgm.this.af.getText().toString().trim())) {
                dgm.this.Q.setVisibility(8);
                dgm.this.af.setVisibility(0);
                dgm.this.af.requestFocusFromTouch();
                dgm.this.d();
                dgm.this.af.setText(dgm.this.Q.getText().toString());
                dgm.this.af.setSelection(dgm.this.af.getText().length());
                dgm.this.T.setText(dgm.this.X.getString(R.string.save_bill_limit));
                dgm.this.U.setVisibility(0);
                return;
            }
            String obj = dgm.this.af.getText().toString();
            if (dgm.a(dgm.this, obj)) {
                dgm.this.l.b(obj, charSequence);
                dgm.this.af.setText("");
                dgm.this.T.setText(dgm.this.X.getString(R.string.edit_bill_limit));
                dgm.a(dgm.this.getActivity());
                return;
            }
            dgm.this.af.setError(dgm.this.X.getString(R.string.valid_mobile_number));
        }
    };
    private au.b<JSONObject> aI = new au.b<JSONObject>() { // from class: dgm.18
        {
            dgm.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            dgm.this.h.a();
            Gson gson = new Gson();
            if (dgm.this.am) {
                dgm.this.ag = (ProfilePostPaidResponse) gson.a(jSONObject2.toString(), (Class<Object>) ProfilePostPaidResponse.class);
                if (dgm.this.ag == null || !dgm.this.ag.header.responseCode.equals("0")) {
                    if (dgm.this.ag == null || !dgm.this.ag.header.responseCode.equals("1200")) {
                        return;
                    }
                    dgm.this.b(1);
                } else if (dgm.this.ag.body == null || dgm.this.ag.body.customerProfile == null || dgm.this.ag.body.customerProfile.customerName == null) {
                } else {
                    dgm.this.K.setText(dgm.this.ag.body.customerProfile.customerName);
                    dgm.this.S.setText(dgm.this.ag.body.customerProfile.email);
                    dgm.this.N.setText(dgm.this.ag.body.customerProfile.gender);
                    dgm.this.M.setText(dgm.this.ag.body.customerProfile.getPreferredLanguage());
                    dgm.this.R.setText(dgm.this.ag.body.customerProfile.birthday);
                    List asList = Arrays.asList(dgm.this.ag.body.customerProfile.birthday.split("-"));
                    AppCompatTextView appCompatTextView = dgm.this.R;
                    appCompatTextView.setText(((String) asList.get(2)) + "-" + ((String) asList.get(1)) + "-" + ((String) asList.get(0)));
                    if (dgm.this.e.g()) {
                        dgm.this.Q.setText(dgm.this.ag.body.customerProfile.contactNumber);
                        dgm.this.V.setText(dgm.this.X.getString(R.string.mobile_number));
                    } else {
                        dgm.this.Q.setText(dgm.this.ag.body.customerProfile.msisdn);
                        dgm.this.V.setText(dgm.this.X.getString(R.string.mobile_number));
                        dgm.this.T.setVisibility(8);
                        dgm.this.aC.setVisibility(8);
                    }
                    if (dgm.this.e.g()) {
                        dgm.this.V.setText(dgm.this.X.getString(R.string.mobile_number_fbb));
                    }
                    if (dgm.this.ag.body.customerProfile.contactAddress != null) {
                        dgm.this.L.setText(dgm.this.ag.body.customerProfile.contactAddress.get(0));
                    }
                    TextUtils.isEmpty(dgm.this.ag.body.billMedium.email);
                    TextUtils.isEmpty(dgm.this.ag.body.billMedium.msisdn);
                }
            }
        }
    };
    private au.a aJ = new au.a() { // from class: dgm.19
        {
            dgm.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgm.this.h.a();
            UnNavigateResponseActivity.a(dgm.this.X, dgm.this.X.getString(R.string.something_went_wrong), dgm.this.X.getString(R.string.please_try_again), true);
        }
    };
    View.OnClickListener t = new View.OnClickListener() { // from class: dgm.2
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgm.this.ah) {
                dgm.this.startActivityForResult(new Intent(dgm.this.getActivity(), dgk.class), 6);
                return;
            }
            dgm.this.l.c();
        }
    };
    View.OnClickListener u = new View.OnClickListener() { // from class: dgm.3
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgm.this.startActivityForResult(new Intent(dgm.this.X, DisableAutoPayConfirmationActivity.class), dgm.aj);
        }
    };
    View.OnClickListener v = new View.OnClickListener() { // from class: -$$Lambda$dgm$5Lb2_bN31vnXupybk3eLq5p7UAg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgm.lambda$5Lb2_bN31vnXupybk3eLq5p7UAg(dgm.this, view);
        }
    };
    View.OnClickListener w = new View.OnClickListener() { // from class: dgm.4
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgm.this.startActivityForResult(new Intent(dgm.this.X, ShowCreditCardConfirmationCodeActivity.class), dgm.ak);
        }
    };
    View.OnClickListener x = new View.OnClickListener() { // from class: dgm.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }

        {
            dgm.this = this;
        }
    };
    View.OnClickListener y = new View.OnClickListener() { // from class: dgm.6
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgm.this.av.booleanValue()) {
                if (dgm.this.ay.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(dgm.this.X, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", dgm.this.getString(R.string.enable_fb_login));
                intent.putExtra("confirmation_hint", dgm.this.getString(R.string.enable_fb_login_confirmation));
                dgm.this.startActivityForResult(intent, 20);
                return;
            }
            Toast.makeText(dgm.this.X, (int) R.string.link_fb_account_first, 0).show();
        }
    };
    View.OnClickListener z = new View.OnClickListener() { // from class: dgm.7
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgm.this.aw.booleanValue()) {
                if (dgm.this.az.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(dgm.this.X, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", dgm.this.getString(R.string.enable_google_login));
                intent.putExtra("confirmation_hint", dgm.this.getString(R.string.enable_google_login_disclaimer));
                dgm.this.startActivityForResult(intent, 30);
                return;
            }
            Toast.makeText(dgm.this.X, (int) R.string.link_google_account_first, 0).show();
        }
    };
    View.OnClickListener A = new View.OnClickListener() { // from class: dgm.8
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgm.this.av.booleanValue()) {
                rw.a().b();
                dgm.this.l.f();
                return;
            }
            dgm.this.j.a(dgm.this, Arrays.asList(NotificationCompat.CATEGORY_EMAIL, "public_profile"));
        }
    };
    View.OnClickListener B = new View.OnClickListener() { // from class: dgm.9
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgm.this.ax.booleanValue()) {
                dgm.this.l.g();
            } else {
                dgm.i();
            }
        }
    };
    View.OnClickListener C = new View.OnClickListener() { // from class: dgm.10
        {
            dgm.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgm.this.aw.booleanValue()) {
                dgm.this.an.b();
                dgm.this.l.e();
                return;
            }
            dgm.A(dgm.this);
        }
    };
    lw<ry> D = new lw<ry>() { // from class: dgm.11
        @Override // defpackage.lw
        public final void a(FacebookException facebookException) {
        }

        {
            dgm.this = this;
        }

        @Override // defpackage.lw
        public final /* synthetic */ void a(ry ryVar) {
            dgm.this.l.c(ryVar.a.e);
        }
    };

    static /* synthetic */ void i() {
    }

    public static /* synthetic */ void lambda$5Lb2_bN31vnXupybk3eLq5p7UAg(dgm dgmVar, View view) {
        dgmVar.a(view);
    }

    @Override // defpackage.dgo
    public final void b(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
    }

    @Override // defpackage.dgo
    public final void b(String str) {
    }

    public static dgm a() {
        return new dgm();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_post_pre_paid_my_account, viewGroup, false);
        if (this.g.v().equalsIgnoreCase("postpaid")) {
            this.am = true;
        } else {
            this.am = false;
        }
        this.K = (AppCompatTextView) inflate.findViewById(R.id.txtName);
        this.S = (AppCompatTextView) inflate.findViewById(R.id.txtEmail);
        this.M = (AppCompatTextView) inflate.findViewById(R.id.txtPreferredLanguage);
        this.P = (AppCompatTextView) inflate.findViewById(R.id.txtChangePreferredLanguage);
        this.N = (AppCompatTextView) inflate.findViewById(R.id.txtGender);
        this.af = (EditText) inflate.findViewById(R.id.edtMobileNumber);
        this.U = (AppCompatTextView) inflate.findViewById(R.id.txtCancelMobileNumber);
        this.T = (AppCompatTextView) inflate.findViewById(R.id.txtChangeMobileNumber);
        this.L = (AppCompatTextView) inflate.findViewById(R.id.txtAddress);
        this.J = (AppCompatTextView) inflate.findViewById(R.id.txtAccountID);
        this.Q = (AppCompatTextView) inflate.findViewById(R.id.txtMobileNumber);
        this.V = (AppCompatTextView) inflate.findViewById(R.id.tvServiceOrContactNumber);
        this.aD = (LinearLayout) inflate.findViewById(R.id.login_using_social_container);
        this.aE = (LinearLayout) inflate.findViewById(R.id.link_to_social_container);
        this.aF = (LinearLayout) inflate.findViewById(R.id.llSocialMediaContainer);
        this.R = (AppCompatTextView) inflate.findViewById(R.id.txtDateOfBirth);
        this.ae = (EditText) inflate.findViewById(R.id.edtMail);
        this.W = (FrameLayout) inflate.findViewById(R.id.txtChangePassword);
        this.ac = (LinearLayout) inflate.findViewById(R.id.lnCFacebookLoginPart);
        this.ad = (LinearLayout) inflate.findViewById(R.id.lnCGoogleLoginPart);
        this.ap = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkFacebook);
        this.aq = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkGoogle);
        this.ar = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkHuawei);
        this.as = (AppCompatTextView) inflate.findViewById(R.id.txtLinkToFacebook);
        this.at = (AppCompatTextView) inflate.findViewById(R.id.txtLinkToGoogle);
        this.au = (AppCompatTextView) inflate.findViewById(R.id.txtLinkToHuawei);
        this.O = (AppCompatTextView) inflate.findViewById(R.id.txtChangeMail);
        this.I = (AppCompatTextView) inflate.findViewById(R.id.txtCancel);
        this.aa = (LinearLayout) inflate.findViewById(R.id.lLHuawei);
        this.aG = inflate.findViewById(R.id.lLHuaweiView);
        this.ab = (LinearLayout) inflate.findViewById(R.id.lnGooglePart);
        this.H = (AppCompatTextView) inflate.findViewById(R.id.btn_modify_password);
        this.Y = (LinearLayout) inflate.findViewById(R.id.llDateOfBirthContainer);
        this.Z = (LinearLayout) inflate.findViewById(R.id.llAccountIdContainer);
        this.ap = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkFacebook);
        this.aq = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkGoogle);
        this.ar = (AppCompatTextView) inflate.findViewById(R.id.tvLinkOrUnlinkHuawei);
        this.aA = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingFacebook);
        this.aB = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingGoogle);
        this.aC = (ImageView) inflate.findViewById(R.id.changeMobileNumberImg);
        this.aw = Boolean.FALSE;
        this.av = Boolean.FALSE;
        this.az = Boolean.FALSE;
        this.ay = Boolean.FALSE;
        if (!this.e.h()) {
            this.a.f.isAutopaymentEnabled();
        }
        this.j = rw.a();
        this.k = lu.a.a();
        if (diw.a(requireContext())) {
            this.ao = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(getString(R.string.we_google_app_id)).b(getString(R.string.we_google_app_id)).a().c();
            this.an = tj.a((Activity) requireActivity(), this.ao);
        } else {
            this.ab.setVisibility(8);
        }
        if (!diw.b(requireContext())) {
            this.aa.setVisibility(8);
        }
        this.W.setOnClickListener(this.m);
        this.H.setOnClickListener(this.m);
        this.I.setOnClickListener(this.o);
        this.U.setOnClickListener(this.p);
        this.O.setOnClickListener(this.q);
        this.P.setOnClickListener(this.r);
        this.T.setOnClickListener(this.s);
        this.ap.setOnClickListener(this.A);
        this.aq.setOnClickListener(this.C);
        this.ar.setOnClickListener(this.B);
        this.as.setOnClickListener(this.A);
        this.at.setOnClickListener(this.C);
        this.au.setOnClickListener(this.B);
        this.j.a(this.k, this.D);
        this.ac.setOnClickListener(this.y);
        this.ad.setOnClickListener(this.z);
        if (this.e.f() && d(this.g.U())) {
            a(this.g.U(), this.g.V());
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.X = activity;
        this.l = new dgn(activity, this, this);
        try {
            this.h.a(this.X, this.X.getString(R.string.loading));
            if (!this.am) {
                djl.a(getContext()).f(this.aI, this.aJ);
            } else {
                djl.a(getContext()).e(this.aI, this.aJ);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dgo
    public final void b() {
        djg djgVar = this.h;
        Context context = this.X;
        djgVar.a(context, context.getString(R.string.loading));
        try {
            if (!this.am) {
                djl.a(getContext()).f(this.aI, this.aJ);
            } else {
                djl.a(getContext()).e(this.aI, this.aJ);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dgo
    public final void a(AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse) {
        Intent intent = new Intent(this.X, EnableAutoPayTopGActivity.class);
        intent.putExtra("hashcode", autoPaymentAddCreditCardInitializeResponse.getBody().getHashcode());
        intent.putExtra("topgManageCCTransactionId", autoPaymentAddCreditCardInitializeResponse.getBody().getTopgManageCCTransactionId());
        startActivity(intent);
    }

    @Override // defpackage.dgo
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.h;
            Context context = this.X;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.h.a();
    }

    @Override // defpackage.dgo
    public final void a(String str) {
        this.S.setVisibility(0);
        this.ae.setVisibility(8);
        this.I.setVisibility(8);
        this.S.setText(str);
    }

    @Override // defpackage.dgo
    public final void c() {
        this.Q.setVisibility(0);
        this.af.setVisibility(8);
        this.U.setVisibility(8);
    }

    @Override // defpackage.dgo
    public final void a(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
        if (checkAutoPayStatusResponse != null) {
            this.ah = checkAutoPayStatusResponse.body.a.booleanValue();
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.X, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            try {
                this.h.a(this.X, this.X.getString(R.string.loading));
                if (!this.am) {
                    djl.a(getContext()).f(this.aI, this.aJ);
                } else {
                    djl.a(getContext()).e(this.aI, this.aJ);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            j();
        } else if (i == 4) {
            this.l.h();
        } else if (i == 6) {
            String charSequence = this.Q.getText().toString();
            this.l.b(this.af.getText().toString(), charSequence);
        } else if (i != 7) {
        } else {
            int i2 = this.aH;
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
        } else if (i == aj) {
            if (i2 != -1) {
                return;
            }
            this.l.b();
        } else if (i == ak) {
            if (i2 != -1) {
                return;
            }
            this.al = intent.getStringExtra("smsCode");
            j();
        } else if (i == 10) {
            try {
                this.l.b(tj.a(intent).a(ApiException.class).c);
            } catch (ApiException e) {
                e.getMessage();
                Context context = this.X;
                UnNavigateResponseActivity.a(context, context.getString(R.string.something_went_wrong), this.X.getString(R.string.please_try_again), true);
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
        if (d(this.al)) {
            this.l.a(this.al);
        }
    }

    @Override // defpackage.dgo
    public final void a(String str, String str2) {
        this.g.z(str2);
        this.g.y(str);
        if (str2.equalsIgnoreCase("visa")) {
            getContext().getResources().getDrawable(R.drawable.ic_visa);
        } else {
            getContext().getResources().getDrawable(R.drawable.ic_master_card);
        }
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
        uc.a(this.X);
        if (this.a.f.getFeature_socialMedia() && this.g.S()) {
            this.aF.setVisibility(0);
            this.l.h();
        } else {
            this.aF.setVisibility(8);
        }
        if (!this.g.S()) {
            this.W.setVisibility(8);
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
                    this.av = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.ay = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("GOOGLE")) {
                    this.aw = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.az = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("HUAWEI")) {
                    this.ax = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                }
            }
            if (this.av.booleanValue()) {
                this.ap.setText(this.X.getString(R.string.unlink));
                this.as.setText(this.X.getString(R.string.unlink));
            } else {
                this.ap.setText(this.X.getString(R.string.link));
                this.as.setText(this.X.getString(R.string.link_to_facebook));
            }
            if (this.aw.booleanValue()) {
                this.aq.setText(this.X.getString(R.string.unlink));
                this.at.setText(this.X.getString(R.string.unlink));
            } else {
                this.aq.setText(this.X.getString(R.string.link));
                this.at.setText(this.X.getString(R.string.link_to_google));
            }
            if (this.ax.booleanValue()) {
                this.ar.setText(this.X.getString(R.string.unlink));
                this.au.setText(this.X.getString(R.string.unlink));
            } else {
                this.ar.setText(this.X.getString(R.string.link));
                this.au.setText(this.X.getString(R.string.link_to_huawei));
            }
            if (this.ay.booleanValue()) {
                this.aA.setVisibility(0);
            } else {
                this.aA.setVisibility(4);
            }
            if (this.az.booleanValue()) {
                this.aB.setVisibility(0);
            } else {
                this.aB.setVisibility(4);
            }
        }
    }

    @Override // defpackage.dgo
    public final void f() {
        this.aD.setVisibility(8);
        this.aE.setVisibility(8);
    }

    @Override // defpackage.dgp.a
    public final void a(int i) {
        this.aH = i;
        if (i == 1) {
            this.l.e(this.F);
        } else if (i != 2) {
        } else {
            this.l.e(this.E);
        }
    }

    @Override // defpackage.dgo
    public final void b(AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse) {
        Intent intent = new Intent(this.X, EnableAutoPayTopGActivity.class);
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

    static /* synthetic */ boolean a(dgm dgmVar, String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= dgmVar.getResources().getInteger(R.integer.mobile_number)) {
            return str.substring(0, 1).equalsIgnoreCase("0") || str.substring(0, 1).equalsIgnoreCase("٠");
        }
        return false;
    }

    static /* synthetic */ void A(dgm dgmVar) {
        dgmVar.startActivityForResult(dgmVar.an.a(), 10);
    }
}
