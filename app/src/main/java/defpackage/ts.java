package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: ts  reason: default package */
/* loaded from: classes2.dex */
public final class ts implements Runnable {
    private static final adj a = new adj("RevokeAccessOperation", new String[0]);
    private final String b;
    private final we c = new we(null);

    private ts(String str) {
        this.b = aat.a(str);
    }

    public static vg a(String str) {
        if (str == null) {
            Status status = new Status(4);
            aat.a(status, "Result must not be null");
            aat.a(!status.a().c(), "Status code must not be SUCCESS");
            zr zrVar = new zr(status);
            zrVar.a((zr) status);
            return zrVar;
        }
        ts tsVar = new ts(str);
        new Thread(tsVar).start();
        return tsVar.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.c;
        try {
            String valueOf = String.valueOf(this.b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.a;
            } else {
                a.a("Unable to revoke access!", new Object[0]);
            }
            adj adjVar = a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            adjVar.b(sb.toString(), new Object[0]);
        } catch (IOException e) {
            adj adjVar2 = a;
            String valueOf2 = String.valueOf(e.toString());
            adjVar2.a(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            adj adjVar3 = a;
            String valueOf3 = String.valueOf(e2.toString());
            adjVar3.a(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.c.a((we) status);
    }
}
