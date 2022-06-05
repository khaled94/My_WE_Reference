package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: cfh  reason: default package */
/* loaded from: classes2.dex */
public final class cfh extends bxs<bzp> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(bzp bzpVar) throws GeneralSecurityException {
        bzp bzpVar2 = bzpVar;
        cgs.b(bzpVar2.version_);
        if (bzpVar2.keyValue_.b() < 16) {
            throw new GeneralSecurityException("key_value must have at least 16 bytes");
        }
        if (bzpVar2.keyValue_.b() < bzpVar2.a().derivedKeySize_) {
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
        a(bzpVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cfh() {
        super(bzp.class, new bxs.b<byd, bzp>(byd.class) { // from class: cfh.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ byd a(bzp bzpVar) throws GeneralSecurityException {
                bzp bzpVar2 = bzpVar;
                return new cfo(bzpVar2.keyValue_.c(), cfm.a(bzpVar2.a().a()), bzpVar2.a().derivedKeySize_, cfm.a(bzpVar2.a().b().a()), bzpVar2.a().b().tagSize_, bzpVar2.a().ciphertextSegmentSize_);
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, bzp> d() {
        return new bxs.a<bzq, bzp>(bzq.class) { // from class: cfh.2
            @Override // defpackage.bxs.a
            public final /* synthetic */ void a(bzq bzqVar) throws GeneralSecurityException {
                bzq bzqVar2 = bzqVar;
                if (bzqVar2.keySize_ < 16) {
                    throw new GeneralSecurityException("key_size must be at least 16 bytes");
                }
                cfh.a(bzqVar2.a());
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ bzp b(bzq bzqVar) throws GeneralSecurityException {
                bzq bzqVar2 = bzqVar;
                return bzp.b().a(ccu.a(cgm.a(bzqVar2.keySize_))).a(bzqVar2.a()).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ bzq a(ccu ccuVar) throws InvalidProtocolBufferException {
                return bzq.a(ccuVar, cdb.a());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cfh$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cbf.values().length];
            a = iArr;
            try {
                iArr[cbf.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cbf.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cbf.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static void a(bzt bztVar) throws GeneralSecurityException {
        cgs.a(bztVar.derivedKeySize_);
        if (bztVar.a() == cbf.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if (bztVar.b().a() == cbf.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
        cbk b = bztVar.b();
        if (b.tagSize_ < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = AnonymousClass3.a[b.a().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new GeneralSecurityException("unknown hash type");
                }
                if (b.tagSize_ > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (b.tagSize_ > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (b.tagSize_ > 20) {
            throw new GeneralSecurityException("tag size too big");
        }
        if (bztVar.ciphertextSegmentSize_ < bztVar.derivedKeySize_ + bztVar.b().tagSize_ + 2 + 7) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
        }
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ bzp a(ccu ccuVar) throws InvalidProtocolBufferException {
        return bzp.a(ccuVar, cdb.a());
    }
}
