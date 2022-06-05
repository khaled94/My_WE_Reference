package defpackage;

import java.util.concurrent.Callable;

/* renamed from: afk  reason: default package */
/* loaded from: classes.dex */
final class afk extends afl {
    private final Callable<String> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ afk(Callable callable) {
        super(false, null, null);
        this.d = callable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.afl
    public final String a() {
        try {
            return this.d.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
