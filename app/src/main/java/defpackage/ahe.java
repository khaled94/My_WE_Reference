package defpackage;

/* renamed from: ahe  reason: default package */
/* loaded from: classes.dex */
public final class ahe {
    public boolean a = false;
    public ahf b = null;

    public final <T> T a(agq<T> agqVar) {
        synchronized (this) {
            if (this.a) {
                return agqVar.a(this.b);
            }
            return agqVar.c;
        }
    }
}
