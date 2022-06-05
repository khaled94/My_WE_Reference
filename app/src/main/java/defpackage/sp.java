package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sp  reason: default package */
/* loaded from: classes2.dex */
public final class sp extends sn<sp, Object> {
    public static final Parcelable.Creator<sp> CREATOR = new Parcelable.Creator<sp>() { // from class: sp.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ sp[] newArray(int i) {
            return new sp[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ sp createFromParcel(Parcel parcel) {
            return new sp(parcel);
        }
    };
    @Deprecated
    private final String c;
    @Deprecated
    private final String d;
    @Deprecated
    private final Uri e;
    private final String f;

    @Override // defpackage.sn, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    sp(Parcel parcel) {
        super(parcel);
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f = parcel.readString();
    }

    public final String a() {
        return this.f;
    }

    @Override // defpackage.sn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, 0);
        parcel.writeString(this.f);
    }
}
