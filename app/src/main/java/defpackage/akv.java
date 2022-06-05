package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: akv  reason: default package */
/* loaded from: classes.dex */
public final class akv extends abb {
    public static final Parcelable.Creator<akv> CREATOR = new aku();
    public final chj a;

    public akv(chj chjVar) {
        this.a = chjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a, i);
        abc.b(parcel, a);
    }
}
