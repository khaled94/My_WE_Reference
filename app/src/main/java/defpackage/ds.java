package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ds  reason: default package */
/* loaded from: classes2.dex */
public final class ds<DataType, ResourceType, Transcode> {
    final io<ResourceType, Transcode> a;
    private final Class<DataType> b;
    private final List<? extends co<DataType, ResourceType>> c;
    private final Pools.Pool<List<Throwable>> d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ds$a */
    /* loaded from: classes2.dex */
    public interface a<ResourceType> {
        ee<ResourceType> a(ee<ResourceType> eeVar);
    }

    public ds(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends co<DataType, ResourceType>> list, io<ResourceType, Transcode> ioVar, Pools.Pool<List<Throwable>> pool) {
        this.b = cls;
        this.c = list;
        this.a = ioVar;
        this.d = pool;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ee<ResourceType> a(cv<DataType> cvVar, int i, int i2, cm cmVar) throws GlideException {
        List<Throwable> list = (List) lf.a(this.d.acquire(), "Argument must not be null");
        try {
            return a(cvVar, i, i2, cmVar, list);
        } finally {
            this.d.release(list);
        }
    }

    private ee<ResourceType> a(cv<DataType> cvVar, int i, int i2, cm cmVar, List<Throwable> list) throws GlideException {
        int size = this.c.size();
        ee<ResourceType> eeVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            co<DataType, ResourceType> coVar = this.c.get(i3);
            try {
                if (coVar.a(cvVar.a(), cmVar)) {
                    eeVar = coVar.a(cvVar.a(), i, i2, cmVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    new StringBuilder("Failed to decode data for ").append(coVar);
                }
                list.add(e);
            }
            if (eeVar != null) {
                break;
            }
        }
        if (eeVar != null) {
            return eeVar;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.b + ", decoders=" + this.c + ", transcoder=" + this.a + '}';
    }
}
