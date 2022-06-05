package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a9\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002\u001a1\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a+\u0010\u001f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a,\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030#H\u0080\b¢\u0006\u0002\u0010$\u001a!\u0010%\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\u001a \u0010&\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0080\b¢\u0006\u0002\u0010\"\u001a\u001f\u0010'\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a1\u0010(\u001a\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190)\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020,*\u00060\u0007j\u0002`\b2\n\u0010-\u001a\u00060\u0007j\u0002`\bH\u0002\u001a#\u0010.\u001a\u00020/*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u00100\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0017*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u00103\u001a\u00020,*\u00060\u0007j\u0002`\bH\u0000\u001a\u001b\u00104\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00105\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00106\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "message", "createFinalException", ExifInterface.LONGITUDE_EAST, "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "tryCopyAndVerify", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: dyx  reason: default package */
/* loaded from: classes2.dex */
public final class dyx {
    private static final String a;
    private static final String b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str;
        String str2;
        String str3 = "dyx";
        String str4 = "doc";
        try {
            dmb.a aVar = dmb.a;
            str = dmb.d(Class.forName(str4).getCanonicalName());
        } catch (Throwable th) {
            dmb.a aVar2 = dmb.a;
            str = dmb.d(dmc.a(th));
        }
        if (dmb.c(str) == null) {
            str4 = str;
        }
        a = str4;
        try {
            dmb.a aVar3 = dmb.a;
            str2 = dmb.d(Class.forName(str3).getCanonicalName());
        } catch (Throwable th2) {
            dmb.a aVar4 = dmb.a;
            str2 = dmb.d(dmc.a(th2));
        }
        if (dmb.c(str2) == null) {
            str3 = str2;
        }
        b = str3;
    }

    public static final <E extends Throwable> E a(E e) {
        E e2;
        StackTraceElement stackTraceElement;
        if (dug.c() && (e2 = (E) c(e)) != null) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            int a2 = a(stackTrace, b);
            int i = a2 + 1;
            int a3 = a(stackTrace, a);
            int i2 = (length - a2) - (a3 == -1 ? 0 : length - a3);
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 == 0) {
                    stackTraceElement = a("Coroutine boundary");
                } else {
                    stackTraceElement = stackTrace[(i + i3) - 1];
                }
                stackTraceElementArr[i3] = stackTraceElement;
            }
            e2.setStackTrace(stackTraceElementArr);
            return e2;
        }
        return e;
    }

    private static final <E extends Throwable> E c(E e) {
        E e2 = (E) dyh.a(e);
        if (e2 == null) {
            return null;
        }
        if (!(e instanceof dtv) && !dqc.a((Object) e2.getMessage(), (Object) e.getMessage())) {
            return null;
        }
        return e2;
    }

    private static final <E extends Throwable> E a(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int a2 = a(stackTrace, a);
        int i = 0;
        if (a2 != -1) {
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + a2];
            if (a2 > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    stackTraceElementArr[i2] = stackTrace[i2];
                    if (i3 >= a2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            Iterator<StackTraceElement> it = arrayDeque.iterator();
            while (it.hasNext()) {
                int i4 = i + 1;
                stackTraceElementArr[i + a2] = it.next();
                i = i4;
            }
            e2.setStackTrace(stackTraceElementArr);
            return e2;
        }
        Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
        if (array != null) {
            e2.setStackTrace((StackTraceElement[]) array);
            return e2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final <E extends Throwable> E b(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && dqc.a(e2.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (a(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return e2;
            }
        }
        return e;
    }

    private static StackTraceElement a(String str) {
        return new StackTraceElement(dqc.a("\b\b\b(", (Object) str), "\b", "\b", -1);
    }

    private static boolean a(StackTraceElement stackTraceElement) {
        return dsg.c(stackTraceElement.getClassName(), "\b\b\b");
    }

    private static final void a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (a(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 <= length2) {
            while (true) {
                int i3 = length2 - 1;
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                StackTraceElement last = arrayDeque.getLast();
                if (stackTraceElement.getLineNumber() == last.getLineNumber() && dqc.a((Object) stackTraceElement.getMethodName(), (Object) last.getMethodName()) && dqc.a((Object) stackTraceElement.getFileName(), (Object) last.getFileName()) && dqc.a((Object) stackTraceElement.getClassName(), (Object) last.getClassName())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 == i2) {
                    return;
                }
                length2 = i3;
            }
        }
    }

    private static final int a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (dqc.a((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final /* synthetic */ Throwable a(Throwable th, dof dofVar) {
        dma dmaVar;
        boolean z;
        Throwable cause = th.getCause();
        if (cause != null && dqc.a(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (a(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                dmaVar = dme.a(cause, stackTrace);
            } else {
                dmaVar = dme.a(th, new StackTraceElement[0]);
            }
        } else {
            dmaVar = dme.a(th, new StackTraceElement[0]);
        }
        Throwable th2 = (Throwable) dmaVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) dmaVar.b;
        Throwable c = c(th2);
        if (c == null) {
            return th;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElement = dofVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(dofVar instanceof dof)) {
                dofVar = null;
            }
            dofVar = dofVar == null ? null : dofVar.getCallerFrame();
            if (dofVar == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = dofVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            a(stackTraceElementArr, arrayDeque);
        }
        return a(th2, c, arrayDeque);
    }
}
