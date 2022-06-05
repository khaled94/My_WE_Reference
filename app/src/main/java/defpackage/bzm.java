package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: bzm  reason: default package */
/* loaded from: classes2.dex */
public final class bzm extends cdk<bzm, a> implements bzn {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final bzm DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile cel<bzm> PARSER;
    private bzw aesCtrKeyFormat_;
    private cbh hmacKeyFormat_;

    private bzm() {
    }

    public final bzw a() {
        bzw bzwVar = this.aesCtrKeyFormat_;
        return bzwVar == null ? bzw.b() : bzwVar;
    }

    public final cbh b() {
        cbh cbhVar = this.hmacKeyFormat_;
        return cbhVar == null ? cbh.b() : cbhVar;
    }

    public static bzm a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (bzm) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    /* renamed from: bzm$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<bzm, a> implements bzn {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(bzm.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: bzm$1  reason: invalid class name */
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
                return new bzm();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<bzm> celVar = PARSER;
                if (celVar == null) {
                    synchronized (bzm.class) {
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
        bzm bzmVar = new bzm();
        DEFAULT_INSTANCE = bzmVar;
        cdk.a(bzm.class, bzmVar);
    }
}
