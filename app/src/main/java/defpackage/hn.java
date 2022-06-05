package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: hn  reason: default package */
/* loaded from: classes2.dex */
public final class hn {
    private static final Paint a = new Paint(6);
    private static final Paint b = new Paint(7);
    private static final Paint c;
    private static final Set<String> d;
    private static final Lock e;

    public static int a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static boolean b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        d = hashSet;
        e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private hn() {
    }

    public static Lock a() {
        return e;
    }

    public static Bitmap a(en enVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = i2 / bitmap.getHeight();
            f3 = (i - (bitmap.getWidth() * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = i / bitmap.getWidth();
            f = (i2 - (bitmap.getHeight() * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((int) (f3 + 0.5f), (int) (f + 0.5f));
        Bitmap a2 = enVar.a(i, i2, a(bitmap));
        a(bitmap, a2);
        a(bitmap, a2, matrix);
        return a2;
    }

    public static Bitmap b(en enVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        Bitmap a2 = enVar.a((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), a(bitmap));
        a(bitmap, a2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            StringBuilder sb2 = new StringBuilder("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder("toReuse: ");
            sb3.append(a2.getWidth());
            sb3.append("x");
            sb3.append(a2.getHeight());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, a2, matrix);
        return a2;
    }

    public static Bitmap c(en enVar, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? b(enVar, bitmap, i, i2) : bitmap;
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap a(en enVar, Bitmap bitmap, int i) {
        if (!b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a2 = enVar.a(Math.round(rectF.width()), Math.round(rectF.height()), a(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        a2.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, a2, matrix);
        return a2;
    }

    private static Bitmap.Config a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, a);
            canvas.setBitmap(null);
        } finally {
            e.unlock();
        }
    }

    /* renamed from: hn$a */
    /* loaded from: classes2.dex */
    static final class a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }

        a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
    }
}
