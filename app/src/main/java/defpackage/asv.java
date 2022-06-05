package defpackage;

import java.lang.reflect.Type;

/* renamed from: asv  reason: default package */
/* loaded from: classes.dex */
public enum asv {
    DOUBLE(0, asx.SCALAR, atl.DOUBLE),
    FLOAT(1, asx.SCALAR, atl.FLOAT),
    INT64(2, asx.SCALAR, atl.LONG),
    UINT64(3, asx.SCALAR, atl.LONG),
    INT32(4, asx.SCALAR, atl.INT),
    FIXED64(5, asx.SCALAR, atl.LONG),
    FIXED32(6, asx.SCALAR, atl.INT),
    BOOL(7, asx.SCALAR, atl.BOOLEAN),
    STRING(8, asx.SCALAR, atl.STRING),
    MESSAGE(9, asx.SCALAR, atl.MESSAGE),
    BYTES(10, asx.SCALAR, atl.BYTE_STRING),
    UINT32(11, asx.SCALAR, atl.INT),
    ENUM(12, asx.SCALAR, atl.ENUM),
    SFIXED32(13, asx.SCALAR, atl.INT),
    SFIXED64(14, asx.SCALAR, atl.LONG),
    SINT32(15, asx.SCALAR, atl.INT),
    SINT64(16, asx.SCALAR, atl.LONG),
    GROUP(17, asx.SCALAR, atl.MESSAGE),
    DOUBLE_LIST(18, asx.VECTOR, atl.DOUBLE),
    FLOAT_LIST(19, asx.VECTOR, atl.FLOAT),
    INT64_LIST(20, asx.VECTOR, atl.LONG),
    UINT64_LIST(21, asx.VECTOR, atl.LONG),
    INT32_LIST(22, asx.VECTOR, atl.INT),
    FIXED64_LIST(23, asx.VECTOR, atl.LONG),
    FIXED32_LIST(24, asx.VECTOR, atl.INT),
    BOOL_LIST(25, asx.VECTOR, atl.BOOLEAN),
    STRING_LIST(26, asx.VECTOR, atl.STRING),
    MESSAGE_LIST(27, asx.VECTOR, atl.MESSAGE),
    BYTES_LIST(28, asx.VECTOR, atl.BYTE_STRING),
    UINT32_LIST(29, asx.VECTOR, atl.INT),
    ENUM_LIST(30, asx.VECTOR, atl.ENUM),
    SFIXED32_LIST(31, asx.VECTOR, atl.INT),
    SFIXED64_LIST(32, asx.VECTOR, atl.LONG),
    SINT32_LIST(33, asx.VECTOR, atl.INT),
    SINT64_LIST(34, asx.VECTOR, atl.LONG),
    DOUBLE_LIST_PACKED(35, asx.PACKED_VECTOR, atl.DOUBLE),
    FLOAT_LIST_PACKED(36, asx.PACKED_VECTOR, atl.FLOAT),
    INT64_LIST_PACKED(37, asx.PACKED_VECTOR, atl.LONG),
    UINT64_LIST_PACKED(38, asx.PACKED_VECTOR, atl.LONG),
    INT32_LIST_PACKED(39, asx.PACKED_VECTOR, atl.INT),
    FIXED64_LIST_PACKED(40, asx.PACKED_VECTOR, atl.LONG),
    FIXED32_LIST_PACKED(41, asx.PACKED_VECTOR, atl.INT),
    BOOL_LIST_PACKED(42, asx.PACKED_VECTOR, atl.BOOLEAN),
    UINT32_LIST_PACKED(43, asx.PACKED_VECTOR, atl.INT),
    ENUM_LIST_PACKED(44, asx.PACKED_VECTOR, atl.ENUM),
    SFIXED32_LIST_PACKED(45, asx.PACKED_VECTOR, atl.INT),
    SFIXED64_LIST_PACKED(46, asx.PACKED_VECTOR, atl.LONG),
    SINT32_LIST_PACKED(47, asx.PACKED_VECTOR, atl.INT),
    SINT64_LIST_PACKED(48, asx.PACKED_VECTOR, atl.LONG),
    GROUP_LIST(49, asx.VECTOR, atl.MESSAGE),
    MAP(50, asx.MAP, atl.VOID);
    
    private static final asv[] zzahj;
    private static final Type[] zzahk = new Type[0];
    private final int id;
    private final atl zzahf;
    private final asx zzahg;
    private final Class<?> zzahh;
    private final boolean zzahi;

    asv(int i, asx asxVar, atl atlVar) {
        int i2;
        this.id = i;
        this.zzahg = asxVar;
        this.zzahf = atlVar;
        int i3 = asu.a[asxVar.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzahh = atlVar.zzvd();
        } else if (i3 == 2) {
            this.zzahh = atlVar.zzvd();
        } else {
            this.zzahh = null;
        }
        this.zzahi = (asxVar != asx.SCALAR || (i2 = asu.b[atlVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    public final int id() {
        return this.id;
    }

    static {
        asv[] values = values();
        zzahj = new asv[values.length];
        for (asv asvVar : values) {
            zzahj[asvVar.id] = asvVar;
        }
    }
}
