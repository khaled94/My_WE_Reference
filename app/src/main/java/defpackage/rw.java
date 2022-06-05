package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import defpackage.pj;
import defpackage.rs;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: rw  reason: default package */
/* loaded from: classes2.dex */
public class rw {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet<String>() { // from class: rw.2
        {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    });
    private static final String b = rw.class.toString();
    private static volatile rw c;
    private String h;
    private boolean i;
    private rr d = rr.NATIVE_WITH_FALLBACK;
    private rj e = rj.FRIENDS;
    private String g = "rerequest";
    private rz j = rz.FACEBOOK;
    private boolean k = false;
    private boolean l = false;
    private final SharedPreferences f = ly.k().getSharedPreferences("com.facebook.loginManager", 0);

    rw() {
        qj.a();
        if (!ly.a || pl.a() == null) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(ly.k(), "com.android.chrome", new ri());
        CustomTabsClient.connectAndInitialize(ly.k(), ly.k().getPackageName());
    }

    public static rw a() {
        if (c == null) {
            synchronized (rw.class) {
                if (c == null) {
                    c = new rw();
                }
            }
        }
        return c;
    }

    public final void a(lu luVar, final lw<ry> lwVar) {
        if (!(luVar instanceof pj)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        int requestCode = pj.c.Login.toRequestCode();
        pj.a aVar = new pj.a() { // from class: rw.1
            @Override // defpackage.pj.a
            public final boolean a(int i, Intent intent) {
                return rw.this.a(i, intent, lwVar);
            }
        };
        dqc.d(aVar, "callback");
        ((pj) luVar).a.put(Integer.valueOf(requestCode), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [lk] */
    /* JADX WARN: Type inference failed for: r9v0, types: [lk] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    final boolean a(int i, Intent intent, lw<ry> lwVar) {
        boolean z;
        FacebookException facebookException;
        lq lqVar;
        ?? r9;
        Map<String, String> map;
        rs.d.a aVar;
        rs.c cVar;
        Map<String, String> map2;
        lq lqVar2;
        boolean z2;
        lq lqVar3;
        rs.c cVar2;
        lq lqVar4;
        rs.d.a aVar2 = rs.d.a.ERROR;
        ry ryVar = null;
        if (intent != null) {
            intent.setExtrasClassLoader(rs.d.class.getClassLoader());
            rs.d dVar = (rs.d) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (dVar != null) {
                rs.c cVar3 = dVar.f;
                rs.d.a aVar3 = dVar.a;
                if (i == -1) {
                    if (dVar.a == rs.d.a.SUCCESS) {
                        lqVar4 = dVar.b;
                        facebookException = null;
                        lqVar2 = dVar.c;
                        z2 = false;
                        map2 = dVar.g;
                        lq lqVar5 = lqVar4;
                        cVar2 = cVar3;
                        aVar2 = aVar3;
                        lqVar3 = lqVar5;
                    } else {
                        facebookException = new FacebookAuthorizationException(dVar.d);
                        lqVar4 = null;
                    }
                } else if (i == 0) {
                    facebookException = null;
                    lqVar4 = null;
                    lqVar2 = null;
                    z2 = true;
                    map2 = dVar.g;
                    lq lqVar52 = lqVar4;
                    cVar2 = cVar3;
                    aVar2 = aVar3;
                    lqVar3 = lqVar52;
                } else {
                    facebookException = null;
                    lqVar4 = null;
                }
                lqVar2 = lqVar4;
                z2 = false;
                map2 = dVar.g;
                lq lqVar522 = lqVar4;
                cVar2 = cVar3;
                aVar2 = aVar3;
                lqVar3 = lqVar522;
            } else {
                facebookException = null;
                map2 = null;
                cVar2 = null;
                lqVar3 = null;
                lqVar2 = null;
                z2 = false;
            }
            r9 = lqVar3;
            lqVar = lqVar2;
            aVar = aVar2;
            cVar = cVar2;
            boolean z3 = z2;
            map = map2;
            z = z3;
        } else if (i == 0) {
            aVar = rs.d.a.CANCEL;
            facebookException = null;
            cVar = null;
            map = null;
            r9 = 0;
            lqVar = null;
            z = true;
        } else {
            aVar = aVar2;
            facebookException = null;
            cVar = null;
            map = null;
            r9 = 0;
            lqVar = null;
            z = false;
        }
        if (facebookException == null && r9 == 0 && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, aVar, map, facebookException, true, cVar);
        if (r9 != 0) {
            lk.a(r9);
            mg.d();
        }
        if (lqVar != null) {
            lq.a(lqVar);
        }
        if (lwVar != null) {
            if (r9 != 0) {
                Set<String> set = cVar.b;
                HashSet hashSet = new HashSet(r9.b);
                if (cVar.f) {
                    hashSet.retainAll(set);
                }
                HashSet hashSet2 = new HashSet(set);
                hashSet2.removeAll(hashSet);
                ryVar = new ry(r9, lqVar, hashSet, hashSet2);
            }
            if (!z && (ryVar == null || ryVar.b.size() != 0)) {
                if (facebookException != null) {
                    lwVar.a(facebookException);
                } else if (r9 != 0) {
                    a(true);
                    lwVar.a((lw<ry>) ryVar);
                }
            }
        }
        return true;
    }

    public final void b() {
        lk.a(null);
        lq.a(null);
        mg.c();
        a(false);
    }

    @Deprecated
    public final void a(Fragment fragment, Collection<String> collection) {
        px pxVar = new px(fragment);
        a(collection);
        a(new b(pxVar), a(new rt(collection, (byte) 0)));
    }

    public static void a(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (a(str)) {
                throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        if (str != null) {
            return str.startsWith("publish") || str.startsWith("manage") || a.contains(str);
        }
        return false;
    }

    public final rs.c a(rt rtVar) {
        rs.c cVar = new rs.c(this.d, Collections.unmodifiableSet(rtVar.a != null ? new HashSet(rtVar.a) : new HashSet()), this.e, this.g, ly.m(), UUID.randomUUID().toString(), this.j, rtVar.b);
        cVar.f = lk.d();
        cVar.j = this.h;
        cVar.k = this.i;
        cVar.m = this.k;
        cVar.n = this.l;
        return cVar;
    }

    public final void a(sd sdVar, rs.c cVar) throws FacebookException {
        a(sdVar.a(), cVar);
        pj.a(pj.c.Login.toRequestCode(), new pj.a() { // from class: rw.3
            @Override // defpackage.pj.a
            public final boolean a(int i, Intent intent) {
                return rw.this.a(i, intent, null);
            }
        });
        if (b(sdVar, cVar)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        a(sdVar.a(), rs.d.a.ERROR, null, facebookException, false, cVar);
        throw facebookException;
    }

    private void a(boolean z) {
        SharedPreferences.Editor edit = this.f.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: rw$a */
    /* loaded from: classes2.dex */
    public static class a implements sd {
        private final Activity a;

        public a(Activity activity) {
            qj.a((Object) activity, "activity");
            this.a = activity;
        }

        @Override // defpackage.sd
        public final void a(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }

        @Override // defpackage.sd
        public final Activity a() {
            return this.a;
        }
    }

    /* renamed from: rw$b */
    /* loaded from: classes2.dex */
    static class b implements sd {
        private final px a;

        b(px pxVar) {
            qj.a(pxVar, "fragment");
            this.a = pxVar;
        }

        @Override // defpackage.sd
        public final void a(Intent intent, int i) {
            px pxVar = this.a;
            if (pxVar.a != null) {
                Fragment fragment = pxVar.a;
                if (fragment == null) {
                    return;
                }
                fragment.startActivityForResult(intent, i);
                return;
            }
            android.app.Fragment fragment2 = pxVar.b;
            if (fragment2 == null) {
                return;
            }
            fragment2.startActivityForResult(intent, i);
        }

        @Override // defpackage.sd
        public final Activity a() {
            px pxVar = this.a;
            FragmentActivity fragmentActivity = null;
            if (pxVar.a != null) {
                Fragment fragment = pxVar.a;
                if (fragment != null) {
                    fragmentActivity = fragment.getActivity();
                }
                return fragmentActivity;
            }
            android.app.Fragment fragment2 = pxVar.b;
            if (fragment2 == null) {
                return null;
            }
            return fragment2.getActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rw$c */
    /* loaded from: classes2.dex */
    public static class c {
        private static rv a;

        private c() {
        }

        static synchronized rv a(Context context) {
            synchronized (c.class) {
                if (context == null) {
                    context = ly.k();
                }
                if (context == null) {
                    return null;
                }
                if (a == null) {
                    a = new rv(context, ly.m());
                }
                return a;
            }
        }
    }

    private static void a(Context context, rs.c cVar) {
        rv a2 = c.a(context);
        if (a2 == null || cVar == null) {
            return;
        }
        a2.a(cVar, cVar.m ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    private static void a(Context context, rs.d.a aVar, Map<String, String> map, Exception exc, boolean z, rs.c cVar) {
        rv a2 = c.a(context);
        if (a2 == null) {
            return;
        }
        String str = "fb_mobile_login_complete";
        if (cVar == null) {
            a2.a(str, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z ? "1" : "0");
        String str2 = cVar.e;
        if (cVar.m) {
            str = "foa_mobile_login_complete";
        }
        a2.a(str2, hashMap, aVar, map, exc, str);
    }

    private static boolean b(sd sdVar, rs.c cVar) {
        Intent intent = new Intent();
        intent.setClass(ly.k(), FacebookActivity.class);
        intent.setAction(cVar.a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", cVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (!(ly.k().getPackageManager().resolveActivity(intent, 0) != null)) {
            return false;
        }
        try {
            sdVar.a(intent, rs.c());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
