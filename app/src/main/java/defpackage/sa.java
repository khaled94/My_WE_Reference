package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.FacebookException;
import defpackage.rs;
import defpackage.rx;

/* renamed from: sa  reason: default package */
/* loaded from: classes2.dex */
public abstract class sa extends rx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public sa(rs rsVar) {
        super(rsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sa(Parcel parcel) {
        super(parcel);
    }

    public lo c() {
        return lo.FACEBOOK_APPLICATION_WEB;
    }

    @Override // defpackage.rx
    public final boolean a(int i, int i2, Intent intent) {
        rs.c cVar = e().g;
        if (intent == null) {
            a(rs.d.a(cVar, "Operation canceled"));
        } else {
            String str = null;
            if (i2 == 0) {
                Bundle extras = intent.getExtras();
                String a = a(extras);
                if (extras.get("error_code") != null) {
                    str = extras.get("error_code").toString();
                }
                if (qg.d().equals(str)) {
                    a(rs.d.a(cVar, a, b(extras), str));
                }
                a(rs.d.a(cVar, a));
            } else if (i2 != -1) {
                a(rs.d.a(cVar, "Unexpected resultCode from authorization.", (String) null));
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    a(rs.d.a(cVar, "Unexpected null from returned authorization data.", (String) null));
                    return true;
                }
                String a2 = a(extras2);
                String obj = extras2.get("error_code") != null ? extras2.get("error_code").toString() : null;
                String b = b(extras2);
                String string = extras2.getString("e2e");
                if (!qi.a(string)) {
                    b(string);
                }
                if (a2 == null && obj == null && b == null) {
                    try {
                        a(rs.d.a(cVar, a(cVar.b, extras2, c(), cVar.d), rx.a.b(extras2, cVar.o)));
                    } catch (FacebookException e) {
                        a(rs.d.a(cVar, (String) null, e.getMessage()));
                    }
                } else if (a2 != null && a2.equals("logged_out")) {
                    rh.a = true;
                    a((rs.d) null);
                } else if (qg.b().contains(a2)) {
                    a((rs.d) null);
                } else if (qg.c().contains(a2)) {
                    a(rs.d.a(cVar, (String) null));
                } else {
                    a(rs.d.a(cVar, a2, b, obj));
                }
            }
        }
        return true;
    }

    private void a(rs.d dVar) {
        if (dVar != null) {
            e().a(dVar);
        } else {
            e().f();
        }
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    private static String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            e().c.startActivityForResult(intent, i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
