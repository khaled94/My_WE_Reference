package defpackage;

/* renamed from: ayr  reason: default package */
/* loaded from: classes.dex */
public final class ayr implements arf<ayu> {
    private static ayr a = new ayr();
    private final arf<ayu> b;

    public static boolean b() {
        return ((ayu) a.a()).a();
    }

    public static boolean c() {
        return ((ayu) a.a()).b();
    }

    public static boolean d() {
        return ((ayu) a.a()).c();
    }

    private ayr(arf<ayu> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public ayr() {
        this(are.a(new ayt()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ ayu a() {
        return this.b.a();
    }
}
