package defpackage;

/* renamed from: axy  reason: default package */
/* loaded from: classes.dex */
public final class axy implements arf<ayc> {
    private static axy a = new axy();
    private final arf<ayc> b;

    public static boolean b() {
        return ((ayc) a.a()).a();
    }

    public static boolean c() {
        return ((ayc) a.a()).b();
    }

    public static boolean d() {
        return ((ayc) a.a()).c();
    }

    private axy(arf<ayc> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public axy() {
        this(are.a(new ayb()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ ayc a() {
        return this.b.a();
    }
}
