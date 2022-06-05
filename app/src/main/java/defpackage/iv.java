package defpackage;

import android.content.Context;
import defpackage.it;

/* renamed from: iv  reason: default package */
/* loaded from: classes2.dex */
final class iv implements it {
    final it.a a;
    private final Context b;

    @Override // defpackage.jd
    public final void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public iv(Context context, it.a aVar) {
        this.b = context.getApplicationContext();
        this.a = aVar;
    }

    @Override // defpackage.jd
    public final void a() {
        jj.a(this.b).a(this.a);
    }

    @Override // defpackage.jd
    public final void b() {
        jj.a(this.b).b(this.a);
    }
}
