package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cmz  reason: default package */
/* loaded from: classes2.dex */
public final class cmz {
    private static cmz c;
    final Context a;
    final ScheduledExecutorService b;
    private cna d = new cna(this, (byte) 0);
    private int e = 1;

    public static synchronized cmz a(Context context) {
        cmz cmzVar;
        synchronized (cmz.class) {
            if (c == null) {
                ame a = amd.a();
                aei aeiVar = new aei("MessengerIpcClient");
                int i = amh.a;
                c = new cmz(context, a.b(aeiVar));
            }
            cmzVar = c;
        }
        return cmzVar;
    }

    private cmz(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public final synchronized <T> bwl<T> a(cnh<T> cnhVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(cnhVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
        }
        if (!this.d.a(cnhVar)) {
            cna cnaVar = new cna(this, (byte) 0);
            this.d = cnaVar;
            cnaVar.a(cnhVar);
        }
        return cnhVar.b.a;
    }

    public final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }
}
