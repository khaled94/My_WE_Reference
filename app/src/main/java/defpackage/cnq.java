package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: cnq  reason: default package */
/* loaded from: classes2.dex */
public final class cnq {
    private static cnq e;
    private final SimpleArrayMap<String, String> f = new SimpleArrayMap<>();
    Boolean a = null;
    Boolean b = null;
    public final Queue<Intent> c = new ArrayDeque();
    public final Queue<Intent> d = new ArrayDeque();

    public static synchronized cnq a() {
        cnq cnqVar;
        synchronized (cnq.class) {
            if (e == null) {
                e = new cnq();
            }
            cnqVar = e;
        }
        return cnqVar;
    }

    private cnq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public final int b(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Starting service: ".concat(valueOf);
            } else {
                new String("Starting service: ");
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                c = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            c = 0;
        }
        if (c == 0) {
            this.c.offer(intent);
        } else if (c == 1) {
            this.d.offer(intent);
        } else {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "Unknown service action: ".concat(valueOf2);
                return 500;
            }
            new String("Unknown service action: ");
            return 500;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[Catch: IllegalStateException -> 0x00d6, SecurityException -> 0x00f5, TryCatch #4 {IllegalStateException -> 0x00d6, SecurityException -> 0x00f5, blocks: (B:37:0x00c0, B:39:0x00c6, B:40:0x00cb), top: B:55:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb A[Catch: IllegalStateException -> 0x00d6, SecurityException -> 0x00f5, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x00d6, SecurityException -> 0x00f5, blocks: (B:37:0x00c0, B:39:0x00c6, B:40:0x00cb), top: B:55:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a(android.content.Context r5, android.content.Intent r6) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnq.a(android.content.Context, android.content.Intent):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.a.booleanValue();
        return this.a.booleanValue();
    }
}
