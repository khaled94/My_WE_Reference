package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bbi  reason: default package */
/* loaded from: classes2.dex */
public class bbi extends bbf {
    protected final byte[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bbi(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c() {
        return 0;
    }

    @Override // defpackage.bgb
    public byte a(int i) {
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bgb
    public byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.bgb
    public int a() {
        return this.a.length;
    }

    @Override // defpackage.bgb
    public final bgb c(int i) {
        int a = a(0, i, a());
        if (a == 0) {
            return bgb.b;
        }
        return new bge(this.a, c(), a);
    }

    @Override // defpackage.bgb
    protected void a(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bgb
    public final void a(bfy bfyVar) throws IOException {
        bfyVar.a(this.a, c(), a());
    }

    @Override // defpackage.bgb
    protected final String a(Charset charset) {
        return new String(this.a, c(), a(), charset);
    }

    @Override // defpackage.bgb
    public final boolean b() {
        int c = c();
        return bex.a(this.a, c, a() + c);
    }

    @Override // defpackage.bgb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bgb) || a() != ((bgb) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (obj instanceof bbi) {
            bbi bbiVar = (bbi) obj;
            int i = this.c;
            int i2 = bbiVar.c;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return a(bbiVar, a());
        }
        return obj.equals(this);
    }

    @Override // defpackage.bbf
    final boolean a(bgb bgbVar, int i) {
        if (i > bgbVar.a()) {
            int a = a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i > bgbVar.a()) {
            int a2 = bgbVar.a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (bgbVar instanceof bbi) {
            bbi bbiVar = (bbi) bgbVar;
            byte[] bArr = this.a;
            byte[] bArr2 = bbiVar.a;
            int c = c() + i;
            int c2 = c();
            int c3 = bbiVar.c();
            while (c2 < c) {
                if (bArr[c2] != bArr2[c3]) {
                    return false;
                }
                c2++;
                c3++;
            }
            return true;
        } else {
            return bgbVar.c(i).equals(c(i));
        }
    }

    @Override // defpackage.bgb
    protected final int a(int i, int i2) {
        return bcd.a(i, this.a, c(), i2);
    }
}
