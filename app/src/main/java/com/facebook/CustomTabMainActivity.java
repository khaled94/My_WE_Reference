package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import defpackage.rz;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0014J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "()V", "redirectReceiver", "Landroid/content/BroadcastReceiver;", "shouldCloseCustomTab", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onResume", "sendResult", "resultCode", "", "resultIntent", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {
    private boolean i = true;
    private BroadcastReceiver j;
    public static final a h = new a((byte) 0);
    public static final String a = CustomTabMainActivity.class.getSimpleName() + ".extra_action";
    public static final String b = CustomTabMainActivity.class.getSimpleName() + ".extra_params";
    public static final String c = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";
    public static final String d = CustomTabMainActivity.class.getSimpleName() + ".extra_url";
    public static final String e = CustomTabMainActivity.class.getSimpleName() + ".extra_targetApp";
    public static final String f = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";
    public static final String g = CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception";

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        String stringExtra;
        py pyVar;
        super.onCreate(bundle);
        String str = CustomTabActivity.a;
        Intent intent = getIntent();
        dqc.b(intent, "intent");
        if (dqc.a((Object) str, (Object) intent.getAction())) {
            setResult(0);
            finish();
        } else if (bundle != null || (stringExtra = getIntent().getStringExtra(a)) == null) {
        } else {
            Bundle bundleExtra = getIntent().getBundleExtra(b);
            String stringExtra2 = getIntent().getStringExtra(c);
            rz.a aVar = rz.Companion;
            if (lv.$EnumSwitchMapping$0[rz.a.a(getIntent().getStringExtra(e)).ordinal()] == 1) {
                pyVar = new py(stringExtra, bundleExtra);
            } else {
                pyVar = new pk(stringExtra, bundleExtra);
            }
            boolean a2 = pyVar.a(this, stringExtra2);
            this.i = false;
            if (!a2) {
                setResult(0, getIntent().putExtra(g, true));
                finish();
                return;
            }
            b bVar = new b();
            this.j = bVar;
            LocalBroadcastManager.getInstance(this).registerReceiver(bVar, new IntentFilter(CustomTabActivity.a));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/facebook/CustomTabMainActivity$onCreate$redirectReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            dqc.d(context, "context");
            dqc.d(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f);
            intent2.putExtra(CustomTabMainActivity.d, intent.getStringExtra(CustomTabMainActivity.d));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        dqc.d(intent, "intent");
        super.onNewIntent(intent);
        if (dqc.a((Object) f, (Object) intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CustomTabActivity.b));
            a(-1, intent);
        } else if (!dqc.a((Object) CustomTabActivity.a, (Object) intent.getAction())) {
        } else {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.i) {
            a(0, null);
        }
        this.i = true;
    }

    private final void a(int i, Intent intent) {
        Bundle bundle;
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(d);
            if (stringExtra == null) {
                bundle = new Bundle();
            } else {
                bundle = a.a(stringExtra);
            }
            Intent intent2 = getIntent();
            dqc.b(intent2, "intent");
            Intent a2 = qd.a(intent2, bundle, (FacebookException) null);
            if (a2 != null) {
                intent = a2;
            }
            setResult(i, intent);
        } else {
            Intent intent3 = getIntent();
            dqc.b(intent3, "intent");
            setResult(i, qd.a(intent3, (Bundle) null, (FacebookException) null));
        }
        finish();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/CustomTabMainActivity$Companion;", "", "()V", "EXTRA_ACTION", "", "EXTRA_CHROME_PACKAGE", "EXTRA_PARAMS", "EXTRA_TARGET_APP", "EXTRA_URL", "NO_ACTIVITY_EXCEPTION", "REFRESH_ACTION", "parseResponseUri", "Landroid/os/Bundle;", "urlString", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        static Bundle a(String str) {
            Uri parse = Uri.parse(str);
            dqc.b(parse, "uri");
            Bundle d = qi.d(parse.getQuery());
            d.putAll(qi.d(parse.getFragment()));
            return d;
        }
    }
}
