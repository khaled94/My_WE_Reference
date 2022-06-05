package defpackage;

/* renamed from: ayx  reason: default package */
/* loaded from: classes.dex */
public final class ayx implements arf<azb> {
    private static ayx a = new ayx();
    private final arf<azb> b;

    public static boolean b() {
        return ((azb) a.a()).a();
    }

    private ayx(arf<azb> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public ayx() {
        this(are.a(new ayz()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ azb a() {
        return this.b.a();
    }
}
