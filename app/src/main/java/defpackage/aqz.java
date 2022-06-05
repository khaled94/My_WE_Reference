package defpackage;

import java.io.Serializable;

/* renamed from: aqz  reason: default package */
/* loaded from: classes.dex */
public abstract class aqz<T> implements Serializable {
    public static <T> aqz<T> c() {
        return aqx.a;
    }

    public abstract boolean a();

    public abstract T b();

    public static <T> aqz<T> a(T t) {
        return new arb(arc.a(t));
    }
}
