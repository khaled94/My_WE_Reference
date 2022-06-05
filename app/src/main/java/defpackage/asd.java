package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: asd  reason: default package */
/* loaded from: classes.dex */
public class asd extends asa {
    protected final byte[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public asd(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.c = bArr;
    }

    protected int d() {
        return 0;
    }

    @Override // defpackage.art
    public byte a(int i) {
        return this.c[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.art
    public byte b(int i) {
        return this.c[i];
    }

    @Override // defpackage.art
    public int a() {
        return this.c.length;
    }

    @Override // defpackage.art
    public final art c(int i) {
        int a = a(0, i, a());
        if (a == 0) {
            return art.a;
        }
        return new arw(this.c, d(), a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.art
    public final void a(arq arqVar) throws IOException {
        arqVar.a(this.c, d(), a());
    }

    @Override // defpackage.art
    protected final String a(Charset charset) {
        return new String(this.c, d(), a(), charset);
    }

    @Override // defpackage.art
    public final boolean c() {
        int d = d();
        return avx.a(this.c, d, a() + d);
    }

    @Override // defpackage.art
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof art) || a() != ((art) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (obj instanceof asd) {
            asd asdVar = (asd) obj;
            int i = this.b;
            int i2 = asdVar.b;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return a(asdVar, a());
        }
        return obj.equals(this);
    }

    @Override // defpackage.asa
    final boolean a(art artVar, int i) {
        if (i > artVar.a()) {
            int a = a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i > artVar.a()) {
            int a2 = artVar.a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (artVar instanceof asd) {
            asd asdVar = (asd) artVar;
            byte[] bArr = this.c;
            byte[] bArr2 = asdVar.c;
            int d = d() + i;
            int d2 = d();
            int d3 = asdVar.d();
            while (d2 < d) {
                if (bArr[d2] != bArr2[d3]) {
                    return false;
                }
                d2++;
                d3++;
            }
            return true;
        } else {
            return artVar.c(i).equals(c(i));
        }
    }

    @Override // defpackage.art
    protected final int a(int i, int i2) {
        return atb.a(i, this.c, d(), i2);
    }
}
