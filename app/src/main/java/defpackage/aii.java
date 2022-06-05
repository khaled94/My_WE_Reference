package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aii  reason: default package */
/* loaded from: classes.dex */
public final class aii extends aai<aij> {
    private final Bundle a;

    public aii(Context context, Looper looper, aaf aafVar, td tdVar, vr vrVar, vz vzVar) {
        super(context, looper, 16, aafVar, vrVar, vzVar);
        Bundle bundle;
        if (tdVar == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(tdVar.b);
        }
        this.a = bundle;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof aij) {
            return (aij) queryLocalInterface;
        }
        return new aij(iBinder);
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.aad
    public final Bundle p() {
        return this.a;
    }

    @Override // defpackage.aad
    public final boolean y() {
        return true;
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final boolean m() {
        Set set;
        aaf aafVar = ((aai) this).l;
        Account account = aafVar.a;
        if (!TextUtils.isEmpty(account != null ? account.name : null)) {
            abm abmVar = aafVar.d.get(tc.a);
            if (abmVar == null || abmVar.a.isEmpty()) {
                set = aafVar.b;
            } else {
                set = new HashSet(aafVar.b);
                set.addAll(abmVar.a);
            }
            return !set.isEmpty();
        }
        return false;
    }
}
