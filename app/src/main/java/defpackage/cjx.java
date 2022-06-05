package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cjx  reason: default package */
/* loaded from: classes2.dex */
public final class cjx extends abb {
    public static final Parcelable.Creator<cjx> CREATOR = new cka();
    final List<clf> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cjx(List<clf> list) {
        this.a = list == null ? ajw.f() : list;
    }

    public static cjx a(List<clw> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (clw clwVar : list) {
            if (clwVar instanceof clf) {
                arrayList.add((clf) clwVar);
            }
        }
        return new cjx(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.c(parcel, 1, this.a);
        abc.b(parcel, a);
    }
}
