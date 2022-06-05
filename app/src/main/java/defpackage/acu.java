package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: acu  reason: default package */
/* loaded from: classes.dex */
public final class acu extends abb {
    public static final Parcelable.Creator<acu> CREATOR = new acv();
    Bundle a;
    uw[] b;
    int c;
    aag d;

    public acu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public acu(Bundle bundle, uw[] uwVarArr, int i, aag aagVar) {
        this.a = bundle;
        this.b = uwVarArr;
        this.c = i;
        this.d = aagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b, i);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d, i);
        abc.b(parcel, a);
    }
}
