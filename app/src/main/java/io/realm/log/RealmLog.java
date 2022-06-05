package io.realm.log;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class RealmLog {
    private static String a = "REALM_JAVA";

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i, String str, Throwable th, String str2);

    public static void b(String str, Object... objArr) {
        a(null, str, objArr);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        a(6, th, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        a(5, null, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        a(7, null, str, objArr);
    }

    private static void a(int i, Throwable th, String str, Object... objArr) {
        if (i < nativeGetLogLevel()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null && objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (th != null) {
            sb.append(Log.getStackTraceString(th));
        }
        if (str != null) {
            if (th != null) {
                sb.append("\n");
            }
            sb.append(str);
        }
        nativeLog(i, a, th, sb.toString());
    }
}
