package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import defpackage.cec;

/* renamed from: ccn  reason: default package */
/* loaded from: classes2.dex */
public abstract class ccn<MessageType extends cec> implements cel<MessageType> {
    private static final cdb a = cdb.a();

    private MessageType b(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        try {
            ccv f = ccuVar.f();
            MessageType messagetype = (MessageType) a(f, cdbVar);
            try {
                f.a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e) {
                e.a = messagetype;
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // defpackage.cel
    public final /* synthetic */ Object a(ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        MessageType b = b(ccuVar, cdbVar);
        if (b == null || b.m()) {
            return b;
        }
        if (!(b instanceof ccm)) {
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException a2 = uninitializedMessageException.a();
        a2.a = b;
        throw a2;
    }
}
