package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: aqc  reason: default package */
/* loaded from: classes.dex */
public class aqc {
    private static HashMap<String, String> f;
    private static Object k;
    private static boolean l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri d = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean e = new AtomicBoolean();
    private static final HashMap<String, Boolean> g = new HashMap<>();
    private static final HashMap<String, Integer> h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static String[] m = new String[0];

    public static String a(ContentResolver contentResolver, String str) {
        synchronized (aqc.class) {
            if (f == null) {
                e.set(false);
                f = new HashMap<>();
                k = new Object();
                l = false;
                contentResolver.registerContentObserver(a, true, new aqb());
            } else if (e.getAndSet(false)) {
                f.clear();
                g.clear();
                h.clear();
                i.clear();
                j.clear();
                k = new Object();
                l = false;
            }
            Object obj = k;
            String str2 = null;
            if (f.containsKey(str)) {
                String str3 = f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            for (String str4 : m) {
                if (str.startsWith(str4)) {
                    if (!l || f.isEmpty()) {
                        f.putAll(a(contentResolver, m));
                        l = true;
                        if (f.containsKey(str)) {
                            String str5 = f.get(str);
                            if (str5 != null) {
                                str2 = str5;
                            }
                            return str2;
                        }
                    }
                    return null;
                }
            }
            Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    a(obj, str, null);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                a(obj, str, string);
                if (string != null) {
                    str2 = string;
                }
                if (query != null) {
                    query.close();
                }
                return str2;
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (aqc.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }

    private static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(d, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }
}
