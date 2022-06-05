package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: car  reason: default package */
/* loaded from: classes2.dex */
public final class car extends cdk<car, a> implements cau {
    private static final car DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile cel<car> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public ccu keyValue_ = ccu.a;
    public int version_;

    private car() {
    }

    public static car a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (car) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: car$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<car, a> implements cau {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(car.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((car) this.a).version_ = 0;
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            car.a((car) this.a, ccuVar);
            return this;
        }
    }

    /* renamed from: car$1  reason: invalid class name */
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
                return new car();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<car> celVar = PARSER;
                if (celVar == null) {
                    synchronized (car.class) {
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
        car carVar = new car();
        DEFAULT_INSTANCE = carVar;
        cdk.a(car.class, carVar);
    }

    static /* synthetic */ void a(car carVar, ccu ccuVar) {
        ccuVar.getClass();
        carVar.keyValue_ = ccuVar;
    }
}
