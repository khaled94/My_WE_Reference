package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bhg  reason: default package */
/* loaded from: classes2.dex */
public final class bhg extends abb {
    public static final Parcelable.Creator<bhg> CREATOR = new bhq();
    private final int a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bhg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
