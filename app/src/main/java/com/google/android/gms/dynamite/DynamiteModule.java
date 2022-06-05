package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {
    private static Boolean i = null;
    private static String j = null;
    private static boolean k = false;
    private static int l = -1;
    private static ago p;
    private static agp q;
    public final Context h;
    private static final ThreadLocal<agm> m = new ThreadLocal<>();
    private static final ThreadLocal<Long> n = new agd();
    private static final a.AbstractC0019a o = new age();
    public static final a a = new agf();
    public static final a b = new agg();
    public static final a c = new agh();
    public static final a d = new agi();
    public static final a e = new agj();
    public static final a f = new agk();
    public static final a g = new agl();

    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface AbstractC0019a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z) throws LoadingException;
        }

        /* loaded from: classes.dex */
        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        b a(Context context, String str, AbstractC0019a abstractC0019a) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        aat.a(context);
        this.h = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!aar.a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
                sb2.append("Module descriptor id '");
                sb2.append(valueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            if (valueOf2.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
        if (a(r10) != false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    private static ago a(Context context) {
        ago agoVar;
        synchronized (DynamiteModule.class) {
            ago agoVar2 = p;
            if (agoVar2 != null) {
                return agoVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    agoVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    agoVar = queryLocalInterface instanceof ago ? (ago) queryLocalInterface : new ago(iBinder);
                }
                if (agoVar != null) {
                    p = agoVar;
                    return agoVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() != 0) {
                    "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf);
                } else {
                    new String("Failed to load IDynamiteLoader from GmsCore: ");
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0269, code lost:
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
        com.google.android.gms.dynamite.DynamiteModule.m.set(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context r17, com.google.android.gms.dynamite.DynamiteModule.a r18, java.lang.String r19) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static void a(ClassLoader classLoader) throws LoadingException {
        agp agpVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                agpVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof agp) {
                    agpVar = (agp) queryLocalInterface;
                } else {
                    agpVar = new agp(iBinder);
                }
            }
            q = agpVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean a(Cursor cursor) {
        agm agmVar = m.get();
        if (agmVar == null || agmVar.a != null) {
            return false;
        }
        agmVar.a = cursor;
        return true;
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (a(r10) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int b(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.n     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r12.<init>()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r10 == 0) goto La2
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lae
            if (r11 == 0) goto La2
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lae
            if (r12 <= 0) goto L8d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lae
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.dynamite.DynamiteModule.j = r2     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.dynamite.DynamiteModule.l = r2     // Catch: java.lang.Throwable -> L8a
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.k = r9     // Catch: java.lang.Throwable -> L8a
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            boolean r1 = a(r10)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lae
            if (r1 == 0) goto L8d
            goto L8e
        L8a:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r11     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lae
        L8d:
            r0 = r10
        L8e:
            if (r11 != 0) goto L96
            if (r0 == 0) goto L95
            r0.close()
        L95:
            return r12
        L96:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
        L9e:
            r10 = move-exception
            goto Lbf
        La0:
            r10 = move-exception
            goto Lb1
        La2:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lae
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lae
            throw r11     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lae
        Laa:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto Lbf
        Lae:
            r11 = move-exception
            r0 = r10
            r10 = r11
        Lb1:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException
            if (r11 == 0) goto Lb7
            throw r10     // Catch: java.lang.Throwable -> L9e
        Lb7:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = "V2 version check failed"
            r11.<init>(r12, r10)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        Lbf:
            if (r0 == 0) goto Lc4
            r0.close()
        Lc4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.b(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    public final IBinder a(String str) throws LoadingException {
        try {
            return (IBinder) this.h.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2);
        }
    }
}
