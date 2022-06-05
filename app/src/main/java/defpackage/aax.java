package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: aax  reason: default package */
/* loaded from: classes.dex */
public final class aax extends abb {
    public static final Parcelable.Creator<aax> CREATOR = new abl();
    public final int a;
    public List<aaq> b;

    public aax(int i, List<aaq> list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.c(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
