package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import defpackage.aal;

/* renamed from: ace  reason: default package */
/* loaded from: classes.dex */
public final class ace extends abb {
    public static final Parcelable.Creator<ace> CREATOR = new acf();
    final int a;
    final IBinder b;
    public final ConnectionResult c;
    public final boolean d;
    public final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ace(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final aal a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        return aal.a.a(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ace)) {
            return false;
        }
        ace aceVar = (ace) obj;
        return this.c.equals(aceVar.c) && aar.a(a(), aceVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c, i);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.e);
        abc.b(parcel, a);
    }
}
