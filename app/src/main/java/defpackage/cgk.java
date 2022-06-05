package defpackage;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

@Immutable
/* renamed from: cgk  reason: default package */
/* loaded from: classes2.dex */
public final class cgk implements bze {
    final String a;
    final Key b;
    private final ThreadLocal<Mac> c = new ThreadLocal<Mac>() { // from class: cgk.1
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a = cgc.b.a(cgk.this.a);
                a.init(cgk.this.b);
                return a;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private final int d;

    public cgk(String str, Key key) throws GeneralSecurityException {
        this.a = str;
        this.b = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 1;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 2;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.d = 20;
        } else if (c == 1) {
            this.d = 32;
        } else if (c == 2) {
            this.d = 48;
        } else if (c == 3) {
            this.d = 64;
        } else {
            throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(String.valueOf(str)));
        }
        this.c.get();
    }

    @Override // defpackage.bze
    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.c.get().update(bArr);
        return Arrays.copyOf(this.c.get().doFinal(), i);
    }
}
