package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: akm  reason: default package */
/* loaded from: classes.dex */
public final class akm extends abb {
    public static final Parcelable.Creator<akm> CREATOR = new akl();
    public final String a;

    public akm(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.b(parcel, a);
    }
}
