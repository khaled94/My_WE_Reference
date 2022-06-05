package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: adt  reason: default package */
/* loaded from: classes.dex */
public final class adt {
    private static final Object b = new Object();
    private static volatile adt c;
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> a = new ConcurrentHashMap<>();

    private adt() {
    }

    public static adt a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new adt();
                }
            }
        }
        adt adtVar = c;
        aat.a(adtVar);
        return adtVar;
    }

    private static boolean a(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof adc);
    }

    public final void a(Context context, ServiceConnection serviceConnection) {
        if (a(serviceConnection) && this.a.containsKey(serviceConnection)) {
            try {
                try {
                    context.unbindService(this.a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                }
                return;
            } finally {
                this.a.remove(serviceConnection);
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((aep.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (a(serviceConnection)) {
            ServiceConnection putIfAbsent = this.a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
            }
            try {
                boolean a = a(context, intent, serviceConnection, i, (Executor) null);
                if (!a) {
                    return false;
                }
                return a;
            } finally {
                this.a.remove(serviceConnection, serviceConnection);
            }
        }
        return a(context, intent, serviceConnection, i, (Executor) null);
    }

    private static final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        aee.e();
        return context.bindService(intent, serviceConnection, i);
    }
}
