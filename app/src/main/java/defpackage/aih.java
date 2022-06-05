package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: aih  reason: default package */
/* loaded from: classes.dex */
public class aih implements IInterface {
    private final IBinder a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: protected */
    public aih(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
