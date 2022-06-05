package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes2.dex */
public final class NativeObjectReference extends PhantomReference<dlf> {
    private static a f = new a((byte) 0);
    private final long a;
    private final long b;
    private final dle c;
    private NativeObjectReference d;
    private NativeObjectReference e;

    private static native void nativeCleanUp(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        NativeObjectReference a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        final synchronized void a(NativeObjectReference nativeObjectReference) {
            nativeObjectReference.d = null;
            nativeObjectReference.e = this.a;
            if (this.a != null) {
                this.a.d = nativeObjectReference;
            }
            this.a = nativeObjectReference;
        }

        final synchronized void b(NativeObjectReference nativeObjectReference) {
            NativeObjectReference nativeObjectReference2 = nativeObjectReference.e;
            NativeObjectReference nativeObjectReference3 = nativeObjectReference.d;
            nativeObjectReference.e = null;
            nativeObjectReference.d = null;
            if (nativeObjectReference3 != null) {
                nativeObjectReference3.e = nativeObjectReference2;
            } else {
                this.a = nativeObjectReference2;
            }
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.d = nativeObjectReference3;
            }
        }
    }

    public NativeObjectReference(dle dleVar, dlf dlfVar, ReferenceQueue<? super dlf> referenceQueue) {
        super(dlfVar, referenceQueue);
        this.a = dlfVar.getNativePtr();
        this.b = dlfVar.getNativeFinalizerPtr();
        this.c = dleVar;
        f.a(this);
    }

    public final void a() {
        synchronized (this.c) {
            nativeCleanUp(this.b, this.a);
        }
        f.b(this);
    }
}
