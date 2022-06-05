package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: ax  reason: default package */
/* loaded from: classes.dex */
public class ax {
    public static String a = "Volley";
    public static boolean b = Log.isLoggable("Volley", 2);

    public static void a(String str, Object... objArr) {
        if (b) {
            f(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        f(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        f(str, objArr);
    }

    public static void d(String str, Object... objArr) {
        f(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        Log.wtf(a, f(str, objArr));
    }

    private static String f(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClass().equals(ax.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ax$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final boolean a = ax.b;
        private final List<C0016a> b = new ArrayList();
        private boolean c = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ax$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0016a {
            public final String a;
            public final long b;
            public final long c;

            public C0016a(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }
        }

        public final synchronized void a(String str, long j) {
            if (this.c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.b.add(new C0016a(str, j, SystemClock.elapsedRealtime()));
        }

        public final synchronized void a(String str) {
            this.c = true;
            long j = this.b.size() == 0 ? 0L : this.b.get(this.b.size() - 1).c - this.b.get(0).c;
            if (j <= 0) {
                return;
            }
            long j2 = this.b.get(0).c;
            ax.b("(%-4d ms) %s", Long.valueOf(j), str);
            for (C0016a c0016a : this.b) {
                long j3 = c0016a.c;
                ax.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(c0016a.b), c0016a.a);
                j2 = j3;
            }
        }

        protected final void finalize() throws Throwable {
            if (!this.c) {
                a("Request on the loose");
                ax.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }
}
