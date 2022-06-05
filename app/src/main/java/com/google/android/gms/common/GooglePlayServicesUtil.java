package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class GooglePlayServicesUtil extends uz {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = uz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return uz.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return uz.getErrorString(i);
    }

    public static Context getRemoteContext(Context context) {
        return uz.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return uz.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return uz.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return uz.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        ux a = ux.a();
        if (uz.isPlayServicesPossiblyUpdating(context, i) || uz.isPlayStorePossiblyUpdating(context, i)) {
            a.b(context);
        } else {
            a.b(context, i);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (true == uz.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return ux.a().a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return uz.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (true == uz.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        ux a = ux.a();
        if (fragment == null) {
            return a.b(activity, i, i2, onCancelListener);
        }
        Dialog a2 = ux.a(activity, i, abr.a(fragment, ux.a().a(activity, i, "d"), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        ux.a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
