package defpackage;

import defpackage.cdm;

/* renamed from: ccf  reason: default package */
/* loaded from: classes2.dex */
public enum ccf implements cdm.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final cdm.d<ccf> internalValueMap = new cdm.d<ccf>() { // from class: ccf.1
        @Override // defpackage.cdm.d
        public final /* synthetic */ ccf a(int i) {
            return ccf.forNumber(i);
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
    public static ccf valueOf(int i) {
        return forNumber(i);
    }

    public static ccf forNumber(int i) {
        if (i != 0) {
            if (i == 1) {
                return TINK;
            }
            if (i == 2) {
                return LEGACY;
            }
            if (i == 3) {
                return RAW;
            }
            if (i == 4) {
                return CRUNCHY;
            }
            return null;
        }
        return UNKNOWN_PREFIX;
    }

    public static cdm.d<ccf> internalGetValueMap() {
        return internalValueMap;
    }

    public static cdm.e internalGetVerifier() {
        return a.a;
    }

    /* renamed from: ccf$a */
    /* loaded from: classes2.dex */
    static final class a implements cdm.e {
        static final cdm.e a = new a();

        private a() {
        }

        @Override // defpackage.cdm.e
        public final boolean a(int i) {
            return ccf.forNumber(i) != null;
        }
    }

    ccf(int i) {
        this.value = i;
    }
}
