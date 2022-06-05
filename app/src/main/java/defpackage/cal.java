package defpackage;

import defpackage.cdk;

/* renamed from: cal  reason: default package */
/* loaded from: classes2.dex */
public final class cal extends cdk<cal, a> implements cam {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final cal DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile cel<cal> PARSER;
    public int ciphertextSegmentSize_;
    public int derivedKeySize_;
    private int hkdfHashType_;

    private cal() {
    }

    public final cbf a() {
        cbf forNumber = cbf.forNumber(this.hkdfHashType_);
        return forNumber == null ? cbf.UNRECOGNIZED : forNumber;
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cal$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cal, a> implements cam {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cal.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((cal) this.a).ciphertextSegmentSize_ = 4096;
            return this;
        }

        public final a b() {
            d();
            ((cal) this.a).derivedKeySize_ = 32;
            return this;
        }

        public final a a(cbf cbfVar) {
            d();
            cal.a((cal) this.a, cbfVar);
            return this;
        }
    }

    /* renamed from: cal$1  reason: invalid class name */
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
                return new cal();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cal> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cal.class) {
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
        cal calVar = new cal();
        DEFAULT_INSTANCE = calVar;
        cdk.a(cal.class, calVar);
    }

    public static cal c() {
        return DEFAULT_INSTANCE;
    }

    static /* synthetic */ void a(cal calVar, cbf cbfVar) {
        calVar.hkdfHashType_ = cbfVar.getNumber();
    }
}
