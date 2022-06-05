package defpackage;

/* renamed from: aau  reason: default package */
/* loaded from: classes.dex */
public final class aau {
    private static aau b;
    private static final aav c = new aav(0, false, false, 0, 0);
    public aav a;

    private aau() {
    }

    public static synchronized aau a() {
        aau aauVar;
        synchronized (aau.class) {
            if (b == null) {
                b = new aau();
            }
            aauVar = b;
        }
        return aauVar;
    }

    public final synchronized void a(aav aavVar) {
        if (aavVar == null) {
            this.a = c;
            return;
        }
        aav aavVar2 = this.a;
        if (aavVar2 != null && aavVar2.a >= aavVar.a) {
            return;
        }
        this.a = aavVar;
    }
}
