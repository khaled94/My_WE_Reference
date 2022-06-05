package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ako  reason: default package */
/* loaded from: classes.dex */
public final class ako extends abb {
    public static final Parcelable.Creator<ako> CREATOR = new akn();
    private final String a;
    private final alr b;

    public ako(String str, alr alrVar) {
        this.a = str;
        this.b = alrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b, i);
        abc.b(parcel, a);
    }
}
