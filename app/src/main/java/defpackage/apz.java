package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.internal.measurement.zzit;
import defpackage.apt;
import java.io.IOException;

/* renamed from: apz  reason: default package */
/* loaded from: classes.dex */
public final class apz extends awp<apz> {
    public Long a = null;
    public String b = null;
    private Integer i = null;
    public apt.a[] c = new apt.a[0];
    public aqa[] d = aqa.a();
    public apy[] e = apy.a();
    private String j = null;
    public Boolean f = null;

    public apz() {
        this.g = null;
        this.h = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof apz)) {
            return false;
        }
        apz apzVar = (apz) obj;
        Long l = this.a;
        if (l == null) {
            if (apzVar.a != null) {
                return false;
            }
        } else if (!l.equals(apzVar.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (apzVar.b != null) {
                return false;
            }
        } else if (!str.equals(apzVar.b)) {
            return false;
        }
        Integer num = this.i;
        if (num == null) {
            if (apzVar.i != null) {
                return false;
            }
        } else if (!num.equals(apzVar.i)) {
            return false;
        }
        if (!aws.a(this.c, apzVar.c) || !aws.a(this.d, apzVar.d) || !aws.a(this.e, apzVar.e)) {
            return false;
        }
        String str2 = this.j;
        if (str2 == null) {
            if (apzVar.j != null) {
                return false;
            }
        } else if (!str2.equals(apzVar.j)) {
            return false;
        }
        Boolean bool = this.f;
        if (bool == null) {
            if (apzVar.f != null) {
                return false;
            }
        } else if (!bool.equals(apzVar.f)) {
            return false;
        }
        if (this.g != null && !this.g.a()) {
            return this.g.equals(apzVar.g);
        }
        return apzVar.g == null || apzVar.g.a();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Long l = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.b;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.i;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + aws.a(this.c)) * 31) + aws.a(this.d)) * 31) + aws.a(this.e)) * 31;
        String str2 = this.j;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        if (this.g != null && !this.g.a()) {
            i = this.g.hashCode();
        }
        return hashCode6 + i;
    }

    @Override // defpackage.awp, defpackage.awu
    public final void a(awn awnVar) throws IOException {
        Long l = this.a;
        int i = 0;
        if (l != null) {
            long longValue = l.longValue();
            awnVar.c(1, 0);
            awnVar.a(longValue);
        }
        String str = this.b;
        if (str != null) {
            awnVar.a(2, str);
        }
        Integer num = this.i;
        if (num != null) {
            awnVar.a(3, num.intValue());
        }
        apt.a[] aVarArr = this.c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                apt.a[] aVarArr2 = this.c;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                apt.a aVar = aVarArr2[i2];
                if (aVar != null) {
                    awnVar.a(4, aVar);
                }
                i2++;
            }
        }
        aqa[] aqaVarArr = this.d;
        if (aqaVarArr != null && aqaVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                aqa[] aqaVarArr2 = this.d;
                if (i3 >= aqaVarArr2.length) {
                    break;
                }
                aqa aqaVar = aqaVarArr2[i3];
                if (aqaVar != null) {
                    awnVar.a(5, aqaVar);
                }
                i3++;
            }
        }
        apy[] apyVarArr = this.e;
        if (apyVarArr != null && apyVarArr.length > 0) {
            while (true) {
                apy[] apyVarArr2 = this.e;
                if (i >= apyVarArr2.length) {
                    break;
                }
                apy apyVar = apyVarArr2[i];
                if (apyVar != null) {
                    awnVar.a(6, apyVar);
                }
                i++;
            }
        }
        String str2 = this.j;
        if (str2 != null) {
            awnVar.a(7, str2);
        }
        Boolean bool = this.f;
        if (bool != null) {
            awnVar.a(8, bool.booleanValue());
        }
        super.a(awnVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awp, defpackage.awu
    public final int b() {
        int b = super.b();
        Long l = this.a;
        if (l != null) {
            long longValue = l.longValue();
            int i = 8;
            int c = awn.c(8);
            if (((-128) & longValue) == 0) {
                i = 1;
            } else if (((-16384) & longValue) == 0) {
                i = 2;
            } else if (((-2097152) & longValue) == 0) {
                i = 3;
            } else if (((-268435456) & longValue) == 0) {
                i = 4;
            } else if (((-34359738368L) & longValue) == 0) {
                i = 5;
            } else if (((-4398046511104L) & longValue) == 0) {
                i = 6;
            } else if (((-562949953421312L) & longValue) == 0) {
                i = 7;
            } else if (((-72057594037927936L) & longValue) != 0) {
                i = (longValue & Long.MIN_VALUE) == 0 ? 9 : 10;
            }
            b += c + i;
        }
        String str = this.b;
        if (str != null) {
            b += awn.b(2, str);
        }
        Integer num = this.i;
        if (num != null) {
            b += awn.b(3, num.intValue());
        }
        apt.a[] aVarArr = this.c;
        int i2 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                apt.a[] aVarArr2 = this.c;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                apt.a aVar = aVarArr2[i3];
                if (aVar != null) {
                    b += zzee.c(4, aVar);
                }
                i3++;
            }
        }
        aqa[] aqaVarArr = this.d;
        if (aqaVarArr != null && aqaVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                aqa[] aqaVarArr2 = this.d;
                if (i4 >= aqaVarArr2.length) {
                    break;
                }
                aqa aqaVar = aqaVarArr2[i4];
                if (aqaVar != null) {
                    b += awn.b(5, aqaVar);
                }
                i4++;
            }
        }
        apy[] apyVarArr = this.e;
        if (apyVarArr != null && apyVarArr.length > 0) {
            while (true) {
                apy[] apyVarArr2 = this.e;
                if (i2 >= apyVarArr2.length) {
                    break;
                }
                apy apyVar = apyVarArr2[i2];
                if (apyVar != null) {
                    b += awn.b(6, apyVar);
                }
                i2++;
            }
        }
        String str2 = this.j;
        if (str2 != null) {
            b += awn.b(7, str2);
        }
        Boolean bool = this.f;
        if (bool != null) {
            bool.booleanValue();
            return b + awn.c(64) + 1;
        }
        return b;
    }

    @Override // defpackage.awu
    public final /* synthetic */ awu a(awl awlVar) throws IOException {
        while (true) {
            int a = awlVar.a();
            if (a != 0) {
                if (a == 8) {
                    long j = 0;
                    for (int i = 0; i < 64; i += 7) {
                        byte f = awlVar.f();
                        j |= (f & Byte.MAX_VALUE) << i;
                        if ((f & 128) == 0) {
                            this.a = Long.valueOf(j);
                        }
                    }
                    throw zzit.c();
                } else if (a == 18) {
                    this.b = awlVar.c();
                } else if (a == 24) {
                    this.i = Integer.valueOf(awlVar.d());
                } else if (a == 34) {
                    int a2 = awv.a(awlVar, 34);
                    apt.a[] aVarArr = this.c;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i2 = a2 + length;
                    apt.a[] aVarArr2 = new apt.a[i2];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, aVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        aVarArr2[length] = (apt.a) awlVar.a(apt.a.a());
                        awlVar.a();
                        length++;
                    }
                    aVarArr2[length] = (apt.a) awlVar.a(apt.a.a());
                    this.c = aVarArr2;
                } else if (a == 42) {
                    int a3 = awv.a(awlVar, 42);
                    aqa[] aqaVarArr = this.d;
                    int length2 = aqaVarArr == null ? 0 : aqaVarArr.length;
                    int i3 = a3 + length2;
                    aqa[] aqaVarArr2 = new aqa[i3];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, aqaVarArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        aqaVarArr2[length2] = new aqa();
                        awlVar.a(aqaVarArr2[length2]);
                        awlVar.a();
                        length2++;
                    }
                    aqaVarArr2[length2] = new aqa();
                    awlVar.a(aqaVarArr2[length2]);
                    this.d = aqaVarArr2;
                } else if (a == 50) {
                    int a4 = awv.a(awlVar, 50);
                    apy[] apyVarArr = this.e;
                    int length3 = apyVarArr == null ? 0 : apyVarArr.length;
                    int i4 = a4 + length3;
                    apy[] apyVarArr2 = new apy[i4];
                    if (length3 != 0) {
                        System.arraycopy(this.e, 0, apyVarArr2, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        apyVarArr2[length3] = new apy();
                        awlVar.a(apyVarArr2[length3]);
                        awlVar.a();
                        length3++;
                    }
                    apyVarArr2[length3] = new apy();
                    awlVar.a(apyVarArr2[length3]);
                    this.e = apyVarArr2;
                } else if (a == 58) {
                    this.j = awlVar.c();
                } else if (a != 64) {
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
