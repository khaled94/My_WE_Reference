package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bxy  reason: default package */
/* loaded from: classes2.dex */
public final class bxy {
    private static final CopyOnWriteArrayList<bxx> a = new CopyOnWriteArrayList<>();

    public static bxx a(String str) throws GeneralSecurityException {
        Iterator<bxx> it = a.iterator();
        while (it.hasNext()) {
            bxx next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
