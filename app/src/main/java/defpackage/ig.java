package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ig  reason: default package */
/* loaded from: classes2.dex */
public final class ig {
    final ca a;
    final List<b> b;
    final bv c;
    boolean d;
    a e;
    boolean f;
    a g;
    Bitmap h;
    a i;
    int j;
    int k;
    int l;
    private final Handler m;
    private final en n;
    private boolean o;
    private boolean p;
    private bu<Bitmap> q;
    private cq<Bitmap> r;

    /* renamed from: ig$b */
    /* loaded from: classes2.dex */
    public interface b {
        void c();
    }

    private ig(en enVar, bv bvVar, ca caVar, bu<Bitmap> buVar, cq<Bitmap> cqVar, Bitmap bitmap) {
        this.b = new ArrayList();
        this.c = bvVar;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.n = enVar;
        this.m = handler;
        this.q = buVar;
        this.a = caVar;
        a(cqVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(b bVar) {
        if (this.f) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.b.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.b.isEmpty();
        this.b.add(bVar);
        if (!isEmpty) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(b bVar) {
        this.b.remove(bVar);
        if (this.b.isEmpty()) {
            this.d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.d();
    }

    private void c() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f = false;
        d();
    }

    private void d() {
        if (!this.d || this.o) {
            return;
        }
        if (this.p) {
            lf.a(this.i == null, "Pending target must be null when starting from the first frame");
            this.a.f();
            this.p = false;
        }
        a aVar = this.i;
        if (aVar != null) {
            this.i = null;
            a(aVar);
            return;
        }
        this.o = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.a.c();
        this.a.b();
        this.g = new a(this.m, this.a.e(), uptimeMillis);
        this.q.a((jw<?>) kb.b(e())).a(this.a).a((bu<Bitmap>) this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.a(bitmap);
            this.h = null;
        }
    }

    final void a(a aVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.d) {
            if (this.p) {
                this.m.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.i = aVar;
            }
        } else {
            if (aVar.b != null) {
                b();
                a aVar2 = this.e;
                this.e = aVar;
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    this.b.get(size).c();
                }
                if (aVar2 != null) {
                    this.m.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            d();
        }
    }

    /* renamed from: ig$c */
    /* loaded from: classes2.dex */
    class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ig.this.a((a) message.obj);
                return true;
            } else if (message.what != 2) {
                return false;
            } else {
                ig.this.c.a((a) message.obj);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ig$a */
    /* loaded from: classes2.dex */
    public static class a extends kh<Bitmap> {
        final int a;
        Bitmap b;
        private final Handler c;
        private final long d;

        @Override // defpackage.km
        public final /* synthetic */ void a(Object obj) {
            this.b = (Bitmap) obj;
            this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.d);
        }

        a(Handler handler, int i, long j) {
            this.c = handler;
            this.a = i;
            this.d = j;
        }

        @Override // defpackage.km
        public final void a(Drawable drawable) {
            this.b = null;
        }
    }

    private static ck e() {
        return new ku(Double.valueOf(Math.random()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ig(bo boVar, ca caVar, int i, int i2, cq<Bitmap> cqVar, Bitmap bitmap) {
        this(boVar.a, bo.b(boVar.b.getBaseContext()), caVar, bo.b(boVar.b.getBaseContext()).d().a((jw<?>) kb.b(dt.b).b().c().a(i, i2)), cqVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(cq<Bitmap> cqVar, Bitmap bitmap) {
        this.r = (cq) lf.a(cqVar, "Argument must not be null");
        this.h = (Bitmap) lf.a(bitmap, "Argument must not be null");
        this.q = this.q.a((jw<?>) new kb().a(cqVar));
        this.j = lg.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }
}
