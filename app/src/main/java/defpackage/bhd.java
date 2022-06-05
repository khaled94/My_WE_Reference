package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: bhd  reason: default package */
/* loaded from: classes2.dex */
public final class bhd extends abb {
    public static final Parcelable.Creator<bhd> CREATOR = new bhh();
    private final List<bhg> a;
    private final List<bhf> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bhd(List<bhg> list, List<bhf> list2) {
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.c(parcel, 1, this.a);
        abc.c(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
