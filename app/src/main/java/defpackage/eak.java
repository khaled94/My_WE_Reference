package defpackage;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: eak  reason: default package */
/* loaded from: classes2.dex */
public final class eak {
    private static final Pattern c = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern e = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private eak(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0253, code lost:
        if (r0 > 253402300799999L) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.eak a(long r28, defpackage.eas r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eak.a(long, eas, java.lang.String):eak");
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                return parseLong;
            }
            return Long.MIN_VALUE;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                if (!str.startsWith("-")) {
                    return LocationRequestCompat.PASSIVE_INTERVAL;
                }
                return Long.MIN_VALUE;
            }
            throw e2;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eak)) {
            return false;
        }
        eak eakVar = (eak) obj;
        return eakVar.a.equals(this.a) && eakVar.b.equals(this.b) && eakVar.h.equals(this.h) && eakVar.i.equals(this.i) && eakVar.g == this.g && eakVar.j == this.j && eakVar.k == this.k && eakVar.l == this.l && eakVar.m == this.m;
    }

    public final int hashCode() {
        long j = this.g;
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (!this.j ? 1 : 0)) * 31) + (!this.k ? 1 : 0)) * 31) + (!this.l ? 1 : 0)) * 31) + (!this.m ? 1 : 0);
    }

    public static List<eak> a(eas easVar, ear earVar) {
        List list;
        int length = earVar.a.length / 2;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < length; i++) {
            if ("Set-Cookie".equalsIgnoreCase(earVar.a(i))) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(2);
                }
                arrayList2.add(earVar.b(i));
            }
        }
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
        } else {
            list = Collections.emptyList();
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            eak a = a(System.currentTimeMillis(), easVar, (String) list.get(i2));
            if (a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(ecd.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
