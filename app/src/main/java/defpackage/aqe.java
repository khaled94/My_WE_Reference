package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aqe  reason: default package */
/* loaded from: classes.dex */
public final class aqe implements aqi {
    static final Map<Uri, aqe> a = new ArrayMap();
    private static final String[] g = {"key", "value"};
    volatile Map<String, String> c;
    private final ContentResolver e;
    private final Uri f;
    final Object b = new Object();
    final List<Object> d = new ArrayList();

    private aqe(ContentResolver contentResolver, Uri uri) {
        this.e = contentResolver;
        this.f = uri;
        contentResolver.registerContentObserver(uri, false, new aqg(this));
    }

    public static aqe a(ContentResolver contentResolver, Uri uri) {
        aqe aqeVar;
        synchronized (aqe.class) {
            aqeVar = a.get(uri);
            if (aqeVar == null) {
                try {
                    aqe aqeVar2 = new aqe(contentResolver, uri);
                    try {
                        a.put(uri, aqeVar2);
                    } catch (SecurityException unused) {
                    }
                    aqeVar = aqeVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return aqeVar;
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.c;
        if (map == null) {
            synchronized (this.b) {
                map = this.c;
                if (map == null) {
                    map = c();
                    this.c = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    private final Map<String, String> c() {
        try {
            return (Map) aqk.a(new aqj(this) { // from class: aqh
                private final aqe a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                }

                @Override // defpackage.aqj
                public final Object a() {
                    return this.a.b();
                }
            });
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            return null;
        }
    }

    @Override // defpackage.aqi
    public final /* synthetic */ Object a(String str) {
        return a().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map b() {
        Map map;
        Cursor query = this.e.query(this.f, g, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new ArrayMap(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            return map;
        } finally {
            query.close();
        }
    }
}
