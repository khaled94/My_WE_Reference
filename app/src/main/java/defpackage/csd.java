package defpackage;

import java.nio.charset.StandardCharsets;

/* renamed from: csd  reason: default package */
/* loaded from: classes2.dex */
final class csd {
    final String a;
    csh b;
    crd c;
    crd d;
    final StringBuilder e;
    int f;
    int g;
    csg h;
    int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public csd(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = csh.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public final char a() {
        return this.a.charAt(this.f);
    }

    public final void a(String str) {
        this.e.append(str);
    }

    public final void a(char c) {
        this.e.append(c);
    }

    public final boolean b() {
        return this.f < e();
    }

    private int e() {
        return this.a.length() - this.i;
    }

    public final int c() {
        return e() - this.f;
    }

    public final void a(int i) {
        csg csgVar = this.h;
        if (csgVar == null || i > csgVar.b) {
            this.h = csg.a(i, this.b, this.c, this.d);
        }
    }

    public final void d() {
        a(this.e.length());
    }
}
