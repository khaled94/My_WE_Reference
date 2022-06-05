package defpackage;

import java.math.BigInteger;

/* renamed from: cpy  reason: default package */
/* loaded from: classes2.dex */
public final class cpy extends cpv {
    public final Object a;

    public cpy(Boolean bool) {
        this.a = cqk.a(bool);
    }

    public cpy(Number number) {
        this.a = cqk.a(number);
    }

    public cpy(String str) {
        this.a = cqk.a(str);
    }

    @Override // defpackage.cpv
    public final Number a() {
        Object obj = this.a;
        return obj instanceof String ? new cqp((String) this.a) : (Number) obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = a().longValue();
        } else {
            Object obj = this.a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cpy cpyVar = (cpy) obj;
        if (this.a == null) {
            return cpyVar.a == null;
        } else if (a(this) && a(cpyVar)) {
            return a().longValue() == cpyVar.a().longValue();
        } else if ((this.a instanceof Number) && (cpyVar.a instanceof Number)) {
            double doubleValue = a().doubleValue();
            double doubleValue2 = cpyVar.a().doubleValue();
            return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
        } else {
            return this.a.equals(cpyVar.a);
        }
    }

    private static boolean a(cpy cpyVar) {
        Object obj = cpyVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    @Override // defpackage.cpv
    public final boolean f() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(b());
    }

    @Override // defpackage.cpv
    public final String b() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return a().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    @Override // defpackage.cpv
    public final double c() {
        return this.a instanceof Number ? a().doubleValue() : Double.parseDouble(b());
    }

    @Override // defpackage.cpv
    public final long d() {
        return this.a instanceof Number ? a().longValue() : Long.parseLong(b());
    }

    @Override // defpackage.cpv
    public final int e() {
        return this.a instanceof Number ? a().intValue() : Integer.parseInt(b());
    }
}
