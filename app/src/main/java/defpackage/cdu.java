package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cdu  reason: default package */
/* loaded from: classes2.dex */
public final class cdu implements ceu {
    private static final ceb b = new ceb() { // from class: cdu.1
        @Override // defpackage.ceb
        public final boolean a(Class<?> cls) {
            return false;
        }

        @Override // defpackage.ceb
        public final cea b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final ceb a;

    private cdu(ceb cebVar) {
        this.a = (ceb) cdm.a(cebVar, "messageInfoFactory");
    }

    @Override // defpackage.ceu
    public final <T> cet<T> a(Class<T> cls) {
        cev.a((Class<?>) cls);
        cea b2 = this.a.b(cls);
        if (b2.b()) {
            if (cdk.class.isAssignableFrom(cls)) {
                return ceg.a(cev.c(), cde.a(), b2.c());
            }
            return ceg.a(cev.a(), cde.b(), b2.c());
        } else if (cdk.class.isAssignableFrom(cls)) {
            if (a(b2)) {
                return cef.a(b2, cej.b(), cds.b(), cev.c(), cde.a(), cdz.b());
            }
            return cef.a(b2, cej.b(), cds.b(), cev.c(), (cdc<?>) null, cdz.b());
        } else if (a(b2)) {
            return cef.a(b2, cej.a(), cds.a(), cev.a(), cde.b(), cdz.a());
        } else {
            return cef.a(b2, cej.a(), cds.a(), cev.b(), (cdc<?>) null, cdz.a());
        }
    }

    private static boolean a(cea ceaVar) {
        return ceaVar.a() == cen.a;
    }

    /* renamed from: cdu$a */
    /* loaded from: classes2.dex */
    static class a implements ceb {
        private ceb[] a;

        a(ceb... cebVarArr) {
            this.a = cebVarArr;
        }

        @Override // defpackage.ceb
        public final boolean a(Class<?> cls) {
            for (ceb cebVar : this.a) {
                if (cebVar.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ceb
        public final cea b(Class<?> cls) {
            ceb[] cebVarArr;
            for (ceb cebVar : this.a) {
                if (cebVar.a(cls)) {
                    return cebVar.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    private static ceb a() {
        try {
            return (ceb) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    public cdu() {
        this(new a(cdj.a(), a()));
    }
}
