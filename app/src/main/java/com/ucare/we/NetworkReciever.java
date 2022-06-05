package com.ucare.we;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes2.dex */
public class NetworkReciever extends BroadcastReceiver {
    String a;
    private cwh b;

    public NetworkReciever(cwh cwhVar) {
        this.b = cwhVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean a = a(context);
        if (a) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo.getType() == 1) {
                this.a = "Wifi";
            } else if (activeNetworkInfo.getType() == 0) {
                this.a = "mobile data";
            } else {
                this.a = "no data";
            }
        } else {
            this.a = "no data";
        }
        a(String.valueOf(a));
        cwh cwhVar = this.b;
        if (cwhVar != null) {
            cwhVar.a(a, this.a);
        }
    }

    private static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            a(e.getLocalizedMessage());
            return false;
        }
    }

    private static void a(String str) {
        new StringBuilder().append(str);
    }
}
