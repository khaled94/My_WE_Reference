package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: cpc  reason: default package */
/* loaded from: classes2.dex */
public final class cpc {
    private final Executor a;
    private final Context b;
    private final cpb c;
    private final Bundle d;

    public cpc(Context context, Bundle bundle, Executor executor) {
        this.a = executor;
        this.b = context;
        this.d = bundle;
        this.c = new cpb(context, context.getPackageName());
    }

    public final boolean a() {
        boolean z;
        Uri uri;
        Intent intent;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        if ("1".equals(cpb.a(this.d, "gcm.n.noui"))) {
            return true;
        }
        if (!((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!aee.b()) {
                SystemClock.sleep(10L);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        cpf a = cpf.a(cpb.a(this.d, "gcm.n.image"));
        if (a != null) {
            Executor executor = this.a;
            Callable callable = new Callable(a) { // from class: cpe
                private final cpf a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = a;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.a();
                }
            };
            aat.a(executor, "Executor must not be null");
            aat.a(callable, "Callback must not be null");
            bxj bxjVar = new bxj();
            executor.execute(new bxk(bxjVar, callable));
            a.a = bxjVar;
        }
        cpb cpbVar = this.c;
        Bundle bundle = this.d;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(cpbVar.b, cpbVar.c(cpb.a(bundle, "gcm.n.android_channel_id")));
        builder.setAutoCancel(true);
        builder.setContentTitle(cpbVar.a(bundle));
        String c = cpbVar.c(bundle, "gcm.n.body");
        if (!TextUtils.isEmpty(c)) {
            builder.setContentText(c);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(c));
        }
        builder.setSmallIcon(cpbVar.a(cpb.a(bundle, "gcm.n.icon")));
        String c2 = cpb.c(bundle);
        if (TextUtils.isEmpty(c2)) {
            uri = null;
        } else if (!"default".equals(c2) && cpbVar.b.getResources().getIdentifier(c2, "raw", cpbVar.c) != 0) {
            String str = cpbVar.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(c2).length());
            sb.append("android.resource://");
            sb.append(str);
            sb.append("/raw/");
            sb.append(c2);
            uri = Uri.parse(sb.toString());
        } else {
            uri = RingtoneManager.getDefaultUri(2);
        }
        if (uri != null) {
            builder.setSound(uri);
        }
        String a2 = cpb.a(bundle, "gcm.n.click_action");
        if (!TextUtils.isEmpty(a2)) {
            intent = new Intent(a2);
            intent.setPackage(cpbVar.c);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        } else {
            Uri d = cpb.d(bundle);
            if (d != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(cpbVar.c);
                intent.setData(d);
            } else {
                intent = cpbVar.b.getPackageManager().getLaunchIntentForPackage(cpbVar.c);
            }
        }
        if (intent == null) {
            pendingIntent = null;
        } else {
            intent.addFlags(67108864);
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2 != null && next2.startsWith("google.c.")) {
                    it2.remove();
                }
            }
            intent.putExtras(bundle2);
            for (String str2 : bundle2.keySet()) {
                if (str2.startsWith("gcm.n.") || str2.startsWith("gcm.notification.")) {
                    intent.removeExtra(str2);
                }
            }
            pendingIntent = PendingIntent.getActivity(cpbVar.b, cpb.a.incrementAndGet(), intent, BasicMeasure.EXACTLY);
            if (cpb.e(bundle)) {
                Intent intent2 = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                cpb.a(intent2, bundle);
                intent2.putExtra("pending_intent", pendingIntent);
                pendingIntent = cpbVar.a(cpb.a.incrementAndGet(), intent2);
            }
        }
        builder.setContentIntent(pendingIntent);
        if (!cpb.e(bundle)) {
            pendingIntent2 = null;
        } else {
            Intent intent3 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            cpb.a(intent3, bundle);
            pendingIntent2 = cpbVar.a(cpb.a.incrementAndGet(), intent3);
        }
        if (pendingIntent2 != null) {
            builder.setDeleteIntent(pendingIntent2);
        }
        Integer b = cpbVar.b(cpb.a(bundle, "gcm.n.color"));
        if (b != null) {
            builder.setColor(b.intValue());
        }
        String a3 = cpb.a(bundle, "gcm.n.tag");
        if (TextUtils.isEmpty(a3)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("FCM-Notification:");
            sb2.append(uptimeMillis);
            a3 = sb2.toString();
        }
        cpd cpdVar = new cpd(builder, a3);
        NotificationCompat.Builder builder2 = cpdVar.a;
        if (a != null) {
            try {
                Bitmap bitmap = (Bitmap) bwo.a((bwl) aat.a(a.a), 5L, TimeUnit.SECONDS);
                builder2.setLargeIcon(bitmap);
                builder2.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon(null));
            } catch (InterruptedException unused) {
                a.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException unused2) {
            } catch (TimeoutException unused3) {
                a.close();
            }
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(cpdVar.b, 0, cpdVar.a.build());
        return true;
    }
}
