package defpackage;

import defpackage.ata;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: atu  reason: default package */
/* loaded from: classes.dex */
public final class atu implements avb {
    private static final auf b = new atx();
    private final auf a;

    public atu() {
        this(new atw(asy.a(), a()));
    }

    private atu(auf aufVar) {
        this.a = (auf) atb.a(aufVar, "messageInfoFactory");
    }

    @Override // defpackage.avb
    public final <T> aux<T> a(Class<T> cls) {
        auz.a((Class<?>) cls);
        aug b2 = this.a.b(cls);
        if (b2.b()) {
            if (ata.class.isAssignableFrom(cls)) {
                return auo.a(auz.c(), asr.a(), b2.c());
            }
            return auo.a(auz.a(), asr.b(), b2.c());
        } else if (ata.class.isAssignableFrom(cls)) {
            if (a(b2)) {
                return aum.a(b2, aus.b(), atr.b(), auz.c(), asr.a(), aud.b());
            }
            return aum.a(b2, aus.b(), atr.b(), auz.c(), (asp<?>) null, aud.b());
        } else if (a(b2)) {
            return aum.a(b2, aus.a(), atr.a(), auz.a(), asr.b(), aud.a());
        } else {
            return aum.a(b2, aus.a(), atr.a(), auz.b(), (asp<?>) null, aud.a());
        }
    }

    private static boolean a(aug augVar) {
        return augVar.a() == ata.d.h;
    }

    private static auf a() {
        try {
            return (auf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }
}
