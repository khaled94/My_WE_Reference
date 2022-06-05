package defpackage;

/* renamed from: bfj  reason: default package */
/* loaded from: classes2.dex */
public enum bfj {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(bgb.b),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzjr;

    bfj(Object obj) {
        this.zzjr = obj;
    }
}
