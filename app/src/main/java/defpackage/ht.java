package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: ht  reason: default package */
/* loaded from: classes2.dex */
public final class ht {
    private static volatile boolean a = true;

    private ht() {
    }

    public static Drawable a(Context context, Context context2, int i) {
        return a(context, context2, i, null);
    }

    public static Drawable a(Context context, int i, Resources.Theme theme) {
        return a(context, context, i, theme);
    }

    private static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return AppCompatResources.getDrawable(theme != null ? new ContextThemeWrapper(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return ContextCompat.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }
}
