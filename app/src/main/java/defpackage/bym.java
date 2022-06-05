package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: bym  reason: default package */
/* loaded from: classes2.dex */
public final class bym extends bxs<caz> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(caz cazVar) throws GeneralSecurityException {
        caz cazVar2 = cazVar;
        cgs.b(cazVar2.version_);
        if (cazVar2.keyValue_.b() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bym() {
        super(caz.class, new bxs.b<bxm, caz>(bxm.class) { // from class: bym.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxm a(caz cazVar) throws GeneralSecurityException {
                return new cfz(cazVar.keyValue_.c());
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, caz> d() {
        return new bxs.a<cba, caz>(cba.class) { // from class: bym.2
            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ void a(cba cbaVar) throws GeneralSecurityException {
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ caz b(cba cbaVar) throws GeneralSecurityException {
                return caz.a().a().a(ccu.a(cgm.a(32))).g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ cba a(ccu ccuVar) throws InvalidProtocolBufferException {
                return cba.a(ccuVar, cdb.a());
            }
        };
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ caz a(ccu ccuVar) throws InvalidProtocolBufferException {
        return caz.a(ccuVar, cdb.a());
    }
}
