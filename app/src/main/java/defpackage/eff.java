package defpackage;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: eff  reason: default package */
/* loaded from: classes2.dex */
public final class eff {
    final Method a;
    private final List<?> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eff(Method method, List<?> list) {
        this.a = method;
        this.b = Collections.unmodifiableList(list);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}
