package defpackage;

/* renamed from: ble  reason: default package */
/* loaded from: classes2.dex */
final class ble {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ble(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        aat.a(str);
        aat.a(str2);
        boolean z = true;
        aat.a(j >= 0);
        aat.a(j2 >= 0);
        aat.a(j3 >= 0);
        aat.a(j5 < 0 ? false : z);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ble(String str, String str2, long j, long j2, long j3) {
        this(str, str2, j, j2, 0L, j3, 0L, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ble a(long j) {
        return new ble(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ble a(long j, long j2) {
        return new ble(this.a, this.b, this.c, this.d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ble a(Long l, Long l2, Boolean bool) {
        return new ble(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
