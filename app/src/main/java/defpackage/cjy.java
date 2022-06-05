package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: cjy  reason: default package */
/* loaded from: classes2.dex */
public final class cjy {
    public static List<clw> a(List<alg> list) {
        if (list == null || list.isEmpty()) {
            return ajw.f();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<alg> it = list.iterator();
        while (it.hasNext()) {
            alg next = it.next();
            clf clfVar = (next == null || TextUtils.isEmpty(next.a)) ? null : new clf(next.b, next.c, next.d, next.a);
            if (clfVar != null) {
                arrayList.add(clfVar);
            }
        }
        return arrayList;
    }
}
