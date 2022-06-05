package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: byl  reason: default package */
/* loaded from: classes2.dex */
public final class byl extends bxs<car> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // defpackage.bxs
    public final /* synthetic */ void a(car carVar) throws GeneralSecurityException {
        car carVar2 = carVar;
        cgs.b(carVar2.version_);
        cgs.a(carVar2.keyValue_.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byl() {
        super(car.class, new bxs.b<bxm, car>(bxm.class) { // from class: byl.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxm a(car carVar) throws GeneralSecurityException {
                return new byr(carVar.keyValue_.c());
            }
        });
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, car> d() {
        return new bxs.a<cas, car>(cas.class) { // from class: byl.2
            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ void a(cas casVar) throws GeneralSecurityException {
                cgs.a(casVar.keySize_);
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ car b(cas casVar) throws GeneralSecurityException {
                return car.a().a(ccu.a(cgm.a(casVar.keySize_))).a().g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ cas a(ccu ccuVar) throws InvalidProtocolBufferException {
                return cas.a(ccuVar, cdb.a());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ car a(ccu ccuVar) throws InvalidProtocolBufferException {
        return car.a(ccuVar, cdb.a());
    }
}
