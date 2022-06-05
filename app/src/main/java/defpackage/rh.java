package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.CustomTabMainActivity;
import defpackage.rs;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rh  reason: default package */
/* loaded from: classes2.dex */
public final class rh extends se {
    public static final Parcelable.Creator<rh> CREATOR = new Parcelable.Creator() { // from class: rh.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rh[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new rh(parcel);
        }
    };
    public static boolean a = false;
    private String e;
    private String f;
    private String g;

    @Override // defpackage.rx
    public final String a() {
        return "custom_tab";
    }

    @Override // defpackage.se
    protected final String d() {
        return "chrome_custom_tab";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rh(rs rsVar) {
        super(rsVar);
        this.g = "";
        this.f = qi.c();
        a = false;
        this.g = pl.a(super.c());
    }

    @Override // defpackage.se
    final lo b_() {
        return lo.CHROME_CUSTOM_TAB;
    }

    @Override // defpackage.se
    protected final String c() {
        return this.g;
    }

    @Override // defpackage.rx
    public final int a(rs.c cVar) {
        rs e = e();
        if (this.g.isEmpty()) {
            return 0;
        }
        Bundle a2 = a(b(cVar), cVar);
        if (a) {
            a2.putString("cct_over_app_switch", "1");
        }
        if (ly.a) {
            if (cVar.l()) {
                ri.a(py.a("oauth", a2));
            } else {
                ri.a(pk.a("oauth", a2));
            }
        }
        Intent intent = new Intent(e.c.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.a, "oauth");
        intent.putExtra(CustomTabMainActivity.b, a2);
        String str = CustomTabMainActivity.c;
        String str2 = this.e;
        if (str2 == null) {
            str2 = pl.a();
            this.e = str2;
        }
        intent.putExtra(str, str2);
        intent.putExtra(CustomTabMainActivity.e, cVar.l.toString());
        e.c.startActivityForResult(intent, 1);
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    @Override // defpackage.rx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 0
            if (r9 == 0) goto L10
            java.lang.String r1 = com.facebook.CustomTabMainActivity.g
            boolean r1 = r9.getBooleanExtra(r1, r0)
            if (r1 == 0) goto L10
            boolean r7 = super.a(r7, r8, r9)
            return r7
        L10:
            r1 = 1
            if (r7 == r1) goto L18
            boolean r7 = super.a(r7, r8, r9)
            return r7
        L18:
            rs r7 = r6.e()
            rs$c r7 = r7.g
            r2 = -1
            r3 = 0
            if (r8 != r2) goto Le7
            if (r9 == 0) goto L2b
            java.lang.String r8 = com.facebook.CustomTabMainActivity.d
            java.lang.String r8 = r9.getStringExtra(r8)
            goto L2c
        L2b:
            r8 = r3
        L2c:
            if (r8 == 0) goto Le6
            java.lang.String r9 = "fbconnect://cct."
            boolean r9 = r8.startsWith(r9)
            if (r9 != 0) goto L40
            java.lang.String r9 = super.c()
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto Le6
        L40:
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r9 = r8.getQuery()
            android.os.Bundle r9 = defpackage.qi.d(r9)
            java.lang.String r8 = r8.getFragment()
            android.os.Bundle r8 = defpackage.qi.d(r8)
            r9.putAll(r8)
            boolean r8 = r6.a(r9)
            if (r8 != 0) goto L69
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r9 = "Invalid state parameter"
            r8.<init>(r9)
            super.a(r7, r3, r8)
            goto Le6
        L69:
            java.lang.String r8 = "error"
            java.lang.String r8 = r9.getString(r8)
            if (r8 != 0) goto L77
            java.lang.String r8 = "error_type"
            java.lang.String r8 = r9.getString(r8)
        L77:
            java.lang.String r0 = "error_msg"
            java.lang.String r0 = r9.getString(r0)
            if (r0 != 0) goto L85
            java.lang.String r0 = "error_message"
            java.lang.String r0 = r9.getString(r0)
        L85:
            if (r0 != 0) goto L8d
            java.lang.String r0 = "error_description"
            java.lang.String r0 = r9.getString(r0)
        L8d:
            java.lang.String r4 = "error_code"
            java.lang.String r4 = r9.getString(r4)
            boolean r5 = defpackage.qi.a(r4)
            if (r5 != 0) goto L9e
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L9e
            goto L9f
        L9e:
            r4 = -1
        L9f:
            boolean r5 = defpackage.qi.a(r8)
            if (r5 == 0) goto Lb1
            boolean r5 = defpackage.qi.a(r0)
            if (r5 == 0) goto Lb1
            if (r4 != r2) goto Lb1
            super.a(r7, r9, r3)
            goto Le6
        Lb1:
            if (r8 == 0) goto Lcc
            java.lang.String r9 = "access_denied"
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lc3
            java.lang.String r9 = "OAuthAccessDeniedException"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto Lcc
        Lc3:
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            super.a(r7, r3, r8)
            goto Le6
        Lcc:
            r9 = 4201(0x1069, float:5.887E-42)
            if (r4 != r9) goto Ld9
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            super.a(r7, r3, r8)
            goto Le6
        Ld9:
            lx r9 = new lx
            r9.<init>(r4, r8, r0)
            com.facebook.FacebookServiceException r8 = new com.facebook.FacebookServiceException
            r8.<init>(r9, r0)
            super.a(r7, r3, r8)
        Le6:
            return r1
        Le7:
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            super.a(r7, r3, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh.a(int, int, android.content.Intent):boolean");
    }

    @Override // defpackage.rx
    public final void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f);
    }

    private boolean a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string != null) {
                return new JSONObject(string).getString("7_challenge").equals(this.f);
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    rh(Parcel parcel) {
        super(parcel);
        this.g = "";
        this.f = parcel.readString();
    }

    @Override // defpackage.rx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f);
    }
}
