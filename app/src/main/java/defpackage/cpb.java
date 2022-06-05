package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: cpb  reason: default package */
/* loaded from: classes2.dex */
public final class cpb {
    static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());
    final Context b;
    final String c;
    private Bundle d;

    public cpb(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence a(Bundle bundle) {
        String c = c(bundle, "gcm.n.title");
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        try {
            return b(0).loadLabel(this.b.getPackageManager());
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            return "";
        }
    }

    public static boolean b(Bundle bundle) {
        return "1".equals(a(bundle, "gcm.n.e")) || a(bundle, "gcm.n.icon") != null;
    }

    public static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object[] b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String a2 = a(bundle, "_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a2);
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return strArr;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(str);
            String substring = ("_loc_args".length() != 0 ? valueOf2.concat("_loc_args") : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a2).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(a2);
            sb.append("  Default value will be used.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c(Bundle bundle, String str) {
        String a2 = a(bundle, str);
        return !TextUtils.isEmpty(a2) ? a2 : e(bundle, str);
    }

    public static String d(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        return a(bundle, "_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    private final String e(Bundle bundle, String str) {
        String d = d(bundle, str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        Resources resources = this.b.getResources();
        int identifier = resources.getIdentifier(d, TypedValues.Custom.S_STRING, this.c);
        if (identifier == 0) {
            String valueOf = String.valueOf(str);
            String substring = ("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(str).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(str);
            sb.append(" Default value will be used.");
            return null;
        }
        Object[] b = b(bundle, str);
        if (b == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, b);
        } catch (MissingFormatArgumentException unused) {
            String arrays = Arrays.toString(b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            return null;
        }
    }

    private final boolean a(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.b.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.b.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.c);
            if (identifier != 0 && a(identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str, "mipmap", this.c);
            if (identifier2 != 0 && a(identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("Icon resource ");
            sb.append(str);
            sb.append(" not found. Notification will use default icon.");
        }
        int i = a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !a(i)) {
            try {
                i = b(0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
            }
        }
        if (i == 0 || !a(i)) {
            return 17301651;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer b(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Color ");
                sb.append(str);
                sb.append(" not valid. Notification will use default color.");
            }
        }
        int i = a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(ContextCompat.getColor(this.b, i));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        return null;
    }

    public static String c(Bundle bundle) {
        String a2 = a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a2) ? a(bundle, "gcm.n.sound") : a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri d(Bundle bundle) {
        String a2 = a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a2)) {
            a2 = a(bundle, "gcm.n.link");
        }
        if (!TextUtils.isEmpty(a2)) {
            return Uri.parse(a2);
        }
        return null;
    }

    private final synchronized Bundle a() {
        if (this.d != null) {
            return this.d;
        }
        try {
            ApplicationInfo b = b(128);
            if (b != null && b.metaData != null) {
                Bundle bundle = b.metaData;
                this.d = bundle;
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c(String str) {
        if (!aee.d()) {
            return null;
        }
        int i = 0;
        try {
            i = b(0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i < 26) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService(NotificationManager.class);
        if (!TextUtils.isEmpty(str)) {
            if (notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
            sb.append("Notification Channel requested (");
            sb.append(str);
            sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
        }
        String string = a().getString("com.google.firebase.messaging.default_notification_channel_id");
        if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
            return string;
        }
        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", this.b.getString(this.b.getResources().getIdentifier("fcm_fallback_notification_channel_label", TypedValues.Custom.S_STRING, this.c)), 3));
        }
        return "fcm_fallback_notification_channel";
    }

    private final ApplicationInfo b(int i) throws PackageManager.NameNotFoundException {
        return this.b.getPackageManager().getApplicationInfo(this.c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals(TypedValues.Transition.S_FROM)) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PendingIntent a(int i, Intent intent) {
        return PendingIntent.getBroadcast(this.b, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(this.b, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), BasicMeasure.EXACTLY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Bundle bundle) {
        return bundle != null && "1".equals(bundle.getString("google.c.a.e"));
    }
}
