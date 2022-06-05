package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cmo  reason: default package */
/* loaded from: classes2.dex */
public final class cmo<T> implements cow<T> {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile cow<T> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cmo(cow<T> cowVar) {
        this.c = cowVar;
    }

    @Override // defpackage.cow
    public final T a() {
        T t = (T) this.b;
        if (t == a) {
            synchronized (this) {
                t = this.b;
                if (t == a) {
                    t = this.c.a();
                    this.b = t;
                    this.c = null;
                }
            }
        }
        return t;
    }
}
