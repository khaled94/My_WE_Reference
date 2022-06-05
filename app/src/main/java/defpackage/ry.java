package defpackage;

import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/facebook/login/LoginResult;", "", "accessToken", "Lcom/facebook/AccessToken;", "authenticationToken", "Lcom/facebook/AuthenticationToken;", "recentlyGrantedPermissions", "", "", "recentlyDeniedPermissions", "(Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/util/Set;Ljava/util/Set;)V", "getAccessToken", "()Lcom/facebook/AccessToken;", "getAuthenticationToken", "()Lcom/facebook/AuthenticationToken;", "getRecentlyDeniedPermissions", "()Ljava/util/Set;", "getRecentlyGrantedPermissions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ry  reason: default package */
/* loaded from: classes2.dex */
public final class ry {
    public final lk a;
    final Set<String> b;
    private final lq c;
    private final Set<String> d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ry)) {
                return false;
            }
            ry ryVar = (ry) obj;
            return dqc.a(this.a, ryVar.a) && dqc.a(this.c, ryVar.c) && dqc.a(this.b, ryVar.b) && dqc.a(this.d, ryVar.d);
        }
        return true;
    }

    public final int hashCode() {
        lk lkVar = this.a;
        int i = 0;
        int hashCode = (lkVar != null ? lkVar.hashCode() : 0) * 31;
        lq lqVar = this.c;
        int hashCode2 = (hashCode + (lqVar != null ? lqVar.hashCode() : 0)) * 31;
        Set<String> set = this.b;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.d;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.a + ", authenticationToken=" + this.c + ", recentlyGrantedPermissions=" + this.b + ", recentlyDeniedPermissions=" + this.d + ")";
    }

    public ry(lk lkVar, lq lqVar, Set<String> set, Set<String> set2) {
        dqc.d(lkVar, "accessToken");
        dqc.d(set, "recentlyGrantedPermissions");
        dqc.d(set2, "recentlyDeniedPermissions");
        this.a = lkVar;
        this.c = lqVar;
        this.b = set;
        this.d = set2;
    }
}
