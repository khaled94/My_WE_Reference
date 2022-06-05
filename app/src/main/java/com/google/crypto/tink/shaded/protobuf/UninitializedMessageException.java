package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {
    private final List<String> a = null;

    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
