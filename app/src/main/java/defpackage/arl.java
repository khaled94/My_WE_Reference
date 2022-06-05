package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import defpackage.arj;
import defpackage.arl;
import java.io.IOException;

/* renamed from: arl  reason: default package */
/* loaded from: classes.dex */
public abstract class arl<MessageType extends arj<MessageType, BuilderType>, BuilderType extends arl<MessageType, BuilderType>> implements auh {
    protected abstract BuilderType a(MessageType messagetype);

    public abstract BuilderType a(asf asfVar, asn asnVar) throws IOException;

    /* renamed from: r */
    public abstract BuilderType clone();

    public final BuilderType a(byte[] bArr, asn asnVar) throws zzfi {
        return a(bArr, bArr.length, asnVar);
    }

    public BuilderType a(byte[] bArr, int i, asn asnVar) throws zzfi {
        try {
            asf a = asf.a(bArr, 0, i);
            a(a, asnVar);
            a.a(0);
            return this;
        } catch (zzfi e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.auh
    public final /* synthetic */ auh a(aui auiVar) {
        if (!g_().getClass().isInstance(auiVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return a((arl<MessageType, BuilderType>) ((arj) auiVar));
    }
}
