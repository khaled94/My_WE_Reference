package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: byq  reason: default package */
/* loaded from: classes2.dex */
public final class byq extends bxs<cci> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(cci cciVar) throws GeneralSecurityException {
        cci cciVar2 = cciVar;
        cgs.b(cciVar2.version_);
        if (cciVar2.keyValue_.b() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byq() {
        super(cci.class, new bxs.b<bxm, cci>(bxm.class) { // from class: byq.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxm a(cci cciVar) throws GeneralSecurityException {
                return new cgu(cciVar.keyValue_.c());
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, cci> d() {
        return new bxs.a<ccj, cci>(ccj.class) { // from class: byq.2
            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ void a(ccj ccjVar) throws GeneralSecurityException {
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ cci b(ccj ccjVar) throws GeneralSecurityException {
                return cci.a().a().a(ccu.a(cgm.a(32))).g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ ccj a(ccu ccuVar) throws InvalidProtocolBufferException {
                return ccj.a(ccuVar, cdb.a());
            }
        };
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ cci a(ccu ccuVar) throws InvalidProtocolBufferException {
        return cci.a(ccuVar, cdb.a());
    }
}
