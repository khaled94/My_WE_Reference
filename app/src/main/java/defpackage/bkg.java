package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: bkg  reason: default package */
/* loaded from: classes2.dex */
public class bkg {
    private static final String a = bkg.class.getSimpleName();
    private static Context b = null;
    private static bkh c;

    public static bkh a(Context context) throws GooglePlayServicesNotAvailableException {
        bkh bkhVar;
        aat.a(context);
        bkh bkhVar2 = c;
        if (bkhVar2 != null) {
            return bkhVar2;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (isGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        IBinder iBinder = (IBinder) a(b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
        if (iBinder == null) {
            bkhVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (queryLocalInterface instanceof bkh) {
                bkhVar = (bkh) queryLocalInterface;
            } else {
                bkhVar = new bki(iBinder);
            }
        }
        c = bkhVar;
        try {
            bkhVar.a(afp.a(b(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            return c;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    private static Context b(Context context) {
        Context context2 = b;
        if (context2 != null) {
            return context2;
        }
        Context c2 = c(context);
        b = c2;
        return c2;
    }

    private static Context c(Context context) {
        try {
            return DynamiteModule.a(context, DynamiteModule.a, "com.google.android.gms.maps_dynamite").h;
        } catch (Exception unused) {
            return GooglePlayServicesUtil.getRemoteContext(context);
        }
    }

    private static <T> T a(ClassLoader classLoader, String str) {
        try {
            return (T) a(((ClassLoader) aat.a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to find dynamic class ".concat(valueOf) : new String("Unable to find dynamic class "));
        }
    }

    private static <T> T a(Class<?> cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to call the default constructor of ".concat(valueOf) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(valueOf2) : new String("Unable to instantiate the dynamic class "));
        }
    }
}
