package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
public final class ag {
    private static ag w;
    public boolean a = false;
    public int b = 0;
    public int c = 0;
    public ColorStateList d = null;
    public ColorStateList e = null;
    public ColorStateList f = null;
    public int g = 0;
    public int h = 0;
    public Drawable i = null;
    public int j = 0;
    public int k = 0;
    public ColorStateList l = null;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public v r = v.START;
    public v s = v.START;
    public v t = v.END;
    public v u = v.START;
    public v v = v.START;

    public static ag a(boolean z) {
        if (w == null && z) {
            w = new ag();
        }
        return w;
    }
}
