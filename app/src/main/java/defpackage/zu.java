package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: zu  reason: default package */
/* loaded from: classes2.dex */
public abstract class zu<T> implements zv<T> {
    protected final DataHolder a;

    /* JADX INFO: Access modifiers changed from: protected */
    public zu(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.vh
    public final void b() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new zw(this);
    }

    @Override // defpackage.zv
    public final int c() {
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.g;
    }
}
