package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.common.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J7\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "()V", "<set-?>", "Landroidx/fragment/app/Fragment;", "currentFragment", "getCurrentFragment", "()Landroidx/fragment/app/Fragment;", "dump", "", "prefix", "", "fd", "Ljava/io/FileDescriptor;", "writer", "Ljava/io/PrintWriter;", "args", "", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "getFragment", "handlePassThroughError", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookActivity extends FragmentActivity {
    public static final a b = new a((byte) 0);
    private static final String c;
    public Fragment a;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ru ruVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!ly.i()) {
            qi.a();
            Context applicationContext = getApplicationContext();
            dqc.b(applicationContext, "applicationContext");
            ly.a(applicationContext);
        }
        setContentView(R.layout.com_facebook_activity_layout);
        dqc.b(intent, "intent");
        if (dqc.a((Object) "PassThrough", (Object) intent.getAction())) {
            Intent intent2 = getIntent();
            dqc.b(intent2, "requestIntent");
            FacebookException a2 = qd.a(qd.a(intent2));
            Intent intent3 = getIntent();
            dqc.b(intent3, "intent");
            setResult(0, qd.a(intent3, (Bundle) null, a2));
            finish();
            return;
        }
        Intent intent4 = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        dqc.b(supportFragmentManager, "supportFragmentManager");
        sj findFragmentByTag = supportFragmentManager.findFragmentByTag("SingleFragment");
        if (findFragmentByTag == null) {
            dqc.b(intent4, "intent");
            if (dqc.a((Object) "FacebookDialogFragment", (Object) intent4.getAction())) {
                pm pmVar = new pm();
                pmVar.setRetainInstance(true);
                pmVar.show(supportFragmentManager, "SingleFragment");
                findFragmentByTag = pmVar;
            } else if (dqc.a((Object) "DeviceShareDialogFragment", (Object) intent4.getAction())) {
                sj sjVar = new sj();
                sjVar.setRetainInstance(true);
                Parcelable parcelableExtra = intent4.getParcelableExtra("content");
                if (parcelableExtra != null) {
                    sjVar.a((sn) parcelableExtra);
                    sjVar.show(supportFragmentManager, "SingleFragment");
                    findFragmentByTag = sjVar;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.share.model.ShareContent<*, *>");
                }
            } else {
                if (dqc.a((Object) "ReferralFragment", (Object) intent4.getAction())) {
                    ruVar = new si();
                    ruVar.setRetainInstance(true);
                    supportFragmentManager.beginTransaction().add(R.id.com_facebook_fragment_container, ruVar, "SingleFragment").commit();
                } else {
                    ruVar = new ru();
                    ruVar.setRetainInstance(true);
                    supportFragmentManager.beginTransaction().add(R.id.com_facebook_fragment_container, ruVar, "SingleFragment").commit();
                }
                findFragmentByTag = ruVar;
            }
        }
        this.a = findFragmentByTag;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        dqc.d(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.a;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:5:0x000b, B:7:0x001d, B:11:0x0023, B:13:0x0026, B:15:0x0030, B:17:0x0036, B:18:0x003e, B:20:0x0044, B:24:0x004c), top: B:29:0x000b }] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            r4 = this;
            java.lang.String r0 = "writer"
            java.lang.String r1 = "prefix"
            boolean r2 = defpackage.qx.a(r4)
            if (r2 == 0) goto Lb
            return
        Lb:
            defpackage.dqc.d(r5, r1)     // Catch: java.lang.Throwable -> L50
            defpackage.dqc.d(r7, r0)     // Catch: java.lang.Throwable -> L50
            rc$c r2 = defpackage.rc.a     // Catch: java.lang.Throwable -> L50
            defpackage.dqc.d(r5, r1)     // Catch: java.lang.Throwable -> L50
            defpackage.dqc.d(r7, r0)     // Catch: java.lang.Throwable -> L50
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L48
            int r2 = r8.length     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            r2 = r2 ^ r0
            if (r2 == 0) goto L48
            java.lang.String r2 = "e2e"
            r3 = r8[r1]     // Catch: java.lang.Throwable -> L50
            boolean r2 = defpackage.dqc.a(r2, r3)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L48
            rc r1 = defpackage.rc.a()     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L3e
            rc r1 = new rc     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            defpackage.rc.a(r1)     // Catch: java.lang.Throwable -> L50
        L3e:
            rc r1 = defpackage.rc.a()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L49
            defpackage.rc.a(r1, r5, r7, r8)     // Catch: java.lang.Throwable -> L50
            goto L49
        L48:
            r0 = 0
        L49:
            if (r0 == 0) goto L4c
            return
        L4c:
            super.dump(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r5 = move-exception
            defpackage.qx.a(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookActivity.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/FacebookActivity$Companion;", "", "()V", "FRAGMENT_TAG", "", "PASS_THROUGH_CANCEL_ACTION", "TAG", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        String name = FacebookActivity.class.getName();
        dqc.b(name, "FacebookActivity::class.java.name");
        c = name;
    }
}
