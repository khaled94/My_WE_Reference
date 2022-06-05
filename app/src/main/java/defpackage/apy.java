package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import defpackage.apn;
import java.io.IOException;

/* renamed from: apy  reason: default package */
/* loaded from: classes.dex */
public final class apy extends awp<apy> {
    private static volatile apy[] d;
    public Integer a = null;
    public apn.d[] b = new apn.d[0];
    public apn.a[] c = new apn.a[0];
    private Boolean e = null;
    private Boolean f = null;

    public static apy[] a() {
        if (d == null) {
            synchronized (aws.b) {
                if (d == null) {
                    d = new apy[0];
                }
            }
        }
        return d;
    }

    public apy() {
        this.g = null;
        this.h = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof apy)) {
            return false;
        }
        apy apyVar = (apy) obj;
        Integer num = this.a;
        if (num == null) {
            if (apyVar.a != null) {
                return false;
            }
        } else if (!num.equals(apyVar.a)) {
            return false;
        }
        if (!aws.a(this.b, apyVar.b) || !aws.a(this.c, apyVar.c)) {
            return false;
        }
        Boolean bool = this.e;
        if (bool == null) {
            if (apyVar.e != null) {
                return false;
            }
        } else if (!bool.equals(apyVar.e)) {
            return false;
        }
        Boolean bool2 = this.f;
        if (bool2 == null) {
            if (apyVar.f != null) {
                return false;
            }
        } else if (!bool2.equals(apyVar.f)) {
            return false;
        }
        if (this.g != null && !this.g.a()) {
            return this.g.equals(apyVar.g);
        }
        return apyVar.g == null || apyVar.g.a();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + aws.a(this.b)) * 31) + aws.a(this.c)) * 31;
        Boolean bool = this.e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        if (this.g != null && !this.g.a()) {
            i = this.g.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // defpackage.awp, defpackage.awu
    public final void a(awn awnVar) throws IOException {
        Integer num = this.a;
        if (num != null) {
            awnVar.a(1, num.intValue());
        }
        apn.d[] dVarArr = this.b;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                apn.d[] dVarArr2 = this.b;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                apn.d dVar = dVarArr2[i2];
                if (dVar != null) {
                    awnVar.a(2, dVar);
                }
                i2++;
            }
        }
        apn.a[] aVarArr = this.c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                apn.a[] aVarArr2 = this.c;
                if (i >= aVarArr2.length) {
                    break;
                }
                apn.a aVar = aVarArr2[i];
                if (aVar != null) {
                    awnVar.a(3, aVar);
                }
                i++;
            }
        }
        Boolean bool = this.e;
        if (bool != null) {
            awnVar.a(4, bool.booleanValue());
        }
        Boolean bool2 = this.f;
        if (bool2 != null) {
            awnVar.a(5, bool2.booleanValue());
        }
        super.a(awnVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awp, defpackage.awu
    public final int b() {
        int b = super.b();
        Integer num = this.a;
        if (num != null) {
            b += awn.b(1, num.intValue());
        }
        apn.d[] dVarArr = this.b;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                apn.d[] dVarArr2 = this.b;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                apn.d dVar = dVarArr2[i2];
                if (dVar != null) {
                    b += zzee.c(2, dVar);
                }
                i2++;
            }
        }
        apn.a[] aVarArr = this.c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                apn.a[] aVarArr2 = this.c;
                if (i >= aVarArr2.length) {
                    break;
                }
                apn.a aVar = aVarArr2[i];
                if (aVar != null) {
                    b += zzee.c(3, aVar);
                }
                i++;
            }
        }
        Boolean bool = this.e;
        if (bool != null) {
            bool.booleanValue();
            b += awn.c(32) + 1;
        }
        Boolean bool2 = this.f;
        if (bool2 != null) {
            bool2.booleanValue();
            return b + awn.c(40) + 1;
        }
        return b;
    }

    @Override // defpackage.awu
    public final /* synthetic */ awu a(awl awlVar) throws IOException {
        while (true) {
            int a = awlVar.a();
            if (a != 0) {
                if (a == 8) {
                    this.a = Integer.valueOf(awlVar.d());
                } else if (a == 18) {
                    int a2 = awv.a(awlVar, 18);
                    apn.d[] dVarArr = this.b;
                    int length = dVarArr == null ? 0 : dVarArr.length;
                    int i = a2 + length;
                    apn.d[] dVarArr2 = new apn.d[i];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, dVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        dVarArr2[length] = (apn.d) awlVar.a(apn.d.c());
                        awlVar.a();
                        length++;
                    }
                    dVarArr2[length] = (apn.d) awlVar.a(apn.d.c());
                    this.b = dVarArr2;
                } else if (a == 26) {
                    int a3 = awv.a(awlVar, 26);
                    apn.a[] aVarArr = this.c;
                    int length2 = aVarArr == null ? 0 : aVarArr.length;
                    int i2 = a3 + length2;
                    apn.a[] aVarArr2 = new apn.a[i2];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, aVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        aVarArr2[length2] = (apn.a) awlVar.a(apn.a.c());
                        awlVar.a();
                        length2++;
                    }
                    aVarArr2[length2] = (apn.a) awlVar.a(apn.a.c());
                    this.c = aVarArr2;
                } else if (a == 32) {
                    this.e = Boolean.valueOf(awlVar.b());
                } else if (a != 40) {
                    if (!super.a(awlVar, a)) {
                        return this;
                    }
                } else {
                    this.f = Boolean.valueOf(awlVar.b());
                }
            } else {
                return this;
            }
        }
    }
}
