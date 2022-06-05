package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;

/* renamed from: byk  reason: default package */
/* loaded from: classes2.dex */
public final class byk extends bxs<can> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(can canVar) throws GeneralSecurityException {
        can canVar2 = canVar;
        cgs.b(canVar2.version_);
        cgs.a(canVar2.keyValue_.b());
    }

    public byk() {
        super(can.class, new bxs.b<bxm, can>(bxm.class) { // from class: byk.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxm a(can canVar) throws GeneralSecurityException {
                return new cfs(canVar.keyValue_.c());
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, can> d() {
        return new bxs.a<cao, can>(cao.class) { // from class: byk.2
            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ void a(cao caoVar) throws GeneralSecurityException {
                cgs.a(caoVar.keySize_);
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ can b(cao caoVar) throws GeneralSecurityException {
                return can.a().a(ccu.a(cgm.a(caoVar.keySize_))).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ cao a(ccu ccuVar) throws InvalidProtocolBufferException {
                return cao.a(ccuVar, cdb.a());
            }
        };
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ can a(ccu ccuVar) throws InvalidProtocolBufferException {
        return can.a(ccuVar, cdb.a());
    }
}
