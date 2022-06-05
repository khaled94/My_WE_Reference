package defpackage;

/* renamed from: ayh  reason: default package */
/* loaded from: classes.dex */
public final class ayh implements ayi {
    private static final aqp<Boolean> a;
    private static final aqp<Long> b;

    @Override // defpackage.ayi
    public final boolean a() {
        return a.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.fetch_config_with_admob_app_id", true);
        b = aqp.a(aqwVar, "measurement.id.fetch_config_with_admob_app_id", 0L);
    }
}
