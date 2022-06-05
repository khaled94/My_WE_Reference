package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: alk  reason: default package */
/* loaded from: classes.dex */
public final class alk extends abb {
    public static final Parcelable.Creator<alk> CREATOR = new aln();
    public List<ali> a;

    public alk() {
        this.a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public alk(List<ali> list) {
        if (list != null && !list.isEmpty()) {
            this.a = Collections.unmodifiableList(list);
        } else {
            this.a = Collections.emptyList();
        }
    }

    public static alk a(alk alkVar) {
        List<ali> list = alkVar.a;
        alk alkVar2 = new alk();
        if (list != null) {
            alkVar2.a.addAll(list);
        }
        return alkVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.c(parcel, 2, this.a);
        abc.b(parcel, a);
    }
}
