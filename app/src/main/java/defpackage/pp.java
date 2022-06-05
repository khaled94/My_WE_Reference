package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/FacebookSignatureValidator;", "", "()V", "FBF_HASH", "", "FBI_HASH", "FBL_HASH", "FBR2_HASH", "FBR_HASH", "IGR_HASH", "MSR_HASH", "validAppSignatureHashes", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validateSignature", "", "context", "Landroid/content/Context;", "packageName", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pp  reason: default package */
/* loaded from: classes2.dex */
public final class pp {
    public static final pp a = new pp();
    private static final HashSet<String> b = dnm.b("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    private pp() {
    }

    public static final boolean a(Context context, String str) {
        boolean z;
        int i;
        dqc.d(context, "context");
        dqc.d(str, "packageName");
        String str2 = Build.BRAND;
        int i2 = context.getApplicationInfo().flags;
        dqc.b(str2, "brand");
        if (!dsg.c(str2, "generic") || (i2 & 2) == 0) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo.signatures != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    dqc.b(signatureArr, "packageInfo.signatures");
                    if (!(signatureArr.length == 0)) {
                        Signature[] signatureArr2 = packageInfo.signatures;
                        dqc.b(signatureArr2, "packageInfo.signatures");
                        for (Signature signature : signatureArr2) {
                            HashSet<String> hashSet = b;
                            byte[] byteArray = signature.toByteArray();
                            dqc.b(byteArray, "it.toByteArray()");
                            String a2 = qi.a(byteArray);
                            dqc.d(hashSet, "$this$contains");
                            if (hashSet instanceof Collection) {
                                z = hashSet.contains(a2);
                            } else {
                                dqc.d(hashSet, "$this$indexOf");
                                if (!(hashSet instanceof List)) {
                                    Iterator<T> it = hashSet.iterator();
                                    int i3 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i = -1;
                                            break;
                                        }
                                        Object next = it.next();
                                        if (i3 < 0) {
                                            dmq.a();
                                        }
                                        if (dqc.a((Object) a2, next)) {
                                            i = i3;
                                            break;
                                        }
                                        i3++;
                                    }
                                } else {
                                    i = ((List) hashSet).indexOf(a2);
                                }
                                z = i >= 0;
                            }
                            if (!z) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }
        return true;
    }
}
