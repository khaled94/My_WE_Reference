package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ckt  reason: default package */
/* loaded from: classes2.dex */
public final class ckt extends clv {
    public static final Parcelable.Creator<ckt> CREATOR = new ckw();
    private final List<clf> a = new ArrayList();
    private final ckv b;
    private final String c;
    private final cll d;

    public ckt(List<clf> list, ckv ckvVar, String str, cll cllVar) {
        for (clf clfVar : list) {
            if (clfVar instanceof clf) {
                this.a.add(clfVar);
            }
        }
        this.b = (ckv) aat.a(ckvVar);
        this.c = aat.a(str);
        this.d = cllVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.c(parcel, 1, this.a);
        abc.a(parcel, 2, this.b, i);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d, i);
        abc.b(parcel, a);
    }
}
