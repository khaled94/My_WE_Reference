package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.c;

/* loaded from: classes.dex */
public class PostMessageService extends Service {
    private c.a mBinder = new c.a() { // from class: androidx.browser.customtabs.PostMessageService.1
        @Override // defpackage.c
        public void onMessageChannelReady(a aVar, Bundle bundle) throws RemoteException {
            aVar.onMessageChannelReady(bundle);
        }

        @Override // defpackage.c
        public void onPostMessage(a aVar, String str, Bundle bundle) throws RemoteException {
            aVar.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
