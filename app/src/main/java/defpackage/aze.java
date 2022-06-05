package defpackage;

/* renamed from: aze  reason: default package */
/* loaded from: classes.dex */
public final class aze implements arf<azh> {
    private static aze a = new aze();
    private final arf<azh> b;

    public static boolean b() {
        return ((azh) a.a()).a();
    }

    public static double c() {
        return ((azh) a.a()).b();
    }

    public static long d() {
        return ((azh) a.a()).c();
    }

    public static long e() {
        return ((azh) a.a()).d();
    }

    public static String f() {
        return ((azh) a.a()).e();
    }

    private aze(arf<azh> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public aze() {
        this(are.a(new azg()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ azh a() {
        return this.b.a();
    }
}
