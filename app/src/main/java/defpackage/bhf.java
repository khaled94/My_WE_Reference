package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: bhf  reason: default package */
/* loaded from: classes2.dex */
public final class bhf extends abb {
    public static final Parcelable.Creator<bhf> CREATOR = new bhp();
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final List<bhg> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bhf(int i, int i2, int i3, int i4, int i5, int i6, List<bhg> list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.e);
        abc.a(parcel, 6, this.f);
        abc.c(parcel, 7, this.g);
        abc.b(parcel, a);
    }
}
