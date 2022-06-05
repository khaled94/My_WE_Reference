package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aqr  reason: default package */
/* loaded from: classes.dex */
public final class aqr extends aqp<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aqr(aqw aqwVar, String str, Boolean bool) {
        super(aqwVar, str, bool, (byte) 0);
    }

    @Override // defpackage.aqp
    final /* synthetic */ Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (aqc.b.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (aqc.c.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}
