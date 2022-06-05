package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aqu  reason: default package */
/* loaded from: classes.dex */
public final class aqu extends aqp<Double> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aqu(aqw aqwVar, String str, Double d) {
        super(aqwVar, str, d, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}
