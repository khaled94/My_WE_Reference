package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.ucare.we.R;
import defpackage.lu;
import java.util.Arrays;
import javax.inject.Inject;

/* renamed from: ddk */
/* loaded from: classes2.dex */
public final class ddk extends dab implements ddm {
    @Inject
    djg a;
    @Inject
    dhn b;
    public rw d;
    public lu e;
    private tl j;
    private GoogleSignInOptions k;
    private Context l;
    private TextView m;
    private ImageView n;
    private Button o;
    private Button p;
    private cwi q;
    private ConstraintLayout r;
    private LinearLayout s;
    private LinearLayout t;
    private LinearLayout u;
    private LinearLayout v;
    private ddl w;
    int c = -1;
    private boolean x = false;
    private int y = 6;
    View.OnClickListener f = new View.OnClickListener() { // from class: ddk.3
        {
            ddk.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddk.this.d.a(ddk.this, Arrays.asList(NotificationCompat.CATEGORY_EMAIL, "public_profile"));
        }
    };
    View.OnClickListener g = new View.OnClickListener() { // from class: -$$Lambda$ddk$fEgWNL892kt26wKInFNoa8njfp0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddk.lambda$fEgWNL892kt26wKInFNoa8njfp0(ddk.this, view);
        }
    };
    View.OnClickListener h = new View.OnClickListener() { // from class: -$$Lambda$ddk$RJ8N1qDEETkZenZ8NhXY9EJC_uE
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddk.lambda$RJ8N1qDEETkZenZ8NhXY9EJC_uE(ddk.this, view);
        }
    };
    lw<ry> i = new lw<ry>() { // from class: ddk.4
        @Override // defpackage.lw
        public final void a(FacebookException facebookException) {
        }

        {
            ddk.this = this;
        }

        @Override // defpackage.lw
        public final /* synthetic */ void a(ry ryVar) {
            ddk.this.w.a("FACEBOOK", ryVar.a.e);
        }
    };

    public /* synthetic */ void a(View view) {
    }

    public static /* synthetic */ void lambda$RJ8N1qDEETkZenZ8NhXY9EJC_uE(ddk ddkVar, View view) {
        ddkVar.a(view);
    }

    public static /* synthetic */ void lambda$fEgWNL892kt26wKInFNoa8njfp0(ddk ddkVar, View view) {
        ddkVar.b(view);
    }

    @Override // defpackage.ddm
    public final Fragment a() {
        return this;
    }

    public ddk(cwi cwiVar) {
        this.q = cwiVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fourth_registration_new, viewGroup, false);
        inflate.findViewById(R.id.tv_account);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.btnLinkToFacebook);
        this.u = linearLayout;
        linearLayout.setOnClickListener(this.f);
        this.v = (LinearLayout) inflate.findViewById(R.id.btnLinkToGoogle);
        this.t = (LinearLayout) inflate.findViewById(R.id.btnLinkToHuawei);
        this.m = (TextView) inflate.findViewById(R.id.tvOr);
        this.p = (Button) inflate.findViewById(R.id.btnLinkToSocialMedia);
        this.v.setOnClickListener(this.g);
        this.t.setOnClickListener(this.h);
        this.r = (ConstraintLayout) inflate.findViewById(R.id.llRegistrationSuccessFirstPart);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.llRegistrationSuccessSecondPart);
        this.s = linearLayout2;
        linearLayout2.setVisibility(8);
        this.c = getActivity().getIntent().getIntExtra("mode", 0);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_success_message);
        if (this.c == 1) {
            this.n = (ImageView) inflate.findViewById(R.id.iv_result);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setText(Html.fromHtml(getString(R.string.congratulation), 63));
            } else {
                textView.setText(Html.fromHtml(getString(R.string.congratulation)));
            }
        } else {
            textView.setText(getString(R.string.accountCreated));
        }
        if (diw.b(getContext())) {
            this.t.setVisibility(0);
        } else {
            this.t.setVisibility(8);
        }
        if (this.x && !this.b.f.getFeature_socialMedia()) {
            this.p.setVisibility(8);
            this.m.setVisibility(8);
        }
        Button button = (Button) inflate.findViewById(R.id.btn_start);
        this.o = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: ddk.1
            {
                ddk.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddk.this.q.b(3, 0, "");
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: ddk.2
            {
                ddk.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddk.this.r.setVisibility(8);
                ddk.this.m.setVisibility(8);
                ddk.this.p.setVisibility(8);
                ddk.this.s.setVisibility(0);
            }
        });
        this.d = rw.a();
        this.e = lu.a.a();
        if (diw.a(requireContext())) {
            this.k = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(getString(R.string.we_google_app_id)).b(getString(R.string.we_google_app_id)).a().c();
            this.j = tj.a((Activity) requireActivity(), this.k);
        }
        diw.b(requireContext());
        this.d.a(this.e, this.i);
        return inflate;
    }

    @Override // defpackage.ddm
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.a;
            Context context = this.l;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.l = getActivity();
        this.a = new djg();
        this.b = new dhn();
        this.w = new ddl(this.l, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.e.a(i, i2, intent);
        if (i == 10) {
            try {
                this.w.a("GOOGLE", tj.a(intent).a(ApiException.class).c);
            } catch (ApiException unused) {
                Context context = this.l;
                Toast.makeText(context, context.getString(R.string.please_try_again), 0).show();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        uc.a(this.l);
    }

    @Override // defpackage.ddm
    public final int b() {
        return this.y;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.x = z;
    }

    public /* synthetic */ void b(View view) {
        startActivityForResult(this.j.a(), 10);
    }
}
