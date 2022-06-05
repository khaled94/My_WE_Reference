package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.aad;
import defpackage.vf;

/* renamed from: bvo  reason: default package */
/* loaded from: classes2.dex */
public final class bvo extends aai<bvu> implements bwe {
    public static final /* synthetic */ int a = 0;
    private final boolean m = true;
    private final aaf n;
    private final Bundle o;
    private final Integer p;

    public bvo(Context context, Looper looper, aaf aafVar, Bundle bundle, vf.b bVar, vf.c cVar) {
        super(context, looper, 44, aafVar, bVar, cVar);
        this.n = aafVar;
        this.o = bundle;
        this.p = aafVar.h;
    }

    @Override // defpackage.bwe
    public final void A() {
        try {
            ((bvu) q()).a(((Integer) aat.a(this.p)).intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.bwe
    public final void B() {
        a(new aad.d());
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof bvu ? (bvu) queryLocalInterface : new bvu(iBinder);
    }

    @Override // defpackage.bwe
    public final void a(aal aalVar, boolean z) {
        try {
            ((bvu) q()).a(aalVar, ((Integer) aat.a(this.p)).intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.bwe
    public final void a(bvt bvtVar) {
        aat.a(bvtVar, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.n.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            ((bvu) q()).a(new bvx(1, new acc(account, ((Integer) aat.a(this.p)).intValue(), "<<default account>>".equals(account.name) ? tp.a(this.f).a() : null)), bvtVar);
        } catch (RemoteException e) {
            try {
                bvtVar.a(new bvz(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.aad
    public final Bundle p() {
        if (!this.f.getPackageName().equals(this.n.e)) {
            this.o.putString("com.google.android.gms.signin.internal.realClientPackageName", this.n.e);
        }
        return this.o;
    }

    public static Bundle a(aaf aafVar) {
        Integer num = aafVar.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", aafVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }
}
