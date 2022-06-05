package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.vc;
import defpackage.vq;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: xb  reason: default package */
/* loaded from: classes2.dex */
public final class xb implements xg {
    @NotOnlyInitialized
    private final xj a;

    public xb(xj xjVar) {
        this.a = xjVar;
    }

    @Override // defpackage.xg
    public final <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t) {
        this.a.m.a.add(t);
        return t;
    }

    @Override // defpackage.xg
    public final void a() {
        for (vc.f fVar : this.a.f.values()) {
            fVar.i();
        }
        this.a.m.d = Collections.emptySet();
    }

    @Override // defpackage.xg
    public final void a(int i) {
    }

    @Override // defpackage.xg
    public final void a(Bundle bundle) {
    }

    @Override // defpackage.xg
    public final void a(ConnectionResult connectionResult, vc<?> vcVar, boolean z) {
    }

    @Override // defpackage.xg
    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.xg
    public final void b() {
        xj xjVar = this.a;
        xjVar.a.lock();
        try {
            xjVar.k = new xa(xjVar, xjVar.h, xjVar.i, xjVar.d, xjVar.j, xjVar.a, xjVar.c);
            xjVar.k.a();
            xjVar.b.signalAll();
        } finally {
            xjVar.a.unlock();
        }
    }

    @Override // defpackage.xg
    public final boolean d() {
        return true;
    }
}
