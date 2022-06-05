package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aap  reason: default package */
/* loaded from: classes.dex */
public class aap {
    private static final aak a = new aak("LibraryVersion", "");
    private static aap b = new aap();
    private ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();

    protected aap() {
    }

    public static aap a() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "Please provide a valid libraryName"
            defpackage.aat.a(r7, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r6.c
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L18
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r6.c
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L18:
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            r2 = 1
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r4 = 0
            r2[r4] = r7     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.Class<aap> r4 = defpackage.aap.class
            java.lang.String r5 = "/%s.properties"
            java.lang.String r2 = java.lang.String.format(r5, r2)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.io.InputStream r2 = r4.getResourceAsStream(r2)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            if (r2 == 0) goto L6f
            r1.load(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            java.lang.String r4 = "version"
            java.lang.String r3 = r1.getProperty(r4, r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            aak r1 = defpackage.aap.a     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            int r4 = r4 + 12
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            r5.append(r7)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            java.lang.String r4 = " version is "
            r5.append(r4)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            r5.append(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            r5 = 2
            boolean r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            if (r5 == 0) goto L8f
            r1.a(r4)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            goto L8f
        L6f:
            aak r1 = defpackage.aap.a     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            if (r5 == 0) goto L80
            java.lang.String r4 = r0.concat(r4)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            goto L85
        L80:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
        L85:
            r5 = 5
            boolean r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
            if (r5 == 0) goto L8f
            r1.a(r4)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L98
        L8f:
            if (r2 == 0) goto Lc5
            defpackage.aed.a(r2)
            goto Lc5
        L95:
            r7 = move-exception
            r3 = r2
            goto Ldd
        L98:
            r1 = r3
            r3 = r2
            goto L9e
        L9b:
            r7 = move-exception
            goto Ldd
        L9d:
            r1 = r3
        L9e:
            aak r2 = defpackage.aap.a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L9b
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto Laf
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L9b
            goto Lb5
        Laf:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L9b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            r0 = r4
        Lb5:
            r4 = 6
            boolean r4 = r2.a(r4)     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto Lbf
            r2.a(r0)     // Catch: java.lang.Throwable -> L9b
        Lbf:
            if (r3 == 0) goto Lc4
            defpackage.aed.a(r3)
        Lc4:
            r3 = r1
        Lc5:
            if (r3 != 0) goto Ld7
            aak r0 = defpackage.aap.a
            r1 = 3
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto Ld5
            java.lang.String r1 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.a(r1)
        Ld5:
            java.lang.String r3 = "UNKNOWN"
        Ld7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r6.c
            r0.put(r7, r3)
            return r3
        Ldd:
            if (r3 == 0) goto Le2
            defpackage.aed.a(r3)
        Le2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aap.a(java.lang.String):java.lang.String");
    }
}
