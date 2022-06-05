package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Locale;

/* renamed from: abn  reason: default package */
/* loaded from: classes.dex */
public final class abn {
    private static final SimpleArrayMap<String, String> a = new SimpleArrayMap<>();
    private static Locale b;

    public static String a(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i == 2) {
                return resources.getString(R.string.common_google_play_services_update_button);
            }
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_button);
            }
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_install_button);
    }

    private static String a(Context context, String str) {
        synchronized (a) {
            Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(b)) {
                a.clear();
                b = locale;
            }
            String str2 = a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    "Missing resource: ".concat(str);
                } else {
                    new String("Missing resource: ");
                }
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                a.put(str, string);
                return string;
            }
            if (str.length() != 0) {
                "Got empty resource: ".concat(str);
            } else {
                new String("Got empty resource: ");
            }
            return null;
        }
    }

    private static String a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a2 = a(context, str);
        if (a2 == null) {
            a2 = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a2, str2);
    }

    private static String b(Context context) {
        String packageName = context.getPackageName();
        try {
            return aep.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String b2 = b(context);
        if (i != 1) {
            if (i == 2) {
                return aeb.c(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, b2);
            } else if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, b2);
            } else {
                if (i == 5) {
                    return a(context, "common_google_play_services_invalid_account_text", b2);
                }
                if (i == 7) {
                    return a(context, "common_google_play_services_network_error_text", b2);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, b2);
                }
                if (i == 20) {
                    return a(context, "common_google_play_services_restricted_profile_text", b2);
                }
                switch (i) {
                    case 16:
                        return a(context, "common_google_play_services_api_unavailable_text", b2);
                    case 17:
                        return a(context, "common_google_play_services_sign_in_failed_text", b2);
                    case 18:
                        return resources.getString(R.string.common_google_play_services_updating_text, b2);
                    default:
                        return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, b2);
                }
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, b2);
    }

    public static String d(Context context, int i) {
        String str;
        if (i == 6) {
            str = a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = e(context, i);
        }
        return str == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : str;
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return a(context, "common_google_play_services_invalid_account_title");
            case 7:
                return a(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
            case 17:
                return a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return a(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String c(Context context, int i) {
        if (i == 6 || i == 19) {
            return a(context, "common_google_play_services_resolution_required_text", b(context));
        }
        return b(context, i);
    }
}
