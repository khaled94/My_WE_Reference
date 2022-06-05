package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: afi  reason: default package */
/* loaded from: classes.dex */
public final class afi extends abb {
    public static final Parcelable.Creator<afi> CREATOR = new afj();
    private final String a;
    private final aey b;
    private final boolean c;
    private final boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public afi(String str, aey aeyVar, boolean z, boolean z2) {
        this.a = str;
        this.b = aeyVar;
        this.c = z;
        this.d = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public afi(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        aez aezVar = null;
        if (iBinder != null) {
            try {
                afn b = adh.a(iBinder).b();
                byte[] bArr = b == null ? null : (byte[]) afp.a(b);
                if (bArr != null) {
                    aezVar = new aez(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.b = aezVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        aey aeyVar = this.b;
        if (aeyVar == null) {
            aeyVar = null;
        }
        abc.a(parcel, 2, aeyVar);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.b(parcel, a);
    }
}
