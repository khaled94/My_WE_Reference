package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsp  reason: default package */
/* loaded from: classes2.dex */
public final class bsp implements Runnable {
    final bsm a;
    final String b;
    private final URL c;
    private final byte[] d = null;
    private final Map<String, String> e = null;
    private final /* synthetic */ bsn f;

    /* JADX WARN: Multi-variable type inference failed */
    public bsp(bsn bsnVar, String str, URL url, byte[] bArr) {
        this.f = bsnVar;
        aat.a(str);
        aat.a(url);
        aat.a(bArr);
        this.c = url;
        this.a = bArr;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        IOException e;
        HttpURLConnection httpURLConnection2;
        Map<String, List<String>> map2;
        Throwable th;
        Map<String, List<String>> headerFields;
        this.f.b();
        int i = 0;
        try {
            bsn bsnVar = this.f;
            URLConnection openConnection = this.c.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            if (bsnVar.a != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(bsnVar.a);
            }
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) openConnection;
            httpURLConnection3.setDefaultUseCaches(false);
            httpURLConnection3.setConnectTimeout(60000);
            httpURLConnection3.setReadTimeout(61000);
            httpURLConnection3.setInstanceFollowRedirects(false);
            httpURLConnection3.setDoInput(true);
            try {
                if (this.e != null) {
                    for (Map.Entry<String, String> entry : this.e.entrySet()) {
                        httpURLConnection3.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                i = httpURLConnection3.getResponseCode();
                headerFields = httpURLConnection3.getHeaderFields();
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = httpURLConnection3;
                map = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection3;
                map2 = null;
            }
            try {
                byte[] a = bsn.a(httpURLConnection3);
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                a(i, null, a, headerFields);
            } catch (IOException e3) {
                map = headerFields;
                e = e3;
                httpURLConnection = httpURLConnection3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                a(i, e, null, map);
            } catch (Throwable th3) {
                map2 = headerFields;
                th = th3;
                httpURLConnection2 = httpURLConnection3;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                a(i, null, null, map2);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            map = null;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
            map2 = null;
            httpURLConnection2 = null;
        }
    }

    private final void a(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f.p().a(new Runnable(this, i, exc, bArr, map) { // from class: bso
            private final bsp a;
            private final int b;
            private final Exception c;
            private final byte[] d;
            private final Map e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = i;
                this.c = exc;
                this.d = bArr;
                this.e = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bsp bspVar = this.a;
                bspVar.a.a(this.b, this.c, this.d);
            }
        });
    }
}
