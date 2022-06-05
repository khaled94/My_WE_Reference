package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ss;

/* renamed from: st  reason: default package */
/* loaded from: classes2.dex */
public final class st extends sn<st, Object> {
    public static final Parcelable.Creator<st> CREATOR = new Parcelable.Creator<st>() { // from class: st.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ st[] newArray(int i) {
            return new st[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ st createFromParcel(Parcel parcel) {
            return new st(parcel);
        }
    };
    public final ss c;
    private final String d;

    @Override // defpackage.sn, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    st(Parcel parcel) {
        super(parcel);
        this.c = new ss(new ss.a().a(parcel), (byte) 0);
        this.d = parcel.readString();
    }

    public final ss a() {
        return this.c;
    }

    @Override // defpackage.sn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
        parcel.writeString(this.d);
    }
}
