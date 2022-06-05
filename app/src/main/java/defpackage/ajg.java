package defpackage;

/* renamed from: ajg  reason: default package */
/* loaded from: classes.dex */
public final class ajg extends ajd {
    private final char a = '.';

    @Override // defpackage.aje
    public final boolean a(char c) {
        return c == this.a;
    }

    public final String toString() {
        char c = this.a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
