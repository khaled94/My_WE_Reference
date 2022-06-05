package defpackage;

/* renamed from: ech  reason: default package */
/* loaded from: classes2.dex */
public final class ech extends ebd {
    private final String b;
    private final long c;
    private final edw d;

    public ech(String str, long j, edw edwVar) {
        this.b = str;
        this.c = j;
        this.d = edwVar;
    }

    @Override // defpackage.ebd
    public final eau a() {
        String str = this.b;
        if (str != null) {
            return eau.b(str);
        }
        return null;
    }

    @Override // defpackage.ebd
    public final long b() {
        return this.c;
    }

    @Override // defpackage.ebd
    public final edw d() {
        return this.d;
    }
}
