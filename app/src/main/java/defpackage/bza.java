package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: bza  reason: default package */
/* loaded from: classes2.dex */
public final class bza extends bxs<bzf> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(bzf bzfVar) throws GeneralSecurityException {
        bzf bzfVar2 = bzfVar;
        cgs.b(bzfVar2.version_);
        a(bzfVar2.keyValue_.b());
        a(bzfVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bza() {
        super(bzf.class, new bxs.b<bxz, bzf>(bxz.class) { // from class: bza.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxz a(bzf bzfVar) throws GeneralSecurityException {
                bzf bzfVar2 = bzfVar;
                return new cgl(new cgj(bzfVar2.keyValue_.c()), bzfVar2.a().tagSize_);
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    static void a(int i) throws GeneralSecurityException {
        if (i == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // defpackage.bxs
    public final bxs.a<?, bzf> d() {
        return new bxs.a<bzg, bzf>(bzg.class) { // from class: bza.2
            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ void a(bzg bzgVar) throws GeneralSecurityException {
                bzg bzgVar2 = bzgVar;
                bza.a(bzgVar2.a());
                bza.a(bzgVar2.keySize_);
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ bzf b(bzg bzgVar) throws GeneralSecurityException {
                bzg bzgVar2 = bzgVar;
                return bzf.b().a().a(ccu.a(cgm.a(bzgVar2.keySize_))).a(bzgVar2.a()).g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ bzg a(ccu ccuVar) throws InvalidProtocolBufferException {
                return bzg.a(ccuVar, cdb.a());
            }
        };
    }

    static void a(bzj bzjVar) throws GeneralSecurityException {
        if (bzjVar.tagSize_ < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (bzjVar.tagSize_ > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ bzf a(ccu ccuVar) throws InvalidProtocolBufferException {
        return bzf.a(ccuVar, cdb.a());
    }
}
