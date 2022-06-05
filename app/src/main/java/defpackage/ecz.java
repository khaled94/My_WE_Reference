package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: ecz  reason: default package */
/* loaded from: classes2.dex */
abstract class ecz extends HttpsURLConnection {
    private final HttpURLConnection a;

    protected abstract eaq a();

    public ecz(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.a = httpURLConnection;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        eaq a = a();
        if (a != null) {
            return a.a().a();
        }
        return null;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        eaq a = a();
        if (a == null) {
            return null;
        }
        List<Certificate> d = a.d();
        if (d.isEmpty()) {
            return null;
        }
        return (Certificate[]) d.toArray(new Certificate[d.size()]);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        eaq a = a();
        if (a == null) {
            return null;
        }
        List<Certificate> b = a.b();
        if (b.isEmpty()) {
            return null;
        }
        return (Certificate[]) b.toArray(new Certificate[b.size()]);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        eaq a = a();
        if (a != null) {
            return a.c();
        }
        return null;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        eaq a = a();
        if (a != null) {
            return a.e();
        }
        return null;
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.connected = true;
        this.a.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.a.disconnect();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.a.getErrorStream();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.a.getRequestMethod();
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.a.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.a.getResponseMessage();
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.a.setRequestMethod(str);
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.a.usingProxy();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.a.getInstanceFollowRedirects();
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.a.getContent();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.a.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.a.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.a.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.a.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.a.getDoOutput();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.a.getHeaderField(i);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.a.getHeaderField(str);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        return this.a.getHeaderFieldLong(str, j);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.a.getInputStream();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.a.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.a.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.a.getPermission();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.a.getRequestProperty(str);
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.a.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.a.setAllowUserInteraction(z);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.a.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.a.setIfModifiedSince(j);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.a.setReadTimeout(i);
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.a.getReadTimeout();
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.a.toString();
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.a.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.a.setChunkedStreamingMode(i);
    }
}
