package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bxl  reason: default package */
/* loaded from: classes2.dex */
public interface bxl<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
