package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenManager;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0016J(\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002J\r\u0010%\u001a\u00020\nH\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u001aH\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006,"}, d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "token", "", "expectedNonce", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "claims", "Lcom/facebook/AuthenticationTokenClaims;", "getClaims", "()Lcom/facebook/AuthenticationTokenClaims;", "getExpectedNonce", "()Ljava/lang/String;", "header", "Lcom/facebook/AuthenticationTokenHeader;", "getHeader", "()Lcom/facebook/AuthenticationTokenHeader;", "signature", "getSignature", "getToken", "describeContents", "", "equals", "", "other", "", "hashCode", "isValidSignature", "headerString", "claimsString", "sigString", "kid", "toJSONObject", "toJSONObject$facebook_core_release", "writeToParcel", "", "dest", "flags", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: lq  reason: default package */
/* loaded from: classes2.dex */
public final class lq implements Parcelable {
    final String a;
    final String b;
    final lt c;
    final ls d;
    final String e;
    public static final a f = new a((byte) 0);
    public static final Parcelable.Creator<lq> CREATOR = new b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public lq(String str, String str2) {
        dqc.d(str, "token");
        dqc.d(str2, "expectedNonce");
        qj.b(str, "token");
        qj.b(str2, "expectedNonce");
        List a2 = dsg.a(str, new String[]{"."}, 0, 6);
        if (!(a2.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str3 = (String) a2.get(0);
        String str4 = (String) a2.get(1);
        String str5 = (String) a2.get(2);
        this.a = str;
        this.b = str2;
        this.c = new lt(str3);
        this.d = new ls(str4, str2);
        if (!a(str3, str4, str5, this.c.a)) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.e = str5;
    }

    public lq(Parcel parcel) {
        dqc.d(parcel, "parcel");
        this.a = qj.a(parcel.readString(), "token");
        this.b = qj.a(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(lt.class.getClassLoader());
        if (readParcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.c = (lt) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(ls.class.getClassLoader());
        if (readParcelable2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.d = (ls) readParcelable2;
        this.e = qj.a(parcel.readString(), "signature");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        return dqc.a((Object) this.a, (Object) lqVar.a) && dqc.a((Object) this.b, (Object) lqVar.b) && dqc.a(this.c, lqVar.c) && dqc.a(this.d, lqVar.d) && dqc.a((Object) this.e, (Object) lqVar.e);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }

    private static boolean a(String str, String str2, String str3, String str4) {
        try {
            String a2 = rg.a(str4);
            if (a2 == null) {
                return false;
            }
            PublicKey b2 = rg.b(a2);
            return rg.a(b2, str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/AuthenticationToken$Companion;", "", "()V", "AUTHENTICATION_TOKEN_KEY", "", "CLAIMS_KEY", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "EXPECTED_NONCE_KEY", "HEADER_KEY", "SIGNATURE_KEY", "TOKEN_STRING_KEY", "getCurrentAuthenticationToken", "setCurrentAuthenticationToken", "", "authenticationToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lq$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/AuthenticationToken$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/AuthenticationToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lq$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<lq> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ lq createFromParcel(Parcel parcel) {
            dqc.d(parcel, "source");
            return new lq(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ lq[] newArray(int i) {
            return new lq[i];
        }
    }

    public static final void a(lq lqVar) {
        AuthenticationTokenManager a2 = AuthenticationTokenManager.d.a();
        lq lqVar2 = a2.a;
        a2.a = lqVar;
        if (lqVar != null) {
            lr lrVar = a2.c;
            dqc.d(lqVar, "authenticationToken");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token_string", lqVar.a);
                jSONObject.put("expected_nonce", lqVar.b);
                jSONObject.put("header", lqVar.c.a());
                jSONObject.put("claims", lqVar.d.a());
                jSONObject.put("signature", lqVar.e);
                lrVar.a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", jSONObject.toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            a2.c.a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            qi.b(ly.k());
        }
        if (!qi.a(lqVar2, lqVar)) {
            Intent intent = new Intent(ly.k(), AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", lqVar2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", lqVar);
            a2.b.sendBroadcast(intent);
        }
    }
}
