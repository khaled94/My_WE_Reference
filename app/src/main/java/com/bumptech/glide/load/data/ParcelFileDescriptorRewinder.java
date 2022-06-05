package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import defpackage.cv;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements cv<ParcelFileDescriptor> {
    public final InternalRewinder a;

    @Override // defpackage.cv
    public final void b() {
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }

    /* loaded from: classes.dex */
    public static final class a implements cv.a<ParcelFileDescriptor> {
        @Override // defpackage.cv.a
        public final /* synthetic */ cv<ParcelFileDescriptor> a(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // defpackage.cv.a
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }
    }

    /* loaded from: classes.dex */
    public static final class InternalRewinder {
        private final ParcelFileDescriptor a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public final ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @Override // defpackage.cv
    public final /* synthetic */ ParcelFileDescriptor a() throws IOException {
        return this.a.rewind();
    }
}
