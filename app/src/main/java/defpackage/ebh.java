package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ebh  reason: default package */
/* loaded from: classes2.dex */
public final class ebh {
    private static final Comparator<String> a = new Comparator<String>() { // from class: ebh.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3 == str4) {
                return 0;
            }
            if (str3 == null) {
                return -1;
            }
            if (str4 != null) {
                return String.CASE_INSENSITIVE_ORDER.compare(str3, str4);
            }
            return 1;
        }
    };

    private ebh() {
    }

    public static Map<String, List<String>> a(ear earVar, String str) {
        TreeMap treeMap = new TreeMap(a);
        int a2 = earVar.a();
        for (int i = 0; i < a2; i++) {
            String a3 = earVar.a(i);
            String b = earVar.b(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(a3);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(b);
            treeMap.put(a3, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }
}
