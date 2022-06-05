package defpackage;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.aad;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aco  reason: default package */
/* loaded from: classes.dex */
public final class aco extends aiy {
    final /* synthetic */ aad a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aco(aad aadVar, Looper looper) {
        super(looper);
        this.a = aadVar;
    }

    private static final void a(Message message) {
        ((acp) message.obj).e();
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        aad.a aVar;
        aad.a aVar2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z;
        if (this.a.k.get() != message.arg1) {
            if (!b(message)) {
                return;
            }
            a(message);
        } else if ((message.what != 1 && message.what != 7 && message.what != 4 && message.what != 5) || this.a.k()) {
            if (message.what == 4) {
                this.a.C = new ConnectionResult(message.arg2);
                if (aad.h(this.a)) {
                    aad aadVar = this.a;
                    z = aadVar.D;
                    if (!z) {
                        aadVar.a(3, (int) null);
                        return;
                    }
                }
                aad aadVar2 = this.a;
                connectionResult2 = aadVar2.C;
                ConnectionResult connectionResult3 = connectionResult2 != null ? aadVar2.C : new ConnectionResult(8);
                this.a.h.a(connectionResult3);
                this.a.a(connectionResult3);
            } else if (message.what == 5) {
                aad aadVar3 = this.a;
                connectionResult = aadVar3.C;
                ConnectionResult connectionResult4 = connectionResult != null ? aadVar3.C : new ConnectionResult(8);
                this.a.h.a(connectionResult4);
                this.a.a(connectionResult4);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, pendingIntent);
                    this.a.h.a(connectionResult5);
                    this.a.a(connectionResult5);
                } else if (message.what == 6) {
                    this.a.a(5, (int) null);
                    aad aadVar4 = this.a;
                    aVar = aadVar4.z;
                    if (aVar != null) {
                        aVar2 = aadVar4.z;
                        aVar2.a(message.arg2);
                    }
                    aad aadVar5 = this.a;
                    aadVar5.c = message.arg2;
                    aadVar5.d = System.currentTimeMillis();
                    aad.a(this.a, 5, 1, (IInterface) null);
                } else if (message.what != 2 || this.a.j()) {
                    if (b(message)) {
                        ((acp) message.obj).c();
                        return;
                    }
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                } else {
                    a(message);
                }
            }
        } else {
            a(message);
        }
    }
}
