package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.byx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* renamed from: byv  reason: default package */
/* loaded from: classes2.dex */
public final class byv {
    private static final String a = byv.class.getSimpleName();
    private final bxw b;
    private final bxm c;
    private bxu d;

    /* synthetic */ byv(a aVar, byte b) throws GeneralSecurityException, IOException {
        this(aVar);
    }

    private byv(a aVar) throws GeneralSecurityException, IOException {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.d;
    }

    /* renamed from: byv$a */
    /* loaded from: classes2.dex */
    public static final class a {
        bxu d;
        private bxv e = null;
        bxw a = null;
        private String f = null;
        bxm b = null;
        private boolean g = true;
        public bxr c = null;
        private KeyStore h = null;

        public final a a(Context context, String str, String str2) throws IOException {
            if (context != null) {
                if (str == null) {
                    throw new IllegalArgumentException("need a keyset name");
                }
                this.e = new byy(context, str, str2);
                this.a = new byz(context, str, str2);
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final a a(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.g) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f = str;
            return this;
        }

        public final synchronized byv a() throws GeneralSecurityException, IOException {
            if (this.f != null) {
                this.b = b();
            }
            this.d = c();
            return new byv(this, (byte) 0);
        }

        private bxm b() throws GeneralSecurityException {
            byx byxVar;
            if (!byv.b()) {
                String unused = byv.a;
                return null;
            }
            if (this.h != null) {
                byx.a aVar = new byx.a();
                KeyStore keyStore = this.h;
                if (keyStore == null) {
                    throw new IllegalArgumentException("val cannot be null");
                }
                aVar.b = keyStore;
                byxVar = new byx(aVar, (byte) 0);
            } else {
                byxVar = new byx();
            }
            boolean c = byxVar.c(this.f);
            if (!c) {
                try {
                    byx.d(this.f);
                } catch (GeneralSecurityException | ProviderException unused2) {
                    String unused3 = byv.a;
                    return null;
                }
            }
            try {
                return byxVar.b(this.f);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!c) {
                    String unused4 = byv.a;
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f), e);
            }
        }

        private bxu c() throws GeneralSecurityException, IOException {
            try {
                return d();
            } catch (FileNotFoundException unused) {
                String unused2 = byv.a;
                if (this.c != null) {
                    bxu a = new bxu(cbt.b()).a(this.c);
                    bxu a2 = a.a(bye.a(a.a().a).keyInfo_.get(0).keyId_);
                    if (this.b != null) {
                        bxt a3 = a2.a();
                        this.a.a(bxt.a(a3.a, this.b));
                    } else {
                        this.a.a(a2.a().a);
                    }
                    return a2;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private bxu d() throws GeneralSecurityException, IOException {
            bxm bxmVar = this.b;
            if (bxmVar != null) {
                try {
                    cbd b = this.e.b();
                    if (b != null && b.encryptedKeyset_.b() != 0) {
                        return bxu.a(new bxt(bxt.a(b, bxmVar)));
                    }
                    throw new GeneralSecurityException("empty keyset");
                } catch (InvalidProtocolBufferException | GeneralSecurityException unused) {
                    String unused2 = byv.a;
                }
            }
            return bxu.a(bxt.a(this.e.a()));
        }
    }

    public final synchronized bxt a() throws GeneralSecurityException {
        return this.d.a();
    }

    static /* synthetic */ boolean b() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
