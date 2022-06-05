package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookException;
import defpackage.lk;
import defpackage.lz;
import defpackage.mb;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0005!\"#$%B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u001c\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/AccessTokenManager;", "", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "accessTokenCache", "Lcom/facebook/AccessTokenCache;", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/AccessTokenCache;)V", "value", "Lcom/facebook/AccessToken;", "currentAccessToken", "getCurrentAccessToken", "()Lcom/facebook/AccessToken;", "setCurrentAccessToken", "(Lcom/facebook/AccessToken;)V", "currentAccessTokenField", "lastAttemptedTokenExtendDate", "Ljava/util/Date;", "tokenRefreshInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentAccessTokenChanged", "", "extendAccessTokenIfNeeded", "loadCurrentAccessToken", "", "refreshCurrentAccessToken", "callback", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "refreshCurrentAccessTokenImpl", "sendCurrentAccessTokenChangedBroadcastIntent", "oldAccessToken", "saveToCache", "setTokenExpirationBroadcastAlarm", "shouldExtendAccessToken", "Companion", "FacebookRefreshTokenInfo", "InstagramRefreshTokenInfo", "RefreshResult", "RefreshTokenInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ln  reason: default package */
/* loaded from: classes2.dex */
public final class ln {
    public static final a c = new a((byte) 0);
    private static ln g;
    public lk a;
    final lm b;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private Date e = new Date(0);
    private final LocalBroadcastManager f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshResult;", "", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "dataAccessExpirationTime", "", "getDataAccessExpirationTime", "()Ljava/lang/Long;", "setDataAccessExpirationTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "expiresAt", "", "getExpiresAt", "()I", "setExpiresAt", "(I)V", "expiresIn", "getExpiresIn", "setExpiresIn", "graphDomain", "getGraphDomain", "setGraphDomain", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ln$d */
    /* loaded from: classes2.dex */
    public static final class d {
        String a;
        int b;
        int c;
        Long d;
        String e;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ln$e */
    /* loaded from: classes2.dex */
    public interface e {
        String a();

        String b();
    }

