package defpackage;

import java.util.Map;

/* renamed from: dkc  reason: default package */
/* loaded from: classes2.dex */
public abstract class dkc<T> {
    public final String[] a;
    public final Class<?>[] b;
    public final boolean c;
    public final Class<?>[] d;
    public final boolean e;
    public final boolean f;
    protected T g;

    public void a(Map<String, djz<?>> map) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dkc(String[] strArr, Class<?>[] clsArr, boolean z, Class<?>[] clsArr2, boolean z2, boolean z3) {
        this.a = strArr;
        this.b = clsArr;
        this.c = z;
        this.d = clsArr2;
        this.e = z2;
        this.f = z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T a() {
        throw new UnsupportedOperationException("No no-args constructor on " + getClass().getName());
    }

    public final T b() {
        return this.g;
    }
}
