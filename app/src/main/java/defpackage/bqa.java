package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: bqa  reason: default package */
/* loaded from: classes2.dex */
public final class bqa {
    private final bqc a;

    public bqa(bqc bqcVar) {
        aat.a(bqcVar);
        this.a = bqcVar;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        aat.a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void a(Context context, Intent intent) {
        bql a = bql.a(context, (baz) null);
        bpi q = a.q();
        if (intent == null) {
            q.f.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        q.k.a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            q.k.a("Starting wakeful intent.");
            this.a.a(context, className);
        } else if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
        } else {
            try {
                a.p().a(new bpz(a, q));
            } catch (Exception e) {
                q.f.a("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult a2 = this.a.a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                q.k.a("Install referrer extras are null");
                if (a2 == null) {
                    return;
                }
                a2.finish();
                return;
            }
            q.i.a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            Bundle a3 = a.e().a(Uri.parse(stringExtra));
            if (a3 == null) {
                q.k.a("No campaign defined in install referrer broadcast");
                if (a2 == null) {
                    return;
                }
                a2.finish();
                return;
            }
            long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0L);
            if (longExtra == 0) {
                q.f.a("Install referrer is missing timestamp");
            }
            a.p().a(new bqd(a, longExtra, a3, context, q, a2));
        }
    }
}
