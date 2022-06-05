package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aqs  reason: default package */
/* loaded from: classes.dex */
public final class aqs extends aqp<Long> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aqs(aqw aqwVar, String str, Long l) {
        super(aqwVar, str, l, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final Long a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}
