package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: byh  reason: default package */
/* loaded from: classes2.dex */
public final class byh extends bxs<bzl> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(bzl bzlVar) throws GeneralSecurityException {
        bzl bzlVar2 = bzlVar;
        cgs.b(bzlVar2.version_);
        new byi();
        byi.a2(bzlVar2.a());
        new bzb();
        bzb.a2(bzlVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byh() {
        super(bzl.class, new bxs.b<bxm, bzl>(bxm.class) { // from class: byh.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxm a(bzl bzlVar) throws GeneralSecurityException {
                bzl bzlVar2 = bzlVar;
                return new cgb((cgg) new byi().a(bzlVar2.a(), cgg.class), (bxz) new bzb().a(bzlVar2.b(), bxz.class), bzlVar2.b().a().tagSize_);
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, bzl> d() {
        return new bxs.a<bzm, bzl>(bzm.class) { // from class: byh.2
            @Override // defpackage.bxs.a
            public final /* synthetic */ void a(bzm bzmVar) throws GeneralSecurityException {
                bzm bzmVar2 = bzmVar;
                new byi().d().a((bxs.a<?, bzv>) bzmVar2.a());
                new bzb().d().a((bxs.a<?, cbg>) bzmVar2.b());
                cgs.a(bzmVar2.a().keySize_);
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ bzl b(bzm bzmVar) throws GeneralSecurityException {
                bzm bzmVar2 = bzmVar;
                return bzl.c().a(new byi().d().b(bzmVar2.a())).a(new bzb().d().b(bzmVar2.b())).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ bzm a(ccu ccuVar) throws InvalidProtocolBufferException {
                return bzm.a(ccuVar, cdb.a());
            }
        };
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ bzl a(ccu ccuVar) throws InvalidProtocolBufferException {
        return bzl.a(ccuVar, cdb.a());
    }
}
