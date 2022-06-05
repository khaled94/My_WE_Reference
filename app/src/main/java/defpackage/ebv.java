package defpackage;

import androidx.core.location.LocationRequestCompat;
import defpackage.ecq;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: ebv  reason: default package */
/* loaded from: classes2.dex */
public final class ebv extends ecq.c implements eah {
    static final /* synthetic */ boolean n = !ebv.class.desiredAssertionStatus();
    public final ebw a;
    public final ebe b;
    public Socket c;
    Socket d;
    public eaq e;
    ecq f;
    edw g;
    edv h;
    boolean i;
    int j;
    int k;
    private eay p;
    private int q;
    private int r = 1;
    final List<Reference<ebz>> l = new ArrayList();
    long m = LocationRequestCompat.PASSIVE_INTERVAL;

    public ebv(ebw ebwVar, ebe ebeVar) {
        this.a = ebwVar;
        this.b = ebeVar;
    }

    public final void d() {
        if (n || !Thread.holdsLock(this.a)) {
            synchronized (this.a) {
                this.i = true;
            }
            return;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [edk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebv.a(int, int, int, int, boolean):void");
    }

    private void a(int i, int i2) throws IOException {
        Socket socket;
        Proxy proxy = this.b.b;
        dzz dzzVar = this.b.a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = dzzVar.c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.c = socket;
        socket.setSoTimeout(i2);
        try {
            edk.e().a(this.c, this.b.c, i);
            try {
                this.g = eed.a(eed.b(this.c));
                this.h = eed.a(eed.a(this.c));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void a(int i) throws IOException {
        this.d.setSoTimeout(0);
        ecq.a a = new ecq.a().a(this.d, this.b.a.a.b, this.g, this.h);
        a.e = this;
        a.h = i;
        ecq a2 = a.a();
        this.f = a2;
        a2.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(dzz dzzVar, List<ebe> list) {
        boolean z;
        if (this.l.size() >= this.r || this.i || !ebg.a.a(this.b.a, dzzVar)) {
            return false;
        }
        if (dzzVar.a.b.equals(this.b.a.a.b)) {
            return true;
        }
        if (this.f != null && list != null) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                ebe ebeVar = list.get(i);
                if (ebeVar.b.type() == Proxy.Type.DIRECT && this.b.b.type() == Proxy.Type.DIRECT && this.b.c.equals(ebeVar.c)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z || dzzVar.j != edp.a || !a(dzzVar.a)) {
                return false;
            }
            try {
                dzzVar.k.a(dzzVar.a.b, this.e.b);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.eah
    public final ebe a() {
        return this.b;
    }

    public final boolean a(boolean z) {
        if (this.d.isClosed() || this.d.isInputShutdown() || this.d.isOutputShutdown()) {
            return false;
        }
        ecq ecqVar = this.f;
        if (ecqVar != null) {
            return ecqVar.b(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.d.getSoTimeout();
                try {
                    this.d.setSoTimeout(1);
                    return !this.g.d();
                } finally {
                    this.d.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ecq.c
    public final void a(ect ectVar) throws IOException {
        ectVar.a(ecm.REFUSED_STREAM, (IOException) null);
    }

    @Override // defpackage.ecq.c
    public final void a(ecq ecqVar) {
        synchronized (this.a) {
            this.r = ecqVar.a();
        }
    }

    @Override // defpackage.eah
    public final eaq b() {
        return this.e;
    }

    public final boolean e() {
        return this.f != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(IOException iOException) {
        if (n || !Thread.holdsLock(this.a)) {
            synchronized (this.a) {
                if (iOException instanceof StreamResetException) {
                    ecm ecmVar = ((StreamResetException) iOException).a;
                    if (ecmVar == ecm.REFUSED_STREAM) {
                        int i = this.q + 1;
                        this.q = i;
                        if (i > 1) {
                            this.i = true;
                            this.j++;
                        }
                    } else if (ecmVar != ecm.CANCEL) {
                        this.i = true;
                        this.j++;
                    }
                } else if (!e() || (iOException instanceof ConnectionShutdownException)) {
                    this.i = true;
                    if (this.k == 0) {
                        if (iOException != null) {
                            this.a.a(this.b, iOException);
                        }
                        this.j++;
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    @Override // defpackage.eah
    public final eay c() {
        return this.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.b.a.a.b);
        sb.append(":");
        sb.append(this.b.a.a.c);
        sb.append(", proxy=");
        sb.append(this.b.b);
        sb.append(" hostAddress=");
        sb.append(this.b.c);
        sb.append(" cipherSuite=");
        eaq eaqVar = this.e;
        sb.append(eaqVar != null ? eaqVar.a : "none");
        sb.append(" protocol=");
        sb.append(this.p);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0147, code lost:
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0149, code lost:
        defpackage.ebk.a(r16.c);
        r3 = false;
        r16.c = null;
        r16.h = null;
        r16.g = null;
        r9 = r9 + 1;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0162, code lost:
        return;
     */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ebv, eaw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebv.a(int, int, int):void");
    }

    public final boolean a(eas easVar) {
        if (easVar.c != this.b.a.a.c) {
            return false;
        }
        if (easVar.b.equals(this.b.a.a.b)) {
            return true;
        }
        if (this.e != null) {
            edp edpVar = edp.a;
            if (edp.a(easVar.b, (X509Certificate) this.e.b.get(0))) {
                return true;
            }
        }
        return false;
    }
}
