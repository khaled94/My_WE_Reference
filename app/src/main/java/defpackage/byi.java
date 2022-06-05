package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: byi  reason: default package */
/* loaded from: classes2.dex */
public final class byi extends bxs<bzv> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ void a(bzv bzvVar) throws GeneralSecurityException {
        a2(bzvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byi() {
        super(bzv.class, new bxs.b<cgg, bzv>(cgg.class) { // from class: byi.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ cgg a(bzv bzvVar) throws GeneralSecurityException {
                bzv bzvVar2 = bzvVar;
                return new cfp(bzvVar2.keyValue_.c(), bzvVar2.a().ivSize_);
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, bzv> d() {
        return new bxs.a<bzw, bzv>(bzw.class) { // from class: byi.2
            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ void a(bzw bzwVar) throws GeneralSecurityException {
                bzw bzwVar2 = bzwVar;
                cgs.a(bzwVar2.keySize_);
                byi.a(bzwVar2.a());
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ bzv b(bzw bzwVar) throws GeneralSecurityException {
                bzw bzwVar2 = bzwVar;
                return bzv.b().a(bzwVar2.a()).a(ccu.a(cgm.a(bzwVar2.keySize_))).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ bzw a(ccu ccuVar) throws InvalidProtocolBufferException {
                return bzw.a(ccuVar, cdb.a());
            }
        };
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public static void a2(bzv bzvVar) throws GeneralSecurityException {
        cgs.b(bzvVar.version_);
        cgs.a(bzvVar.keyValue_.b());
        a(bzvVar.a());
    }

    static void a(bzz bzzVar) throws GeneralSecurityException {
        if (bzzVar.ivSize_ < 12 || bzzVar.ivSize_ > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ bzv a(ccu ccuVar) throws InvalidProtocolBufferException {
        return bzv.a(ccuVar, cdb.a());
    }
}
