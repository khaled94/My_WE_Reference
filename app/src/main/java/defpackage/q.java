package defpackage;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001:\u0002IJB\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\r\u00105\u001a\u000206H\u0010¢\u0006\u0002\b7J\b\u00108\u001a\u00020\u0012H\u0002J\u0015\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0010¢\u0006\u0002\b=J\r\u0010>\u001a\u00020\u0003H\u0000¢\u0006\u0002\b?J\r\u0010@\u001a\u00020\u0003H\u0000¢\u0006\u0002\bAJ\r\u0010B\u001a\u00020:H ¢\u0006\u0002\bCJ\r\u0010D\u001a\u00020:H\u0000¢\u0006\u0002\bEJ\r\u0010F\u001a\u00020:H ¢\u0006\u0002\bGJ\u0006\u0010H\u001a\u00020:R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 ¨\u0006K"}, d2 = {"Lco/kyash/targetinstructions/targets/Target;", "", "left", "", "top", "width", "height", "highlightRadius", "highlightPaddingLeft", "highlightPaddingTop", "highlightPaddingRight", "highlightPaddingBottom", "messageView", "Landroid/view/View;", "targetView", "delay", "", "positionType", "Lco/kyash/targetinstructions/targets/Target$Position;", "gravity", "", "(FFFFFFFFFLandroid/view/View;Landroid/view/View;JLco/kyash/targetinstructions/targets/Target$Position;Ljava/lang/Integer;)V", "getDelay", "()J", "getGravity", "()Ljava/lang/Integer;", "setGravity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHeight", "()F", "setHeight", "(F)V", "getHighlightPaddingBottom", "getHighlightPaddingLeft", "getHighlightPaddingRight", "getHighlightPaddingTop", "getHighlightRadius", "getLeft", "setLeft", "getMessageView", "()Landroid/view/View;", "getPositionType", "()Lco/kyash/targetinstructions/targets/Target$Position;", "setPositionType", "(Lco/kyash/targetinstructions/targets/Target$Position;)V", "targetPaint", "Landroid/graphics/Paint;", "getTargetView", "getTop", "setTop", "getWidth", "setWidth", "canClick", "", "canClick$library_release", "decideMessagePositionType", "drawHighlight", "", "canvas", "Landroid/graphics/Canvas;", "drawHighlight$library_release", "getCenterX", "getCenterX$library_release", "getCenterY", "getCenterY$library_release", "hideImmediately", "hideImmediately$library_release", "show", "show$library_release", "showImmediately", "showImmediately$library_release", "updateCoordinate", "OnStateChangedListener", "Position", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: q */
/* loaded from: classes2.dex */
public abstract class q {
    private float a;
    private float b;
    private float c;
    public final Paint d;
    private float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final View k;
    private final View l;
    private final long m;
    private b n;
    private Integer o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lco/kyash/targetinstructions/targets/Target$OnStateChangedListener;", "", "onClosed", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: q$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lco/kyash/targetinstructions/targets/Target$Position;", "", "(Ljava/lang/String;I)V", "ABOVE", "BELOW", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: q$b */
    /* loaded from: classes2.dex */
    public enum b {
        ABOVE,
        BELOW
    }

    public static /* synthetic */ void lambda$uB5WPNYbCi0K5hjRIfHnJQDistY(q qVar) {
        a(qVar);
    }

    public abstract void n();

    public q(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, View view, View view2, long j, b bVar, Integer num) {
        dqc.d(view, "messageView");
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = view;
        this.l = view2;
        this.m = j;
        this.n = bVar;
        this.o = num;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        dmg dmgVar = dmg.a;
        this.d = paint;
    }

    public float a() {
        return this.a;
    }

    public void a(float f) {
        this.a = f;
    }

    public float b() {
        return this.b;
    }

    public void b(float f) {
        this.b = f;
    }

    public float c() {
        return this.c;
    }

    public void c(float f) {
        this.c = f;
    }

    public float d() {
        return this.e;
    }

    public void d(float f) {
        this.e = f;
    }

    public float e() {
        return this.f;
    }

    public float f() {
        return this.g;
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.j;
    }

    public View j() {
        return this.k;
    }

    public View k() {
        return this.l;
    }

    public long l() {
        return this.m;
    }

    public void a(b bVar) {
        this.n = bVar;
    }

    public b m() {
        return this.n;
    }

    public final void o() {
        new Handler().postDelayed(new Runnable() { // from class: -$$Lambda$q$uB5WPNYbCi0K5hjRIfHnJQDistY
            @Override // java.lang.Runnable
            public final void run() {
                q.lambda$uB5WPNYbCi0K5hjRIfHnJQDistY(q.this);
            }
        }, l());
    }

    public static final void a(q qVar) {
        dqc.d(qVar, "this$0");
        qVar.p();
        if (qVar.m() == null) {
            Point point = new Point();
            Object systemService = qVar.j().getContext().getSystemService("window");
            if (systemService != null) {
                ((WindowManager) systemService).getDefaultDisplay().getSize(point);
                qVar.a(qVar.b() > ((float) point.y) - (qVar.b() + qVar.d()) ? b.ABOVE : b.BELOW);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        qVar.n();
    }

    public final void p() {
        if (k() != null) {
            int[] iArr = new int[2];
            View k = k();
            dqc.a(k);
            k.getLocationInWindow(iArr);
            a(iArr[0]);
            b(iArr[1]);
            View k2 = k();
            dqc.a(k2);
            c(k2.getWidth());
            View k3 = k();
            dqc.a(k3);
            d(k3.getHeight());
        }
    }

    public final float q() {
        return a() + (c() / 2.0f);
    }
}
