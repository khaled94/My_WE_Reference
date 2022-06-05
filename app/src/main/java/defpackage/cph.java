package defpackage;

/* renamed from: cph  reason: default package */
/* loaded from: classes2.dex */
final class cph extends cpl {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cph(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // defpackage.cpl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cpl
    public final String b() {
        return this.b;
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpl) {
            cpl cplVar = (cpl) obj;
            if (this.a.equals(cplVar.a()) && this.b.equals(cplVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
