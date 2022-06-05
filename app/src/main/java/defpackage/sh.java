package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;

@Deprecated
/* renamed from: sh  reason: default package */
/* loaded from: classes2.dex */
final class sh {
    protected String a;
    private Fragment b;
    private String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sh(Fragment fragment) {
        this.b = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, Intent intent) {
        String stringExtra;
        boolean z = true;
        if (i != 1) {
            return;
        }
        if (intent != null && (stringExtra = intent.getStringExtra(CustomTabMainActivity.d)) != null && stringExtra.startsWith(pl.a(c()))) {
            Bundle d = qi.d(Uri.parse(stringExtra).getQuery());
            if (this.a != null) {
                z = this.a.equals(d.getString("state"));
                this.a = null;
            }
            if (z) {
                intent.putExtras(d);
            } else {
                i2 = 0;
                intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
            }
        }
        a(i2, intent);
    }

    private void a(int i, Intent intent) {
        FragmentActivity activity;
        if (!this.b.isAdded() || (activity = this.b.getActivity()) == null) {
            return;
        }
        activity.setResult(i, intent);
        activity.finish();
    }

    private String b() {
        if (this.c == null) {
            this.c = pl.a();
        }
        return this.c;
    }

    private static String c() {
        return "fb" + ly.m() + "://authorize";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            androidx.fragment.app.Fragment r0 = r7.b
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L7f
            androidx.fragment.app.Fragment r0 = r7.b
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            java.lang.String r3 = "android.permission.INTERNET"
            int r0 = r0.checkCallingOrSelfPermission(r3)
            if (r0 != 0) goto L7f
            java.lang.String r0 = r7.b()
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L24
            goto L7f
        L24:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r3 = defpackage.qi.c()
            r7.a = r3
            java.lang.String r3 = c()
            java.lang.String r3 = defpackage.pl.a(r3)
            java.lang.String r4 = "redirect_uri"
            r0.putString(r4, r3)
            java.lang.String r3 = defpackage.ly.m()
            java.lang.String r4 = "app_id"
            r0.putString(r4, r3)
            java.lang.String r3 = r7.a
            java.lang.String r4 = "state"
            r0.putString(r4, r3)
            boolean r3 = defpackage.ly.a
            java.lang.String r4 = "share_referral"
            if (r3 == 0) goto L59
            android.net.Uri r3 = defpackage.pk.a(r4, r0)
            defpackage.ri.a(r3)
        L59:
            android.content.Intent r3 = new android.content.Intent
            androidx.fragment.app.Fragment r5 = r7.b
            androidx.fragment.app.FragmentActivity r5 = r5.getActivity()
            java.lang.Class<com.facebook.CustomTabMainActivity> r6 = com.facebook.CustomTabMainActivity.class
            r3.<init>(r5, r6)
            java.lang.String r5 = com.facebook.CustomTabMainActivity.a
            r3.putExtra(r5, r4)
            java.lang.String r4 = com.facebook.CustomTabMainActivity.b
            r3.putExtra(r4, r0)
            java.lang.String r0 = com.facebook.CustomTabMainActivity.c
            java.lang.String r4 = r7.b()
            r3.putExtra(r0, r4)
            androidx.fragment.app.Fragment r0 = r7.b
            r0.startActivityForResult(r3, r1)
            goto L80
        L7f:
            r1 = 0
        L80:
            if (r1 != 0) goto L91
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "error_message"
            java.lang.String r3 = "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed"
            r0.putExtra(r1, r3)
            r7.a(r2, r0)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh.a():void");
    }
}
