package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\t\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener;", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "close", "", "finalize", "onReceive", "intent", "Landroid/content/Intent;", "open", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ph */
/* loaded from: classes2.dex */
public final class ph extends BroadcastReceiver {
    private static ph c;
    private final Context b;
    public static final a a = new a((byte) 0);
    private static final String d = "com.parse.bolts.measurement_event";

    private ph(Context context) {
        Context applicationContext = context.getApplicationContext();
        dqc.b(applicationContext, "context.applicationContext");
        this.b = applicationContext;
    }

    public /* synthetic */ ph(Context context, byte b) {
        this(context);
    }

    public static final /* synthetic */ ph a() {
        if (qx.a(ph.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            qx.a(th, ph.class);
            return null;
        }
    }

    public static final /* synthetic */ void a(ph phVar) {
        if (qx.a(ph.class)) {
            return;
        }
        try {
            c = phVar;
        } catch (Throwable th) {
            qx.a(th, ph.class);
        }
    }

    public static final /* synthetic */ void b(ph phVar) {
        if (qx.a(ph.class)) {
            return;
        }
        try {
            if (qx.a(phVar)) {
                return;
            }
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(phVar.b);
            dqc.b(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
            localBroadcastManager.registerReceiver(phVar, new IntentFilter(d));
        } catch (Throwable th) {
            qx.a(th, ph.class);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\u00048\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener$Companion;", "", "()V", "BOLTS_MEASUREMENT_EVENT_PREFIX", "", "MEASUREMENT_EVENT_ARGS_KEY", "MEASUREMENT_EVENT_NAME_KEY", "MEASUREMENT_EVENT_NOTIFICATION_NAME", "getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release$annotations", "getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release", "()Ljava/lang/String;", "singleton", "Lcom/facebook/internal/BoltsMeasurementEventListener;", "getInstance", "context", "Landroid/content/Context;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ph$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public final void finalize() throws Throwable {
        if (qx.a(this)) {
            return;
        }
        try {
            if (qx.a(this)) {
                return;
            }
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.b);
            dqc.b(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
            localBroadcastManager.unregisterReceiver(this);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (qx.a(this)) {
            return;
        }
        try {
            na naVar = new na(context);
            StringBuilder sb = new StringBuilder("bf_");
            Set<String> set = null;
            sb.append(intent != null ? intent.getStringExtra("event_name") : null);
            String sb2 = sb.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String str : set) {
                    dqc.b(str, "key");
                    dsf dsfVar = new dsf("[^0-9a-zA-Z _-]");
                    bundle.putString(new dsf("[ -]*$").a(new dsf("^[ -]*").a(dsfVar.a(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            naVar.a(sb2, bundle);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }
}
