package defpackage;

import java.io.IOException;
import okhttp3.internal.http.UnrepeatableRequestBody;

/* renamed from: edd  reason: default package */
/* loaded from: classes2.dex */
final class edd extends edc implements UnrepeatableRequestBody {
    private final eef a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public edd(long j) {
        eef eefVar = new eef();
        this.a = eefVar;
        a(eed.a(eefVar.e), j);
    }

    @Override // defpackage.ebb
    public final void a(edv edvVar) throws IOException {
        edu eduVar = new edu();
        while (this.a.f.a(eduVar, 8192L) != -1) {
            edvVar.a_(eduVar, eduVar.b);
        }
    }
}
