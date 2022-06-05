package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class AutocompleteFilter extends abb implements ReflectedParcelable {
    public static final Parcelable.Creator<AutocompleteFilter> CREATOR = new bii();
    private final int a;
    private final boolean b;
    private final List<Integer> c;
    private final String d;
    private final int e;

    /* loaded from: classes.dex */
    public static final class a {
        private boolean c = false;
        public int a = 0;
        public String b = "";
    }

    public AutocompleteFilter(int i, boolean z, List<Integer> list, String str) {
        this.a = i;
        this.c = list;
        this.e = (list == null || list.isEmpty()) ? 0 : list.iterator().next().intValue();
        this.d = str;
        if (this.a <= 0) {
            this.b = !z;
        } else {
            this.b = z;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Integer.valueOf(this.e), this.d});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteFilter)) {
            return false;
        }
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        return this.e == autocompleteFilter.e && this.b == autocompleteFilter.b && this.d == autocompleteFilter.d;
    }

    public String toString() {
        return aar.a(this).a("includeQueryPredictions", Boolean.valueOf(this.b)).a("typeFilter", Integer.valueOf(this.e)).a("country", this.d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.b);
        abc.a(parcel, 2, this.c);
        abc.a(parcel, 3, this.d);
        abc.a(parcel, 1000, this.a);
        abc.b(parcel, a2);
    }
}
