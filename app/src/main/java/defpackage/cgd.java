package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: cgd  reason: default package */
/* loaded from: classes2.dex */
public interface cgd<T> {
    T a(String str, Provider provider) throws GeneralSecurityException;

    /* renamed from: cgd$a */
    /* loaded from: classes2.dex */
    public static class a implements cgd<Cipher> {
        @Override // defpackage.cgd
        public final /* synthetic */ Cipher a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: cgd$e */
    /* loaded from: classes2.dex */
    public static class e implements cgd<Mac> {
        @Override // defpackage.cgd
        public final /* synthetic */ Mac a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
    }

    /* renamed from: cgd$d */
    /* loaded from: classes2.dex */
    public static class d implements cgd<KeyPairGenerator> {
        @Override // defpackage.cgd
        public final /* synthetic */ KeyPairGenerator a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: cgd$f */
    /* loaded from: classes2.dex */
    public static class f implements cgd<MessageDigest> {
        @Override // defpackage.cgd
        public final /* synthetic */ MessageDigest a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, provider);
        }
    }

    /* renamed from: cgd$g */
    /* loaded from: classes2.dex */
    public static class g implements cgd<Signature> {
        @Override // defpackage.cgd
        public final /* synthetic */ Signature a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Signature.getInstance(str);
            }
            return Signature.getInstance(str, provider);
        }
    }

    /* renamed from: cgd$c */
    /* loaded from: classes2.dex */
    public static class c implements cgd<KeyFactory> {
        @Override // defpackage.cgd
        public final /* synthetic */ KeyFactory a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: cgd$b */
    /* loaded from: classes2.dex */
    public static class b implements cgd<KeyAgreement> {
        @Override // defpackage.cgd
        public final /* synthetic */ KeyAgreement a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        }
    }
}
