package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: ux  reason: default package */
/* loaded from: classes2.dex */
public final class ux extends uy {
    private String e;
    private static final Object c = new Object();
    private static final ux d = new ux();
    public static final int a = uy.b;

    public static Dialog a(Context context, int i, abr abrVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(abn.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a2 = abn.a(context, i);
        if (a2 != null) {
            builder.setPositiveButton(a2, abrVar);
        }
        String e = abn.e(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i));
        new IllegalArgumentException();
        return builder.create();
    }

    public static ux a() {
        return d;
    }

    public static xx a(Context context, xw xwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        xx xxVar = new xx(xwVar);
        context.registerReceiver(xxVar, intentFilter);
        xxVar.a = context;
        if (!uz.zza(context, "com.google.android.gms")) {
            xwVar.a();
            xxVar.a();
            return null;
        }
        return xxVar;
    }

    public static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (!(activity instanceof FragmentActivity)) {
            uv.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
            return;
        }
        vb.a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
    }

    private void a(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        String str;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        new IllegalArgumentException();
        if (i == 18) {
            b(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
            }
        } else {
            String d2 = abn.d(context, i);
            String c2 = abn.c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) aat.a(context.getSystemService("notification"));
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(d2).setStyle(new NotificationCompat.BigTextStyle().bigText(c2));
            if (aeb.b(context)) {
                aat.b(aee.a());
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (aeb.c(context)) {
                    style.addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(c2);
            }
            if (aee.d()) {
                aat.b(aee.d());
                synchronized (c) {
                    str = this.e;
                }
                if (str == null) {
                    str = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
                    String a2 = abn.a(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str, a2, 4));
                    } else if (!a2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(a2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                style.setChannelId(str);
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                uz.sCanceledAvailabilityNotification.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        }
    }

    @Override // defpackage.uy
    public final int a(Context context) {
        return super.a(context);
    }

    @Override // defpackage.uy
    public final PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    @Override // defpackage.uy
    public final Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    @Override // defpackage.uy
    public final String a(int i) {
        return super.a(i);
    }

    public final boolean a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntent;
        if (aen.a(context)) {
            return false;
        }
        if (connectionResult.a()) {
            pendingIntent = connectionResult.d;
        } else {
            pendingIntent = super.a(context, connectionResult.c, 0);
        }
        if (pendingIntent == null) {
            return false;
        }
        a(context, connectionResult.c, aip.a(context, 0, GoogleApiActivity.a(context, pendingIntent, i, true), aip.a | 134217728));
        return true;
    }

    public final void b(Context context) {
        new aeq(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final void b(Context context, int i) {
        a(context, i, a(context, i, 0, "n"));
    }

    @Override // defpackage.uy
    public final boolean b(int i) {
        return super.b(i);
    }

    @Override // defpackage.uy
    public final int a(Context context, int i) {
        return super.a(context, i);
    }

    public final Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i, abr.a(activity, a(activity, i, "d"), i2), onCancelListener);
    }

    public final boolean b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
