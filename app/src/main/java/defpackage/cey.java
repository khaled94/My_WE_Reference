package defpackage;

/* renamed from: cey  reason: default package */
/* loaded from: classes2.dex */
final class cey {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cey$a */
    /* loaded from: classes2.dex */
    public interface a {
        byte a(int i);

        int a();
    }

    private cey() {
    }

    private static String a(a aVar) {
        StringBuilder sb = new StringBuilder(aVar.a());
        for (int i = 0; i < aVar.a(); i++) {
            byte a2 = aVar.a(i);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(final ccu ccuVar) {
        return a(new a() { // from class: cey.1
            @Override // defpackage.cey.a
            public final int a() {
                return ccu.this.b();
            }

            @Override // defpackage.cey.a
            public final byte a(int i) {
                return ccu.this.a(i);
            }
        });
    }
}
