package defpackage;

import com.android.volley.AuthFailureError;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: az  reason: default package */
/* loaded from: classes.dex */
public abstract class az implements bg {
    public abstract bf a(as<?> asVar, Map<String, String> map) throws IOException, AuthFailureError;

    @Override // defpackage.bg
    @Deprecated
    public final HttpResponse b(as<?> asVar, Map<String, String> map) throws IOException, AuthFailureError {
        bf a = a(asVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.a, ""));
        ArrayList arrayList = new ArrayList();
        for (ao aoVar : Collections.unmodifiableList(a.b)) {
            arrayList.add(new BasicHeader(aoVar.a, aoVar.b));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream inputStream = a.d;
        if (inputStream != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStream);
            basicHttpEntity.setContentLength(a.c);
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
