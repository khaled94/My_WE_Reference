package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.it;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bv  reason: default package */
/* loaded from: classes2.dex */
public final class bv implements ComponentCallbacks2, jd {
    private static final kb e;
    private static final kb f;
    private static final kb g = kb.b(dt.c).a(bt.LOW).c();
    protected final bo a;
    protected final Context b;
    final jc c;
    final CopyOnWriteArrayList<ka<Object>> d;
    private final ji h;
    private final jh i;
    private final jl j;
    private final Runnable k;
    private final it l;
    private kb m;
    private boolean n;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    static {
        kb b = kb.b(Bitmap.class);
        b.t = true;
        e = b;
        kb b2 = kb.b(ic.class);
        b2.t = true;
        f = b2;
    }

    public bv(bo boVar, jc jcVar, jh jhVar, Context context) {
        this(boVar, jcVar, jhVar, new ji(), boVar.f, context);
    }

    private bv(bo boVar, jc jcVar, jh jhVar, ji jiVar, iu iuVar, Context context) {
        this.j = new jl();
        this.k = new Runnable() { // from class: bv.1
            @Override // java.lang.Runnable
            public final void run() {
                bv.this.c.a(bv.this);
            }
        };
        this.a = boVar;
        this.c = jcVar;
        this.i = jhVar;
        this.h = jiVar;
        this.b = context;
        this.l = iuVar.a(context.getApplicationContext(), new a(jiVar));
        if (lg.c()) {
            lg.a(this.k);
        } else {
            jcVar.a(this);
        }
        jcVar.a(this.l);
        this.d = new CopyOnWriteArrayList<>(boVar.b.d);
        a(boVar.b.a());
        synchronized (boVar.g) {
            if (boVar.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            boVar.g.add(this);
        }
    }

    private synchronized void a(kb kbVar) {
        kb a2 = kbVar.clone();
        if (a2.t && !a2.v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        a2.v = true;
        a2.t = true;
        this.m = a2;
    }

    private synchronized void f() {
        ji jiVar = this.h;
        jiVar.c = true;
        for (jy jyVar : lg.a(jiVar.a)) {
            if (jyVar.d()) {
                jyVar.c();
                jiVar.b.add(jyVar);
            }
        }
    }

    private synchronized void g() {
        ji jiVar = this.h;
        jiVar.c = true;
        for (jy jyVar : lg.a(jiVar.a)) {
            if (jyVar.d() || jyVar.e()) {
                jyVar.b();
                jiVar.b.add(jyVar);
            }
        }
    }

    private synchronized void h() {
        g();
        for (bv bvVar : this.i.a()) {
            bvVar.g();
        }
    }

    private synchronized void i() {
        ji jiVar = this.h;
        jiVar.c = false;
        for (jy jyVar : lg.a(jiVar.a)) {
            if (!jyVar.e() && !jyVar.d()) {
                jyVar.a();
            }
        }
        jiVar.b.clear();
    }

    @Override // defpackage.jd
    public final synchronized void a() {
        i();
        this.j.a();
    }

    @Override // defpackage.jd
    public final synchronized void b() {
        f();
        this.j.b();
    }

    @Override // defpackage.jd
    public final synchronized void c() {
        this.j.c();
        for (km<?> kmVar : lg.a(this.j.a)) {
            a(kmVar);
        }
        this.j.a.clear();
        ji jiVar = this.h;
        for (jy jyVar : lg.a(jiVar.a)) {
            jiVar.a(jyVar);
        }
        jiVar.b.clear();
        this.c.b(this);
        this.c.b(this.l);
        lg.b(this.k);
        bo boVar = this.a;
        synchronized (boVar.g) {
            if (!boVar.g.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            boVar.g.remove(this);
        }
    }

    public final bu<Bitmap> d() {
        return b(Bitmap.class).a((jw<?>) e);
    }

    private <ResourceType> bu<ResourceType> b(Class<ResourceType> cls) {
        return new bu<>(this.a, this, cls, this.b);
    }

    public final void a(km<?> kmVar) {
        if (kmVar == null) {
            return;
        }
        c(kmVar);
    }

    private void c(km<?> kmVar) {
        boolean b = b(kmVar);
        jy d = kmVar.d();
        if (b || this.a.a(kmVar) || d == null) {
            return;
        }
        kmVar.a((jy) null);
        d.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(km<?> kmVar) {
        jy d = kmVar.d();
        if (d == null) {
            return true;
        }
        if (!this.h.a(d)) {
            return false;
        }
        this.j.a.remove(kmVar);
        kmVar.a((jy) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(km<?> kmVar, jy jyVar) {
        this.j.a.add(kmVar);
        ji jiVar = this.h;
        jiVar.a.add(jyVar);
        if (!jiVar.c) {
            jyVar.a();
            return;
        }
        jyVar.b();
        jiVar.b.add(jyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized kb e() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> bw<?, T> a(Class<T> cls) {
        bq bqVar = this.a.b;
        bw<?, T> bwVar = (bw<?, T>) bqVar.e.get(cls);
        if (bwVar == null) {
            for (Map.Entry<Class<?>, bw<?, ?>> entry : bqVar.e.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    bwVar = (bw<?, T>) entry.getValue();
                }
            }
        }
        return bwVar == null ? (bw<?, T>) bq.a : bwVar;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.h + ", treeNode=" + this.i + "}";
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i != 60 || !this.n) {
            return;
        }
        h();
    }

    /* renamed from: bv$a */
    /* loaded from: classes2.dex */
    class a implements it.a {
        private final ji b;

        a(ji jiVar) {
            this.b = jiVar;
        }

        @Override // defpackage.it.a
        public final void a(boolean z) {
            if (z) {
                synchronized (bv.this) {
                    ji jiVar = this.b;
                    for (jy jyVar : lg.a(jiVar.a)) {
                        if (!jyVar.e() && !jyVar.f()) {
                            jyVar.b();
                            if (!jiVar.c) {
                                jyVar.a();
                            } else {
                                jiVar.b.add(jyVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public final bu<Drawable> a(String str) {
        return b(Drawable.class).a(str);
    }

    public final bu<Drawable> a(Integer num) {
        return b(Drawable.class).a(num);
    }
}
