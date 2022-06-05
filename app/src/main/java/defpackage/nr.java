package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/codeless/internal/SensitiveUserDataUtils;", "", "()V", "isCreditCard", "", "view", "Landroid/widget/TextView;", "isEmail", "isPassword", "isPersonName", "isPhoneNumber", "isPostalAddress", "isSensitiveUserData", "Landroid/view/View;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nr  reason: default package */
/* loaded from: classes2.dex */
public final class nr {
    public static final nr a = new nr();

    private nr() {
    }

    public static final boolean a(View view) {
        if (qx.a(nr.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            if (a.a((TextView) view) || a.f((TextView) view) || a.c((TextView) view) || a.d((TextView) view) || a.e((TextView) view)) {
                return true;
            }
            return a.b((TextView) view);
        } catch (Throwable th) {
            qx.a(th, nr.class);
            return false;
        }
    }

    private final boolean a(TextView textView) {
        if (qx.a(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 128) {
                return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
            }
            return true;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (qx.a(this)) {
            return false;
        }
        try {
            boolean z = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            String e = nt.e(textView);
            if (e != null) {
                if (e.length() != 0) {
                    z = false;
                }
                if (!z) {
                    return Patterns.EMAIL_ADDRESS.matcher(e).matches();
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (qx.a(this)) {
            return false;
        }
        try {
            String a2 = new dsf("\\s").a(nt.e(textView), "");
            int length = a2.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; i2 >= 0; i2--) {
                    char charAt = a2.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        return false;
                    }
                    int digit = Character.digit((int) charAt, 10);
                    if (digit < 0) {
                        throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                    }
                    if (z && (digit = digit * 2) > 9) {
                        digit = (digit % 10) + 1;
                    }
                    i += digit;
                    z = !z;
                }
                if (i % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }
}
