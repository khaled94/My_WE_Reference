package defpackage;

import defpackage.cdk;

/* renamed from: bzz  reason: default package */
/* loaded from: classes2.dex */
public final class bzz extends cdk<bzz, a> implements caa {
    private static final bzz DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile cel<bzz> PARSER;
    public int ivSize_;

    private bzz() {
    }

    /* renamed from: bzz$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<bzz, a> implements caa {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(bzz.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: bzz$1  reason: invalid class name */
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
                return new bzz();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<bzz> celVar = PARSER;
                if (celVar == null) {
                    synchronized (bzz.class) {
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
        bzz bzzVar = new bzz();
        DEFAULT_INSTANCE = bzzVar;
        cdk.a(bzz.class, bzzVar);
    }

    public static bzz a() {
        return DEFAULT_INSTANCE;
    }
}
