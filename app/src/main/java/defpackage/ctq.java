package defpackage;

/* renamed from: ctq  reason: default package */
/* loaded from: classes2.dex */
public enum ctq {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final ctq[] FOR_BITS;
    private final int bits;

    static {
        ctq ctqVar = H;
        ctq ctqVar2 = L;
        FOR_BITS = new ctq[]{M, ctqVar2, ctqVar, Q};
    }

    ctq(int i) {
        this.bits = i;
    }

    public final int getBits() {
        return this.bits;
    }

    public static ctq forBits(int i) {
        if (i >= 0) {
            ctq[] ctqVarArr = FOR_BITS;
            if (i < ctqVarArr.length) {
                return ctqVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
