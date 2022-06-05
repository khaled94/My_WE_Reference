package com.ucare.we.model;

/* loaded from: classes2.dex */
public class ServerRequest<T> {
    @cqh(a = "header")
    private RequestHeader header = null;
    @cqh(a = "body")
    private T body = null;

    private ServerRequest() {
    }

    public static <T> ServerRequest<T> createServerRequest(String str, String str2, T t) {
        ServerRequest<T> serverRequest = new ServerRequest<>();
        RequestHeader requestHeader = new RequestHeader();
        ((ServerRequest) serverRequest).header = requestHeader;
        requestHeader.setMsisdn(str);
        ((ServerRequest) serverRequest).header.getMsisdn();
        ((ServerRequest) serverRequest).header.setLocale(str2);
        ((ServerRequest) serverRequest).header.getLocale();
        ((ServerRequest) serverRequest).body = t;
        return serverRequest;
    }

    public static <T> ServerRequest<T> createServerRequest(String str, String str2, Long l, T t) {
        ServerRequest<T> serverRequest = new ServerRequest<>();
        RequestHeader requestHeader = new RequestHeader();
        ((ServerRequest) serverRequest).header = requestHeader;
        requestHeader.setMsisdn(str);
        ((ServerRequest) serverRequest).header.getMsisdn();
        ((ServerRequest) serverRequest).header.setLocale(str2);
        ((ServerRequest) serverRequest).header.getLocale();
        ((ServerRequest) serverRequest).header.setTimestamp(l);
        ((ServerRequest) serverRequest).header.getTimestamp();
        ((ServerRequest) serverRequest).body = t;
        return serverRequest;
    }
}
