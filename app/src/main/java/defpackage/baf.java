package defpackage;

/* renamed from: baf  reason: default package */
/* loaded from: classes.dex */
public final class baf implements bag {
    private static final aqp<Boolean> a;
    private static final aqp<Boolean> b;
    private static final aqp<Boolean> c;
    private static final aqp<Boolean> d;
    private static final aqp<Boolean> e;
    private static final aqp<Long> f;

    @Override // defpackage.bag
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.bag
    public final boolean b() {
        return b.c().booleanValue();
    }

    @Override // defpackage.bag
    public final boolean c() {
        return d.c().booleanValue();
    }

    @Override // defpackage.bag
    public final boolean d() {
        return e.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.client.sessions.background_sessions_enabled", true);
        b = aqp.a(aqwVar, "measurement.client.sessions.immediate_start_enabled_foreground", false);
        c = aqp.a(aqwVar, "measurement.client.sessions.immediate_start_enabled", false);
        d = aqp.a(aqwVar, "measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e = aqp.a(aqwVar, "measurement.client.sessions.session_id_enabled", true);
        f = aqp.a(aqwVar, "measurement.id.sessionization_client", 0L);
    }
}
