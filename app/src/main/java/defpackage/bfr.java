package defpackage;

import defpackage.bfr;
import defpackage.bft;
import java.io.IOException;

/* renamed from: bfr  reason: default package */
/* loaded from: classes2.dex */
public abstract class bfr<MessageType extends bfr<MessageType, BuilderType>, BuilderType extends bft<MessageType, BuilderType>> implements bdh {
    private static boolean zzdu = false;
    protected int zzdt = 0;

    @Override // defpackage.bdh
    public final bgb i() {
        try {
            bbg d = bgb.d(d());
            a(d.a);
            return d.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    public void b(int i) {
        throw new UnsupportedOperationException();
    }
}
