package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;

/* renamed from: cbd  reason: default package */
/* loaded from: classes2.dex */
public final class cbd extends cdk<cbd, a> implements cbe {
    private static final cbd DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile cel<cbd> PARSER;
    public ccu encryptedKeyset_ = ccu.a;
    private cbu keysetInfo_;

    private cbd() {
    }

    public static cbd a(byte[] bArr, cdb cdbVar) throws InvalidProtocolBufferException {
        return (cbd) cdk.a(DEFAULT_INSTANCE, bArr, cdbVar);
    }

    public static a a() {
        return DEFAULT_INSTANCE.l();
    }

    /* renamed from: cbd$a */
    /* loaded from: classes2.dex */
    public static final class a extends cdk.a<cbd, a> implements cbe {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(cbd.DEFAULT_INSTANCE);
        }

        public final a a(ccu ccuVar) {
            d();
            cbd.a((cbd) this.a, ccuVar);
            return this;
        }

        public final a a(cbu cbuVar) {
            d();
            cbd.a((cbd) this.a, cbuVar);
            return this;
        }
    }

    /* renamed from: cbd$1  reason: invalid class name */
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
                return new cbd();
            case 2:
                return new a((byte) 0);
            case 3:
                return a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cel<cbd> celVar = PARSER;
                if (celVar == null) {
                    synchronized (cbd.class) {
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
        cbd cbdVar = new cbd();
        DEFAULT_INSTANCE = cbdVar;
        cdk.a(cbd.class, cbdVar);
    }

    static /* synthetic */ void a(cbd cbdVar, ccu ccuVar) {
        ccuVar.getClass();
        cbdVar.encryptedKeyset_ = ccuVar;
    }

    static /* synthetic */ void a(cbd cbdVar, cbu cbuVar) {
        cbuVar.getClass();
        cbdVar.keysetInfo_ = cbuVar;
    }
}
