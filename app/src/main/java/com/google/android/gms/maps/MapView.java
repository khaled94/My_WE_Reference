package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MapView extends FrameLayout {
    public final b a;

    /* loaded from: classes.dex */
    public static class a implements bju {
        private final ViewGroup a;
        private final bjq b;
        private View c;

        public a(ViewGroup viewGroup, bjq bjqVar) {
            this.b = (bjq) aat.a(bjqVar);
            this.a = (ViewGroup) aat.a(viewGroup);
        }

        @Override // defpackage.afo
        public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // defpackage.afo
        public final void a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                bkf.a(bundle, bundle2);
                this.b.a(bundle2);
                bkf.a(bundle2, bundle);
                this.c = (View) afp.a(this.b.e());
                this.a.removeAllViews();
                this.a.addView(this.c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
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
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        @Override // defpackage.afo
        public final void a() {
            try {
                this.b.c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.afo
        public final void c() {
            try {
                this.b.d();
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
                this.b.a(new bkv(bjhVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends afm<a> {
        public final List<bjh> d = new ArrayList();
        private final ViewGroup e;
        private final Context f;
        private afq<a> g;
        private final GoogleMapOptions h;

        b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.e = viewGroup;
            this.f = context;
            this.h = googleMapOptions;
        }

        @Override // defpackage.afm
        public final void a(afq<a> afqVar) {
            this.g = afqVar;
            if (afqVar == null || this.a != 0) {
                return;
            }
            try {
                bjg.a(this.f);
                bjq a = bkg.a(this.f).a(afp.a(this.f), this.h);
                if (a == null) {
                    return;
                }
                this.g.a(new a(this.e, a));
                for (bjh bjhVar : this.d) {
                    ((a) this.a).a(bjhVar);
                }
                this.d.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new b(this, context, GoogleMapOptions.a(context, attributeSet));
        setClickable(true);
    }
}
