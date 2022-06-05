package defpackage;

import defpackage.cdm;

/* renamed from: cbf  reason: default package */
/* loaded from: classes2.dex */
public enum cbf implements cdm.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final cdm.d<cbf> internalValueMap = new cdm.d<cbf>() { // from class: cbf.1
        @Override // defpackage.cdm.d
        public final /* synthetic */ cbf a(int i) {
            return cbf.forNumber(i);
        }
    };
    private final int value;

    @Override // defpackage.cdm.c
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static cbf valueOf(int i) {
        return forNumber(i);
    }

    public static cbf forNumber(int i) {
        if (i != 0) {
            if (i == 1) {
                return SHA1;
            }
            if (i == 2) {
                return SHA384;
            }
            if (i == 3) {
                return SHA256;
            }
            if (i == 4) {
                return SHA512;
            }
            return null;
        }
        return UNKNOWN_HASH;
    }

    public static cdm.d<cbf> internalGetValueMap() {
        return internalValueMap;
    }

    public static cdm.e internalGetVerifier() {
        return a.a;
    }

    /* renamed from: cbf$a */
    /* loaded from: classes2.dex */
    static final class a implements cdm.e {
        static final cdm.e a = new a();

        private a() {
        }

        @Override // defpackage.cdm.e
        public final boolean a(int i) {
            return cbf.forNumber(i) != null;
        }
    }

    cbf(int i) {
        this.value = i;
    }
}
