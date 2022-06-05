package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: bzv  reason: default package */
/* loaded from: classes2.dex */
public final class bzv extends cdk<bzv, a> implements bzy {
    private static final bzv DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile cel<bzv> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public ccu keyValue_ = ccu.a;
    private bzz params_;
    public int version_;

    private bzv() {
    }

    public final bzz a() {
        bzz bzzVar = this.params_;
        return bzzVar == null ? bzz.a() : bzzVar;
    }

    public static bzv a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (bzv) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: bzv$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<bzv, a> implements bzy {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(bzv.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((bzv) this.a).version_ = 0;
            return this;
        }

        public final a a(bzz bzzVar) {
            d();
            bzv.a((bzv) this.a, bzzVar);
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            bzv.a((bzv) this.a, ccuVar);
            return this;
        }
    }

    /* renamed from: bzv$1  reason: invalid class name */
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
                return new bzv();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<bzv> celVar = PARSER;
                if (celVar == null) {
                    synchronized (bzv.class) {
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
        bzv bzvVar = new bzv();
        DEFAULT_INSTANCE = bzvVar;
        cdk.a(bzv.class, bzvVar);
    }

    public static bzv c() {
        return DEFAULT_INSTANCE;
    }

    static /* synthetic */ void a(bzv bzvVar, bzz bzzVar) {
        bzzVar.getClass();
        bzvVar.params_ = bzzVar;
    }

    static /* synthetic */ void a(bzv bzvVar, ccu ccuVar) {
        ccuVar.getClass();
        bzvVar.keyValue_ = ccuVar;
    }
}
