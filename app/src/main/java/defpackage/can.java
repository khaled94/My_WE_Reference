package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: can  reason: default package */
/* loaded from: classes2.dex */
public final class can extends cdk<can, a> implements caq {
    private static final can DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile cel<can> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public ccu keyValue_ = ccu.a;
    public int version_;

    private can() {
    }

    public static can a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (can) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: can$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<can, a> implements caq {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(can.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((can) this.a).version_ = 0;
            return this;
        }

        public final a a(ccu ccuVar) {
            d();
            can.a((can) this.a, ccuVar);
            return this;
        }
    }

    /* renamed from: can$1  reason: invalid class name */
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
                return new can();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<can> celVar = PARSER;
                if (celVar == null) {
                    synchronized (can.class) {
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
        can canVar = new can();
        DEFAULT_INSTANCE = canVar;
        cdk.a(can.class, canVar);
    }

    static /* synthetic */ void a(can canVar, ccu ccuVar) {
        ccuVar.getClass();
        canVar.keyValue_ = ccuVar;
    }
}
