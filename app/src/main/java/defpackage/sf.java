package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import defpackage.qk;
import defpackage.rs;

/* renamed from: sf  reason: default package */
/* loaded from: classes2.dex */
final class sf extends se {
    public static final Parcelable.Creator<sf> CREATOR = new Parcelable.Creator<sf>() { // from class: sf.2
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ sf[] newArray(int i) {
            return new sf[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ sf createFromParcel(Parcel parcel) {
            return new sf(parcel);
        }
    };
    private qk a;
    private String e;

    @Override // defpackage.rx
    public final String a() {
        return "web_view";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.rx
    public final boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sf(rs rsVar) {
        super(rsVar);
    }

    @Override // defpackage.se
    final lo b_() {
        return lo.WEB_VIEW;
    }

    @Override // defpackage.rx
    public final void b() {
        qk qkVar = this.a;
        if (qkVar != null) {
            qkVar.cancel();
            this.a = null;
        }
    }

    @Override // defpackage.rx
    public final int a(final rs.c cVar) {
        Bundle b = b(cVar);
        qk.d dVar = new qk.d() { // from class: sf.1
            @Override // defpackage.qk.d
            public final void a(Bundle bundle, FacebookException facebookException) {
                sf.this.b(cVar, bundle, facebookException);
            }
        };
        String i = rs.i();
        this.e = i;
        a("e2e", i);
        FragmentActivity activity = e().c.getActivity();
        boolean e = qi.e(activity);
        a aVar = new a(activity, cVar.d, b);
        aVar.f = this.e;
        aVar.h = e ? "fbconnect://chrome_os_success" : "fbconnect://success";
        aVar.g = cVar.h;
        aVar.i = cVar.a;
        aVar.j = cVar.l;
        aVar.k = cVar.m;
        aVar.l = cVar.n;
        aVar.d = dVar;
        this.a = aVar.a();
        pm pmVar = new pm();
        pmVar.setRetainInstance(true);
        pmVar.a = this.a;
        pmVar.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    final void b(rs.c cVar, Bundle bundle, FacebookException facebookException) {
        super.a(cVar, bundle, facebookException);
    }

    /* renamed from: sf$a */
    /* loaded from: classes2.dex */
    static class a extends qk.a {
        String f;
        String g;
        String h = "fbconnect://success";
        rr i = rr.NATIVE_WITH_FALLBACK;
        rz j = rz.FACEBOOK;
        boolean k = false;
        boolean l = false;

        public a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        @Override // defpackage.qk.a
        public final qk a() {
            Bundle bundle = this.e;
            bundle.putString("redirect_uri", this.h);
            bundle.putString("client_id", this.b);
            bundle.putString("e2e", this.f);
            bundle.putString("response_type", this.j == rz.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", this.g);
            bundle.putString("login_behavior", this.i.name());
            if (this.k) {
                bundle.putString("fx_app", this.j.toString());
            }
            if (this.l) {
                bundle.putString("skip_dedupe", "true");
            }
            return qk.a(this.a, "oauth", bundle, this.c, this.j, this.d);
        }
    }

    sf(Parcel parcel) {
        super(parcel);
        this.e = parcel.readString();
    }

    @Override // defpackage.rx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }
}
