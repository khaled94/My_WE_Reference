package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import defpackage.aal;

/* renamed from: aab  reason: default package */
/* loaded from: classes.dex */
public final class aab extends aal.a {
    public static Account a(aal aalVar) {
        Account account = null;
        if (aalVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = aalVar.a();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }

    @Override // defpackage.aal
    public final Account a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        throw null;
    }
}
