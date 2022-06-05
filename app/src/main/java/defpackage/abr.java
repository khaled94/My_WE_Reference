package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;

/* renamed from: abr  reason: default package */
/* loaded from: classes.dex */
public abstract class abr implements DialogInterface.OnClickListener {
    public static abr a(Activity activity, Intent intent, int i) {
        return new abo(intent, activity, i);
    }

    public static abr a(Fragment fragment, Intent intent, int i) {
        return new abp(intent, fragment, i);
    }

    public static abr a(vv vvVar, Intent intent) {
        return new abq(intent, vvVar);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }
}
