package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÂ\u0003J\t\u0010\f\u001a\u00020\u0005HÂ\u0003J\t\u0010\r\u001a\u00020\bHÂ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0010\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ucare/mywe/domain/entities/local/baserequest/BaseRequestHeader;", "", "timestamp", "", "msisdn", "", "locale", "messageCode", "", "(JLjava/lang/String;Ljava/lang/String;I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: cvv  reason: default package */
/* loaded from: classes2.dex */
public final class cvv {
    @cqh(a = "timestamp")
    private long a;
    @cqh(a = "msisdn")
    private final String b;
    @cqh(a = "locale")
    private final String c;
    @cqh(a = "messageCode")
    private final int d;

    public cvv() {
        this(null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvv)) {
            return false;
        }
        cvv cvvVar = (cvv) obj;
        return this.a == cvvVar.a && dqc.a((Object) this.b, (Object) cvvVar.b) && dqc.a((Object) this.c, (Object) cvvVar.c) && this.d == cvvVar.d;
    }

    public final int hashCode() {
        return (((((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "BaseRequestHeader(timestamp=" + this.a + ", msisdn=" + this.b + ", locale=" + this.c + ", messageCode=" + this.d + ')';
    }

    private cvv(String str, String str2) {
        dqc.d(str, "msisdn");
        dqc.d(str2, "locale");
        this.a = 0L;
        this.b = str;
        this.c = str2;
        this.d = 0;
    }

    public /* synthetic */ cvv(String str, String str2, int i) {
        this((i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
