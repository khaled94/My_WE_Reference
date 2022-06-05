package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: br  reason: default package */
/* loaded from: classes2.dex */
public final class br {
    private final Map<Class<?>, Object> a;

    /* renamed from: br$a */
    /* loaded from: classes2.dex */
    static final class a {
        final Map<Class<?>, Object> a = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public br(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }

    public final boolean a(Class<? extends Object> cls) {
        return this.a.containsKey(cls);
    }
}
