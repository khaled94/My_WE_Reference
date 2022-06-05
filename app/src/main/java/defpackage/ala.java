package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: ala  reason: default package */
/* loaded from: classes.dex */
public final class ala extends abb {
    public static final Parcelable.Creator<ala> CREATOR = new akz();
    public String a;
    public cll b;
    private List<alg> c;

    public ala(String str, List<alg> list, cll cllVar) {
        this.a = str;
        this.c = list;
        this.b = cllVar;
    }

    public final List<clw> a() {
        return cjy.a(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.c(parcel, 2, this.c);
        abc.a(parcel, 3, this.b, i);
        abc.b(parcel, a);
    }
}
