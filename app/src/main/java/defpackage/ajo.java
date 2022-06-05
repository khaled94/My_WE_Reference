package defpackage;

/* renamed from: ajo  reason: default package */
/* loaded from: classes.dex */
abstract class ajo extends aja<String> {
    final CharSequence b;
    private final aje c;
    private int f;
    private int e = 0;
    private final boolean d = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajo(ajm ajmVar, CharSequence charSequence) {
        this.c = ajmVar.a;
        this.f = ajmVar.c;
        this.b = charSequence;
    }

    abstract int a(int i);

    abstract int b(int i);

    @Override // defpackage.aja
    protected final /* synthetic */ String a() {
        int a;
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 != -1) {
                a = a(i2);
                if (a == -1) {
                    a = this.b.length();
                    this.e = -1;
                } else {
                    this.e = b(a);
                }
                int i3 = this.e;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.e = i4;
                    if (i4 > this.b.length()) {
                        this.e = -1;
                    }
                } else {
                    while (i < a && this.c.a(this.b.charAt(i))) {
                        i++;
                    }
                    while (a > i && this.c.a(this.b.charAt(a - 1))) {
                        a--;
                    }
                    if (!this.d || i != a) {
                        break;
                    }
                    i = this.e;
                }
            } else {
                this.a = ajb.c;
                return null;
            }
        }
        int i5 = this.f;
        if (i5 == 1) {
            a = this.b.length();
            this.e = -1;
            while (a > i && this.c.a(this.b.charAt(a - 1))) {
                a--;
            }
        } else {
            this.f = i5 - 1;
        }
        return this.b.subSequence(i, a).toString();
    }
}
