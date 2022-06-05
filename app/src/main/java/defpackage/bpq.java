package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: bpq */
/* loaded from: classes2.dex */
public final class bpq extends brh {
    static final Pair<String, Long> a = new Pair<>("", 0L);
    SharedPreferences b;
    public bpt c;
    public boolean t;
    private String x;
    private boolean y;
    private long z;
    public final bpu d = new bpu(this, "last_upload", 0);
    public final bpu e = new bpu(this, "last_upload_attempt", 0);
    public final bpu f = new bpu(this, "backoff", 0);
    public final bpu g = new bpu(this, "last_delete_stale", 0);
    public final bpu l = new bpu(this, "time_before_start", 10000);
    public final bpu m = new bpu(this, "session_timeout", 1800000);
    public final bps n = new bps(this, "start_new_session", true);
    public final bpu r = new bpu(this, "last_pause_time", 0);
    public final bpu s = new bpu(this, "time_active", 0);
    public final bpw o = new bpw(this, "non_personalized_ads");
    public final bps p = new bps(this, "use_dynamite_api", false);
    public final bps q = new bps(this, "allow_remote_dynamite", false);
    public final bpu h = new bpu(this, "midnight_offset", 0);
    public final bpu i = new bpu(this, "first_open_time", 0);
    public final bpu j = new bpu(this, "app_install_time", 0);
    public final bpw k = new bpw(this, "app_instance_id");
    public bps u = new bps(this, "app_backgrounded", false);
    public bpu v = new bpu(this, "deep_link_last_retrieved", -1);

    public final Pair<String, Boolean> a(String str) {
        c();
        long b = l().b();
        if (this.x != null && b < this.z) {
            return new Pair<>(this.x, Boolean.valueOf(this.y));
        }
        this.z = b + s().a(str, blk.e);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(m());
            if (advertisingIdInfo != null) {
                this.x = advertisingIdInfo.getId();
                this.y = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.x == null) {
                this.x = "";
            }
        } catch (Exception e) {
            q().j.a("Unable to get advertising id", e);
            this.x = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.x, Boolean.valueOf(this.y));
    }

    @Override // defpackage.brh
    protected final boolean d() {
        return true;
    }

    public final String b(String str) {
        c();
        String str2 = (String) a(str).first;
        MessageDigest h = buv.h();
        if (h == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, h.digest(str2.getBytes())));
    }

    public bpq(bql bqlVar) {
        super(bqlVar);
    }

    @Override // defpackage.brh
    protected final void e() {
        SharedPreferences sharedPreferences = m().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.t = z;
        if (!z) {
            SharedPreferences.Editor edit = this.b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.c = new bpt(this, "health_monitor", Math.max(0L, blk.f.a(null).longValue()), (byte) 0);
    }

    public final SharedPreferences f() {
        c();
        w();
        return this.b;
    }

    public final void c(String str) {
        c();
        SharedPreferences.Editor edit = f().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final String g() {
        c();
        return f().getString("gmp_app_id", null);
    }

    public final void d(String str) {
        c();
        SharedPreferences.Editor edit = f().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    public final String h() {
        c();
        return f().getString("admob_app_id", null);
    }

    public final Boolean i() {
        c();
        if (!f().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(f().getBoolean("use_service", false));
    }

    public final void a(boolean z) {
        c();
        q().k.a("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor edit = f().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    public final void j() {
        c();
        q().k.a("Clearing collection preferences.");
        if (s().d(null, blk.aj)) {
            Boolean t = t();
            SharedPreferences.Editor edit = f().edit();
            edit.clear();
            edit.apply();
            if (t == null) {
                return;
            }
            b(t.booleanValue());
            return;
        }
        boolean contains = f().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = c(true);
        }
        SharedPreferences.Editor edit2 = f().edit();
        edit2.clear();
        edit2.apply();
        if (!contains) {
            return;
        }
        b(z);
    }

    public final void b(boolean z) {
        c();
        q().k.a("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor edit = f().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    public final boolean c(boolean z) {
        c();
        return f().getBoolean("measurement_enabled", z);
    }

    public final Boolean t() {
        c();
        if (f().contains("measurement_enabled")) {
            return Boolean.valueOf(f().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String u() {
        c();
        String string = f().getString("previous_os_version", null);
        k().w();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = f().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final void d(boolean z) {
        c();
        q().k.a("Updating deferred analytics collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = f().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean a(long j) {
        return j - this.m.a() > this.r.a();
    }

    public static /* synthetic */ SharedPreferences a(bpq bpqVar) {
        return bpqVar.f();
    }
}
