package defpackage;

/* renamed from: axu  reason: default package */
/* loaded from: classes.dex */
public final class axu implements axv {
    private static final aqp<Boolean> a;
    private static final aqp<Long> b;

    @Override // defpackage.axv
    public final boolean a() {
        return a.c().booleanValue();
    }

    static {
        aqw aqwVar = new aqw(aqq.a("com.google.android.gms.measurement"));
        a = aqp.a(aqwVar, "measurement.upload_dsid_enabled", false);
        b = aqp.a(aqwVar, "measurement.id.upload_dsid_enabled", 0L);
    }
}
