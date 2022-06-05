package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: brs  reason: default package */
/* loaded from: classes2.dex */
public final class brs extends brc {
    public bsl a;
    private brn c;
    private boolean e;
    private final Set<brq> d = new CopyOnWriteArraySet();
    protected boolean b = true;
    private final AtomicReference<String> f = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public brs(bql bqlVar) {
        super(bqlVar);
    }

    @Override // defpackage.brc
    protected final boolean t() {
        return false;
    }

    public final void v() {
        if (m().getApplicationContext() instanceof Application) {
            ((Application) m().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.a);
        }
    }

    public final void a(boolean z) {
        B();
        p().a(new bsh(this, z));
    }

    public final void b(boolean z) {
        B();
        p().a(new bsg(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        if (s().d(f().v(), blk.ai)) {
            c();
            String a = r().o.a();
            if (a != null) {
                if ("unset".equals(a)) {
                    a("app", "_npa", (Object) null, l().a());
                } else {
                    a("app", "_npa", Long.valueOf("true".equals(a) ? 1L : 0L), l().a());
                }
            }
        }
        if (this.w.r() && this.b) {
            q().j.a("Recording app launch after enabling measurement for the first time (FE)");
            x();
            return;
        }
        q().j.a("Updating Scion state (FE)");
        g().w();
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, l().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, long j, Bundle bundle) {
        c();
        a(str, str2, j, bundle, true, this.c == null || buv.e(str2), false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String str4;
        long j2;
        long j3;
        String str5;
        String str6;
        String str7;
        int i;
        int i2;
        int i3;
        bst bstVar;
        ArrayList arrayList;
        Bundle bundle2;
        long j4;
        Class<?> cls;
        List<String> list;
        aat.a(str);
        if (!s().d(str3, blk.an)) {
            aat.a(str2);
        }
        aat.a(bundle);
        c();
        B();
        if (!this.w.r()) {
            q().j.a("Event not sent since app measurement is disabled");
        } else if (s().d(f().v(), blk.au) && (list = f().a) != null && !list.contains(str2)) {
            q().j.a("Dropping non-safelisted event. event name, origin", str2, str);
        } else {
            int i4 = 0;
            if (!this.e) {
                this.e = true;
                try {
                    if (!this.w.d) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, m().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, m());
                    } catch (Exception e) {
                        q().f.a("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException unused) {
                    q().i.a("Tag Manager is not found and thus will not be used");
                }
            }
            if (s().d(f().v(), blk.aB) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
                a("auto", "_lgclid", bundle.getString("gclid"), l().a());
            }
            if (z3 && !"_iap".equals(str2)) {
                buv e2 = this.w.e();
                int i5 = 2;
                if (e2.a(NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (!e2.a(NotificationCompat.CATEGORY_EVENT, brm.a, str2)) {
                        i5 = 13;
                    } else if (e2.a(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                        i5 = 0;
                    }
                }
                if (i5 != 0) {
                    q().e.a("Invalid public event name. Event will not be logged (FE)", n().a(str2));
                    this.w.e();
                    this.w.e().a(i5, "_ev", buv.a(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
            bst v = h().v();
            if (v != null && !bundle.containsKey("_sc")) {
                v.d = true;
            }
            bss.a(v, bundle, z && z3);
            boolean equals = "am".equals(str);
            boolean e3 = buv.e(str2);
            if (z && this.c != null && !e3 && !equals) {
                q().j.a("Passing event to registered event handler (FE)", n().a(str2), n().a(bundle));
                this.c.a(str, str2, bundle, j);
            } else if (this.w.u()) {
                int b = o().b(str2);
                if (b != 0) {
                    q().e.a("Invalid event name. Event will not be logged (FE)", n().a(str2));
                    o();
                    String a = buv.a(str2, 40, true);
                    if (str2 != null) {
                        i4 = str2.length();
                    }
                    this.w.e().a(str3, b, "_ev", a, i4);
                    return;
                }
                List<String> unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
                String str8 = str2;
                Bundle a2 = o().a(str3, str2, bundle, unmodifiableList, z3, true);
                bst bstVar2 = (a2 == null || !a2.containsKey("_sc") || !a2.containsKey("_si")) ? null : new bst(a2.getString("_sn"), a2.getString("_sc"), Long.valueOf(a2.getLong("_si")).longValue());
                bst bstVar3 = bstVar2 == null ? v : bstVar2;
                if (s().k(str3) && h().v() != null && "_ae".equals(str8)) {
                    long w = j().w();
                    if (w > 0) {
                        o().a(a2, w);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(a2);
                long nextLong = o().g().nextLong();
                if (!s().d(f().v(), blk.ab) || r().r.a() <= 0) {
                    j3 = nextLong;
                    str4 = "_ae";
                    j2 = j;
                } else if (!r().a(j) || !r().u.a()) {
                    j3 = nextLong;
                    str4 = "_ae";
                    j2 = j;
                } else {
                    q().k.a("Current session is expired, remove the session number and Id");
                    if (s().d(f().v(), blk.X)) {
                        str4 = "_ae";
                        j2 = j;
                        j3 = nextLong;
                        a("auto", "_sid", (Object) null, l().a());
                    } else {
                        j3 = nextLong;
                        str4 = "_ae";
                        j2 = j;
                    }
                    if (s().d(f().v(), blk.Y)) {
                        a("auto", "_sno", (Object) null, l().a());
                    }
                }
                if (s().j(f().v()) && a2.getLong("extend_session", 0L) == 1) {
                    q().k.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.w.c().a(j2, true);
                }
                String[] strArr = (String[]) a2.keySet().toArray(new String[bundle.size()]);
                Arrays.sort(strArr);
                int length = strArr.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    String str9 = strArr[i6];
                    Object obj = a2.get(str9);
                    o();
                    String[] strArr2 = strArr;
                    Bundle[] a3 = buv.a(obj);
                    if (a3 != null) {
                        i3 = length;
                        a2.putInt(str9, a3.length);
                        long j5 = j3;
                        int i8 = 0;
                        while (i8 < a3.length) {
                            Bundle bundle3 = a3[i8];
                            bss.a(bstVar3, bundle3, true);
                            int i9 = i6;
                            long j6 = j5;
                            ArrayList arrayList3 = arrayList2;
                            Bundle a4 = o().a(str3, "_ep", bundle3, unmodifiableList, z3, false);
                            a4.putString("_en", str8);
                            a4.putLong("_eid", j6);
                            a4.putString("_gn", str9);
                            a4.putInt("_ll", a3.length);
                            a4.putInt("_i", i8);
                            arrayList3.add(a4);
                            i8++;
                            j5 = j6;
                            a2 = a2;
                            arrayList2 = arrayList3;
                            bstVar3 = bstVar3;
                            i6 = i9;
                            i7 = i7;
                            str4 = str4;
                        }
                        str7 = str4;
                        i2 = i6;
                        arrayList = arrayList2;
                        bstVar = bstVar3;
                        bundle2 = a2;
                        j4 = j5;
                        i = i7 + a3.length;
                    } else {
                        str7 = str4;
                        i3 = length;
                        i2 = i6;
                        i = i7;
                        j4 = j3;
                        arrayList = arrayList2;
                        bstVar = bstVar3;
                        bundle2 = a2;
                    }
                    a2 = bundle2;
                    arrayList2 = arrayList;
                    bstVar3 = bstVar;
                    length = i3;
                    str4 = str7;
                    j3 = j4;
                    i7 = i;
                    i6 = i2 + 1;
                    strArr = strArr2;
                }
                String str10 = str4;
                int i10 = i7;
                long j7 = j3;
                ArrayList arrayList4 = arrayList2;
                Bundle bundle4 = a2;
                if (i10 != 0) {
                    bundle4.putLong("_eid", j7);
                    bundle4.putInt("_epc", i10);
                }
                int i11 = 0;
                while (i11 < arrayList4.size()) {
                    Bundle bundle5 = (Bundle) arrayList4.get(i11);
                    if (i11 != 0) {
                        str6 = "_ep";
                        str5 = str8;
                    } else {
                        str6 = str8;
                        str5 = str6;
                    }
                    bundle5.putString("_o", str);
                    if (z2) {
                        bundle5 = o().a(bundle5);
                    }
                    Bundle bundle6 = bundle5;
                    q().j.a("Logging event (FE)", n().a(str5), n().a(bundle6));
                    g().a(new bli(str6, new blh(bundle6), str, j), str3);
                    if (!equals) {
                        for (brq brqVar : this.d) {
                            brqVar.a(str, str2, new Bundle(bundle6), j);
                        }
                    }
                    i11++;
                    str8 = str5;
                }
                String str11 = str8;
                if (h().v() == null || !str10.equals(str11)) {
                    return;
                }
                j().a(true, true);
            }
        }
    }

    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        a(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.c == null || buv.e(str2), !z);
    }

    private final void a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        p().a(new bru(this, str, str2, j, buv.b(bundle), z, z2, z3));
    }

    public final void a(String str, String str2, Object obj) {
        a(str, str2, obj, true, l().a());
    }

    public final void a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = o().c(str2);
        } else {
            buv o = o();
            if (o.a("user property", str2)) {
                if (!o.a("user property", bro.a, str2)) {
                    i = 15;
                } else if (o.a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            o();
            String a = buv.a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.w.e().a(i, "_ev", a, i2);
        } else if (obj != null) {
            int b = o().b(str2, obj);
            if (b != 0) {
                o();
                String a2 = buv.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.w.e().a(b, "_ev", a2, i2);
                return;
            }
            o();
            Object c = buv.c(str2, obj);
            if (c == null) {
                return;
            }
            a(str3, str2, j, c);
        } else {
            a(str3, str2, j, (Object) null);
        }
    }

    private final void a(String str, String str2, long j, Object obj) {
        p().a(new brt(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            defpackage.aat.a(r9)
            defpackage.aat.a(r10)
            r8.c()
            r8.B()
            bvf r0 = r8.s()
            bpa r1 = r8.f()
            java.lang.String r1 = r1.v()
            bow<java.lang.Boolean> r2 = defpackage.blk.ai
            boolean r0 = r0.d(r1, r2)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L77
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L77
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L67
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L67
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L49
            r4 = r2
            goto L4b
        L49:
            r4 = 0
        L4b:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            bpq r0 = r8.r()
            bpw r0 = r0.o
            r4 = r10
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L62
            java.lang.String r11 = "true"
        L62:
            r0.a(r11)
            r6 = r10
            goto L75
        L67:
            if (r11 != 0) goto L77
            bpq r10 = r8.r()
            bpw r10 = r10.o
            java.lang.String r0 = "unset"
            r10.a(r0)
            r6 = r11
        L75:
            r3 = r1
            goto L79
        L77:
            r3 = r10
            r6 = r11
        L79:
            bql r10 = r8.w
            boolean r10 = r10.r()
            if (r10 != 0) goto L8d
            bpi r9 = r8.q()
            bpk r9 = r9.j
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L8d:
            bql r10 = r8.w
            boolean r10 = r10.u()
            if (r10 != 0) goto L96
            return
        L96:
            bpi r10 = r8.q()
            bpk r10 = r10.j
            bpg r11 = r8.n()
            java.lang.String r11 = r11.a(r3)
            java.lang.String r0 = "Setting user property (FE)"
            r10.a(r0, r11, r6)
            buq r10 = new buq
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            bsx r9 = r8.g()
            r9.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brs.a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final String w() {
        return this.f.get();
    }

    public final void a(String str) {
        this.f.set(str);
    }

    public final void x() {
        c();
        B();
        if (!this.w.u()) {
            return;
        }
        g().y();
        this.b = false;
        String u = r().u();
        if (TextUtils.isEmpty(u)) {
            return;
        }
        k().w();
        if (u.equals(Build.VERSION.RELEASE)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_po", u);
        a("auto", "_ou", bundle);
    }

    public final void a(brn brnVar) {
        brn brnVar2;
        c();
        B();
        if (brnVar != null && brnVar != (brnVar2 = this.c)) {
            aat.b(brnVar2 == null, "EventInterceptor already set.");
        }
        this.c = brnVar;
    }

    public final void a(brq brqVar) {
        B();
        aat.a(brqVar);
        if (!this.d.add(brqVar)) {
            q().f.a("OnEventListener already registered");
        }
    }

    public final void b(brq brqVar) {
        B();
        aat.a(brqVar);
        if (!this.d.remove(brqVar)) {
            q().f.a("OnEventListener had not been registered");
        }
    }

    public final void a(Bundle bundle, long j) {
        aat.a(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            q().f.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        b(bundle2, j);
    }

    public final void b(Bundle bundle, long j) {
        aat.a(bundle);
        brj.a(bundle, "app_id", String.class, null);
        brj.a(bundle, "origin", String.class, null);
        brj.a(bundle, "name", String.class, null);
        brj.a(bundle, "value", Object.class, null);
        brj.a(bundle, "trigger_event_name", String.class, null);
        brj.a(bundle, "trigger_timeout", Long.class, 0L);
        brj.a(bundle, "timed_out_event_name", String.class, null);
        brj.a(bundle, "timed_out_event_params", Bundle.class, null);
        brj.a(bundle, "triggered_event_name", String.class, null);
        brj.a(bundle, "triggered_event_params", Bundle.class, null);
        brj.a(bundle, "time_to_live", Long.class, 0L);
        brj.a(bundle, "expired_event_name", String.class, null);
        brj.a(bundle, "expired_event_params", Bundle.class, null);
        aat.a(bundle.getString("name"));
        aat.a(bundle.getString("origin"));
        aat.a(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (o().c(string) != 0) {
            q().c.a("Invalid conditional user property name", n().c(string));
        } else if (o().b(string, obj) != 0) {
            q().c.a("Invalid conditional user property value", n().c(string), obj);
        } else {
            o();
            Object c = buv.c(string, obj);
            if (c == null) {
                q().c.a("Unable to normalize conditional user property value", n().c(string), obj);
                return;
            }
            brj.a(bundle, c);
            long j2 = bundle.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
                q().c.a("Invalid conditional user property timeout", n().c(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle.getLong("time_to_live");
            if (j3 > 15552000000L || j3 < 1) {
                q().c.a("Invalid conditional user property time to live", n().c(string), Long.valueOf(j3));
            } else {
                p().a(new bry(this, bundle));
            }
        }
    }

    public final void b(String str, String str2, Bundle bundle) {
        a((String) null, str, str2, bundle);
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        long a = l().a();
        aat.a(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", a);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        p().a(new brx(this, bundle2));
    }

    public final ArrayList<Bundle> a(String str, String str2, String str3) {
        if (p().f()) {
            q().c.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (bve.a()) {
            q().c.a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.w.p().a(new bsa(this, atomicReference, str, str2, str3));
                try {
                    atomicReference.wait(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                } catch (InterruptedException e) {
                    q().f.a("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List list = (List) atomicReference.get();
            if (list == null) {
                q().f.a("Timed out waiting for get conditional user properties", str);
                return new ArrayList<>();
            }
            return buv.b(list);
        }
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        if (p().f()) {
            q().c.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (bve.a()) {
            q().c.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.w.p().a(new bsd(this, atomicReference, str, str2, str3, z));
                try {
                    atomicReference.wait(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                } catch (InterruptedException e) {
                    q().f.a("Interrupted waiting for get user properties", e);
                }
            }
            List<buq> list = (List) atomicReference.get();
            if (list == null) {
                q().f.a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (buq buqVar : list) {
                arrayMap.put(buqVar.a, buqVar.a());
            }
            return arrayMap;
        }
    }

    public final String y() {
        bst bstVar = this.w.h().b;
        if (bstVar != null) {
            return bstVar.a;
        }
        return null;
    }

    public final String z() {
        bst bstVar = this.w.h().b;
        if (bstVar != null) {
            return bstVar.b;
        }
        return null;
    }

    public final String E() {
        if (this.w.a == null) {
            try {
                return vt.a();
            } catch (IllegalStateException e) {
                this.w.q().c.a("getGoogleAppId failed with exception", e);
                return null;
            }
        }
        return this.w.a;
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bkz d() {
        return super.d();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ brs e() {
        return super.e();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bpa f() {
        return super.f();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bsx g() {
        return super.g();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bss h() {
        return super.h();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bpe i() {
        return super.i();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bty j() {
        return super.j();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ blc k() {
        return super.k();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ ady l() {
        return super.l();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpg n() {
        return super.n();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ buv o() {
        return super.o();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bqe p() {
        return super.p();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bpi q() {
        return super.q();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpq r() {
        return super.r();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bvf s() {
        return super.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(brs brsVar, boolean z) {
        brsVar.c();
        brsVar.B();
        brsVar.q().j.a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        brsVar.r().b(z);
        brsVar.F();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(brs brsVar, Bundle bundle) {
        brsVar.c();
        brsVar.B();
        aat.a(bundle);
        aat.a(bundle.getString("name"));
        aat.a(bundle.getString("origin"));
        aat.a(bundle.get("value"));
        if (!brsVar.w.r()) {
            brsVar.q().j.a("Conditional property not sent since collection is disabled");
            return;
        }
        buq buqVar = new buq(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            bli a = brsVar.o().a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0L);
            brsVar.g().a(new bvd(bundle.getString("app_id"), bundle.getString("origin"), buqVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), brsVar.o().a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0L), bundle.getLong("trigger_timeout"), a, bundle.getLong("time_to_live"), brsVar.o().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0L)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(brs brsVar, Bundle bundle) {
        brsVar.c();
        brsVar.B();
        aat.a(bundle);
        aat.a(bundle.getString("name"));
        if (!brsVar.w.r()) {
            brsVar.q().j.a("Conditional property not cleared since collection is disabled");
            return;
        }
        try {
            brsVar.g().a(new bvd(bundle.getString("app_id"), bundle.getString("origin"), new buq(bundle.getString("name"), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), brsVar.o().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"))));
        } catch (IllegalArgumentException unused) {
        }
    }
}
