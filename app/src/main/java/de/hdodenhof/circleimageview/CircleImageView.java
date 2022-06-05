package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class CircleImageView extends ImageView {
    private static final ImageView.ScaleType a = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
    private final RectF c;
    private final RectF d;
    private final Matrix e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private int i;
    private int j;
    private int k;
    private Bitmap l;
    private BitmapShader m;
    private int n;
    private int o;
    private float p;
    private float q;
    private ColorFilter r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CircleImageView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Matrix();
        this.f = new Paint();
        this.g = new Paint();
        this.h = new Paint();
        this.i = ViewCompat.MEASURED_STATE_MASK;
        this.j = 0;
        this.k = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleImageView, 0, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleImageView_civ_border_width, 0);
        this.i = obtainStyledAttributes.getColor(R.styleable.CircleImageView_civ_border_color, ViewCompat.MEASURED_STATE_MASK);
        this.u = obtainStyledAttributes.getBoolean(R.styleable.CircleImageView_civ_border_overlay, false);
        this.k = obtainStyledAttributes.getColor(R.styleable.CircleImageView_civ_circle_background_color, 0);
        obtainStyledAttributes.recycle();
        super.setScaleType(a);
        this.s = true;
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a(this, (byte) 0));
        }
        if (this.t) {
            c();
            this.t = false;
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return a;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == a) {
            return;
        }
        throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (!z) {
            return;
        }
        throw new IllegalArgumentException("adjustViewBounds not supported.");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.v) {
            super.onDraw(canvas);
        } else if (this.l == null) {
        } else {
            if (this.k != 0) {
                canvas.drawCircle(this.c.centerX(), this.c.centerY(), this.p, this.h);
            }
            canvas.drawCircle(this.c.centerX(), this.c.centerY(), this.p, this.f);
            if (this.j <= 0) {
                return;
            }
            canvas.drawCircle(this.d.centerX(), this.d.centerY(), this.q, this.g);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        c();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        c();
    }

    public int getBorderColor() {
        return this.i;
    }

    public void setBorderColor(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        this.g.setColor(i);
        invalidate();
    }

    public int getCircleBackgroundColor() {
        return this.k;
    }

    public void setCircleBackgroundColor(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        this.h.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    public int getBorderWidth() {
        return this.j;
    }

    public void setBorderWidth(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        c();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.u) {
            return;
        }
        this.u = z;
        c();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.v == z) {
            return;
        }
        this.v = z;
        b();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.r) {
            return;
        }
        this.r = colorFilter;
        a();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.r;
    }

    private void a() {
        this.f.setColorFilter(this.r);
    }

    private static Bitmap a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(2, 2, b);
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), b);
            }
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void b() {
        if (this.v) {
            this.l = null;
        } else {
            this.l = a(getDrawable());
        }
        c();
    }

    private void c() {
        int i;
        if (!this.s) {
            this.t = true;
        } else if (getWidth() == 0 && getHeight() == 0) {
        } else {
            if (this.l == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.l;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.m = new BitmapShader(bitmap, tileMode, tileMode);
            this.f.setAntiAlias(true);
            this.f.setShader(this.m);
            this.g.setStyle(Paint.Style.STROKE);
            this.g.setAntiAlias(true);
            this.g.setColor(this.i);
            this.g.setStrokeWidth(this.j);
            this.h.setStyle(Paint.Style.FILL);
            this.h.setAntiAlias(true);
            this.h.setColor(this.k);
            this.o = this.l.getHeight();
            this.n = this.l.getWidth();
            this.d.set(d());
            this.q = Math.min((this.d.height() - this.j) / 2.0f, (this.d.width() - this.j) / 2.0f);
            this.c.set(this.d);
            if (!this.u && (i = this.j) > 0) {
                this.c.inset(i - 1.0f, i - 1.0f);
            }
            this.p = Math.min(this.c.height() / 2.0f, this.c.width() / 2.0f);
            a();
            e();
            invalidate();
        }
    }

    private RectF d() {
        int width;
        int height;
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((width - min) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - min) / 2.0f);
        float f = min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    private void e() {
        float f;
        float f2;
        this.e.set(null);
        float f3 = 0.0f;
        if (this.n * this.c.height() > this.c.width() * this.o) {
            f2 = this.c.height() / this.o;
            f3 = (this.c.width() - (this.n * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = this.c.width() / this.n;
            f = (this.c.height() - (this.o * f2)) * 0.5f;
        }
        this.e.setScale(f2, f2);
        this.e.postTranslate(((int) (f3 + 0.5f)) + this.c.left, ((int) (f + 0.5f)) + this.c.top);
        this.m.setLocalMatrix(this.e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (((Math.pow((double) (motionEvent.getX() - this.d.centerX()), 2.0d) + Math.pow((double) (motionEvent.getY() - this.d.centerY()), 2.0d)) > Math.pow((double) this.q, 2.0d) ? 1 : ((Math.pow((double) (motionEvent.getX() - this.d.centerX()), 2.0d) + Math.pow((double) (motionEvent.getY() - this.d.centerY()), 2.0d)) == Math.pow((double) this.q, 2.0d) ? 0 : -1)) <= 0) && super.onTouchEvent(motionEvent);
    }

    /* loaded from: classes2.dex */
    class a extends ViewOutlineProvider {
        private a() {
        }

        /* synthetic */ a(CircleImageView circleImageView, byte b) {
            this();
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.d.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }
}
