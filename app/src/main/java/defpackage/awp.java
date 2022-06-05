package defpackage;

import defpackage.awp;
import java.io.IOException;

/* renamed from: awp  reason: default package */
/* loaded from: classes.dex */
public abstract class awp<M extends awp<M>> extends awu {
    protected awr g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awu
    public int b() {
        if (this.g != null) {
            int i = 0;
            for (int i2 = 0; i2 < this.g.d; i2++) {
                i += this.g.c[i2].a();
            }
            return i;
        }
        return 0;
    }

    @Override // defpackage.awu
    public void a(awn awnVar) throws IOException {
        if (this.g == null) {
            return;
        }
        for (int i = 0; i < this.g.d; i++) {
            this.g.c[i].a(awnVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.awl r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awp.a(awl, int):boolean");
    }

    @Override // defpackage.awu
    public final /* synthetic */ awu c() throws CloneNotSupportedException {
        return (awp) clone();
    }

    @Override // defpackage.awu
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        awp awpVar = (awp) super.clone();
        aws.a(this, awpVar);
        return awpVar;
    }
}
