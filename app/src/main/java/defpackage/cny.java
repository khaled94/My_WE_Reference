package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;

/* renamed from: cny  reason: default package */
/* loaded from: classes2.dex */
public abstract class cny extends Service {
    final ExecutorService a;
    private Binder b;
    private final Object c;
    private int d;
    private int e;

    public cny() {
        ame a = amd.a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        aei aeiVar = new aei(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-"));
        int i = amh.a;
        this.a = a.a(aeiVar);
        this.c = new Object();
        this.e = 0;
    }

    protected Intent a(Intent intent) {
        return intent;
    }

    public abstract void b(Intent intent);

    public boolean c(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.b == null) {
            this.b = new coc(this);
        }
        return this.b;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent a = a(intent);
        if (a == null) {
            d(intent);
            return 2;
        } else if (c(a)) {
            d(intent);
            return 2;
        } else {
            this.a.execute(new cnw(this, a, intent));
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.c) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                stopSelfResult(this.d);
            }
        }
    }
}
