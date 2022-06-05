package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jr  reason: default package */
/* loaded from: classes2.dex */
public final class jr {
    private final List<ImageHeaderParser> a = new ArrayList();

    public final synchronized List<ImageHeaderParser> a() {
        return this.a;
    }

    public final synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }
}
