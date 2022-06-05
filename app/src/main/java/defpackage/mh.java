package defpackage;

import android.content.SharedPreferences;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/ProfileCache;", "", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "clear", "", "load", "Lcom/facebook/Profile;", "save", "profile", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mh  reason: default package */
/* loaded from: classes2.dex */
public final class mh {
    public static final a a = new a((byte) 0);
    private final SharedPreferences b;

    public mh() {
        SharedPreferences sharedPreferences = ly.k().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        dqc.b(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
    }

    public final mg a() {
        String string = this.b.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new mg(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void a(mg mgVar) {
        dqc.d(mgVar, "profile");
        JSONObject a2 = mgVar.a();
        if (a2 != null) {
            this.b.edit().putString("com.facebook.ProfileManager.CachedProfile", a2.toString()).apply();
        }
    }

    public final void b() {
        this.b.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/ProfileCache$Companion;", "", "()V", "CACHED_PROFILE_KEY", "", "SHARED_PREFERENCES_NAME", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
