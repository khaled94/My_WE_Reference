package defpackage;

import java.util.Arrays;

/* renamed from: eel  reason: default package */
/* loaded from: classes2.dex */
final class eel extends edx {
    final transient byte[][] f;
    final transient int[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eel(edu eduVar, int i) {
        super(null);
        eep.a(eduVar.b, 0L, i);
        eej eejVar = eduVar.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (eejVar.c == eejVar.b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += eejVar.c - eejVar.b;
            i4++;
            eejVar = eejVar.f;
        }
        this.f = new byte[i4];
        this.g = new int[i4 * 2];
        eej eejVar2 = eduVar.a;
        int i5 = 0;
        while (i2 < i) {
            this.f[i5] = eejVar2.a;
            i2 += eejVar2.c - eejVar2.b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i5] = i2;
            iArr[this.f.length + i5] = eejVar2.b;
            eejVar2.d = true;
            i5++;
            eejVar2 = eejVar2.f;
        }
    }

    @Override // defpackage.edx
    public final String a() {
        return i().a();
    }

    @Override // defpackage.edx
    public final String b() {
        return i().b();
    }

    @Override // defpackage.edx
    public final String e() {
        return i().e();
    }

    @Override // defpackage.edx
    public final edx f() {
        return i().f();
    }

    @Override // defpackage.edx
    public final edx c() {
        return i().c();
    }

    @Override // defpackage.edx
    public final edx d() {
        return i().d();
    }

    @Override // defpackage.edx
    public final edx a(int i, int i2) {
        return i().a(i, i2);
    }

    @Override // defpackage.edx
    public final byte a(int i) {
        eep.a(this.g[this.f.length - 1], i, 1L);
        int b = b(i);
        int i2 = b == 0 ? 0 : this.g[b - 1];
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // defpackage.edx
    public final int g() {
        return this.g[this.f.length - 1];
    }

    @Override // defpackage.edx
    public final byte[] h() {
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.edx
    public final void a(edu eduVar) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            eej eejVar = new eej(this.f[i], i3, (i3 + i4) - i2);
            if (eduVar.a == null) {
                eejVar.g = eejVar;
                eejVar.f = eejVar;
                eduVar.a = eejVar;
            } else {
                eduVar.a.g.a(eejVar);
            }
            i++;
            i2 = i4;
        }
        eduVar.b += i2;
    }

    @Override // defpackage.edx
    public final boolean a(int i, edx edxVar, int i2, int i3) {
        if (g() - i3 < 0) {
            return false;
        }
        int b = b(0);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.g[b - 1];
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!edxVar.a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    @Override // defpackage.edx
    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.g[b - 1];
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!eep.a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    private edx i() {
        return new edx(h());
    }

    @Override // defpackage.edx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edx) {
            edx edxVar = (edx) obj;
            if (edxVar.g() == g() && a(0, edxVar, 0, g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edx
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.d = i4;
        return i4;
    }

    @Override // defpackage.edx
    public final String toString() {
        return i().toString();
    }

    private Object writeReplace() {
        return i();
    }
}
