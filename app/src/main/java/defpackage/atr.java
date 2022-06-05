package defpackage;

import java.util.List;

/* renamed from: atr  reason: default package */
/* loaded from: classes.dex */
abstract class atr {
    private static final atr a = new att((byte) 0);
    private static final atr b = new ats((byte) 0);

    private atr() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> a(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void a(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static atr a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static atr b() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ atr(byte b2) {
        this();
    }
}
