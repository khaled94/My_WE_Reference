package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: bzl  reason: default package */
/* loaded from: classes2.dex */
public final class bzl extends cdk<bzl, a> implements bzo {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final bzl DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile cel<bzl> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private bzv aesCtrKey_;
    private cbg hmacKey_;
    public int version_;

    private bzl() {
    }

    public final bzv a() {
        bzv bzvVar = this.aesCtrKey_;
        return bzvVar == null ? bzv.c() : bzvVar;
    }

    public final cbg b() {
        cbg cbgVar = this.hmacKey_;
        return cbgVar == null ? cbg.c() : cbgVar;
    }

    public static bzl a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (bzl) cdk.a(DEFAULT_INSTANCE, ccuVar, cdbVar);
    }

    public static a c() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: bzl$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<bzl, a> implements bzo {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(bzl.DEFAULT_INSTANCE);
        }

        public final a a() {
            d();
            ((bzl) this.a).version_ = 0;
            return this;
        }

        public final a a(bzv bzvVar) {
            d();
            bzl.a((bzl) this.a, bzvVar);
            return this;
        }

        public final a a(cbg cbgVar) {
            d();
            bzl.a((bzl) this.a, cbgVar);
            return this;
        }
    }

    /* renamed from: bzl$1  reason: invalid class name */
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
                return new bzl();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<bzl> celVar = PARSER;
                if (celVar == null) {
                    synchronized (bzl.class) {
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
        bzl bzlVar = new bzl();
        DEFAULT_INSTANCE = bzlVar;
        cdk.a(bzl.class, bzlVar);
    }

    static /* synthetic */ void a(bzl bzlVar, bzv bzvVar) {
        bzvVar.getClass();
        bzlVar.aesCtrKey_ = bzvVar;
    }

    static /* synthetic */ void a(bzl bzlVar, cbg cbgVar) {
        cbgVar.getClass();
        bzlVar.hmacKey_ = cbgVar;
    }
}
