package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentDiscoveryService;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cmd  reason: default package */
/* loaded from: classes2.dex */
public final class cmd<T> {
    public final T a;
    public final b<T> b;

    /* renamed from: cmd$b */
    /* loaded from: classes2.dex */
    public interface b<T> {
        List<String> a(T t);
    }

    public cmd(T t, b<T> bVar) {
        this.a = t;
        this.b = bVar;
    }

    public static List<cmf> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                Class<?> cls = Class.forName(str);
                if (!cmf.class.isAssignableFrom(cls)) {
                    String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar");
                } else {
                    arrayList.add((cmf) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not an found.", str);
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str);
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str);
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str);
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str);
            }
        }
        return arrayList;
    }

    /* renamed from: cmd$a */
    /* loaded from: classes2.dex */
    public static class a implements b<Context> {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        @Override // defpackage.cmd.b
        public final /* synthetic */ List a(Context context) {
            Bundle a2 = a2(context);
            if (a2 == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : a2.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(a2.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        private static Bundle a2(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128)) != null) {
                    return serviceInfo.metaData;
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }
}
