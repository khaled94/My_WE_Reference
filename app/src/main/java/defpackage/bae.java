package defpackage;

/* renamed from: bae  reason: default package */
/* loaded from: classes.dex */
public final class bae implements baa {
    private static final aqp<Boolean> a;
    private static final aqp<Boolean> b;
    private static final aqp<Boolean> c;
    private static final aqp<Long> d;

    @Override // defpackage.baa
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.baa
    public final boolean b() {
        return b.c().booleanValue();
    }

    @Override // defpackage.baa
    public final boolean c() {
        return c.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.service.sessions.remove_disabled_session_number", false);
        b = aqp.a(aqwVar, "measurement.service.sessions.session_number_enabled", false);
        c = aqp.a(aqwVar, "measurement.service.sessions.session_number_backfill_enabled", false);
        d = aqp.a(aqwVar, "measurement.id.session_number", 0L);
    }
}
