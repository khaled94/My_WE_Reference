package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.common.R;
import defpackage.lk;
import defpackage.lz;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\f\b\u0016\u0018\u0000 N2\u00020\u0001:\u0006MNOPQRB\u0017\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB=\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0016J(\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\bH\u0002J\b\u00106\u001a\u00020-H\u0016J\u0012\u00107\u001a\u00020-2\b\u00108\u001a\u0004\u0018\u00010\fH\u0014J\b\u00109\u001a\u00020-H\u0016J\u0018\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020-H\u0014J\b\u0010?\u001a\u00020-H\u0014J\u0010\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020+H\u0016J\u0012\u0010B\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010\u0005H\u0017J\u0006\u0010D\u001a\u00020-J\u0012\u0010E\u001a\u00020-2\b\u0010F\u001a\u0004\u0018\u00010GH\u0004J\u0012\u0010H\u001a\u00020-2\b\u0010I\u001a\u0004\u0018\u00010\fH\u0004J\u0010\u0010J\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0005H\u0004J\u0010\u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020\bH\u0003R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0018\u00010%R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u0019\u001a\u0004\u0018\u00010&@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/facebook/internal/WebDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "url", "", "(Landroid/content/Context;Ljava/lang/String;)V", "theme", "", "(Landroid/content/Context;Ljava/lang/String;I)V", "action", "parameters", "Landroid/os/Bundle;", "targetApp", "Lcom/facebook/login/LoginTargetApp;", "listener", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/login/LoginTargetApp;Lcom/facebook/internal/WebDialog$OnCompleteListener;)V", "contentFrameLayout", "Landroid/widget/FrameLayout;", "crossImageView", "Landroid/widget/ImageView;", "expectedRedirectUrl", "isDetached", "", "<set-?>", "isListenerCalled", "()Z", "isPageFinished", "onCompleteListener", "getOnCompleteListener", "()Lcom/facebook/internal/WebDialog$OnCompleteListener;", "setOnCompleteListener", "(Lcom/facebook/internal/WebDialog$OnCompleteListener;)V", "spinner", "Landroid/app/ProgressDialog;", "uploadTask", "Lcom/facebook/internal/WebDialog$UploadStagingResourcesTask;", "Landroid/webkit/WebView;", "webView", "getWebView", "()Landroid/webkit/WebView;", "windowParams", "Landroid/view/WindowManager$LayoutParams;", "cancel", "", "createCrossImage", "dismiss", "getScaledSize", "screenSize", "density", "", "noPaddingSize", "maxPaddingSize", "onAttachedToWindow", "onCreate", "savedInstanceState", "onDetachedFromWindow", "onKeyDown", "keyCode", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onStart", "onStop", "onWindowAttributesChanged", "params", "parseResponseUri", "urlString", "resize", "sendErrorToListener", "error", "", "sendSuccessToListener", "values", "setExpectedRedirectUrl", "setUpWebView", "margin", "Builder", "Companion", "DialogWebViewClient", "InitCallback", "OnCompleteListener", "UploadStagingResourcesTask", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qk  reason: default package */
/* loaded from: classes2.dex */
public class qk extends Dialog {
    public static final b g = new b((byte) 0);
    private static final int n = R.style.com_facebook_activity_theme;
    private static volatile int o;
    private String a;
    String b;
    d c;
    WebView d;
    boolean e;
    boolean f;
    private ProgressDialog h;
    private ImageView i;
    private FrameLayout j;
    private e k;
    private boolean l;
    private WindowManager.LayoutParams m;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/internal/WebDialog$OnCompleteListener;", "", "onComplete", "", "values", "Landroid/os/Bundle;", "error", "Lcom/facebook/FacebookException;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qk$d */
    /* loaded from: classes2.dex */
    public interface d {
        void a(Bundle bundle, FacebookException facebookException);
    }

    private static int a(int i2, float f2, int i3, int i4) {
        int i5 = (int) (i2 / f2);
        double d2 = 0.5d;
        if (i5 <= i3) {
            d2 = 1.0d;
        } else if (i5 < i4) {
            d2 = 0.5d + (((i4 - i5) / (i4 - i3)) * 0.5d);
        }
        return (int) (i2 * d2);
    }

    public static final qk a(Context context, String str, Bundle bundle, int i2, rz rzVar, d dVar) {
        return b.a(context, str, bundle, i2, rzVar, dVar);
    }

