package com.ucare.we.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes2.dex */
public class MyAppBarLayout extends AppBarLayout implements AppBarLayout.OnOffsetChangedListener {
    private b a;
    private a b;

    /* loaded from: classes2.dex */
    public interface a {
        void onStateChange(b bVar);
    }

    /* loaded from: classes2.dex */
    public enum b {
        COLLAPSED,
        EXPANDED,
        IDLE
    }

    public MyAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getLayoutParams() instanceof CoordinatorLayout.LayoutParams) || !(getParent() instanceof CoordinatorLayout)) {
            throw new IllegalStateException("MyAppBarLayout must be a direct child of CoordinatorLayout.");
        }
        addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            if (this.b != null && this.a != b.EXPANDED) {
                this.b.onStateChange(b.EXPANDED);
            }
            this.a = b.EXPANDED;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            if (this.b != null && this.a != b.COLLAPSED) {
                this.b.onStateChange(b.COLLAPSED);
            }
            this.a = b.COLLAPSED;
        } else {
            if (this.b != null && this.a != b.IDLE) {
                this.b.onStateChange(b.IDLE);
            }
            this.a = b.IDLE;
        }
    }

    public void setOnStateChangeListener(a aVar) {
        this.b = aVar;
    }
}
