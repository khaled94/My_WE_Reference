package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tn  reason: default package */
/* loaded from: classes2.dex */
public final class tn extends abb {
    public static final Parcelable.Creator<tn> CREATOR = new tq();
    final int a;
    public int b;
    private Bundle c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tn(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.b(parcel, a);
    }
}
