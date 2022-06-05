package defpackage;

/* renamed from: lj  reason: default package */
/* loaded from: classes2.dex */
public abstract class lj {
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(boolean z);

    /* synthetic */ lj(byte b) {
        this();
    }

    private lj() {
    }

    /* renamed from: lj$a */
    /* loaded from: classes2.dex */
    public static class a extends lj {
        private volatile boolean a;

        public a() {
            super((byte) 0);
        }

        @Override // defpackage.lj
        public final void a() {
            if (!this.a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }

        @Override // defpackage.lj
        public final void a(boolean z) {
            this.a = z;
        }
    }
}
