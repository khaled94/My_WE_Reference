package defpackage;

import java.io.IOException;

/* renamed from: awu  reason: default package */
/* loaded from: classes.dex */
public abstract class awu {
    protected volatile int h = -1;

    public abstract awu a(awl awlVar) throws IOException;

    public void a(awn awnVar) throws IOException {
    }

    protected int b() {
        return 0;
    }

    public final int d() {
        int b = b();
        this.h = b;
        return b;
    }

    public String toString() {
        return awt.a(this);
    }

    /* renamed from: c */
    public awu clone() throws CloneNotSupportedException {
        return (awu) super.clone();
    }
}
