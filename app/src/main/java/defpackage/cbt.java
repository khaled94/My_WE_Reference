package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;
import defpackage.cdm;
import java.util.Collections;
import java.util.List;

/* renamed from: cbt  reason: default package */
/* loaded from: classes2.dex */
public final class cbt extends cdk<cbt, a> implements cbw {
    private static final cbt DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile cel<cbt> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    public cdm.i<b> key_ = cep.d();
    public int primaryKeyId_;

    /* renamed from: cbt$c */
    /* loaded from: classes2.dex */
    public interface c extends ced {
    }

    private cbt() {
    }

    /* renamed from: cbt$b */
    /* loaded from: classes2.dex */
    public static final class b extends cdk<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile cel<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public cbm keyData_;
        public int keyId_;
        private int outputPrefixType_;
        private int status_;

        private b() {
        }

        public final cbm a() {
            cbm cbmVar = this.keyData_;
            return cbmVar == null ? cbm.b() : cbmVar;
        }

        public final cbo b() {
            cbo forNumber = cbo.forNumber(this.status_);
            return forNumber == null ? cbo.UNRECOGNIZED : forNumber;
        }

        public final ccf c() {
            ccf forNumber = ccf.forNumber(this.outputPrefixType_);
            return forNumber == null ? ccf.UNRECOGNIZED : forNumber;
        }

        public static a d() {
            return DEFAULT_INSTANCE.l();
        }

        /* renamed from: cbt$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends cdk.a<b, a> implements c {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }

            public final a a(cbm cbmVar) {
                d();
                b.a((b) this.a, cbmVar);
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
                    return a(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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

        static /* synthetic */ void a(b bVar, cbm cbmVar) {
            cbmVar.getClass();
            bVar.keyData_ = cbmVar;
        }

        static /* synthetic */ void a(b bVar, cbo cboVar) {
            bVar.status_ = cboVar.getNumber();
        }

        static /* synthetic */ void a(b bVar, ccf ccfVar) {
            bVar.outputPrefixType_ = ccfVar.getNumber();
        }
    }

    /* renamed from: cbt$1  reason: invalid class name */
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

    public final int a() {
        return this.key_.size();
    }

    public static cbt a(byte[] bArr, cdb cdbVar) throws InvalidProtocolBufferException {
        return (cbt) cdk.a(DEFAULT_INSTANCE, bArr, cdbVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cbt$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbt, a> implements cbw {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbt.DEFAULT_INSTANCE);
        }

        public final a a(int i) {
            d();
            ((cbt) this.a).primaryKeyId_ = i;
            return this;
        }

        public final List<b> a() {
            return Collections.unmodifiableList(((cbt) this.a).key_);
        }

        public final int b() {
            return ((cbt) this.a).a();
        }

        public final b b(int i) {
            return ((cbt) this.a).key_.get(i);
        }

        public final a a(b bVar) {
            d();
            cbt.a((cbt) this.a, bVar);
            return this;
        }
    }

    @Override // defpackage.cdk
    public final Object a(int i) {
        switch (AnonymousClass1.a[i - 1]) {
            case 1:
                return new cbt();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbt> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbt.class) {
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
        cbt cbtVar = new cbt();
        DEFAULT_INSTANCE = cbtVar;
        cdk.a(cbt.class, cbtVar);
    }

    static /* synthetic */ void a(cbt cbtVar, b bVar) {
        bVar.getClass();
        if (!cbtVar.key_.a()) {
            cbtVar.key_ = cdk.a(cbtVar.key_);
        }
        cbtVar.key_.add(bVar);
    }
}
