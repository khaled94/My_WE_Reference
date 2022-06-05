package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import defpackage.rs;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/facebook/login/FacebookLiteLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", "describeContents", "", "tryAuthorize", "request", "Lcom/facebook/login/LoginClient$Request;", "writeToParcel", "", "dest", "flags", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: rm  reason: default package */
/* loaded from: classes2.dex */
public final class rm extends sa {
    private final String e = "fb_lite_login";
    public static final a a = new a((byte) 0);
    public static final Parcelable.Creator<rm> CREATOR = new b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(rs rsVar) {
        super(rsVar);
        dqc.d(rsVar, "loginClient");
    }

    @Override // defpackage.rx
    public final String a() {
        return this.e;
    }

    @Override // defpackage.rx
    public final int a(rs.c cVar) {
        dqc.d(cVar, "request");
        String i = rs.i();
        FragmentActivity a2 = e().a();
        dqc.b(a2, "loginClient.activity");
        String d = cVar.d();
        dqc.b(d, "request.applicationId");
        Set<String> a3 = cVar.a();
        dqc.b(a3, "request.permissions");
        dqc.b(i, "e2e");
        boolean k = cVar.k();
        rj c = cVar.c();
        dqc.b(c, "request.defaultAudience");
        String e = cVar.e();
        dqc.b(e, "request.authId");
        String a4 = a(e);
        String h = cVar.h();
        dqc.b(h, "request.authType");
        Intent a5 = qd.a(a2, d, a3, i, k, c, a4, h, cVar.i(), cVar.j(), cVar.f(), cVar.g());
        a("e2e", i);
        return a(a5, rs.c()) ? 1 : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(Parcel parcel) {
        super(parcel);
        dqc.d(parcel, "source");
    }

    @Override // defpackage.rx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "dest");
        super.writeToParcel(parcel, i);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/FacebookLiteLoginMethodHandler$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/FacebookLiteLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rm$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/FacebookLiteLoginMethodHandler$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/FacebookLiteLoginMethodHandler;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/login/FacebookLiteLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rm$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<rm> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ rm createFromParcel(Parcel parcel) {
            dqc.d(parcel, "source");
            return new rm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ rm[] newArray(int i) {
            return new rm[i];
        }
    }
}
