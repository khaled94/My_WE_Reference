package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: cnu  reason: default package */
/* loaded from: classes2.dex */
final class cnu extends BroadcastReceiver {
    cnv a;

    public cnu(cnv cnvVar) {
        this.a = cnvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cnv cnvVar = this.a;
        if (cnvVar != null && cnvVar.b()) {
            FirebaseInstanceId.g();
            FirebaseInstanceId.a(this.a, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
