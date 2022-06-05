package defpackage;

/* renamed from: azr  reason: default package */
/* loaded from: classes.dex */
public final class azr implements azo {
    private static final aqp<Boolean> a;
    private static final aqp<Long> b;

    @Override // defpackage.azo
    public final boolean a() {
        return a.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.reset_analytics.persist_time", false);
        b = aqp.a(aqwVar, "measurement.id.reset_analytics.persist_time", 0L);
    }
}
