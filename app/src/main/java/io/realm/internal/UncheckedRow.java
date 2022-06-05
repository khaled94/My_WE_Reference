package io.realm.internal;

/* loaded from: classes2.dex */
public class UncheckedRow implements dlf {
    private static final long a = nativeGetFinalizerPtr();
    private final dle b;
    private final Table c;
    private final long d;

    private static native long nativeGetFinalizerPtr();

    public UncheckedRow(dle dleVar, Table table, long j) {
        this.b = dleVar;
        this.c = table;
        this.d = j;
        dleVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public UncheckedRow(UncheckedRow uncheckedRow) {
        this.b = uncheckedRow.b;
        this.c = uncheckedRow.c;
        this.d = uncheckedRow.d;
    }

    @Override // defpackage.dlf
    public long getNativePtr() {
        return this.d;
    }

    @Override // defpackage.dlf
    public long getNativeFinalizerPtr() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UncheckedRow a(dle dleVar, Table table, long j) {
        return new UncheckedRow(dleVar, table, j);
    }
}
