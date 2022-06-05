package defpackage;

/* renamed from: azd  reason: default package */
/* loaded from: classes.dex */
public final class azd implements arf<azc> {
    private static azd a = new azd();
    private final arf<azc> b;

    public static boolean b() {
        return ((azc) a.a()).a();
    }

    private azd(arf<azc> arfVar) {
        this.b = are.a((arf) arfVar);
    }

    public azd() {
        this(are.a(new azf()));
    }

    @Override // defpackage.arf
    public final /* synthetic */ azc a() {
        return this.b.a();
    }
}
