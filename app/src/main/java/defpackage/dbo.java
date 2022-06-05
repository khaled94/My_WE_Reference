package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.ucare.we.R;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.auth.signup.SignUpActivity;
import javax.inject.Inject;

/* renamed from: dbo  reason: default package */
/* loaded from: classes2.dex */
public class dbo extends dab {
    Button a;
    Button b;
    @Inject
    djx c;
    View.OnClickListener d = new View.OnClickListener() { // from class: dbo.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbo.this.c.b(dbo.this.getActivity(), SignInActivity.class);
        }
    };
    View.OnClickListener e = new View.OnClickListener() { // from class: dbo.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dbo.this.c.b(dbo.this.getActivity(), SignUpActivity.class);
        }
    };

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.anonymous_user_fragment, viewGroup, false);
        this.a = (Button) inflate.findViewById(R.id.btn_sign_in);
        this.b = (Button) inflate.findViewById(R.id.btn_signup);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a.setOnClickListener(this.d);
        this.b.setOnClickListener(this.e);
    }
}
