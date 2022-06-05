package defpackage;

/* renamed from: ece  reason: default package */
/* loaded from: classes2.dex */
public final class ece {
    private static final edx a = edx.a("\"\\");
    private static final edx b = edx.a("\t ,=");

    private ece() {
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void a(eal ealVar, eas easVar, ear earVar) {
        if (ealVar != eal.a && eak.a(easVar, earVar).isEmpty()) {
        }
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong >= 0) {
                return (int) parseLong;
            }
            return 0;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long a(ebc ebcVar) {
        return a(ebcVar.f.a("Content-Length"));
    }

    public static boolean b(ebc ebcVar) {
        if (ebcVar.a.b.equals("HEAD")) {
            return false;
        }
        int i = ebcVar.c;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && a(ebcVar) == -1 && !"chunked".equalsIgnoreCase(ebcVar.a("Transfer-Encoding"))) ? false : true;
    }
}
