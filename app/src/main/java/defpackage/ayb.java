package defpackage;

/* renamed from: ayb  reason: default package */
/* loaded from: classes.dex */
public final class ayb implements ayc {
    private static final aqp<Boolean> a;
    private static final aqp<Boolean> b;
    private static final aqp<Boolean> c;
    private static final aqp<Boolean> d;
    private static final aqp<Long> e;

    @Override // defpackage.ayc
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.ayc
    public final boolean b() {
        return b.c().booleanValue();
    }

    @Override // defpackage.ayc
    public final boolean c() {
        return c.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.sdk.dynamite.allow_remote_dynamite", false);
        b = aqp.a(aqwVar, "measurement.collection.init_params_control_enabled", true);
        c = aqp.a(aqwVar, "measurement.sdk.dynamite.use_dynamite", false);
        d = aqp.a(aqwVar, "measurement.sdk.dynamite.use_dynamite2", false);
        e = aqp.a(aqwVar, "measurement.id.sdk.dynamite.use_dynamite", 0L);
    }
}
