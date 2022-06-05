package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aqv  reason: default package */
/* loaded from: classes.dex */
public final class aqv implements aqi {
    static final Map<String, aqv> a = new HashMap();
    volatile Map<String, ?> c;
    private final SharedPreferences e;
    private final SharedPreferences.OnSharedPreferenceChangeListener f = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: aqy
        private final aqv a;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.a = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            aqv aqvVar = this.a;
            synchronized (aqvVar.b) {
                aqvVar.c = null;
                aqp.a();
            }
            synchronized (aqvVar) {
                Iterator<Object> it = aqvVar.d.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    };
    final Object b = new Object();
    final List<Object> d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqv a(Context context) {
        aqv aqvVar;
        SharedPreferences sharedPreferences;
        String str = null;
        if (!((!aqf.a() || str.startsWith("direct_boot:")) ? true : aqf.a(context))) {
            return null;
        }
        synchronized (aqv.class) {
            aqvVar = a.get(null);
            if (aqvVar == null) {
                if (str.startsWith("direct_boot:")) {
                    if (aqf.a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(null, 0);
                }
                aqvVar = new aqv(sharedPreferences);
                a.put(null, aqvVar);
            }
        }
        return aqvVar;
    }

    private aqv(SharedPreferences sharedPreferences) {
        this.e = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f);
    }

    @Override // defpackage.aqi
    public final Object a(String str) {
        Map<String, ?> map = this.c;
        if (map == null) {
            synchronized (this.b) {
                map = this.c;
                if (map == null) {
                    map = this.e.getAll();
                    this.c = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
