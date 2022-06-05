package defpackage;

import defpackage.cdk;

/* renamed from: bzj  reason: default package */
/* loaded from: classes2.dex */
public final class bzj extends cdk<bzj, a> implements bzk {
    private static final bzj DEFAULT_INSTANCE;
    private static volatile cel<bzj> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    public int tagSize_;

    private bzj() {
    }

    /* renamed from: bzj$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<bzj, a> implements bzk {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(bzj.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: bzj$1  reason: invalid class name */
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
                return new bzj();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<bzj> celVar = PARSER;
                if (celVar == null) {
                    synchronized (bzj.class) {
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
        bzj bzjVar = new bzj();
        DEFAULT_INSTANCE = bzjVar;
        cdk.a(bzj.class, bzjVar);
    }

    public static bzj a() {
        return DEFAULT_INSTANCE;
    }
}
