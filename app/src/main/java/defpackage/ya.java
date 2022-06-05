package defpackage;

import defpackage.vc;
import defpackage.vq;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: ya  reason: default package */
/* loaded from: classes2.dex */
public interface ya {
    <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t);

    void a();

    void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean a(wc wcVar);

    <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t);

    void b();

    void c();

    void d();

    boolean e();
}
