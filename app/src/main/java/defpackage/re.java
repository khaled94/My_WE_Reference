package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper;", "", "()V", "webViewHTMLs", "", "", "webViews", "", "Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData;", "dump", "", "writer", "Ljava/io/PrintWriter;", "handle", "view", "Landroid/webkit/WebView;", "Companion", "WebViewData", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: re  reason: default package */
/* loaded from: classes2.dex */
public final class re {
    public static final a b = new a((byte) 0);
    final Set<b> a = new LinkedHashSet();
    private final Map<String, String> c = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "html", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, k = 3, mv = {1, 5, 1})
    /* renamed from: re$c */
    /* loaded from: classes2.dex */
    static final class c<T> implements ValueCallback {
        final /* synthetic */ b b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(b bVar) {
            this.b = bVar;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Object obj) {
            String str = (String) obj;
            Map map = re.this.c;
            String str2 = this.b.a;
            dqc.b(str, "html");
            map.put(str2, str);
        }
    }

    public final void a(PrintWriter printWriter) {
        dqc.d(printWriter, "writer");
        try {
            for (b bVar : this.a) {
                String str = this.c.get(bVar.a);
                if (str != null) {
                    printWriter.print("WebView HTML for ");
                    printWriter.print(bVar);
                    printWriter.println(":");
                    String a2 = dsg.a(dsg.a(dsg.a(str, "\\u003C", "<"), "\\n", ""), "\\\"", "\"");
                    dqi dqiVar = dqi.a;
                    Object[] objArr = new Object[6];
                    objArr[0] = bVar.a;
                    objArr[1] = Integer.valueOf(bVar.b);
                    objArr[2] = Integer.valueOf(bVar.c);
                    objArr[3] = Integer.valueOf(bVar.d);
                    objArr[4] = Integer.valueOf(bVar.e);
                    int length = a2.length() - 1;
                    if (a2 != null) {
                        String substring = a2.substring(1, length);
                        dqc.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        objArr[5] = substring;
                        String format = String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", Arrays.copyOf(objArr, 6));
                        dqc.b(format, "java.lang.String.format(format, *args)");
                        printWriter.println(format);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        } catch (Exception unused) {
        }
        this.a.clear();
        this.c.clear();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData;", "", "webView", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "height", "", "getHeight", "()I", "key", "", "getKey", "()Ljava/lang/String;", "left", "getLeft", "top", "getTop", "width", "getWidth", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: re$b */
    /* loaded from: classes2.dex */
    static final class b {
        public static final a f = new a((byte) 0);
        private static final int[] g = new int[2];
        final String a;
        final int b;
        final int c;
        final int d;
        final int e;

        public b(WebView webView) {
            dqc.d(webView, "webView");
            dqi dqiVar = dqi.a;
            String format = String.format("%s{%s}", Arrays.copyOf(new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())}, 2));
            dqc.b(format, "java.lang.String.format(format, *args)");
            this.a = format;
            webView.getLocationOnScreen(g);
            int[] iArr = g;
            this.b = iArr[0];
            this.c = iArr[1];
            this.d = webView.getWidth();
            this.e = webView.getHeight();
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData$Companion;", "", "()V", "location", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: re$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$Companion;", "", "()V", "GET_WEBVIEW_HTML_JS_SCRIPT", "", "fixHtmlString", "data", "Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData;", "html", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: re$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
