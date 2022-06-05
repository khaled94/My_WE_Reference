package defpackage;

import android.content.res.Resources;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/ResourcesUtil;", "", "()V", "getFallbackIdString", "", "resourceId", "", "getIdString", "r", "Landroid/content/res/Resources;", "getIdStringQuietly", "getResourcePackageId", "id", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: rd  reason: default package */
/* loaded from: classes2.dex */
public final class rd {
    public static final rd a = new rd();

    private rd() {
    }

    private static String a(int i) {
        return "#" + Integer.toHexString(i);
    }

    public static final String a(Resources resources, int i) {
        String str;
        try {
            if (resources == null) {
                return a(i);
            }
            String str2 = "";
            if (((i >>> 24) & 255) != 127) {
                str2 = resources.getResourcePackageName(i);
                dqc.b(str2, "r.getResourcePackageName(resourceId)");
                str = ":";
            } else {
                str = str2;
            }
            String resourceTypeName = resources.getResourceTypeName(i);
            String resourceEntryName = resources.getResourceEntryName(i);
            StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
            sb.append("@");
            sb.append(str2);
            sb.append(str);
            sb.append(resourceTypeName);
            sb.append("/");
            sb.append(resourceEntryName);
            String sb2 = sb.toString();
            dqc.b(sb2, "sb.toString()");
            return sb2;
        } catch (Resources.NotFoundException unused) {
            return a(i);
        }
    }
}
