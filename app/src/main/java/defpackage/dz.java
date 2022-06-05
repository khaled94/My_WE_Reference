package defpackage;

/* renamed from: dz  reason: default package */
/* loaded from: classes2.dex */
final class dz<Z> implements ee<Z> {
    final boolean a;
    final ee<Z> b;
    private final boolean c;
    private final a d;
    private final ck e;
    private int f;
    private boolean g;

    /* renamed from: dz$a */
    /* loaded from: classes2.dex */
    interface a {
        void a(ck ckVar, dz<?> dzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dz(ee<Z> eeVar, boolean z, boolean z2, ck ckVar, a aVar) {
        this.b = (ee) lf.a(eeVar, "Argument must not be null");
        this.a = z;
        this.c = z2;
        this.e = ckVar;
        this.d = (a) lf.a(aVar, "Argument must not be null");
    }

    @Override // defpackage.ee
    public final Class<Z> a() {
        return this.b.a();
    }

    @Override // defpackage.ee
    public final Z b() {
        return this.b.b();
    }

    @Override // defpackage.ee
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.ee
    public final synchronized void d() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.c) {
            this.b.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        boolean z;
        synchronized (this) {
            if (this.f <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i = this.f - 1;
            this.f = i;
            if (i != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.a(this.e, this);
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.b + '}';
    }
}
