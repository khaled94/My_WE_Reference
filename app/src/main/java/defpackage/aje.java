package defpackage;

/* renamed from: aje  reason: default package */
/* loaded from: classes.dex */
public abstract class aje {
    public abstract boolean a(char c);

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        ajj.a(i, length, "index");
        while (i < length) {
            if (a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
