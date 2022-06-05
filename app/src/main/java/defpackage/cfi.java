package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: cfi  reason: default package */
/* loaded from: classes2.dex */
public final class cfi extends bxs<cah> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(cah cahVar) throws GeneralSecurityException {
        cah cahVar2 = cahVar;
        cgs.b(cahVar2.version_);
        a(cahVar2.a());
    }

    public cfi() {
        super(cah.class, new bxs.b<byd, cah>(byd.class) { // from class: cfi.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ byd a(cah cahVar) throws GeneralSecurityException {
                cah cahVar2 = cahVar;
                return new cfr(cahVar2.keyValue_.c(), cfm.a(cahVar2.a().a()), cahVar2.a().derivedKeySize_, cahVar2.a().ciphertextSegmentSize_);
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, cah> d() {
        return new bxs.a<cai, cah>(cai.class) { // from class: cfi.2
            @Override // defpackage.bxs.a
            public final /* synthetic */ void a(cai caiVar) throws GeneralSecurityException {
                cai caiVar2 = caiVar;
                if (caiVar2.keySize_ < 16) {
                    throw new GeneralSecurityException("key_size must be at least 16 bytes");
                }
                cfi.a(caiVar2.a());
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ cah b(cai caiVar) throws GeneralSecurityException {
                cai caiVar2 = caiVar;
                return cah.b().a(ccu.a(cgm.a(caiVar2.keySize_))).a(caiVar2.a()).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ cai a(ccu ccuVar) throws InvalidProtocolBufferException {
                return cai.a(ccuVar, cdb.a());
            }
        };
    }

    static void a(cal calVar) throws GeneralSecurityException {
        cgs.a(calVar.derivedKeySize_);
        if (calVar.a() == cbf.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if (calVar.ciphertextSegmentSize_ < calVar.derivedKeySize_ + 7 + 16 + 2) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ cah a(ccu ccuVar) throws InvalidProtocolBufferException {
        return cah.a(ccuVar, cdb.a());
    }
}
