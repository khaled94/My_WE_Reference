package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: ah  reason: default package */
/* loaded from: classes.dex */
public final class ah {
    public static int a(int i, float f) {
        return Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int a(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList a(Context context, int i, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            if (peekValue.type >= 28 && peekValue.type <= 31) {
                return d(context, peekValue.data);
            }
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static String a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (String) typedValue.string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ah$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v.values().length];
            a = iArr;
            try {
                iArr[v.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static v a(Context context, int i, v vVar) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int i2 = AnonymousClass2.a[vVar.ordinal()];
            int i3 = obtainStyledAttributes.getInt(0, i2 != 1 ? i2 != 2 ? 0 : 2 : 1);
            if (i3 == 1) {
                return v.CENTER;
            }
            if (i3 == 2) {
                return v.END;
            }
            return v.START;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getDrawable(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, -1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean a(Context context, int i, boolean z) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean a(int i) {
        return 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    public static int a(Context context) {
        return a(a(a(context, 16842806, 0)) ? ViewCompat.MEASURED_STATE_MASK : -1, 0.3f);
    }

    public static ColorStateList d(Context context, int i) {
        int a = a(context, 16842806, 0);
        if (i == 0) {
            i = a;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{a(i, 0.4f), i});
    }
}
