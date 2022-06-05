package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: byj  reason: default package */
/* loaded from: classes2.dex */
public final class byj extends bxs<cab> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(cab cabVar) throws GeneralSecurityException {
        cab cabVar2 = cabVar;
        cgs.b(cabVar2.version_);
        cgs.a(cabVar2.keyValue_.b());
        if (cabVar2.a().ivSize_ == 12 || cabVar2.a().ivSize_ == 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byj() {
        super(cab.class, new bxs.b<bxm, cab>(bxm.class) { // from class: byj.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxm a(cab cabVar) throws GeneralSecurityException {
                cab cabVar2 = cabVar;
                return new cfq(cabVar2.keyValue_.c(), cabVar2.a().ivSize_);
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, cab> d() {
        return new bxs.a<cac, cab>(cac.class) { // from class: byj.2
            @Override // defpackage.bxs.a
            public final /* synthetic */ void a(cac cacVar) throws GeneralSecurityException {
                cac cacVar2 = cacVar;
                cgs.a(cacVar2.keySize_);
                if (cacVar2.a().ivSize_ == 12 || cacVar2.a().ivSize_ == 16) {
                    return;
                }
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ cab b(cac cacVar) throws GeneralSecurityException {
                cac cacVar2 = cacVar;
                return cab.b().a(ccu.a(cgm.a(cacVar2.keySize_))).a(cacVar2.a()).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ cac a(ccu ccuVar) throws InvalidProtocolBufferException {
                return cac.a(ccuVar, cdb.a());
            }
        };
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ cab a(ccu ccuVar) throws InvalidProtocolBufferException {
        return cab.a(ccuVar, cdb.a());
    }
}
