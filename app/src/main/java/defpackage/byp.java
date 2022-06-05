package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: byp  reason: default package */
/* loaded from: classes2.dex */
public final class byp extends bxs<ccb> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(ccb ccbVar) throws GeneralSecurityException {
        cgs.b(ccbVar.version_);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byp() {
        super(ccb.class, new bxs.b<bxm, ccb>(bxm.class) { // from class: byp.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxm a(ccb ccbVar) throws GeneralSecurityException {
                ccb ccbVar2 = ccbVar;
                String str = ccbVar2.a().kekUri_;
                bxm b = bxy.a(str).b(str);
                ccc a = ccbVar2.a();
                return new byo(a.dekTemplate_ == null ? cbp.b() : a.dekTemplate_, b);
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.REMOTE;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, ccb> d() {
        return new bxs.a<ccc, ccb>(ccc.class) { // from class: byp.2
            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ void a(ccc cccVar) throws GeneralSecurityException {
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ ccb b(ccc cccVar) throws GeneralSecurityException {
                return ccb.b().a(cccVar).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ ccc a(ccu ccuVar) throws InvalidProtocolBufferException {
                return ccc.a(ccuVar, cdb.a());
            }
        };
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ ccb a(ccu ccuVar) throws InvalidProtocolBufferException {
        return ccb.a(ccuVar, cdb.a());
    }
}
