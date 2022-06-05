package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: cvq  reason: default package */
/* loaded from: classes2.dex */
public final class cvq {
    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }
}
