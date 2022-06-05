package io.realm.internal.sync;

import defpackage.dlh;

/* loaded from: classes2.dex */
public class OsSubscription implements dlf {
    private static final long b = nativeGetFinalizerPtr();
    protected final dlh<Object> a;
    private final long c;

    private static native Object nativeGetError(long j);

    private static native long nativeGetFinalizerPtr();

    private static native int nativeGetState(long j);

    /* loaded from: classes2.dex */
    public enum b {
        ERROR(-1),
        CREATING(2),
        PENDING(0),
        COMPLETE(1),
        INVALIDATED(3);
        
        private final int val;

        b(int i) {
            this.val = i;
        }

        public static b fromInternalValue(int i) {
            b[] values;
            for (b bVar : values()) {
                if (bVar.val == i) {
                    return bVar;
                }
            }
            throw new IllegalArgumentException("Unknown value: ".concat(String.valueOf(i)));
        }
    }

    /* loaded from: classes2.dex */
    static class a implements dlh.a<Object> {
        @Override // defpackage.dlh.a
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    @Override // defpackage.dlf
    public long getNativePtr() {
        return this.c;
    }

    @Override // defpackage.dlf
    public long getNativeFinalizerPtr() {
        return b;
    }

    public final b a() {
        return b.fromInternalValue(nativeGetState(this.c));
    }

    public final Throwable b() {
        return (Throwable) nativeGetError(this.c);
    }

    private void notifyChangeListeners() {
        this.a.a((dlh.a<Object>) new a((byte) 0));
    }
}
