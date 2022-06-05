package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: eas  reason: default package */
/* loaded from: classes2.dex */
public final class eas {
    private static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final int c;
    public final List<String> d;
    public final List<String> e;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    eas(a aVar) {
        this.a = aVar.a;
        this.g = a(aVar.b, false);
        this.h = a(aVar.c, false);
        this.b = aVar.d;
        this.c = aVar.a();
        this.d = a(aVar.f, false);
        String str = null;
        this.e = aVar.g != null ? a(aVar.g, true) : null;
        this.i = aVar.h != null ? a(aVar.h, false) : str;
        this.j = aVar.toString();
    }

    public final URL a() {
        try {
            return new URL(this.j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean c() {
        return this.a.equals("https");
    }

    public final String d() {
        if (this.g.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.j;
        return this.j.substring(length, ebk.a(str, length, str.length(), ":@"));
    }

    public final String e() {
        if (this.h.isEmpty()) {
            return "";
        }
        int indexOf = this.j.indexOf(64);
        return this.j.substring(this.j.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final String f() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        String str = this.j;
        return this.j.substring(indexOf, ebk.a(str, indexOf, str.length(), "?#"));
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> g() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        String str = this.j;
        int a2 = ebk.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i = indexOf + 1;
            int a3 = ebk.a(this.j, i, a2, '/');
            arrayList.add(this.j.substring(i, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public final String h() {
        if (this.e == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        String str = this.j;
        return this.j.substring(indexOf, ebk.a(str, indexOf, str.length(), '#'));
    }

    public static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public final String i() {
        a d = d("/...");
        d.b = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        d.c = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return d.b().toString();
    }

    public final eas c(String str) {
        a d = d(str);
        if (d != null) {
            return d.b();
        }
        return null;
    }

    public final a d(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static eas e(String str) {
        return new a().a((eas) null, str).b();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eas) && ((eas) obj).j.equals(this.j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return this.j;
    }

    /* renamed from: eas$a */
    /* loaded from: classes2.dex */
    public static final class a {
        String a;
        String d;
        final List<String> f;
        List<String> g;
        String h;
        String b = "";
        String c = "";
        int e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        final int a() {
            int i = this.e;
            return i != -1 ? i : eas.a(this.a);
        }

        public final a a(String str) {
            this.g = str != null ? eas.b(eas.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public final a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(eas.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.g.add(str2 != null ? eas.a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        public final a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(eas.a(str, " \"'<>#&=", true, false, true, true));
            this.g.add(str2 != null ? eas.a(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public final eas b() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.d == null) {
                throw new IllegalStateException("host == null");
            }
            return new eas(this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            if (this.e != -1 || this.a != null) {
                int a = a();
                String str3 = this.a;
                if (str3 == null || a != eas.a(str3)) {
                    sb.append(':');
                    sb.append(a);
                }
            }
            eas.a(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                eas.b(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        final a a(eas easVar, String str) {
            int c;
            int a;
            int i;
            int a2 = ebk.a(str, 0, str.length());
            int b = ebk.b(str, a2, str.length());
            if (c(str, a2, b) != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    this.a = "https";
                    a2 += 6;
                } else if (str.regionMatches(true, a2, "http:", 0, 5)) {
                    this.a = "http";
                    a2 += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, c) + "'");
                }
            } else if (easVar != null) {
                this.a = easVar.a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int d = d(str, a2, b);
            char c2 = '?';
            char c3 = '#';
            if (d >= 2 || easVar == null || !easVar.a.equals(this.a)) {
                int i2 = a2 + d;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = ebk.a(str, i2, b, "@/\\?#");
                    char charAt = a != b ? str.charAt(a) : (char) 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    } else if (charAt == '@') {
                        if (!z) {
                            int a3 = ebk.a(str, i2, a, ':');
                            i = a;
                            String a4 = eas.a(str, i2, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                a4 = this.b + "%40" + a4;
                            }
                            this.b = a4;
                            if (a3 != i) {
                                this.c = eas.a(str, a3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = a;
                            this.c += "%40" + eas.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int e = e(str, i2, a);
                int i3 = e + 1;
                if (i3 < a) {
                    this.d = a(str, i2, e);
                    int f = f(str, i3, a);
                    this.e = f;
                    if (f == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i3, a) + '\"');
                    }
                } else {
                    this.d = a(str, i2, e);
                    this.e = eas.a(this.a);
                }
                if (this.d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, e) + '\"');
                }
                a2 = a;
            } else {
                this.b = easVar.d();
                this.c = easVar.e();
                this.d = easVar.b;
                this.e = easVar.c;
                this.f.clear();
                this.f.addAll(easVar.g());
                if (a2 == b || str.charAt(a2) == '#') {
                    a(easVar.h());
                }
            }
            int a5 = ebk.a(str, a2, b, "?#");
            b(str, a2, a5);
            if (a5 < b && str.charAt(a5) == '?') {
                int a6 = ebk.a(str, a5, b, '#');
                this.g = eas.b(eas.a(str, a5 + 1, a6, " \"'<>#", true, false, true, true, null));
                a5 = a6;
            }
            if (a5 < b && str.charAt(a5) == '#') {
                this.h = eas.a(str, 1 + a5, b, "", true, false, false, false, null);
            }
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e4 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:12:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(java.lang.String r18, int r19, int r20) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eas.a.b(java.lang.String, int, int):void");
        }

        private static int c(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int d(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int e(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String a(String str, int i, int i2) {
            return ebk.a(eas.a(str, i, i2, false));
        }

        private static int f(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(eas.a(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }
    }

    private static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private static List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                edu eduVar = new edu();
                eduVar.a(str, i, i3);
                a(eduVar, str, i3, i2, z);
                return eduVar.n();
            }
        }
        return str.substring(i, i2);
    }

    private static void a(edu eduVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a2 = ebk.a(str.charAt(i + 1));
                int a3 = ebk.a(str.charAt(i3));
                if (a2 != -1 && a3 != -1) {
                    eduVar.h((a2 << 4) + a3);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
                eduVar.a(codePointAt);
                i += Character.charCount(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    eduVar.h(32);
                    i += Character.charCount(codePointAt);
                }
                eduVar.a(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }
    }

    private static boolean a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && ebk.a(str.charAt(i + 1)) != -1 && ebk.a(str.charAt(i3)) != -1;
    }

    static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            int i4 = 43;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i3, i2)))) && (codePointAt != 43 || !z3)))) {
                i3 += Character.charCount(codePointAt);
            } else {
                edu eduVar = new edu();
                eduVar.a(str, i, i3);
                edu eduVar2 = null;
                while (i3 < i2) {
                    int codePointAt2 = str.codePointAt(i3);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i4 && z3) {
                            eduVar.b(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !a(str, i3, i2)))))) {
                            if (eduVar2 == null) {
                                eduVar2 = new edu();
                            }
                            if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                                eduVar2.a(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i3;
                                if (str == null) {
                                    throw new IllegalArgumentException("string == null");
                                }
                                if (i3 < 0) {
                                    throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i3)));
                                }
                                if (charCount < i3) {
                                    throw new IllegalArgumentException("endIndex < beginIndex: " + charCount + " < " + i3);
                                } else if (charCount > str.length()) {
                                    throw new IllegalArgumentException("endIndex > string.length: " + charCount + " > " + str.length());
                                } else if (charset == null) {
                                    throw new IllegalArgumentException("charset == null");
                                } else {
                                    if (charset.equals(eep.a)) {
                                        eduVar2.a(str, i3, charCount);
                                    } else {
                                        byte[] bytes = str.substring(i3, charCount).getBytes(charset);
                                        eduVar2.c(bytes, 0, bytes.length);
                                    }
                                }
                            }
                            while (!eduVar2.d()) {
                                int g = eduVar2.g() & 255;
                                eduVar.h(37);
                                eduVar.h((int) f[(g >> 4) & 15]);
                                eduVar.h((int) f[g & 15]);
                            }
                        } else {
                            eduVar.a(codePointAt2);
                        }
                    }
                    i3 += Character.charCount(codePointAt2);
                    i4 = 43;
                }
                return eduVar.n();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2, boolean z, Charset charset) {
        return a(str, 0, str.length(), str2, z, false, true, true, charset);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public final URI b() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = d();
        aVar.c = e();
        aVar.d = this.b;
        aVar.e = this.c != a(this.a) ? this.c : -1;
        aVar.f.clear();
        aVar.f.addAll(g());
        aVar.a(h());
        aVar.h = this.i == null ? null : this.j.substring(this.j.indexOf(35) + 1);
        int size = aVar.f.size();
        for (int i = 0; i < size; i++) {
            aVar.f.set(i, a(aVar.f.get(i), "[]", true, true, false, true));
        }
        if (aVar.g != null) {
            int size2 = aVar.g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = aVar.g.get(i2);
                if (str != null) {
                    aVar.g.set(i2, a(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (aVar.h != null) {
            aVar.h = a(aVar.h, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }
}
