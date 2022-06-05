package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import defpackage.qe;
import defpackage.qi;
import defpackage.rs;
import defpackage.rx;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTokenClient", "Lcom/facebook/login/GetTokenClient;", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", "cancel", "", "complete", "request", "Lcom/facebook/login/LoginClient$Request;", "result", "Landroid/os/Bundle;", "describeContents", "", "getTokenCompleted", "onComplete", "tryAuthorize", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ro  reason: default package */
/* loaded from: classes2.dex */
public final class ro extends rx {
    private rn e;
    private final String f = "get_token";
    public static final a a = new a((byte) 0);
    public static final Parcelable.Creator<ro> CREATOR = new b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(rs rsVar) {
        super(rsVar);
        dqc.d(rsVar, "loginClient");
    }

    @Override // defpackage.rx
    public final String a() {
        return this.f;
    }

    @Override // defpackage.rx
    public final void b() {
        rn rnVar = this.e;
        if (rnVar != null) {
            rnVar.c = false;
            rnVar.b = null;
            this.e = null;
        }
    }

    @Override // defpackage.rx
    public final int a(rs.c cVar) {
        dqc.d(cVar, "request");
        FragmentActivity a2 = e().a();
        dqc.b(a2, "loginClient.activity");
        rn rnVar = new rn(a2, cVar);
        this.e = rnVar;
        if (rnVar == null || rnVar.a()) {
            e().g();
            d dVar = new d(cVar);
            rn rnVar2 = this.e;
            if (rnVar2 == null) {
                return 1;
            }
            rnVar2.b = dVar;
            return 1;
        }
        return 0;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Landroid/os/Bundle;", "completed"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ro$d */
    /* loaded from: classes2.dex */
    static final class d implements qe.a {
        final /* synthetic */ rs.c b;

        d(rs.c cVar) {
            this.b = cVar;
        }

        @Override // defpackage.qe.a
        public final void a(Bundle bundle) {
            ro.this.a(this.b, bundle);
        }
    }

    public final void a(rs.c cVar, Bundle bundle) {
        dqc.d(cVar, "request");
        rn rnVar = this.e;
        if (rnVar != null) {
            rnVar.b = null;
        }
        this.e = null;
        e().h();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            dnc dncVar = stringArrayList != null ? stringArrayList : dnc.a;
            dne a2 = cVar.a();
            if (a2 == null) {
                a2 = dne.a;
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            boolean z = false;
            if (a2.contains("openid")) {
                String str = string;
                if (str == null || str.length() == 0) {
                    e().f();
                    return;
                }
            }
            if (dncVar.containsAll(a2)) {
                dqc.d(cVar, "request");
                dqc.d(bundle, "result");
                String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string2 == null || string2.length() == 0) {
                    z = true;
                }
                if (z) {
                    e().g();
                    String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                    if (string3 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    qi.a(string3, (qi.a) new c(bundle, cVar));
                    return;
                }
                b(cVar, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str2 : a2) {
                if (!dncVar.contains(str2)) {
                    hashSet.add(str2);
                }
            }
            if (!hashSet.isEmpty()) {
                a("new_permissions", TextUtils.join(",", hashSet));
            }
            cVar.a(hashSet);
        }
        e().f();
    }

    public final void b(rs.c cVar, Bundle bundle) {
        rs.d dVar;
        lo loVar;
        String d2;
        Date a2;
        ArrayList<String> stringArrayList;
        String string;
        Date a3;
        lk lkVar;
        String string2;
        dqc.d(cVar, "request");
        dqc.d(bundle, "result");
        try {
            loVar = lo.FACEBOOK_APPLICATION_SERVICE;
            d2 = cVar.d();
            dqc.b(d2, "request.applicationId");
            dqc.d(bundle, "bundle");
            dqc.d(d2, "applicationId");
            a2 = qi.a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            a3 = qi.a(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        } catch (FacebookException e) {
            dVar = rs.d.a(e().b(), (String) null, e.getMessage());
        }
        if (string != null) {
            boolean z = true;
            if (!(string.length() == 0) && (string2 = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                if (string2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    lkVar = new lk(string, d2, string2, stringArrayList, null, null, loVar, a2, new Date(), a3, bundle.getString("graph_domain"));
                    dVar = rs.d.a(cVar, lkVar, rx.a.a(bundle, cVar.m()));
                    e().a(dVar);
                }
            }
        }
        lkVar = null;
        dVar = rs.d.a(cVar, lkVar, rx.a.a(bundle, cVar.m()));
        e().a(dVar);
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/facebook/login/GetTokenLoginMethodHandler$complete$1", "Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "onFailure", "", "error", "Lcom/facebook/FacebookException;", "onSuccess", "userInfo", "Lorg/json/JSONObject;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ro$c */
    /* loaded from: classes2.dex */
    public static final class c implements qi.a {
        final /* synthetic */ Bundle b;
        final /* synthetic */ rs.c c;

        c(Bundle bundle, rs.c cVar) {
            this.b = bundle;
            this.c = cVar;
        }

        @Override // defpackage.qi.a
        public final void a(JSONObject jSONObject) {
            try {
                this.b.putString("com.facebook.platform.extra.USER_ID", jSONObject != null ? jSONObject.getString("id") : null);
                ro.this.b(this.c, this.b);
            } catch (JSONException e) {
                ro.this.e().b(rs.d.a(ro.this.e().b(), "Caught exception", e.getMessage()));
            }
        }

        @Override // defpackage.qi.a
        public final void a(FacebookException facebookException) {
            ro.this.e().b(rs.d.a(ro.this.e().b(), "Caught exception", facebookException != null ? facebookException.getMessage() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(Parcel parcel) {
        super(parcel);
        dqc.d(parcel, "source");
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/GetTokenLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ro$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/GetTokenLoginMethodHandler$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/GetTokenLoginMethodHandler;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/login/GetTokenLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ro$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<ro> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ro createFromParcel(Parcel parcel) {
            dqc.d(parcel, "source");
            return new ro(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ro[] newArray(int i) {
            return new ro[i];
        }
    }
}
