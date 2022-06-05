package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sw  reason: default package */
/* loaded from: classes2.dex */
public final class sw extends sq {
    public static final Parcelable.Creator<sw> CREATOR = new Parcelable.Creator<sw>() { // from class: sw.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ sw[] newArray(int i) {
            return new sw[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ sw createFromParcel(Parcel parcel) {
            return new sw(parcel);
        }
    };
    public final Uri a;
    private final Bitmap b;
    private final boolean c;
    private final String d;

    @Override // defpackage.sq, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    sw(Parcel parcel) {
        super(parcel);
        this.b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.c = parcel.readByte() != 0;
        this.d = parcel.readString();
    }

    @Override // defpackage.sq, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.a, 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.d);
    }
}
