package defpackage;

/* renamed from: ayy  reason: default package */
/* loaded from: classes.dex */
public final class ayy implements ayv {
    private static final aqp<Boolean> a;
    private static final aqp<Boolean> b;

    @Override // defpackage.ayv
    public final boolean a() {
        return a.c().booleanValue();
    }

    @Override // defpackage.ayv
    public final boolean b() {
        return b.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.personalized_ads_signals_collection_enabled", true);
        b = aqp.a(aqwVar, "measurement.personalized_ads_property_translation_enabled", true);
    }
}
