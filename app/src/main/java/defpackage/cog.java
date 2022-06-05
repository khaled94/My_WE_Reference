package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cog  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class cog implements ThreadFactory {
    static final ThreadFactory a = new cog();

    private cog() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return cod.a(runnable);
    }
}
