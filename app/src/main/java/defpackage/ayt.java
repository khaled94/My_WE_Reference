package defpackage;

/* renamed from: ayt  reason: default package */
/* loaded from: classes.dex */
public final class ayt implements ayu {
    private static final aqp<Boolean> a;
    private static final aqp<Boolean> b;
    private static final aqp<Boolean> c;

    @Override // defpackage.ayu
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.ayu
    public final boolean b() {
        return b.c().booleanValue();
    }

    @Override // defpackage.ayu
    public final boolean c() {
        return c.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.sdk.collection.last_deep_link_referrer", false);
        b = aqp.a(aqwVar, "measurement.sdk.collection.last_deep_link_referrer_campaign", false);
        c = aqp.a(aqwVar, "measurement.sdk.collection.last_gclid_from_referrer", false);
    }
}
