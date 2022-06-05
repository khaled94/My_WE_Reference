package defpackage;

/* renamed from: ams  reason: default package */
/* loaded from: classes.dex */
final class ams extends amo {
    private final amr a = new amr();

    @Override // defpackage.amo
    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            if (th2 == null) {
                throw new NullPointerException("The suppressed exception cannot be null.");
            }
            this.a.a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
