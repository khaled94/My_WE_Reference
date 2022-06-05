package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.zzak;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cnh  reason: default package */
/* loaded from: classes2.dex */
public abstract class cnh<T> {
    final int a;
    final bwm<T> b = new bwm<>();
    final int c;
    final Bundle d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cnh(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.b.a((bwm<T>) t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(zzak zzakVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzakVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.b.a(zzakVar);
    }

    public String toString() {
        int i = this.c;
        int i2 = this.a;
        boolean a = a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
