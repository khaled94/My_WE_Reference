package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: ccb  reason: default package */
/* loaded from: classes2.dex */
public final class ccb extends cdk<ccb, a> implements cce {
    private static final ccb DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile cel<ccb> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ccc params_;
    public int version_;

    private ccb() {
    }

    public final ccc a() {
        ccc cccVar = this.params_;
        return cccVar == null ? ccc.a() : cccVar;
    }

    public static ccb a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (ccb) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: ccb$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<ccb, a> implements cce {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(ccb.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((ccb) this.a).version_ = 0;
            return this;
        }

        public final a a(ccc cccVar) {
            d();
            ccb.a((ccb) this.a, cccVar);
            return this;
        }
    }

    /* renamed from: ccb$1  reason: invalid class name */
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
                return new ccb();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<ccb> celVar = PARSER;
                if (celVar == null) {
                    synchronized (ccb.class) {
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
        ccb ccbVar = new ccb();
        DEFAULT_INSTANCE = ccbVar;
        cdk.a(ccb.class, ccbVar);
    }

    static /* synthetic */ void a(ccb ccbVar, ccc cccVar) {
        cccVar.getClass();
        ccbVar.params_ = cccVar;
    }
}
