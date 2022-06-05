package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: asl  reason: default package */
/* loaded from: classes.dex */
public final class asl {
    private static final Class<?> a = c();

    private static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static asn a() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return asn.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.asn b() {
        /*
            java.lang.Class<?> r0 = defpackage.asl.a
            if (r0 == 0) goto Lb
            java.lang.String r0 = "loadGeneratedRegistry"
            asn r0 = a(r0)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L12
            asn r0 = defpackage.asn.c()
        L12:
            if (r0 != 0) goto L18
            asn r0 = a()
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asl.b():asn");
    }

    private static final asn a(String str) throws Exception {
        return (asn) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
