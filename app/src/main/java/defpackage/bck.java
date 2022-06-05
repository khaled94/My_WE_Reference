package defpackage;

/* renamed from: bck  reason: default package */
/* loaded from: classes2.dex */
public enum bck {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(bgb.class, bgb.class, bgb.b),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzjp;
    private final Class<?> zzjq;
    private final Object zzjr;

    bck(Class cls, Class cls2, Object obj) {
        this.zzjp = cls;
        this.zzjq = cls2;
        this.zzjr = obj;
    }

    public final Class<?> zzbw() {
        return this.zzjq;
    }
}
