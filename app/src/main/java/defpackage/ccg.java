package defpackage;

import defpackage.cdk;
import defpackage.cdm;

@Deprecated
/* renamed from: ccg  reason: default package */
/* loaded from: classes2.dex */
public final class ccg extends cdk<ccg, a> implements cch {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final ccg DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile cel<ccg> PARSER;
    private String configName_ = "";
    private cdm.i<cbr> entry_ = cep.d();

    private ccg() {
    }

    /* renamed from: ccg$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<ccg, a> implements cch {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(ccg.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: ccg$1  reason: invalid class name */
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
                return new ccg();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", cbr.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<ccg> celVar = PARSER;
                if (celVar == null) {
                    synchronized (ccg.class) {
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
        ccg ccgVar = new ccg();
        DEFAULT_INSTANCE = ccgVar;
        cdk.a(ccg.class, ccgVar);
    }

    public static ccg a() {
        return DEFAULT_INSTANCE;
    }
}
