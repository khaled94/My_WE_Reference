package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: dbu  reason: default package */
/* loaded from: classes2.dex */
public final class dbu extends RecyclerView.OnScrollListener {
    private Context a;
    private LinearLayoutManager b;
    private a c;
    private int d = 0;

    /* renamed from: dbu$a */
    /* loaded from: classes2.dex */
    public interface a {
        void scrollFinished(int i);
    }

    public dbu(Context context, LinearLayoutManager linearLayoutManager, a aVar) {
        this.a = context;
        this.b = linearLayoutManager;
        this.c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2 = this.d;
        if (i2 == 0 || i == i2) {
            int findFirstVisibleItemPosition = this.b.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = (this.b.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1;
            int i3 = this.a.getResources().getDisplayMetrics().widthPixels / 2;
            int i4 = Integer.MAX_VALUE;
            int i5 = 0;
            for (int i6 = 0; i6 < findLastVisibleItemPosition; i6++) {
                View childAt = this.b.getChildAt(i6);
                if (childAt == null) {
                    return;
                }
                int abs = Math.abs(childAt.getLeft() - i3) + Math.abs(childAt.getRight() - i3);
                if (i4 > abs) {
                    i5 = i6 + findFirstVisibleItemPosition;
                    i4 = abs;
                }
            }
            this.c.scrollFinished(i5);
        }
    }
}
