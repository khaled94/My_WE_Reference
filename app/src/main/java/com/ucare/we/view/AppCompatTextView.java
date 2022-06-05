package com.ucare.we.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.ucare.we.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003¨\u0006\r"}, d2 = {"Lcom/ucare/we/view/AppCompatTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppCompatTextView extends androidx.appcompat.widget.AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet) {
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
            if (resourceId == 0) {
                return;
            }
            String name = Integer.TYPE.getName();
            dqc.b(name, "resId.javaClass.name");
            if (dsg.d(name, "VectorDrawable")) {
                vectorDrawableCompat = VectorDrawableCompat.create(getResources(), resourceId, context2.getTheme());
            } else {
                vectorDrawableCompat = AppCompatDrawableManager.get().getDrawable(context2, resourceId);
            }
            setBackground(vectorDrawableCompat);
            obtainStyledAttributes.recycle();
        }
    }
}
