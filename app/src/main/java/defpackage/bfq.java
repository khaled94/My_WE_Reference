package defpackage;

import com.google.android.gms.internal.places.zzbk;
import defpackage.bcc;

/* renamed from: bfq  reason: default package */
/* loaded from: classes2.dex */
public final class bfq extends bcc<bfq, a> implements bdj {
    private static final bfq zzdr;
    private static volatile bdq<bfq> zzds;
    private bch<String> zzdo = bdv.a();
    public bci zzdp = bce.a();
    public bch<bgb> zzdq = bdv.a();

    private bfq() {
    }

    /* renamed from: bfq$a */
    /* loaded from: classes2.dex */
    public static final class a extends bcc.a<bfq, a> implements bdj {
        private a() {
            super(bfq.zzdr);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    public final int h() {
        return this.zzdq.size();
    }

    public static bfq a(byte[] bArr) throws zzbk {
        return (bfq) bcc.a(zzdr, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bcc
    public final Object a(int i) {
        switch (bfp.a[i - 1]) {
            case 1:
                return new bfq();
            case 2:
                return new a((byte) 0);
            case 3:
                return new bdu(zzdr, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0016\u0003\u001c", new Object[]{"zzdo", "zzdp", "zzdq"});
            case 4:
                return zzdr;
            case 5:
                bdq<bfq> bdqVar = zzds;
                if (bdqVar == null) {
                    synchronized (bfq.class) {
                        bdqVar = zzds;
                        if (bdqVar == null) {
                            bdqVar = new bcc.c<>(zzdr);
                            zzds = bdqVar;
                        }
                    }
                }
                return bdqVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bfq bfqVar = new bfq();
        zzdr = bfqVar;
        bcc.zzij.put(bfq.class, bfqVar);
    }
}
