package defpackage;

/* renamed from: aym  reason: default package */
/* loaded from: classes.dex */
public final class aym implements ayj {
    private static final aqp<Boolean> a;
    private static final aqp<Boolean> b;

    @Override // defpackage.ayj
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.ayj
    public final boolean b() {
        return b.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.collection.efficient_engagement_reporting_enabled", false);
        b = aqp.a(aqwVar, "measurement.collection.redundant_engagement_removal_enabled", false);
    }
}
