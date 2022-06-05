package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.legacy.content.WakefulBroadcastReceiver;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    private static boolean a = false;
    private static coe b;
    private static coe c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent2 != null) {
            a(context, intent2, intent.getAction());
        } else {
            a(context, intent, intent.getAction());
        }
    }

    private final void a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra(TypedValues.Transition.S_FROM)) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        }
        int i = -1;
        if (str2 != null) {
            i = a(this, context, str2, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    private static int a(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = true;
        boolean z2 = aee.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & SQLiteDatabase.CREATE_IF_NECESSARY) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return b(broadcastReceiver, context, str, intent);
        }
        int b2 = cnq.a().b(context, str, intent);
        if (!aee.d() || b2 != 402) {
            return b2;
        }
        b(broadcastReceiver, context, str, intent);
        return TypedValues.Cycle.TYPE_ALPHA;
    }

    private static int b(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Binding to service: ".concat(valueOf);
            } else {
                new String("Binding to service: ");
            }
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        a(context, str).a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    private static synchronized coe a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (c == null) {
                    c = new coe(context, str);
                }
                return c;
            }
            if (b == null) {
                b = new coe(context, str);
            }
            return b;
        }
    }
}
