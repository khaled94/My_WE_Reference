package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ucare/mywe/domain/entities/remote/baseresponse/BaseResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "body", "baseResponseHeader", "Lcom/ucare/mywe/domain/entities/remote/baseresponse/BaseResponseHeader;", "(Ljava/lang/Object;Lcom/ucare/mywe/domain/entities/remote/baseresponse/BaseResponseHeader;)V", "getBaseResponseHeader", "()Lcom/ucare/mywe/domain/entities/remote/baseresponse/BaseResponseHeader;", "setBaseResponseHeader", "(Lcom/ucare/mywe/domain/entities/remote/baseresponse/BaseResponseHeader;)V", "getBody", "()Ljava/lang/Object;", "setBody", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/ucare/mywe/domain/entities/remote/baseresponse/BaseResponseHeader;)Lcom/ucare/mywe/domain/entities/remote/baseresponse/BaseResponse;", "equals", "", "other", "hashCode", "", "toString", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: cvx  reason: default package */
/* loaded from: classes2.dex */
public final class cvx<T> {
    @cqh(a = "body")
    private T a;
    @cqh(a = "header")
    private cvy b;

    public cvx() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvx)) {
            return false;
        }
        cvx cvxVar = (cvx) obj;
        return dqc.a(this.a, cvxVar.a) && dqc.a(this.b, cvxVar.b);
    }

    public final int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        cvy cvyVar = this.b;
        if (cvyVar != null) {
            i = cvyVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BaseResponse(body=" + this.a + ", baseResponseHeader=" + this.b + ')';
    }

    private /* synthetic */ cvx(byte b) {
        this((char) 0);
    }

    private cvx(char c) {
        this.a = null;
        this.b = null;
    }
}
