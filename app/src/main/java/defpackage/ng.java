package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/aam/MetadataRule;", "", "name", "", "keyRules", "", "valRule", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getKeyRules", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getValRule", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ng  reason: default package */
/* loaded from: classes2.dex */
public final class ng {
    public static final a a = new a((byte) 0);
    private static final Set<ng> e = new CopyOnWriteArraySet();
    private final List<String> b;
    private final String c;
    private final String d;

    public /* synthetic */ ng(String str, List list, String str2, byte b) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set d() {
        if (qx.a(ng.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            qx.a(th, ng.class);
            return null;
        }
    }

    private ng(String str, List<String> list, String str2) {
        this.c = str;
        this.d = str2;
        this.b = list;
    }

    public final String b() {
        if (qx.a(this)) {
            return null;
        }
        try {
            return this.c;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public final String c() {
        if (qx.a(this)) {
            return null;
        }
        try {
            return this.d;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/aam/MetadataRule$Companion;", "", "()V", "FIELD_K", "", "FIELD_K_DELIMITER", "FIELD_V", "rules", "", "Lcom/facebook/appevents/aam/MetadataRule;", "constructRules", "", "jsonObject", "Lorg/json/JSONObject;", "getEnabledRuleNames", "", "getRules", "updateRules", "rulesFromServer", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ng$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static Set<ng> a() {
            return new HashSet(ng.d());
        }

        public static Set<String> b() {
            HashSet hashSet = new HashSet();
            for (ng ngVar : ng.d()) {
                hashSet.add(ngVar.b());
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    dqc.b(optString, "k");
                    String str = optString;
                    if (!(str.length() == 0)) {
                        Set d = ng.d();
                        dqc.b(next, "key");
                        List a = dsg.a(str, new String[]{","}, 0, 6);
                        dqc.b(optString2, "v");
                        d.add(new ng(next, a, optString2, (byte) 0));
                    }
                }
            }
        }
    }

    public final List<String> a() {
        if (qx.a(this)) {
            return null;
        }
        try {
            return new ArrayList(this.b);
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
