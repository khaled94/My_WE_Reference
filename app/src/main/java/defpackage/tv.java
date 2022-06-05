package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import defpackage.vf;

/* renamed from: tv  reason: default package */
/* loaded from: classes2.dex */
public final class tv extends aai {
    final GoogleSignInOptions a;

    public tv(Context context, Looper looper, aaf aafVar, GoogleSignInOptions googleSignInOptions, vf.b bVar, vf.c cVar) {
        super(context, looper, 91, aafVar, bVar, cVar);
        GoogleSignInOptions.a aVar;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar = new GoogleSignInOptions.a();
        }
        aVar.b = aic.a();
        if (!aafVar.c.isEmpty()) {
            for (Scope scope : aafVar.c) {
                aVar.a(scope, new Scope[0]);
            }
        }
        this.a = aVar.c();
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return uz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // defpackage.aad
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof uh ? (uh) queryLocalInterface : new uh(iBinder);
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final Intent b() {
        return ub.c(this.f, this.a);
    }
}
