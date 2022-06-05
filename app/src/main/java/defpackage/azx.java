package defpackage;

/* renamed from: azx  reason: default package */
/* loaded from: classes.dex */
public final class azx implements azu {
    private static final aqp<Boolean> a;
    private static final aqp<Boolean> b;
    private static final aqp<Boolean> c;
    private static final aqp<Boolean> d;

    @Override // defpackage.azu
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.azu
    public final boolean b() {
        return b.c().booleanValue();
    }

    @Override // defpackage.azu
    public final boolean c() {
        return c.c().booleanValue();
    }

    @Override // defpackage.azu
    public final boolean d() {
        return d.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.service.audience.scoped_filters_v27", false);
        b = aqp.a(aqwVar, "measurement.service.audience.session_scoped_user_engagement", false);
        c = aqp.a(aqwVar, "measurement.service.audience.session_scoped_event_aggregates", false);
        d = aqp.a(aqwVar, "measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }
}
