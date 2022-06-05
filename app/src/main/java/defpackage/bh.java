package defpackage;

import com.android.volley.AuthFailureError;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: bh  reason: default package */
/* loaded from: classes2.dex */
public class bh extends az {
    private final a a;
    private final SSLSocketFactory b;

    /* renamed from: bh$a */
    /* loaded from: classes2.dex */
    public interface a {
        String a();
    }

    public bh() {
        this((byte) 0);
    }

    private bh(byte b) {
        this((char) 0);
    }

    private bh(char c) {
        this.a = null;
        this.b = null;
    }

    private static List<ao> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new ao(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    protected HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, as<?> asVar) throws IOException, AuthFailureError {
        byte[] g = asVar.g();
        if (g != null) {
            a(httpURLConnection, asVar, g);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, as<?> asVar, byte[] bArr) throws IOException, AuthFailureError {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.addRequestProperty("Content-Type", asVar.f());
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    @Override // defpackage.az
    public final bf a(as<?> asVar, Map<String, String> map) throws IOException, AuthFailureError {
        SSLSocketFactory sSLSocketFactory;
        String str = asVar.b;
        HashMap hashMap = new HashMap();
        hashMap.putAll(asVar.c());
        hashMap.putAll(map);
        a aVar = this.a;
        if (aVar != null) {
            String a2 = aVar.a();
            if (a2 == null) {
                throw new IOException("URL blocked by rewriter: ".concat(String.valueOf(str)));
            }
            str = a2;
        }
        URL url = new URL(str);
        HttpURLConnection a3 = a(url);
        int h = asVar.h();
        a3.setConnectTimeout(h);
        a3.setReadTimeout(h);
        boolean z = false;
        a3.setUseCaches(false);
        a3.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.b) != null) {
            ((HttpsURLConnection) a3).setSSLSocketFactory(sSLSocketFactory);
        }
        for (String str2 : hashMap.keySet()) {
            a3.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        switch (asVar.a) {
            case -1:
                byte[] e = asVar.e();
                if (e != null) {
                    a3.setRequestMethod("POST");
                    a(a3, asVar, e);
                    break;
                }
                break;
            case 0:
                a3.setRequestMethod("GET");
                break;
            case 1:
                a3.setRequestMethod("POST");
                a(a3, asVar);
                break;
            case 2:
                a3.setRequestMethod("PUT");
                a(a3, asVar);
                break;
            case 3:
                a3.setRequestMethod("DELETE");
                break;
            case 4:
                a3.setRequestMethod("HEAD");
                break;
            case 5:
                a3.setRequestMethod("OPTIONS");
                break;
            case 6:
                a3.setRequestMethod("TRACE");
                break;
            case 7:
                a3.setRequestMethod("PATCH");
                a(a3, asVar);
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        int responseCode = a3.getResponseCode();
        if (responseCode == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        if (asVar.a != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) {
            z = true;
        }
        if (!z) {
            return new bf(responseCode, a(a3.getHeaderFields()));
        }
        return new bf(responseCode, a(a3.getHeaderFields()), a3.getContentLength(), a(a3));
    }
}
