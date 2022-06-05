package defpackage;

import defpackage.cdk;

/* renamed from: cbk  reason: default package */
/* loaded from: classes2.dex */
public final class cbk extends cdk<cbk, a> implements cbl {
    private static final cbk DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile cel<cbk> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    public int tagSize_;

    private cbk() {
    }

    public final cbf a() {
        cbf forNumber = cbf.forNumber(this.hash_);
        return forNumber == null ? cbf.UNRECOGNIZED : forNumber;
    }

    /* renamed from: cbk$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbk, a> implements cbl {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbk.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: cbk$1  reason: invalid class name */
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
                return new cbk();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbk> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbk.class) {
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
        cbk cbkVar = new cbk();
        DEFAULT_INSTANCE = cbkVar;
        cdk.a(cbk.class, cbkVar);
    }

    public static cbk b() {
        return DEFAULT_INSTANCE;
    }
}
