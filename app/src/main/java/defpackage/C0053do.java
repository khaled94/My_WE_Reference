package defpackage;

import defpackage.ex;
import java.io.File;

/* renamed from: do  reason: invalid class name and default package and case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0053do<DataType> implements ex.b {
    private final ci<DataType> a;
    private final DataType b;
    private final cm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0053do(ci<DataType> ciVar, DataType datatype, cm cmVar) {
        this.a = ciVar;
        this.b = datatype;
        this.c = cmVar;
    }

    @Override // defpackage.ex.b
    public final boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}
