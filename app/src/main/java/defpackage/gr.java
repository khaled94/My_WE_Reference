package defpackage;

import android.graphics.Bitmap;

/* renamed from: gr  reason: default package */
/* loaded from: classes2.dex */
public final class gr implements cp<Bitmap> {
    public static final cl<Integer> a = cl.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final cl<Bitmap.CompressFormat> b = cl.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final ek c;

    public gr(ek ekVar) {
        this.c = ekVar;
    }

    @Deprecated
    public gr() {
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:2|(2:4|(1:6)(1:7))|8|42|9|10|(2:45|11)|(5:47|12|(2:14|15)(1:16)|17|18)|43|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r9 = new java.lang.StringBuilder("Compressed with type: ");
        r9.append(r0);
        r9.append(" of size ");
        r9.append(defpackage.lg.a(r8));
        r9.append(" in ");
        r9.append(defpackage.lb.a(r1));
        r9.append(", options format: ");
        r9.append(r10.a(defpackage.gr.b));
        r9.append(", hasAlpha: ");
        r9.append(r8.hasAlpha());
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #2 {all -> 0x00b7, blocks: (B:9:0x002d, B:19:0x0059, B:26:0x0067, B:27:0x006a, B:30:0x006e, B:32:0x0077), top: B:42:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(defpackage.ee<android.graphics.Bitmap> r8, java.io.File r9, defpackage.cm r10) {
        /*
            r7 = this;
            java.lang.Object r8 = r8.b()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            cl<android.graphics.Bitmap$CompressFormat> r0 = defpackage.gr.b
            java.lang.Object r0 = r10.a(r0)
            android.graphics.Bitmap$CompressFormat r0 = (android.graphics.Bitmap.CompressFormat) r0
            if (r0 == 0) goto L11
            goto L1c
        L11:
            boolean r0 = r8.hasAlpha()
            if (r0 == 0) goto L1a
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            goto L1c
        L1a:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
        L1c:
            int r1 = r8.getWidth()
            java.lang.Integer.valueOf(r1)
            int r1 = r8.getHeight()
            java.lang.Integer.valueOf(r1)
            defpackage.li.c()
            long r1 = defpackage.lb.a()     // Catch: java.lang.Throwable -> Lb7
            cl<java.lang.Integer> r3 = defpackage.gr.a     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r3 = r10.a(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Lb7
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lb7
            r4 = 0
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L64
            r6.<init>(r9)     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L64
            ek r9 = r7.c     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            if (r9 == 0) goto L51
            ct r9 = new ct     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            ek r5 = r7.c     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            r5 = r9
            goto L52
        L51:
            r5 = r6
        L52:
            r8.compress(r0, r3, r5)     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L64
            r5.close()     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L64
            r4 = 1
        L59:
            r5.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lb7
            goto L6e
        L5d:
            goto L6b
        L5f:
            r8 = move-exception
            r5 = r6
            goto L65
        L62:
            r5 = r6
            goto L6b
        L64:
            r8 = move-exception
        L65:
            if (r5 == 0) goto L6a
            r5.close()     // Catch: java.io.IOException -> L6a java.lang.Throwable -> Lb7
        L6a:
            throw r8     // Catch: java.lang.Throwable -> Lb7
        L6b:
            if (r5 == 0) goto L6e
            goto L59
        L6e:
            java.lang.String r9 = "BitmapEncoder"
            r3 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r3)     // Catch: java.lang.Throwable -> Lb7
            if (r9 == 0) goto Lb3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "Compressed with type: "
            r9.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = " of size "
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb7
            int r0 = defpackage.lg.a(r8)     // Catch: java.lang.Throwable -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = " in "
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb7
            double r0 = defpackage.lb.a(r1)     // Catch: java.lang.Throwable -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = ", options format: "
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb7
            cl<android.graphics.Bitmap$CompressFormat> r0 = defpackage.gr.b     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r10 = r10.a(r0)     // Catch: java.lang.Throwable -> Lb7
            r9.append(r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r10 = ", hasAlpha: "
            r9.append(r10)     // Catch: java.lang.Throwable -> Lb7
            boolean r8 = r8.hasAlpha()     // Catch: java.lang.Throwable -> Lb7
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb7
        Lb3:
            defpackage.li.f()
            return r4
        Lb7:
            r8 = move-exception
            defpackage.li.f()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr.a(ee, java.io.File, cm):boolean");
    }

    @Override // defpackage.cp
    public final ch a(cm cmVar) {
        return ch.TRANSFORMED;
    }
}
