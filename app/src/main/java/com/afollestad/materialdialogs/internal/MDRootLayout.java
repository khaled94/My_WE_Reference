package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;

/* loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {
    public boolean a;
    private int c;
    private View d;
    private View e;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int p;
    private ViewTreeObserver.OnScrollChangedListener r;
    private ViewTreeObserver.OnScrollChangedListener s;
    private int t;
    private final MDButton[] b = new MDButton[3];
    private boolean f = false;
    private boolean g = false;
    private x h = x.ADAPTIVE;
    private boolean i = false;
    private boolean j = true;
    private v o = v.START;
    private Paint q = new Paint();

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MDRootLayout, 0, 0);
        this.k = obtainStyledAttributes.getBoolean(R.styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        obtainStyledAttributes.recycle();
        this.l = resources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
        this.m = resources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
        this.p = resources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
        this.n = resources.getDimensionPixelSize(R.dimen.md_button_height);
        this.t = resources.getDimensionPixelSize(R.dimen.md_divider_height);
        this.q.setColor(ah.a(context, R.attr.md_divider_color, 0));
        setWillNotDraw(false);
    }

    private static boolean a(View view) {
        boolean z = true;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!z2 || !(view instanceof MDButton)) {
            return z2;
        }
        if (((MDButton) view).getText().toString().trim().length() <= 0) {
            z = false;
        }
        return z;
    }

    private static boolean a(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    private static boolean a(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    private static boolean a(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    private static View a(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    private static View b(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    public void setMaxHeight(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R.id.md_titleFrame) {
                this.d = childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultNeutral) {
                this.b[0] = (MDButton) childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultNegative) {
                this.b[1] = (MDButton) childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultPositive) {
                this.b[2] = (MDButton) childAt;
            } else {
                this.e = childAt;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.e;
        if (view != null) {
            if (this.f) {
                int top = view.getTop();
                canvas.drawRect(0.0f, top - this.t, getMeasuredWidth(), top, this.q);
            }
            if (!this.g) {
                return;
            }
            int bottom = this.e.getBottom();
            canvas.drawRect(0.0f, bottom, getMeasuredWidth(), bottom + this.t, this.q);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        MDButton[] mDButtonArr;
        if (a(this.d)) {
            int measuredHeight = this.d.getMeasuredHeight() + i2;
            this.d.layout(i, i2, i3, measuredHeight);
            i2 = measuredHeight;
        } else if (!this.a && this.j) {
            i2 += this.l;
        }
        if (a(this.e)) {
            View view = this.e;
            view.layout(i, i2, i3, view.getMeasuredHeight() + i2);
        }
        if (this.i) {
            int i14 = i4 - this.m;
            for (MDButton mDButton : this.b) {
                if (a(mDButton)) {
                    mDButton.layout(i, i14 - mDButton.getMeasuredHeight(), i3, i14);
                    i14 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.j) {
                i4 -= this.m;
            }
            int i15 = i4 - this.n;
            int i16 = this.p;
            if (a(this.b[2])) {
                if (this.o == v.END) {
                    i13 = i + i16;
                    i12 = this.b[2].getMeasuredWidth() + i13;
                    i5 = -1;
                } else {
                    int i17 = i3 - i16;
                    i13 = i17 - this.b[2].getMeasuredWidth();
                    i12 = i17;
                    i5 = i13;
                }
                this.b[2].layout(i13, i15, i12, i4);
                i16 += this.b[2].getMeasuredWidth();
            } else {
                i5 = -1;
            }
            if (a(this.b[1])) {
                if (this.o == v.END) {
                    i11 = i16 + i;
                    i10 = this.b[1].getMeasuredWidth() + i11;
                } else if (this.o == v.START) {
                    i10 = i3 - i16;
                    i11 = i10 - this.b[1].getMeasuredWidth();
                } else {
                    i11 = this.p + i;
                    i10 = this.b[1].getMeasuredWidth() + i11;
                    i6 = i10;
                    this.b[1].layout(i11, i15, i10, i4);
                }
                i6 = -1;
                this.b[1].layout(i11, i15, i10, i4);
            } else {
                i6 = -1;
            }
            if (a(this.b[0])) {
                if (this.o == v.END) {
                    i7 = i3 - this.p;
                    i8 = i7 - this.b[0].getMeasuredWidth();
                } else if (this.o == v.START) {
                    i8 = i + this.p;
                    i7 = this.b[0].getMeasuredWidth() + i8;
                } else {
                    if (i6 != -1 || i5 == -1) {
                        if (i5 == -1 && i6 != -1) {
                            i9 = this.b[0].getMeasuredWidth();
                        } else if (i5 == -1) {
                            i6 = ((i3 - i) / 2) - (this.b[0].getMeasuredWidth() / 2);
                            i9 = this.b[0].getMeasuredWidth();
                        }
                        i5 = i6 + i9;
                    } else {
                        i6 = i5 - this.b[0].getMeasuredWidth();
                    }
                    i7 = i5;
                    i8 = i6;
                }
                this.b[0].layout(i8, i15, i7, i4);
            }
        }
        a(this.e, true, true);
    }

    public void setStackingBehavior(x xVar) {
        this.h = xVar;
        invalidate();
    }

    public void setDividerColor(int i) {
        this.q.setColor(i);
        invalidate();
    }

    public void setButtonGravity(v vVar) {
        this.o = vVar;
        if (Build.VERSION.SDK_INT < 17 || getResources().getConfiguration().getLayoutDirection() != 1) {
            return;
        }
        int i = AnonymousClass4.a[this.o.ordinal()];
        if (i == 1) {
            this.o = v.END;
        } else if (i != 2) {
        } else {
            this.o = v.START;
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v.values().length];
            a = iArr;
            try {
                iArr[v.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void setButtonStackedGravity(v vVar) {
        MDButton[] mDButtonArr;
        for (MDButton mDButton : this.b) {
            if (mDButton != null) {
                mDButton.setStackedGravity(vVar);
            }
        }
    }

    private void a(final View view, final boolean z, final boolean z2) {
        while (view != null) {
            if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (a(scrollView)) {
                    a((ViewGroup) scrollView, z, z2);
                    return;
                }
                if (z) {
                    this.f = false;
                }
                if (!z2) {
                    return;
                }
                this.g = false;
                return;
            } else if (view instanceof AdapterView) {
                AdapterView adapterView = (AdapterView) view;
                if (a(adapterView)) {
                    a((ViewGroup) adapterView, z, z2);
                    return;
                }
                if (z) {
                    this.f = false;
                }
                if (!z2) {
                    return;
                }
                this.g = false;
                return;
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.afollestad.materialdialogs.internal.MDRootLayout.1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        if (view.getMeasuredHeight() != 0) {
                            if (MDRootLayout.a((WebView) view)) {
                                MDRootLayout.this.a((ViewGroup) view, z, z2);
                            } else {
                                if (z) {
                                    MDRootLayout.this.f = false;
                                }
                                if (z2) {
                                    MDRootLayout.this.g = false;
                                }
                            }
                            view.getViewTreeObserver().removeOnPreDrawListener(this);
                            return true;
                        }
                        return true;
                    }
                });
                return;
            } else if (view instanceof RecyclerView) {
                boolean a = a((RecyclerView) view);
                if (z) {
                    this.f = a;
                }
                if (z2) {
                    this.g = a;
                }
                if (!a) {
                    return;
                }
                a((ViewGroup) view, z, z2);
                return;
            } else if (!(view instanceof ViewGroup)) {
                return;
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                View b = b(viewGroup);
                a(b, z, z2);
                view = a(viewGroup);
                if (view == b) {
                    return;
                }
                z2 = true;
                z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ViewGroup viewGroup, final boolean z, final boolean z2) {
        if ((z2 || this.r != null) && (!z2 || this.s != null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.afollestad.materialdialogs.internal.MDRootLayout.2
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    MDButton[] mDButtonArr = MDRootLayout.this.b;
                    int length = mDButtonArr.length;
                    boolean z3 = false;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            MDButton mDButton = mDButtonArr[i3];
                            if (mDButton != null && mDButton.getVisibility() != 8) {
                                z3 = true;
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                    MDRootLayout.a(MDRootLayout.this, viewGroup, z, z2, z3);
                    MDRootLayout.this.invalidate();
                }
            };
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(onScrollListener);
            onScrollListener.onScrolled(recyclerView, 0, 0);
            return;
        }
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.afollestad.materialdialogs.internal.MDRootLayout.3
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                MDButton[] mDButtonArr = MDRootLayout.this.b;
                int length = mDButtonArr.length;
                boolean z3 = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        MDButton mDButton = mDButtonArr[i];
                        if (mDButton != null && mDButton.getVisibility() != 8) {
                            z3 = true;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 instanceof WebView) {
                    MDRootLayout.a(MDRootLayout.this, (WebView) viewGroup2, z, z2, z3);
                } else {
                    MDRootLayout.a(MDRootLayout.this, viewGroup2, z, z2, z3);
                }
                MDRootLayout.this.invalidate();
            }
        };
        if (!z2) {
            this.r = onScrollChangedListener;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.r);
        } else {
            this.s = onScrollChangedListener;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.s);
        }
        onScrollChangedListener.onScrollChanged();
    }

    static /* synthetic */ boolean a(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    static /* synthetic */ void a(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z && viewGroup.getChildCount() > 0) {
            View view = mDRootLayout.d;
            mDRootLayout.f = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z2 || viewGroup.getChildCount() <= 0) {
            return;
        }
        if (!z3 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
            z4 = false;
        }
        mDRootLayout.g = z4;
    }

    static /* synthetic */ void a(MDRootLayout mDRootLayout, WebView webView, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z) {
            View view = mDRootLayout.d;
            mDRootLayout.f = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z2) {
            if (!z3 || (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() >= webView.getContentHeight() * webView.getScale()) {
                z4 = false;
            }
            mDRootLayout.g = z4;
        }
    }
}
