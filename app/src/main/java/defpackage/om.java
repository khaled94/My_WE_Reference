package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.mu;
import defpackage.mv;
import defpackage.na;
import defpackage.qc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0002J$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/internal/SessionLogger;", "", "()V", "INACTIVE_SECONDS_QUANTA", "", "PACKAGE_CHECKSUM", "", "TAG", "computePackageChecksum", "context", "Landroid/content/Context;", "getQuantaIndex", "", "timeBetweenSessions", "", "logActivateApp", "", "activityName", "sourceApplicationInfo", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "appId", "logClockSkewEvent", "logDeactivateApp", "sessionInfo", "Lcom/facebook/appevents/internal/SessionInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: om  reason: default package */
/* loaded from: classes2.dex */
public final class om {
    public static final om a = new om();
    private static final String b = om.class.getCanonicalName();
    private static final long[] c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private om() {
    }

    public static final void a(String str, String str2, Context context) {
        if (qx.a(om.class)) {
            return;
        }
        try {
            dqc.d(str, "activityName");
            dqc.d(context, "context");
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", rf.a(context));
            na naVar = new na(str, str2);
            naVar.a("fb_mobile_activate_app", bundle);
            na.a aVar = na.b;
            mv.a aVar2 = mv.b;
            if (mv.a.a() == mu.b.b) {
                return;
            }
            naVar.a.a();
        } catch (Throwable th) {
            qx.a(th, om.class);
        }
    }

    private final void a() {
        if (qx.a(this)) {
            return;
        }
        try {
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            String str = b;
            dqc.a((Object) str);
            aVar.a(mfVar, str, "Clock skew detected");
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private static int a(long j) {
        if (qx.a(om.class)) {
            return 0;
        }
        int i = 0;
        while (i < c.length && c[i] < j) {
            try {
                i++;
            } catch (Throwable th) {
                qx.a(th, om.class);
                return 0;
            }
        }
        return i;
    }

    private String a(Context context) {
        if (qx.a(this)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                String concat = "PCKGCHKSUM;".concat(String.valueOf(packageManager.getPackageInfo(context.getPackageName(), 0).versionName));
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                String string = sharedPreferences.getString(concat, null);
                if (string != null && string.length() == 32) {
                    return string;
                }
                String a2 = ok.a(context);
                if (a2 == null) {
                    a2 = ok.a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                }
                sharedPreferences.edit().putString(concat, a2).apply();
                return a2;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:5:0x000d, B:8:0x0015, B:10:0x001b, B:12:0x0021, B:14:0x0027, B:15:0x002c, B:17:0x0030, B:19:0x0036, B:22:0x003c, B:23:0x0042, B:25:0x0046, B:28:0x004b, B:30:0x004f, B:31:0x005d, B:32:0x006a, B:36:0x0070, B:37:0x0076, B:39:0x00ac, B:42:0x00b4, B:44:0x00bf, B:45:0x00c3), top: B:50:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:5:0x000d, B:8:0x0015, B:10:0x001b, B:12:0x0021, B:14:0x0027, B:15:0x002c, B:17:0x0030, B:19:0x0036, B:22:0x003c, B:23:0x0042, B:25:0x0046, B:28:0x004b, B:30:0x004f, B:31:0x005d, B:32:0x006a, B:36:0x0070, B:37:0x0076, B:39:0x00ac, B:42:0x00b4, B:44:0x00bf, B:45:0x00c3), top: B:50:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r16, defpackage.ol r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om.a(java.lang.String, ol, java.lang.String):void");
    }
}
