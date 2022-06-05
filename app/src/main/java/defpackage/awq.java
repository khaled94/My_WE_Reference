package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: awq  reason: default package */
/* loaded from: classes.dex */
final class awq implements Cloneable {
    awo<?, ?> a;
    Object b;
    List<aww> c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (this.b != null) {
            throw new NoSuchMethodError();
        }
        int i = 0;
        for (aww awwVar : this.c) {
            i += awn.c(awwVar.a) + 0 + awwVar.b.length;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(awn awnVar) throws IOException {
        if (this.b != null) {
            throw new NoSuchMethodError();
        }
        for (aww awwVar : this.c) {
            awnVar.b(awwVar.a);
            awnVar.b(awwVar.b);
        }
    }

    public final boolean equals(Object obj) {
        List<aww> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awq)) {
            return false;
        }
        awq awqVar = (awq) obj;
        if (this.b != null && awqVar.b != null) {
            awo<?, ?> awoVar = this.a;
            if (awoVar != awqVar.a) {
                return false;
            }
            if (!awoVar.a.isArray()) {
                return this.b.equals(awqVar.b);
            }
            Object obj2 = this.b;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) awqVar.b);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) awqVar.b);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) awqVar.b);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) awqVar.b);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) awqVar.b);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) awqVar.b);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) awqVar.b);
        }
        List<aww> list2 = this.c;
        if (list2 != null && (list = awqVar.c) != null) {
            return list2.equals(list);
        }
        try {
            return Arrays.equals(b(), awqVar.b());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] b() throws IOException {
        byte[] bArr = new byte[a()];
        a(awn.a(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final awq clone() {
        awq awqVar = new awq();
        try {
            awqVar.a = this.a;
            if (this.c == null) {
                awqVar.c = null;
            } else {
                awqVar.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof awu) {
                    awqVar.b = (awu) ((awu) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    awqVar.b = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length];
                        awqVar.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        awqVar.b = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        awqVar.b = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        awqVar.b = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        awqVar.b = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        awqVar.b = ((double[]) this.b).clone();
                    } else if (this.b instanceof awu[]) {
                        awu[] awuVarArr = (awu[]) this.b;
                        awu[] awuVarArr2 = new awu[awuVarArr.length];
                        awqVar.b = awuVarArr2;
                        while (i < awuVarArr.length) {
                            awuVarArr2[i] = (awu) awuVarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return awqVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
