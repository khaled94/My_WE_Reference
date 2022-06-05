package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceIdService extends cny {
    @Override // defpackage.cny
    public final Intent a(Intent intent) {
        return cnq.a().c.poll();
    }

    @Override // defpackage.cny
    public final void b(Intent intent) {
        String stringExtra;
        if (!"com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("CMD")) != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.a().h();
            } else if (!"SYNC".equals(stringExtra)) {
            } else {
                FirebaseInstanceId a = FirebaseInstanceId.a();
                FirebaseInstanceId.a.c("");
                a.c();
            }
        }
    }
}
