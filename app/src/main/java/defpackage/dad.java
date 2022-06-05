package defpackage;

import dagger.ObjectGraph;

/* renamed from: dad  reason: default package */
/* loaded from: classes2.dex */
public final class dad {
    private static dad b;
    public ObjectGraph a = ObjectGraph.create(new Object[0]);

    private dad() {
    }

    public static dad a() {
        if (b == null) {
            b = new dad();
        }
        return b;
    }
}
