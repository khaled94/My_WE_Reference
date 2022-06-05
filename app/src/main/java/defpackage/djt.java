package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001\u001a5\u0010\b\u001a\u00020\u0006\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n*\u00020\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000\u001a?\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013\u001a\n\u0010\u0014\u001a\u00020\u0006*\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"dpToPx", "", "Landroid/view/View;", "dp", "", "hide", "", "hidingStrategy", "layoutParams", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "margin", "left", "top", "right", "bottom", "(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "show", "app_googleProductionRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: djt  reason: default package */
/* loaded from: classes2.dex */
public final class djt {
    public static void a(View view, Float f) {
        dqc.d(view, "<this>");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (f == null) {
                return;
            }
            float floatValue = f.floatValue();
            dqc.d(view, "<this>");
            Context context = view.getContext();
            dqc.b(context, "context");
            dqc.d(context, "<this>");
            marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, floatValue, context.getResources().getDisplayMetrics());
        }
    }
}
