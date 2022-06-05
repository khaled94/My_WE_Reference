package defpackage;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: amy  reason: default package */
/* loaded from: classes.dex */
public final class amy {
    public static <T> T a(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
