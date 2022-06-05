package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ckv  reason: default package */
/* loaded from: classes2.dex */
public final class ckv extends clx {
    public static final Parcelable.Creator<ckv> CREATOR = new cky();
    private String a;
    private String b;
    private List<clf> c;

    private ckv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ckv(String str, String str2, List<clf> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static ckv a(List<clw> list, String str) {
        aat.a(list);
        aat.a(str);
        ckv ckvVar = new ckv();
        ckvVar.c = new ArrayList();
        for (clw clwVar : list) {
            if (clwVar instanceof clf) {
                ckvVar.c.add((clf) clwVar);
            }
        }
        ckvVar.b = str;
        return ckvVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.c(parcel, 3, this.c);
        abc.b(parcel, a);
    }
}
