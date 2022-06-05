package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: cai  reason: default package */
/* loaded from: classes2.dex */
public final class cai extends cdk<cai, a> implements caj {
    private static final cai DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile cel<cai> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    public int keySize_;
    private cal params_;
    private int version_;

    private cai() {
    }

    public final cal a() {
        cal calVar = this.params_;
        return calVar == null ? cal.c() : calVar;
    }

    public static cai a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (cai) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cai$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cai, a> implements caj {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cai.DEFAULT_INSTANCE);
        }

        public final a a(cal calVar) {
            d();
            cai.a((cai) this.a, calVar);
            return this;
        }

        public final a a() {
            d();
            ((cai) this.a).keySize_ = 32;
            return this;
        }
    }

    /* renamed from: cai$1  reason: invalid class name */
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
                return new cai();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cai> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cai.class) {
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
        cai caiVar = new cai();
        DEFAULT_INSTANCE = caiVar;
        cdk.a(cai.class, caiVar);
    }

    static /* synthetic */ void a(cai caiVar, cal calVar) {
        calVar.getClass();
        caiVar.params_ = calVar;
    }
}
