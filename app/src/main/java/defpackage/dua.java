package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.dnw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dua  reason: default package */
/* loaded from: classes2.dex */
public final class dua extends dnr implements dwb<String> {
    public static final a a = new a((byte) 0);
    final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dua) && this.b == ((dua) obj).b;
    }

    public final int hashCode() {
        return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.b);
    }

    @Override // defpackage.dwb
    public final /* synthetic */ void a(String str) {
        Thread.currentThread().setName(str);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dua$a */
    /* loaded from: classes2.dex */
    public static final class a implements dnw.c<dua> {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    public dua(long j) {
        super(a);
        this.b = j;
    }

    public final String toString() {
        return "CoroutineId(" + this.b + ')';
    }

    @Override // defpackage.dwb
    public final /* synthetic */ String a(dnw dnwVar) {
        int i;
        String str;
        dub dubVar = (dub) dnwVar.get(dub.a);
        String str2 = "coroutine";
        if (dubVar != null && (str = dubVar.b) != null) {
            str2 = str;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        String str3 = name;
        int d = dsg.d(str3);
        dqc.d(str3, "$this$lastIndexOf");
        dqc.d(" @", TypedValues.Custom.S_STRING);
        if (!(str3 instanceof String)) {
            i = dsq.a(str3, " @", d, 0, false, true);
        } else {
            i = str3.lastIndexOf(" @", d);
        }
        if (i < 0) {
            i = name.length();
        }
        StringBuilder sb = new StringBuilder(str2.length() + i + 10);
        if (name != null) {
            String substring = name.substring(0, i);
            dqc.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(" @");
            sb.append(str2);
            sb.append('#');
            sb.append(this.b);
            dmg dmgVar = dmg.a;
            String sb2 = sb.toString();
            dqc.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
            currentThread.setName(sb2);
            return name;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
