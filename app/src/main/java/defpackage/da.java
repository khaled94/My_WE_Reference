package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import defpackage.cu;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: da  reason: default package */
/* loaded from: classes2.dex */
public final class da implements cu<InputStream> {
    static final b a = new a();
    private final fp b;
    private final int c;
    private final b d;
    private HttpURLConnection e;
    private InputStream f;
    private volatile boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: da$b */
    /* loaded from: classes2.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public da(fp fpVar, int i) {
        this(fpVar, i, a);
    }

    private da(fp fpVar, int i, b bVar) {
        this.b = fpVar;
        this.c = i;
        this.d = bVar;
    }

    @Override // defpackage.cu
    public final void a(bt btVar, cu.a<? super InputStream> aVar) {
        StringBuilder sb;
        long a2 = lb.a();
        try {
            try {
                fp fpVar = this.b;
                if (fpVar.f == null) {
                    if (TextUtils.isEmpty(fpVar.e)) {
                        String str = fpVar.d;
                        if (TextUtils.isEmpty(str)) {
                            str = ((URL) lf.a(fpVar.c, "Argument must not be null")).toString();
                        }
                        fpVar.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    fpVar.f = new URL(fpVar.e);
                }
                aVar.a((cu.a<? super InputStream>) a(fpVar.f, 0, null, this.b.b.a()));
            } catch (IOException e) {
                aVar.a((Exception) e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
            sb = new StringBuilder("Finished http url fetcher fetch in ");
            sb.append(lb.a(a2));
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                new StringBuilder("Finished http url fetcher fetch in ").append(lb.a(a2));
            }
            throw th;
        }
    }

    private InputStream a(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                        break;
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection a2 = a(url, map);
            this.e = a2;
            try {
                a2.connect();
                this.f = this.e.getInputStream();
                if (this.g) {
                    return null;
                }
                int a3 = a(this.e);
                int i2 = a3 / 100;
                boolean z = false;
                if (i2 == 2) {
                    return b(this.e);
                }
                if (i2 == 3) {
                    z = true;
                }
                if (!z) {
                    if (a3 == -1) {
                        throw new HttpException(a3);
                    }
                    try {
                        throw new HttpException(this.e.getResponseMessage(), a3);
                    } catch (IOException e) {
                        throw new HttpException("Failed to get a response message", a3, e);
                    }
                }
                String headerField = this.e.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", a3);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    i++;
                    url2 = url;
                    url = url3;
                } catch (MalformedURLException e2) {
                    throw new HttpException("Bad redirect url: ".concat(String.valueOf(headerField)), a3, e2);
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", a(this.e), e3);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    private static int a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private HttpURLConnection a(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a2 = this.d.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a2.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a2.setConnectTimeout(this.c);
            a2.setReadTimeout(this.c);
            a2.setUseCaches(false);
            a2.setDoInput(true);
            a2.setInstanceFollowRedirects(false);
            return a2;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    private InputStream b(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f = kx.a(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    new StringBuilder("Got non empty content encoding: ").append(httpURLConnection.getContentEncoding());
                }
                this.f = httpURLConnection.getInputStream();
            }
            return this.f;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", a(httpURLConnection), e);
        }
    }

    @Override // defpackage.cu
    public final void b() {
        InputStream inputStream = this.f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.e = null;
    }

    @Override // defpackage.cu
    public final void c() {
        this.g = true;
    }

    @Override // defpackage.cu
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.cu
    public final cf d() {
        return cf.REMOTE;
    }

    /* renamed from: da$a */
    /* loaded from: classes2.dex */
    static class a implements b {
        a() {
        }

        @Override // defpackage.da.b
        public final HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }
}
