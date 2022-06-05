package com.ucare.we.util;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ucare/we/util/FixedAppBarLayoutBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FixedAppBarLayoutBehavior extends AppBarLayout.Behavior {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dqc.d(context, "context");
        dqc.d(attributeSet, "attrs");
        setDragCallback(new AppBarLayout.Behavior.DragCallback() { // from class: com.ucare.we.util.FixedAppBarLayoutBehavior.1
            @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
            public final boolean canDrag(AppBarLayout appBarLayout) {
                dqc.d(appBarLayout, "appBarLayout");
                return false;
            }
        });
    }
}
