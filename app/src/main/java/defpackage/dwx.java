package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dwm;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.internal.UndeliveredElementException;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0014¢\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dwx  reason: default package */
/* loaded from: classes2.dex */
public final class dwx<E> extends dwk<E> {
    @Override // defpackage.dwk
    protected final boolean a() {
        return true;
    }

    @Override // defpackage.dwk
    protected final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dwm
    public final Object b(E e) {
        dxd dxdVar;
        do {
            Object b = super.b((dwx<E>) e);
            if (b == dwl.b) {
                return dwl.b;
            }
            if (b != dwl.c) {
                if (!(b instanceof dwv)) {
                    throw new IllegalStateException(dqc.a("Invalid offerInternal result ", b).toString());
                }
                return b;
            }
            dyl dylVar = this.b;
            dwm.a aVar = new dwm.a(e);
            while (true) {
                dyn i = dylVar.i();
                if (!(i instanceof dxd)) {
                    if (i.a(aVar, dylVar)) {
                        dxdVar = null;
                        break;
                    }
                } else {
                    dxdVar = (dxd) i;
                    break;
                }
            }
            if (dxdVar == null) {
                return dwl.b;
            }
        } while (!(dxdVar instanceof dwv));
        return dxdVar;
    }

    @Override // defpackage.dwk
    protected final void a(Object obj) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                dxf dxfVar = (dxf) obj;
                if (dxfVar instanceof dwm.a) {
                    dow<E, dmg> dowVar = this.a_;
                    if (dowVar != null) {
                        undeliveredElementException = dyt.a(dowVar, ((dwm.a) dxfVar).a, (UndeliveredElementException) null);
                    }
                } else {
                    dxfVar.c();
                }
            } else if (obj != null) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i = size - 1;
                        dxf dxfVar2 = (dxf) arrayList.get(size);
                        if (dxfVar2 instanceof dwm.a) {
                            dow<E, dmg> dowVar2 = this.a_;
                            undeliveredElementException2 = dowVar2 == null ? null : dyt.a(dowVar2, ((dwm.a) dxfVar2).a, undeliveredElementException2);
                        } else {
                            dxfVar2.c();
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            }
        }
        if (undeliveredElementException == null) {
            return;
        }
        throw undeliveredElementException;
    }
}
