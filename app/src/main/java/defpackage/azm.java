package defpackage;

/* renamed from: azm  reason: default package */
/* loaded from: classes.dex */
public final class azm implements azn {
    private static final aqp<Boolean> a = aqp.a(new aqw(aqq.a("com.google.android.gms.measurement")), "measurement.experiment.enable_experiment_reporting", true);

    @Override // defpackage.azn
    public final boolean a() {
        return a.c().booleanValue();
    }
}
