package defpackage;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "value", "", "(Ljava/lang/String;IJ)V", "getValue", "()J", "None", "Enabled", "RequireConfirm", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qh  reason: default package */
/* loaded from: classes2.dex */
public enum qh {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    private static final EnumSet<qh> ALL;
    public static final a Companion = new a((byte) 0);
    private final long value;

    public static final EnumSet<qh> parseOptions(long j) {
        return a.a(j);
    }

    qh(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    static {
        EnumSet<qh> allOf = EnumSet.allOf(qh.class);
        dqc.b(allOf, "EnumSet.allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/internal/SmartLoginOption$Companion;", "", "()V", "ALL", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "parseOptions", "bitmask", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static EnumSet<qh> a(long j) {
            EnumSet<qh> noneOf = EnumSet.noneOf(qh.class);
            Iterator it = qh.ALL.iterator();
            while (it.hasNext()) {
                qh qhVar = (qh) it.next();
                if ((qhVar.getValue() & j) != 0) {
                    noneOf.add(qhVar);
                }
            }
            dqc.b(noneOf, "result");
            return noneOf;
        }
    }
}
