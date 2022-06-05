package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/codeless/RCTCodelessLoggingEventListener;", "", "()V", "getOnTouchListener", "Lcom/facebook/appevents/codeless/RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "AutoLoggingOnTouchListener", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nl  reason: default package */
/* loaded from: classes2.dex */
public final class nl {
    public static final nl a = new nl();

    private nl() {
    }

    public static final a a(no noVar, View view, View view2) {
        if (qx.a(nl.class)) {
            return null;
        }
        try {
            dqc.d(noVar, "mapping");
            dqc.d(view, "rootView");
            dqc.d(view2, "hostView");
            return new a(noVar, view, view2);
        } catch (Throwable th) {
            qx.a(th, nl.class);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/codeless/RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener;", "Landroid/view/View$OnTouchListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "existingOnTouchListener", "Ljava/lang/ref/WeakReference;", "supportCodelessLogging", "", "getSupportCodelessLogging", "()Z", "setSupportCodelessLogging", "(Z)V", "onTouch", "view", "motionEvent", "Landroid/view/MotionEvent;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nl$a */
    /* loaded from: classes2.dex */
    public static final class a implements View.OnTouchListener {
        boolean a = true;
        private final no b;
        private final WeakReference<View> c;
        private final WeakReference<View> d;
        private final View.OnTouchListener e;

        public a(no noVar, View view, View view2) {
            dqc.d(noVar, "mapping");
            dqc.d(view, "rootView");
            dqc.d(view2, "hostView");
            this.b = noVar;
            this.c = new WeakReference<>(view2);
            this.d = new WeakReference<>(view);
            this.e = nt.h(view2);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            dqc.d(view, "view");
            dqc.d(motionEvent, "motionEvent");
            View view2 = this.d.get();
            View view3 = this.c.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                ni.b(this.b, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.e;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }
}
