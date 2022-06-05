package defpackage;

/* renamed from: cuw  reason: default package */
/* loaded from: classes2.dex */
public final class cuw {
    public cva a;
    public cuy b;
    public cux c;
    private cuz d = new cuz();

    public cuw() {
        cva cvaVar = new cva();
        this.a = cvaVar;
        this.b = new cuy(cvaVar);
        this.c = new cux(this.a);
    }

    public final cva a() {
        if (this.a == null) {
            this.a = new cva();
        }
        return this.a;
    }
}
