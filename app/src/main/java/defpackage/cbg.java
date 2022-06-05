package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: cbg  reason: default package */
/* loaded from: classes2.dex */
public final class cbg extends cdk<cbg, a> implements cbj {
    private static final cbg DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile cel<cbg> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public ccu keyValue_ = ccu.a;
    private cbk params_;
    public int version_;

    private cbg() {
    }

    public final cbk a() {
        cbk cbkVar = this.params_;
        return cbkVar == null ? cbk.b() : cbkVar;
    }

    public static cbg a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (cbg) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cbg$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbg, a> implements cbj {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbg.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((cbg) this.a).version_ = 0;
            return this;
        }

        public final a a(cbk cbkVar) {
            d();
            cbg.a((cbg) this.a, cbkVar);
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            cbg.a((cbg) this.a, ccuVar);
            return this;
        }
    }

    /* renamed from: cbg$1  reason: invalid class name */
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
                return new cbg();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbg> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbg.class) {
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
        cbg cbgVar = new cbg();
        DEFAULT_INSTANCE = cbgVar;
        cdk.a(cbg.class, cbgVar);
    }

    public static cbg c() {
        return DEFAULT_INSTANCE;
    }

    static /* synthetic */ void a(cbg cbgVar, cbk cbkVar) {
        cbkVar.getClass();
        cbgVar.params_ = cbkVar;
    }

    static /* synthetic */ void a(cbg cbgVar, ccu ccuVar) {
        ccuVar.getClass();
        cbgVar.keyValue_ = ccuVar;
    }
}
