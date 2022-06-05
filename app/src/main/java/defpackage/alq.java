package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: alq  reason: default package */
/* loaded from: classes.dex */
public final class alq extends abb {
    public static final Parcelable.Creator<alq> CREATOR = new als();
    private final int a;
    private List<String> b;

    public alq() {
        this(null);
    }

    private alq(List<String> list) {
        this.a = 1;
        this.b = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.b.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public alq(int i, List<String> list) {
        this.a = i;
        if (list == null || list.isEmpty()) {
            this.b = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, aeg.a(list.get(i2)));
        }
        this.b = Collections.unmodifiableList(list);
    }

    public static alq a() {
        return new alq(null);
    }

    public static alq a(alq alqVar) {
        return new alq(alqVar != null ? alqVar.b : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.b(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
