package defpackage;

/* renamed from: ajn  reason: default package */
/* loaded from: classes.dex */
final class ajn extends ajo {
    private final /* synthetic */ ajl c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajn(ajl ajlVar, ajm ajmVar, CharSequence charSequence) {
        super(ajmVar, charSequence);
        this.c = ajlVar;
    }

    @Override // defpackage.ajo
    final int b(int i) {
        return i + 1;
    }

    @Override // defpackage.ajo
    final int a(int i) {
        return this.c.a.a(this.b, i);
    }
}
