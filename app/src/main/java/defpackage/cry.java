package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cry  reason: default package */
/* loaded from: classes2.dex */
public class cry implements csc {
    public int a() {
        return 1;
    }

    @Override // defpackage.csc
    public void a(csd csdVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!csdVar.b()) {
                break;
            }
            char a = csdVar.a();
            csdVar.f++;
            int a2 = a(a, sb);
            int length = csdVar.e.length() + ((sb.length() / 3) << 1);
            csdVar.a(length);
            int i = csdVar.h.b - length;
            if (!csdVar.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    a2 = a(csdVar, sb, sb2, a2);
                }
                while (sb.length() % 3 == 1 && ((a2 <= 3 && i != 1) || a2 > 3)) {
                    a2 = a(csdVar, sb, sb2, a2);
                }
            } else if (sb.length() % 3 == 0 && csf.a(csdVar.a, csdVar.f, a()) != a()) {
                csdVar.g = 0;
                break;
            }
        }
        b(csdVar, sb);
    }

    private int a(csd csdVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        csdVar.f--;
        int a = a(csdVar.a(), sb2);
        csdVar.h = null;
        return a;
    }

    void b(csd csdVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int length2 = csdVar.e.length() + ((sb.length() / 3) << 1);
        csdVar.a(length2);
        int i = csdVar.h.b - length2;
        if (length == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                a(csdVar, sb);
            }
            if (csdVar.b()) {
                csdVar.a((char) 254);
            }
        } else if (i == 1 && length == 1) {
            while (sb.length() >= 3) {
                a(csdVar, sb);
            }
            if (csdVar.b()) {
                csdVar.a((char) 254);
            }
            csdVar.f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                a(csdVar, sb);
            }
            if (i > 0 || csdVar.b()) {
                csdVar.a((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        csdVar.g = 0;
    }

    int a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return a((char) (c - 128), sb) + 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(csd csdVar, StringBuilder sb) {
        int charAt = (sb.charAt(0) * 1600) + (sb.charAt(1) * '(') + sb.charAt(2) + 1;
        csdVar.a(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb.delete(0, 3);
    }
}
