package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bma  reason: default package */
/* loaded from: classes2.dex */
public final class bma implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ bkz c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bma(bkz bkzVar, String str, long j) {
        this.c = bkzVar;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bkz bkzVar = this.c;
        String str = this.a;
        long j = this.b;
        bkzVar.c();
        aat.a(str);
        Integer num = bkzVar.b.get(str);
        if (num != null) {
            bst v = bkzVar.h().v();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                bkzVar.b.remove(str);
                Long l = bkzVar.a.get(str);
                if (l == null) {
                    bkzVar.q().c.a("First ad unit exposure time was never set");
                } else {
                    bkzVar.a.remove(str);
                    bkzVar.a(str, j - l.longValue(), v);
                }
                if (!bkzVar.b.isEmpty()) {
                    return;
                }
                if (bkzVar.c == 0) {
                    bkzVar.q().c.a("First ad exposure time was never set");
                    return;
                }
                bkzVar.a(j - bkzVar.c, v);
                bkzVar.c = 0L;
                return;
            }
            bkzVar.b.put(str, Integer.valueOf(intValue));
            return;
        }
        bkzVar.q().c.a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
