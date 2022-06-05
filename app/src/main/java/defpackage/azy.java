package defpackage;

/* renamed from: azy  reason: default package */
/* loaded from: classes.dex */
public final class azy implements azz {
    private static final aqp<Boolean> a;
    private static final aqp<Boolean> b;
    private static final aqp<Long> c;

    @Override // defpackage.azz
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.azz
    public final boolean b() {
        return b.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.audience.sequence_filters", false);
        b = aqp.a(aqwVar, "measurement.audience.sequence_filters_bundle_timestamp", false);
        c = aqp.a(aqwVar, "measurement.id.audience.sequence_filters", 0L);
    }
}
