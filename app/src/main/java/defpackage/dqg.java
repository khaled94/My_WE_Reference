package defpackage;

/* renamed from: dqg  reason: default package */
/* loaded from: classes2.dex */
public final class dqg {
    private static final dqh a;
    private static final drg[] b;

    public static dri a(dpz dpzVar) {
        return dpzVar;
    }

    static {
        dqh dqhVar = null;
        try {
            dqhVar = (dqh) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (dqhVar == null) {
            dqhVar = new dqh();
        }
        a = dqhVar;
        b = new drg[0];
    }

    public static String a(dpy dpyVar) {
        return dqh.a(dpyVar);
    }

    public static drh a(Class cls) {
        return new dqe(cls, "");
    }

    public static drg b(Class cls) {
        return new dpv(cls);
    }

    public static String a(dqd dqdVar) {
        return dqh.a(dqdVar);
    }
}
