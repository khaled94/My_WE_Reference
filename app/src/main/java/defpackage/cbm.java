package defpackage;

import defpackage.cdk;
import defpackage.cdm;

/* renamed from: cbm  reason: default package */
/* loaded from: classes2.dex */
public final class cbm extends cdk<cbm, a> implements cbn {
    private static final cbm DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile cel<cbm> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int keyMaterialType_;
    public String typeUrl_ = "";
    public ccu value_ = ccu.a;

    private cbm() {
    }

    /* renamed from: cbm$b */
    /* loaded from: classes2.dex */
    public enum b implements cdm.c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
        private static final cdm.d<b> internalValueMap = new cdm.d<b>() { // from class: cbm.b.1
            @Override // defpackage.cdm.d
            public final /* synthetic */ b a(int i) {
                return b.forNumber(i);
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
        public static b valueOf(int i) {
            return forNumber(i);
        }

        public static b forNumber(int i) {
            if (i != 0) {
                if (i == 1) {
                    return SYMMETRIC;
                }
                if (i == 2) {
                    return ASYMMETRIC_PRIVATE;
                }
                if (i == 3) {
                    return ASYMMETRIC_PUBLIC;
                }
                if (i == 4) {
                    return REMOTE;
                }
                return null;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        public static cdm.d<b> internalGetValueMap() {
            return internalValueMap;
        }

        public static cdm.e internalGetVerifier() {
            return a.a;
        }

        /* renamed from: cbm$b$a */
        /* loaded from: classes2.dex */
        static final class a implements cdm.e {
            static final cdm.e a = new a();

            private a() {
            }

            @Override // defpackage.cdm.e
            public final boolean a(int i) {
                return b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.value = i;
        }
    }

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cbm$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbm, a> implements cbn {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbm.DEFAULT_INSTANCE);
        }

        public final a a(String str) {
            d();
            cbm.a((cbm) this.a, str);
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            cbm.a((cbm) this.a, ccuVar);
            return this;
        }

        public final a a(b bVar) {
            d();
            cbm.a((cbm) this.a, bVar);
            return this;
        }
    }

    /* renamed from: cbm$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cdk.g.a().length];
            a = iArr;
            try {
                iArr[cdk.g.d - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cdk.g.e - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cdk.g.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cdk.g.f - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cdk.g.g - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cdk.g.a - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[cdk.g.b - 1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // defpackage.cdk
    public final Object a(int i) {
        switch (AnonymousClass1.a[i - 1]) {
            case 1:
                return new cbm();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbm> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbm.class) {
                        celVar = PARSER;
                        if (celVar == null) {
                            celVar = new cdk.b<>(DEFAULT_INSTANCE);
                            PARSER = celVar;
                        }
                    }
                }
                return celVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        cbm cbmVar = new cbm();
        DEFAULT_INSTANCE = cbmVar;
        cdk.a(cbm.class, cbmVar);
    }

    public static cbm b() {
        return DEFAULT_INSTANCE;
    }

    static /* synthetic */ void a(cbm cbmVar, String str) {
        str.getClass();
        cbmVar.typeUrl_ = str;
    }

    static /* synthetic */ void a(cbm cbmVar, ccu ccuVar) {
        ccuVar.getClass();
        cbmVar.value_ = ccuVar;
    }

    static /* synthetic */ void a(cbm cbmVar, b bVar) {
        cbmVar.keyMaterialType_ = bVar.getNumber();
    }
}
