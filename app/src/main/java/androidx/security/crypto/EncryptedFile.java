package androidx.security.crypto;

import android.content.Context;
import defpackage.bxr;
import defpackage.byv;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class EncryptedFile {
    private static final String KEYSET_ALIAS = "__androidx_security_crypto_encrypted_file_keyset__";
    private static final String KEYSET_PREF_NAME = "__androidx_security_crypto_encrypted_file_pref__";
    final Context mContext;
    final File mFile;
    final String mMasterKeyAlias;
    final byd mStreamingAead;

    EncryptedFile(File file, String str, byd bydVar, Context context) {
        this.mFile = file;
        this.mContext = context;
        this.mMasterKeyAlias = str;
        this.mStreamingAead = bydVar;
    }

    /* JADX WARN: Init of enum AES256_GCM_HKDF_4KB can be incorrect */
    /* loaded from: classes.dex */
    public enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB(bxr.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", r2.a(cal.b().a().b().a(r1).g()).g().g(), bxr.a.c));
        
        private final bxr mStreamingAeadKeyTemplate;

        static {
            cbf cbfVar = cbf.SHA256;
            cai.b().a();
            new cfi();
        }

        FileEncryptionScheme(bxr bxrVar) {
            this.mStreamingAeadKeyTemplate = bxrVar;
        }

        final bxr getKeyTemplate() {
            return this.mStreamingAeadKeyTemplate;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        final Context mContext;
        File mFile;
        final FileEncryptionScheme mFileEncryptionScheme;
        final String mMasterKeyAlias;
        String mKeysetPrefName = EncryptedFile.KEYSET_PREF_NAME;
        String mKeysetAlias = EncryptedFile.KEYSET_ALIAS;

        @Deprecated
        public Builder(File file, Context context, String str, FileEncryptionScheme fileEncryptionScheme) {
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            this.mContext = context.getApplicationContext();
            this.mMasterKeyAlias = str;
        }

        public Builder(Context context, File file, MasterKey masterKey, FileEncryptionScheme fileEncryptionScheme) {
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            this.mContext = context.getApplicationContext();
            this.mMasterKeyAlias = masterKey.getKeyAlias();
        }

        public final Builder setKeysetPrefName(String str) {
            this.mKeysetPrefName = str;
            return this;
        }

        public final Builder setKeysetAlias(String str) {
            this.mKeysetAlias = str;
            return this;
        }

        public final EncryptedFile build() throws GeneralSecurityException, IOException {
            cfk.a();
            byv.a aVar = new byv.a();
            aVar.c = this.mFileEncryptionScheme.getKeyTemplate();
            byv.a a = aVar.a(this.mContext, this.mKeysetAlias, this.mKeysetPrefName);
            return new EncryptedFile(this.mFile, this.mKeysetAlias, (byd) a.a("android-keystore://" + this.mMasterKeyAlias).a().a().a(byd.class), this.mContext);
        }
    }

    public final FileOutputStream openFileOutput() throws GeneralSecurityException, IOException {
        if (this.mFile.exists()) {
            throw new IOException("output file already exists, please use a new file: " + this.mFile.getName());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.mFile);
        return new EncryptedFileOutputStream(fileOutputStream.getFD(), this.mStreamingAead.a(fileOutputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
    }

    public final FileInputStream openFileInput() throws GeneralSecurityException, IOException {
        if (!this.mFile.exists()) {
            throw new IOException("file doesn't exist: " + this.mFile.getName());
        }
        FileInputStream fileInputStream = new FileInputStream(this.mFile);
        return new EncryptedFileInputStream(fileInputStream.getFD(), this.mStreamingAead.a(fileInputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
    }

    /* loaded from: classes.dex */
    static final class EncryptedFileOutputStream extends FileOutputStream {
        private final OutputStream mEncryptedOutputStream;

        EncryptedFileOutputStream(FileDescriptor fileDescriptor, OutputStream outputStream) {
            super(fileDescriptor);
            this.mEncryptedOutputStream = outputStream;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.mEncryptedOutputStream.write(bArr);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(int i) throws IOException {
            this.mEncryptedOutputStream.write(i);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.mEncryptedOutputStream.write(bArr, i, i2);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.mEncryptedOutputStream.close();
        }

        @Override // java.io.FileOutputStream
        public final FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.mEncryptedOutputStream.flush();
        }
    }

    /* loaded from: classes.dex */
    static final class EncryptedFileInputStream extends FileInputStream {
        private final InputStream mEncryptedInputStream;

        EncryptedFileInputStream(FileDescriptor fileDescriptor, InputStream inputStream) {
            super(fileDescriptor);
            this.mEncryptedInputStream = inputStream;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read() throws IOException {
            return this.mEncryptedInputStream.read();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(byte[] bArr) throws IOException {
            return this.mEncryptedInputStream.read(bArr);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            return this.mEncryptedInputStream.read(bArr, i, i2);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final long skip(long j) throws IOException {
            return this.mEncryptedInputStream.skip(j);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int available() throws IOException {
            return this.mEncryptedInputStream.available();
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.mEncryptedInputStream.close();
        }

        @Override // java.io.FileInputStream
        public final FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            this.mEncryptedInputStream.mark(i);
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            this.mEncryptedInputStream.reset();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.mEncryptedInputStream.markSupported();
        }
    }
}
