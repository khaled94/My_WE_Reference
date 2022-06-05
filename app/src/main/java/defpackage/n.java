package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import co.kyash.targetinstructions.R;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0000¢\u0006\u0002\b\u001bJ\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0000¢\u0006\u0002\b!J%\u0010\"\u001a\u00020\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\n0#j\b\u0012\u0004\u0012\u00020\n`$H\u0000¢\u0006\u0002\b%R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lco/kyash/targetinstructions/InstructionsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentTarget", "Lco/kyash/targetinstructions/targets/Target;", "listener", "Lco/kyash/targetinstructions/InstructionsView$OnStateChangedListener;", "getListener$library_release", "()Lco/kyash/targetinstructions/InstructionsView$OnStateChangedListener;", "setListener$library_release", "(Lco/kyash/targetinstructions/InstructionsView$OnStateChangedListener;)V", "overlayColor", "getOverlayColor$library_release", "()I", "setOverlayColor$library_release", "(I)V", "paint", "Landroid/graphics/Paint;", "hideTarget", "", TypedValues.Attributes.S_TARGET, "hideTarget$library_release", "onDraw", "canvas", "Landroid/graphics/Canvas;", "removeViews", "showTarget", "showTarget$library_release", "update", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "update$library_release", "OnStateChangedListener", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: n */
/* loaded from: classes2.dex */
public final class n extends FrameLayout {
    public q a;
    a b;
    private final Paint c;
    private int d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lco/kyash/targetinstructions/InstructionsView$OnStateChangedListener;", "", "onNextClick", "", "onSkipClick", "onTargetClicked", "onTargetClosed", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: n$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    public static /* synthetic */ void lambda$AohHlQAKMWT8MfKWvYfZ6Q5Vn_Q(n nVar, View view) {
        a(nVar, view);
    }

    public static /* synthetic */ void lambda$XQuLYdKBJrcL7FgP6TWI_46MvTg(n nVar, View view) {
        b(nVar, view);
    }

    public /* synthetic */ n(Context context, byte b) {
        this(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private n(Context context) {
        super(context, null, 0);
        dqc.d(context, "context");
        this.c = new Paint();
        this.d = ContextCompat.getColor(context, R.color.default_cover);
        setId(R.id.instructions_view);
        bringToFront();
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public final int getOverlayColor$library_release() {
        return this.d;
    }

    public final void setOverlayColor$library_release(int i) {
        this.d = i;
    }

    public final a getListener$library_release() {
        return this.b;
    }

    public final void setListener$library_release(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.c.setColor(this.d);
        if (canvas != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.c);
        }
        q qVar = this.a;
        if (qVar == null || canvas == null) {
            return;
        }
        dqc.a(qVar);
        dqc.d(canvas, "canvas");
        float a2 = qVar.a() - qVar.f();
        float b = qVar.b() - qVar.g();
        float a3 = qVar.a() + qVar.c() + qVar.h();
        float b2 = qVar.b() + qVar.d() + qVar.i();
        if (qVar.e() > 0.0f) {
            canvas.drawCircle(qVar.a() + (qVar.c() / 2.0f), qVar.b() + (qVar.d() / 2.0f), qVar.e(), qVar.d);
        } else {
            canvas.drawRect(a2, b, a3, b2, qVar.d);
        }
    }

    public final void a(q qVar) {
        dqc.d(qVar, TypedValues.Attributes.S_TARGET);
        removeAllViews();
        addView(qVar.j());
        TextView textView = (TextView) qVar.j().findViewById(R.id.btnOk);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$n$AohHlQAKMWT8MfKWvYfZ6Q5Vn_Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.lambda$AohHlQAKMWT8MfKWvYfZ6Q5Vn_Q(n.this, view);
                }
            });
        }
        TextView textView2 = (TextView) qVar.j().findViewById(R.id.btnSkip);
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$n$XQuLYdKBJrcL7FgP6TWI_46MvTg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.lambda$XQuLYdKBJrcL7FgP6TWI_46MvTg(n.this, view);
                }
            });
        }
        this.a = qVar;
        if (qVar != null) {
            qVar.o();
        }
    }

    public static final void a(n nVar, View view) {
        dqc.d(nVar, "this$0");
        q qVar = nVar.a;
        if (qVar != null) {
            dqc.a(qVar);
            a listener$library_release = nVar.getListener$library_release();
            if (listener$library_release == null) {
                return;
            }
            listener$library_release.b();
        }
    }

    public static final void b(n nVar, View view) {
        dqc.d(nVar, "this$0");
        a listener$library_release = nVar.getListener$library_release();
        if (listener$library_release != null) {
            listener$library_release.c();
        }
    }

    public static void a(ArrayList<q> arrayList) {
        dqc.d(arrayList, TypedValues.Attributes.S_TARGET);
        for (q qVar : arrayList) {
            qVar.p();
        }
    }
}
