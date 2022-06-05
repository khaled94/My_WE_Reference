package defpackage;

import defpackage.dqs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/login/PKCEUtil;", "", "()V", "generateCodeVerifier", "", "isValidCodeVerifier", "", "codeVerifier", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: sc  reason: default package */
/* loaded from: classes2.dex */
public final class sc {
    public static final sc a = new sc();

    private sc() {
    }

    public static final boolean a(String str) {
        String str2 = str;
        if ((str2 == null || str2.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new dsf("^[-._~A-Za-z0-9]+$").a(str2);
    }

    public static final String a() {
        String a2;
        int a3 = drb.a(new dra(43, 128), dqs.b);
        dqw dqwVar = new dqw('a', 'z');
        dqw dqwVar2 = new dqw('A', 'Z');
        dqc.d(dqwVar, "$this$plus");
        dqc.d(dqwVar2, "elements");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        dmq.a((Collection) arrayList2, (Iterable) dqwVar);
        dmq.a((Collection) arrayList2, (Iterable) dqwVar2);
        ArrayList arrayList3 = arrayList;
        dqw dqwVar3 = new dqw('0', '9');
        dqc.d(arrayList3, "$this$plus");
        dqc.d(dqwVar3, "elements");
        ArrayList arrayList4 = new ArrayList(arrayList3);
        dmq.a((Collection) arrayList4, (Iterable) dqwVar3);
        List a4 = dmq.a(dmq.a(dmq.a(dmq.a(arrayList4, '-'), '.'), '_'), '~');
        ArrayList arrayList5 = new ArrayList(a3);
        for (int i = 0; i < a3; i++) {
            List list = a4;
            dqs.a aVar = dqs.b;
            dqc.d(list, "$this$random");
            dqc.d(aVar, "random");
            if (list.isEmpty()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            List list2 = list;
            int b = aVar.b(list.size());
            dqc.d(list2, "$this$elementAt");
            arrayList5.add(Character.valueOf(((Character) list2.get(b)).charValue()));
        }
        a2 = dmq.a(arrayList5, "", "", "", "...");
        return a2;
    }
}
