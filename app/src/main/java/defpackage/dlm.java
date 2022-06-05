package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: dlm  reason: default package */
/* loaded from: classes2.dex */
public final class dlm extends ThreadPoolExecutor {
    private static final int a;
    private boolean b;
    private ReentrantLock c;
    private Condition d;

    public static dlm a() {
        int i = a;
        return new dlm(i, i);
    }

    private static int a(String str, String str2) {
        final Pattern compile = Pattern.compile(str2);
        try {
            File[] listFiles = new File(str).listFiles(new FileFilter() { // from class: dlm.1
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return compile.matcher(file.getName()).matches();
                }
            });
            if (listFiles != null) {
                return listFiles.length;
            }
            return 0;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    private dlm(int i, int i2) {
        super(i, i2, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = reentrantLock.newCondition();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.c.lock();
        while (this.b) {
            try {
                try {
                    this.d.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } finally {
                this.c.unlock();
            }
        }
    }

    static {
        int a2 = a("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (a2 <= 0) {
            a2 = Runtime.getRuntime().availableProcessors();
        }
        int i = 1;
        if (a2 > 0) {
            i = 1 + (a2 * 2);
        }
        a = i;
    }
}
