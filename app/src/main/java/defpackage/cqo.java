package defpackage;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* renamed from: cqo  reason: default package */
/* loaded from: classes2.dex */
public abstract class cqo {
    public static cqo INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
