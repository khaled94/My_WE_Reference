package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bvz  reason: default package */
/* loaded from: classes2.dex */
public final class bvz extends abb {
    public static final Parcelable.Creator<bvz> CREATOR = new bwa();
    final int a;
    public final ConnectionResult b;
    public final ace c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bvz(int i, ConnectionResult connectionResult, ace aceVar) {
        this.a = i;
        this.b = connectionResult;
        this.c = aceVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b, i);
        abc.a(parcel, 3, this.c, i);
        abc.b(parcel, a);
    }
}
