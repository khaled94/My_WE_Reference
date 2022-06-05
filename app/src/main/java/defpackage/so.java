package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: so  reason: default package */
/* loaded from: classes2.dex */
public class so implements sr {
    public static final Parcelable.Creator<so> CREATOR = new Parcelable.Creator<so>() { // from class: so.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ so[] newArray(int i) {
            return new so[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ so createFromParcel(Parcel parcel) {
            return new so(parcel);
        }
    };
    final String a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ so(a aVar, byte b) {
        this(aVar);
    }

    private so(a aVar) {
        this.a = aVar.a;
    }

    so(Parcel parcel) {
        this.a = parcel.readString();
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    /* renamed from: so$a */
    /* loaded from: classes2.dex */
    public static class a {
        String a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public final a a(Parcel parcel) {
            so soVar = (so) parcel.readParcelable(so.class.getClassLoader());
            if (soVar == null) {
                return this;
            }
            this.a = soVar.a;
            return this;
        }

        public final so a() {
            return new so(this, (byte) 0);
        }
    }
}
