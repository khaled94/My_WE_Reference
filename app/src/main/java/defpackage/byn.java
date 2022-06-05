package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: byn  reason: default package */
/* loaded from: classes2.dex */
public final class byn extends bxs<cbx> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(cbx cbxVar) throws GeneralSecurityException {
        cgs.b(cbxVar.version_);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byn() {
        super(cbx.class, new bxs.b<bxm, cbx>(bxm.class) { // from class: byn.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxm a(cbx cbxVar) throws GeneralSecurityException {
                cbx cbxVar2 = cbxVar;
                String str = (cbxVar2.params_ == null ? cby.a() : cbxVar2.params_).keyUri_;
                return bxy.a(str).b(str);
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.REMOTE;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, cbx> d() {
        return new bxs.a<cby, cbx>(cby.class) { // from class: byn.2
            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ void a(cby cbyVar) throws GeneralSecurityException {
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ cbx b(cby cbyVar) throws GeneralSecurityException {
                return cbx.a().a(cbyVar).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ cby a(ccu ccuVar) throws InvalidProtocolBufferException {
                return cby.a(ccuVar, cdb.a());
            }
        };
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ cbx a(ccu ccuVar) throws InvalidProtocolBufferException {
        return cbx.a(ccuVar, cdb.a());
    }
}
