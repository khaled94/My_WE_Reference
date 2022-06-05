package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: crw  reason: default package */
/* loaded from: classes2.dex */
public final class crw implements csc {
    @Override // defpackage.csc
    public final void a(csd csdVar) {
        int i;
        String str = csdVar.a;
        int i2 = csdVar.f;
        int length = str.length();
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (csf.a(charAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    charAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = csdVar.a.charAt(csdVar.f);
            char charAt3 = csdVar.a.charAt(csdVar.f + 1);
            if (csf.a(charAt2) && csf.a(charAt3)) {
                csdVar.a((char) (((charAt2 - '0') * 10) + (charAt3 - '0') + 130));
                csdVar.f += 2;
                return;
            }
            throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
        }
        char a = csdVar.a();
        int a2 = csf.a(csdVar.a, csdVar.f, 0);
        if (a2 == 0) {
            if (csf.b(a)) {
                csdVar.a((char) 235);
                csdVar.a((char) ((a - 128) + 1));
                csdVar.f++;
                return;
            }
            csdVar.a((char) (a + 1));
            csdVar.f++;
        } else if (a2 == 1) {
            csdVar.a((char) 230);
            csdVar.g = 1;
        } else if (a2 == 2) {
            csdVar.a((char) 239);
            csdVar.g = 2;
        } else if (a2 == 3) {
            csdVar.a((char) 238);
            csdVar.g = 3;
        } else if (a2 == 4) {
            csdVar.a((char) 240);
            csdVar.g = 4;
        } else if (a2 == 5) {
            csdVar.a((char) 231);
            csdVar.g = 5;
        } else {
            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(a2)));
        }
    }
}
