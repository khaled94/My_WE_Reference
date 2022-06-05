package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: cbh  reason: default package */
/* loaded from: classes2.dex */
public final class cbh extends cdk<cbh, a> implements cbi {
    private static final cbh DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile cel<cbh> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    public int keySize_;
    private cbk params_;
    private int version_;

    private cbh() {
    }

    public final cbk a() {
        cbk cbkVar = this.params_;
        return cbkVar == null ? cbk.b() : cbkVar;
    }

    public static cbh a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (cbh) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    /* renamed from: cbh$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbh, a> implements cbi {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbh.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: cbh$1  reason: invalid class name */
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
                return new cbh();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbh> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbh.class) {
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
        cbh cbhVar = new cbh();
        DEFAULT_INSTANCE = cbhVar;
        cdk.a(cbh.class, cbhVar);
    }

    public static cbh b() {
        return DEFAULT_INSTANCE;
    }
}
