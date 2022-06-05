package androidx.core.os;

import android.os.Build;
import android.os.PersistableBundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"persistableBundleOf", "Landroid/os/PersistableBundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PersistableBundleKt {
    public static final PersistableBundle persistableBundleOf(dma<String, ? extends Object>... dmaVarArr) {
        dqc.d(dmaVarArr, "pairs");
        PersistableBundle persistableBundle = new PersistableBundle(dmaVarArr.length);
        int length = dmaVarArr.length;
        int i = 0;
        while (i < length) {
            dma<String, ? extends Object> dmaVar = dmaVarArr[i];
            i++;
            String str = dmaVar.a;
            B b = dmaVar.b;
            if (b == 0) {
                persistableBundle.putString(str, null);
            } else if (b instanceof Boolean) {
                if (Build.VERSION.SDK_INT >= 22) {
                    persistableBundle.putBoolean(str, ((Boolean) b).booleanValue());
                } else {
                    throw new IllegalArgumentException("Illegal value type boolean for key \"" + str + '\"');
                }
            } else if (b instanceof Double) {
                persistableBundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Integer) {
                persistableBundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                persistableBundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof String) {
                persistableBundle.putString(str, (String) b);
            } else if (b instanceof boolean[]) {
                if (Build.VERSION.SDK_INT >= 22) {
                    persistableBundle.putBooleanArray(str, (boolean[]) b);
                } else {
                    throw new IllegalArgumentException("Illegal value type boolean[] for key \"" + str + '\"');
                }
            } else if (b instanceof double[]) {
                persistableBundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof int[]) {
                persistableBundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                persistableBundle.putLongArray(str, (long[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                dqc.a(componentType);
                if (!String.class.isAssignableFrom(componentType)) {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + ((Object) canonicalName) + " for key \"" + str + '\"');
                } else if (b == 0) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                } else {
                    persistableBundle.putStringArray(str, (String[]) b);
                }
            } else {
                String canonicalName2 = b.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + ((Object) canonicalName2) + " for key \"" + str + '\"');
            }
        }
        return persistableBundle;
    }
}
