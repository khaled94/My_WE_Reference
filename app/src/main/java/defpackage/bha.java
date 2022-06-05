package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: bha  reason: default package */
/* loaded from: classes2.dex */
public final class bha extends abb {
    public static final Parcelable.Creator<bha> CREATOR = new bgz();
    private final List<Integer> a;
    private final String b;
    private final Uri c;
    private final float d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bha(List<Integer> list, String str, Uri uri, float f, int i) {
        this.a = Collections.unmodifiableList(list);
        this.b = str;
        this.c = uri;
        this.d = f;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c, i);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.e);
        abc.b(parcel, a);
    }
}
