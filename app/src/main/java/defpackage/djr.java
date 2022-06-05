package defpackage;

import android.content.res.Resources;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"px", "", "getPx", "(I)I", "app_googleProductionRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: djr  reason: default package */
/* loaded from: classes2.dex */
public final class djr {
    public static final int a(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }
}
