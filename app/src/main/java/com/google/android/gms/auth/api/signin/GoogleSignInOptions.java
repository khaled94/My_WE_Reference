package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.vc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends abb implements ReflectedParcelable, vc.d.f {
    public static final GoogleSignInOptions a;
    public static final GoogleSignInOptions b;
    final int h;
    private final ArrayList<Scope> k;
    private Account l;
    private boolean m;
    private final boolean n;
    private final boolean o;
    private String p;
    private String q;
    private ArrayList<tn> r;
    private String s;
    private Map<Integer, tn> t;
    public static final Scope c = new Scope("profile");
    public static final Scope d = new Scope(NotificationCompat.CATEGORY_EMAIL);
    public static final Scope e = new Scope("openid");
    public static final Scope f = new Scope("https://www.googleapis.com/auth/games_lite");
    public static final Scope g = new Scope("https://www.googleapis.com/auth/games");
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new uo();
    private static Comparator<Scope> j = new un();

    static {
        a aVar = new a();
        aVar.b();
        aVar.a.add(c);
        a = aVar.c();
        a aVar2 = new a();
        aVar2.a(f, new Scope[0]);
        b = aVar2.c();
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<tn> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, b(arrayList2), str3);
    }

    /* synthetic */ GoogleSignInOptions(ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    public static GoogleSignInOptions a(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, optString2, str2, new HashMap(), (String) null);
    }

    private ArrayList<Scope> b() {
        return new ArrayList<>(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Integer, tn> b(List<tn> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (tn tnVar : list) {
            hashMap.put(Integer.valueOf(tnVar.b), tnVar);
        }
        return hashMap;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.k, j);
            Iterator<Scope> it = this.k.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().b);
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.l;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.m);
            jSONObject.put("forceCodeForRefreshToken", this.o);
            jSONObject.put("serverAuthRequested", this.n);
            if (!TextUtils.isEmpty(this.p)) {
                jSONObject.put("serverClientId", this.p);
            }
            if (!TextUtils.isEmpty(this.q)) {
                jSONObject.put("hostedDomain", this.q);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r1.equals(r4.l) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList<tn> r1 = r3.r     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 > 0) goto L7f
            java.util.ArrayList<tn> r1 = r4.r     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 <= 0) goto L17
            goto L7f
        L17:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.k     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.b()     // Catch: java.lang.ClassCastException -> L7f
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.k     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.b()     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L34
            goto L7f
        L34:
            android.accounts.Account r1 = r3.l     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L3d
            android.accounts.Account r1 = r4.l     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L7f
            goto L45
        L3d:
            android.accounts.Account r2 = r4.l     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
        L45:
            java.lang.String r1 = r3.p     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L56
            java.lang.String r1 = r4.p     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
            goto L61
        L56:
            java.lang.String r1 = r3.p     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r2 = r4.p     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L61
            goto L7f
        L61:
            boolean r1 = r3.o     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.o     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.m     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.m     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.n     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.n     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.lang.String r1 = r3.s     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r4 = r4.s     // Catch: java.lang.ClassCastException -> L7f
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L7f
            if (r4 == 0) goto L7f
            r4 = 1
            return r4
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.k;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).b);
        }
        Collections.sort(arrayList);
        to toVar = new to();
        toVar.a(arrayList);
        toVar.a(this.l);
        toVar.a(this.p);
        toVar.a(this.o);
        toVar.a(this.m);
        toVar.a(this.n);
        toVar.a(this.s);
        return toVar.b;
    }

    /* loaded from: classes.dex */
    public static final class a {
        Set<Scope> a;
        public String b;
        private boolean c;
        private boolean d;
        private boolean e;
        private String f;
        private Account g;
        private String h;
        private Map<Integer, tn> i;

        public a() {
            this.a = new HashSet();
            this.i = new HashMap();
        }

        private final String c(String str) {
            aat.a(str);
            String str2 = this.f;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            aat.a(z, "two different server client ids provided");
            return str;
        }

        public final a a() {
            this.a.add(GoogleSignInOptions.d);
            return this;
        }

        public final a a(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public final a a(String str) {
            this.e = true;
            c(str);
            this.f = str;
            return this;
        }

        public final a b() {
            this.a.add(GoogleSignInOptions.e);
            return this;
        }

        public final GoogleSignInOptions c() {
            if (this.a.contains(GoogleSignInOptions.g) && this.a.contains(GoogleSignInOptions.f)) {
                this.a.remove(GoogleSignInOptions.f);
            }
            if (this.e && (this.g == null || !this.a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.a), this.g, this.e, this.c, this.d, this.f, this.h, this.i, this.b);
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet();
            this.i = new HashMap();
            aat.a(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.k);
            this.c = googleSignInOptions.n;
            this.d = googleSignInOptions.o;
            this.e = googleSignInOptions.m;
            this.f = googleSignInOptions.p;
            this.g = googleSignInOptions.l;
            this.h = googleSignInOptions.q;
            this.i = GoogleSignInOptions.b(googleSignInOptions.r);
            this.b = googleSignInOptions.s;
        }

        public final a b(String str) {
            this.c = true;
            c(str);
            this.f = str;
            this.d = false;
            return this;
        }
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, tn> map, String str3) {
        this.h = i;
        this.k = arrayList;
        this.l = account;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = str;
        this.q = str2;
        this.r = new ArrayList<>(map.values());
        this.t = map;
        this.s = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.h);
        abc.c(parcel, 2, b());
        abc.a(parcel, 3, this.l, i);
        abc.a(parcel, 4, this.m);
        abc.a(parcel, 5, this.n);
        abc.a(parcel, 6, this.o);
        abc.a(parcel, 7, this.p);
        abc.a(parcel, 8, this.q);
        abc.c(parcel, 9, this.r);
        abc.a(parcel, 10, this.s);
        abc.b(parcel, a2);
    }
}
