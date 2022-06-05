package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* renamed from: bys  reason: default package */
/* loaded from: classes2.dex */
public final class bys extends bxs<cav> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(cav cavVar) throws GeneralSecurityException {
        cav cavVar2 = cavVar;
        cgs.b(cavVar2.version_);
        if (cavVar2.keyValue_.b() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + cavVar2.keyValue_.b() + ". Valid keys must have 64 bytes.");
    }

    public bys() {
        super(cav.class, new bxs.b<bxo, cav>(bxo.class) { // from class: bys.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxo a(cav cavVar) throws GeneralSecurityException {
                return new cft(cavVar.keyValue_.c());
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, cav> d() {
        return new bxs.a<caw, cav>(caw.class) { // from class: bys.2
            @Override // defpackage.bxs.a
            public final /* synthetic */ void a(caw cawVar) throws GeneralSecurityException {
                caw cawVar2 = cawVar;
                if (cawVar2.keySize_ == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + cawVar2.keySize_ + ". Valid keys must have 64 bytes.");
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ cav b(caw cawVar) throws GeneralSecurityException {
                return cav.a().a(ccu.a(cgm.a(cawVar.keySize_))).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ caw a(ccu ccuVar) throws InvalidProtocolBufferException {
                return caw.a(ccuVar, cdb.a());
            }
        };
    }

    public static void e() throws GeneralSecurityException {
        byc.a((bxs) new bys());
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ cav a(ccu ccuVar) throws InvalidProtocolBufferException {
        return cav.a(ccuVar, cdb.a());
    }
}
