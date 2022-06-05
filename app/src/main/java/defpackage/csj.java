package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: csj  reason: default package */
/* loaded from: classes2.dex */
public final class csj extends cry {
    @Override // defpackage.cry
    public final int a() {
        return 3;
    }

    @Override // defpackage.cry, defpackage.csc
    public final void a(csd csdVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!csdVar.b()) {
                break;
            }
            char a = csdVar.a();
            csdVar.f++;
            a(a, sb);
            if (sb.length() % 3 == 0) {
                a(csdVar, sb);
                if (csf.a(csdVar.a, csdVar.f, 3) != 3) {
                    csdVar.g = 0;
                    break;
                }
            }
        }
        b(csdVar, sb);
    }

    @Override // defpackage.cry
    final int a(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
        } else {
            csf.c(c);
        }
        return 1;
    }

    @Override // defpackage.cry
    final void b(csd csdVar, StringBuilder sb) {
        csdVar.d();
        int length = csdVar.h.b - csdVar.e.length();
        csdVar.f -= sb.length();
        if (csdVar.c() > 1 || length > 1 || csdVar.c() != length) {
            csdVar.a((char) 254);
        }
        if (csdVar.g < 0) {
            csdVar.g = 0;
        }
    }
}
