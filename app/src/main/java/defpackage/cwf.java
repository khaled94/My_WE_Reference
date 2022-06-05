package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: cwf  reason: default package */
/* loaded from: classes2.dex */
public final class cwf extends DataBinderMapper {
    private static final SparseIntArray a = new SparseIntArray(0);

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i) {
        return a.a.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new DataBinderMapperImpl());
        return arrayList;
    }

    /* renamed from: cwf$a */
    /* loaded from: classes2.dex */
    static class a {
        static final SparseArray<String> a;

        private a() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: cwf$b */
    /* loaded from: classes2.dex */
    static class b {
        static final HashMap<String, Integer> a = new HashMap<>(0);

        private b() {
        }
    }
}
