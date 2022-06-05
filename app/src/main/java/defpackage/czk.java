package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.ModifyPasswordActivity;
import com.ucare.we.R;
import com.ucare.we.genericconfirmationscreen.GenericConfirmationActivity;
import com.ucare.we.model.ProfileInfoResponseBody;
import com.ucare.we.model.SocialMediaModel.SocialMediaStatusResponse;
import defpackage.lu;
import java.util.Arrays;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: czk  reason: default package */
/* loaded from: classes2.dex */
public class czk extends dab implements View.OnClickListener, czm, dhk, die {
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private Boolean G;
    private Boolean H;
    private Boolean I;
    private Boolean J;
    private ImageView K;
    private ImageView L;
    private czl M;
    TextView a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    @Inject
    dil f;
    @Inject
    dja g;
    @Inject
    djg h;
    @Inject
    djx i;
    @Inject
    dio j;
    @Inject
    djx k;
    FrameLayout l;
    Button m;
    View n;
    private Context t;
    private LinearLayout u;
    private LinearLayout v;
    private rw w;
    private lu x;
    private tl y;
    private GoogleSignInOptions z;
    View.OnClickListener o = new View.OnClickListener() { // from class: czk.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (czk.this.H.booleanValue()) {
                if (czk.this.J.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(czk.this.t, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", "Enable Google login");
                intent.putExtra("confirmation_hint", "Are you sure you want to enable Google login?");
                czk.this.startActivityForResult(intent, 30);
                return;
            }
            Toast.makeText(czk.this.t, "Please link Google account first", 0).show();
        }
    };
    View.OnClickListener p = new View.OnClickListener() { // from class: czk.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (czk.this.G.booleanValue()) {
                if (czk.this.I.booleanValue()) {
                    return;
                }
                Intent intent = new Intent(czk.this.t, GenericConfirmationActivity.class);
                intent.putExtra("confirmation_title", "Enable Facebook login");
                intent.putExtra("confirmation_hint", "Are you sure you want to enable Facebook login?");
                czk.this.startActivityForResult(intent, 20);
                return;
            }
            Toast.makeText(czk.this.t, "Please link Facebook account first", 0).show();
        }
    };
    lw<ry> q = new lw<ry>() { // from class: czk.3
        @Override // defpackage.lw
        public final void a(FacebookException facebookException) {
        }

        @Override // defpackage.lw
        public final /* synthetic */ void a(ry ryVar) {
            lk lkVar = ryVar.a;
            czl czlVar = czk.this.M;
            String str = lkVar.e;
            try {
                czlVar.b.b(true);
                djl.a(czlVar.a).a(str, "FACEBOOK", false, czlVar.f, czlVar.c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: czk.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (czk.this.G.booleanValue()) {
                czl czlVar = czk.this.M;
                try {
                    czlVar.b.b(true);
                    djl.a(czlVar.a).l("FACEBOOK", czlVar.f, czlVar.c);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            czk.this.w.a(czk.this, Arrays.asList(NotificationCompat.CATEGORY_EMAIL, "public_profile"));
        }
    };
    View.OnClickListener s = new View.OnClickListener() { // from class: czk.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (czk.this.H.booleanValue()) {
                czl czlVar = czk.this.M;
                try {
                    czlVar.b.b(true);
                    djl.a(czlVar.a).l("GOOGLE", czlVar.f, czlVar.c);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            czk.h(czk.this);
        }
    };
    private String N = czk.class.getSimpleName();

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_account, viewGroup, false);
        this.a = (TextView) inflate.findViewById(R.id.tv_customer_name);
        this.e = (TextView) inflate.findViewById(R.id.tv_customer_address);
        this.b = (TextView) inflate.findViewById(R.id.tv_customer_number);
        this.c = (TextView) inflate.findViewById(R.id.tv_customer_national_id);
        this.d = (TextView) inflate.findViewById(R.id.tv_customer_email);
        this.n = inflate.findViewById(R.id.my_account_progress);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.fl_modify_password);
        this.l = frameLayout;
        frameLayout.setOnClickListener(this);
        Button button = (Button) inflate.findViewById(R.id.btn_modify_password);
        this.m = button;
        button.setOnClickListener(this);
        this.f.a();
        this.u = (LinearLayout) inflate.findViewById(R.id.lnCFacebookLoginPart);
        this.v = (LinearLayout) inflate.findViewById(R.id.lnCGoogleLoginPart);
        this.A = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkFacebook);
        this.B = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkGoogle);
        this.C = (TextView) inflate.findViewById(R.id.tvLinkOrUnlinkHuawei);
        this.D = (TextView) inflate.findViewById(R.id.txtLinkToFacebook);
        this.E = (TextView) inflate.findViewById(R.id.txtLinkToGoogle);
        this.F = (TextView) inflate.findViewById(R.id.txtLinkToHuawei);
        this.K = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingFacebook);
        this.L = (ImageView) inflate.findViewById(R.id.tvEnableSignUsingGoogle);
        this.H = Boolean.FALSE;
        this.G = Boolean.FALSE;
        this.J = Boolean.FALSE;
        this.I = Boolean.FALSE;
        this.w = rw.a();
        this.x = lu.a.a();
        this.z = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(getString(R.string.we_google_app_id)).b(getString(R.string.we_google_app_id)).a().c();
        this.y = tj.a((Activity) getActivity(), this.z);
        this.A.setOnClickListener(this.r);
        this.B.setOnClickListener(this.s);
        this.w.a(this.x, this.q);
        this.u.setOnClickListener(this.p);
        this.v.setOnClickListener(this.o);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.t = getActivity();
        djg djgVar = new djg();
        this.h = djgVar;
        Context context = this.t;
        djgVar.a(context, context.getString(R.string.loading));
        czl czlVar = new czl(this.t, this);
        this.M = czlVar;
        czlVar.a();
    }

    @Override // defpackage.die
    public final void a(ProfileInfoResponseBody profileInfoResponseBody) {
        b(false);
        this.b.setText("");
        this.c.setText("");
        this.a.setText("");
        this.d.setText("");
        this.e.setText("");
        this.b.setText(profileInfoResponseBody.getMsisdn());
        this.c.setText(profileInfoResponseBody.getNationalId());
        this.a.setText(profileInfoResponseBody.getCustomerName());
        this.d.setText(profileInfoResponseBody.getEmail());
        if (profileInfoResponseBody.getContactAddress() != null) {
            this.e.setText(profileInfoResponseBody.getContactAddress().get(0));
        }
    }

    @Override // defpackage.die
    public final void e(int i, String str) {
        b(false);
        this.k.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f.b(this);
        this.j.b(this);
        super.onDestroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_modify_password || id == R.id.fl_modify_password) {
            this.i.b(getActivity(), ModifyPasswordActivity.class);
        }
    }

    @Override // defpackage.czm
    public final void b(boolean z) {
        if (z) {
            djg djgVar = this.h;
            Context context = this.t;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.h.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f.b(this);
        this.j.b(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.f.a(this);
        this.j.a(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        uc.a(this.t);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.x.a(i, i2, intent);
        if (i != 10) {
            if (i == 20) {
                if (i2 != -1) {
                    return;
                }
                this.M.a("FACEBOOK");
                return;
            } else if (i != 30 || i2 != -1) {
                return;
            } else {
                this.M.a("GOOGLE");
                return;
            }
        }
        try {
            String str = tj.a(intent).a(ApiException.class).c;
            czl czlVar = this.M;
            try {
                czlVar.b.b(true);
                djl.a(czlVar.a).a(str, "GOOGLE", false, czlVar.f, czlVar.c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (ApiException unused) {
            Context context = this.t;
            Toast.makeText(context, context.getString(R.string.please_try_again), 0).show();
        }
    }

    @Override // defpackage.czm
    public final void a(SocialMediaStatusResponse socialMediaStatusResponse) {
        if (socialMediaStatusResponse != null) {
            for (int i = 0; i < socialMediaStatusResponse.getProviderStatusObjects().size(); i++) {
                if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("FACEBOOK")) {
                    this.G = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.I = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                } else if (socialMediaStatusResponse.getProviderStatusObjects().get(i).getProviderName().equalsIgnoreCase("GOOGLE")) {
                    this.H = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLinked());
                    this.J = Boolean.valueOf(socialMediaStatusResponse.getProviderStatusObjects().get(i).isLoginEnabled());
                }
            }
            if (this.G.booleanValue()) {
                this.A.setText(this.t.getString(R.string.unlink));
                this.D.setText(this.t.getString(R.string.unlink_to_facebook));
            } else {
                this.A.setText(this.t.getString(R.string.link));
                this.D.setText(this.t.getString(R.string.link_to_facebook));
            }
            if (this.H.booleanValue()) {
                this.B.setText(this.t.getString(R.string.unlink));
                this.E.setText(this.t.getString(R.string.unlink_to_google));
            } else {
                this.B.setText(this.t.getString(R.string.link));
                this.E.setText(this.t.getString(R.string.link_to_google));
            }
            if (this.I.booleanValue()) {
                this.K.setVisibility(0);
            } else {
                this.K.setVisibility(4);
            }
            if (this.J.booleanValue()) {
                this.L.setVisibility(0);
            } else {
                this.L.setVisibility(4);
            }
        }
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        this.f.a();
    }

    static /* synthetic */ void h(czk czkVar) {
        czkVar.startActivityForResult(czkVar.y.a(), 10);
    }
}
