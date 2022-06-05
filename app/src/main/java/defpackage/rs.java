package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.common.R;
import defpackage.pj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rs  reason: default package */
/* loaded from: classes2.dex */
public final class rs implements Parcelable {
    public static final Parcelable.Creator<rs> CREATOR = new Parcelable.Creator<rs>() { // from class: rs.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ rs[] newArray(int i) {
            return new rs[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ rs createFromParcel(Parcel parcel) {
            return new rs(parcel);
        }
    };
    rx[] a;
    int b;
    Fragment c;
    b d;
    a e;
    boolean f;
    c g;
    Map<String, String> h;
    Map<String, String> i;
    int j;
    int k;
    private rv l;

    /* renamed from: rs$a */
    /* loaded from: classes2.dex */
    interface a {
        void a();

        void b();
    }

    /* renamed from: rs$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(d dVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public rs(Fragment fragment) {
        this.b = -1;
        this.j = 0;
        this.k = 0;
        this.c = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FragmentActivity a() {
        return this.c.getActivity();
    }

    public final c b() {
        return this.g;
    }

    public static int c() {
        return pj.c.Login.toRequestCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rx d() {
        int i = this.b;
        if (i >= 0) {
            return this.a[i];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f) {
            return true;
        }
        if (this.c.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            this.f = true;
            return true;
        }
        FragmentActivity activity = this.c.getActivity();
        b(d.a(this.g, activity.getString(R.string.com_facebook_internet_permission_error_title), activity.getString(R.string.com_facebook_internet_permission_error_message)));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        boolean z;
        if (this.b >= 0) {
            a(d().a(), "skipped", null, null, d().b);
        }
        do {
            rx[] rxVarArr = this.a;
            if (rxVarArr != null) {
                int i = this.b;
                z = true;
                if (i < rxVarArr.length - 1) {
                    this.b = i + 1;
                    rx d2 = d();
                    if (d2.f() && !e()) {
                        a("no_internet_permission", "1", false);
                    } else {
                        int a2 = d2.a(this.g);
                        this.j = 0;
                        if (a2 > 0) {
                            rv j = j();
                            String str = this.g.e;
                            String a3 = d2.a();
                            String str2 = this.g.m ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!qx.a(j)) {
                                try {
                                    Bundle a4 = rv.a(str);
                                    a4.putString("3_method", a3);
                                    j.a.c(str2, a4);
                                } catch (Throwable th) {
                                    qx.a(th, j);
                                }
                            }
                            this.k = a2;
                        } else {
                            rv j2 = j();
                            String str3 = this.g.e;
                            String a5 = d2.a();
                            String str4 = this.g.m ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!qx.a(j2)) {
                                try {
                                    Bundle a6 = rv.a(str3);
                                    a6.putString("3_method", a5);
                                    j2.a.c(str4, a6);
                                } catch (Throwable th2) {
                                    qx.a(th2, j2);
                                }
                            }
                            a("not_tried", d2.a(), true);
                        }
                        if (a2 > 0) {
                            continue;
                        }
                    }
                    z = false;
                    continue;
                }
            }
            c cVar = this.g;
            if (cVar == null) {
                return;
            }
            b(d.a(cVar, "Login attempt failed.", (String) null));
            return;
        } while (!z);
    }

    private void a(String str, String str2, boolean z) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        if (this.h.containsKey(str) && z) {
            str2 = this.h.get(str) + "," + str2;
        }
        this.h.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(d dVar) {
        if (dVar.b != null && lk.d()) {
            c(dVar);
        } else {
            b(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(d dVar) {
        rx d2 = d();
        if (d2 != null) {
            a(d2.a(), dVar, d2.b);
        }
        Map<String, String> map = this.h;
        if (map != null) {
            dVar.g = map;
        }
        Map<String, String> map2 = this.i;
        if (map2 != null) {
            dVar.h = map2;
        }
        this.a = null;
        this.b = -1;
        this.g = null;
        this.h = null;
        this.j = 0;
        this.k = 0;
        d(dVar);
    }

    private void c(d dVar) {
        d dVar2;
        if (dVar.b == null) {
            throw new FacebookException("Can't validate without a token");
        }
        lk c2 = lk.c();
        lk lkVar = dVar.b;
        if (c2 != null && lkVar != null) {
            try {
                if (c2.i.equals(lkVar.i)) {
                    dVar2 = d.a(this.g, dVar.b, dVar.c);
                    b(dVar2);
                }
            } catch (Exception e) {
                b(d.a(this.g, "Caught exception", e.getMessage()));
                return;
            }
        }
        dVar2 = d.a(this.g, "User logged in as different Facebook user.", (String) null);
        b(dVar2);
    }

    private rv j() {
        rv rvVar = this.l;
        if (rvVar == null || !rvVar.a().equals(this.g.d)) {
            this.l = new rv(this.c.getActivity(), this.g.d);
        }
        return this.l;
    }

    private void d(d dVar) {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b();
        }
    }

    private void a(String str, d dVar, Map<String, String> map) {
        a(str, dVar.a.getLoggingValue(), dVar.d, dVar.e, map);
    }

    private void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5 = "fb_mobile_login_method_complete";
        if (this.g == null) {
            j().a(str5, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        rv j = j();
        String str6 = this.g.e;
        if (this.g.m) {
            str5 = "foa_mobile_login_method_complete";
        }
        j.a(str6, str, str2, str3, str4, map, str5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: rs$c */
    /* loaded from: classes2.dex */
    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: rs.c.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ c[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ c createFromParcel(Parcel parcel) {
                return new c(parcel, (byte) 0);
            }
        };
        final rr a;
        Set<String> b;
        final rj c;
        final String d;
        String e;
        boolean f;
        String g;
        String h;
        String i;
        String j;
        boolean k;
        final rz l;
        boolean m;
        boolean n;
        String o;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* synthetic */ c(Parcel parcel, byte b) {
            this(parcel);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(rr rrVar, Set<String> set, rj rjVar, String str, String str2, String str3, rz rzVar, String str4) {
            this.f = false;
            this.m = false;
            this.n = false;
            this.a = rrVar;
            this.b = set == null ? new HashSet<>() : set;
            this.c = rjVar;
            this.h = str;
            this.d = str2;
            this.e = str3;
            this.l = rzVar;
            if (qi.a(str4)) {
                this.o = UUID.randomUUID().toString();
            } else {
                this.o = str4;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final Set<String> a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Set<String> set) {
            qj.a((Object) set, "permissions");
            this.b = set;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final rr b() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final rj c() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String d() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String e() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean f() {
            return this.m;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean g() {
            return this.n;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String h() {
            return this.h;
        }

        public final String i() {
            return this.j;
        }

        public final boolean j() {
            return this.k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean k() {
            for (String str : this.b) {
                if (rw.a(str)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean l() {
            return this.l == rz.INSTAGRAM;
        }

        public final String m() {
            return this.o;
        }

        private c(Parcel parcel) {
            boolean z = false;
            this.f = false;
            this.m = false;
            this.n = false;
            String readString = parcel.readString();
            rz rzVar = null;
            this.a = readString != null ? rr.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.c = readString2 != null ? rj.valueOf(readString2) : null;
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readByte() != 0;
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readByte() != 0;
            String readString3 = parcel.readString();
            this.l = readString3 != null ? rz.valueOf(readString3) : rzVar;
            this.m = parcel.readByte() != 0;
            this.n = parcel.readByte() != 0 ? true : z;
            this.o = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            rr rrVar = this.a;
            String str = null;
            parcel.writeString(rrVar != null ? rrVar.name() : null);
            parcel.writeStringList(new ArrayList(this.b));
            rj rjVar = this.c;
            parcel.writeString(rjVar != null ? rjVar.name() : null);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
            rz rzVar = this.l;
            if (rzVar != null) {
                str = rzVar.name();
            }
            parcel.writeString(str);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeString(this.o);
        }
    }

    /* renamed from: rs$d */
    /* loaded from: classes2.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: rs.d.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ d[] newArray(int i) {
                return new d[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ d createFromParcel(Parcel parcel) {
                return new d(parcel, (byte) 0);
            }
        };
        final a a;
        final lk b;
        final lq c;
        final String d;
        final String e;
        final c f;
        public Map<String, String> g;
        public Map<String, String> h;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* synthetic */ d(Parcel parcel, byte b) {
            this(parcel);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: rs$d$a */
        /* loaded from: classes2.dex */
        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            private final String loggingValue;

            a(String str) {
                this.loggingValue = str;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        private d(c cVar, a aVar, lk lkVar, String str, String str2) {
            this(cVar, aVar, lkVar, null, str, str2);
        }

        private d(c cVar, a aVar, lk lkVar, lq lqVar, String str, String str2) {
            qj.a(aVar, "code");
            this.f = cVar;
            this.b = lkVar;
            this.c = lqVar;
            this.d = str;
            this.a = aVar;
            this.e = str2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static d a(c cVar, lk lkVar) {
            return new d(cVar, a.SUCCESS, lkVar, null, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static d a(c cVar, lk lkVar, lq lqVar) {
            return new d(cVar, a.SUCCESS, lkVar, lqVar, null, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static d a(c cVar, String str) {
            return new d(cVar, a.CANCEL, null, str, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static d a(c cVar, String str, String str2) {
            return a(cVar, str, str2, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static d a(c cVar, String str, String str2, String str3) {
            return new d(cVar, a.ERROR, null, TextUtils.join(": ", qi.a(str, str2)), str3);
        }

        private d(Parcel parcel) {
            this.a = a.valueOf(parcel.readString());
            this.b = (lk) parcel.readParcelable(lk.class.getClassLoader());
            this.c = (lq) parcel.readParcelable(lq.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = (c) parcel.readParcelable(c.class.getClassLoader());
            this.g = qi.a(parcel);
            this.h = qi.a(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a.name());
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
            qi.a(parcel, this.g);
            qi.a(parcel, this.h);
        }
    }

    public rs(Parcel parcel) {
        this.b = -1;
        this.j = 0;
        this.k = 0;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(rx.class.getClassLoader());
        this.a = new rx[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            rx[] rxVarArr = this.a;
            rxVarArr[i] = (rx) readParcelableArray[i];
            rx rxVar = rxVarArr[i];
            dqc.d(this, "<set-?>");
            rxVar.c = this;
        }
        this.b = parcel.readInt();
        this.g = (c) parcel.readParcelable(c.class.getClassLoader());
        this.h = qi.a(parcel);
        this.i = qi.a(parcel);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.g, i);
        qi.a(parcel, this.h);
        qi.a(parcel, this.i);
    }
}
