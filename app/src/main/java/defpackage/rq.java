package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rs;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0011\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", "describeContents", "", "shouldKeepTrackOfMultipleIntents", "", "tryAuthorize", "request", "Lcom/facebook/login/LoginClient$Request;", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: rq  reason: default package */
/* loaded from: classes2.dex */
public final class rq extends sa {
    private final String e = "katana_proxy_auth";
    public static final a a = new a((byte) 0);
    public static final Parcelable.Creator<rq> CREATOR = new b();

    @Override // defpackage.rx
    public final boolean c_() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public rq(rs rsVar) {
        super(rsVar);
    }

    @Override // defpackage.rx
    public final String a() {
        return this.e;
    }

    @Override // defpackage.rx
    public final int a(rs.c cVar) {
        dqc.d(cVar, "request");
        boolean z = ly.b && pl.a() != null && cVar.b().allowsCustomTabAuth();
        String i = rs.i();
        e().a();
        String d = cVar.d();
        dqc.b(d, "request.applicationId");
        Set<String> a2 = cVar.a();
        dqc.b(a2, "request.permissions");
        dqc.b(i, "e2e");
        boolean k = cVar.k();
        rj c = cVar.c();
        dqc.b(c, "request.defaultAudience");
        String e = cVar.e();
        dqc.b(e, "request.authId");
        String a3 = a(e);
        String h = cVar.h();
        dqc.b(h, "request.authType");
        List<Intent> a4 = qd.a(d, a2, i, k, c, a3, h, z, cVar.i(), cVar.j(), cVar.f(), cVar.g(), cVar.m());
        a("e2e", i);
        int i2 = 0;
        for (Intent intent : a4) {
            if (a(intent, rs.c())) {
                return i2 + 1;
            }
            i2++;
        }
        return 0;
    }

    public rq(Parcel parcel) {
        super(parcel);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rq$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/KatanaProxyLoginMethodHandler$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rq$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<rq> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ rq createFromParcel(Parcel parcel) {
            dqc.d(parcel, "source");
            return new rq(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ rq[] newArray(int i) {
            return new rq[i];
        }
    }
}
