package com.santalu.autoviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class AutoViewPager extends ViewPager {
    private static final String a = AutoViewPager.class.getSimpleName();
    private float c;
    private boolean d;
    private boolean e;
    private int b = 10000;
    private final Runnable f = new Runnable() { // from class: com.santalu.autoviewpager.AutoViewPager.1
        @Override // java.lang.Runnable
        public final void run() {
            if (!AutoViewPager.this.isShown()) {
                return;
            }
            if (AutoViewPager.this.getCurrentItem() == AutoViewPager.this.getAdapter().getCount() - 1) {
                AutoViewPager.this.setCurrentItem(0);
            } else {
                AutoViewPager autoViewPager = AutoViewPager.this;
                autoViewPager.setCurrentItem(autoViewPager.getCurrentItem() + 1);
            }
            AutoViewPager autoViewPager2 = AutoViewPager.this;
            autoViewPager2.postDelayed(autoViewPager2.f, AutoViewPager.this.b);
        }
    };

    public AutoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AutoViewPager);
        try {
            setAutoScrollEnabled(obtainStyledAttributes.getBoolean(R.styleable.AutoViewPager_avp_autoScroll, false));
            setIndeterminate(obtainStyledAttributes.getBoolean(R.styleable.AutoViewPager_avp_indeterminate, false));
            setDuration(obtainStyledAttributes.getInteger(R.styleable.AutoViewPager_avp_duration, 10000));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setIndeterminate(boolean z) {
        this.e = z;
    }

    public void setAutoScrollEnabled(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        removeCallbacks(this.f);
        if (!z) {
            return;
        }
        postDelayed(this.f, this.b);
    }

    public void setDuration(int i) {
        this.b = i;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getActionMasked() == 0) {
                this.c = motionEvent.getX();
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.e) {
                if (getCurrentItem() != 0 && getCurrentItem() != getAdapter().getCount() - 1) {
                    this.c = 0.0f;
                }
                int action = motionEvent.getAction();
                float x = motionEvent.getX();
                if ((action & 255) == 1 && getCurrentItem() == getAdapter().getCount() - 1 && x < this.c) {
                    post(new Runnable() { // from class: com.santalu.autoviewpager.AutoViewPager.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AutoViewPager.this.setCurrentItem(0);
                        }
                    });
                }
            }
            return super.onTouchEvent(motionEvent);
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return false;
        }
    }
}
