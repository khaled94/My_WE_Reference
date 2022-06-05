package defpackage;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/* renamed from: eax  reason: default package */
/* loaded from: classes2.dex */
public final class eax implements Cloneable, URLStreamHandlerFactory {
    private eaw a;
    private ebj b;

    public eax(eaw eawVar) {
        this.a = eawVar;
    }

    public final HttpURLConnection a(URL url) {
        return a(url, this.a.d());
    }

    final HttpURLConnection a(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        eaw d = this.a.i().a(proxy).d();
        if (protocol.equals("http")) {
            return new eda(url, d, this.b);
        }
        if (!protocol.equals("https")) {
            throw new IllegalArgumentException("Unexpected protocol: ".concat(String.valueOf(protocol)));
        }
        return new edb(url, d, this.b);
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(final String str) {
        if (str.equals("http") || str.equals("https")) {
            return new URLStreamHandler() { // from class: eax.1
                @Override // java.net.URLStreamHandler
                protected final URLConnection openConnection(URL url) {
                    return eax.this.a(url);
                }

                @Override // java.net.URLStreamHandler
                protected final URLConnection openConnection(URL url, Proxy proxy) {
                    return eax.this.a(url, proxy);
                }

                @Override // java.net.URLStreamHandler
                protected final int getDefaultPort() {
                    if (str.equals("http")) {
                        return 80;
                    }
                    if (!str.equals("https")) {
                        throw new AssertionError();
                    }
                    return 443;
                }
            };
        }
        return null;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new eax(this.a);
    }
}
