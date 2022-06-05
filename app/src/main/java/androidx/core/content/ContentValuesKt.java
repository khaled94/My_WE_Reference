package androidx.core.content;

import android.content.ContentValues;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"contentValuesOf", "Landroid/content/ContentValues;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(dma<String, ? extends Object>... dmaVarArr) {
        dqc.d(dmaVarArr, "pairs");
        ContentValues contentValues = new ContentValues(dmaVarArr.length);
        int length = dmaVarArr.length;
        int i = 0;
        while (i < length) {
            dma<String, ? extends Object> dmaVar = dmaVarArr[i];
            i++;
            String str = dmaVar.a;
            B b = dmaVar.b;
            if (b == 0) {
                contentValues.putNull(str);
            } else if (b instanceof String) {
                contentValues.put(str, (String) b);
            } else if (b instanceof Integer) {
                contentValues.put(str, (Integer) b);
            } else if (b instanceof Long) {
                contentValues.put(str, (Long) b);
            } else if (b instanceof Boolean) {
                contentValues.put(str, (Boolean) b);
            } else if (b instanceof Float) {
                contentValues.put(str, (Float) b);
            } else if (b instanceof Double) {
                contentValues.put(str, (Double) b);
            } else if (b instanceof byte[]) {
                contentValues.put(str, (byte[]) b);
            } else if (b instanceof Byte) {
                contentValues.put(str, (Byte) b);
            } else if (!(b instanceof Short)) {
                String canonicalName = b.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + ((Object) canonicalName) + " for key \"" + str + '\"');
            } else {
                contentValues.put(str, (Short) b);
            }
        }
        return contentValues;
    }
}
