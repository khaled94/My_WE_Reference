package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import defpackage.agq;

/* renamed from: cju  reason: default package */
/* loaded from: classes2.dex */
public final class cju {
    public static final agq<Boolean> a = new agq.a("firebase_auth_proactive_token_refresh_enabled", Boolean.TRUE);

    public static final void a(Context context) {
        ags.a();
        ahe b = ags.b();
        synchronized (b) {
            if (b.a) {
                return;
            }
            try {
                b.b = ahg.asInterface(DynamiteModule.a(context, DynamiteModule.e, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                b.b.init(afp.a(context));
                b.a = true;
            } catch (RemoteException | DynamiteModule.LoadingException unused) {
            }
        }
    }
}
