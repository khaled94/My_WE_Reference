package defpackage;

/* renamed from: jz  reason: default package */
/* loaded from: classes2.dex */
public interface jz {
    boolean b(jy jyVar);

    boolean c(jy jyVar);

    boolean d(jy jyVar);

    void e(jy jyVar);

    void f(jy jyVar);

    boolean g();

    jz h();

    /* renamed from: jz$a */
    /* loaded from: classes2.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        a(boolean z) {
            this.isComplete = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean isComplete() {
            return this.isComplete;
        }
    }
}
