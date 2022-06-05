package androidx.core.view;

import android.view.ViewParent;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class ViewKt$ancestors$1 extends dqa implements dow<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final ViewParent invoke(ViewParent viewParent) {
        dqc.d(viewParent, "p0");
        return viewParent.getParent();
    }
}
