package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: cy  reason: default package */
/* loaded from: classes2.dex */
public final class cy extends cs<AssetFileDescriptor> {
    @Override // defpackage.cs
    protected final /* synthetic */ void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    public cy(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.cu
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.cs
    protected final /* synthetic */ AssetFileDescriptor a(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
