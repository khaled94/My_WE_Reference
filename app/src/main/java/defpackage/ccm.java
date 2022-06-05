package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import defpackage.ccm;
import defpackage.ccm.a;
import defpackage.ccu;
import defpackage.cec;
import java.io.IOException;

/* renamed from: ccm  reason: default package */
/* loaded from: classes2.dex */
public abstract class ccm<MessageType extends ccm<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements cec {
    protected int memoizedHashCode = 0;

    @Override // defpackage.cec
    public final ccu f() {
        try {
            ccu.f d = ccu.d(o());
            a(d.a);
            return d.a();
        } catch (IOException e) {
            throw new RuntimeException(a("ByteString"), e);
        }
    }

    @Override // defpackage.cec
    public final byte[] g() {
        try {
            byte[] bArr = new byte[o()];
            CodedOutputStream a2 = CodedOutputStream.a(bArr);
            a(a2);
            a2.i();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    void b(int i) {
        throw new UnsupportedOperationException();
    }

    public final int a(cet cetVar) {
        int h = h();
        if (h == -1) {
            int b = cetVar.b(this);
            b(b);
            return b;
        }
        return h;
    }

    private String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: ccm$a */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends ccm<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements cec.a {
        protected abstract BuilderType a(MessageType messagetype);

        /* renamed from: c */
        public abstract BuilderType clone();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.cec.a
        public final /* synthetic */ cec.a a(cec cecVar) {
            if (!s().getClass().isInstance(cecVar)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return a((a<MessageType, BuilderType>) ((ccm) cecVar));
        }
    }
}
