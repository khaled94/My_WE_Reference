package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;

/* renamed from: bm  reason: default package */
/* loaded from: classes2.dex */
public final class bm {
    public static at a(Context context, az azVar) {
        ba baVar;
        ba baVar2;
        String str;
        if (azVar == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                baVar = new ba((az) new bh());
                at atVar = new at(new bc(new File(context.getCacheDir(), "volley"), (byte) 0), baVar, (byte) 0);
                atVar.a();
                return atVar;
            }
            try {
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                str = packageName + "/" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "volley/0";
            }
            baVar2 = new ba(new bd(AndroidHttpClient.newInstance(str)));
        } else {
            baVar2 = new ba(azVar);
        }
        baVar = baVar2;
        at atVar2 = new at(new bc(new File(context.getCacheDir(), "volley"), (byte) 0), baVar, (byte) 0);
        atVar2.a();
        return atVar2;
    }
}
