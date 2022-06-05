package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: ecj  reason: default package */
/* loaded from: classes2.dex */
public final class ecj implements eat {
    private final eaw a;

    public ecj(eaw eawVar) {
        this.a = eawVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
        if (r4.equals("HEAD") == false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [ebu, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r22v0, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r3v1 */
    @Override // defpackage.eat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ebc a(defpackage.eat.a r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecj.a(eat$a):ebc");
    }

    private boolean a(IOException iOException, ebz ebzVar, boolean z) {
        if (!this.a.y) {
            return false;
        }
        return (!z || !a(iOException)) && a(iOException, z) && ebzVar.d();
    }

    private static boolean a(IOException iOException) {
        return iOException instanceof FileNotFoundException;
    }

    private static boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    private static int a(ebc ebcVar, int i) {
        String a = ebcVar.a("Retry-After");
        if (a == null) {
            return i;
        }
        if (!a.matches("\\d+")) {
            return Integer.MAX_VALUE;
        }
        return Integer.valueOf(a).intValue();
    }
}
