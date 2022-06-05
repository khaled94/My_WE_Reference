package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: cah  reason: default package */
/* loaded from: classes2.dex */
public final class cah extends cdk<cah, a> implements cak {
    private static final cah DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile cel<cah> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public ccu keyValue_ = ccu.a;
    private cal params_;
    public int version_;

    private cah() {
    }

    public final cal a() {
        cal calVar = this.params_;
        return calVar == null ? cal.c() : calVar;
    }

    public static cah a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (cah) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cah$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cah, a> implements cak {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cah.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((cah) this.a).version_ = 0;
            return this;
        }

        public final a a(cal calVar) {
            d();
            cah.a((cah) this.a, calVar);
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            cah.a((cah) this.a, ccuVar);
            return this;
        }
    }

    /* renamed from: cah$1  reason: invalid class name */
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
                return new cah();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cah> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cah.class) {
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
        cah cahVar = new cah();
        DEFAULT_INSTANCE = cahVar;
        cdk.a(cah.class, cahVar);
    }

    static /* synthetic */ void a(cah cahVar, cal calVar) {
        calVar.getClass();
        cahVar.params_ = calVar;
    }

    static /* synthetic */ void a(cah cahVar, ccu ccuVar) {
        ccuVar.getClass();
        cahVar.keyValue_ = ccuVar;
    }
}
