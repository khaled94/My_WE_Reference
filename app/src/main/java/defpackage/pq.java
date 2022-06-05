package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import defpackage.qk;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/FacebookWebFallbackDialog;", "Lcom/facebook/internal/WebDialog;", "context", "Landroid/content/Context;", "url", "", "expectedRedirectUrl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "waitingForDialogToClose", "", "cancel", "", "parseResponseUri", "Landroid/os/Bundle;", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pq  reason: default package */
/* loaded from: classes2.dex */
public final class pq extends qk {
    public static final a a = new a((byte) 0);
    private static final String i;
    private boolean h;

    public /* synthetic */ pq(Context context, String str, String str2, byte b2) {
        this(context, str, str2);
    }

    private pq(Context context, String str, String str2) {
        super(context, str);
        dqc.d(str2, "expectedRedirectUrl");
        this.b = str2;
    }

    @Override // defpackage.qk
    public final Bundle a(String str) {
        Uri parse = Uri.parse(str);
        dqc.b(parse, "responseUri");
        Bundle d = qi.d(parse.getQuery());
        String string = d.getString("bridge_args");
        d.remove("bridge_args");
        if (!qi.a(string)) {
            try {
                d.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", pi.a(new JSONObject(string)));
            } catch (JSONException unused) {
                qi.e(i);
            }
        }
        String string2 = d.getString("method_results");
        d.remove("method_results");
        if (!qi.a(string2)) {
            try {
                d.putBundle("com.facebook.platform.protocol.RESULT_ARGS", pi.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                qi.e(i);
            }
        }
        d.remove("version");
        d.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", qd.a());
        return d;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pq$b */
    /* loaded from: classes2.dex */
    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                pq.super.cancel();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/internal/FacebookWebFallbackDialog$Companion;", "", "()V", "OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS", "", "TAG", "", "newInstance", "Lcom/facebook/internal/FacebookWebFallbackDialog;", "context", "Landroid/content/Context;", "url", "expectedRedirectUrl", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pq$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static pq a(Context context, String str, String str2) {
            dqc.d(context, "context");
            dqc.d(str, "url");
            dqc.d(str2, "expectedRedirectUrl");
            qk.b bVar = qk.g;
            qk.b.a(context);
            return new pq(context, str, str2, (byte) 0);
        }
    }

    static {
        String name = pq.class.getName();
        dqc.b(name, "FacebookWebFallbackDialog::class.java.name");
        i = name;
    }

    @Override // defpackage.qk, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        WebView webView = this.d;
        if (!this.f || this.e || webView == null || !webView.isShown()) {
            super.cancel();
        } else if (this.h) {
        } else {
            this.h = true;
            webView.loadUrl("javascript:".concat("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new b(), 1500L);
        }
    }
}
