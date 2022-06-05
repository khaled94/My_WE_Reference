package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: cis  reason: default package */
/* loaded from: classes2.dex */
final class cis implements Callable<chz<cjd>> {
    private final cjd a;
    private final Context b;

    public cis(cjd cjdVar, Context context) {
        this.a = cjdVar;
        this.b = context;
    }

    private final ve<cjd> a(boolean z, Context context) {
        cjd cjdVar = (cjd) this.a.clone();
        cjdVar.a = z;
        return new cia(context, cjb.a, cjdVar, new cgx());
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ chz<cjd> call() throws Exception {
        int a = DynamiteModule.a(this.b, "com.google.firebase.auth");
        int i = 1;
        ve<cjd> veVar = null;
        ve<cjd> a2 = a != 0 ? a(true, this.b) : null;
        if (a != 0) {
            int a3 = ux.a().a(this.b, uz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            i = (a3 == 0 || a3 == 2) ? DynamiteModule.b(this.b, "com.google.android.gms.firebase_auth") : 0;
        }
        if (i != 0) {
            veVar = a(false, this.b);
        }
        return new chz<>(veVar, a2, new cib(i, a, Collections.emptyMap()));
    }
}
