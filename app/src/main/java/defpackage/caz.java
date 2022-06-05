package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: caz  reason: default package */
/* loaded from: classes2.dex */
public final class caz extends cdk<caz, a> implements cbc {
    private static final caz DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile cel<caz> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public ccu keyValue_ = ccu.a;
    public int version_;

    private caz() {
    }

    public static caz a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (caz) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: caz$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<caz, a> implements cbc {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(caz.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((caz) this.a).version_ = 0;
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            caz.a((caz) this.a, ccuVar);
            return this;
        }
    }

    /* renamed from: caz$1  reason: invalid class name */
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
                return new caz();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<caz> celVar = PARSER;
                if (celVar == null) {
                    synchronized (caz.class) {
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
        caz cazVar = new caz();
        DEFAULT_INSTANCE = cazVar;
        cdk.a(caz.class, cazVar);
    }

    static /* synthetic */ void a(caz cazVar, ccu ccuVar) {
        ccuVar.getClass();
        cazVar.keyValue_ = ccuVar;
    }
}
