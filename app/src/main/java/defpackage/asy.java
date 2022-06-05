package defpackage;

import defpackage.ata;

/* renamed from: asy  reason: default package */
/* loaded from: classes.dex */
final class asy implements auf {
    private static final asy a = new asy();

    private asy() {
    }

    public static asy a() {
        return a;
    }

    @Override // defpackage.auf
    public final boolean a(Class<?> cls) {
        return ata.class.isAssignableFrom(cls);
    }

    @Override // defpackage.auf
    public final aug b(Class<?> cls) {
        if (!ata.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (aug) ata.a((Class<ata>) cls.asSubclass(ata.class)).a(ata.d.c);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
