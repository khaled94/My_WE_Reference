package defpackage;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/InstallReferrerUtil;", "", "()V", "IS_REFERRER_UPDATED", "", "isUpdated", "", "()Z", "tryConnectReferrerInfo", "", "callback", "Lcom/facebook/internal/InstallReferrerUtil$Callback;", "tryUpdateReferrerInfo", "updateReferrer", "Callback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pz  reason: default package */
/* loaded from: classes2.dex */
public final class pz {
    public static final pz a = new pz();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/InstallReferrerUtil$Callback;", "", "onReceiveReferrerUrl", "", "s", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pz$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    private pz() {
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"com/facebook/internal/InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "onInstallReferrerServiceDisconnected", "", "onInstallReferrerSetupFinished", "responseCode", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pz$b */
    /* loaded from: classes2.dex */
    public static final class b implements InstallReferrerStateListener {
        final /* synthetic */ InstallReferrerClient a;
        final /* synthetic */ a b;

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
        }

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.a = installReferrerClient;
            this.b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(int i) {
            if (qx.a(this)) {
                return;
            }
            try {
                if (i != 0) {
                    if (i != 2) {
                        return;
                    }
                    pz pzVar = pz.a;
                    pz.a();
                    return;
                }
                try {
                    InstallReferrerClient installReferrerClient = this.a;
                    dqc.b(installReferrerClient, "referrerClient");
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    dqc.b(installReferrer, "referrerClient.installReferrer");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (dsg.a((CharSequence) installReferrer2, (CharSequence) "fb") || dsg.a((CharSequence) installReferrer2, (CharSequence) "facebook"))) {
                        this.b.a(installReferrer2);
                    }
                    pz pzVar2 = pz.a;
                    pz.a();
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a(a aVar) {
        dqc.d(aVar, "callback");
        if (!ly.k().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(ly.k()).build();
            try {
                build.startConnection(new b(build, aVar));
            } catch (Exception unused) {
            }
        }
    }

    public static final /* synthetic */ void a() {
        ly.k().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
