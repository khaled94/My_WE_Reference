package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import defpackage.cuc;

/* renamed from: cun  reason: default package */
/* loaded from: classes2.dex */
public abstract class cun<T extends Animator> {
    protected cuc.a b;
    protected long a = 350;
    protected T c = a();

    public abstract T a();

    public abstract cun a(float f);

    public cun(cuc.a aVar) {
        this.b = aVar;
    }

    public cun a(long j) {
        this.a = j;
        T t = this.c;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
        return this;
    }

    public final void b() {
        T t = this.c;
        if (t == null || t.isRunning()) {
            return;
        }
        this.c.start();
    }

    public final void c() {
        T t = this.c;
        if (t == null || !t.isStarted()) {
            return;
        }
        this.c.end();
    }
}
