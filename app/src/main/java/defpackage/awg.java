package defpackage;

/* JADX WARN: Init of enum zzanj can be incorrect */
/* JADX WARN: Init of enum zzank can be incorrect */
/* JADX WARN: Init of enum zzanl can be incorrect */
/* JADX WARN: Init of enum zzanm can be incorrect */
/* renamed from: awg  reason: default package */
/* loaded from: classes.dex */
public enum awg {
    DOUBLE(awj.DOUBLE, 1),
    FLOAT(awj.FLOAT, 5),
    INT64(awj.LONG, 0),
    UINT64(awj.LONG, 0),
    INT32(awj.INT, 0),
    FIXED64(awj.LONG, 1),
    FIXED32(awj.INT, 5),
    BOOL(awj.BOOLEAN, 0),
    STRING(r1, 2) { // from class: awf
    },
    GROUP(r1, 3) { // from class: awi
    },
    MESSAGE(r1, 2) { // from class: awh
    },
    BYTES(r1, 2) { // from class: awk
    },
    UINT32(awj.INT, 0),
    ENUM(awj.ENUM, 0),
    SFIXED32(awj.INT, 5),
    SFIXED64(awj.LONG, 1),
    SINT32(awj.INT, 0),
    SINT64(awj.LONG, 0);
    
    private final awj zzant;
    private final int zzanu;

    awg(awj awjVar, int i) {
        this.zzant = awjVar;
        this.zzanu = i;
    }

    public final awj zzwz() {
        return this.zzant;
    }

    public final int zzxa() {
        return this.zzanu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* synthetic */ awg(awj awjVar, int i, awd awdVar) {
        this(awjVar, i);
    }

    static {
        final awj awjVar = awj.STRING;
        final awj awjVar2 = awj.MESSAGE;
        final awj awjVar3 = awj.MESSAGE;
        final awj awjVar4 = awj.BYTE_STRING;
    }
}
