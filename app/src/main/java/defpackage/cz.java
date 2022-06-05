package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: cz  reason: default package */
/* loaded from: classes2.dex */
public final class cz extends dc<ParcelFileDescriptor> {
    @Override // defpackage.dc
    protected final /* synthetic */ void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    public cz(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.cu
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.dc
    protected final /* synthetic */ ParcelFileDescriptor a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
        }
        return openAssetFileDescriptor.getParcelFileDescriptor();
    }
}
