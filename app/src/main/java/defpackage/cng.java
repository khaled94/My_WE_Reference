package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: cng  reason: default package */
/* loaded from: classes2.dex */
final class cng {
    final Messenger a;
    final coi b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cng(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new coi(iBinder);
            this.a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            } else {
                new String("Invalid interface descriptor: ");
            }
            throw new RemoteException();
        }
    }
}
