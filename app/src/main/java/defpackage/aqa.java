package defpackage;

import java.io.IOException;

/* renamed from: aqa  reason: default package */
/* loaded from: classes.dex */
public final class aqa extends awp<aqa> {
    private static volatile aqa[] e;
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    public Integer d = null;

    public static aqa[] a() {
        if (e == null) {
            synchronized (aws.b) {
                if (e == null) {
                    e = new aqa[0];
                }
            }
        }
        return e;
    }

    public aqa() {
        this.g = null;
        this.h = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aqa)) {
            return false;
        }
        aqa aqaVar = (aqa) obj;
        String str = this.a;
        if (str == null) {
            if (aqaVar.a != null) {
                return false;
            }
        } else if (!str.equals(aqaVar.a)) {
            return false;
        }
        Boolean bool = this.b;
        if (bool == null) {
            if (aqaVar.b != null) {
                return false;
            }
        } else if (!bool.equals(aqaVar.b)) {
            return false;
        }
        Boolean bool2 = this.c;
        if (bool2 == null) {
            if (aqaVar.c != null) {
                return false;
            }
        } else if (!bool2.equals(aqaVar.c)) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (aqaVar.d != null) {
                return false;
            }
        } else if (!num.equals(aqaVar.d)) {
            return false;
        }
        if (this.g != null && !this.g.a()) {
            return this.g.equals(aqaVar.g);
        }
        return aqaVar.g == null || aqaVar.g.a();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.b;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        if (this.g != null && !this.g.a()) {
            i = this.g.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // defpackage.awp, defpackage.awu
    public final void a(awn awnVar) throws IOException {
        String str = this.a;
        if (str != null) {
            awnVar.a(1, str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            awnVar.a(2, bool.booleanValue());
        }
        Boolean bool2 = this.c;
        if (bool2 != null) {
            awnVar.a(3, bool2.booleanValue());
        }
        Integer num = this.d;
        if (num != null) {
            awnVar.a(4, num.intValue());
        }
        super.a(awnVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awp, defpackage.awu
    public final int b() {
        int b = super.b();
        String str = this.a;
        if (str != null) {
            b += awn.b(1, str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            bool.booleanValue();
            b += awn.c(16) + 1;
        }
        Boolean bool2 = this.c;
        if (bool2 != null) {
            bool2.booleanValue();
            b += awn.c(24) + 1;
        }
        Integer num = this.d;
        return num != null ? b + awn.b(4, num.intValue()) : b;
    }

    @Override // defpackage.awu
    public final /* synthetic */ awu a(awl awlVar) throws IOException {
        while (true) {
            int a = awlVar.a();
            if (a != 0) {
                if (a == 10) {
                    this.a = awlVar.c();
                } else if (a == 16) {
                    this.b = Boolean.valueOf(awlVar.b());
                } else if (a == 24) {
                    this.c = Boolean.valueOf(awlVar.b());
                } else if (a != 32) {
                    if (!super.a(awlVar, a)) {
                        return this;
                    }
                } else {
                    this.d = Integer.valueOf(awlVar.d());
                }
            } else {
                return this;
            }
        }
    }
}
