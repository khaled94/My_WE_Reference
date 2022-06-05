package defpackage;

import java.lang.reflect.Type;

/* renamed from: bbv  reason: default package */
/* loaded from: classes2.dex */
public enum bbv {
    DOUBLE(0, bbx.SCALAR, bck.DOUBLE),
    FLOAT(1, bbx.SCALAR, bck.FLOAT),
    INT64(2, bbx.SCALAR, bck.LONG),
    UINT64(3, bbx.SCALAR, bck.LONG),
    INT32(4, bbx.SCALAR, bck.INT),
    FIXED64(5, bbx.SCALAR, bck.LONG),
    FIXED32(6, bbx.SCALAR, bck.INT),
    BOOL(7, bbx.SCALAR, bck.BOOLEAN),
    STRING(8, bbx.SCALAR, bck.STRING),
    MESSAGE(9, bbx.SCALAR, bck.MESSAGE),
    BYTES(10, bbx.SCALAR, bck.BYTE_STRING),
    UINT32(11, bbx.SCALAR, bck.INT),
    ENUM(12, bbx.SCALAR, bck.ENUM),
    SFIXED32(13, bbx.SCALAR, bck.INT),
    SFIXED64(14, bbx.SCALAR, bck.LONG),
    SINT32(15, bbx.SCALAR, bck.INT),
    SINT64(16, bbx.SCALAR, bck.LONG),
    GROUP(17, bbx.SCALAR, bck.MESSAGE),
    DOUBLE_LIST(18, bbx.VECTOR, bck.DOUBLE),
    FLOAT_LIST(19, bbx.VECTOR, bck.FLOAT),
    INT64_LIST(20, bbx.VECTOR, bck.LONG),
    UINT64_LIST(21, bbx.VECTOR, bck.LONG),
    INT32_LIST(22, bbx.VECTOR, bck.INT),
    FIXED64_LIST(23, bbx.VECTOR, bck.LONG),
    FIXED32_LIST(24, bbx.VECTOR, bck.INT),
    BOOL_LIST(25, bbx.VECTOR, bck.BOOLEAN),
    STRING_LIST(26, bbx.VECTOR, bck.STRING),
    MESSAGE_LIST(27, bbx.VECTOR, bck.MESSAGE),
    BYTES_LIST(28, bbx.VECTOR, bck.BYTE_STRING),
    UINT32_LIST(29, bbx.VECTOR, bck.INT),
    ENUM_LIST(30, bbx.VECTOR, bck.ENUM),
    SFIXED32_LIST(31, bbx.VECTOR, bck.INT),
    SFIXED64_LIST(32, bbx.VECTOR, bck.LONG),
    SINT32_LIST(33, bbx.VECTOR, bck.INT),
    SINT64_LIST(34, bbx.VECTOR, bck.LONG),
    DOUBLE_LIST_PACKED(35, bbx.PACKED_VECTOR, bck.DOUBLE),
    FLOAT_LIST_PACKED(36, bbx.PACKED_VECTOR, bck.FLOAT),
    INT64_LIST_PACKED(37, bbx.PACKED_VECTOR, bck.LONG),
    UINT64_LIST_PACKED(38, bbx.PACKED_VECTOR, bck.LONG),
    INT32_LIST_PACKED(39, bbx.PACKED_VECTOR, bck.INT),
    FIXED64_LIST_PACKED(40, bbx.PACKED_VECTOR, bck.LONG),
    FIXED32_LIST_PACKED(41, bbx.PACKED_VECTOR, bck.INT),
    BOOL_LIST_PACKED(42, bbx.PACKED_VECTOR, bck.BOOLEAN),
    UINT32_LIST_PACKED(43, bbx.PACKED_VECTOR, bck.INT),
    ENUM_LIST_PACKED(44, bbx.PACKED_VECTOR, bck.ENUM),
    SFIXED32_LIST_PACKED(45, bbx.PACKED_VECTOR, bck.INT),
    SFIXED64_LIST_PACKED(46, bbx.PACKED_VECTOR, bck.LONG),
    SINT32_LIST_PACKED(47, bbx.PACKED_VECTOR, bck.INT),
    SINT64_LIST_PACKED(48, bbx.PACKED_VECTOR, bck.LONG),
    GROUP_LIST(49, bbx.VECTOR, bck.MESSAGE),
    MAP(50, bbx.MAP, bck.VOID);
    
    private static final bbv[] zzhq;
    private static final Type[] zzhr = new Type[0];
    private final int id;
    private final bck zzhm;
    private final bbx zzhn;
    private final Class<?> zzho;
    private final boolean zzhp;

    bbv(int i, bbx bbxVar, bck bckVar) {
        int i2;
        this.id = i;
        this.zzhn = bbxVar;
        this.zzhm = bckVar;
        int i3 = bby.a[bbxVar.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzho = bckVar.zzbw();
        } else if (i3 == 2) {
            this.zzho = bckVar.zzbw();
        } else {
            this.zzho = null;
        }
        this.zzhp = (bbxVar != bbx.SCALAR || (i2 = bby.b[bckVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    public final int id() {
        return this.id;
    }

    static {
        bbv[] values = values();
        zzhq = new bbv[values.length];
        for (bbv bbvVar : values) {
            zzhq[bbvVar.id] = bbvVar;
        }
    }
}
