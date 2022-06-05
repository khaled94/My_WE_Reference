package defpackage;

import com.android.volley.AuthFailureError;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* renamed from: bd  reason: default package */
/* loaded from: classes2.dex */
public final class bd implements bg {
    protected final HttpClient a;

    public bd(HttpClient httpClient) {
        this.a = httpClient;
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, as<?> asVar) throws AuthFailureError {
        byte[] g = asVar.g();
        if (g != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(g));
        }
    }

    /* renamed from: bd$a */
    /* loaded from: classes2.dex */
    public static final class a extends HttpEntityEnclosingRequestBase {
        public final String getMethod() {
            return "PATCH";
        }

        public a() {
        }

        public a(String str) {
            setURI(URI.create(str));
        }
    }

    @Override // defpackage.bg
    public final HttpResponse b(as<?> asVar, Map<String, String> map) throws IOException, AuthFailureError {
        a aVar;
        switch (asVar.a) {
            case -1:
                byte[] e = asVar.e();
                if (e != null) {
                    a httpPost = new HttpPost(asVar.b);
                    httpPost.addHeader("Content-Type", asVar.d());
                    httpPost.setEntity(new ByteArrayEntity(e));
                    aVar = httpPost;
                    break;
                } else {
                    aVar = new HttpGet(asVar.b);
                    break;
                }
            case 0:
                aVar = new HttpGet(asVar.b);
                break;
            case 1:
                aVar = new HttpPost(asVar.b);
                aVar.addHeader("Content-Type", asVar.f());
                a((HttpEntityEnclosingRequestBase) aVar, asVar);
                break;
            case 2:
                aVar = new HttpPut(asVar.b);
                aVar.addHeader("Content-Type", asVar.f());
                a((HttpEntityEnclosingRequestBase) aVar, asVar);
                break;
            case 3:
                aVar = new HttpDelete(asVar.b);
                break;
            case 4:
                aVar = new HttpHead(asVar.b);
                break;
            case 5:
                aVar = new HttpOptions(asVar.b);
                break;
            case 6:
                aVar = new HttpTrace(asVar.b);
                break;
            case 7:
                aVar = new a(asVar.b);
                aVar.addHeader("Content-Type", asVar.f());
                a((HttpEntityEnclosingRequestBase) aVar, asVar);
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        a((HttpUriRequest) aVar, map);
        a((HttpUriRequest) aVar, asVar.c());
        HttpParams params = aVar.getParams();
        int h = asVar.h();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, h);
        return this.a.execute(aVar);
    }
}
