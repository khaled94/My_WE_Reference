package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class CheckedTextViewCompat {
    private static final String TAG = "CheckedTextViewCompat";

    private CheckedTextViewCompat() {
    }

    public static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setCheckMarkTintList(checkedTextView, colorStateList);
        } else if (!(checkedTextView instanceof TintableCheckedTextView)) {
        } else {
            ((TintableCheckedTextView) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    public static ColorStateList getCheckMarkTintList(CheckedTextView checkedTextView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getCheckMarkTintList(checkedTextView);
        }
        if (!(checkedTextView instanceof TintableCheckedTextView)) {
            return null;
        }
        return ((TintableCheckedTextView) checkedTextView).getSupportCheckMarkTintList();
    }

    public static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setCheckMarkTintMode(checkedTextView, mode);
        } else if (!(checkedTextView instanceof TintableCheckedTextView)) {
        } else {
            ((TintableCheckedTextView) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }

    public static PorterDuff.Mode getCheckMarkTintMode(CheckedTextView checkedTextView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getCheckMarkTintMode(checkedTextView);
        }
        if (!(checkedTextView instanceof TintableCheckedTextView)) {
            return null;
        }
        return ((TintableCheckedTextView) checkedTextView).getSupportCheckMarkTintMode();
    }

    public static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return Api16Impl.getCheckMarkDrawable(checkedTextView);
        }
        return Api14Impl.getCheckMarkDrawable(checkedTextView);
    }

    /* loaded from: classes.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static ColorStateList getCheckMarkTintList(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }

        static PorterDuff.Mode getCheckMarkTintMode(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }
    }

    /* loaded from: classes.dex */
    static class Api16Impl {
        private Api16Impl() {
        }

        static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* loaded from: classes.dex */
    static class Api14Impl {
        private static Field sCheckMarkDrawableField;
        private static boolean sResolved;

        private Api14Impl() {
        }

        static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
            if (!sResolved) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    sCheckMarkDrawableField = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                sResolved = true;
            }
            Field field = sCheckMarkDrawableField;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException unused2) {
                    sCheckMarkDrawableField = null;
                }
            }
            return null;
        }
    }
}
