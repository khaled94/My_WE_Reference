package defpackage;

import android.os.Handler;
import com.android.volley.VolleyError;
import defpackage.au;
import java.util.concurrent.Executor;

/* renamed from: an  reason: default package */
/* loaded from: classes.dex */
public final class an implements av {
    private final Executor a;

    public an(final Handler handler) {
        this.a = new Executor() { // from class: an.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // defpackage.av
    public final void a(as<?> asVar, au<?> auVar) {
        a(asVar, auVar, null);
    }

    @Override // defpackage.av
    public final void a(as<?> asVar, au<?> auVar, Runnable runnable) {
        asVar.i();
        asVar.a("post-response");
        this.a.execute(new a(asVar, auVar, runnable));
    }

    @Override // defpackage.av
    public final void a(as<?> asVar, VolleyError volleyError) {
        asVar.a("post-error");
        this.a.execute(new a(asVar, au.a(volleyError), null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: an$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private final as b;
        private final au c;
        private final Runnable d;

        public a(as asVar, au auVar, Runnable runnable) {
            this.b = asVar;
            this.c = auVar;
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            au.a aVar;
            if (this.b.b()) {
                this.b.b("canceled-at-delivery");
                return;
            }
            if (this.c.c == null) {
                this.b.a((as) this.c.a);
            } else {
                as asVar = this.b;
                VolleyError volleyError = this.c.c;
                synchronized (asVar.d) {
                    aVar = asVar.e;
                }
                if (aVar != null) {
                    aVar.onErrorResponse(volleyError);
                }
            }
            if (this.c.d) {
                this.b.a("intermediate-response");
            } else {
                this.b.b("done");
            }
            Runnable runnable = this.d;
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }
}
