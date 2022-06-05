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
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
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
import defpackage.au;
import defpackage.dgp;
import defpackage.lu;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dgq  reason: default package */
/* loaded from: classes2.dex */
public class dgq extends dab implements dgp.a, dgs, dju {
    private static int al = 3;
    private static int am = 4;
    private static int an = 5;
    private TextView H;
    private TextView I;
    private TextView J;
    private TextView K;
    private TextView L;
    private TextView M;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private TextView T;
    private TextView U;
    private FrameLayout V;
    private AppCompatTextView W;
    private Context X;
    private LinearLayout Y;
    private LinearLayout Z;
    @Inject
    dhn a;
    private Boolean aA;
    private Boolean aB;
    private Boolean aC;
    private ImageView aD;
    private ImageView aE;
    private LinearLayout aF;
    private LinearLayout aG;
    private LinearLayout aH;
    private int aI;
    private int aJ;
    private String aK;
    private int aL;
    private View aM;
    private AppCompatImageView aN;
    private LinearLayout aa;
    private LinearLayout ab;
    private LinearLayout ac;
    private LinearLayout ad;
    private EditText ae;
    private EditText af;
    private ProfilePostPaidResponse ag;
    private CustomerProfile ah;
    private PrePaidProfileResponse ai;
    private boolean aj;
    private String ao;
    private tl aq;
    private GoogleSignInOptions ar;
    private TextView as;
    private TextView at;
    private TextView au;
    private TextView av;
    private TextView aw;
    private TextView ax;
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
    dgr l;
    private String E = "Arabic";
    private String F = "English";
    private final int G = 1;
    private boolean ak = false;
    private boolean ap = true;
    View.OnClickListener m = new View.OnClickListener() { // from class: dgq.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgq.this.startActivity(new Intent(dgq.this.X, ModifyPasswordActivity.class));
        }
    };
    View.OnClickListener n = new View.OnClickListener() { // from class: dgq.12
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(dgq.this.X, dgl.class);
            intent.putExtra("Dial", dgq.this.ah.msisdn);
            intent.putExtra("Mail", dgq.this.ah.email);
            dgq.this.startActivity(intent);
        }
    };
    View.OnClickListener o = new View.OnClickListener() { // from class: dgq.14
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgq.a(dgq.this.getActivity());
            dgq.this.ae.setText("");
            dgq.this.N.setText(dgq.this.X.getString(R.string.edit_bill_limit));
            dgq.this.R.setText(dgq.this.ah.email);
            dgq.this.H.setVisibility(8);
            dgq.this.R.setVisibility(0);
            dgq.this.ae.setVisibility(8);
        }
    };
    View.OnClickListener p = new View.OnClickListener() { // from class: dgq.15
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgq.a(dgq.this.getActivity());
            dgq.this.af.setText("");
            dgq.this.S.setText(dgq.this.X.getString(R.string.edit_bill_limit));
            dgq.this.P.setText(dgq.this.ah.contactNumber);
            dgq.this.T.setVisibility(8);
            dgq.this.P.setVisibility(0);
            dgq.this.af.setVisibility(8);
        }
    };
    View.OnClickListener q = new View.OnClickListener() { // from class: dgq.16
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String charSequence = dgq.this.R.getText().toString();
            if (TextUtils.isEmpty(dgq.this.ae.getText().toString().trim())) {
                dgq.this.R.setVisibility(8);
                dgq.this.ae.setVisibility(0);
                dgq.this.ae.requestFocusFromTouch();
                dgq.this.c();
                dgq.this.ae.setText(dgq.this.R.getText().toString());
                dgq.this.ae.setSelection(dgq.this.ae.getText().length());
                dgq.this.N.setText(dgq.this.X.getString(R.string.save_bill_limit));
                dgq.this.H.setVisibility(0);
                return;
            }
            String obj = dgq.this.ae.getText().toString();
            if (dgq.d(obj)) {
                dgq.this.l.a(obj, charSequence);
                dgq.this.ae.setText("");
                dgq.this.N.setText(dgq.this.X.getString(R.string.edit_bill_limit));
                dgq.a(dgq.this.getActivity());
                return;
            }
            dgq.this.ae.setError(dgq.this.X.getString(R.string.valid_mail));
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: dgq.17
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new dgp().show(dgq.this.getChildFragmentManager(), "SELECT_LANGUAGE_BOTTOM_SHEET");
        }
    };
    View.OnClickListener s = new View.OnClickListener() { // from class: dgq.18
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String charSequence = dgq.this.P.getText().toString();
            if (TextUtils.isEmpty(dgq.this.af.getText().toString().trim())) {
                dgq.this.P.setVisibility(8);
                dgq.this.af.setVisibility(0);
                dgq.this.af.requestFocusFromTouch();
                dgq.this.c();
                dgq.this.af.setText(dgq.this.P.getText().toString());
                dgq.this.af.setSelection(dgq.this.af.getText().length());
                dgq.this.S.setText(dgq.this.X.getString(R.string.save_bill_limit));
                dgq.this.T.setVisibility(0);
                return;
            }
            String obj = dgq.this.af.getText().toString();
            if (dgq.a(dgq.this, obj)) {
                dgq.this.l.b(obj, charSequence);
                dgq.this.af.setText("");
                dgq.this.S.setText(dgq.this.X.getString(R.string.edit_bill_limit));
                dgq.a(dgq.this.getActivity());
                return;
            }
            dgq.this.af.setError(dgq.this.X.getString(R.string.valid_mobile_number));
        }
    };
    private au.b<JSONObject> aO = new au.b<JSONObject>() { // from class: dgq.19
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            dgq.this.h.a();
            Gson gson = new Gson();
            if (!dgq.this.ap) {
                dgq.this.ai = (PrePaidProfileResponse) gson.a(jSONObject2.toString(), (Class<Object>) PrePaidProfileResponse.class);
                dgq dgqVar = dgq.this;
                dgqVar.ah = dgqVar.ai.body;
                if (dgq.this.ai == null || !dgq.this.ai.header.responseCode.equals("0")) {
                    if (dgq.this.ag == null || !dgq.this.ag.header.responseCode.equals("1200")) {
                        return;
                    }
                    dgq.this.b(1);
                } else if (dgq.this.ah == null) {
                } else {
                    dgq.this.J.setText(dgq.this.ah.customerName);
                    String str = "";
                    dgq.this.R.setText(dgq.this.ah.email != null ? dgq.this.ah.email : str);
                    dgq.this.M.setText(dgq.this.ah.gender);
                    dgq.this.L.setText(dgq.this.ah.getPreferredLanguage());
                    dgq.this.Q.setText(dgq.this.ah.birthday);
                    List asList = Arrays.asList(dgq.this.ah.birthday.split("-"));
                    TextView textView = dgq.this.Q;
                    textView.setText(((String) asList.get(2)) + "-" + ((String) asList.get(1)) + "-" + ((String) asList.get(0)));
                    if (dgq.this.e.g()) {
                        TextView textView2 = dgq.this.P;
                        if (dgq.this.ah.contactNumber != null) {
                            str = dgq.this.ah.contactNumber;
                        }
                        textView2.setText(str);
                        dgq.this.U.setText(dgq.this.X.getString(R.string.mobile_number));
                    } else {
                        dgq.this.P.setText(dgq.this.ah.msisdn);
                        dgq.this.U.setText(dgq.this.X.getString(R.string.mobile_number));
                        dgq.this.S.setVisibility(8);
                        dgq.this.aN.setVisibility(8);
                    }
                    if (dgq.this.e.g()) {
                        dgq.this.U.setText(dgq.this.X.getString(R.string.mobile_number_fbb));
                    }
                    if (dgq.this.ah.contactAddress == null) {
                        return;
                    }
                    dgq.this.K.setText(dgq.this.ah.contactAddress.get(0));
                }
            }
        }
    };
    private au.a aP = new au.a() { // from class: dgq.20
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgq.this.h.a();
        }
    };
    View.OnClickListener t = new View.OnClickListener() { // from class: dgq.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgq.this.aj) {
                dgq.this.startActivityForResult(new Intent(dgq.this.getActivity(), dgk.class), 6);
            }
        }
    };
    View.OnClickListener u = new View.OnClickListener() { // from class: dgq.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgq.this.startActivityForResult(new Intent(dgq.this.X, DisableAutoPayConfirmationActivity.class), dgq.al);
        }
    };
    View.OnClickListener v = new View.OnClickListener() { // from class: dgq.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgq.this.startActivityForResult(new Intent(dgq.this.X, ShowCreditCardConfirmationCodeActivity.class), dgq.am);
        }
    };
    View.OnClickListener w = new View.OnClickListener() { // from class: dgq.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgq.this.l.c();
        }
    };
    View.OnClickListener x = new View.OnClickListener() { // from class: dgq.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgq.this.l.a();
            dgq.this.h.a(dgq.this.X, dgq.this.X.getString(R.string.loading));
        }
    };
    View.OnClickListener y = new View.OnClickListener() { // from class: dgq.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgq.this.ay.booleanValue()) {
                if (dgq.this.aB.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(dgq.this.X, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", dgq.this.getString(R.string.enable_fb_login));
                intent.putExtra("confirmation_hint", dgq.this.getString(R.string.enable_fb_login_confirmation));
                dgq.this.startActivityForResult(intent, 20);
                return;
            }
            Toast.makeText(dgq.this.X, (int) R.string.link_fb_account_first, 0).show();
        }
    };
    View.OnClickListener z = new View.OnClickListener() { // from class: dgq.8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgq.this.az.booleanValue()) {
                if (dgq.this.aC.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(dgq.this.X, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", dgq.this.getString(R.string.enable_google_login));
                intent.putExtra("confirmation_hint", dgq.this.getString(R.string.enable_google_login_disclaimer));
                dgq.this.startActivityForResult(intent, 30);
                return;
            }
            Toast.makeText(dgq.this.X, (int) R.string.link_google_account_first, 0).show();
        }
    };
    View.OnClickListener A = new View.OnClickListener() { // from class: dgq.9
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgq.this.ay.booleanValue()) {
                rw.a().b();
                dgq.this.l.i();
                return;
            }
            dgq.this.j.a(dgq.this, Arrays.asList(NotificationCompat.CATEGORY_EMAIL, "public_profile"));
        }
    };
    View.OnClickListener B = new View.OnClickListener() { // from class: dgq.10
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgq.this.aA.booleanValue()) {
                dgq.this.l.h();
            } else {
                dgq.h();
            }
        }
    };
    View.OnClickListener C = new View.OnClickListener() { // from class: dgq.11
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgq.this.az.booleanValue()) {
                dgq.this.aq.b();
                dgq.this.l.g();
                return;
            }
            dgq.C(dgq.this);
        }
    };
    lw<ry> D = new lw<ry>() { // from class: dgq.13
        @Override // defpackage.lw
        public final void a(FacebookException facebookException) {
        }

        @Override // defpackage.lw
        public final /* synthetic */ void a(ry ryVar) {
            dgq.this.l.c(ryVar.a.e);
        }
    };

    static /* synthetic */ void h() {
    }

    @Override // defpackage.dgs
    public final void a(int i, int i2) {
    }

    @Override // defpackage.dgs
    public final void a(AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse) {
    }

    @Override // defpackage.dgs
    public final void b(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
    }

    @Override // defpackage.dgs
    public final void c(String str) {
    }

    @Override // defpackage.dgs
    public final void d() {
    }

    public static dgq a() {
        return new dgq();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_post_pre_paid_my_account, viewGroup, false);
        if (this.g.v().equalsIgnoreCase("postpaid")) {
            this.ap = true;
        } else {
            this.ap = false;
        }
        this.J = (TextView) inflate.findViewById(R.id.txtName);
        this.R = (TextView) inflate.findViewById(R.id.txtEmail);
        this.L = (TextView) inflate.findViewById(R.id.txtPreferredLanguage);
        this.O = (TextView) inflate.findViewById(R.id.txtChangePreferredLanguage);
        this.M = (TextView) inflate.findViewById(R.id.txtGender);
        this.af = (EditText) inflate.findViewById(R.id.edtMobileNumber);
        this.T = (TextView) inflate.findViewById(R.id.txtCancelMobileNumber);
        this.S = (TextView) inflate.findViewById(R.id.txtChangeMobileNumber);
        this.K = (TextView) inflate.findViewById(R.id.txtAddress);
        this.I = (TextView) inflate.findViewById(R.id.txtAccountID);
        this.P = (TextView) inflate.findViewById(R.id.txtMobileNumber);
        this.U = (TextView) inflate.findViewById(R.id.tvServiceOrContactNumber);
        this.aF = (LinearLayout) inflate.findViewById(R.id.login_using_social_container);
        this.aG = (LinearLayout) inflate.findViewById(R.id.link_to_social_container);
        this.aH = (LinearLayout) inflate.findViewById(R.id.llSocialMediaContainer);
        this.Q = (TextView) inflate.findViewById(R.id.txtDateOfBirth);
        this.ae = (EditText) inflate.findViewById(R.id.edtMail);
        this.V = (FrameLayout) inflate.findViewById(R.id.txtChangePassword);
        this.W = (AppCompatTextView) inflate.findViewById(R.id.btn_modify_password);
        this.ac = (LinearLayout) inflate.findViewById(R.id.lnCFacebookLoginPart);
        this.ad = (LinearLayout) inflate.findViewById(R.id.lnCGoogleLoginPart);
        this.as = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkFacebook);
        this.at = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkGoogle);
        this.au = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkHuawei);
        this.av = (TextView) inflate.findViewById(R.id.txtLinkToFacebook);
        this.aw = (TextView) inflate.findViewById(R.id.txtLinkToGoogle);
        this.ax = (TextView) inflate.findViewById(R.id.txtLinkToHuawei);
        this.N = (TextView) inflate.findViewById(R.id.txtChangeMail);
        this.H = (TextView) inflate.findViewById(R.id.txtCancel);
        this.Y = (LinearLayout) inflate.findViewById(R.id.llDateOfBirthContainer);
        this.Z = (LinearLayout) inflate.findViewById(R.id.llAccountIdContainer);
        this.aa = (LinearLayout) inflate.findViewById(R.id.lLHuawei);
        this.aM = inflate.findViewById(R.id.lLHuaweiView);
        this.ab = (LinearLayout) inflate.findViewById(R.id.lnGooglePart);
        this.as = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkFacebook);
        this.at = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkGoogle);
        this.au = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkHuawei);
        this.aD = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingFacebook);
        this.aE = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingGoogle);
        this.aN = (AppCompatImageView) inflate.findViewById(R.id.changeMobileNumberImg);
        this.az = Boolean.FALSE;
        this.ay = Boolean.FALSE;
        this.aA = Boolean.FALSE;
        this.aC = Boolean.FALSE;
        this.aB = Boolean.FALSE;
        this.a.f.isFeatureAutorecharge();
        this.j = rw.a();
        this.k = lu.a.a();
        if (diw.a(requireContext())) {
            this.ar = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(getString(R.string.we_google_app_id)).b(getString(R.string.we_google_app_id)).a().c();
            this.aq = tj.a((Activity) requireActivity(), this.ar);
        } else {
            this.ab.setVisibility(8);
        }
        if (!diw.b(requireContext())) {
            this.aa.setVisibility(8);
        }
        this.V.setOnClickListener(this.m);
        this.W.setOnClickListener(this.m);
        this.H.setOnClickListener(this.o);
        this.T.setOnClickListener(this.p);
        this.N.setOnClickListener(this.q);
        this.O.setOnClickListener(this.r);
        this.S.setOnClickListener(this.s);
        this.as.setOnClickListener(this.A);
        this.at.setOnClickListener(this.C);
        this.au.setOnClickListener(this.B);
        this.av.setOnClickListener(this.A);
        this.aw.setOnClickListener(this.C);
        this.ax.setOnClickListener(this.B);
        this.j.a(this.k, this.D);
        this.ac.setOnClickListener(this.y);
        this.ad.setOnClickListener(this.z);
        if (e(this.g.U())) {
            a(this.g.U(), this.g.V());
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.X = activity;
        dgr dgrVar = new dgr(activity, this, this);
        this.l = dgrVar;
        dgrVar.e();
        try {
            this.h.a(this.X, this.X.getString(R.string.loading));
            djl.a(getContext()).f(this.aO, this.aP);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dgs
    public final void b() {
        djg djgVar = this.h;
        Context context = this.X;
        djgVar.a(context, context.getString(R.string.loading));
        try {
            djl.a(getContext()).f(this.aO, this.aP);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dgs
    public final void b(AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse) {
        Intent intent = new Intent(this.X, EnableAutoPayTopGActivity.class);
        intent.putExtra("hashcode", autoPaymentAddCreditCardInitializeResponse.getBody().getHashcode());
        intent.putExtra("topgManageCCTransactionId", autoPaymentAddCreditCardInitializeResponse.getBody().getTopgManageCCTransactionId());
        intent.putExtra(EnableAutoPayTopGActivity.b, this.aI);
        intent.putExtra(EnableAutoPayTopGActivity.a, this.aJ);
        intent.putExtra(EnableAutoPayTopGActivity.c, "update");
        startActivity(intent);
    }

    @Override // defpackage.dgs
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.h;
            Context context = this.X;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.h.a();
    }

    @Override // defpackage.dgs
    public final void a(String str) {
        this.R.setVisibility(0);
        this.ae.setVisibility(8);
        this.H.setVisibility(8);
        this.R.setText(str);
    }

    @Override // defpackage.dgs
    public final void b(String str) {
        this.P.setVisibility(0);
        this.af.setVisibility(8);
        this.T.setVisibility(8);
        this.P.setText(str);
    }

    @Override // defpackage.dgs
    public final void a(CheckAutoPayStatusResponse checkAutoPayStatusResponse) {
        if (checkAutoPayStatusResponse != null) {
            this.aj = checkAutoPayStatusResponse.body.a.booleanValue();
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
                djl.a(getContext()).f(this.aO, this.aP);
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
            String charSequence = this.P.getText().toString();
            this.l.b(this.af.getText().toString(), charSequence);
        } else if (i == 7) {
            int i2 = this.aL;
            if (i2 == 1) {
                this.l.e(this.F);
            } else if (i2 != 2) {
            } else {
                this.l.e(this.E);
            }
        } else if (i == 8) {
            this.l.e();
        } else if (i == 9) {
            this.l.a(this.aJ, this.aI);
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
        } else if (i == al) {
            if (i2 != -1) {
                return;
            }
            this.l.f();
        } else if (i == am) {
            if (i2 != -1) {
                return;
            }
            this.ao = intent.getStringExtra("smsCode");
            i();
        } else if (i == an) {
            if (i2 != -1) {
                return;
            }
            this.aK = "";
            this.aK = intent.getStringExtra("smsCode");
            String stringExtra = intent.getStringExtra(ShowCreditCardConfirmationCodeActivity.d);
            String stringExtra2 = intent.getStringExtra(ShowCreditCardConfirmationCodeActivity.c);
            AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = new AutoPaymentAddCreditCardInitializeResponse();
            AutoPaymentAddCreditCardInitializeResponseBody autoPaymentAddCreditCardInitializeResponseBody = new AutoPaymentAddCreditCardInitializeResponseBody();
            autoPaymentAddCreditCardInitializeResponseBody.setHashcode(stringExtra);
            autoPaymentAddCreditCardInitializeResponseBody.setTopgManageCCTransactionId(stringExtra2);
            autoPaymentAddCreditCardInitializeResponse.setBody(autoPaymentAddCreditCardInitializeResponseBody);
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
        if (e(this.ao)) {
            this.l.a(this.ao);
        }
    }

    @Override // defpackage.dgs
    public final void a(String str, String str2) {
        this.g.z(str2);
        this.g.y(str);
        if (str2.equalsIgnoreCase("visa")) {
            getContext().getResources().getDrawable(R.drawable.ic_visa);
        } else {
            getContext().getResources().getDrawable(R.drawable.ic_master_card);
        }
    }

    private static boolean e(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        uc.a(this.X);
        if (this.a.f.isAutopaymentEnabled()) {
            this.l.a();
            this.l.b();
        }
        if (this.a.f.getFeature_socialMedia() && this.g.S()) {
            this.aH.setVisibility(0);
            this.l.j();
        } else {
            this.aH.setVisibility(8);
        }
        if (!this.g.S()) {
            this.V.setVisibility(8);
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
                    this.ay = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.aB = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("GOOGLE")) {
                    this.az = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.aC = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("HUAWEI")) {
                    this.aA = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                }
            }
            if (this.ay.booleanValue()) {
                this.as.setText(this.X.getString(R.string.unlink));
                this.av.setText(this.X.getString(R.string.unlink));
            } else {
                this.as.setText(this.X.getString(R.string.link));
                this.av.setText(this.X.getString(R.string.link_to_facebook));
            }
            if (this.az.booleanValue()) {
                this.at.setText(this.X.getString(R.string.unlink));
                this.aw.setText(this.X.getString(R.string.unlink));
            } else {
                this.at.setText(this.X.getString(R.string.link));
                this.aw.setText(this.X.getString(R.string.link_to_google));
            }
            if (this.aA.booleanValue()) {
                this.au.setText(this.X.getString(R.string.unlink));
                this.ax.setText(this.X.getString(R.string.unlink));
            } else {
                this.au.setText(this.X.getString(R.string.link));
                this.ax.setText(this.X.getString(R.string.link_to_huawei));
            }
            if (this.aB.booleanValue()) {
                this.aD.setVisibility(0);
            } else {
                this.aD.setVisibility(4);
            }
            if (this.aC.booleanValue()) {
                this.aE.setVisibility(0);
            } else {
                this.aE.setVisibility(4);
            }
        }
    }

    @Override // defpackage.dgs
    public final void e() {
        this.aF.setVisibility(8);
        this.aG.setVisibility(8);
    }

    @Override // defpackage.dgp.a
    public final void a(int i) {
        this.aL = i;
        if (i == 1) {
            this.l.e(this.F);
        } else if (i != 2) {
        } else {
            this.l.e(this.E);
        }
    }

    static /* synthetic */ boolean d(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    static /* synthetic */ boolean a(dgq dgqVar, String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= dgqVar.getResources().getInteger(R.integer.mobile_number)) {
            return str.substring(0, 1).equalsIgnoreCase("0") || str.substring(0, 1).equalsIgnoreCase("٠");
        }
        return false;
    }

    static /* synthetic */ void C(dgq dgqVar) {
        dgqVar.startActivityForResult(dgqVar.aq.a(), 10);
    }
}
