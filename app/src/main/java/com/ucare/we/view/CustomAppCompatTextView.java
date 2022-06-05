package com.ucare.we.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.ucare.we.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0003J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ucare/we/view/CustomAppCompatTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "compoundGravity", "shouldInvalidate", "", "drawableStartCompat", "", "drawable", "init", "setCompoundDrawable", "setDrawableBottomVector", "setDrawableEndVector", "setDrawableStartVector", "setDrawableTopVector", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomAppCompatTextView extends AppCompatTextView {
    public static final a a = new a((byte) 0);
    private boolean b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        VectorDrawableCompat vectorDrawableCompat;
        dqc.d(context, "context");
        dqc.d(attributeSet, "attrs");
        if (attributeSet != null) {
            Context context2 = getContext();
            dqc.b(context2, "context");
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView);
            dqc.b(obtainStyledAttributes, "context.obtainStyledAttributes(attrs, R.styleable.AppCompatTextView)");
            int resourceId = obtainStyledAttributes.getResourceId(6, 0);
            if (resourceId != 0) {
                String name = Integer.TYPE.getName();
                dqc.b(name, "backgroundId.javaClass.name");
                if (dsg.d(name, "VectorDrawable")) {
                    vectorDrawableCompat = VectorDrawableCompat.create(getResources(), resourceId, context2.getTheme());
                } else {
                    vectorDrawableCompat = AppCompatDrawableManager.get().getDrawable(context2, resourceId);
                }
                setBackground(vectorDrawableCompat);
                obtainStyledAttributes.recycle();
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(11, 0);
            int resourceId3 = obtainStyledAttributes.getResourceId(8, 0);
            int resourceId4 = obtainStyledAttributes.getResourceId(14, 0);
            int resourceId5 = obtainStyledAttributes.getResourceId(7, 0);
            if (resourceId2 == 0 && resourceId3 == 0 && resourceId4 == 0 && resourceId5 == 0) {
                return;
            }
            this.b = true;
            if (resourceId2 != 0) {
                this.c = 0;
                setCompoundDrawable(resourceId2);
            } else if (resourceId2 != 0) {
                this.c = 1;
                setCompoundDrawable(resourceId3);
            } else if (resourceId2 != 0) {
                this.c = 2;
                setCompoundDrawable(resourceId4);
            } else if (resourceId2 != 0) {
                this.c = 3;
                setCompoundDrawable(resourceId5);
            }
            obtainStyledAttributes.recycle();
        }
    }

    private final void setCompoundDrawable(int i) {
        VectorDrawableCompat vectorDrawableCompat;
        String name = Integer.TYPE.getName();
        dqc.b(name, "drawable.javaClass.name");
        if (dsg.d(name, "VectorDrawable")) {
            vectorDrawableCompat = VectorDrawableCompat.create(getResources(), i, getContext().getTheme());
        } else {
            vectorDrawableCompat = AppCompatDrawableManager.get().getDrawable(getContext(), i);
        }
        int i2 = this.c;
        if (i2 == 0) {
            setCompoundDrawablesRelativeWithIntrinsicBounds(vectorDrawableCompat, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i2 == 1) {
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, vectorDrawableCompat);
        } else if (i2 == 2) {
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, vectorDrawableCompat, (Drawable) null, (Drawable) null);
        } else if (i2 == 3) {
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, vectorDrawableCompat);
        }
        if (this.b) {
            invalidate();
        }
    }

    public final void setDrawableStartVector(int i) {
        this.c = 0;
        setCompoundDrawable(i);
    }

    public final void setDrawableEndVector(int i) {
        this.c = 1;
        setCompoundDrawable(i);
    }

    public final void setDrawableTopVector(int i) {
        this.c = 2;
        setCompoundDrawable(i);
    }

    public final void setDrawableBottomVector(int i) {
        this.c = 3;
        setCompoundDrawable(i);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ucare/we/view/CustomAppCompatTextView$Companion;", "", "()V", "BOTTOM", "", "END", "START", "TOP", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }
}
