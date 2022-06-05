package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.chy;
import defpackage.vc;
import java.util.concurrent.Future;

/* renamed from: chx  reason: default package */
/* loaded from: classes2.dex */
public abstract class chx<T extends chy> {
    private static adj a = new adj("BiChannelGoogleApi", "FirebaseAuth: ");
    private chz<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Future<chz<T>> a();

    public final <ResultT, A extends vc.b> bwl<ResultT> a(cid<A, ResultT> cidVar) {
        ve<T> a2 = a(cidVar.a());
        if (a2 == null) {
            return b();
        }
        return (bwl<ResultT>) a2.b((wf<A, ResultT>) cidVar.b());
    }

    public final <ResultT, A extends vc.b> bwl<ResultT> b(cid<A, ResultT> cidVar) {
        ve<T> a2 = a(cidVar.a());
        if (a2 == null) {
            return b();
        }
        return (bwl<ResultT>) a2.c((wf<A, ResultT>) cidVar.b());
    }

    private static <ResultT> bwl<ResultT> b() {
        return bwo.a((Exception) civ.a(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable")));
    }

    private final ve<T> a(String str) {
        chz<T> c = c();
        if (c.c.a(str)) {
            adj adjVar = a;
            String valueOf = String.valueOf(c.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("getGoogleApiForMethod() returned Fallback: ");
            sb.append(valueOf);
            adjVar.a(sb.toString(), new Object[0]);
            return c.b;
        }
        adj adjVar2 = a;
        String valueOf2 = String.valueOf(c.a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
        sb2.append("getGoogleApiForMethod() returned Gms: ");
        sb2.append(valueOf2);
        adjVar2.a(sb2.toString(), new Object[0]);
        return c.a;
    }

    private final chz<T> c() {
        chz<T> chzVar;
        synchronized (this) {
            if (this.b == null) {
                try {
                    this.b = a().get();
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to Google Play Services: ".concat(valueOf) : new String("There was an error while initializing the connection to Google Play Services: "));
                }
            }
            chzVar = this.b;
        }
        return chzVar;
    }
}
