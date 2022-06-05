package defpackage;

/* renamed from: atl  reason: default package */
/* loaded from: classes.dex */
public enum atl {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(art.class, art.class, art.a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzajh;
    private final Class<?> zzaji;
    private final Object zzajj;

    atl(Class cls, Class cls2, Object obj) {
        this.zzajh = cls;
        this.zzaji = cls2;
        this.zzajj = obj;
    }

    public final Class<?> zzvd() {
        return this.zzaji;
    }
}
