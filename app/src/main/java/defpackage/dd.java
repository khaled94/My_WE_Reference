package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: dd  reason: default package */
/* loaded from: classes2.dex */
public final class dd extends cs<InputStream> {
    @Override // defpackage.cs
    protected final /* synthetic */ void a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    public dd(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.cu
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.cs
    protected final /* synthetic */ InputStream a(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
