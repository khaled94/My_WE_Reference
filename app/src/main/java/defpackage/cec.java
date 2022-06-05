package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: cec  reason: default package */
/* loaded from: classes2.dex */
public interface cec extends ced {

    /* renamed from: cec$a */
    /* loaded from: classes2.dex */
    public interface a extends ced, Cloneable {
        a a(cec cecVar);

        cec f();

        cec g();
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    ccu f();

    byte[] g();

    cel<? extends cec> i();

    int o();

    a q();

    a r();
}
