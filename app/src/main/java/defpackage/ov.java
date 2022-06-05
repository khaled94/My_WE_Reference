package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/OnDeviceProcessingManager;", "", "()V", "ALLOWED_IMPLICIT_EVENTS", "", "", "isEventEligibleForOnDeviceProcessing", "", NotificationCompat.CATEGORY_EVENT, "Lcom/facebook/appevents/AppEvent;", "isOnDeviceProcessingEnabled", "sendCustomEventAsync", "", "applicationId", "sendInstallEventAsync", "preferencesName", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ov  reason: default package */
/* loaded from: classes2.dex */
public final class ov {
    public static final ov a = new ov();
    private static final Set<String> b = dnm.a((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    private ov() {
    }

    public static final boolean a() {
        if (qx.a(ov.class)) {
            return false;
        }
        try {
            if (!ly.b(ly.k()) && !qi.h()) {
                if (ox.a()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, ov.class);
            return false;
        }
    }

    public static final void a(String str, String str2) {
        if (qx.a(ov.class)) {
            return;
        }
        try {
            Context k = ly.k();
            if (k == null || str == null) {
                return;
            }
            ly.a().execute(new b(k, str2, str));
        } catch (Throwable th) {
            qx.a(th, ov.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ov$b */
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        b(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.b, 0);
                String str = this.c + "pingForOnDevice";
                if (sharedPreferences.getLong(str, 0L) != 0) {
                    return;
                }
                ox.a(this.c);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, System.currentTimeMillis());
                edit.apply();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ov$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ mq b;

        a(String str, mq mqVar) {
            this.a = str;
            this.b = mqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                ox.a(this.a, dmq.a(this.b));
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a(String str, mq mqVar) {
        if (qx.a(ov.class)) {
            return;
        }
        try {
            dqc.d(str, "applicationId");
            dqc.d(mqVar, NotificationCompat.CATEGORY_EVENT);
            if (!a.a(mqVar)) {
                return;
            }
            ly.a().execute(new a(str, mqVar));
        } catch (Throwable th) {
            qx.a(th, ov.class);
        }
    }

    private final boolean a(mq mqVar) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return (mqVar.b ^ true) || (mqVar.b && b.contains(mqVar.c));
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }
}
