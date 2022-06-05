package defpackage;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: pf  reason: default package */
/* loaded from: classes2.dex */
public class pf {
    private static final String a = pf.class.getCanonicalName();
    private static HashMap<String, NsdManager.RegistrationListener> b = new HashMap<>();

    public static String a() {
        if (qx.a(pf.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("device", Build.DEVICE);
            hashMap.put("model", Build.MODEL);
            return new JSONObject(hashMap).toString();
        } catch (Throwable th) {
            qx.a(th, pf.class);
            return null;
        }
    }

    public static String b() {
        if (qx.a(pf.class)) {
            return null;
        }
        try {
            return a();
        } catch (Throwable th) {
            qx.a(th, pf.class);
            return null;
        }
    }

    public static boolean a(String str) {
        if (qx.a(pf.class)) {
            return false;
        }
        try {
            if (!c()) {
                return false;
            }
            return d(str);
        } catch (Throwable th) {
            qx.a(th, pf.class);
            return false;
        }
    }

    public static boolean c() {
        if (qx.a(pf.class)) {
            return false;
        }
        try {
            pv a2 = pw.a(ly.m());
            if (Build.VERSION.SDK_INT >= 16 && a2 != null) {
                if (a2.c.contains(qh.Enabled)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, pf.class);
            return false;
        }
    }

    public static Bitmap b(String str) {
        Bitmap bitmap = null;
        if (qx.a(pf.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(cre.class);
            enumMap.put((EnumMap) cre.MARGIN, (cre) 2);
            try {
                crq a2 = new crf().a(str, crc.QR_CODE, ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, enumMap);
                int i = a2.b;
                int i2 = a2.a;
                int[] iArr = new int[i * i2];
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i3 * i2;
                    for (int i5 = 0; i5 < i2; i5++) {
                        iArr[i4 + i5] = a2.a(i5, i3) ? ViewCompat.MEASURED_STATE_MASK : -1;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                    return createBitmap;
                } catch (WriterException unused) {
                    bitmap = createBitmap;
                    return bitmap;
                }
            } catch (WriterException unused2) {
            }
        } catch (Throwable th) {
            qx.a(th, pf.class);
            return null;
        }
    }

    public static void c(String str) {
        NsdManager.RegistrationListener registrationListener;
        if (qx.a(pf.class)) {
            return;
        }
        try {
            if (qx.a(pf.class) || (registrationListener = b.get(str)) == null) {
                return;
            }
            try {
                ((NsdManager) ly.k().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException e) {
                qi.a(a, (Exception) e);
            }
            b.remove(str);
        } catch (Throwable th) {
            qx.a(th, pf.class);
        }
    }

    private static boolean d(final String str) {
        if (qx.a(pf.class)) {
            return false;
        }
        try {
            if (b.containsKey(str)) {
                return true;
            }
            final String format = String.format("%s_%s_%s", "fbsdk", String.format("%s-%s", "android", ly.l().replace('.', '|')), str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(format);
            nsdServiceInfo.setPort(80);
            NsdManager.RegistrationListener registrationListener = new NsdManager.RegistrationListener() { // from class: pf.1
                @Override // android.net.nsd.NsdManager.RegistrationListener
                public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo2) {
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo2, int i) {
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo2) {
                    if (!format.equals(nsdServiceInfo2.getServiceName())) {
                        pf.c(str);
                    }
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo2, int i) {
                    pf.c(str);
                }
            };
            b.put(str, registrationListener);
            ((NsdManager) ly.k().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, registrationListener);
            return true;
        } catch (Throwable th) {
            qx.a(th, pf.class);
            return false;
        }
    }
}
