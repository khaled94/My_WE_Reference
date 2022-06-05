package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cmt  reason: default package */
/* loaded from: classes2.dex */
public interface cmt {
    <T> void a(Class<T> cls, cmr<? super T> cmrVar);

    <T> void a(Class<T> cls, Executor executor, cmr<? super T> cmrVar);
}
