package defpackage;

import defpackage.cdm;

/* renamed from: cbo  reason: default package */
/* loaded from: classes2.dex */
public enum cbo implements cdm.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final cdm.d<cbo> internalValueMap = new cdm.d<cbo>() { // from class: cbo.1
        @Override // defpackage.cdm.d
        public final /* synthetic */ cbo a(int i) {
            return cbo.forNumber(i);
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
    public static cbo valueOf(int i) {
        return forNumber(i);
    }

    public static cbo forNumber(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENABLED;
            }
            if (i == 2) {
                return DISABLED;
            }
            if (i == 3) {
                return DESTROYED;
            }
            return null;
        }
        return UNKNOWN_STATUS;
    }

    public static cdm.d<cbo> internalGetValueMap() {
        return internalValueMap;
    }

    public static cdm.e internalGetVerifier() {
        return a.a;
    }

    /* renamed from: cbo$a */
    /* loaded from: classes2.dex */
    static final class a implements cdm.e {
        static final cdm.e a = new a();

        private a() {
        }

        @Override // defpackage.cdm.e
        public final boolean a(int i) {
            return cbo.forNumber(i) != null;
        }
    }

    cbo(int i) {
        this.value = i;
    }
}
