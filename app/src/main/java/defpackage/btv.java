package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.btz;

/* renamed from: btv  reason: default package */
/* loaded from: classes2.dex */
public final class btv<T extends Context & btz> {
    public final T a;

    public btv(T t) {
        aat.a(t);
        this.a = t;
    }

    public final void a() {
        bql.a(this.a, (baz) null).q().k.a("Local AppMeasurementService is starting up");
    }

    public final void b() {
        bql.a(this.a, (baz) null).q().k.a("Local AppMeasurementService is shutting down");
    }

    public final void a(Runnable runnable) {
        buj a = buj.a(this.a);
        a.p().a(new btw(a, runnable));
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            c().c.a("onUnbind called with null intent");
            return true;
        }
        c().k.a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().c.a("onRebind called with null intent");
            return;
        }
        c().k.a("onRebind called. action", intent.getAction());
    }

    public final bpi c() {
        return bql.a(this.a, (baz) null).q();
    }
}
