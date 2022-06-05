package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bjk  reason: default package */
/* loaded from: classes2.dex */
public class bjk extends Fragment {
    private final b a = new b(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bjk$a */
    /* loaded from: classes2.dex */
    public static class a implements bju {
        private final Fragment a;
        private final bjp b;

        public a(Fragment fragment, bjp bjpVar) {
            this.b = (bjp) aat.a(bjpVar);
            this.a = (Fragment) aat.a(fragment);
        }

        @Override // defpackage.afo
        public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                bkf.a(bundle2, bundle3);
                this.b.a(afp.a(activity), googleMapOptions, bundle3);
                bkf.a(bundle3, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                bkf.a(bundle, bundle2);
                Bundle arguments = this.a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    bkf.a(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.b.a(bundle2);
                bkf.a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                bkf.a(bundle, bundle2);
                afn a = this.b.a(afp.a(layoutInflater), afp.a(viewGroup), bundle2);
                bkf.a(bundle2, bundle);
                return (View) afp.a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void f() {
            try {
                this.b.f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void e() {
            try {
                this.b.a();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void d() {
            try {
                this.b.b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void g() {
            try {
                this.b.g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void b() {
            try {
                this.b.c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void a() {
            try {
                this.b.d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void c() {
            try {
                this.b.e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void b(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                bkf.a(bundle, bundle2);
                this.b.b(bundle2);
                bkf.a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void a(bjh bjhVar) {
            try {
                this.b.a(new bkw(bjhVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: bjk$b */
    /* loaded from: classes2.dex */
    static class b extends afm<a> {
        private final Fragment d;
        private afq<a> e;
        private Activity f;
        private final List<bjh> g = new ArrayList();

        b(Fragment fragment) {
            this.d = fragment;
        }

        @Override // defpackage.afm
        public final void a(afq<a> afqVar) {
            this.e = afqVar;
            h();
        }

        private final void h() {
            if (this.f == null || this.e == null || this.a != 0) {
                return;
            }
            try {
                bjg.a(this.f);
                bjp a = bkg.a(this.f).a(afp.a(this.f));
                if (a == null) {
                    return;
                }
                this.e.a(new a(this.d, a));
                for (bjh bjhVar : this.g) {
                    ((a) this.a).a(bjhVar);
                }
                this.g.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }

        final void a(Activity activity) {
            this.f = activity;
            h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a.a(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.a.a(activity);
            GoogleMapOptions a2 = GoogleMapOptions.a(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", a2);
            this.a.a(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = this.a.a(layoutInflater, viewGroup, bundle);
        a2.setClickable(true);
        return a2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.a.d();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.a.g();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.a.b();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.a.a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.a.c();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(bjk.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(bjk.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.a.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
