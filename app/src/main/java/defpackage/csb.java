package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: csb  reason: default package */
/* loaded from: classes2.dex */
public final class csb implements csc {
    @Override // defpackage.csc
    public final void a(csd csdVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        while (true) {
            z = true;
            if (!csdVar.b()) {
                break;
            }
            char a = csdVar.a();
            if (a >= ' ' && a <= '?') {
                sb.append(a);
            } else if (a >= '@' && a <= '^') {
                sb.append((char) (a - '@'));
            } else {
                csf.c(a);
            }
            csdVar.f++;
            if (sb.length() >= 4) {
                csdVar.a(a(sb));
                sb.delete(0, 4);
                if (csf.a(csdVar.a, csdVar.f, 4) != 4) {
                    csdVar.g = 0;
                    break;
                }
            }
        }
        sb.append((char) 31);
        try {
            int length = sb.length();
            if (length == 0) {
                return;
            }
            if (length == 1) {
                csdVar.d();
                int length2 = csdVar.h.b - csdVar.e.length();
                int c = csdVar.c();
                if (c > length2) {
                    csdVar.a(csdVar.e.length() + 1);
                    length2 = csdVar.h.b - csdVar.e.length();
                }
                if (c <= length2 && length2 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String a2 = a(sb);
            if (!(!csdVar.b()) || i > 2) {
                z = false;
            }
            if (i <= 2) {
                csdVar.a(csdVar.e.length() + i);
                if (csdVar.h.b - csdVar.e.length() >= 3) {
                    csdVar.a(csdVar.e.length() + a2.length());
                    z = false;
                }
            }
            if (!z) {
                csdVar.a(a2);
            } else {
                csdVar.h = null;
                csdVar.f -= i;
            }
        } finally {
            csdVar.g = 0;
        }
    }

    private static String a(CharSequence charSequence) {
        char c = 0;
        int length = charSequence.length() - 0;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        char charAt = charSequence.charAt(0);
        char charAt2 = length >= 2 ? charSequence.charAt(1) : (char) 0;
        char charAt3 = length >= 3 ? charSequence.charAt(2) : (char) 0;
        if (length >= 4) {
            c = charSequence.charAt(3);
        }
        int i = (charAt << 18) + (charAt2 << '\f') + (charAt3 << 6) + c;
        char c2 = (char) ((i >> 8) & 255);
        char c3 = (char) (i & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) ((i >> 16) & 255));
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }
}
