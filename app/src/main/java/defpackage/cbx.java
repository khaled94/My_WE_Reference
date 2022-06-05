package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: cbx  reason: default package */
/* loaded from: classes2.dex */
public final class cbx extends cdk<cbx, a> implements cca {
    private static final cbx DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile cel<cbx> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public cby params_;
    public int version_;

    private cbx() {
    }

    public static cbx a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (cbx) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cbx$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbx, a> implements cca {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbx.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((cbx) this.a).version_ = 0;
            return this;
        }

        public final a a(cby cbyVar) {
            d();
            cbx.a((cbx) this.a, cbyVar);
            return this;
        }
    }

    /* renamed from: cbx$1  reason: invalid class name */
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
                return new cbx();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbx> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbx.class) {
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
        cbx cbxVar = new cbx();
        DEFAULT_INSTANCE = cbxVar;
        cdk.a(cbx.class, cbxVar);
    }

    static /* synthetic */ void a(cbx cbxVar, cby cbyVar) {
        cbyVar.getClass();
        cbxVar.params_ = cbyVar;
    }
}
