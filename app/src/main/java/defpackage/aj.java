package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;

/* renamed from: aj  reason: default package */
/* loaded from: classes.dex */
public final class aj {
    private static final SimpleArrayMap<String, Typeface> a = new SimpleArrayMap<>();

    public static Typeface a(Context context, String str) {
        synchronized (a) {
            if (!a.containsKey(str)) {
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", str));
                    a.put(str, createFromAsset);
                    return createFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            }
            return a.get(str);
        }
    }
}
