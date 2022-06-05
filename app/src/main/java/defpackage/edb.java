package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: edb  reason: default package */
/* loaded from: classes2.dex */
public final class edb extends ecz {
    private final eda a;

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void addRequestProperty(String str, String str2) {
        super.addRequestProperty(str, str2);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void connect() throws IOException {
        super.connect();
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ void disconnect() {
        super.disconnect();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ boolean getAllowUserInteraction() {
        return super.getAllowUserInteraction();
    }

    @Override // defpackage.ecz, javax.net.ssl.HttpsURLConnection
    public final /* bridge */ /* synthetic */ String getCipherSuite() {
        return super.getCipherSuite();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ int getConnectTimeout() {
        return super.getConnectTimeout();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ Object getContent() throws IOException {
        return super.getContent();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ Object getContent(Class[] clsArr) throws IOException {
        return super.getContent(clsArr);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ String getContentEncoding() {
        return super.getContentEncoding();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ int getContentLength() {
        return super.getContentLength();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ long getContentLengthLong() {
        return super.getContentLengthLong();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ String getContentType() {
        return super.getContentType();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ long getDate() {
        return super.getDate();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ boolean getDefaultUseCaches() {
        return super.getDefaultUseCaches();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ boolean getDoInput() {
        return super.getDoInput();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ boolean getDoOutput() {
        return super.getDoOutput();
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ InputStream getErrorStream() {
        return super.getErrorStream();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ long getExpiration() {
        return super.getExpiration();
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection, java.net.URLConnection
    public final /* bridge */ /* synthetic */ String getHeaderField(int i) {
        return super.getHeaderField(i);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ String getHeaderField(String str) {
        return super.getHeaderField(str);
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection, java.net.URLConnection
    public final /* bridge */ /* synthetic */ long getHeaderFieldDate(String str, long j) {
        return super.getHeaderFieldDate(str, j);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ int getHeaderFieldInt(String str, int i) {
        return super.getHeaderFieldInt(str, i);
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection, java.net.URLConnection
    public final /* bridge */ /* synthetic */ String getHeaderFieldKey(int i) {
        return super.getHeaderFieldKey(i);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ long getHeaderFieldLong(String str, long j) {
        return super.getHeaderFieldLong(str, j);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ Map getHeaderFields() {
        return super.getHeaderFields();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ long getIfModifiedSince() {
        return super.getIfModifiedSince();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ InputStream getInputStream() throws IOException {
        return super.getInputStream();
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ boolean getInstanceFollowRedirects() {
        return super.getInstanceFollowRedirects();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ long getLastModified() {
        return super.getLastModified();
    }

    @Override // defpackage.ecz, javax.net.ssl.HttpsURLConnection
    public final /* bridge */ /* synthetic */ Certificate[] getLocalCertificates() {
        return super.getLocalCertificates();
    }

    @Override // defpackage.ecz, javax.net.ssl.HttpsURLConnection
    public final /* bridge */ /* synthetic */ Principal getLocalPrincipal() {
        return super.getLocalPrincipal();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ OutputStream getOutputStream() throws IOException {
        return super.getOutputStream();
    }

    @Override // defpackage.ecz, javax.net.ssl.HttpsURLConnection
    public final /* bridge */ /* synthetic */ Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return super.getPeerPrincipal();
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection, java.net.URLConnection
    public final /* bridge */ /* synthetic */ Permission getPermission() throws IOException {
        return super.getPermission();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ int getReadTimeout() {
        return super.getReadTimeout();
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ String getRequestMethod() {
        return super.getRequestMethod();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ Map getRequestProperties() {
        return super.getRequestProperties();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ String getRequestProperty(String str) {
        return super.getRequestProperty(str);
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ int getResponseCode() throws IOException {
        return super.getResponseCode();
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ String getResponseMessage() throws IOException {
        return super.getResponseMessage();
    }

    @Override // defpackage.ecz, javax.net.ssl.HttpsURLConnection
    public final /* bridge */ /* synthetic */ Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return super.getServerCertificates();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ URL getURL() {
        return super.getURL();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ boolean getUseCaches() {
        return super.getUseCaches();
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setAllowUserInteraction(boolean z) {
        super.setAllowUserInteraction(z);
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ void setChunkedStreamingMode(int i) {
        super.setChunkedStreamingMode(i);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setDefaultUseCaches(boolean z) {
        super.setDefaultUseCaches(z);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setDoInput(boolean z) {
        super.setDoInput(z);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setDoOutput(boolean z) {
        super.setDoOutput(z);
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ void setFixedLengthStreamingMode(int i) {
        super.setFixedLengthStreamingMode(i);
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ void setFixedLengthStreamingMode(long j) {
        super.setFixedLengthStreamingMode(j);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ void setInstanceFollowRedirects(boolean z) {
        super.setInstanceFollowRedirects(z);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setReadTimeout(int i) {
        super.setReadTimeout(i);
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ void setRequestMethod(String str) throws ProtocolException {
        super.setRequestMethod(str);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setRequestProperty(String str, String str2) {
        super.setRequestProperty(str, str2);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ void setUseCaches(boolean z) {
        super.setUseCaches(z);
    }

    @Override // defpackage.ecz, java.net.URLConnection
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // defpackage.ecz, java.net.HttpURLConnection
    public final /* bridge */ /* synthetic */ boolean usingProxy() {
        return super.usingProxy();
    }

    public edb(URL url, eaw eawVar, ebj ebjVar) {
        this(new eda(url, eawVar, ebjVar));
    }

    private edb(eda edaVar) {
        super(edaVar);
        this.a = edaVar;
    }

    @Override // defpackage.ecz
    protected final eaq a() {
        if (this.a.d == null) {
            throw new IllegalStateException("Connection has not yet been established");
        }
        return this.a.i;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        eda edaVar = this.a;
        edaVar.c = edaVar.c.i().a(hostnameVerifier).d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.a.c.f();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        eda edaVar = this.a;
        edaVar.c = edaVar.c.i().a(sSLSocketFactory).d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.a.c.e();
    }
}
