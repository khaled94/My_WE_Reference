package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: avz  reason: default package */
/* loaded from: classes.dex */
public final class avz {
    private static final Method b = a();
    private static final Method c = b();
    private final JobScheduler a;

    private static Method a() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
        return null;
    }

    private static Method b() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }

    private static int c() {
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return 0;
    }

    private avz(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }

    private final int a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.a, jobInfo, str, Integer.valueOf(i), str2)).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.a.schedule(jobInfo);
    }

    public static int a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new avz(jobScheduler).a(jobInfo, str, c(), str2);
    }
}
