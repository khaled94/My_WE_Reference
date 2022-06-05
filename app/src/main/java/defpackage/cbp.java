package defpackage;

import defpackage.cdk;

/* renamed from: cbp  reason: default package */
/* loaded from: classes2.dex */
public final class cbp extends cdk<cbp, a> implements cbq {
    private static final cbp DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile cel<cbp> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int outputPrefixType_;
    public String typeUrl_ = "";
    public ccu value_ = ccu.a;

    private cbp() {
    }

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cbp$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbp, a> implements cbq {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbp.DEFAULT_INSTANCE);
        }

        public final a a(String str) {
            d();
            cbp.a((cbp) this.a, str);
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            cbp.a((cbp) this.a, ccuVar);
            return this;
        }

        public final a a(ccf ccfVar) {
            d();
            cbp.a((cbp) this.a, ccfVar);
            return this;
        }
    }

    /* renamed from: cbp$1  reason: invalid class name */
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
                return new cbp();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbp> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbp.class) {
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
        cbp cbpVar = new cbp();
        DEFAULT_INSTANCE = cbpVar;
        cdk.a(cbp.class, cbpVar);
    }

    public static cbp b() {
        return DEFAULT_INSTANCE;
    }

    static /* synthetic */ void a(cbp cbpVar, String str) {
        str.getClass();
        cbpVar.typeUrl_ = str;
    }

    static /* synthetic */ void a(cbp cbpVar, ccu ccuVar) {
        ccuVar.getClass();
        cbpVar.value_ = ccuVar;
    }

    static /* synthetic */ void a(cbp cbpVar, ccf ccfVar) {
        cbpVar.outputPrefixType_ = ccfVar.getNumber();
    }
}
