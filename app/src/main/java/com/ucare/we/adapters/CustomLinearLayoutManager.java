package com.ucare.we.adapters;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class CustomLinearLayoutManager extends LinearLayoutManager {
    public boolean a = true;

    public CustomLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.a && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.ucare.we.adapters.CustomLinearLayoutManager.1
            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public final PointF computeScrollVectorForPosition(int i2) {
                return CustomLinearLayoutManager.this.computeScrollVectorForPosition(i2);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 150.0f / displayMetrics.densityDpi;
            }
        };
        linearSmoothScroller.setTargetPosition(i);
        if (i != -1) {
            startSmoothScroll(linearSmoothScroller);
        }
    }
}
