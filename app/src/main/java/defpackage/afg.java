package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: afg  reason: default package */
/* loaded from: classes.dex */
public final class afg extends abb {
    public static final Parcelable.Creator<afg> CREATOR = new afh();
    final boolean a;
    final String b;
    final int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public afg(boolean z, String str, int i) {
        this.a = z;
        this.b = str;
        this.c = aff.a(i) - 1;
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
