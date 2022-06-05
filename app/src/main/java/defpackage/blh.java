package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* renamed from: blh  reason: default package */
/* loaded from: classes2.dex */
public final class blh extends abb implements Iterable<String> {
    public static final Parcelable.Creator<blh> CREATOR = new blj();
    final Bundle a;

    public blh(Bundle bundle) {
        this.a = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(String str) {
        return this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long b(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double c(String str) {
        return Double.valueOf(this.a.getDouble(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(String str) {
        return this.a.getString(str);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new blg(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, a());
        abc.b(parcel, a);
    }
}
