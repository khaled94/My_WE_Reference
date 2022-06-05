package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import defpackage.ng;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\u0004H\u0007J\r\u0010\"\u001a\u00020\u0004H\u0001¢\u0006\u0002\b#J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002J\u001c\u0010+\u001a\u00020 2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015H\u0007J\u0012\u0010-\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010.H\u0007Jl\u0010-\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u00109\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010.H\u0002J\u0018\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/facebook/appevents/UserDataStore;", "", "()V", "CITY", "", "COUNTRY", "DATA_SEPARATOR", "DATE_OF_BIRTH", "EMAIL", "FIRST_NAME", "GENDER", "INTERNAL_USER_DATA_KEY", "LAST_NAME", "MAX_NUM", "", "PHONE", "STATE", "TAG", "USER_DATA_KEY", "ZIP", "enabledInternalUserData", "", "getEnabledInternalUserData", "()Ljava/util/Map;", "externalHashedUserData", "Ljava/util/concurrent/ConcurrentHashMap;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "internalHashedUserData", "sharedPreferences", "Landroid/content/SharedPreferences;", "clear", "", "getAllHashedUserData", "getHashedUserData", "getHashedUserData$facebook_core_release", "initAndWait", "initStore", "maybeSHA256Hashed", "", "data", "normalizeData", "type", "setInternalUd", "ud", "setUserDataAndHash", "Landroid/os/Bundle;", NotificationCompat.CATEGORY_EMAIL, "firstName", "lastName", "phone", "dateOfBirth", "gender", "city", "state", "zip", "country", "updateHashUserData", "writeDataIntoCache", "key", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nd  reason: default package */
/* loaded from: classes2.dex */
public final class nd {
    private static final String b;
    private static SharedPreferences c;
    public static final nd a = new nd();
    private static final AtomicBoolean d = new AtomicBoolean(false);
    private static final ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> f = new ConcurrentHashMap<>();

    static {
        String simpleName = nd.class.getSimpleName();
        dqc.b(simpleName, "UserDataStore::class.java.simpleName");
        b = simpleName;
    }

    private nd() {
    }

    public static final /* synthetic */ void a(nd ndVar) {
        if (qx.a(nd.class)) {
            return;
        }
        try {
            ndVar.f();
        } catch (Throwable th) {
            qx.a(th, nd.class);
        }
    }

    public static final /* synthetic */ AtomicBoolean c() {
        if (qx.a(nd.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            qx.a(th, nd.class);
            return null;
        }
    }

    public static final /* synthetic */ SharedPreferences d() {
        if (qx.a(nd.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences == null) {
                dqc.a("sharedPreferences");
            }
            return sharedPreferences;
        } catch (Throwable th) {
            qx.a(th, nd.class);
            return null;
        }
    }

    public static final void a() {
        if (qx.a(nd.class)) {
            return;
        }
        try {
            if (d.get()) {
                return;
            }
            a.f();
        } catch (Throwable th) {
            qx.a(th, nd.class);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nd$a */
    /* loaded from: classes2.dex */
    static final class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                nd ndVar = nd.a;
                if (!nd.c().get()) {
                    nd.a(nd.a);
                }
                nd ndVar2 = nd.a;
                nd.d().edit().putString(this.a, this.b).apply();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final String b() {
        if (qx.a(nd.class)) {
            return null;
        }
        try {
            if (!d.get()) {
                a.f();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(e);
            hashMap.putAll(a.e());
            return qi.a(hashMap);
        } catch (Throwable th) {
            qx.a(th, nd.class);
            return null;
        }
    }

    private final Map<String, String> e() {
        if (qx.a(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ng.a aVar = ng.a;
            Set<String> b2 = ng.a.b();
            for (String str : f.keySet()) {
                if (b2.contains(str)) {
                    hashMap.put(str, f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final synchronized void f() {
        if (qx.a(this)) {
            return;
        }
        if (d.get()) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(ly.k());
        dqc.b(defaultSharedPreferences, "PreferenceManager.getDef….getApplicationContext())");
        c = defaultSharedPreferences;
        if (defaultSharedPreferences == null) {
            dqc.a("sharedPreferences");
        }
        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
        if (string == null) {
            string = "";
        }
        dqc.b(string, "sharedPreferences.getStr…(USER_DATA_KEY, \"\") ?: \"\"");
        SharedPreferences sharedPreferences = c;
        if (sharedPreferences == null) {
            dqc.a("sharedPreferences");
        }
        String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
        if (string2 == null) {
            string2 = "";
        }
        dqc.b(string2, "sharedPreferences.getStr…_USER_DATA_KEY, \"\") ?: \"\"");
        e.putAll(qi.f(string));
        f.putAll(qi.f(string2));
        d.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00de A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:5:0x0009, B:7:0x0016, B:8:0x001b, B:9:0x0023, B:11:0x0029, B:16:0x004f, B:23:0x0064, B:25:0x0069, B:26:0x006c, B:28:0x0086, B:31:0x0092, B:33:0x00a0, B:35:0x00aa, B:38:0x00af, B:39:0x00b6, B:40:0x00b7, B:41:0x00b9, B:44:0x00de, B:49:0x00eb, B:50:0x00f4, B:52:0x00f8, B:54:0x0109, B:55:0x0114, B:56:0x011c, B:57:0x0129, B:58:0x0132, B:60:0x0144), top: B:66:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd.a(java.util.Map):void");
    }

    private final String a(String str, String str2) {
        String str3;
        if (qx.a(this)) {
            return null;
        }
        try {
            String str4 = str2;
            int length = str4.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = dqc.a(str4.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            String obj = str4.subSequence(i, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (dqc.a((Object) "em", (Object) str)) {
                    return Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches() ? lowerCase : "";
                } else if (dqc.a((Object) "ph", (Object) str)) {
                    return new dsf("[^0-9]").a(lowerCase, "");
                } else if (!dqc.a((Object) "ge", (Object) str)) {
                    return lowerCase;
                } else {
                    if (!(lowerCase.length() > 0)) {
                        str3 = "";
                    } else if (lowerCase == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    } else {
                        str3 = lowerCase.substring(0, 1);
                        dqc.b(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    return (dqc.a((Object) "f", (Object) str3) || dqc.a((Object) "m", (Object) str3)) ? str3 : "";
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
