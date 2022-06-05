package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.bxs;
import defpackage.cec;
import java.security.GeneralSecurityException;

/* renamed from: bxq  reason: default package */
/* loaded from: classes2.dex */
public final class bxq<PrimitiveT, KeyProtoT extends cec> implements bxp<PrimitiveT> {
    private final bxs<KeyProtoT> a;
    private final Class<PrimitiveT> b;

    public bxq(bxs<KeyProtoT> bxsVar, Class<PrimitiveT> cls) {
        if (!bxsVar.c().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", bxsVar.toString(), cls.getName()));
        }
        this.a = bxsVar;
        this.b = cls;
    }

    @Override // defpackage.bxp
    public final PrimitiveT a(ccu ccuVar) throws GeneralSecurityException {
        try {
            KeyProtoT a2 = this.a.a(ccuVar);
            if (Void.class.equals(this.b)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.a.a((bxs<KeyProtoT>) a2);
            return (PrimitiveT) this.a.a(a2, (Class<PrimitiveT>) this.b);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.a.getName(), e);
        }
    }

    @Override // defpackage.bxp
    public final cec b(ccu ccuVar) throws GeneralSecurityException {
        try {
            return a().a(ccuVar);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.d().a.getName(), e);
        }
    }

    @Override // defpackage.bxp
    public final cbm c(ccu ccuVar) throws GeneralSecurityException {
        try {
            return cbm.a().a(this.a.a()).a(a().a(ccuVar).f()).a(this.a.b()).g();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bxq$a */
    /* loaded from: classes2.dex */
    public static class a<KeyFormatProtoT extends cec, KeyProtoT extends cec> {
        final bxs.a<KeyFormatProtoT, KeyProtoT> a;

        a(bxs.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.a = aVar;
        }

        private KeyProtoT a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException {
            this.a.a((bxs.a<KeyFormatProtoT, KeyProtoT>) keyformatprotot);
            return this.a.b(keyformatprotot);
        }

        final KeyProtoT a(ccu ccuVar) throws GeneralSecurityException, InvalidProtocolBufferException {
            return a((a<KeyFormatProtoT, KeyProtoT>) this.a.a(ccuVar));
        }
    }

    private a<?, KeyProtoT> a() {
        return new a<>(this.a.d());
    }
}
