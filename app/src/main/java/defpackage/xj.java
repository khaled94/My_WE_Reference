package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import defpackage.vc;
import defpackage.vq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: xj  reason: default package */
/* loaded from: classes2.dex */
public final class xj implements ya, zj {
    final Lock a;
    final Condition b;
    final Context c;
    final uy d;
    final xi e;
    final Map<vc.c<?>, vc.f> f;
    final aaf h;
    final Map<vc<?>, Boolean> i;
    final vc.a<? extends bwe, bvn> j;
    @NotOnlyInitialized
    volatile xg k;
    int l;
    final xf m;
    final xy n;
    final Map<vc.c<?>, ConnectionResult> g = new HashMap();
    private ConnectionResult o = null;

    public xj(Context context, xf xfVar, Lock lock, Looper looper, uy uyVar, Map<vc.c<?>, vc.f> map, aaf aafVar, Map<vc<?>, Boolean> map2, vc.a<? extends bwe, bvn> aVar, ArrayList<zi> arrayList, xy xyVar) {
        this.c = context;
        this.a = lock;
        this.d = uyVar;
        this.f = map;
        this.h = aafVar;
        this.i = map2;
        this.j = aVar;
        this.m = xfVar;
        this.n = xyVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).b = this;
        }
        this.e = new xi(this, looper);
        this.b = lock.newCondition();
        this.k = new xb(this);
    }

    @Override // defpackage.ya
    public final <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t) {
        t.b();
        this.k.a((xg) t);
        return t;
    }

    @Override // defpackage.ya
    public final void a() {
        this.k.b();
    }

    @Override // defpackage.vr
    public final void a(int i) {
        this.a.lock();
        try {
            this.k.a(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.vr
    public final void a(Bundle bundle) {
        this.a.lock();
        try {
            this.k.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.o = connectionResult;
            this.k = new xb(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.zj
    public final void a(ConnectionResult connectionResult, vc<?> vcVar, boolean z) {
        this.a.lock();
        try {
            this.k.a(connectionResult, vcVar, z);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.ya
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.k);
        for (vc<?> vcVar : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) vcVar.c).println(":");
            ((vc.f) aat.a(this.f.get(vcVar.b))).a(concat, printWriter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(xh xhVar) {
        this.e.sendMessage(this.e.obtainMessage(1, xhVar));
    }

    @Override // defpackage.ya
    public final boolean a(wc wcVar) {
        return false;
    }

    @Override // defpackage.ya
    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        t.b();
        return (T) this.k.b(t);
    }

    @Override // defpackage.ya
    public final void b() {
        if (this.k.d()) {
            this.g.clear();
        }
    }

    @Override // defpackage.ya
    public final void c() {
        if (this.k instanceof wp) {
            ((wp) this.k).c();
        }
    }

    @Override // defpackage.ya
    public final void d() {
    }

    @Override // defpackage.ya
    public final boolean e() {
        return this.k instanceof wp;
    }
}
