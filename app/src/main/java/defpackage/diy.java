package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001d\u001a\u00020\u000e2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ucare/we/util/DividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "orientation", "", "isShowInLastItem", "", "(Landroid/content/Context;IZ)V", "mDivider", "Landroid/graphics/drawable/Drawable;", "mIsShowInLastItem", "mOrientation", "drawHorizontal", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "drawVertical", "getItemOffsets", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "c", "setDrawable", "drawable", "setOrientation", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: diy  reason: default package */
/* loaded from: classes2.dex */
public final class diy extends RecyclerView.ItemDecoration {
    public static final a a = new a((byte) 0);
    private static final int[] e = {16843284};
    private Drawable b;
    private int c;
    private final boolean d;

    public diy(Context context, int i) {
        Drawable drawable = null;
        TypedArray obtainStyledAttributes = context == null ? null : context.obtainStyledAttributes(e);
        this.b = obtainStyledAttributes != null ? obtainStyledAttributes.getDrawable(0) : drawable;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL".toString());
        }
        this.c = i;
        this.d = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        dqc.d(canvas, "c");
        dqc.d(recyclerView, "parent");
        dqc.d(state, "state");
        if (recyclerView.getLayoutManager() == null || this.b == null) {
            return;
        }
        if (this.c == 1) {
            canvas.save();
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            if (this.d) {
                i2 = recyclerView.getChildCount();
            } else {
                i2 = recyclerView.getChildCount() - 1;
            }
            if (i2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    View childAt = recyclerView.getChildAt(i3);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    Integer valueOf = layoutManager == null ? null : Integer.valueOf(layoutManager.getDecoratedBottom(childAt));
                    int intValue = valueOf == null ? 0 : valueOf.intValue() + Math.round(childAt.getTranslationY());
                    Drawable drawable = this.b;
                    int intrinsicHeight = intValue - (drawable == null ? 0 : drawable.getIntrinsicHeight());
                    Drawable drawable2 = this.b;
                    if (drawable2 != null) {
                        drawable2.setBounds(paddingLeft, intrinsicHeight, width, intValue);
                    }
                    Drawable drawable3 = this.b;
                    if (drawable3 != null) {
                        drawable3.draw(canvas);
                    }
                    if (i4 >= i2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            canvas.restore();
            return;
        }
        canvas.save();
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        if (this.d) {
            i = recyclerView.getChildCount();
        } else {
            i = recyclerView.getChildCount() - 1;
        }
        if (i > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                View childAt2 = recyclerView.getChildAt(i5);
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                Integer valueOf2 = layoutManager2 == null ? null : Integer.valueOf(layoutManager2.getDecoratedRight(childAt2));
                int intValue2 = valueOf2 == null ? 0 : valueOf2.intValue() + dqn.a(childAt2.getTranslationX());
                Drawable drawable4 = this.b;
                int intrinsicWidth = intValue2 - (drawable4 == null ? 0 : drawable4.getIntrinsicWidth());
                Drawable drawable5 = this.b;
                if (drawable5 != null) {
                    drawable5.setBounds(intrinsicWidth, paddingTop, intValue2, height);
                }
                Drawable drawable6 = this.b;
                if (drawable6 != null) {
                    drawable6.draw(canvas);
                }
                if (i6 >= i) {
                    break;
                }
                i5 = i6;
            }
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        dqc.d(rect, "outRect");
        dqc.d(view, "view");
        dqc.d(recyclerView, "parent");
        dqc.d(state, "state");
        if (this.b == null) {
            rect.setEmpty();
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition();
        int itemCount = state.getItemCount();
        if (this.d) {
            if (this.c == 1) {
                Drawable drawable = this.b;
                rect.set(0, 0, 0, drawable == null ? 0 : drawable.getIntrinsicHeight());
                return;
            }
            Drawable drawable2 = this.b;
            rect.set(0, 0, drawable2 == null ? 0 : drawable2.getIntrinsicWidth(), 0);
        } else if (viewLayoutPosition == itemCount - 1) {
            rect.setEmpty();
        } else if (this.c == 1) {
            Drawable drawable3 = this.b;
            rect.set(0, 0, 0, drawable3 == null ? 0 : drawable3.getIntrinsicHeight());
        } else {
            Drawable drawable4 = this.b;
            rect.set(0, 0, drawable4 == null ? 0 : drawable4.getIntrinsicWidth(), 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ucare/we/util/DividerItemDecoration$Companion;", "", "()V", "ATTRS", "", "HORIZONTAL", "", "TAG", "", "VERTICAL", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: diy$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }
}
