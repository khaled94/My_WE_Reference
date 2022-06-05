package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: eau  reason: default package */
/* loaded from: classes2.dex */
public final class eau {
    private static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    final String a;
    private final String d;
    private final String e;
    private final String f;

    private eau(String str, String str2, String str3, String str4) {
        this.d = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
    }

    public static eau a(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        String str2 = null;
        Matcher matcher2 = c.matcher(str);
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2);
                if (group2 != null) {
                    if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                        group2 = group2.substring(1, group2.length() - 1);
                    }
                } else {
                    group2 = matcher2.group(3);
                }
                if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                }
                str2 = group2;
            }
        }
        return new eau(str, lowerCase, lowerCase2, str2);
    }

    public static eau b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final Charset a(Charset charset) {
        try {
            return this.f != null ? Charset.forName(this.f) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String toString() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eau) && ((eau) obj).d.equals(this.d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
