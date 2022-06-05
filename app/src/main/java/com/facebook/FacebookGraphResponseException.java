package com.facebook;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0005H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "graphResponse", "Lcom/facebook/GraphResponse;", "errorMessage", "", "(Lcom/facebook/GraphResponse;Ljava/lang/String;)V", "getGraphResponse", "()Lcom/facebook/GraphResponse;", "toString", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookGraphResponseException extends FacebookException {
    private final mc a;

    public FacebookGraphResponseException(mc mcVar, String str) {
        super(str);
        this.a = mcVar;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        mc mcVar = this.a;
        lx lxVar = mcVar != null ? mcVar.c : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        dqc.b(sb, "StringBuilder().append(\"…raphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (lxVar != null) {
            sb.append("httpResponseCode: ");
            sb.append(lxVar.b);
            sb.append(", facebookErrorCode: ");
            sb.append(lxVar.c);
            sb.append(", facebookErrorType: ");
            sb.append(lxVar.e);
            sb.append(", message: ");
            sb.append(lxVar.a());
            sb.append("}");
        }
        String sb2 = sb.toString();
        dqc.b(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
