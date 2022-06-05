package com.google.firebase.auth.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class FederatedSignInActivity extends FragmentActivity {
    private static long a;
    private static final cjt c = cjt.a();
    private static Handler d;
    private static Runnable e;
    private boolean b = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.LINK".equals(action) && !"com.google.firebase.auth.internal.REAUTHENTICATE".equals(action)) {
            String valueOf = String.valueOf(action);
            if (valueOf.length() != 0) {
                "Could not do operation - unknown action: ".concat(valueOf);
            } else {
                new String("Could not do operation - unknown action: ");
            }
            b();
            return;
        }
        long a2 = aea.d().a();
        if (a2 - a < 30000) {
            return;
        }
        a = a2;
        if (bundle == null) {
            return;
        }
        this.b = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r9 = this;
            super.onResume()
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r2 = "com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED"
            boolean r1 = r2.equals(r1)
            r2 = 0
            r3 = 1
            java.lang.String r4 = "com.google.firebase.auth.internal.OPERATION"
            if (r1 == 0) goto L2a
            boolean r1 = defpackage.ckf.a(r0)
            if (r1 == 0) goto L25
            com.google.android.gms.common.api.Status r0 = defpackage.ckf.b(r0)
            r9.a(r0)
            goto L28
        L25:
            r9.b()
        L28:
            r2 = 1
            goto L95
        L2a:
            boolean r1 = r0.hasExtra(r4)
            if (r1 == 0) goto L95
            java.lang.String r1 = "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"
            boolean r5 = r0.hasExtra(r1)
            if (r5 == 0) goto L95
            java.lang.String r5 = r0.getStringExtra(r4)
            java.lang.String r6 = "com.google.firebase.auth.internal.SIGN_IN"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L54
            java.lang.String r6 = "com.google.firebase.auth.internal.LINK"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L54
            java.lang.String r6 = "com.google.firebase.auth.internal.REAUTHENTICATE"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L95
        L54:
            android.os.Parcelable$Creator<alr> r6 = defpackage.alr.CREATOR
            abd r6 = defpackage.abe.a(r0, r1, r6)
            alr r6 = (defpackage.alr) r6
            java.lang.String r7 = "com.google.firebase.auth.internal.EXTRA_TENANT_ID"
            java.lang.String r0 = r0.getStringExtra(r7)
            r6.b = r0
            r7 = 0
            com.google.firebase.auth.internal.FederatedSignInActivity.a = r7
            r9.b = r2
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            defpackage.abe.a(r6, r2, r1)
            r2.putExtra(r4, r5)
            java.lang.String r1 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            r2.setAction(r1)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r9)
            boolean r1 = r1.sendBroadcast(r2)
            if (r1 != 0) goto L8c
            android.content.Context r1 = r9.getApplicationContext()
            defpackage.cjz.a(r1, r6, r5, r0)
            goto L91
        L8c:
            cjt r0 = com.google.firebase.auth.internal.FederatedSignInActivity.c
            r0.a(r9)
        L91:
            r9.finish()
            goto L28
        L95:
            if (r2 == 0) goto L98
            return
        L98:
            boolean r0 = r9.b
            if (r0 != 0) goto Ld4
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN"
            r0.<init>(r1)
            java.lang.String r1 = "com.google.android.gms"
            r0.setPackage(r1)
            android.content.Intent r1 = r9.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r0.putExtras(r1)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r1 = r1.getAction()
            r0.putExtra(r4, r1)
            r1 = 40963(0xa003, float:5.7401E-41)
            r9.startActivityForResult(r0, r1)     // Catch: android.content.ActivityNotFoundException -> Lc5
            goto Ld1
        Lc5:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17499(0x445b, float:2.4521E-41)
            java.lang.String r2 = "Could not launch web sign-in Intent. Google Play service is unavailable"
            r0.<init>(r1, r2)
            r9.a(r0)
        Ld1:
            r9.b = r3
            return
        Ld4:
            cjs r0 = new cjs
            r0.<init>(r9)
            com.google.firebase.auth.internal.FederatedSignInActivity.e = r0
            android.os.Handler r0 = com.google.firebase.auth.internal.FederatedSignInActivity.d
            if (r0 != 0) goto Le6
            aly r0 = new aly
            r0.<init>()
            com.google.firebase.auth.internal.FederatedSignInActivity.d = r0
        Le6:
            android.os.Handler r0 = com.google.firebase.auth.internal.FederatedSignInActivity.d
            java.lang.Runnable r1 = com.google.firebase.auth.internal.FederatedSignInActivity.e
            r2 = 800(0x320, double:3.953E-321)
            r0.postDelayed(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.FederatedSignInActivity.onResume():void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Runnable runnable;
        super.onNewIntent(intent);
        Handler handler = d;
        if (handler != null && (runnable = e) != null) {
            handler.removeCallbacks(runnable);
            e = null;
        }
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        a = 0L;
        this.b = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            cjz.a(this, ckx.a("WEB_CONTEXT_CANCELED"));
        } else {
            c.a(this);
        }
        finish();
    }

    private final void a(Status status) {
        a = 0L;
        this.b = false;
        Intent intent = new Intent();
        ckf.a(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            cjz.a(getApplicationContext(), status);
        } else {
            c.a(this);
        }
        finish();
    }
}
