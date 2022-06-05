package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import defpackage.hg;
import java.io.IOException;

/* renamed from: hj  reason: default package */
/* loaded from: classes2.dex */
public final class hj implements co<ParcelFileDescriptor, Bitmap> {
    private final ha a;

    @Override // defpackage.co
    public final /* synthetic */ ee<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, cm cmVar) throws IOException {
        ha haVar = this.a;
        return haVar.a(new hg.c(parcelFileDescriptor, haVar.h, haVar.g), i, i2, cmVar, ha.f);
    }

    @Override // defpackage.co
    public final /* synthetic */ boolean a(ParcelFileDescriptor parcelFileDescriptor, cm cmVar) throws IOException {
        return ((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && !"HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || (parcelFileDescriptor.getStatSize() > 536870912L ? 1 : (parcelFileDescriptor.getStatSize() == 536870912L ? 0 : -1)) <= 0) && ha.a();
    }

    public hj(ha haVar) {
        this.a = haVar;
    }
}
