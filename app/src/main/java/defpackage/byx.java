package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* renamed from: byx  reason: default package */
/* loaded from: classes2.dex */
public final class byx implements bxx {
    private static final String a = byx.class.getSimpleName();
    private final String b;
    private KeyStore c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ byx(a aVar, byte b) {
        this(aVar);
    }

    public byx() throws GeneralSecurityException {
        this(new a());
    }

    private byx(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
    }

    /* renamed from: byx$a */
    /* loaded from: classes2.dex */
    public static final class a {
        String a = null;
        KeyStore b;

        public a() {
            this.b = null;
            if (!byx.a()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.bxx
    public final synchronized boolean a(String str) {
        if (this.b == null || !this.b.equals(str)) {
            if (this.b == null) {
                if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.bxx
    public final synchronized bxm b(String str) throws GeneralSecurityException {
        byw bywVar;
        if (this.b != null && !this.b.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.b, str));
        }
        bywVar = new byw(cgs.a("android-keystore://", str), this.c);
        byte[] a2 = cgm.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a2, bywVar.b(bywVar.a(a2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bywVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c(String str) throws GeneralSecurityException {
        String str2;
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.c = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.c.containsAlias(str2);
        }
        return this.c.containsAlias(cgs.a("android-keystore://", str));
    }

    public static void d(String str) throws GeneralSecurityException {
        if (new byx().c(str)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
        }
        String a2 = cgs.a("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(a2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    static /* synthetic */ boolean a() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
