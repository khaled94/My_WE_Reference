package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.common.R;
import defpackage.rs;
import java.util.ArrayList;

/* renamed from: ru  reason: default package */
/* loaded from: classes2.dex */
public class ru extends Fragment {
    rs a;
    private String b;
    private rs.c c;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            rs rsVar = (rs) bundle.getParcelable("loginClient");
            this.a = rsVar;
            if (rsVar.c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            rsVar.c = this;
        } else {
            this.a = new rs(this);
        }
        this.a.d = new rs.b() { // from class: ru.1
            @Override // defpackage.rs.b
            public final void a(rs.d dVar) {
                ru.a(ru.this, dVar);
            }
        };
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.b = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null) {
            return;
        }
        this.c = (rs.c) bundleExtra.getParcelable("request");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        rs rsVar = this.a;
        if (rsVar.b >= 0) {
            rsVar.d().b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.b == null) {
            getActivity().finish();
            return;
        }
        rs rsVar = this.a;
        rs.c cVar = this.c;
        if ((rsVar.g != null && rsVar.b >= 0) || cVar == null) {
            return;
        }
        if (rsVar.g != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (lk.d() && !rsVar.e()) {
            return;
        }
        rsVar.g = cVar;
        ArrayList arrayList = new ArrayList();
        rr rrVar = cVar.a;
        if (cVar.l()) {
            if (!ly.c && rrVar.allowsInstagramAppAuth()) {
                arrayList.add(new rp(rsVar));
            }
        } else {
            if (rrVar.allowsGetTokenAuth()) {
                arrayList.add(new ro(rsVar));
            }
            if (!ly.c && rrVar.allowsKatanaAuth()) {
                arrayList.add(new rq(rsVar));
            }
            if (!ly.c && rrVar.allowsFacebookLiteAuth()) {
                arrayList.add(new rm(rsVar));
            }
        }
        if (rrVar.allowsCustomTabAuth()) {
            arrayList.add(new rh(rsVar));
        }
        if (rrVar.allowsWebViewAuth()) {
            arrayList.add(new sf(rsVar));
        }
        if (!cVar.l() && rrVar.allowsDeviceAuth()) {
            arrayList.add(new rl(rsVar));
        }
        rx[] rxVarArr = new rx[arrayList.size()];
        arrayList.toArray(rxVarArr);
        rsVar.a = rxVarArr;
        rsVar.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View findViewById = getView() == null ? null : getView().findViewById(R.id.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        rs rsVar = this.a;
        rsVar.j++;
        if (rsVar.g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.g, false)) {
                rsVar.f();
            } else if (rsVar.d().c_() && intent == null && rsVar.j < rsVar.k) {
            } else {
                rsVar.d().a(i, i2, intent);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.a);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        final View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        this.a.e = new rs.a() { // from class: ru.2
            @Override // defpackage.rs.a
            public final void a() {
                findViewById.setVisibility(0);
            }

            @Override // defpackage.rs.a
            public final void b() {
                findViewById.setVisibility(8);
            }
        };
        return inflate;
    }

    static /* synthetic */ void a(ru ruVar, rs.d dVar) {
        ruVar.c = null;
        int i = dVar.a == rs.d.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", dVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (ruVar.isAdded()) {
            ruVar.getActivity().setResult(i, intent);
            ruVar.getActivity().finish();
        }
    }
}
