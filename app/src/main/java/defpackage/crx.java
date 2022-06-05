package defpackage;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: crx  reason: default package */
/* loaded from: classes2.dex */
public final class crx implements csc {
    @Override // defpackage.csc
    public final void a(csd csdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!csdVar.b()) {
                break;
            }
            sb.append(csdVar.a());
            csdVar.f++;
            if (csf.a(csdVar.a, csdVar.f, 5) != 5) {
                csdVar.g = 0;
                break;
            }
        }
        int length = sb.length() - 1;
        int length2 = csdVar.e.length() + length + 1;
        csdVar.a(length2);
        boolean z = csdVar.h.b - length2 > 0;
        if (csdVar.b() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length3 = sb.length();
        for (int i = 0; i < length3; i++) {
            int charAt = sb.charAt(i) + (((csdVar.e.length() + 1) * 149) % 255) + 1;
            if (charAt > 255) {
                charAt += InputDeviceCompat.SOURCE_ANY;
            }
            csdVar.a((char) charAt);
        }
    }
}
