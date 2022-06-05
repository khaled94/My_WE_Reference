package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: dmd  reason: default package */
/* loaded from: classes2.dex */
public final class dmd<T> implements dlv<T>, Serializable {
    private dov<? extends T> a;
    private volatile Object b;
    private final Object c;

    private dmd(dov<? extends T> dovVar) {
        dqc.d(dovVar, "initializer");
        this.a = dovVar;
        this.b = dmf.a;
        this.c = this;
    }

    public /* synthetic */ dmd(dov dovVar, byte b) {
        this(dovVar);
    }

    @Override // defpackage.dlv
    public final T getValue() {
        T t;
        T t2 = (T) this.b;
        if (t2 != dmf.a) {
            return t2;
        }
        synchronized (this.c) {
            t = (T) this.b;
            if (t == dmf.a) {
                dov<? extends T> dovVar = this.a;
                dqc.a(dovVar);
                t = dovVar.invoke();
                this.b = t;
                this.a = null;
            }
        }
        return t;
    }

    private final Object writeReplace() {
        return new dlu(getValue());
    }

    public final String toString() {
        return this.b != dmf.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
