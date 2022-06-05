package defpackage;

import defpackage.cgd;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: cgc  reason: default package */
/* loaded from: classes2.dex */
public final class cgc<T_WRAPPER extends cgd<T_ENGINE>, T_ENGINE> {
    public static final cgc<cgd.a, Cipher> a;
    public static final cgc<cgd.e, Mac> b;
    public static final cgc<cgd.g, Signature> c;
    public static final cgc<cgd.f, MessageDigest> d;
    public static final cgc<cgd.b, KeyAgreement> e;
    public static final cgc<cgd.d, KeyPairGenerator> f;
    public static final cgc<cgd.c, KeyFactory> g;
    private static final Logger h = Logger.getLogger(cgc.class.getName());
    private static final List<Provider> i;
    private T_WRAPPER j;
    private List<Provider> k = i;
    private boolean l = true;

    static {
        if (cgr.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    h.info(String.format("Provider %s not available", str));
                }
            }
            i = arrayList;
        } else {
            i = new ArrayList();
        }
        a = new cgc<>(new cgd.a());
        b = new cgc<>(new cgd.e());
        c = new cgc<>(new cgd.g());
        d = new cgc<>(new cgd.f());
        e = new cgc<>(new cgd.b());
        f = new cgc<>(new cgd.d());
        g = new cgc<>(new cgd.c());
    }

    private cgc(T_WRAPPER t_wrapper) {
        this.j = t_wrapper;
    }

    public final T_ENGINE a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : this.k) {
            try {
                return (T_ENGINE) this.j.a(str, provider);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.l) {
            return (T_ENGINE) this.j.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
