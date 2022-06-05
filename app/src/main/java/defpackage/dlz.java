package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", "", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: dlz  reason: default package */
/* loaded from: classes2.dex */
public final class dlz extends Error {
    public dlz() {
        this((byte) 0);
    }

    private /* synthetic */ dlz(byte b) {
        this("An operation is not implemented.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlz(String str) {
        super(str);
        dqc.d(str, "message");
    }
}
