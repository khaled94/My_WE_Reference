package defpackage;

/* renamed from: azg  reason: default package */
/* loaded from: classes.dex */
public final class azg implements azh {
    private static final aqp<Boolean> a;
    private static final aqp<Double> b;
    private static final aqp<Long> c;
    private static final aqp<Long> d;
    private static final aqp<String> e;

    @Override // defpackage.azh
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.azh
    public final double b() {
        return b.c().doubleValue();
    }

    @Override // defpackage.azh
    public final long c() {
        return c.c().longValue();
    }

    @Override // defpackage.azh
    public final long d() {
        return d.c().longValue();
    }

    @Override // defpackage.azh
    public final String e() {
        return e.c();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.test.boolean_flag", false);
        b = aqp.a(aqwVar, "measurement.test.double_flag");
        c = aqp.a(aqwVar, "measurement.test.int_flag", -2L);
        d = aqp.a(aqwVar, "measurement.test.long_flag", -1L);
        e = aqp.a(aqwVar, "measurement.test.string_flag", "---");
    }
}
