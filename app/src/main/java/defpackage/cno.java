package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.firebase.iid.zzak;
import defpackage.coi;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cno  reason: default package */
/* loaded from: classes2.dex */
final class cno {
    private static int a;
    private static PendingIntent b;
    private final Context d;
    private final cni e;
    private Messenger g;
    private coi h;
    private final SimpleArrayMap<String, bwm<Bundle>> c = new SimpleArrayMap<>();
    private Messenger f = new Messenger(new cnr(this, Looper.getMainLooper()));

    public cno(Context context, cni cniVar) {
        this.d = context;
        this.e = cniVar;
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (cno.class) {
            if (b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", b);
        }
    }

    private final void a(String str, Bundle bundle) {
        synchronized (this.c) {
            bwm<Bundle> remove = this.c.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing callback for ".concat(valueOf);
                } else {
                    new String("Missing callback for ");
                }
                return;
            }
            remove.a((bwm<Bundle>) bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) throws IOException {
        Object obj;
        if (this.e.d() >= 12000000) {
            cmz a2 = cmz.a(this.d);
            bwl a3 = a2.a(new cnj(a2.a(), bundle));
            try {
                aat.c("Must not be called on the main application thread");
                aat.a(a3, "Task must not be null");
                if (a3.d()) {
                    obj = bwo.a((bwl<Object>) a3);
                } else {
                    bwp bwpVar = new bwp((byte) 0);
                    bwo.a(a3, bwpVar);
                    bwpVar.a.await();
                    obj = bwo.a((bwl<Object>) a3);
                }
                return (Bundle) obj;
            } catch (InterruptedException | ExecutionException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("Error making request: ");
                    sb.append(valueOf);
                }
                if ((e.getCause() instanceof zzak) && ((zzak) e.getCause()).a == 4) {
                    return b(bundle);
                }
                return null;
            }
        }
        return b(bundle);
    }

    private final Bundle b(Bundle bundle) throws IOException {
        Bundle c = c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = c(bundle);
        if (c2 != null && c2.containsKey("google.messenger")) {
            return null;
        }
        return c2;
    }

    private static synchronized String a() {
        String num;
        synchronized (cno.class) {
            int i = a;
            a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.os.Bundle c(android.os.Bundle r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cno.c(android.os.Bundle):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(cno cnoVar, Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new coi.a());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof coi) {
                cnoVar.h = (coi) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                cnoVar.g = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                return;
            }
            String valueOf = String.valueOf(action);
            if (valueOf.length() != 0) {
                "Unexpected response action: ".concat(valueOf);
                return;
            } else {
                new String("Unexpected response action: ");
                return;
            }
        }
        String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra == null) {
            String stringExtra2 = intent2.getStringExtra("error");
            if (stringExtra2 == null) {
                String valueOf2 = String.valueOf(intent2.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                sb.append("Unexpected response, no error or registration id ");
                sb.append(valueOf2);
                return;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf3 = String.valueOf(stringExtra2);
                if (valueOf3.length() != 0) {
                    "Received InstanceID error ".concat(valueOf3);
                } else {
                    new String("Received InstanceID error ");
                }
            }
            if (stringExtra2.startsWith("|")) {
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    String valueOf4 = String.valueOf(stringExtra2);
                    if (valueOf4.length() != 0) {
                        "Unexpected structured response ".concat(valueOf4);
                        return;
                    } else {
                        new String("Unexpected structured response ");
                        return;
                    }
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                cnoVar.a(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
            synchronized (cnoVar.c) {
                for (int i = 0; i < cnoVar.c.size(); i++) {
                    cnoVar.a(cnoVar.c.keyAt(i), intent2.getExtras());
                }
            }
            return;
        }
        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
        if (!matcher.matches()) {
            if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                return;
            }
            String valueOf5 = String.valueOf(stringExtra);
            if (valueOf5.length() != 0) {
                "Unexpected response string: ".concat(valueOf5);
                return;
            } else {
                new String("Unexpected response string: ");
                return;
            }
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        Bundle extras = intent2.getExtras();
        extras.putString("registration_id", group2);
        cnoVar.a(group, extras);
    }
}
