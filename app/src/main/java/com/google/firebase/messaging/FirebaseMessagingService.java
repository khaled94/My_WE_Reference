package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends cny {
    private static final Queue<String> b = new ArrayDeque(10);

    public void a(cpa cpaVar) {
    }

    @Override // defpackage.cny
    public final Intent a(Intent intent) {
        return cnq.a().d.poll();
    }

    @Override // defpackage.cny
    public final boolean c(Intent intent) {
        cgz cgzVar;
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                }
            }
            if (!coz.a(intent)) {
                return true;
            }
            if (intent != null && "1".equals(intent.getStringExtra("google.c.a.tc")) && (cgzVar = (cgz) cgw.d().a(cgz.class)) != null) {
                String stringExtra = intent.getStringExtra("google.c.a.c_id");
                cgzVar.a("fcm", "_ln", stringExtra);
                Bundle bundle = new Bundle();
                bundle.putString("source", "Firebase");
                bundle.putString("medium", "notification");
                bundle.putString("campaign", stringExtra);
                cgzVar.a("fcm", "_cmp", bundle);
            }
            coz.a("_no", intent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
        if (r1.equals("gcm") != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    @Override // defpackage.cny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }
}
