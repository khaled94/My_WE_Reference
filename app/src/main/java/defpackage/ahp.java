package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ahp  reason: default package */
/* loaded from: classes.dex */
public class ahp implements IInterface {
    final IBinder a;
    final String b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    /* JADX INFO: Access modifiers changed from: protected */
    public ahp(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
