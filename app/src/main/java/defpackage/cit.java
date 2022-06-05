package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import defpackage.vf;

/* renamed from: cit  reason: default package */
/* loaded from: classes2.dex */
public final class cit extends aai<ciy> implements ciu {
    private static adj a = new adj("FirebaseAuth", "FirebaseAuth:");
    private final Context m;
    private final cjd n;

    public cit(Context context, Looper looper, aaf aafVar, cjd cjdVar, vf.b bVar, vf.c cVar) {
        super(context, looper, 112, aafVar, bVar, cVar);
        this.m = (Context) aat.a(context);
        this.n = cjdVar;
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return uz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // defpackage.aad
    public final String s() {
        char c;
        String a2 = cjo.a("firebear.preference");
        String str = "default";
        if (TextUtils.isEmpty(a2)) {
            a2 = str;
        }
        int hashCode = a2.hashCode();
        char c2 = 65535;
        if (hashCode != 103145323) {
            if (hashCode == 1544803905 && a2.equals(str)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (a2.equals("local")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            str = a2;
        }
        if (str.hashCode() == 103145323 && str.equals("local")) {
            c2 = 0;
        }
        if (c2 == 0) {
            a.a("Loading fallback module override.", new Object[0]);
            return this.m.getPackageName();
        }
        a.a("Loading module via FirebaseOptions.", new Object[0]);
        if (this.n.a) {
            a.a("Preparing to create service connection to fallback implementation", new Object[0]);
            return this.m.getPackageName();
        }
        a.a("Preparing to create service connection to gms implementation", new Object[0]);
        return "com.google.android.gms";
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final boolean l() {
        return DynamiteModule.a(this.m, "com.google.firebase.auth") == 0;
    }

    @Override // defpackage.aad
    public final Bundle p() {
        Bundle p = super.p();
        if (p == null) {
            p = new Bundle();
        }
        cjd cjdVar = this.n;
        if (cjdVar != null) {
            p.putString("com.google.firebase.auth.API_KEY", cjdVar.b);
        }
        String a2 = aap.a().a("firebase-auth");
        if (TextUtils.isEmpty(a2) || a2.equals("UNKNOWN")) {
            a2 = "-1";
        }
        p.putString("com.google.firebase.auth.LIBRARY_VERSION", a2);
        return p;
    }

    @Override // defpackage.aad
    public final uw[] z() {
        return aky.b;
    }

    @Override // defpackage.aad
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        if (queryLocalInterface instanceof ciy) {
            return (ciy) queryLocalInterface;
        }
        return new ciz(iBinder);
    }

    @Override // defpackage.ciu
    public final /* synthetic */ ciy A() throws DeadObjectException {
        return (ciy) super.q();
    }
}