    public ln(LocalBroadcastManager localBroadcastManager, lm lmVar) {
        dqc.d(localBroadcastManager, "localBroadcastManager");
        dqc.d(lmVar, "accessTokenCache");
        this.f = localBroadcastManager;
        this.b = lmVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/facebook/AccessTokenManager$FacebookRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ln$b */
    /* loaded from: classes2.dex */
    public static final class b implements e {
        private final String a = "oauth/access_token";
        private final String b = "fb_extend_sso_token";

        @Override // defpackage.ln.e
        public final String a() {
            return this.a;
        }

        @Override // defpackage.ln.e
        public final String b() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/facebook/AccessTokenManager$InstagramRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ln$c */
    /* loaded from: classes2.dex */
    public static final class c implements e {
        private final String a = "refresh_access_token";
        private final String b = "ig_refresh_token";

        @Override // defpackage.ln.e
        public final String a() {
            return this.a;
        }

        @Override // defpackage.ln.e
        public final String b() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(lk lkVar, boolean z) {
        lk lkVar2 = this.a;
        this.a = lkVar;
        this.d.set(false);
        this.e = new Date(0L);
        if (z) {
            if (lkVar != null) {
                this.b.a(lkVar);
            } else {
                this.b.b();
                qi.b(ly.k());
            }
        }
        if (!qi.a(lkVar2, lkVar)) {
            a(lkVar2, lkVar);
            c();
        }
    }

    public final void a(lk lkVar, lk lkVar2) {
        Intent intent = new Intent(ly.k(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", lkVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", lkVar2);
        this.f.sendBroadcast(intent);
    }

    private static void c() {
        PendingIntent pendingIntent;
        Context k = ly.k();
        lk.b bVar = lk.l;
        lk a2 = lk.b.a();
        AlarmManager alarmManager = (AlarmManager) k.getSystemService(NotificationCompat.CATEGORY_ALARM);
        lk.b bVar2 = lk.l;
        if (lk.b.b()) {
            if ((a2 != null ? a2.a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(k, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            if (Build.VERSION.SDK_INT >= 23) {
                pendingIntent = PendingIntent.getBroadcast(k, 0, intent, 67108864);
            } else {
                pendingIntent = PendingIntent.getBroadcast(k, 0, intent, 0);
            }
            try {
                alarmManager.set(1, a2.a.getTime(), pendingIntent);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ln$f */
    /* loaded from: classes2.dex */
    public static final class f implements Runnable {
        final /* synthetic */ lk.a b = null;

        f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                ln.this.a(this.b);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/facebook/GraphRequestBatch;", "onBatchCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ln$g */
    /* loaded from: classes2.dex */
    public static final class g implements mb.a {
        final /* synthetic */ d b;
        final /* synthetic */ lk c;
        final /* synthetic */ lk.a d;
        final /* synthetic */ AtomicBoolean e;
        final /* synthetic */ Set f;
        final /* synthetic */ Set g;
        final /* synthetic */ Set h;

        g(d dVar, lk lkVar, lk.a aVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.b = dVar;
            this.c = lkVar;
            this.d = aVar;
            this.e = atomicBoolean;
            this.f = set;
            this.g = set2;
            this.h = set3;
        }

        @Override // defpackage.mb.a
        public final void a(mb mbVar) {
            Date date;
            dqc.d(mbVar, "it");
            String str = this.b.a;
            int i = this.b.b;
            Long l = this.b.d;
            String str2 = this.b.e;
            try {
                if (ln.c.a().a != null) {
                    lk lkVar = ln.c.a().a;
                    if ((lkVar != null ? lkVar.i : null) == this.c.i) {
                        if (!this.e.get() && str == null && i == 0) {
                            if (this.d != null) {
                                new FacebookException("Failed to refresh access token");
                            }
                        } else {
                            Date date2 = this.c.a;
                            if (this.b.b != 0) {
                                date2 = new Date(this.b.b * 1000);
                            } else if (this.b.c != 0) {
                                date2 = new Date((this.b.c * 1000) + new Date().getTime());
                            }
                            Date date3 = date2;
                            if (str == null) {
                                str = this.c.e;
                            }
                            String str3 = str;
                            String str4 = this.c.h;
                            String str5 = this.c.i;
                            Set<String> set = this.e.get() ? this.f : this.c.b;
                            Set<String> set2 = this.e.get() ? this.g : this.c.c;
                            Set<String> set3 = this.e.get() ? this.h : this.c.d;
                            lo loVar = this.c.f;
                            Date date4 = new Date();
                            if (l != null) {
                                date = new Date(l.longValue() * 1000);
                            } else {
                                date = this.c.j;
                            }
                            if (str2 == null) {
                                str2 = this.c.k;
                            }
                            ln.c.a().a(new lk(str3, str4, str5, set, set2, set3, loVar, date3, date4, date, str2), true);
                        }
                    }
                }
                if (this.d != null) {
                    new FacebookException("No current access token to refresh");
                }
            } finally {
                ln.this.d.set(false);
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/AccessTokenManager$Companion;", "", "()V", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "TOKEN_EXTEND_RETRY_SECONDS", "", "TOKEN_EXTEND_THRESHOLD_SECONDS", "instanceField", "Lcom/facebook/AccessTokenManager;", "createExtendAccessTokenRequest", "Lcom/facebook/GraphRequest;", "accessToken", "Lcom/facebook/AccessToken;", "callback", "Lcom/facebook/GraphRequest$Callback;", "createGrantedPermissionsRequest", "getInstance", "getRefreshTokenInfoForToken", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ln$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final ln a() {
            ln lnVar;
            ln lnVar2 = ln.g;
            if (lnVar2 == null) {
                synchronized (this) {
                    lnVar = ln.g;
                    if (lnVar == null) {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(ly.k());
                        dqc.b(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
                        ln lnVar3 = new ln(localBroadcastManager, new lm());
                        ln.g = lnVar3;
                        lnVar = lnVar3;
                    }
                }
                return lnVar;
            }
            return lnVar2;
        }

        static lz a(lk lkVar, lz.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            lz.c cVar = lz.k;
            lz a = lz.c.a(lkVar, "me/permissions", bVar);
            a.a(bundle);
            a.a(md.GET);
            return a;
        }

        static lz b(lk lkVar, lz.b bVar) {
            String str = lkVar.k;
            if (str == null) {
                str = "facebook";
            }
            b cVar = (str.hashCode() == 28903346 && str.equals("instagram")) ? new c() : new b();
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", cVar.b());
            bundle.putString("client_id", lkVar.h);
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            lz.c cVar2 = lz.k;
            lz a = lz.c.a(lkVar, cVar.a(), bVar);
            a.a(bundle);
            a.a(md.GET);
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ln$h */
    /* loaded from: classes2.dex */
    public static final class h implements lz.b {
        final /* synthetic */ AtomicBoolean a;
        final /* synthetic */ Set b;
        final /* synthetic */ Set c;
        final /* synthetic */ Set d;

        h(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.a = atomicBoolean;
            this.b = set;
            this.c = set2;
            this.d = set3;
        }

        @Override // defpackage.lz.b
        public final void a(mc mcVar) {
            JSONArray optJSONArray;
            dqc.d(mcVar, "response");
            JSONObject jSONObject = mcVar.a;
            if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null) {
                return;
            }
            this.a.set(true);
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("permission");
                    String optString2 = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                    if (!qi.a(optString) && !qi.a(optString2)) {
                        dqc.b(optString2, NotificationCompat.CATEGORY_STATUS);
                        Locale locale = Locale.US;
                        dqc.b(locale, "Locale.US");
                        if (optString2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = optString2.toLowerCase(locale);
                        dqc.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        if (lowerCase != null) {
                            int hashCode = lowerCase.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode == 280295099) {
                                    if (lowerCase.equals("granted")) {
                                        this.b.add(optString);
                                    }
                                } else if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                    this.c.add(optString);
                                }
                            } else if (lowerCase.equals("expired")) {
                                this.d.add(optString);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ln$i */
    /* loaded from: classes2.dex */
    public static final class i implements lz.b {
        final /* synthetic */ d a;

        i(d dVar) {
            this.a = dVar;
        }

        @Override // defpackage.lz.b
        public final void a(mc mcVar) {
            dqc.d(mcVar, "response");
            JSONObject jSONObject = mcVar.a;
            if (jSONObject == null) {
                return;
            }
            this.a.a = jSONObject.optString("access_token");
            this.a.b = jSONObject.optInt("expires_at");
            this.a.c = jSONObject.optInt("expires_in");
            this.a.d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
            this.a.e = jSONObject.optString("graph_domain", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r8 = this;
            lk r0 = r8.a
            if (r0 != 0) goto L5
            goto L35
        L5:
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r1 = r1.getTime()
            lo r3 = r0.f
            boolean r3 = r3.canExtendToken()
            if (r3 == 0) goto L35
            java.util.Date r3 = r8.e
            long r3 = r3.getTime()
            long r3 = r1 - r3
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L35
            java.util.Date r0 = r0.g
            long r3 = r0.getTime()
            long r1 = r1 - r3
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            if (r0 != 0) goto L39
            return
        L39:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            boolean r0 = defpackage.dqc.a(r0, r1)
            if (r0 == 0) goto L4c
            r0 = 0
            r8.a(r0)
            return
        L4c:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ln$f r1 = new ln$f
            r1.<init>()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.a():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(lk.a aVar) {
        lk lkVar = this.a;
        if (lkVar == null) {
            if (aVar == null) {
                return;
            }
            new FacebookException("No current access token to refresh");
        } else if (!this.d.compareAndSet(false, true)) {
            if (aVar == null) {
                return;
            }
            new FacebookException("Refresh already in progress");
        } else {
            this.e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            d dVar = new d();
            mb mbVar = new mb(a.a(lkVar, new h(atomicBoolean, hashSet, hashSet2, hashSet3)), a.b(lkVar, new i(dVar)));
            mbVar.a(new g(dVar, lkVar, aVar, atomicBoolean, hashSet, hashSet2, hashSet3));
            mbVar.a();
        }
    }
}
