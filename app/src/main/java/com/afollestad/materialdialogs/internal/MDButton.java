package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.afollestad.materialdialogs.R;

/* loaded from: classes.dex */
public class MDButton extends TextView {
    private boolean a = false;
    private v b = v.END;
    private int c;
    private Drawable d;
    private Drawable e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z, boolean z2) {
        if (this.a != z || z2) {
            setGravity(z ? this.b.getGravityInt() | 16 : 17);
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(z ? this.b.getTextAlignment() : 4);
            }
            ah.a(this, z ? this.d : this.e);
            if (z) {
                setPadding(this.c, getPaddingTop(), this.c, getPaddingBottom());
            }
            this.a = z;
        }
    }

    public void setStackedGravity(v vVar) {
        this.b = vVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.d = drawable;
        if (this.a) {
            a(true, true);
        }
    }

    public void setDefaultSelector(Drawable drawable) {
        this.e = drawable;
        if (!this.a) {
            a(false, true);
        }
    }

    public void setAllCapsCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 14) {
            setAllCaps(z);
        } else if (z) {
            setTransformationMethod(new ae(getContext()));
        } else {
            setTransformationMethod(null);
        }
    }
}
