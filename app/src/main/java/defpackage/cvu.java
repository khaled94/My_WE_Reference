package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u0010\u0010\t\u001a\u0004\u0018\u00018\u0000HÂ\u0003¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ucare/mywe/domain/entities/local/baserequest/BaseRequest;", ExifInterface.GPS_DIRECTION_TRUE, "", "header", "Lcom/ucare/mywe/domain/entities/local/baserequest/BaseRequestHeader;", "body", "(Lcom/ucare/mywe/domain/entities/local/baserequest/BaseRequestHeader;Ljava/lang/Object;)V", "Ljava/lang/Object;", "component1", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/ucare/mywe/domain/entities/local/baserequest/BaseRequestHeader;Ljava/lang/Object;)Lcom/ucare/mywe/domain/entities/local/baserequest/BaseRequest;", "equals", "", "other", "hashCode", "", "toString", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: cvu  reason: default package */
/* loaded from: classes2.dex */
public final class cvu<T> {
    @cqh(a = "header")
    private cvv a;
    @cqh(a = "body")
    private final T b;

    public cvu() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvu)) {
            return false;
        }
        cvu cvuVar = (cvu) obj;
        return dqc.a(this.a, cvuVar.a) && dqc.a(this.b, cvuVar.b);
    }

    public final int hashCode() {
        cvv cvvVar = this.a;
        int i = 0;
        int hashCode = (cvvVar == null ? 0 : cvvVar.hashCode()) * 31;
        T t = this.b;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BaseRequest(header=" + this.a + ", body=" + this.b + ')';
    }

    private /* synthetic */ cvu(byte b) {
        this(null, null);
    }

    public cvu(cvv cvvVar, T t) {
        this.a = cvvVar;
        this.b = t;
    }
}
