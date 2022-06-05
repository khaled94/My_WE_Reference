package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.sv;

/* renamed from: ss  reason: default package */
/* loaded from: classes2.dex */
public final class ss extends sv<ss, a> {
    public static final Parcelable.Creator<ss> CREATOR = new Parcelable.Creator<ss>() { // from class: ss.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ss[] newArray(int i) {
            return new ss[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ss createFromParcel(Parcel parcel) {
            return new ss(parcel);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ss(a aVar, byte b) {
        this(aVar);
    }

    private ss(a aVar) {
        super(aVar);
    }

    ss(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: ss$a */
    /* loaded from: classes2.dex */
    public static final class a extends sv.a<ss, a> {
        /* JADX INFO: Access modifiers changed from: private */
        public a a(ss ssVar) {
            if (ssVar == null) {
                return this;
            }
            a aVar = (a) super.a((a) ssVar);
            aVar.a.putString("og:type", ssVar.a());
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final a a(Parcel parcel) {
            return a((ss) parcel.readParcelable(ss.class.getClassLoader()));
        }
    }

    public final String a() {
        return this.b.getString("og:type");
    }
}
