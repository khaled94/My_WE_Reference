package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.os.EnvironmentCompat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/internal/AppEventUtility;", "", "()V", "PRICE_REGEX", "", "isMainThread", "", "()Z", "assertIsMainThread", "", "assertIsNotMainThread", "bytesToHex", "bytes", "", "getAppVersion", "getRootView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "isEmulator", "normalizePrice", "", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: of  reason: default package */
/* loaded from: classes2.dex */
public final class of {
    public static final of a = new of();

    public static final void a() {
    }

    public static final void b() {
    }

    private of() {
    }

    public static final double a(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(qi.e()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static final String a(byte[] bArr) {
        dqc.d(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            dqi dqiVar = dqi.a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        dqc.b(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final boolean c() {
        String str = Build.FINGERPRINT;
        dqc.b(str, "Build.FINGERPRINT");
        if (!dsg.c(str, "generic")) {
            String str2 = Build.FINGERPRINT;
            dqc.b(str2, "Build.FINGERPRINT");
            if (dsg.c(str2, EnvironmentCompat.MEDIA_UNKNOWN)) {
                return true;
            }
            String str3 = Build.MODEL;
            dqc.b(str3, "Build.MODEL");
            if (dsg.a((CharSequence) str3, (CharSequence) "google_sdk")) {
                return true;
            }
            String str4 = Build.MODEL;
            dqc.b(str4, "Build.MODEL");
            if (dsg.a((CharSequence) str4, (CharSequence) "Emulator")) {
                return true;
            }
            String str5 = Build.MODEL;
            dqc.b(str5, "Build.MODEL");
            if (dsg.a((CharSequence) str5, (CharSequence) "Android SDK built for x86")) {
                return true;
            }
            String str6 = Build.MANUFACTURER;
            dqc.b(str6, "Build.MANUFACTURER");
            if (dsg.a((CharSequence) str6, (CharSequence) "Genymotion")) {
                return true;
            }
            String str7 = Build.BRAND;
            dqc.b(str7, "Build.BRAND");
            if (dsg.c(str7, "generic")) {
                String str8 = Build.DEVICE;
                dqc.b(str8, "Build.DEVICE");
                if (dsg.c(str8, "generic")) {
                    return true;
                }
            }
            return dqc.a((Object) "google_sdk", (Object) Build.PRODUCT);
        }
        return true;
    }

    public static final String d() {
        Context k = ly.k();
        try {
            String str = k.getPackageManager().getPackageInfo(k.getPackageName(), 0).versionName;
            dqc.b(str, "packageInfo.versionName");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View a(Activity activity) {
        if (!qx.a(of.class) && activity != null) {
            try {
                Window window = activity.getWindow();
                if (window == null) {
                    return null;
                }
                View decorView = window.getDecorView();
                dqc.b(decorView, "window.decorView");
                return decorView.getRootView();
            } catch (Exception unused) {
                return null;
            } catch (Throwable th) {
                qx.a(th, of.class);
                return null;
            }
        }
        return null;
    }
}
