package defpackage;

/* renamed from: ags  reason: default package */
/* loaded from: classes.dex */
public final class ags {
    private static ags a;
    private final agr b = new agr();
    private final ahe c = new ahe();

    private ags() {
    }

    private static ags c() {
        ags agsVar;
        synchronized (ags.class) {
            agsVar = a;
        }
        return agsVar;
    }

    public static agr a() {
        return c().b;
    }

    public static ahe b() {
        return c().c;
    }

    static {
        ags agsVar = new ags();
        synchronized (ags.class) {
            a = agsVar;
        }
    }
}
