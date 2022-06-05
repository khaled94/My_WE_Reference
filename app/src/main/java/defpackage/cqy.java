package defpackage;

import java.lang.reflect.AccessibleObject;

/* renamed from: cqy  reason: default package */
/* loaded from: classes2.dex */
public abstract class cqy {
    private static final cqy a;

    public abstract void a(AccessibleObject accessibleObject);

    static {
        a = cqn.a() < 9 ? new cqx() : new cqz();
    }

    public static cqy a() {
        return a;
    }
}
