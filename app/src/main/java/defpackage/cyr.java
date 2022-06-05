package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cyr  reason: default package */
/* loaded from: classes2.dex */
public final class cyr implements Parcelable {
    public static final Parcelable.Creator<cyr> CREATOR = new Parcelable.Creator<cyr>() { // from class: cyr.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ cyr[] newArray(int i) {
            return new cyr[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ cyr createFromParcel(Parcel parcel) {
            return new cyr(parcel);
        }
    };
    public float a;
    public float b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    private String l;
    private float m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public cyr() {
        this.k = "";
    }

    protected cyr(Parcel parcel) {
        this.k = "";
        this.l = parcel.readString();
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.m = parcel.readFloat();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.j = parcel.readString();
        this.i = parcel.readString();
        this.h = parcel.readString();
        this.k = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.m);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.j);
        parcel.writeString(this.i);
        parcel.writeString(this.h);
        parcel.writeString(this.k);
    }
}
