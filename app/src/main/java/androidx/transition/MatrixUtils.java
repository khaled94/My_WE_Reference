package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes.dex */
class MatrixUtils {
    static final Matrix IDENTITY_MATRIX = new Matrix() { // from class: androidx.transition.MatrixUtils.1
        final void oops() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public final void set(Matrix matrix) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void reset() {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setTranslate(float f, float f2) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setScale(float f, float f2, float f3, float f4) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setScale(float f, float f2) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setRotate(float f, float f2, float f3) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setRotate(float f) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setSinCos(float f, float f2, float f3, float f4) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setSinCos(float f, float f2) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setSkew(float f, float f2, float f3, float f4) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final void setSkew(float f, float f2) {
            oops();
        }

        @Override // android.graphics.Matrix
        public final boolean setConcat(Matrix matrix, Matrix matrix2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean preTranslate(float f, float f2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean preScale(float f, float f2, float f3, float f4) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean preScale(float f, float f2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean preRotate(float f, float f2, float f3) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean preRotate(float f) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean preSkew(float f, float f2, float f3, float f4) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean preSkew(float f, float f2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean preConcat(Matrix matrix) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean postTranslate(float f, float f2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean postScale(float f, float f2, float f3, float f4) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean postScale(float f, float f2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean postRotate(float f, float f2, float f3) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean postRotate(float f) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean postSkew(float f, float f2, float f3, float f4) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean postSkew(float f, float f2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean postConcat(Matrix matrix) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public final void setValues(float[] fArr) {
            oops();
        }
    };

    private MatrixUtils() {
    }
}
