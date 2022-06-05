package defpackage;

/* renamed from: axn  reason: default package */
/* loaded from: classes.dex */
public final class axn implements axk {
    private static final aqp<Boolean> a;
    private static final aqp<Long> b;

    @Override // defpackage.axk
    public final boolean a() {
        return a.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.app_launch.event_ordering_fix", false);
        b = aqp.a(aqwVar, "measurement.id.app_launch.event_ordering_fix", 0L);
    }
}
