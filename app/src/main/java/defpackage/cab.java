package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: cab  reason: default package */
/* loaded from: classes2.dex */
public final class cab extends cdk<cab, a> implements cae {
    private static final cab DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile cel<cab> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public ccu keyValue_ = ccu.a;
    private caf params_;
    public int version_;

    private cab() {
    }

    public final caf a() {
        caf cafVar = this.params_;
        return cafVar == null ? caf.a() : cafVar;
    }

    public static cab a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (cab) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cab$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cab, a> implements cae {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cab.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((cab) this.a).version_ = 0;
            return this;
        }

        public final a a(caf cafVar) {
            d();
            cab.a((cab) this.a, cafVar);
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            cab.a((cab) this.a, ccuVar);
            return this;
        }
    }

    /* renamed from: cab$1  reason: invalid class name */
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
                return new cab();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cab> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cab.class) {
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
        cab cabVar = new cab();
        DEFAULT_INSTANCE = cabVar;
        cdk.a(cab.class, cabVar);
    }

    static /* synthetic */ void a(cab cabVar, caf cafVar) {
        cafVar.getClass();
        cabVar.params_ = cafVar;
    }

    static /* synthetic */ void a(cab cabVar, ccu ccuVar) {
        ccuVar.getClass();
        cabVar.keyValue_ = ccuVar;
    }
}
