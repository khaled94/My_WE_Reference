package defpackage;

import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/ml/Utils;", "", "()V", "DIR_NAME", "", "getMlDir", "Ljava/io/File;", "normalizeString", "str", "parseModelWeights", "", "Lcom/facebook/appevents/ml/MTensor;", "file", "vectorize", "", "texts", "maxLen", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ou  reason: default package */
/* loaded from: classes2.dex */
public final class ou {
    public static final ou a = new ou();

    private ou() {
    }

    public final int[] a(String str) {
        if (qx.a(this)) {
            return null;
        }
        try {
            dqc.d(str, "texts");
            int[] iArr = new int[128];
            String b = b(str);
            Charset forName = Charset.forName("UTF-8");
            dqc.b(forName, "Charset.forName(\"UTF-8\")");
            if (b == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = b.getBytes(forName);
            dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
            for (int i = 0; i < 128; i++) {
                if (i < bytes.length) {
                    iArr[i] = bytes[i] & 255;
                } else {
                    iArr[i] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public static final File a() {
        if (qx.a(ou.class)) {
            return null;
        }
        try {
            File file = new File(ly.k().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            qx.a(th, ou.class);
            return null;
        }
    }

    public static final Map<String, oo> a(File file) {
        if (qx.a(ou.class)) {
            return null;
        }
        try {
            dqc.d(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                dqc.b(wrap, "bb");
                int i = wrap.getInt();
                int i2 = i + 4;
                if (available < i2) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i, dsd.a));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i3 = 0; i3 < length; i3++) {
                    strArr[i3] = names.getString(i3);
                }
                dqc.d(strArr, "$this$sort");
                if (length > 1) {
                    Arrays.sort(strArr);
                }
                HashMap hashMap = new HashMap();
                for (int i4 = 0; i4 < length; i4++) {
                    String str = strArr[i4];
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i5 = 1;
                        for (int i6 = 0; i6 < length2; i6++) {
                            iArr[i6] = jSONArray.getInt(i6);
                            i5 *= iArr[i6];
                        }
                        int i7 = i5 * 4;
                        int i8 = i2 + i7;
                        if (i8 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i2, i7);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        oo ooVar = new oo(iArr);
                        wrap2.asFloatBuffer().get(ooVar.b, 0, i5);
                        hashMap.put(str, ooVar);
                        i2 = i8;
                    }
                }
                return hashMap;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            qx.a(th, ou.class);
            return null;
        }
    }

    private String b(String str) {
        if (qx.a(this)) {
            return null;
        }
        try {
            dqc.d(str, "str");
            String str2 = str;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = dqc.a(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            Object[] array = new dsf("\\s+").b(str2.subSequence(i, length + 1).toString()).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                dqc.b(join, "TextUtils.join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
