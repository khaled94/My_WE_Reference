package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import defpackage.lk;
import defpackage.qi;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*BO\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bB\u000f\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB\u000f\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cJ\b\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u0004\u0018\u00010\rJ\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001cH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006+"}, d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "id", "", "firstName", "middleName", "lastName", "name", "linkUri", "Landroid/net/Uri;", "pictureUri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getFirstName", "()Ljava/lang/String;", "getId", "getLastName", "getLinkUri", "()Landroid/net/Uri;", "getMiddleName", "getName", "getPictureUri", "describeContents", "", "equals", "", "other", "", "getProfilePictureUri", "width", "height", "hashCode", "toJSONObject", "writeToParcel", "", "dest", "flags", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mg  reason: default package */
/* loaded from: classes2.dex */
public final class mg implements Parcelable {
    private static final String i;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Uri g;
    private final Uri h;
    public static final a a = new a((byte) 0);
    public static final Parcelable.Creator<mg> CREATOR = new b();

    public static final void c() {
        a.a(null);
    }

    public static final void d() {
        a.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ mg(Parcel parcel, byte b2) {
        this(parcel);
    }

    public mg(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        qj.a(str, "id");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = uri;
        this.h = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg)) {
            return false;
        }
        return ((this.b == null && ((mg) obj).b == null) || dqc.a((Object) this.b, (Object) ((mg) obj).b)) && ((this.c == null && ((mg) obj).c == null) || dqc.a((Object) this.c, (Object) ((mg) obj).c)) && (((this.d == null && ((mg) obj).d == null) || dqc.a((Object) this.d, (Object) ((mg) obj).d)) && (((this.e == null && ((mg) obj).e == null) || dqc.a((Object) this.e, (Object) ((mg) obj).e)) && (((this.f == null && ((mg) obj).f == null) || dqc.a((Object) this.f, (Object) ((mg) obj).f)) && (((this.g == null && ((mg) obj).g == null) || dqc.a(this.g, ((mg) obj).g)) && ((this.h == null && ((mg) obj).h == null) || dqc.a(this.h, ((mg) obj).h))))));
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) + 527;
        String str2 = this.c;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.d;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.e;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.g;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.h;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            jSONObject.put("first_name", this.c);
            jSONObject.put("middle_name", this.d);
            jSONObject.put("last_name", this.e);
            jSONObject.put("name", this.f);
            if (this.g != null) {
                jSONObject.put("link_uri", this.g.toString());
            }
            if (this.h != null) {
                jSONObject.put("picture_uri", this.h.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public mg(JSONObject jSONObject) {
        dqc.d(jSONObject, "jsonObject");
        Uri uri = null;
        this.b = jSONObject.optString("id", null);
        this.c = jSONObject.optString("first_name", null);
        this.d = jSONObject.optString("middle_name", null);
        this.e = jSONObject.optString("last_name", null);
        this.f = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.g = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", null);
        this.h = optString2 != null ? Uri.parse(optString2) : uri;
    }

    private mg(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        String readString = parcel.readString();
        Uri uri = null;
        this.g = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.h = readString2 != null ? Uri.parse(readString2) : uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        dqc.d(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        Uri uri = this.g;
        String str = null;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.h;
        if (uri2 != null) {
            str = uri2.toString();
        }
        parcel.writeString(str);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/Profile$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/Profile;", "FIRST_NAME_KEY", "", "ID_KEY", "LAST_NAME_KEY", "LINK_URI_KEY", "MIDDLE_NAME_KEY", "NAME_KEY", "PICTURE_URI_KEY", "TAG", "fetchProfileForCurrentAccessToken", "", "getCurrentProfile", "setCurrentProfile", "profile", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mg$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static void a(mg mgVar) {
            mi.c.a().a(mgVar, true);
        }

        public static void a() {
            lk.b bVar = lk.l;
            lk a = lk.b.a();
            if (a == null) {
                return;
            }
            lk.b bVar2 = lk.l;
            if (!lk.b.b()) {
                a(null);
            } else {
                qi.a(a.e, (qi.a) new C0038a());
            }
        }

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/facebook/Profile$Companion$fetchProfileForCurrentAccessToken$1", "Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "onFailure", "", "error", "Lcom/facebook/FacebookException;", "onSuccess", "userInfo", "Lorg/json/JSONObject;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: mg$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0038a implements qi.a {
            C0038a() {
            }

            @Override // defpackage.qi.a
            public final void a(JSONObject jSONObject) {
                Uri uri = null;
                String optString = jSONObject != null ? jSONObject.optString("id") : null;
                if (optString == null) {
                    String unused = mg.i;
                    return;
                }
                String optString2 = jSONObject.optString("link");
                String optString3 = jSONObject.optString("profile_picture", null);
                String optString4 = jSONObject.optString("first_name");
                String optString5 = jSONObject.optString("middle_name");
                String optString6 = jSONObject.optString("last_name");
                String optString7 = jSONObject.optString("name");
                Uri parse = optString2 != null ? Uri.parse(optString2) : null;
                if (optString3 != null) {
                    uri = Uri.parse(optString3);
                }
                mg mgVar = new mg(optString, optString4, optString5, optString6, optString7, parse, uri);
                a aVar = mg.a;
                a.a(mgVar);
            }

            @Override // defpackage.qi.a
            public final void a(FacebookException facebookException) {
                String unused = mg.i;
                new StringBuilder("Got unexpected exception: ").append(facebookException);
            }
        }
    }

    static {
        String simpleName = mg.class.getSimpleName();
        dqc.b(simpleName, "Profile::class.java.simpleName");
        i = simpleName;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/Profile$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/Profile;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/Profile;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mg$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<mg> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ mg createFromParcel(Parcel parcel) {
            dqc.d(parcel, "source");
            return new mg(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ mg[] newArray(int i) {
            return new mg[i];
        }
    }
}
