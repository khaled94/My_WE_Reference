package com.ucare.we.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import co.kyash.targetinstructions.R;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ucare/we/view/FabBottomNavigation;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cornerSize", "", "getCornerSize", "()F", "setCornerSize", "(F)V", "cradleVerticalOffset", "getCradleVerticalOffset", "setCradleVerticalOffset", "fabCradleMargin", "getFabCradleMargin", "setFabCradleMargin", "fabCradleRoundedCornerRadius", "getFabCradleRoundedCornerRadius", "setFabCradleRoundedCornerRadius", "fabSize", "materialShapeDrawable", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "shapeAppearanceModel", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "topCurvedEdgeTreatment", "Lcom/google/android/material/bottomappbar/BottomAppBarTopEdgeTreatment;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FabBottomNavigation extends BottomNavigationView {
    private BottomAppBarTopEdgeTreatment a;
    private MaterialShapeDrawable b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private ShapeAppearanceModel h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FabBottomNavigation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        dqc.d(context, "context");
    }

    private /* synthetic */ FabBottomNavigation(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private FabBottomNavigation(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        dqc.d(context, "context");
        this.g = djr.a(30);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FABBottomBar, 0, 0);
        dqc.b(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, R.styleable.FABBottomBar, 0, 0)");
        this.g = obtainStyledAttributes.getDimension(1, 0.0f);
        this.c = obtainStyledAttributes.getDimension(5, 0.0f);
        this.d = obtainStyledAttributes.getDimension(3, 0.0f);
        this.e = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f = dimension;
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = new BottomAppBarTopEdgeTreatment(this.d, this.e, dimension);
        bottomAppBarTopEdgeTreatment.setFabDiameter(this.c);
        dmg dmgVar = dmg.a;
        this.a = bottomAppBarTopEdgeTreatment;
        ShapeAppearanceModel build = new ShapeAppearanceModel.Builder().setTopEdge(this.a).setTopLeftCorner(0, this.g).setTopRightCorner(0, this.g).build();
        dqc.b(build, "Builder()\n            .setTopEdge(topCurvedEdgeTreatment)\n            .setTopLeftCorner(CornerFamily.ROUNDED, cornerSize)\n            .setTopRightCorner(CornerFamily.ROUNDED, cornerSize)\n            .build()");
        this.h = build;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.h);
        materialShapeDrawable.setTint(ContextCompat.getColor(context, obtainStyledAttributes.getResourceId(0, 17170443)));
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL_AND_STROKE);
        dmg dmgVar2 = dmg.a;
        this.b = materialShapeDrawable;
        setBackground(materialShapeDrawable);
        setElevation(djr.a(4));
    }

    public final float getFabCradleMargin() {
        return this.d;
    }

    public final void setFabCradleMargin(float f) {
        this.d = f;
    }

    public final float getFabCradleRoundedCornerRadius() {
        return this.e;
    }

    public final void setFabCradleRoundedCornerRadius(float f) {
        this.e = f;
    }

    public final float getCradleVerticalOffset() {
        return this.f;
    }

    public final void setCradleVerticalOffset(float f) {
        this.f = f;
    }

    public final float getCornerSize() {
        return this.g;
    }

    public final void setCornerSize(float f) {
        this.g = f;
    }
}
