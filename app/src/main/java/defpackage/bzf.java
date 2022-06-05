package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: bzf  reason: default package */
/* loaded from: classes2.dex */
public final class bzf extends cdk<bzf, a> implements bzi {
    private static final bzf DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile cel<bzf> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public ccu keyValue_ = ccu.a;
    private bzj params_;
    public int version_;

    private bzf() {
    }

    public final bzj a() {
        bzj bzjVar = this.params_;
        return bzjVar == null ? bzj.a() : bzjVar;
    }

    public static bzf a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (bzf) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: bzf$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<bzf, a> implements bzi {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(bzf.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((bzf) this.a).version_ = 0;
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            bzf.a((bzf) this.a, ccuVar);
            return this;
        }

        public final a a(bzj bzjVar) {
            d();
            bzf.a((bzf) this.a, bzjVar);
            return this;
        }
    }

    /* renamed from: bzf$1  reason: invalid class name */
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
                return new bzf();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<bzf> celVar = PARSER;
                if (celVar == null) {
                    synchronized (bzf.class) {
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
        bzf bzfVar = new bzf();
        DEFAULT_INSTANCE = bzfVar;
        cdk.a(bzf.class, bzfVar);
    }

    static /* synthetic */ void a(bzf bzfVar, ccu ccuVar) {
        ccuVar.getClass();
        bzfVar.keyValue_ = ccuVar;
    }

    static /* synthetic */ void a(bzf bzfVar, bzj bzjVar) {
        bzjVar.getClass();
        bzfVar.params_ = bzjVar;
    }
}
