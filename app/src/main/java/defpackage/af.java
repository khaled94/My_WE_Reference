package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.afollestad.materialdialogs.R;
import java.lang.reflect.Field;

/* renamed from: af  reason: default package */
/* loaded from: classes.dex */
public final class af {
    public static void a(RadioButton radioButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(radioButton.getContext(), R.drawable.abc_btn_radio_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        radioButton.setButtonDrawable(wrap);
    }

    public static void a(CheckBox checkBox, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(checkBox.getContext(), R.drawable.abc_btn_check_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        checkBox.setButtonDrawable(wrap);
    }

    public static void a(CheckBox checkBox, int i) {
        int a = ah.a(checkBox.getContext());
        a(checkBox, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{ah.a(checkBox.getContext(), R.attr.colorControlNormal, 0), i, a, a}));
    }

    public static void a(SeekBar seekBar, int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (Build.VERSION.SDK_INT >= 21) {
            seekBar.setThumbTintList(valueOf);
            seekBar.setProgressTintList(valueOf);
        } else if (Build.VERSION.SDK_INT > 10) {
            Drawable wrap = DrawableCompat.wrap(seekBar.getProgressDrawable());
            seekBar.setProgressDrawable(wrap);
            DrawableCompat.setTintList(wrap, valueOf);
            if (Build.VERSION.SDK_INT < 16) {
                return;
            }
            Drawable wrap2 = DrawableCompat.wrap(seekBar.getThumb());
            DrawableCompat.setTintList(wrap2, valueOf);
            seekBar.setThumb(wrap2);
        } else {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (Build.VERSION.SDK_INT <= 10) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (seekBar.getIndeterminateDrawable() != null) {
                seekBar.getIndeterminateDrawable().setColorFilter(i, mode);
            }
            if (seekBar.getProgressDrawable() == null) {
                return;
            }
            seekBar.getProgressDrawable().setColorFilter(i, mode);
        }
    }

    private static ColorStateList a(Context context, int i) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{ah.a(context, R.attr.colorControlNormal, 0), ah.a(context, R.attr.colorControlNormal, 0), i});
    }

    public static void a(EditText editText, int i) {
        ColorStateList a = a(editText.getContext(), i);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(a);
        } else if (Build.VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(a);
        }
        b(editText, i);
    }

    private static void b(EditText editText, int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {ContextCompat.getDrawable(editText.getContext(), i2), ContextCompat.getDrawable(editText.getContext(), i2)};
            drawableArr[0].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            drawableArr[1].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e) {
            new StringBuilder("Device issue with cursor tinting: ").append(e.getMessage());
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
