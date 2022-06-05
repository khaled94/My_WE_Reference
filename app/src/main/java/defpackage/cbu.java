package defpackage;

import defpackage.cdk;
import defpackage.cdm;

/* renamed from: cbu  reason: default package */
/* loaded from: classes2.dex */
public final class cbu extends cdk<cbu, a> implements cbv {
    private static final cbu DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile cel<cbu> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    public cdm.i<b> keyInfo_ = cep.d();
    private int primaryKeyId_;

    /* renamed from: cbu$c */
    /* loaded from: classes2.dex */
    public interface c extends ced {
    }

    private cbu() {
    }

    /* renamed from: cbu$b */
    /* loaded from: classes2.dex */
    public static final class b extends cdk<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile cel<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        public int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        private b() {
        }

        public static a a() {
            return DEFAULT_INSTANCE.l();
        }

        /* renamed from: cbu$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends cdk.a<b, a> implements c {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }

            public final a a(String str) {
                d();
                b.a((b) this.a, str);
                return this;
            }

            public final a a(cbo cboVar) {
                d();
                b.a((b) this.a, cboVar);
                return this;
            }

            public final a a(int i) {
                d();
                ((b) this.a).keyId_ = i;
                return this;
            }

            public final a a(ccf ccfVar) {
                d();
                b.a((b) this.a, ccfVar);
                return this;
            }
        }

        @Override // defpackage.cdk
        public final Object a(int i) {
            switch (AnonymousClass1.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((byte) 0);
                case 3:
                    return a(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    cel<b> celVar = PARSER;
                    if (celVar == null) {
                        synchronized (b.class) {
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
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            cdk.a(b.class, bVar);
        }

        static /* synthetic */ void a(b bVar, String str) {
            str.getClass();
            bVar.typeUrl_ = str;
        }

        static /* synthetic */ void a(b bVar, cbo cboVar) {
            bVar.status_ = cboVar.getNumber();
        }

        static /* synthetic */ void a(b bVar, ccf ccfVar) {
            bVar.outputPrefixType_ = ccfVar.getNumber();
        }
    }

    /* renamed from: cbu$1  reason: invalid class name */
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

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cbu$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbu, a> implements cbv {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbu.DEFAULT_INSTANCE);
        }

        public final a a(int i) {
            d();
            ((cbu) this.a).primaryKeyId_ = i;
            return this;
        }

        public final a a(b bVar) {
            d();
            cbu.a((cbu) this.a, bVar);
            return this;
        }
    }

    @Override // defpackage.cdk
    public final Object a(int i) {
        switch (AnonymousClass1.a[i - 1]) {
            case 1:
                return new cbu();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbu> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbu.class) {
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
        cbu cbuVar = new cbu();
        DEFAULT_INSTANCE = cbuVar;
        cdk.a(cbu.class, cbuVar);
    }

    static /* synthetic */ void a(cbu cbuVar, b bVar) {
        bVar.getClass();
        if (!cbuVar.keyInfo_.a()) {
            cbuVar.keyInfo_ = cdk.a(cbuVar.keyInfo_);
        }
        cbuVar.keyInfo_.add(bVar);
    }
}
