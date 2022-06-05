package defpackage;

/* renamed from: aji  reason: default package */
/* loaded from: classes.dex */
final class aji extends ajf {
    static final aji a = new aji();

    private aji() {
        super("CharMatcher.none()");
    }

    @Override // defpackage.aje
    public final boolean a(char c) {
        return false;
    }

    @Override // defpackage.aje
    public final int a(CharSequence charSequence, int i) {
        ajj.a(i, charSequence.length(), "index");
        return -1;
    }
}
