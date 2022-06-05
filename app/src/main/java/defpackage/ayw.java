package defpackage;

/* renamed from: ayw  reason: default package */
/* loaded from: classes.dex */
public final class ayw implements arf<ayv> {
    private static ayw a = new ayw();
    private final arf<ayv> b;

    public static boolean b() {
        return ((ayv) a.a()).a();
    }

    public static boolean c() {
        return ((ayv) a.a()).b();
    }

    private ayw(arf<ayv> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public ayw() {
        this(are.a(new ayy()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ ayv a() {
        return this.b.a();
    }
}
