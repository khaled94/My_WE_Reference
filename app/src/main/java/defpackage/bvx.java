package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvx  reason: default package */
/* loaded from: classes2.dex */
public final class bvx extends abb {
    public static final Parcelable.Creator<bvx> CREATOR = new bvy();
    final int a;
    final acc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bvx(int i, acc accVar) {
        this.a = i;
        this.b = accVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b, i);
        abc.b(parcel, a);
    }
}
