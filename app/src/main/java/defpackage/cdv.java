package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import defpackage.cff;
import java.io.IOException;

/* renamed from: cdv  reason: default package */
/* loaded from: classes2.dex */
public final class cdv<K, V> {
    final a<K, V> a;

    /* renamed from: cdv$a */
    /* loaded from: classes2.dex */
    static class a<K, V> {
        public final cff.a a;
        public final K b;
        public final cff.a c;
        public final V d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void a(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v) throws IOException {
        cdg.a(codedOutputStream, aVar.a, 1, k);
        cdg.a(codedOutputStream, aVar.c, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return cdg.a(aVar.a, 1, k) + cdg.a(aVar.c, 2, v);
    }
}
