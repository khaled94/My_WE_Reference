package defpackage;

/* renamed from: ayk  reason: default package */
/* loaded from: classes.dex */
public final class ayk implements arf<ayj> {
    private static ayk a = new ayk();
    private final arf<ayj> b;

    public static boolean b() {
        return ((ayj) a.a()).a();
    }

    public static boolean c() {
        return ((ayj) a.a()).b();
    }

    private ayk(arf<ayj> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public ayk() {
        this(are.a(new aym()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ ayj a() {
        return this.b.a();
    }
}
