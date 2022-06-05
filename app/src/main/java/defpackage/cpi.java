package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: cpi  reason: default package */
/* loaded from: classes2.dex */
public final class cpi implements cpn {
    private final String a;
    private final cpk b;

    private cpi(Set<cpl> set, cpk cpkVar) {
        this.a = a(set);
        this.b = cpkVar;
    }

    @Override // defpackage.cpn
    public final String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + a(this.b.a());
    }

    private static String a(Set<cpl> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<cpl> it = set.iterator();
        while (it.hasNext()) {
            cpl next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static clz<cpn> b() {
        return clz.a(cpn.class).a(new cml(cpl.class, 2)).a(cpj.a()).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ cpn a(cmc cmcVar) {
        return new cpi(cmcVar.b(cpl.class), cpk.b());
    }
}
