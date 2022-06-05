package defpackage;

/* JADX WARN: Init of enum zznr can be incorrect */
/* JADX WARN: Init of enum zzns can be incorrect */
/* JADX WARN: Init of enum zznt can be incorrect */
/* JADX WARN: Init of enum zznu can be incorrect */
/* renamed from: bfc  reason: default package */
/* loaded from: classes2.dex */
public enum bfc {
    DOUBLE(bfj.DOUBLE, 1),
    FLOAT(bfj.FLOAT, 5),
    INT64(bfj.LONG, 0),
    UINT64(bfj.LONG, 0),
    INT32(bfj.INT, 0),
    FIXED64(bfj.LONG, 1),
    FIXED32(bfj.INT, 5),
    BOOL(bfj.BOOLEAN, 0),
    STRING(r1, 2) { // from class: bff
    },
    GROUP(r1, 3) { // from class: bfe
    },
    MESSAGE(r1, 2) { // from class: bfh
    },
    BYTES(r1, 2) { // from class: bfg
    },
    UINT32(bfj.INT, 0),
    ENUM(bfj.ENUM, 0),
    SFIXED32(bfj.INT, 5),
    SFIXED64(bfj.LONG, 1),
    SINT32(bfj.INT, 0),
    SINT64(bfj.LONG, 0);
    
    private final bfj zzob;
    private final int zzoc;

    bfc(bfj bfjVar, int i) {
        this.zzob = bfjVar;
        this.zzoc = i;
    }

    public final bfj zzdr() {
        return this.zzob;
    }

    public final int zzds() {
        return this.zzoc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* synthetic */ bfc(bfj bfjVar, int i, bfd bfdVar) {
        this(bfjVar, i);
    }

    static {
        final bfj bfjVar = bfj.STRING;
        final bfj bfjVar2 = bfj.MESSAGE;
        final bfj bfjVar3 = bfj.MESSAGE;
        final bfj bfjVar4 = bfj.BYTE_STRING;
    }
}
