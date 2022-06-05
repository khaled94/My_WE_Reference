package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: ean  reason: default package */
/* loaded from: classes2.dex */
public interface ean {
    public static final ean a = $$Lambda$ean$LM8s3CaQmPMUesLesmmMioLDeZ8.INSTANCE;

    List<InetAddress> lookup(String str) throws UnknownHostException;

    /* renamed from: ean$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ List a(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(String.valueOf(str)));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }
}
