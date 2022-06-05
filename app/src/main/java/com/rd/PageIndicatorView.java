package com.rd;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.core.text.TextUtilsCompat;
import androidx.viewpager.widget.ViewPager;
import com.rd.pageindicatorview.R;
import defpackage.ctz;

/* loaded from: classes.dex */
public class PageIndicatorView extends View implements ViewPager.OnPageChangeListener, ctz.a {
    private ctz a;
    private DataSetObserver b;
    private ViewPager c;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        cum cumVar;
        cvd cvdVar;
        cvb cvbVar;
        int i;
        if (getId() == -1) {
            setId(cvr.a());
        }
        ctz ctzVar = new ctz(this);
        this.a = ctzVar;
        cuw cuwVar = ctzVar.a;
        Context context2 = getContext();
        cux cuxVar = cuwVar.c;
        int i2 = 0;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.PageIndicatorView, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.PageIndicatorView_piv_viewPager, -1);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.PageIndicatorView_piv_autoVisibility, true);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.PageIndicatorView_piv_dynamicCount, false);
        int i3 = obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_count, -1);
        i3 = i3 == -1 ? 3 : i3;
        int i4 = obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_select, 0);
        if (i4 < 0) {
            i4 = 0;
        } else if (i3 > 0 && i4 > i3 - 1) {
            i4 = i;
        }
        cuxVar.a.u = resourceId;
        cuxVar.a.n = z;
        cuxVar.a.o = z2;
        cuxVar.a.q = i3;
        cuxVar.a.r = i4;
        cuxVar.a.s = i4;
        cuxVar.a.t = i4;
        int color = obtainStyledAttributes.getColor(R.styleable.PageIndicatorView_piv_unselectedColor, Color.parseColor("#33ffffff"));
        int color2 = obtainStyledAttributes.getColor(R.styleable.PageIndicatorView_piv_selectedColor, Color.parseColor("#ffffff"));
        cuxVar.a.k = color;
        cuxVar.a.l = color2;
        boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.PageIndicatorView_piv_interactiveAnimation, false);
        int i5 = obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_animationDuration, 350);
        i5 = i5 < 0 ? 0 : i5;
        switch (obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_animationType, cum.NONE.ordinal())) {
            case 0:
                cumVar = cum.NONE;
                break;
            case 1:
                cumVar = cum.COLOR;
                break;
            case 2:
                cumVar = cum.SCALE;
                break;
            case 3:
                cumVar = cum.WORM;
                break;
            case 4:
                cumVar = cum.SLIDE;
                break;
            case 5:
                cumVar = cum.FILL;
                break;
            case 6:
                cumVar = cum.THIN_WORM;
                break;
            case 7:
                cumVar = cum.DROP;
                break;
            case 8:
                cumVar = cum.SWAP;
                break;
            default:
                cumVar = cum.NONE;
                break;
        }
        int i6 = obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_rtl_mode, cvd.Off.ordinal());
        if (i6 == 0) {
            cvdVar = cvd.On;
        } else if (i6 == 1) {
            cvdVar = cvd.Off;
        } else if (i6 == 2) {
            cvdVar = cvd.Auto;
        } else {
            cvdVar = cvd.Auto;
        }
        cuxVar.a.p = i5;
        cuxVar.a.m = z3;
        cuxVar.a.w = cumVar;
        cuxVar.a.x = cvdVar;
        if (obtainStyledAttributes.getInt(R.styleable.PageIndicatorView_piv_orientation, cvb.HORIZONTAL.ordinal()) == 0) {
            cvbVar = cvb.HORIZONTAL;
        } else {
            cvbVar = cvb.VERTICAL;
        }
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.PageIndicatorView_piv_radius, cvq.a(6));
        dimension = dimension < 0 ? 0 : dimension;
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.PageIndicatorView_piv_padding, cvq.a(8));
        dimension2 = dimension2 < 0 ? 0 : dimension2;
        float f = obtainStyledAttributes.getFloat(R.styleable.PageIndicatorView_piv_scaleFactor, 0.7f);
        if (f < 0.3f) {
            f = 0.3f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        int dimension3 = (int) obtainStyledAttributes.getDimension(R.styleable.PageIndicatorView_piv_strokeWidth, cvq.a(1));
        i2 = cuxVar.a.c() == cum.FILL ? dimension3 > dimension ? dimension : dimension3 : i2;
        cuxVar.a.c = dimension;
        cuxVar.a.v = cvbVar;
        cuxVar.a.d = dimension2;
        cuxVar.a.j = f;
        cuxVar.a.i = i2;
        obtainStyledAttributes.recycle();
        cva a = this.a.a.a();
        a.e = getPaddingLeft();
        a.f = getPaddingTop();
        a.g = getPaddingRight();
        a.h = getPaddingBottom();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        View findViewById;
        super.onAttachedToWindow();
        if (!(getContext() instanceof Activity) || (findViewById = ((Activity) getContext()).findViewById(this.a.a.a().u)) == null || !(findViewById instanceof ViewPager)) {
            return;
        }
        setViewPager((ViewPager) findViewById);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        cva a = this.a.a.a();
        cvc cvcVar = new cvc(super.onSaveInstanceState());
        cvcVar.a = a.r;
        cvcVar.b = a.s;
        cvcVar.c = a.t;
        return cvcVar;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof cvc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cva a = this.a.a.a();
        cvc cvcVar = (cvc) parcelable;
        a.r = cvcVar.a;
        a.s = cvcVar.b;
        a.t = cvcVar.c;
        super.onRestoreInstanceState(cvcVar.getSuperState());
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        cva cvaVar = this.a.a.a;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = cvaVar.q;
        int i6 = cvaVar.c;
        int i7 = cvaVar.i;
        int i8 = cvaVar.d;
        int i9 = cvaVar.e;
        int i10 = cvaVar.f;
        int i11 = cvaVar.g;
        int i12 = cvaVar.h;
        int i13 = i6 * 2;
        cvb b = cvaVar.b();
        int i14 = 0;
        if (i5 != 0) {
            i3 = (i13 * i5) + (i7 * 2 * i5) + (i8 * (i5 - 1));
            i4 = i13 + i7;
            if (b != cvb.HORIZONTAL) {
                i3 = i4;
                i4 = i3;
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (cvaVar.c() == cum.DROP) {
            if (b == cvb.HORIZONTAL) {
                i4 *= 2;
            } else {
                i3 *= 2;
            }
        }
        cvb cvbVar = cvb.HORIZONTAL;
        int i15 = i3 + i9 + i11;
        int i16 = i4 + i10 + i12;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i15, size) : i15;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i16, size2) : i16;
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 >= 0) {
            i14 = size2;
        }
        cvaVar.b = size;
        cvaVar.a = i14;
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(i14));
        setMeasuredDimension(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.onDraw(android.graphics.Canvas):void");
    }

    @Override // defpackage.ctz.a
    public final void a() {
        invalidate();
    }

    public void setCount(int i) {
        if (i < 0 || this.a.a.a().q == i) {
            return;
        }
        this.a.a.a().q = i;
        c();
        requestLayout();
    }

    public int getCount() {
        return this.a.a.a().q;
    }

    public void setDynamicCount(boolean z) {
        ViewPager viewPager;
        this.a.a.a().o = z;
        if (!z) {
            b();
        } else if (this.b != null || (viewPager = this.c) == null || viewPager.getAdapter() == null) {
        } else {
            this.b = new DataSetObserver() { // from class: com.rd.PageIndicatorView.1
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    PageIndicatorView.a(PageIndicatorView.this);
                }
            };
            try {
                this.c.getAdapter().registerDataSetObserver(this.b);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.a.a.a().c = cvq.a(i);
        invalidate();
    }

    public void setRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.a.a.a().c = (int) f;
        invalidate();
    }

    public int getRadius() {
        return this.a.a.a().c;
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.a.a.a().d = cvq.a(i);
        invalidate();
    }

    public void setPadding(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.a.a.a().d = (int) f;
        invalidate();
    }

    public int getPadding() {
        return this.a.a.a().d;
    }

    public void setScaleFactor(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.3f) {
            f = 0.3f;
        }
        this.a.a.a().j = f;
    }

    public float getScaleFactor() {
        return this.a.a.a().j;
    }

    public void setStrokeWidth(float f) {
        int i = this.a.a.a().c;
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = i;
            if (f > f2) {
                f = f2;
            }
        }
        this.a.a.a().i = (int) f;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int a = cvq.a(i);
        int i2 = this.a.a.a().c;
        if (a < 0) {
            a = 0;
        } else if (a > i2) {
            a = i2;
        }
        this.a.a.a().i = a;
        invalidate();
    }

    public int getStrokeWidth() {
        return this.a.a.a().i;
    }

    public void setSelectedColor(int i) {
        this.a.a.a().l = i;
        invalidate();
    }

    public int getSelectedColor() {
        return this.a.a.a().l;
    }

    public void setUnselectedColor(int i) {
        this.a.a.a().k = i;
        invalidate();
    }

    public int getUnselectedColor() {
        return this.a.a.a().k;
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.a.a.a().n = z;
        c();
    }

    public void setOrientation(cvb cvbVar) {
        if (cvbVar != null) {
            this.a.a.a().v = cvbVar;
            requestLayout();
        }
    }

    public void setAnimationDuration(long j) {
        this.a.a.a().p = j;
    }

    public long getAnimationDuration() {
        return this.a.a.a().p;
    }

    public void setAnimationType(cum cumVar) {
        this.a.a(null);
        if (cumVar != null) {
            this.a.a.a().w = cumVar;
        } else {
            this.a.a.a().w = cum.NONE;
        }
        invalidate();
    }

    public void setInteractiveAnimation(boolean z) {
        this.a.a.a().m = z;
    }

    public void setRtlMode(cvd cvdVar) {
        cva a = this.a.a.a();
        if (cvdVar == null) {
            a.x = cvd.Off;
        } else {
            a.x = cvdVar;
        }
        if (this.c == null) {
            return;
        }
        int i = a.r;
        if (!d()) {
            ViewPager viewPager = this.c;
            if (viewPager != null) {
                i = viewPager.getCurrentItem();
            }
        } else {
            i = (a.q - 1) - i;
        }
        a.r = i;
        a.s = i;
        a.t = i;
        invalidate();
    }

    public void setSelection(int i) {
        cva a = this.a.a.a();
        if (!a.a() || a.c() == cum.NONE) {
            int i2 = a.r;
            int i3 = a.q - 1;
            if (i < 0) {
                i = 0;
            } else if (i > i3) {
                i = i3;
            }
            if (i2 == i) {
                return;
            }
            a.t = a.r;
            a.r = i;
            cua cuaVar = this.a.b;
            if (cuaVar.a == null) {
                return;
            }
            cuaVar.a.a();
            cub cubVar = cuaVar.a;
            cubVar.b = false;
            cubVar.a = 0.0f;
            cubVar.b();
        }
    }

    public int getSelection() {
        return this.a.a.a().r;
    }

    private void b() {
        ViewPager viewPager;
        if (this.b == null || (viewPager = this.c) == null || viewPager.getAdapter() == null) {
            return;
        }
        try {
            this.c.getAdapter().unregisterDataSetObserver(this.b);
            this.b = null;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void c() {
        if (!this.a.a.a().n) {
            return;
        }
        int i = this.a.a.a().q;
        int visibility = getVisibility();
        if (visibility != 0 && i > 1) {
            setVisibility(0);
        } else if (visibility == 4 || i > 1) {
        } else {
            setVisibility(4);
        }
    }

    private int getViewPagerCount() {
        ViewPager viewPager = this.c;
        if (viewPager != null && viewPager.getAdapter() != null) {
            return this.c.getAdapter().getCount();
        }
        return this.a.a.a().q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.rd.PageIndicatorView$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cvd.values().length];
            a = iArr;
            try {
                iArr[cvd.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cvd.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cvd.Auto.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private boolean d() {
        int i = AnonymousClass2.a[this.a.a.a().d().ordinal()];
        if (i != 1) {
            return i == 3 && TextUtilsCompat.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    private boolean e() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        cva a = this.a.a.a();
        int i3 = 0;
        if (e() && a.a() && a.c() != cum.NONE) {
            boolean d = d();
            int i4 = a.q;
            int i5 = a.r;
            if (d) {
                i = (i4 - 1) - i;
            }
            if (i < 0) {
                i = 0;
            } else {
                int i6 = i4 - 1;
                if (i > i6) {
                    i = i6;
                }
            }
            boolean z = i > i5;
            boolean z2 = !d ? i + 1 < i5 : i + (-1) < i5;
            if (z || z2) {
                a.r = i;
                i5 = i;
            }
            float f2 = 0.0f;
            if (i5 == i && f != 0.0f) {
                i = d ? i - 1 : i + 1;
            } else {
                f = 1.0f - f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            Pair pair = new Pair(Integer.valueOf(i), Float.valueOf(f));
            int intValue = ((Integer) pair.first).intValue();
            float floatValue = ((Float) pair.second).floatValue();
            cva a2 = this.a.a.a();
            if (!a2.a()) {
                return;
            }
            int i7 = a2.q;
            if (i7 > 0 && intValue >= 0 && intValue <= i7 - 1) {
                i3 = intValue;
            }
            if (floatValue >= 0.0f) {
                f2 = floatValue > 1.0f ? 1.0f : floatValue;
            }
            if (f2 == 1.0f) {
                a2.t = a2.r;
                a2.r = i3;
            }
            a2.s = i3;
            cua cuaVar = this.a.b;
            if (cuaVar.a == null) {
                return;
            }
            cub cubVar = cuaVar.a;
            cubVar.b = true;
            cubVar.a = f2;
            cubVar.b();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        cva a = this.a.a.a();
        int i2 = a.q;
        if (e() && (!a.a() || a.c() == cum.NONE)) {
            if (d()) {
                i = (i2 - 1) - i;
            }
            setSelection(i);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.c;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this);
            this.c = null;
        }
        if (viewPager == null) {
            return;
        }
        this.c = viewPager;
        viewPager.addOnPageChangeListener(this);
        this.a.a.a().u = this.c.getId();
        setDynamicCount(this.a.a.a().o);
        int viewPagerCount = getViewPagerCount();
        if (d()) {
            this.a.a.a().r = (viewPagerCount - 1) - this.c.getCurrentItem();
        }
        setCount(viewPagerCount);
    }

    static /* synthetic */ void a(PageIndicatorView pageIndicatorView) {
        ViewPager viewPager = pageIndicatorView.c;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        int count = pageIndicatorView.c.getAdapter().getCount();
        int currentItem = pageIndicatorView.c.getCurrentItem();
        pageIndicatorView.a.a.a().r = currentItem;
        pageIndicatorView.a.a.a().s = currentItem;
        pageIndicatorView.a.a.a().t = currentItem;
        cua cuaVar = pageIndicatorView.a.b;
        if (cuaVar.a != null) {
            cuaVar.a.a();
        }
        pageIndicatorView.setCount(count);
    }
}
