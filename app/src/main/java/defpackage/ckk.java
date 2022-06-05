package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* renamed from: ckk  reason: default package */
/* loaded from: classes2.dex */
public final class ckk implements chi {
    public static final Parcelable.Creator<ckk> CREATOR = new ckj();
    private ckq a;
    private cki b;
    private cll c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ckk(ckq ckqVar, cki ckiVar, cll cllVar) {
        this.a = ckqVar;
        this.b = ckiVar;
        this.c = cllVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ckk(ckq ckqVar) {
        ckq ckqVar2 = (ckq) aat.a(ckqVar);
        this.a = ckqVar2;
        List<ckm> list = ckqVar2.a;
        this.b = null;
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(list.get(i).c)) {
                this.b = new cki(list.get(i).b, list.get(i).c, ckqVar.d);
            }
        }
        if (this.b == null) {
            this.b = new cki(ckqVar.d);
        }
        this.c = ckqVar.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a, i);
        abc.a(parcel, 2, this.b, i);
        abc.a(parcel, 3, this.c, i);
        abc.b(parcel, a);
    }
}
