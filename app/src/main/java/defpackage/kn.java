package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: kn  reason: default package */
/* loaded from: classes2.dex */
public abstract class kn<T extends View, Z> extends kf<Z> {
    private static boolean b;
    private static int c = R.id.glide_custom_view_target_tag;
    protected final T a;
    private final a d;
    private View.OnAttachStateChangeListener e;
    private boolean f;
    private boolean g;

    public kn(T t) {
        this.a = (T) lf.a(t, "Argument must not be null");
        this.d = new a(t);
    }

    @Override // defpackage.kf, defpackage.km
    public void b(Drawable drawable) {
        super.b(drawable);
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.e;
        if (onAttachStateChangeListener == null || this.g) {
            return;
        }
        this.a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.g = true;
    }

    @Override // defpackage.km
    public final void a(kl klVar) {
        a aVar = this.d;
        int d = aVar.d();
        int c2 = aVar.c();
        if (a.a(d, c2)) {
            klVar.a(d, c2);
            return;
        }
        if (!aVar.c.contains(klVar)) {
            aVar.c.add(klVar);
        }
        if (aVar.e != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = aVar.b.getViewTreeObserver();
        aVar.e = new a.ViewTreeObserver$OnPreDrawListenerC0037a(aVar);
        viewTreeObserver.addOnPreDrawListener(aVar.e);
    }

    @Override // defpackage.km
    public final void b(kl klVar) {
        this.d.c.remove(klVar);
    }

    @Override // defpackage.kf, defpackage.km
    public void a(Drawable drawable) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        super.a(drawable);
        this.d.b();
        if (this.f || (onAttachStateChangeListener = this.e) == null || !this.g) {
            return;
        }
        this.a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.g = false;
    }

    public String toString() {
        return "Target for: " + this.a;
    }

    /* renamed from: kn$a */
    /* loaded from: classes2.dex */
    static final class a {
        static Integer a;
        final View b;
        final List<kl> c = new ArrayList();
        boolean d;
        ViewTreeObserver$OnPreDrawListenerC0037a e;

        private static boolean a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        a(View view) {
            this.b = view;
        }

        private static int a(Context context) {
            if (a == null) {
                Display defaultDisplay = ((WindowManager) lf.a((WindowManager) context.getSystemService("window"), "Argument must not be null")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return a.intValue();
        }

        final void a() {
            if (this.c.isEmpty()) {
                return;
            }
            int d = d();
            int c = c();
            if (!a(d, c)) {
                return;
            }
            Iterator it = new ArrayList(this.c).iterator();
            while (it.hasNext()) {
                ((kl) it.next()).a(d, c);
            }
            b();
        }

        final void b() {
            ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.e);
            }
            this.e = null;
            this.c.clear();
        }

        static boolean a(int i, int i2) {
            return a(i) && a(i2);
        }

        final int c() {
            int paddingTop = this.b.getPaddingTop() + this.b.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            return a(this.b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        final int d() {
            int paddingLeft = this.b.getPaddingLeft() + this.b.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            return a(this.b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private int a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.d && this.b.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (!this.b.isLayoutRequested() && i2 == -2) {
                return a(this.b.getContext());
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kn$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0037a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> a;

            ViewTreeObserver$OnPreDrawListenerC0037a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    new StringBuilder("OnGlobalLayoutListener called attachStateListener=").append(this);
                }
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a();
                    return true;
                }
                return true;
            }
        }
    }

    @Override // defpackage.kf, defpackage.km
    public final void a(jy jyVar) {
        b = true;
        this.a.setTag(c, jyVar);
    }

    @Override // defpackage.kf, defpackage.km
    public final jy d() {
        Object tag = this.a.getTag(c);
        if (tag != null) {
            if (tag instanceof jy) {
                return (jy) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }
}
