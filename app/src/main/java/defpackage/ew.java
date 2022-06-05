package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: ew  reason: default package */
/* loaded from: classes2.dex */
public final class ew implements eu {
    private static final Bitmap.Config[] a;
    private static final Bitmap.Config[] b;
    private static final Bitmap.Config[] c;
    private static final Bitmap.Config[] d;
    private static final Bitmap.Config[] e;
    private final b f = new b();
    private final eq<a, Bitmap> g = new eq<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> h = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        a = configArr;
        b = configArr;
        c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    @Override // defpackage.eu
    public final void a(Bitmap bitmap) {
        a a2 = this.f.a(lg.a(bitmap), bitmap.getConfig());
        this.g.a(a2, bitmap);
        NavigableMap<Integer, Integer> a3 = a(bitmap.getConfig());
        Integer num = (Integer) a3.get(Integer.valueOf(a2.a));
        Integer valueOf = Integer.valueOf(a2.a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a3.put(valueOf, Integer.valueOf(i));
    }

    @Override // defpackage.eu
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int a2 = lg.a(i, i2, config);
        a a3 = this.f.a(a2, config);
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = b;
        } else {
            int i4 = AnonymousClass1.a[config.ordinal()];
            if (i4 == 1) {
                configArr = a;
            } else if (i4 == 2) {
                configArr = c;
            } else if (i4 == 3) {
                configArr = d;
            } else {
                configArr = i4 != 4 ? new Bitmap.Config[]{config} : e;
            }
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer ceilingKey = a(config2).ceilingKey(Integer.valueOf(a2));
            if (ceilingKey == null || ceilingKey.intValue() > a2 * 8) {
                i3++;
            } else if (ceilingKey.intValue() != a2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f.a(a3);
                a3 = this.f.a(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a4 = this.g.a((eq<a, Bitmap>) a3);
        if (a4 != null) {
            a(Integer.valueOf(a3.a), a4);
            a4.reconfigure(i, i2, config);
        }
        return a4;
    }

    @Override // defpackage.eu
    public final Bitmap a() {
        Bitmap a2 = this.g.a();
        if (a2 != null) {
            a(Integer.valueOf(lg.a(a2)), a2);
        }
        return a2;
    }

    private void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> a2 = a(bitmap.getConfig());
        Integer num2 = (Integer) a2.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + b(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            a2.remove(num);
        } else {
            a2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> a(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.h.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.h.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // defpackage.eu
    public final String b(Bitmap bitmap) {
        return a(lg.a(bitmap), bitmap.getConfig());
    }

    @Override // defpackage.eu
    public final String b(int i, int i2, Bitmap.Config config) {
        return a(lg.a(i, i2, config), config);
    }

    @Override // defpackage.eu
    public final int c(Bitmap bitmap) {
        return lg.a(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SizeConfigStrategy{groupedMap=");
        sb.append(this.g);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* renamed from: ew$b */
    /* loaded from: classes2.dex */
    static class b extends em<a> {
        b() {
        }

        public final a a(int i, Bitmap.Config config) {
            a b = b();
            b.a(i, config);
            return b;
        }

        @Override // defpackage.em
        protected final /* synthetic */ a a() {
            return new a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ew$a */
    /* loaded from: classes2.dex */
    public static final class a implements ev {
        int a;
        private final b b;
        private Bitmap.Config c;

        public a(b bVar) {
            this.b = bVar;
        }

        public final void a(int i, Bitmap.Config config) {
            this.a = i;
            this.c = config;
        }

        @Override // defpackage.ev
        public final void a() {
            this.b.a(this);
        }

        public final String toString() {
            return ew.a(this.a, this.c);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a && lg.a(this.c, aVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.a * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }
    }

    static String a(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: ew$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
