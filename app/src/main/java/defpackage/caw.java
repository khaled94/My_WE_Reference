package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: caw  reason: default package */
/* loaded from: classes2.dex */
public final class caw extends cdk<caw, a> implements cax {
    private static final caw DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile cel<caw> PARSER;
    public int keySize_;

    private caw() {
    }

    public static caw a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (caw) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: caw$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<caw, a> implements cax {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(caw.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((caw) this.a).keySize_ = 64;
            return this;
        }
    }

    /* renamed from: caw$1  reason: invalid class name */
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
                return new caw();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<caw> celVar = PARSER;
                if (celVar == null) {
                    synchronized (caw.class) {
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
        caw cawVar = new caw();
        DEFAULT_INSTANCE = cawVar;
        cdk.a(caw.class, cawVar);
    }
}
