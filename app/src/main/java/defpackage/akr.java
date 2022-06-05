package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: akr  reason: default package */
/* loaded from: classes.dex */
public final class akr extends abb {
    public static final Parcelable.Creator<akr> CREATOR = new akq();
    public final alr a;

    public akr(alr alrVar) {
        this.a = alrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a, i);
        abc.b(parcel, a);
    }
}
