package com.ucare.we.firebasenotification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.ucare.we.R;
import defpackage.cpa;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class FCMJob extends FirebaseMessagingService {
    private static final Executor c = Executors.newCachedThreadPool();
    @Inject
    djw b;

    public static /* synthetic */ void lambda$3WWY5kwg9W3pm1QBB5DsjLG7IaA(FCMJob fCMJob, cpa cpaVar) {
        fCMJob.b(cpaVar);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void a(final cpa cpaVar) {
        super.a(cpaVar);
        this.b = new djw();
        try {
            c.execute(new Runnable() { // from class: com.ucare.we.firebasenotification.-$$Lambda$FCMJob$3WWY5kwg9W3pm1QBB5DsjLG7IaA
                @Override // java.lang.Runnable
                public final void run() {
                    FCMJob.lambda$3WWY5kwg9W3pm1QBB5DsjLG7IaA(FCMJob.this, cpaVar);
                }
            });
        } catch (IllegalStateException e) {
            new StringBuilder("onMessageReceived: ").append(e.getLocalizedMessage());
        }
    }

    public /* synthetic */ void b(cpa cpaVar) {
        String str;
        PendingIntent pendingIntent;
        if (cpaVar.b == null && cpb.b(cpaVar.a)) {
            cpaVar.b = new cpa.a(cpaVar.a, (byte) 0);
        }
        cpa.a aVar = cpaVar.b;
        if (aVar.a == null) {
            str = getApplicationContext().getString(R.string.app_name);
        } else {
            str = aVar.a;
        }
        String str2 = aVar.b;
        Context applicationContext = getApplicationContext();
        if (!this.b.i()) {
            if (Build.VERSION.SDK_INT >= 31) {
                pendingIntent = PendingIntent.getActivity(applicationContext, 0, new Intent(), 67108864);
            } else {
                pendingIntent = PendingIntent.getActivity(applicationContext, 0, new Intent(), 0);
            }
            Notification build = new NotificationCompat.Builder(applicationContext, "NOTIFICATION_ID").setContentIntent(pendingIntent).setContentTitle(str).setContentText(str2).setSmallIcon(R.drawable.we_icon).setDefaults(-1).setPriority(4).setGroup("com.ucare.we.01").setColor(applicationContext.getResources().getColor(R.color.colorPrimary)).setStyle(new NotificationCompat.BigTextStyle().bigText(str2)).setAutoCancel(true).build();
            NotificationManagerCompat from = NotificationManagerCompat.from(applicationContext);
            StringBuilder sb = new StringBuilder();
            sb.append(new Random().nextInt());
            from.notify(sb.toString(), 101010, build);
        }
    }
}