    public /* synthetic */ qk(Context context, String str, Bundle bundle, int i2, rz rzVar, d dVar, byte b2) {
        this(context, str, bundle, i2, rzVar, dVar);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        dqc.d(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (i2 == 4) {
            WebView webView = this.d;
            if (webView != null && webView != null && webView.canGoBack()) {
                WebView webView2 = this.d;
                if (webView2 != null) {
                    webView2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.l && (progressDialog = this.h) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        e eVar = this.k;
        if (eVar != null) {
            if ((eVar != null ? eVar.getStatus() : null) == AsyncTask.Status.PENDING) {
                e eVar2 = this.k;
                if (eVar2 != null) {
                    eVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.h;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        a();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        e eVar = this.k;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.h;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.l = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.l = false;
        Context context = getContext();
        dqc.b(context, "context");
        if (qi.d(context) && (layoutParams = this.m) != null) {
            IBinder iBinder = null;
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                WindowManager.LayoutParams layoutParams2 = this.m;
                if (layoutParams2 != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams2.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                StringBuilder sb = new StringBuilder("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams3 = this.m;
                if (layoutParams3 != null) {
                    iBinder = layoutParams3.token;
                }
                sb.append(iBinder);
                qi.a();
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        dqc.d(layoutParams, "params");
        if (layoutParams.token == null) {
            this.m = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.h = progressDialog;
        if (progressDialog != null) {
            progressDialog.requestWindowFeature(1);
        }
        ProgressDialog progressDialog2 = this.h;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.h;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.h;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new g());
        }
        requestWindowFeature(1);
        this.j = new FrameLayout(getContext());
        a();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new f());
        }
        Context context = getContext();
        dqc.b(context, "context");
        Drawable drawable = context.getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.i;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.a != null) {
            ImageView imageView4 = this.i;
            if (imageView4 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Drawable drawable2 = imageView4.getDrawable();
            dqc.b(drawable2, "checkNotNull(crossImageView).drawable");
            b((drawable2.getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.addView(this.i, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.j;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qk$g */
    /* loaded from: classes2.dex */
    static final class g implements DialogInterface.OnCancelListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            qk.this.cancel();
        }
    }

    public Bundle a(String str) {
        Uri parse = Uri.parse(str);
        dqc.b(parse, "u");
        Bundle d2 = qi.d(parse.getQuery());
        d2.putAll(qi.d(parse.getFragment()));
        return d2;
    }

    public final void a() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        int i3 = displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels;
        int min = Math.min(a(i2, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(a(i3, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    protected final void a(Throwable th) {
        FacebookException facebookException;
        if (this.c == null || this.e) {
            return;
        }
        this.e = true;
        if (th instanceof FacebookException) {
            facebookException = (FacebookException) th;
        } else {
            facebookException = new FacebookException(th);
        }
        d dVar = this.c;
        if (dVar != null) {
            dVar.a(null, facebookException);
        }
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c == null || this.e) {
            return;
        }
        a(new FacebookOperationCanceledException());
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qk$f */
    /* loaded from: classes2.dex */
    static final class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (qx.a(this)) {
                return;
            }
            try {
                qk.this.cancel();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i2) {
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        LinearLayout linearLayout = new LinearLayout(getContext());
        h hVar = new h(getContext());
        this.d = hVar;
        if (hVar != null) {
            hVar.setVerticalScrollBarEnabled(false);
        }
        WebView webView = this.d;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.d;
        if (webView2 != null) {
            webView2.setWebViewClient(new c());
        }
        WebView webView3 = this.d;
        if (webView3 != null && (settings3 = webView3.getSettings()) != null) {
            settings3.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.d;
        if (webView4 != null) {
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView4.loadUrl(str);
        }
        WebView webView5 = this.d;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.d;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.d;
        if (webView7 != null && (settings2 = webView7.getSettings()) != null) {
            settings2.setSavePassword(false);
        }
        WebView webView8 = this.d;
        if (webView8 != null && (settings = webView8.getSettings()) != null) {
            settings.setSaveFormData(false);
        }
        WebView webView9 = this.d;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.d;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.d;
        if (webView11 != null) {
            webView11.setOnTouchListener(i.a);
        }
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/facebook/internal/WebDialog$setUpWebView$1", "Landroid/webkit/WebView;", "onWindowFocusChanged", "", "hasWindowFocus", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qk$h */
    /* loaded from: classes2.dex */
    public static final class h extends WebView {
        h(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qk$i */
    /* loaded from: classes2.dex */
    public static final class i implements View.OnTouchListener {
        public static final i a = new i();

        i() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!view.hasFocus()) {
                view.requestFocus();
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/WebDialog$DialogWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/facebook/internal/WebDialog;)V", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "errorCode", "", "description", "failingUrl", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "error", "Landroid/net/http/SslError;", "shouldOverrideUrlLoading", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qk$c */
    /* loaded from: classes2.dex */
    public final class c extends WebViewClient {
        public c() {
        }

        /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
            java.lang.NullPointerException
            */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qk.c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            dqc.d(webView, "view");
            dqc.d(str, "description");
            dqc.d(str2, "failingUrl");
            super.onReceivedError(webView, i, str, str2);
            qk.this.a(new FacebookDialogException(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            dqc.d(webView, "view");
            dqc.d(sslErrorHandler, "handler");
            dqc.d(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            qk.this.a(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            dqc.d(webView, "view");
            dqc.d(str, "url");
            "Webview loading URL: ".concat(String.valueOf(str));
            qi.a();
            super.onPageStarted(webView, str, bitmap);
            if (qk.this.l || (progressDialog = qk.this.h) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            dqc.d(webView, "view");
            dqc.d(str, "url");
            super.onPageFinished(webView, str);
            if (!qk.this.l && (progressDialog = qk.this.h) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = qk.this.j;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webView2 = qk.this.d;
            if (webView2 != null) {
                webView2.setVisibility(0);
            }
            ImageView imageView = qk.this.i;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            qk.this.f = true;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/facebook/internal/WebDialog$Builder;", "", "context", "Landroid/content/Context;", "action", "", "parameters", "Landroid/os/Bundle;", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "applicationId", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "accessToken", "Lcom/facebook/AccessToken;", "<set-?>", "getApplicationId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", "listener", "getListener", "()Lcom/facebook/internal/WebDialog$OnCompleteListener;", "getParameters", "()Landroid/os/Bundle;", "", "theme", "getTheme", "()I", "build", "Lcom/facebook/internal/WebDialog;", "finishInit", "", "setOnCompleteListener", "setTheme", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qk$a */
    /* loaded from: classes2.dex */
    public static class a {
        protected Context a;
        protected String b;
        protected int c;
        public d d;
        protected Bundle e;
        private String f;
        private lk g;

        public a(Context context, String str, Bundle bundle) {
            dqc.d(context, "context");
            dqc.d(str, "action");
            lk.b bVar = lk.l;
            this.g = lk.b.a();
            lk.b bVar2 = lk.l;
            if (!lk.b.b()) {
                String a = qi.a(context);
                if (a != null) {
                    this.b = a;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            a(context, str, bundle);
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            dqc.d(context, "context");
            dqc.d(str2, "action");
            this.b = qj.a(str == null ? qi.a(context) : str, "applicationId");
            a(context, str2, bundle);
        }

        public qk a() {
            lk lkVar = this.g;
            if (lkVar != null) {
                Bundle bundle = this.e;
                String str = null;
                if (bundle != null) {
                    bundle.putString("app_id", lkVar != null ? lkVar.h : null);
                }
                Bundle bundle2 = this.e;
                if (bundle2 != null) {
                    lk lkVar2 = this.g;
                    if (lkVar2 != null) {
                        str = lkVar2.e;
                    }
                    bundle2.putString("access_token", str);
                }
            } else {
                Bundle bundle3 = this.e;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.b);
                }
            }
            b bVar = qk.g;
            Context context = this.a;
            if (context != null) {
                return b.a(context, this.f, this.e, this.c, this.d);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        private final void a(Context context, String str, Bundle bundle) {
            this.a = context;
            this.f = str;
            if (bundle != null) {
                this.e = bundle;
            } else {
                this.e = new Bundle();
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ+\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003\"\u00020\u0002H\u0014¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00112\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0010\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/WebDialog$UploadStagingResourcesTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "", "action", "parameters", "Landroid/os/Bundle;", "(Lcom/facebook/internal/WebDialog;Ljava/lang/String;Landroid/os/Bundle;)V", "exceptions", "Ljava/lang/Exception;", "Lkotlin/Exception;", "[Ljava/lang/Exception;", "doInBackground", "p0", "([Ljava/lang/Void;)[Ljava/lang/String;", "onPostExecute", "", "results", "([Ljava/lang/String;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qk$e */
    /* loaded from: classes2.dex */
    final class e extends AsyncTask<Void, Void, String[]> {
        final /* synthetic */ qk a;
        private Exception[] b = new Exception[0];
        private final String c;
        private final Bundle d;

        @Override // android.os.AsyncTask
        public final /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (qx.a(this)) {
                return null;
            }
            try {
                return a(voidArr);
            } catch (Throwable th) {
                qx.a(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(String[] strArr) {
            Exception[] excArr;
            if (qx.a(this)) {
                return;
            }
            try {
                String[] strArr2 = strArr;
                if (qx.a(this)) {
                    return;
                }
                ProgressDialog progressDialog = this.a.h;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                for (Exception exc : this.b) {
                    if (exc != null) {
                        this.a.a(exc);
                        return;
                    }
                }
                if (strArr2 == null) {
                    this.a.a(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List a2 = dmj.a(strArr2);
                if (a2.contains(null)) {
                    this.a.a(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                qi.a(this.d, "media", new JSONArray((Collection) a2));
                this.a.a = qi.a(qg.e(), ly.e() + "/dialog/" + this.c, this.d).toString();
                ImageView imageView = this.a.i;
                if (imageView != null) {
                    Drawable drawable = imageView.getDrawable();
                    dqc.b(drawable, "checkNotNull(crossImageView).drawable");
                    this.a.b((drawable.getIntrinsicWidth() / 2) + 1);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }

        public e(qk qkVar, String str, Bundle bundle) {
            dqc.d(str, "action");
            dqc.d(bundle, "parameters");
            this.a = qkVar;
            this.c = str;
            this.d = bundle;
        }

        private String[] a(Void... voidArr) {
            if (qx.a(this)) {
                return null;
            }
            try {
                dqc.d(voidArr, "p0");
                String[] stringArray = this.d.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                dqc.b(stringArray, "parameters.getStringArra…RAM_MEDIA) ?: return null");
                String[] strArr = new String[stringArray.length];
                this.b = new Exception[stringArray.length];
                CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                lk.b bVar = lk.l;
                lk a2 = lk.b.a();
                try {
                    int length = stringArray.length;
                    for (int i = 0; i < length; i++) {
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((ma) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri parse = Uri.parse(stringArray[i]);
                        if (qi.a(parse)) {
                            strArr[i] = parse.toString();
                            countDownLatch.countDown();
                        } else {
                            concurrentLinkedQueue.add(sl.a(a2, parse, new a(strArr, i, countDownLatch)).a());
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((ma) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                qx.a(th, this);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
        /* renamed from: qk$e$a */
        /* loaded from: classes2.dex */
        public static final class a implements lz.b {
            final /* synthetic */ String[] b;
            final /* synthetic */ int c;
            final /* synthetic */ CountDownLatch d;

            a(String[] strArr, int i, CountDownLatch countDownLatch) {
                this.b = strArr;
                this.c = i;
                this.d = countDownLatch;
            }

            @Override // defpackage.lz.b
            public final void a(mc mcVar) {
                lx lxVar;
                String str;
                dqc.d(mcVar, "response");
                try {
                    lxVar = mcVar.c;
                    str = "Error staging photo.";
                } catch (Exception e) {
                    e.this.b[this.c] = e;
                }
                if (lxVar != null) {
                    String a = lxVar.a();
                    if (a != null) {
                        str = a;
                    }
                    throw new FacebookGraphResponseException(mcVar, str);
                }
                JSONObject jSONObject = mcVar.b;
                if (jSONObject == null) {
                    throw new FacebookException(str);
                }
                String optString = jSONObject.optString("uri");
                if (optString == null) {
                    throw new FacebookException(str);
                }
                this.b[this.c] = optString;
                this.d.countDown();
            }
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0007J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0005J6\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J>\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/facebook/internal/WebDialog$Companion;", "", "()V", "API_EC_DIALOG_CANCEL", "", "BACKGROUND_GRAY", "DEFAULT_THEME", "DISABLE_SSL_CHECK_FOR_TESTING", "", "DISPLAY_TOUCH", "", "LOG_TAG", "MAX_PADDING_SCREEN_HEIGHT", "MAX_PADDING_SCREEN_WIDTH", "MIN_SCALE_FACTOR", "", "NO_PADDING_SCREEN_HEIGHT", "NO_PADDING_SCREEN_WIDTH", "PLATFORM_DIALOG_PATH_REGEX", "initCallback", "Lcom/facebook/internal/WebDialog$InitCallback;", "webDialogTheme", "getWebDialogTheme", "initDefaultTheme", "", "context", "Landroid/content/Context;", "newInstance", "Lcom/facebook/internal/WebDialog;", "action", "parameters", "Landroid/os/Bundle;", "theme", "listener", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", "targetApp", "Lcom/facebook/login/LoginTargetApp;", "setInitCallback", "callback", "setWebDialogTheme", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qk$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static void a(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) == null || qk.o != 0) {
                    return;
                }
                a(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public static qk a(Context context, String str, Bundle bundle, int i, d dVar) {
            dqc.d(context, "context");
            a(context);
            return new qk(context, str, bundle, i, rz.FACEBOOK, dVar, (byte) 0);
        }

        public static qk a(Context context, String str, Bundle bundle, int i, rz rzVar, d dVar) {
            dqc.d(context, "context");
            dqc.d(rzVar, "targetApp");
            a(context);
            return new qk(context, str, bundle, i, rzVar, dVar, (byte) 0);
        }

        private static void a(int i) {
            if (i == 0) {
                i = qk.n;
            }
            qk.o = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qk(Context context, String str) {
        this(context, str, o);
        dqc.d(context, "context");
        dqc.d(str, "url");
        qj.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private qk(android.content.Context r1, java.lang.String r2, int r3) {
        /*
            r0 = this;
            if (r3 != 0) goto L7
            defpackage.qj.a()
            int r3 = defpackage.qk.o
        L7:
            r0.<init>(r1, r3)
            java.lang.String r1 = "fbconnect://success"
            r0.b = r1
            r0.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk.<init>(android.content.Context, java.lang.String, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private qk(android.content.Context r4, java.lang.String r5, android.os.Bundle r6, int r7, defpackage.rz r8, defpackage.qk.d r9) {
        /*
            r3 = this;
            if (r7 != 0) goto L7
            defpackage.qj.a()
            int r7 = defpackage.qk.o
        L7:
            r3.<init>(r4, r7)
            java.lang.String r7 = "fbconnect://success"
            r3.b = r7
            if (r6 != 0) goto L15
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L15:
            boolean r4 = defpackage.qi.e(r4)
            if (r4 == 0) goto L1d
            java.lang.String r7 = "fbconnect://chrome_os_success"
        L1d:
            r3.b = r7
            java.lang.String r4 = "redirect_uri"
            r6.putString(r4, r7)
            java.lang.String r4 = "display"
            java.lang.String r7 = "touch"
            r6.putString(r4, r7)
            java.lang.String r4 = defpackage.ly.m()
            java.lang.String r7 = "client_id"
            r6.putString(r7, r4)
            dqi r4 = defpackage.dqi.a
            java.util.Locale r4 = java.util.Locale.ROOT
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r1 = 0
            java.lang.String r2 = defpackage.ly.l()
            r0[r1] = r2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            java.lang.String r1 = "android-%s"
            java.lang.String r4 = java.lang.String.format(r4, r1, r0)
            java.lang.String r0 = "java.lang.String.format(locale, format, *args)"
            defpackage.dqc.b(r4, r0)
            java.lang.String r0 = "sdk"
            r6.putString(r0, r4)
            r3.c = r9
            java.lang.String r4 = "share"
            boolean r4 = defpackage.dqc.a(r5, r4)
            if (r4 == 0) goto L70
            java.lang.String r4 = "media"
            boolean r4 = r6.containsKey(r4)
            if (r4 == 0) goto L70
            qk$e r4 = new qk$e
            r4.<init>(r3, r5, r6)
            r3.k = r4
            return
        L70:
            int[] r4 = defpackage.ql.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r4 = r4[r8]
            if (r4 == r7) goto L9b
            java.lang.String r4 = defpackage.qg.e()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = defpackage.ly.e()
            r7.append(r8)
            java.lang.String r8 = "/dialog/"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.net.Uri r4 = defpackage.qi.a(r4, r5, r6)
            goto La5
        L9b:
            java.lang.String r4 = defpackage.qg.f()
            java.lang.String r5 = "oauth/authorize"
            android.net.Uri r4 = defpackage.qi.a(r4, r5, r6)
        La5:
            java.lang.String r4 = r4.toString()
            r3.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk.<init>(android.content.Context, java.lang.String, android.os.Bundle, int, rz, qk$d):void");
    }
}
