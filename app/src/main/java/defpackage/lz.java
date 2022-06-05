package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.FacebookException;
import defpackage.mb;
import defpackage.mc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 b2\u00020\u0001:\t`abcdefghBO\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rB\u0019\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010G\u001a\u00020HH\u0002J\u0018\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u001eH\u0002J\u0006\u0010L\u001a\u00020MJ\u0006\u0010N\u001a\u00020OJ\n\u0010P\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010Q\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010R\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0002J\b\u0010S\u001a\u00020\u001eH\u0002J\b\u0010T\u001a\u00020\u001eH\u0002J$\u0010U\u001a\u00020H2\u0006\u0010V\u001a\u00020W2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Z0YH\u0002J\u000e\u0010[\u001a\u00020H2\u0006\u0010\\\u001a\u00020\u001eJ\u0010\u0010]\u001a\u00020H2\u0006\u0010=\u001a\u00020\u001eH\u0007J\b\u0010^\u001a\u00020\u001eH\u0002J\b\u0010_\u001a\u00020\u0005H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u0016\u00100\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u000e\u0010=\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0011\u0010C\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bD\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u0010\u0019¨\u0006i"}, d2 = {"Lcom/facebook/GraphRequest;", "", "accessToken", "Lcom/facebook/AccessToken;", "graphPath", "", "parameters", "Landroid/os/Bundle;", "httpMethod", "Lcom/facebook/HttpMethod;", "callback", "Lcom/facebook/GraphRequest$Callback;", "version", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;Ljava/lang/String;)V", "overriddenURL", "Ljava/net/URL;", "(Lcom/facebook/AccessToken;Ljava/net/URL;)V", "getAccessToken", "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "batchEntryDependsOn", "getBatchEntryDependsOn", "()Ljava/lang/String;", "setBatchEntryDependsOn", "(Ljava/lang/String;)V", "batchEntryName", "getBatchEntryName", "setBatchEntryName", "batchEntryOmitResultOnSuccess", "", "getBatchEntryOmitResultOnSuccess", "()Z", "setBatchEntryOmitResultOnSuccess", "(Z)V", "getCallback", "()Lcom/facebook/GraphRequest$Callback;", "setCallback", "(Lcom/facebook/GraphRequest$Callback;)V", "forceApplicationRequest", "graphObject", "Lorg/json/JSONObject;", "getGraphObject", "()Lorg/json/JSONObject;", "setGraphObject", "(Lorg/json/JSONObject;)V", "getGraphPath", "setGraphPath", "graphPathWithVersion", "getGraphPathWithVersion", "value", "getHttpMethod", "()Lcom/facebook/HttpMethod;", "setHttpMethod", "(Lcom/facebook/HttpMethod;)V", "getParameters", "()Landroid/os/Bundle;", "setParameters", "(Landroid/os/Bundle;)V", "relativeUrlForBatchedRequest", "getRelativeUrlForBatchedRequest", "skipClientToken", "tag", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "urlForSingleRequest", "getUrlForSingleRequest", "getVersion", "setVersion", "addCommonParameters", "", "appendParametersToBaseUrl", "baseUrl", "isBatch", "executeAndWait", "Lcom/facebook/GraphResponse;", "executeAsync", "Lcom/facebook/GraphRequestAsyncTask;", "getAccessTokenToUseForRequest", "getClientTokenForRequest", "getUrlWithGraphPath", "isApplicationRequest", "isValidGraphRequestForDomain", "serializeToBatch", "batch", "Lorg/json/JSONArray;", "attachments", "", "Lcom/facebook/GraphRequest$Attachment;", "setForceApplicationRequest", "forceOverride", "setSkipClientToken", "shouldForceClientTokenForRequest", "toString", "Attachment", "Callback", "Companion", "GraphJSONArrayCallback", "GraphJSONObjectCallback", "KeyValueSerializer", "OnProgressCallback", "ParcelableResourceWithMimeType", "Serializer", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: lz  reason: default package */
/* loaded from: classes2.dex */
public final class lz {
    public static final String j;
    public static final c k = new c((byte) 0);
    private static final String q;
    private static String r;
    private static final Pattern s;
    private static volatile String t;
    lk a;
    String b;
    public JSONObject c;
    public Bundle d;
    public Object e;
    b f;
    md g;
    public boolean h;
    public boolean i;
    private String l;
    private String m;
    private boolean n;
    private String o;
    private String p;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$Callback;", "", "onCompleted", "", "response", "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(mc mcVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "", "onCompleted", "", "obj", "Lorg/json/JSONObject;", "response", "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$d */
    /* loaded from: classes2.dex */
    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$KeyValueSerializer;", "", "writeString", "", "key", "", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$e */
    /* loaded from: classes2.dex */
    public interface e {
        void a(String str, String str2);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$OnProgressCallback;", "Lcom/facebook/GraphRequest$Callback;", "onProgress", "", "current", "", "max", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$f */
    /* loaded from: classes2.dex */
    public interface f extends b {
    }

    public lz() {
        this((lk) null, (String) null, (Bundle) null, (md) null, (b) null, 63);
    }

    public lz(lk lkVar, String str, Bundle bundle, md mdVar, b bVar, byte b2) {
        this(lkVar, str, bundle, mdVar, bVar, 32);
    }

    public final void a(Bundle bundle) {
        dqc.d(bundle, "<set-?>");
        this.d = bundle;
    }

    public final void a(b bVar) {
        if (ly.a(mf.GRAPH_API_DEBUG_INFO) || ly.a(mf.GRAPH_API_DEBUG_WARNING)) {
            this.f = new i(bVar);
        } else {
            this.f = bVar;
        }
    }

    public final void a(md mdVar) {
        if (this.p == null || mdVar == md.GET) {
            if (mdVar == null) {
                mdVar = md.GET;
            }
            this.g = mdVar;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    @Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0007J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020>0B2\u0006\u0010C\u001a\u00020DH\u0007J'\u0010A\u001a\b\u0012\u0004\u0012\u00020>0B2\u0012\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00020@0E\"\u00020@H\u0007¢\u0006\u0002\u0010FJ\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020>0B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020@0GH\u0007J\u0010\u0010H\u001a\u00020I2\u0006\u0010C\u001a\u00020DH\u0007J!\u0010H\u001a\u00020I2\u0012\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00020@0E\"\u00020@H\u0007¢\u0006\u0002\u0010JJ\u0016\u0010H\u001a\u00020I2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020@0GH\u0007J\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020>0B2\u0006\u0010L\u001a\u00020:2\u0006\u0010C\u001a\u00020DH\u0007J$\u0010K\u001a\b\u0012\u0004\u0012\u00020>0B2\u0006\u0010L\u001a\u00020:2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020@0GH\u0007J\"\u0010M\u001a\u00020I2\b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010L\u001a\u00020:2\u0006\u0010C\u001a\u00020DH\u0007J\u0018\u0010M\u001a\u00020I2\u0006\u0010L\u001a\u00020:2\u0006\u0010C\u001a\u00020DH\u0007J\u0010\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020DH\u0002J\n\u0010R\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010S\u001a\u00020\u00042\b\u0010T\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010U\u001a\u00020V2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010W\u001a\u00020V2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010X\u001a\u00020V2\u0006\u0010Y\u001a\u00020\u0004H\u0002J\u0012\u0010Z\u001a\u00020V2\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010\\\u001a\u00020V2\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010]\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0007J.\u0010]\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020a2\b\u0010d\u001a\u0004\u0018\u00010\u00042\b\u0010b\u001a\u0004\u0018\u00010cH\u0007J&\u0010e\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010f\u001a\u0004\u0018\u00010\u00042\b\u0010b\u001a\u0004\u0018\u00010cH\u0007J&\u0010g\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010T\u001a\u0004\u0018\u00010\u00042\b\u0010b\u001a\u0004\u0018\u00010cH\u0007J\u001c\u0010h\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010b\u001a\u0004\u0018\u00010iH\u0007J\u001c\u0010j\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010b\u001a\u0004\u0018\u00010kH\u0007J@\u0010l\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010m\u001a\u0004\u0018\u00010n2\u0006\u0010o\u001a\u00020 2\u0006\u0010p\u001a\u00020 2\b\u0010q\u001a\u0004\u0018\u00010\u00042\b\u0010b\u001a\u0004\u0018\u00010kH\u0007J0\u0010r\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010T\u001a\u0004\u0018\u00010\u00042\b\u0010s\u001a\u0004\u0018\u00010t2\b\u0010b\u001a\u0004\u0018\u00010cH\u0007JD\u0010u\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010T\u001a\u0004\u0018\u00010\u00042\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010x\u001a\u0004\u0018\u00010\u00042\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010b\u001a\u0004\u0018\u00010cH\u0007JB\u0010u\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010T\u001a\u0004\u0018\u00010\u00042\u0006\u0010{\u001a\u00020|2\b\u0010x\u001a\u0004\u0018\u00010\u00042\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010b\u001a\u0004\u0018\u00010cH\u0007JD\u0010u\u001a\u00020@2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010T\u001a\u0004\u0018\u00010\u00042\b\u0010}\u001a\u0004\u0018\u00010~2\b\u0010x\u001a\u0004\u0018\u00010\u00042\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010b\u001a\u0004\u0018\u00010cH\u0007J\u0012\u0010\u007f\u001a\u00020\u00042\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010s\u001a\u00020t2\u0006\u0010Y\u001a\u00020\u00042\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J.\u0010\u0084\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0086\u0001\u001a\u00020VH\u0002JB\u0010\u0087\u0001\u001a\u00030\u0081\u00012\u0006\u0010C\u001a\u00020D2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020 2\u0006\u0010;\u001a\u00020<2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020VH\u0002J'\u0010\u008e\u0001\u001a\u00030\u0081\u00012\u0006\u0010C\u001a\u00020D2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020>0BH\u0001¢\u0006\u0003\b\u0090\u0001J+\u0010\u0091\u0001\u001a\u00030\u0081\u00012\u0015\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u00012\b\u0010\u0082\u0001\u001a\u00030\u0095\u0001H\u0002J%\u0010\u0096\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0097\u0001\u001a\u00020z2\b\u0010\u0082\u0001\u001a\u00030\u0095\u00012\u0006\u0010?\u001a\u00020@H\u0002J9\u0010\u0098\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0095\u00012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020@0G2\u0015\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0094\u00010\u0099\u0001H\u0002J \u0010\u009a\u0001\u001a\u00030\u0081\u00012\u0006\u0010C\u001a\u00020D2\u0006\u0010L\u001a\u00020:H\u0001¢\u0006\u0003\b\u009b\u0001J\u001b\u0010\u009c\u0001\u001a\u00030\u0081\u00012\u0006\u0010L\u001a\u00020:2\u0007\u0010\u008d\u0001\u001a\u00020VH\u0002J\u0014\u0010\u009d\u0001\u001a\u00030\u0081\u00012\b\u0010d\u001a\u0004\u0018\u00010\u0004H\u0007J\u0011\u0010\u009e\u0001\u001a\u00020:2\u0006\u0010C\u001a\u00020DH\u0007J#\u0010\u009e\u0001\u001a\u00020:2\u0012\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00020@0E\"\u00020@H\u0007¢\u0006\u0003\u0010\u009f\u0001J\u0017\u0010\u009e\u0001\u001a\u00020:2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020@0GH\u0007J\u0018\u0010 \u0001\u001a\u00030\u0081\u00012\u0006\u0010C\u001a\u00020DH\u0001¢\u0006\u0003\b¡\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u0002R\u000e\u0010+\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001e\u00102\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00101\"\u0004\b4\u00105R\u0016\u00106\u001a\n 8*\u0004\u0018\u00010707X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¢\u0001"}, d2 = {"Lcom/facebook/GraphRequest$Companion;", "", "()V", "ACCEPT_LANGUAGE_HEADER", "", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", "SEARCH", "TAG", "getTAG$facebook_core_release$annotations", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "mimeContentType", "getMimeContentType", "()Ljava/lang/String;", "userAgent", "getUserAgent", "setUserAgent", "(Ljava/lang/String;)V", "versionPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "createConnection", "Ljava/net/HttpURLConnection;", "url", "Ljava/net/URL;", "executeAndWait", "Lcom/facebook/GraphResponse;", "request", "Lcom/facebook/GraphRequest;", "executeBatchAndWait", "", "requests", "Lcom/facebook/GraphRequestBatch;", "", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "", "executeBatchAsync", "Lcom/facebook/GraphRequestAsyncTask;", "([Lcom/facebook/GraphRequest;)Lcom/facebook/GraphRequestAsyncTask;", "executeConnectionAndWait", "connection", "executeConnectionAsync", "callbackHandler", "Landroid/os/Handler;", "getBatchAppId", "batch", "getDefaultBatchApplicationId", "getDefaultPhotoPathIfNull", "graphPath", "hasOnProgressCallbacks", "", "isGzipCompressible", "isMeRequest", "path", "isSupportedAttachmentType", "value", "isSupportedParameterType", "newCustomAudienceThirdPartyIdRequest", "accessToken", "Lcom/facebook/AccessToken;", "context", "Landroid/content/Context;", "callback", "Lcom/facebook/GraphRequest$Callback;", "applicationId", "newDeleteObjectRequest", "id", "newGraphPathRequest", "newMeRequest", "Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "newMyFriendsRequest", "Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "newPlacesSearchRequest", "location", "Landroid/location/Location;", "radiusInMeters", "resultsLimit", "searchText", "newPostRequest", "graphObject", "Lorg/json/JSONObject;", "newUploadPhotoRequest", "image", "Landroid/graphics/Bitmap;", "caption", "params", "Landroid/os/Bundle;", "photoUri", "Landroid/net/Uri;", "file", "Ljava/io/File;", "parameterToString", "processGraphObject", "", "serializer", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "processGraphObjectProperty", "key", "passByValue", "processRequest", "logger", "Lcom/facebook/internal/Logger;", "numRequests", "outputStream", "Ljava/io/OutputStream;", "shouldUseGzip", "runCallbacks", "responses", "runCallbacks$facebook_core_release", "serializeAttachments", "attachments", "", "Lcom/facebook/GraphRequest$Attachment;", "Lcom/facebook/GraphRequest$Serializer;", "serializeParameters", "bundle", "serializeRequestsAsJSON", "", "serializeToUrlConnection", "serializeToUrlConnection$facebook_core_release", "setConnectionContentType", "setDefaultBatchApplicationId", "toHttpConnection", "([Lcom/facebook/GraphRequest;)Ljava/net/HttpURLConnection;", "validateFieldsParamForGetRequests", "validateFieldsParamForGetRequests$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
        /* renamed from: lz$c$a */
        /* loaded from: classes2.dex */
        public static final class a implements b {
            final /* synthetic */ d a = null;

            a() {
            }

            @Override // defpackage.lz.b
            public final void a(mc mcVar) {
                dqc.d(mcVar, "response");
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        public static lz a() {
            return new lz((lk) null, "me", (Bundle) null, (md) null, new a(), 32);
        }

        public static lz a(lk lkVar, String str, JSONObject jSONObject, b bVar) {
            lz lzVar = new lz(lkVar, str, (Bundle) null, md.POST, bVar, 32);
            lzVar.c = jSONObject;
            return lzVar;
        }

        public static lz a(lk lkVar, String str, b bVar) {
            return new lz(lkVar, str, (Bundle) null, (md) null, bVar, 32);
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x01fb A[Catch: JSONException -> 0x01ff, IOException -> 0x0202, TryCatch #8 {IOException -> 0x0202, JSONException -> 0x01ff, blocks: (B:26:0x00e4, B:28:0x0101, B:31:0x010b, B:32:0x010d, B:35:0x0118, B:36:0x0125, B:37:0x013f, B:41:0x0190, B:42:0x0195, B:54:0x01ed, B:61:0x01fb, B:62:0x01fe), top: B:87:0x00e4 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.net.HttpURLConnection c(defpackage.mb r18) {
            /*
                Method dump skipped, instructions count: 572
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.c.c(mb):java.net.HttpURLConnection");
        }

        public final mc a(lz lzVar) {
            dqc.d(lzVar, "request");
            List<mc> a2 = a(lzVar);
            if (a2.size() != 1) {
                throw new FacebookException("invalid state: expected a single response");
            }
            return a2.get(0);
        }

        private List<mc> a(lz... lzVarArr) {
            dqc.d(lzVarArr, "requests");
            return a((Collection<lz>) dmj.b(lzVarArr));
        }

        private List<mc> a(Collection<lz> collection) {
            dqc.d(collection, "requests");
            return a(new mb(collection));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r1v6 */
        public final List<mc> a(mb mbVar) {
            Exception exc;
            ?? r1;
            List<mc> list;
            dqc.d(mbVar, "requests");
            qj.a((Collection) mbVar, "requests");
            URLConnection uRLConnection = null;
            try {
                exc = null;
                r1 = c(mbVar);
            } catch (Exception e) {
                exc = e;
                r1 = 0;
            } catch (Throwable th) {
                th = th;
                qi.a(uRLConnection);
                throw th;
            }
            try {
                if (r1 != 0) {
                    list = a((HttpURLConnection) r1, mbVar);
                } else {
                    mc.a aVar = mc.d;
                    List<mc> a2 = mc.a.a(mbVar.d, (HttpURLConnection) null, new FacebookException(exc));
                    a(mbVar, a2);
                    list = a2;
                }
                r1 = (URLConnection) r1;
                qi.a((URLConnection) r1);
                return list;
            } catch (Throwable th2) {
                th = th2;
                uRLConnection = r1;
                qi.a(uRLConnection);
                throw th;
            }
        }

        public static ma b(mb mbVar) {
            dqc.d(mbVar, "requests");
            qj.a((Collection) mbVar, "requests");
            ma maVar = new ma(mbVar, (byte) 0);
            maVar.executeOnExecutor(ly.a(), new Void[0]);
            return maVar;
        }

        public static List<mc> a(HttpURLConnection httpURLConnection, mb mbVar) {
            dqc.d(httpURLConnection, "connection");
            dqc.d(mbVar, "requests");
            mc.a aVar = mc.d;
            List<mc> a2 = mc.a.a(httpURLConnection, mbVar);
            qi.a(httpURLConnection);
            int size = mbVar.size();
            if (size != a2.size()) {
                dqi dqiVar = dqi.a;
                String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(a2.size()), Integer.valueOf(size)}, 2));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                throw new FacebookException(format);
            }
            a(mbVar, a2);
            ln.c.a().a();
            return a2;
        }

        private static void a(mb mbVar, List<mc> list) {
            dqc.d(mbVar, "requests");
            dqc.d(list, "responses");
            int size = mbVar.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                lz lzVar = mbVar.get(i);
                if (lzVar.f != null) {
                    arrayList.add(new Pair(lzVar.f, list.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                b bVar = new b(arrayList, mbVar);
                Handler handler = mbVar.a;
                if (handler != null) {
                    handler.post(bVar);
                } else {
                    bVar.run();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
        /* renamed from: lz$c$b */
        /* loaded from: classes2.dex */
        public static final class b implements Runnable {
            final /* synthetic */ ArrayList a;
            final /* synthetic */ mb b;

            b(ArrayList arrayList, mb mbVar) {
                this.a = arrayList;
                this.b = mbVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        Object obj = pair.second;
                        dqc.b(obj, "pair.second");
                        ((b) pair.first).a((mc) obj);
                    }
                    for (mb.a aVar : this.b.e) {
                        aVar.a(this.b);
                    }
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }

        private static boolean e(mb mbVar) {
            Iterator<lz> it = mbVar.iterator();
            while (it.hasNext()) {
                lz next = it.next();
                for (String str : next.d.keySet()) {
                    if (a(next.d.get(str))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final void a(mb mbVar, qc qcVar, int i, URL url, OutputStream outputStream, boolean z) {
            h hVar = new h(outputStream, qcVar, z);
            boolean z2 = false;
            if (i == 1) {
                lz lzVar = mbVar.get(0);
                HashMap hashMap = new HashMap();
                for (String str : lzVar.d.keySet()) {
                    Object obj = lzVar.d.get(str);
                    if (a(obj)) {
                        dqc.b(str, "key");
                        hashMap.put(str, new a(lzVar, obj));
                    }
                }
                if (qcVar != null) {
                    qcVar.a("  Parameters:\n");
                }
                a(lzVar.d, hVar, lzVar);
                if (qcVar != null) {
                    qcVar.a("  Attachments:\n");
                }
                a(hashMap, hVar);
                JSONObject jSONObject = lzVar.c;
                if (jSONObject == null) {
                    return;
                }
                String path = url.getPath();
                dqc.b(path, "url.path");
                a(jSONObject, path, hVar);
                return;
            }
            String f = f(mbVar);
            if (f.length() == 0) {
                z2 = true;
            }
            if (z2) {
                throw new FacebookException("App ID was not specified at the request or Settings.");
            }
            hVar.a("batch_app_id", f);
            HashMap hashMap2 = new HashMap();
            a(hVar, mbVar, hashMap2);
            if (qcVar != null) {
                qcVar.a("  Attachments:\n");
            }
            a(hashMap2, hVar);
        }

        private final void a(String str, Object obj, e eVar, boolean z) {
            c cVar = this;
            while (true) {
                Class<?> cls = obj.getClass();
                if (!JSONObject.class.isAssignableFrom(cls)) {
                    if (JSONArray.class.isAssignableFrom(cls)) {
                        if (obj != null) {
                            JSONArray jSONArray = (JSONArray) obj;
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                dqi dqiVar = dqi.a;
                                String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                                Object opt = jSONArray.opt(i);
                                dqc.b(opt, "jsonArray.opt(i)");
                                cVar.a(format, opt, eVar, z);
                            }
                            return;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                        }
                    } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                        eVar.a(str, obj.toString());
                        return;
                    } else if (!Date.class.isAssignableFrom(cls)) {
                        return;
                    } else {
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.util.Date");
                        }
                        String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                        dqc.b(format2, "iso8601DateFormat.format(date)");
                        eVar.a(str, format2);
                        return;
                    }
                } else if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (z) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            dqi dqiVar2 = dqi.a;
                            String format3 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                            dqc.b(format3, "java.lang.String.format(format, *args)");
                            Object opt2 = jSONObject.opt(next);
                            dqc.b(opt2, "jsonObject.opt(propertyName)");
                            cVar.a(format3, opt2, eVar, z);
                        }
                        return;
                    } else if (jSONObject.has("id")) {
                        cVar = cVar;
                        obj = jSONObject.optString("id");
                        dqc.b(obj, "jsonObject.optString(\"id\")");
                    } else if (jSONObject.has("url")) {
                        cVar = cVar;
                        obj = jSONObject.optString("url");
                        dqc.b(obj, "jsonObject.optString(\"url\")");
                    } else if (!jSONObject.has("fbsdk:create_object")) {
                        return;
                    } else {
                        cVar = cVar;
                        obj = jSONObject.toString();
                        dqc.b(obj, "jsonObject.toString()");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            }
        }

        private static void a(Bundle bundle, h hVar, lz lzVar) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (b(obj)) {
                    dqc.b(str, "key");
                    hVar.a(str, obj, lzVar);
                }
            }
        }

        private static void a(h hVar, Collection<lz> collection, Map<String, a> map) {
            JSONArray jSONArray = new JSONArray();
            for (lz lzVar : collection) {
                lz.a(lzVar, jSONArray, map);
            }
            hVar.a("batch", jSONArray, collection);
        }

        static boolean a(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
        }

        static boolean b(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        static String c(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                dqc.b(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        private static void a(Map<String, a> map, h hVar) {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                c cVar = lz.k;
                if (a(entry.getValue().b)) {
                    hVar.a(entry.getKey(), entry.getValue().b, entry.getValue().a);
                }
            }
        }

        private static boolean d(mb mbVar) {
            for (mb.a aVar : mbVar.e) {
                if (aVar instanceof mb.c) {
                    return true;
                }
            }
            Iterator<lz> it = mbVar.iterator();
            while (it.hasNext()) {
                if (it.next().f instanceof f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final void a(org.json.JSONObject r9, java.lang.String r10, defpackage.lz.e r11) {
            /*
                r8 = this;
                java.util.regex.Pattern r0 = defpackage.lz.e()
                r1 = r10
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.util.regex.Matcher r0 = r0.matcher(r1)
                boolean r2 = r0.matches()
                r3 = 1
                if (r2 == 0) goto L1b
                java.lang.String r10 = r0.group(r3)
                java.lang.String r0 = "matcher.group(1)"
                defpackage.dqc.b(r10, r0)
            L1b:
                java.lang.String r0 = "me/"
                boolean r0 = defpackage.dsg.c(r10, r0)
                r2 = 0
                if (r0 != 0) goto L2f
                java.lang.String r0 = "/me/"
                boolean r10 = defpackage.dsg.c(r10, r0)
                if (r10 == 0) goto L2d
                goto L2f
            L2d:
                r10 = 0
                goto L30
            L2f:
                r10 = 1
            L30:
                if (r10 == 0) goto L49
                java.lang.String r10 = ":"
                r0 = 6
                int r10 = defpackage.dsg.a(r1, r10, r2, r0)
                java.lang.String r4 = "?"
                int r0 = defpackage.dsg.a(r1, r4, r2, r0)
                r1 = 3
                if (r10 <= r1) goto L49
                r1 = -1
                if (r0 == r1) goto L47
                if (r10 >= r0) goto L49
            L47:
                r10 = 1
                goto L4a
            L49:
                r10 = 0
            L4a:
                java.util.Iterator r0 = r9.keys()
            L4e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L7c
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r9.opt(r1)
                if (r10 == 0) goto L6a
                java.lang.String r5 = "image"
                boolean r5 = defpackage.dsg.b(r1, r5)
                if (r5 == 0) goto L6a
                r5 = 1
                goto L6b
            L6a:
                r5 = 0
            L6b:
                r6 = r8
                lz$c r6 = (defpackage.lz.c) r6
                java.lang.String r7 = "key"
                defpackage.dqc.b(r1, r7)
                java.lang.String r7 = "value"
                defpackage.dqc.b(r4, r7)
                r6.a(r1, r4, r11, r5)
                goto L4e
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.c.a(org.json.JSONObject, java.lang.String, lz$e):void");
        }

        private static String f(mb mbVar) {
            String str = mbVar.f;
            boolean z = true;
            if (str == null || !(!mbVar.isEmpty())) {
                Iterator<lz> it = mbVar.iterator();
                while (it.hasNext()) {
                    lk lkVar = it.next().a;
                    if (lkVar != null) {
                        return lkVar.h;
                    }
                }
                String str2 = lz.r;
                if (str2 != null) {
                    if (str2.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        return str2;
                    }
                }
                return ly.m();
            }
            return str;
        }
    }

    static {
        String simpleName = lz.class.getSimpleName();
        dqc.b(simpleName, "GraphRequest::class.java.simpleName");
        j = simpleName;
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        dqc.b(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < nextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String sb2 = sb.toString();
        dqc.b(sb2, "buffer.toString()");
        q = sb2;
        s = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lz$i */
    /* loaded from: classes2.dex */
    public static final class i implements b {
        final /* synthetic */ b a;

        i(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.lz.b
        public final void a(mc mcVar) {
            dqc.d(mcVar, "response");
            JSONObject jSONObject = mcVar.b;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("__debug__") : null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                    String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                    if (optString != null && optString2 != null) {
                        mf mfVar = mf.GRAPH_API_DEBUG_INFO;
                        if (dqc.a((Object) optString2, (Object) "warning")) {
                            mfVar = mf.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!qi.a(optString3)) {
                            optString = optString + " Link: " + optString3;
                        }
                        qc.a.a(mfVar, lz.j, optString);
                    }
                }
            }
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(mcVar);
            }
        }
    }

    public /* synthetic */ lz(lk lkVar, String str, Bundle bundle, md mdVar, b bVar, int i2) {
        this((i2 & 1) != 0 ? null : lkVar, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bundle, (i2 & 8) != 0 ? null : mdVar, (i2 & 16) != 0 ? null : bVar);
    }

    private lz(lk lkVar, String str, Bundle bundle, md mdVar, b bVar) {
        this.n = true;
        this.a = lkVar;
        this.b = str;
        this.o = null;
        a(bVar);
        a(mdVar);
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        if (this.o == null) {
            this.o = ly.e();
        }
    }

    public final ma a() {
        lz[] lzVarArr = {this};
        dqc.d(lzVarArr, "requests");
        List b2 = dmj.b(lzVarArr);
        dqc.d(b2, "requests");
        return c.b(new mb(b2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.g);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        String sb2 = sb.toString();
        dqc.b(sb2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            r7 = this;
            android.os.Bundle r0 = r7.d
            boolean r1 = r7.h
            java.lang.String r2 = "access_token"
            if (r1 != 0) goto L49
            java.lang.String r1 = r7.h()
            r3 = 0
            if (r1 == 0) goto L1b
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = "|"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = defpackage.dsg.a(r4, r5)
            goto L1c
        L1b:
            r4 = 0
        L1c:
            r5 = 1
            if (r1 == 0) goto L2b
            java.lang.String r6 = "IG"
            boolean r1 = defpackage.dsg.c(r1, r6)
            if (r1 == 0) goto L2b
            if (r4 != 0) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L36
            boolean r1 = r7.m()
            if (r1 == 0) goto L36
        L34:
            r3 = 1
            goto L3f
        L36:
            boolean r1 = r7.l()
            if (r1 != 0) goto L3f
            if (r4 != 0) goto L3f
            goto L34
        L3f:
            if (r3 == 0) goto L49
            java.lang.String r1 = i()
            r0.putString(r2, r1)
            goto L52
        L49:
            java.lang.String r1 = r7.h()
            if (r1 == 0) goto L52
            r0.putString(r2, r1)
        L52:
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L5f
            java.lang.String r1 = defpackage.ly.o()
            defpackage.qi.a(r1)
        L5f:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            mf r1 = defpackage.mf.GRAPH_API_DEBUG_INFO
            boolean r1 = defpackage.ly.a(r1)
            java.lang.String r2 = "debug"
            if (r1 == 0) goto L7d
            java.lang.String r1 = "info"
            r0.putString(r2, r1)
            return
        L7d:
            mf r1 = defpackage.mf.GRAPH_API_DEBUG_WARNING
            boolean r1 = defpackage.ly.a(r1)
            if (r1 == 0) goto L8a
            java.lang.String r1 = "warning"
            r0.putString(r2, r1)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.g():void");
    }

    private final String h() {
        lk lkVar = this.a;
        if (lkVar != null) {
            if (!this.d.containsKey("access_token")) {
                String str = lkVar.e;
                qc.a.a(str);
                return str;
            }
        } else if (!this.h && !this.d.containsKey("access_token")) {
            return i();
        }
        return this.d.getString("access_token");
    }

    private static String i() {
        String m = ly.m();
        String o = ly.o();
        if (!qi.a(m) && !qi.a(o)) {
            StringBuilder sb = new StringBuilder();
            if (m == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            sb.append(m);
            sb.append("|");
            if (o == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            sb.append(o);
            return sb.toString();
        }
        qi.a();
        return null;
    }

    private final String a(String str, boolean z) {
        if (z || this.g != md.POST) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (String str2 : this.d.keySet()) {
                Object obj = this.d.get(str2);
                if (obj == null) {
                    obj = "";
                }
                if (!c.b(obj)) {
                    if (this.g != md.GET) {
                        dqi dqiVar = dqi.a;
                        String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                        dqc.b(format, "java.lang.String.format(locale, format, *args)");
                        throw new IllegalArgumentException(format);
                    }
                } else {
                    buildUpon.appendQueryParameter(str2, c.c(obj).toString());
                }
            }
            String builder = buildUpon.toString();
            dqc.b(builder, "uriBuilder.toString()");
            return builder;
        }
        return str;
    }

    private String j() {
        if (this.p != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String b2 = b(qg.g());
        g();
        Uri parse = Uri.parse(a(b2, true));
        dqi dqiVar = dqi.a;
        dqc.b(parse, "uri");
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        dqc.b(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final String b() {
        String str;
        String str2 = this.p;
        if (str2 != null) {
            return String.valueOf(str2);
        }
        String str3 = this.b;
        if (this.g == md.POST && str3 != null && dsg.d(str3, "/videos")) {
            str = qg.h();
        } else {
            str = qg.a(ly.j());
        }
        String b2 = b(str);
        g();
        return a(b2, false);
    }

    private final String k() {
        if (s.matcher(this.b).matches()) {
            return this.b;
        }
        dqi dqiVar = dqi.a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.o, this.b}, 2));
        dqc.b(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String b(String str) {
        if (!l()) {
            str = qg.i();
        }
        dqi dqiVar = dqi.a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, k()}, 2));
        dqc.b(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean l() {
        return (dqc.a((Object) ly.j(), (Object) "instagram.com") ^ true) || !m();
    }

    private final boolean m() {
        if (this.b == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(ly.m());
        sb.append("/?.*");
        return this.i || Pattern.matches(sb.toString(), this.b) || Pattern.matches("^/?app/?.*", this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/GraphRequest$Attachment;", "", "request", "Lcom/facebook/GraphRequest;", "value", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "getRequest", "()Lcom/facebook/GraphRequest;", "getValue", "()Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$a */
    /* loaded from: classes2.dex */
    public static final class a {
        final lz a;
        final Object b;

        public a(lz lzVar, Object obj) {
            dqc.d(lzVar, "request");
            this.a = lzVar;
            this.b = obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/facebook/GraphRequest$serializeToBatch$1", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "writeString", "", "key", "", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$j */
    /* loaded from: classes2.dex */
    public static final class j implements e {
        final /* synthetic */ ArrayList a;

        j(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // defpackage.lz.e
        public final void a(String str, String str2) throws IOException {
            dqc.d(str, "key");
            dqc.d(str2, "value");
            ArrayList arrayList = this.a;
            dqi dqiVar = dqi.a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            dqc.b(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ$\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0012J \u0010\"\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0012J \u0010&\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\u0012J+\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\"\u0010*\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u00152\b\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010.\u001a\u00020\u0010J$\u0010/\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020-03J\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00060\u000bj\u0002`\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/facebook/GraphRequest$Serializer;", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "outputStream", "Ljava/io/OutputStream;", "logger", "Lcom/facebook/internal/Logger;", "useUrlEncode", "", "(Ljava/io/OutputStream;Lcom/facebook/internal/Logger;Z)V", "firstWrite", "invalidTypeError", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "getInvalidTypeError", "()Ljava/lang/RuntimeException;", "write", "", "format", "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "writeBitmap", "key", "bitmap", "Landroid/graphics/Bitmap;", "writeBytes", "bytes", "", "writeContentDisposition", "name", "filename", "contentType", "writeContentUri", "contentUri", "Landroid/net/Uri;", "mimeType", "writeFile", "descriptor", "Landroid/os/ParcelFileDescriptor;", "writeLine", "writeObject", "value", "request", "Lcom/facebook/GraphRequest;", "writeRecordBoundary", "writeRequestsAsJson", "requestJsonArray", "Lorg/json/JSONArray;", "requests", "", "writeString", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$h */
    /* loaded from: classes2.dex */
    public static final class h implements e {
        private boolean a = true;
        private final boolean b;
        private final OutputStream c;
        private final qc d;

        public h(OutputStream outputStream, qc qcVar, boolean z) {
            dqc.d(outputStream, "outputStream");
            this.c = outputStream;
            this.d = qcVar;
            this.b = z;
        }

        public final void a(String str, Object obj, lz lzVar) {
            dqc.d(str, "key");
            OutputStream outputStream = this.c;
            if (outputStream instanceof ml) {
                if (outputStream == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
                }
                ((ml) outputStream).a(lzVar);
            }
            c cVar = lz.k;
            if (c.b(obj)) {
                c cVar2 = lz.k;
                a(str, c.c(obj));
            } else if (obj instanceof Bitmap) {
                a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof g) {
                g gVar = (g) obj;
                RESOURCE resource = gVar.b;
                String str2 = gVar.a;
                if (resource instanceof ParcelFileDescriptor) {
                    a(str, (ParcelFileDescriptor) resource, str2);
                } else if (resource instanceof Uri) {
                    a(str, (Uri) resource, str2);
                } else {
                    throw a();
                }
            } else {
                throw a();
            }
        }

        private static RuntimeException a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void a(String str, JSONArray jSONArray, Collection<lz> collection) {
            dqc.d(str, "key");
            dqc.d(jSONArray, "requestJsonArray");
            dqc.d(collection, "requests");
            OutputStream outputStream = this.c;
            if (!(outputStream instanceof ml)) {
                String jSONArray2 = jSONArray.toString();
                dqc.b(jSONArray2, "requestJsonArray.toString()");
                a(str, jSONArray2);
            } else if (outputStream != null) {
                ml mlVar = (ml) outputStream;
                a(str, (String) null, (String) null);
                a("[", new Object[0]);
                int i = 0;
                for (lz lzVar : collection) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    mlVar.a(lzVar);
                    if (i > 0) {
                        a(",%s", jSONObject.toString());
                    } else {
                        a("%s", jSONObject.toString());
                    }
                    i++;
                }
                a("]", new Object[0]);
                qc qcVar = this.d;
                if (qcVar == null) {
                    return;
                }
                String concat = "    ".concat(String.valueOf(str));
                String jSONArray3 = jSONArray.toString();
                dqc.b(jSONArray3, "requestJsonArray.toString()");
                qcVar.a(concat, jSONArray3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
            }
        }

        @Override // defpackage.lz.e
        public final void a(String str, String str2) {
            dqc.d(str, "key");
            dqc.d(str2, "value");
            a(str, (String) null, (String) null);
            b("%s", str2);
            b();
            qc qcVar = this.d;
            if (qcVar != null) {
                qcVar.a("    ".concat(String.valueOf(str)), str2);
            }
        }

        private void a(String str, Bitmap bitmap) {
            dqc.d(str, "key");
            dqc.d(bitmap, "bitmap");
            a(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.c);
            b("", new Object[0]);
            b();
            qc qcVar = this.d;
            if (qcVar != null) {
                qcVar.a("    ".concat(String.valueOf(str)), "<Image>");
            }
        }

        private void a(String str, byte[] bArr) {
            dqc.d(str, "key");
            dqc.d(bArr, "bytes");
            a(str, str, "content/unknown");
            this.c.write(bArr);
            b("", new Object[0]);
            b();
            qc qcVar = this.d;
            if (qcVar != null) {
                String concat = "    ".concat(String.valueOf(str));
                dqi dqiVar = dqi.a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                qcVar.a(concat, format);
            }
        }

        private void a(String str, Uri uri, String str2) {
            int i;
            dqc.d(str, "key");
            dqc.d(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            if (this.c instanceof mj) {
                ((mj) this.c).a(qi.d(uri));
                i = 0;
            } else {
                i = qi.a(ly.k().getContentResolver().openInputStream(uri), this.c) + 0;
            }
            b("", new Object[0]);
            b();
            qc qcVar = this.d;
            if (qcVar != null) {
                String concat = "    ".concat(String.valueOf(str));
                dqi dqiVar = dqi.a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                qcVar.a(concat, format);
            }
        }

        private void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            dqc.d(str, "key");
            dqc.d(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            OutputStream outputStream = this.c;
            if (outputStream instanceof mj) {
                ((mj) outputStream).a(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = qi.a((InputStream) new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.c) + 0;
            }
            b("", new Object[0]);
            b();
            qc qcVar = this.d;
            if (qcVar != null) {
                String concat = "    ".concat(String.valueOf(str));
                dqi dqiVar = dqi.a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                qcVar.a(concat, format);
            }
        }

        private void b() {
            if (!this.b) {
                b("--%s", lz.q);
                return;
            }
            OutputStream outputStream = this.c;
            byte[] bytes = "&".getBytes(dsd.a);
            dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        private void a(String str, String str2, String str3) {
            if (!this.b) {
                a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    a("; filename=\"%s\"", str2);
                }
                b("", new Object[0]);
                if (str3 != null) {
                    b("%s: %s", "Content-Type", str3);
                }
                b("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.c;
            dqi dqiVar = dqi.a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            Charset charset = dsd.a;
            if (format == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = format.getBytes(charset);
            dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        private void a(String str, Object... objArr) {
            dqc.d(str, "format");
            dqc.d(objArr, "args");
            if (!this.b) {
                if (this.a) {
                    OutputStream outputStream = this.c;
                    byte[] bytes = "--".getBytes(dsd.a);
                    dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.c;
                    String str2 = lz.q;
                    Charset charset = dsd.a;
                    if (str2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes2 = str2.getBytes(charset);
                    dqc.b(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes2);
                    OutputStream outputStream3 = this.c;
                    byte[] bytes3 = "\r\n".getBytes(dsd.a);
                    dqc.b(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes3);
                    this.a = false;
                }
                OutputStream outputStream4 = this.c;
                dqi dqiVar = dqi.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                dqc.b(format, "java.lang.String.format(format, *args)");
                Charset charset2 = dsd.a;
                if (format == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes4 = format.getBytes(charset2);
                dqc.b(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.c;
            dqi dqiVar2 = dqi.a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            dqc.b(format2, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format2, "UTF-8");
            dqc.b(encode, "URLEncoder.encode(String… format, *args), \"UTF-8\")");
            Charset charset3 = dsd.a;
            if (encode != null) {
                byte[] bytes5 = encode.getBytes(charset3);
                dqc.b(bytes5, "(this as java.lang.String).getBytes(charset)");
                outputStream5.write(bytes5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        private void b(String str, Object... objArr) {
            dqc.d(str, "format");
            dqc.d(objArr, "args");
            a(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.b) {
                a("\r\n", new Object[0]);
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u0015*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0002:\u0001\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "RESOURCE", "Landroid/os/Parcelable;", "resource", "mimeType", "", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getMimeType", "()Ljava/lang/String;", "getResource", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "describeContents", "", "writeToParcel", "", "out", "flags", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lz$g */
    /* loaded from: classes2.dex */
    public static final class g<RESOURCE extends Parcelable> implements Parcelable {
        final String a;
        final RESOURCE b;
        public static final a c = new a((byte) 0);
        public static final Parcelable.Creator<g<?>> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        public /* synthetic */ g(Parcel parcel, byte b2) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            dqc.d(parcel, "out");
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public g(RESOURCE resource, String str) {
            this.a = str;
            this.b = resource;
        }

        private g(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (RESOURCE) parcel.readParcelable(ly.k().getClassLoader());
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: lz$g$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J!\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: lz$g$b */
        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<g<?>> {
            b() {
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ g<?> createFromParcel(Parcel parcel) {
                dqc.d(parcel, "source");
                return new g<>(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ g<?>[] newArray(int i) {
                return new g[i];
            }
        }
    }

    public static final /* synthetic */ void a(lz lzVar, JSONArray jSONArray, Map map) {
        JSONObject jSONObject = new JSONObject();
        String str = lzVar.l;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", lzVar.n);
        }
        String str2 = lzVar.m;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String j2 = lzVar.j();
        jSONObject.put("relative_url", j2);
        jSONObject.put("method", lzVar.g);
        lk lkVar = lzVar.a;
        if (lkVar != null) {
            qc.a.a(lkVar.e);
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : lzVar.d.keySet()) {
            Object obj = lzVar.d.get(str3);
            if (c.a(obj)) {
                dqi dqiVar = dqi.a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(lzVar, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = lzVar.c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            k.a(jSONObject2, j2, new j(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }
}
