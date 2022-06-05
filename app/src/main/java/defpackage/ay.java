package defpackage;

import com.android.volley.AuthFailureError;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: ay  reason: default package */
/* loaded from: classes.dex */
final class ay extends az {
    private final bg a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ay(bg bgVar) {
        this.a = bgVar;
    }

    @Override // defpackage.az
    public final bf a(as<?> asVar, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            HttpResponse b = this.a.b(asVar, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new ao(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new bf(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((int) contentLength) != contentLength) {
                throw new IOException("Response too large: ".concat(String.valueOf(contentLength)));
            }
            return new bf(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
