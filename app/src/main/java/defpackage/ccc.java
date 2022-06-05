package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: ccc  reason: default package */
/* loaded from: classes2.dex */
public final class ccc extends cdk<ccc, a> implements ccd {
    private static final ccc DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile cel<ccc> PARSER;
    public cbp dekTemplate_;
    public String kekUri_ = "";

    private ccc() {
    }

    public static ccc a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (ccc) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    /* renamed from: ccc$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<ccc, a> implements ccd {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(ccc.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: ccc$1  reason: invalid class name */
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
                return new ccc();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<ccc> celVar = PARSER;
                if (celVar == null) {
                    synchronized (ccc.class) {
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
        ccc cccVar = new ccc();
        DEFAULT_INSTANCE = cccVar;
        cdk.a(ccc.class, cccVar);
    }

    public static ccc a() {
        return DEFAULT_INSTANCE;
    }
}
