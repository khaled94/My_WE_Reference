package defpackage;

import defpackage.ear;
import defpackage.eat;
import defpackage.eaw;
import defpackage.eba;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: eda  reason: default package */
/* loaded from: classes2.dex */
public final class eda extends HttpURLConnection implements eae {
    public static final String a;
    public static final String b;
    private static final Set<String> j = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));
    eaw c;
    ead d;
    ebj e;
    ebc f;
    boolean g;
    Proxy h;
    eaq i;
    private final a k;
    private ear.a l;
    private boolean m;
    private ear n;
    private long o;
    private final Object p;
    private ebc q;
    private Throwable r;

    static {
        StringBuilder sb = new StringBuilder();
        edk.e();
        sb.append(edk.f());
        sb.append("-Selected-Protocol");
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        edk.e();
        sb2.append(edk.f());
        sb2.append("-Response-Source");
        b = sb2.toString();
    }

    private eda(URL url, eaw eawVar) {
        super(url);
        this.k = new a();
        this.l = new ear.a();
        this.o = -1L;
        this.p = new Object();
        this.g = true;
        this.c = eawVar;
    }

    public eda(URL url, eaw eawVar, ebj ebjVar) {
        this(url, eawVar);
        this.e = ebjVar;
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        if (this.m) {
            return;
        }
        ead b2 = b();
        this.m = true;
        b2.a(this);
        synchronized (this.p) {
            while (this.g && this.q == null && this.r == null) {
                try {
                    this.p.wait();
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            }
            if (this.r != null) {
                throw a(this.r);
            }
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.d == null) {
            return;
        }
        this.k.a();
        this.d.c();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            ebc a2 = a(true);
            if (ece.b(a2) && a2.c() >= 400) {
                return a2.h().c();
            }
        } catch (IOException unused) {
        }
        return null;
    }

    private ear a() throws IOException {
        String str;
        if (this.n == null) {
            ebc a2 = a(true);
            ear.a a3 = a2.g().b().a(a, a2.b().toString());
            String str2 = b;
            if (a2.j() == null) {
                if (a2.k() == null) {
                    str = "NONE";
                } else {
                    str = "CACHE " + a2.c();
                }
            } else if (a2.k() == null) {
                str = "NETWORK " + a2.c();
            } else {
                str = "CONDITIONAL_CACHE " + a2.j().c();
            }
            this.n = a3.a(str2, str).a();
        }
        return this.n;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        try {
            ear a2 = a();
            if (i >= 0 && i < a2.a()) {
                return a2.b(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            if (str == null) {
                return eck.a(a(true)).toString();
            }
            return a().a(str);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        try {
            ear a2 = a();
            if (i >= 0 && i < a2.a()) {
                return a2.a(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        try {
            return ebh.a(a(), eck.a(a(true)).toString());
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        }
        return ebh.a(this.l.a(), null);
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        if (!this.doInput) {
            throw new ProtocolException("This protocol does not support input");
        }
        ebc a2 = a(false);
        if (a2.c() >= 400) {
            throw new FileNotFoundException(this.url.toString());
        }
        return a2.h().c();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws IOException {
        edc edcVar = (edc) b().a().d();
        if (edcVar == null) {
            throw new ProtocolException("method does not support a request body: " + this.method);
        }
        if (edcVar instanceof edd) {
            connect();
            this.k.a();
        }
        if (edcVar.e) {
            throw new ProtocolException("cannot write request body after response has been read");
        }
        return edcVar.d;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        int i;
        URL url = getURL();
        String host = url.getHost();
        if (url.getPort() != -1) {
            i = url.getPort();
        } else {
            i = eas.a(url.getProtocol());
        }
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.c.d().address();
            host = inetSocketAddress.getHostName();
            i = inetSocketAddress.getPort();
        }
        return new SocketPermission(host + ":" + i, "connect, resolve");
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.l.b(str);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.c = this.c.i().a(i, TimeUnit.MILLISECONDS).d();
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.c = this.c.i().a(z).d();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.c.g();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.c.a();
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.c = this.c.i().b(i, TimeUnit.MILLISECONDS).d();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.c.b();
    }

    private ead b() throws IOException {
        edc edcVar;
        ead eadVar = this.d;
        if (eadVar != null) {
            return eadVar;
        }
        boolean z = true;
        this.connected = true;
        if (this.doOutput) {
            if (this.method.equals("GET")) {
                this.method = "POST";
            } else if (!ecf.a(this.method)) {
                throw new ProtocolException(this.method + " does not support writing");
            }
        }
        if (this.l.b("User-Agent") == null) {
            this.l.a("User-Agent", c());
        }
        edc edcVar2 = null;
        if (ecf.a(this.method)) {
            if (this.l.b("Content-Type") == null) {
                this.l.a("Content-Type", "application/x-www-form-urlencoded");
            }
            long j2 = -1;
            if (this.o == -1 && this.chunkLength <= 0) {
                z = false;
            }
            String b2 = this.l.b("Content-Length");
            long j3 = this.o;
            if (j3 != -1) {
                j2 = j3;
            } else if (b2 != null) {
                j2 = Long.parseLong(b2);
            }
            if (z) {
                edcVar = new edd(j2);
            } else {
                edcVar = new ecy(j2);
            }
            edcVar2 = edcVar;
            edcVar2.c.a(this.c.c(), TimeUnit.MILLISECONDS);
        }
        eba a2 = new eba.a().a((eas) ebg.a.getHttpUrlChecked(getURL().toString())).a(this.l.a()).a(this.method, edcVar2).a();
        if (this.e != null) {
            a2.a().a();
        }
        eaw.a i = this.c.i();
        i.b().clear();
        i.b().add(b.a);
        i.c().clear();
        i.c().add(this.k);
        i.a(new eam(this.c.h().a()));
        if (!getUseCaches()) {
            i.a();
        }
        ead a3 = i.d().a(a2);
        this.d = a3;
        return a3;
    }

    private static String c() {
        String property = System.getProperty("http.agent");
        return property != null ? ebk.toHumanReadableAscii(property) : ebl.a();
    }

    private ebc a(boolean z) throws IOException {
        synchronized (this.p) {
            if (this.q != null) {
                return this.q;
            } else if (this.r != null) {
                if (!z || this.f == null) {
                    throw a(this.r);
                }
                return this.f;
            } else {
                ead b2 = b();
                this.k.a();
                edc edcVar = (edc) b2.a().d();
                if (edcVar != null) {
                    edcVar.d.close();
                }
                if (this.m) {
                    synchronized (this.p) {
                        while (this.q == null && this.r == null) {
                            try {
                                try {
                                    this.p.wait();
                                } catch (InterruptedException unused) {
                                    throw new InterruptedIOException();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } else {
                    this.m = true;
                    try {
                        a(b2.b());
                    } catch (IOException e) {
                        a(e);
                    }
                }
                synchronized (this.p) {
                    if (this.r != null) {
                        throw a(this.r);
                    }
                    if (this.q == null) {
                        throw new AssertionError();
                    }
                    return this.q;
                }
            }
        }
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        if (this.h != null) {
            return true;
        }
        Proxy d = this.c.d();
        return (d == null || d.type() == Proxy.Type.DIRECT) ? false : true;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() throws IOException {
        return a(true).e();
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws IOException {
        return a(true).c();
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        if (!this.connected) {
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 == null) {
                edk e = edk.e();
                e.a(5, "Ignoring header " + str + " because its value was null.", (Throwable) null);
                return;
            }
            this.l.d(str, str2);
            return;
        }
        throw new IllegalStateException("Cannot set request property after connection is made");
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j2) {
        super.setIfModifiedSince(j2);
        if (this.ifModifiedSince != 0) {
            this.l.d("If-Modified-Since", ecd.a(new Date(this.ifModifiedSince)));
        } else {
            this.l.a("If-Modified-Since");
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        if (!this.connected) {
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 == null) {
                edk e = edk.e();
                e.a(5, "Ignoring header " + str + " because its value was null.", (Throwable) null);
                return;
            }
            this.l.a(str, str2);
            return;
        }
        throw new IllegalStateException("Cannot add request property after connection is made");
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        if (!j.contains(str)) {
            throw new ProtocolException("Expected one of " + j + " but was " + str);
        }
        this.method = str;
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j2) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Already connected");
        }
        if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("contentLength < 0");
        }
        this.o = j2;
        ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j2, 2147483647L);
    }

    @Override // defpackage.eae
    public final void a(IOException iOException) {
        synchronized (this.p) {
            boolean z = iOException instanceof b;
            Throwable th = iOException;
            if (z) {
                th = iOException.getCause();
            }
            this.r = th;
            this.p.notifyAll();
        }
    }

    @Override // defpackage.eae
    public final void a(ebc ebcVar) {
        synchronized (this.p) {
            this.q = ebcVar;
            this.i = ebcVar.f();
            this.url = ebcVar.a().a().a();
            this.p.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eda$b */
    /* loaded from: classes2.dex */
    public static final class b extends IOException {
        static final eat a = new eat() { // from class: eda.b.1
            @Override // defpackage.eat
            public final ebc a(eat.a aVar) throws IOException {
                try {
                    return aVar.a(aVar.a());
                } catch (Error | RuntimeException e) {
                    throw new b(e);
                }
            }
        };

        public b(Throwable th) {
            super(th);
        }
    }

    private static IOException a(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (!(th instanceof RuntimeException)) {
            throw new AssertionError();
        }
        throw ((RuntimeException) th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eda$a */
    /* loaded from: classes2.dex */
    public final class a implements eat {
        private boolean b;

        a() {
        }

        public final void a() {
            synchronized (eda.this.p) {
                this.b = true;
                eda.this.p.notifyAll();
            }
        }

        @Override // defpackage.eat
        public final ebc a(eat.a aVar) throws IOException {
            eba a = aVar.a();
            if (eda.this.e != null) {
                a.a().a();
            }
            synchronized (eda.this.p) {
                eda.this.g = false;
                eda.this.h = aVar.b().a().a();
                eda.this.i = aVar.b().b();
                eda.this.p.notifyAll();
                while (!this.b) {
                    try {
                        eda.this.p.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
            }
            if (a.d() instanceof edc) {
                a = ((edc) a.d()).a(a);
            }
            ebc a2 = aVar.a(a);
            synchronized (eda.this.p) {
                eda.this.f = a2;
                eda.this.url = a2.a().a().a();
            }
            return a2;
        }
    }
}
