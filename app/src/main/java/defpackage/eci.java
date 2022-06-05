package defpackage;

/* renamed from: eci  reason: default package */
/* loaded from: classes2.dex */
public final class eci {
    private eci() {
    }

    public static String a(eas easVar) {
        String f = easVar.f();
        String h = easVar.h();
        if (h != null) {
            return f + '?' + h;
        }
        return f;
    }
}
