package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: aeg  reason: default package */
/* loaded from: classes.dex */
public final class aeg {
    private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    private aeg() {
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
