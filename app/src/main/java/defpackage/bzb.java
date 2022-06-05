package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cbm;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bzb  reason: default package */
/* loaded from: classes2.dex */
public final class bzb extends bxs<cbg> {
    @Override // defpackage.bxs
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ void a(cbg cbgVar) throws GeneralSecurityException {
        a2(cbgVar);
    }

    public bzb() {
        super(cbg.class, new bxs.b<bxz, cbg>(bxz.class) { // from class: bzb.1
            @Override // defpackage.bxs.b
            public final /* synthetic */ bxz a(cbg cbgVar) throws GeneralSecurityException {
                cbg cbgVar2 = cbgVar;
                cbf a = cbgVar2.a().a();
                SecretKeySpec secretKeySpec = new SecretKeySpec(cbgVar2.keyValue_.c(), "HMAC");
                int i = cbgVar2.a().tagSize_;
                int i2 = AnonymousClass3.a[a.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new cgl(new cgk("HMACSHA256", secretKeySpec), i);
                    }
                    if (i2 == 3) {
                        return new cgl(new cgk("HMACSHA512", secretKeySpec), i);
                    }
                    throw new GeneralSecurityException("unknown hash");
                }
                return new cgl(new cgk("HMACSHA1", secretKeySpec), i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bzb$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cbf.values().length];
            a = iArr;
            try {
                iArr[cbf.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cbf.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cbf.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // defpackage.bxs
    public final cbm.b b() {
        return cbm.b.SYMMETRIC;
    }

    @Override // defpackage.bxs
    public final bxs.a<?, cbg> d() {
        return new bxs.a<cbh, cbg>(cbh.class) { // from class: bzb.2
            @Override // defpackage.bxs.a
            public final /* synthetic */ void a(cbh cbhVar) throws GeneralSecurityException {
                cbh cbhVar2 = cbhVar;
                if (cbhVar2.keySize_ < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                bzb.a(cbhVar2.a());
            }

            @Override // defpackage.bxs.a
            public final /* synthetic */ cbg b(cbh cbhVar) throws GeneralSecurityException {
                cbh cbhVar2 = cbhVar;
                return cbg.b().a().a(cbhVar2.a()).a(ccu.a(cgm.a(cbhVar2.keySize_))).g();
            }

            @Override // defpackage.bxs.a
            public final /* bridge */ /* synthetic */ cbh a(ccu ccuVar) throws InvalidProtocolBufferException {
                return cbh.a(ccuVar, cdb.a());
            }
        };
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public static void a2(cbg cbgVar) throws GeneralSecurityException {
        cgs.b(cbgVar.version_);
        if (cbgVar.keyValue_.b() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        a(cbgVar.a());
    }

    static void a(cbk cbkVar) throws GeneralSecurityException {
        if (cbkVar.tagSize_ < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = AnonymousClass3.a[cbkVar.a().ordinal()];
        if (i == 1) {
            if (cbkVar.tagSize_ > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (cbkVar.tagSize_ > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i != 3) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (cbkVar.tagSize_ > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // defpackage.bxs
    public final /* bridge */ /* synthetic */ cbg a(ccu ccuVar) throws InvalidProtocolBufferException {
        return cbg.a(ccuVar, cdb.a());
    }
}
