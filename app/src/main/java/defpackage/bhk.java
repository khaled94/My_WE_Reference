package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: bhk  reason: default package */
/* loaded from: classes2.dex */
public final class bhk extends abb {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private static final bhk a = new bhk("com.google.android.gms", Locale.getDefault());
    public static final Parcelable.Creator<bhk> CREATOR = new bhj();

    public bhk(String str, String str2, String str3, String str4, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
    }

    private bhk(String str, Locale locale) {
        this(str, a(locale), null, null, ux.a, 0);
    }

    public bhk(String str, Locale locale, String str2) {
        this(str, a(locale), str2, null, ux.a, 0);
    }

    public final String toString() {
        return aar.a(this).a("clientPackageName", this.b).a("locale", this.c).a("accountName", this.d).a("gCoreClientName", this.e).toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, Integer.valueOf(this.f), Integer.valueOf(this.g)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bhk)) {
            bhk bhkVar = (bhk) obj;
            if (this.f == bhkVar.f && this.g == bhkVar.g && this.c.equals(bhkVar.c) && this.b.equals(bhkVar.b) && aar.a(this.d, bhkVar.d) && aar.a(this.e, bhkVar.e)) {
                return true;
            }
        }
        return false;
    }

    private static String a(Locale locale) {
        if (Build.VERSION.SDK_INT < 21) {
            String language = locale.getLanguage();
            String str = "";
            if (language == null) {
                language = str;
            }
            String country = locale.getCountry();
            if (country == null) {
                country = str;
            }
            String valueOf = String.valueOf(language);
            if (country.length() > 0) {
                String valueOf2 = String.valueOf(country);
                str = valueOf2.length() != 0 ? "-".concat(valueOf2) : new String("-");
            }
            String valueOf3 = String.valueOf(str);
            return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
        }
        return locale.toLanguageTag();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.b);
        abc.a(parcel, 2, this.c);
        abc.a(parcel, 3, this.d);
        abc.a(parcel, 4, this.e);
        abc.a(parcel, 6, this.f);
        abc.a(parcel, 7, this.g);
        abc.b(parcel, a2);
    }
}
