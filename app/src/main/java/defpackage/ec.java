package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import defpackage.ds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ec  reason: default package */
/* loaded from: classes2.dex */
public final class ec<Data, ResourceType, Transcode> {
    private final Class<Data> a;
    private final Pools.Pool<List<Throwable>> b;
    private final List<? extends ds<Data, ResourceType, Transcode>> c;
    private final String d;

    public ec(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<ds<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.a = cls;
        this.b = pool;
        this.c = (List) lf.a(list);
        this.d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final ee<Transcode> a(cv<Data> cvVar, cm cmVar, int i, int i2, ds.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) lf.a(this.b.acquire(), "Argument must not be null");
        try {
            return a(cvVar, cmVar, i, i2, aVar, list);
        } finally {
            this.b.release(list);
        }
    }

    private ee<Transcode> a(cv<Data> cvVar, cm cmVar, int i, int i2, ds.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.c.size();
        ee<Transcode> eeVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            ds<Data, ResourceType, Transcode> dsVar = this.c.get(i3);
            try {
                eeVar = dsVar.a.a(aVar.a(dsVar.a(cvVar, i, i2, cmVar)), cmVar);
            } catch (GlideException e) {
                list.add(e);
            }
            if (eeVar != null) {
                break;
            }
        }
        if (eeVar != null) {
            return eeVar;
        }
        throw new GlideException(this.d, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.c.toArray()) + '}';
    }
}
