package defpackage;

/* renamed from: axg  reason: default package */
/* loaded from: classes.dex */
public final class axg implements arf<axj> {
    private static axg a = new axg();
    private final arf<axj> b;

    public static boolean b() {
        return ((axj) a.a()).a();
    }

    public static boolean c() {
        return ((axj) a.a()).b();
    }

    public static boolean d() {
        return ((axj) a.a()).c();
    }

    private axg(arf<axj> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public axg() {
        this(are.a(new axi()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ axj a() {
        return this.b.a();
    }
}
