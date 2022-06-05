package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: ajk  reason: default package */
/* loaded from: classes.dex */
public final class ajk extends ajh {
    public static boolean a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
