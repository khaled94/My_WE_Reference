package defpackage;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: are  reason: default package */
/* loaded from: classes.dex */
public final class are {
    public static <T> arf<T> a(arf<T> arfVar) {
        if ((arfVar instanceof arg) || (arfVar instanceof arh)) {
            return arfVar;
        }
        if (arfVar instanceof Serializable) {
            return new arh(arfVar);
        }
        return new arg(arfVar);
    }

    public static <T> arf<T> a(@NullableDecl T t) {
        return new ari(t);
    }
}
