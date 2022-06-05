package defpackage;

/* renamed from: to  reason: default package */
/* loaded from: classes2.dex */
public final class to {
    static int a = 31;
    public int b = 1;

    public final to a(Object obj) {
        this.b = (a * this.b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final to a(boolean z) {
        this.b = (a * this.b) + (z ? 1 : 0);
        return this;
    }
}
