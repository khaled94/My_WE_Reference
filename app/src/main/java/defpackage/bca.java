package defpackage;

import defpackage.bcc;

/* renamed from: bca  reason: default package */
/* loaded from: classes2.dex */
final class bca implements bde {
    private static final bca a = new bca();

    private bca() {
    }

    public static bca a() {
        return a;
    }

    @Override // defpackage.bde
    public final boolean a(Class<?> cls) {
        return bcc.class.isAssignableFrom(cls);
    }

    @Override // defpackage.bde
    public final bdf b(Class<?> cls) {
        if (!bcc.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (bdf) bcc.a((Class<bcc>) cls.asSubclass(bcc.class)).a(bcc.d.c);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
