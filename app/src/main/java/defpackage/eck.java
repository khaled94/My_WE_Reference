package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: eck  reason: default package */
/* loaded from: classes2.dex */
public final class eck {
    public final eay a;
    public final int b;
    public final String c;

    private eck(eay eayVar, int i, String str) {
        this.a = eayVar;
        this.b = i;
        this.c = str;
    }

    public static eck a(ebc ebcVar) {
        return new eck(ebcVar.b, ebcVar.c, ebcVar.d);
    }

    public static eck a(String str) throws IOException {
        eay eayVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                eayVar = eay.HTTP_1_0;
            } else if (charAt == 1) {
                eayVar = eay.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            eayVar = eay.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            } else {
                str2 = str.substring(i + 4);
            }
            return new eck(eayVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == eay.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
