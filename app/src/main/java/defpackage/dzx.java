package defpackage;

import android.net.Uri;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dzx  reason: default package */
/* loaded from: classes2.dex */
public final class dzx {
    private dzx() {
    }

    public static void a(JSONObject jSONObject, String str, int i) {
        dzy.a(jSONObject, "json must not be null");
        dzy.a(str, "field must not be null");
        dzy.a(Integer.valueOf(i), "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        dzy.a(jSONObject, "json must not be null");
        dzy.a(str, "field must not be null");
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    /* renamed from: dzx$b */
    /* loaded from: classes2.dex */
    public static abstract class b<T> {
        public final String a;
        public final T b;

        b(String str, T t) {
            this.a = str;
            this.b = t;
        }
    }

    /* renamed from: dzx$f */
    /* loaded from: classes2.dex */
    public static final class f extends b<Uri> {
        private f(String str) {
            super(str, null);
        }

        public f(String str, byte b) {
            this(str);
        }
    }

    /* renamed from: dzx$d */
    /* loaded from: classes2.dex */
    public static final class d extends b<String> {
        private d(String str) {
            super(str, null);
        }

        public d(String str, byte b) {
            this(str);
        }
    }

    /* renamed from: dzx$a */
    /* loaded from: classes2.dex */
    public static final class a extends b<Boolean> {
        public a(String str, boolean z) {
            super(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: dzx$c */
    /* loaded from: classes2.dex */
    public static abstract class c<T> {
        public final String a;
        public final List<T> b;

        c(String str, List<T> list) {
            this.a = str;
            this.b = list;
        }
    }

    /* renamed from: dzx$e */
    /* loaded from: classes2.dex */
    public static final class e extends c<String> {
        public e(String str) {
            super(str, null);
        }

        public e(String str, List<String> list) {
            super(str, list);
        }
    }
}
