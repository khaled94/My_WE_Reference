package defpackage;

/* renamed from: bac  reason: default package */
/* loaded from: classes.dex */
public final class bac implements arf<baa> {
    private static bac a = new bac();
    private final arf<baa> b;

    public static boolean b() {
        return ((baa) a.a()).a();
    }

    public static boolean c() {
        return ((baa) a.a()).b();
    }

    public static boolean d() {
        return ((baa) a.a()).c();
    }

    private bac(arf<baa> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public bac() {
        this(are.a(new bae()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ baa a() {
        return this.b.a();
    }
}
