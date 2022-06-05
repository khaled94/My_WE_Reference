package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes.dex */
public final class MasterKey {
    public static final int DEFAULT_AES_GCM_MASTER_KEY_SIZE = 256;
    private static final int DEFAULT_AUTHENTICATION_VALIDITY_DURATION_SECONDS = 300;
    public static final String DEFAULT_MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    static final String KEYSTORE_PATH_URI = "android-keystore://";
    private final String mKeyAlias;
    private final KeyGenParameterSpec mKeyGenParameterSpec;

    /* loaded from: classes.dex */
    public enum KeyScheme {
        AES256_GCM
    }

    public static int getDefaultAuthenticationValidityDurationSeconds() {
        return DEFAULT_AUTHENTICATION_VALIDITY_DURATION_SECONDS;
    }

    MasterKey(String str, Object obj) {
        this.mKeyAlias = str;
        if (Build.VERSION.SDK_INT >= 23) {
            this.mKeyGenParameterSpec = (KeyGenParameterSpec) obj;
        } else {
            this.mKeyGenParameterSpec = null;
        }
    }

    public final boolean isKeyStoreBacked() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.mKeyAlias);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public final boolean isUserAuthenticationRequired() {
        KeyGenParameterSpec keyGenParameterSpec;
        return Build.VERSION.SDK_INT >= 23 && (keyGenParameterSpec = this.mKeyGenParameterSpec) != null && keyGenParameterSpec.isUserAuthenticationRequired();
    }

    public final int getUserAuthenticationValidityDurationSeconds() {
        KeyGenParameterSpec keyGenParameterSpec;
        if (Build.VERSION.SDK_INT >= 23 && (keyGenParameterSpec = this.mKeyGenParameterSpec) != null) {
            return keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
        }
        return 0;
    }

    public final boolean isStrongBoxBacked() {
        KeyGenParameterSpec keyGenParameterSpec;
        if (Build.VERSION.SDK_INT < 28 || (keyGenParameterSpec = this.mKeyGenParameterSpec) == null) {
            return false;
        }
        return keyGenParameterSpec.isStrongBoxBacked();
    }

    public final String toString() {
        return "MasterKey{keyAlias=" + this.mKeyAlias + ", isKeyStoreBacked=" + isKeyStoreBacked() + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getKeyAlias() {
        return this.mKeyAlias;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean mAuthenticationRequired;
        private final Context mContext;
        private final String mKeyAlias;
        private KeyGenParameterSpec mKeyGenParameterSpec;
        private KeyScheme mKeyScheme;
        private boolean mRequestStrongBoxBacked;
        private int mUserAuthenticationValidityDurationSeconds;

        public Builder(Context context) {
            this(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS);
        }

        public Builder(Context context, String str) {
            this.mContext = context.getApplicationContext();
            this.mKeyAlias = str;
        }

        public final Builder setKeyScheme(KeyScheme keyScheme) {
            if (AnonymousClass1.$SwitchMap$androidx$security$crypto$MasterKey$KeyScheme[keyScheme.ordinal()] == 1) {
                if (Build.VERSION.SDK_INT >= 23 && this.mKeyGenParameterSpec != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.mKeyScheme = keyScheme;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: ".concat(String.valueOf(keyScheme)));
        }

        public final Builder setUserAuthenticationRequired(boolean z) {
            return setUserAuthenticationRequired(z, MasterKey.getDefaultAuthenticationValidityDurationSeconds());
        }

        public final Builder setUserAuthenticationRequired(boolean z, int i) {
            this.mAuthenticationRequired = z;
            this.mUserAuthenticationValidityDurationSeconds = i;
            return this;
        }

        public final Builder setRequestStrongBoxBacked(boolean z) {
            this.mRequestStrongBoxBacked = z;
            return this;
        }

        public final Builder setKeyGenParameterSpec(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.mKeyScheme != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (!this.mKeyAlias.equals(keyGenParameterSpec.getKeystoreAlias())) {
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.mKeyAlias + " vs " + keyGenParameterSpec.getKeystoreAlias());
            }
            this.mKeyGenParameterSpec = keyGenParameterSpec;
            return this;
        }

        public final MasterKey build() throws GeneralSecurityException, IOException {
            if (Build.VERSION.SDK_INT >= 23) {
                return buildOnM();
            }
            return new MasterKey(this.mKeyAlias, null);
        }

        private MasterKey buildOnM() throws GeneralSecurityException, IOException {
            if (this.mKeyScheme == null && this.mKeyGenParameterSpec == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (this.mKeyScheme == KeyScheme.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.mKeyAlias, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                if (this.mAuthenticationRequired) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.mUserAuthenticationValidityDurationSeconds);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.mRequestStrongBoxBacked && this.mContext.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.mKeyGenParameterSpec = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
            if (keyGenParameterSpec == null) {
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }
            return new MasterKey(MasterKeys.getOrCreate(keyGenParameterSpec), this.mKeyGenParameterSpec);
        }
    }

    /* renamed from: androidx.security.crypto.MasterKey$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }
}
