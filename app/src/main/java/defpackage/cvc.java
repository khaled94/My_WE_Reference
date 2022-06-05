package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: cvc  reason: default package */
/* loaded from: classes2.dex */
public final class cvc extends View.BaseSavedState {
    public static final Parcelable.Creator<cvc> CREATOR = new Parcelable.Creator<cvc>() { // from class: cvc.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ cvc[] newArray(int i) {
            return new cvc[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ cvc createFromParcel(Parcel parcel) {
            return new cvc(parcel, (byte) 0);
        }
    };
    public int a;
    public int b;
    public int c;

    /* synthetic */ cvc(Parcel parcel, byte b) {
        this(parcel);
    }

    public cvc(Parcelable parcelable) {
        super(parcelable);
    }

    private cvc(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
