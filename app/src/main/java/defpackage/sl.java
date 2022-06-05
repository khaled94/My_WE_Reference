package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.FacebookException;
import defpackage.lz;
import defpackage.sk;
import java.io.File;
import java.io.FileNotFoundException;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sl  reason: default package */
/* loaded from: classes2.dex */
public final class sl {
    private static JSONArray a(JSONArray jSONArray, boolean z) throws JSONException {
        if (qx.a(sl.class)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj, z);
                } else if (obj instanceof JSONObject) {
                    obj = a((JSONObject) obj, z);
                }
                jSONArray2.put(obj);
            }
            return jSONArray2;
        } catch (Throwable th) {
            qx.a(th, sl.class);
            return null;
        }
    }

    public static JSONObject a(JSONObject jSONObject, boolean z) {
        if (!qx.a(sl.class) && jSONObject != null) {
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONArray names = jSONObject.names();
                    for (int i = 0; i < names.length(); i++) {
                        String string = names.getString(i);
                        Object obj = jSONObject.get(string);
                        if (obj instanceof JSONObject) {
                            obj = a((JSONObject) obj, true);
                        } else if (obj instanceof JSONArray) {
                            obj = a((JSONArray) obj, true);
                        }
                        Pair<String, String> a = a(string);
                        String str = (String) a.first;
                        String str2 = (String) a.second;
                        if (z) {
                            if (str != null && str.equals("fbsdk")) {
                                jSONObject2.put(string, obj);
                            } else {
                                if (str != null && !str.equals("og")) {
                                    jSONObject3.put(str2, obj);
                                }
                                jSONObject2.put(str2, obj);
                            }
                        } else if (str != null && str.equals("fb")) {
                            jSONObject2.put(string, obj);
                        } else {
                            jSONObject2.put(str2, obj);
                        }
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject2.put("data", jSONObject3);
                    }
                    return jSONObject2;
                } catch (JSONException unused) {
                    throw new FacebookException("Failed to create json object from share content");
                }
            } catch (Throwable th) {
                qx.a(th, sl.class);
                return null;
            }
        }
        return null;
    }

    private static Pair<String, String> a(String str) {
        String str2;
        int i;
        if (qx.a(sl.class)) {
            return null;
        }
        try {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
                str2 = null;
            } else {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
            }
            return new Pair<>(str2, str);
        } catch (Throwable th) {
            qx.a(th, sl.class);
            return null;
        }
    }

    private static lz a(lk lkVar, File file, lz.b bVar) throws FileNotFoundException {
        if (qx.a(sl.class)) {
            return null;
        }
        try {
            lz.g gVar = new lz.g(ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", gVar);
            return new lz(lkVar, "me/staging_resources", bundle, md.POST, bVar, (byte) 0);
        } catch (Throwable th) {
            qx.a(th, sl.class);
            return null;
        }
    }

    public static lz a(lk lkVar, Uri uri, lz.b bVar) throws FileNotFoundException {
        if (qx.a(sl.class)) {
            return null;
        }
        try {
            if (qi.c(uri)) {
                return a(lkVar, new File(uri.getPath()), bVar);
            }
            if (!qi.b(uri)) {
                throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
            }
            lz.g gVar = new lz.g(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", gVar);
            return new lz(lkVar, "me/staging_resources", bundle, md.POST, bVar, (byte) 0);
        } catch (Throwable th) {
            qx.a(th, sl.class);
            return null;
        }
    }

    public static JSONObject a(st stVar) throws JSONException {
        if (qx.a(sl.class)) {
            return null;
        }
        try {
            return sk.a(stVar.c, new sk.a() { // from class: sl.1
                @Override // defpackage.sk.a
                public final JSONObject a(sw swVar) {
                    Uri uri = swVar.a;
                    if (!qi.a(uri)) {
                        throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", uri.toString());
                        return jSONObject;
                    } catch (JSONException e) {
                        throw new FacebookException("Unable to attach images", e);
                    }
                }
            });
        } catch (Throwable th) {
            qx.a(th, sl.class);
            return null;
        }
    }
}
