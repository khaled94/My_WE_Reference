package com.nex3z.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlowLayout extends ViewGroup {
    private static final String a = FlowLayout.class.getSimpleName();
    private boolean b;
    private int c;
    private int d;
    private int e;
    private float f;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private float g = 0.0f;
    private List<Float> m = new ArrayList();
    private List<Integer> n = new ArrayList();
    private List<Integer> o = new ArrayList();
    private List<Integer> p = new ArrayList();

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.c = 0;
        this.d = 0;
        this.e = -65538;
        this.f = 0.0f;
        this.h = false;
        this.i = Integer.MAX_VALUE;
        this.j = -1;
        this.k = SupportMenu.CATEGORY_MASK;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        try {
            this.b = obtainStyledAttributes.getBoolean(R.styleable.FlowLayout_flFlow, true);
            try {
                this.c = obtainStyledAttributes.getInt(R.styleable.FlowLayout_flChildSpacing, 0);
            } catch (NumberFormatException unused) {
                this.c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_flChildSpacing, (int) a());
            }
            try {
                this.d = obtainStyledAttributes.getInt(R.styleable.FlowLayout_flMinChildSpacing, 0);
            } catch (NumberFormatException unused2) {
                this.d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_flMinChildSpacing, (int) a());
            }
            try {
                this.e = obtainStyledAttributes.getInt(R.styleable.FlowLayout_flChildSpacingForLastRow, -65538);
            } catch (NumberFormatException unused3) {
                this.e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_flChildSpacingForLastRow, (int) a());
            }
            try {
                this.f = obtainStyledAttributes.getInt(R.styleable.FlowLayout_flRowSpacing, 0);
            } catch (NumberFormatException unused4) {
                this.f = obtainStyledAttributes.getDimension(R.styleable.FlowLayout_flRowSpacing, a());
            }
            this.i = obtainStyledAttributes.getInt(R.styleable.FlowLayout_flMaxRows, Integer.MAX_VALUE);
            this.h = obtainStyledAttributes.getBoolean(R.styleable.FlowLayout_flRtl, false);
            this.j = obtainStyledAttributes.getInt(R.styleable.FlowLayout_android_gravity, -1);
            this.k = obtainStyledAttributes.getInt(R.styleable.FlowLayout_flRowVerticalGravity, SupportMenu.CATEGORY_MASK);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        View view;
        int i18;
        int i19;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.p.clear();
        int childCount = getChildCount();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        boolean z = mode != 0 && this.b;
        int i20 = (this.c == -65536 && mode == 0) ? 0 : this.c;
        float f2 = i20 == -65536 ? this.d : i20;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i23 < childCount) {
            float f3 = f2;
            View childAt = getChildAt(i23);
            int i28 = i21;
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i8 = childCount;
                    i16 = i28;
                    i10 = size2;
                    i17 = i22;
                    i7 = i23;
                    i6 = mode2;
                    f = f3;
                    i11 = size;
                    view = childAt;
                    i15 = i20;
                    i9 = mode;
                    measureChildWithMargins(childAt, i, 0, i2, i26);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i19 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i18 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i7 = i23;
                    i15 = i20;
                    i9 = mode;
                    i6 = mode2;
                    i8 = childCount;
                    f = f3;
                    i16 = i28;
                    i11 = size;
                    i10 = size2;
                    i17 = i22;
                    view = childAt;
                    measureChild(view, i, i2);
                    i19 = 0;
                    i18 = 0;
                }
                i14 = i19 + view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight() + i18;
                if (z && i25 + i14 > paddingLeft) {
                    i13 = i15;
                    this.m.add(Float.valueOf(b(i13, paddingLeft, i17, i16)));
                    this.p.add(Integer.valueOf(i16));
                    this.n.add(Integer.valueOf(i27));
                    int i29 = (int) f;
                    this.o.add(Integer.valueOf(i25 - i29));
                    if (this.m.size() <= this.i) {
                        i26 += i27;
                    }
                    i24 = Math.max(i24, i25);
                    i25 = i14 + i29;
                    i27 = measuredHeight;
                    i12 = 1;
                } else {
                    i13 = i15;
                    i12 = i16 + 1;
                    i25 = (int) (i25 + i14 + f);
                    i14 += i17;
                    i27 = Math.max(i27, measuredHeight);
                }
            } else {
                i7 = i23;
                i13 = i20;
                i9 = mode;
                i6 = mode2;
                i8 = childCount;
                f = f3;
                i11 = size;
                i10 = size2;
                i14 = i22;
                i12 = i28;
            }
            i22 = i14;
            i23 = i7 + 1;
            i20 = i13;
            i21 = i12;
            f2 = f;
            size = i11;
            size2 = i10;
            mode = i9;
            childCount = i8;
            mode2 = i6;
        }
        int i30 = i21;
        int i31 = i20;
        int i32 = size;
        int i33 = mode;
        int i34 = size2;
        int i35 = mode2;
        int i36 = i22;
        float f4 = f2;
        int i37 = i27;
        int i38 = this.e;
        if (i38 == -65537) {
            if (this.m.size() > 0) {
                List<Float> list = this.m;
                list.add(list.get(list.size() - 1));
            } else {
                this.m.add(Float.valueOf(b(i31, paddingLeft, i36, i30)));
            }
        } else if (i38 != -65538) {
            this.m.add(Float.valueOf(b(i38, paddingLeft, i36, i30)));
        } else {
            this.m.add(Float.valueOf(b(i31, paddingLeft, i36, i30)));
        }
        this.p.add(Integer.valueOf(i30));
        this.n.add(Integer.valueOf(i37));
        this.o.add(Integer.valueOf(i25 - ((int) f4)));
        if (this.m.size() <= this.i) {
            i26 += i37;
        }
        int max = Math.max(i24, i25);
        if (i31 == -65536) {
            i4 = i32;
            i3 = i4;
        } else if (i33 == 0) {
            i4 = max + getPaddingLeft() + getPaddingRight();
            i3 = i32;
        } else {
            i3 = i32;
            i4 = Math.min(max + getPaddingLeft() + getPaddingRight(), i3);
        }
        int paddingTop = i26 + getPaddingTop() + getPaddingBottom();
        int min = Math.min(this.m.size(), this.i);
        float f5 = (this.f == -65536.0f && i35 == 0) ? 0.0f : this.f;
        if (f5 == -65536.0f) {
            if (min > 1) {
                this.g = (i34 - paddingTop) / (min - 1);
            } else {
                this.g = 0.0f;
            }
            paddingTop = i34;
            i5 = paddingTop;
        } else {
            this.g = f5;
            if (min > 1) {
                paddingTop = (int) (paddingTop + (f5 * (min - 1)));
                if (i35 != 0) {
                    i5 = i34;
                    paddingTop = Math.min(paddingTop, i5);
                }
            }
            i5 = i34;
        }
        this.l = paddingTop;
        setMeasuredDimension(i33 == 1073741824 ? i3 : i4, i35 == 1073741824 ? i5 : paddingTop);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nex3z.flowlayout.FlowLayout.onLayout(boolean, int, int, int, int):void");
    }

    private int a(int i, int i2, int i3, int i4) {
        if (this.c == -65536 || i4 >= this.o.size() || i4 >= this.p.size() || this.p.get(i4).intValue() <= 0) {
            return 0;
        }
        if (i == 1) {
            return ((i2 - i3) - this.o.get(i4).intValue()) / 2;
        }
        if (i == 5) {
            return (i2 - i3) - this.o.get(i4).intValue();
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void setFlow(boolean z) {
        this.b = z;
        requestLayout();
    }

    public int getChildSpacing() {
        return this.c;
    }

    public void setChildSpacing(int i) {
        this.c = i;
        requestLayout();
    }

    public int getChildSpacingForLastRow() {
        return this.e;
    }

    public void setChildSpacingForLastRow(int i) {
        this.e = i;
        requestLayout();
    }

    public float getRowSpacing() {
        return this.f;
    }

    public void setRowSpacing(float f) {
        this.f = f;
        requestLayout();
    }

    public int getMaxRows() {
        return this.i;
    }

    public void setMaxRows(int i) {
        this.i = i;
        requestLayout();
    }

    public void setGravity(int i) {
        if (this.j != i) {
            this.j = i;
            requestLayout();
        }
    }

    public void setRowVerticalGravity(int i) {
        if (this.k != i) {
            this.k = i;
            requestLayout();
        }
    }

    public void setRtl(boolean z) {
        this.h = z;
        requestLayout();
    }

    public int getMinChildSpacing() {
        return this.d;
    }

    public void setMinChildSpacing(int i) {
        this.d = i;
        requestLayout();
    }

    public int getRowsCount() {
        return this.p.size();
    }

    private static float b(int i, int i2, int i3, int i4) {
        if (i == -65536) {
            if (i4 <= 1) {
                return 0.0f;
            }
            return (i2 - i3) / (i4 - 1);
        }
        return i;
    }

    private float a() {
        return TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics());
    }
}
