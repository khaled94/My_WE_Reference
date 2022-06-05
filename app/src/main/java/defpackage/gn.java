package defpackage;

/* renamed from: gn  reason: default package */
/* loaded from: classes2.dex */
public class gn<T> implements ee<T> {
    protected final T a;

    @Override // defpackage.ee
    public final int c() {
        return 1;
    }

    @Override // defpackage.ee
    public final void d() {
    }

    public gn(T t) {
        this.a = (T) lf.a(t, "Argument must not be null");
    }

    @Override // defpackage.ee
    public final Class<T> a() {
        return (Class<T>) this.a.getClass();
    }

    @Override // defpackage.ee
    public final T b() {
        return this.a;
    }
}
