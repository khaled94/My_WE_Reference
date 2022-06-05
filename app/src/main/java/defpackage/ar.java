package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ar  reason: default package */
/* loaded from: classes.dex */
public final class ar {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<ao> d;
    public final boolean e;
    public final long f;

    @Deprecated
    private ar(byte[] bArr, Map<String, String> map) {
        this(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, bArr, map, a(map), false, 0L);
    }

    public ar(int i, byte[] bArr, boolean z, long j, List<ao> list) {
        this(i, bArr, a(list), list, z, j);
    }

    @Deprecated
    public ar(byte[] bArr, Map<String, String> map, byte b) {
        this(bArr, map);
    }

    private ar(int i, byte[] bArr, Map<String, String> map, List<ao> list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        if (list == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(list);
        }
        this.e = z;
        this.f = j;
    }

    private static Map<String, String> a(List<ao> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (ao aoVar : list) {
            treeMap.put(aoVar.a, aoVar.b);
        }
        return treeMap;
    }

    private static List<ao> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new ao(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
