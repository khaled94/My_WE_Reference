package defpackage;

import android.text.TextUtils;

/* renamed from: ao  reason: default package */
/* loaded from: classes.dex */
public final class ao {
    public final String a;
    public final String b;

    public ao(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ao aoVar = (ao) obj;
            if (TextUtils.equals(this.a, aoVar.a) && TextUtils.equals(this.b, aoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }
}
