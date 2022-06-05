package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ada  reason: default package */
/* loaded from: classes.dex */
public final class ada implements Handler.Callback {
    final /* synthetic */ adb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ada(adb adbVar) {
        this.a = adbVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        Handler handler;
        adt adtVar;
        Context context;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.a.b;
            synchronized (hashMap) {
                acy acyVar = (acy) message.obj;
                hashMap2 = this.a.b;
                acz aczVar = (acz) hashMap2.get(acyVar);
                if (aczVar != null && aczVar.a()) {
                    if (aczVar.c) {
                        handler = aczVar.g.d;
                        handler.removeMessages(1, aczVar.e);
                        adb adbVar = aczVar.g;
                        adtVar = adbVar.f;
                        context = adbVar.c;
                        adtVar.a(context, aczVar);
                        aczVar.c = false;
                        aczVar.b = 2;
                    }
                    hashMap3 = this.a.b;
                    hashMap3.remove(acyVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            hashMap4 = this.a.b;
            synchronized (hashMap4) {
                acy acyVar2 = (acy) message.obj;
                hashMap5 = this.a.b;
                acz aczVar2 = (acz) hashMap5.get(acyVar2);
                if (aczVar2 != null && aczVar2.b == 3) {
                    String valueOf = String.valueOf(acyVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    new Exception();
                    ComponentName componentName = aczVar2.f;
                    if (componentName == null) {
                        componentName = acyVar2.b;
                    }
                    if (componentName == null) {
                        String str = acyVar2.a;
                        aat.a(str);
                        componentName = new ComponentName(str, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    aczVar2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
