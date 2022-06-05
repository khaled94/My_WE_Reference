package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.OutputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ucare/we/billsummary/DownloadFile;", "", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getContext", "()Landroid/app/Activity;", "downloadFile", "", "fileName", "", "bytes", "", "openPDFFile", "file", "Ljava/io/File;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: cyh  reason: default package */
/* loaded from: classes2.dex */
public final class cyh {
    final Activity a;

    public cyh(Activity activity) {
        dqc.d(activity, "context");
        this.a = activity;
    }

    public final void a(String str, byte[] bArr) {
        dqc.d(str, "fileName");
        dqc.d(bArr, "bytes");
        dnq.a(new a(bArr, str, this));
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: cyh$a */
    /* loaded from: classes2.dex */
    static final class a extends dqd implements dov<dmg> {
        final /* synthetic */ byte[] a;
        final /* synthetic */ String b;
        final /* synthetic */ cyh c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(byte[] bArr, String str, cyh cyhVar) {
            super(0);
            this.a = bArr;
            this.b = str;
            this.c = cyhVar;
        }

        @Override // defpackage.dov
        public final /* synthetic */ dmg invoke() {
            OutputStream openOutputStream;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(this.a));
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", this.b);
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                Uri insert = this.c.a.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                if (insert != null && (openOutputStream = this.c.a.getContentResolver().openOutputStream(insert)) != null) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(openOutputStream);
                    byte[] bArr = new byte[1024];
                    for (int read = bufferedInputStream.read(bArr); read >= 0; read = bufferedInputStream.read(bArr)) {
                        bufferedOutputStream.write(bArr, 0, read);
                        bufferedOutputStream.flush();
                    }
                    bufferedOutputStream.close();
                }
                bufferedInputStream.close();
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                cyh cyhVar = this.c;
                File file = new File(externalStoragePublicDirectory + '/' + this.b);
                dqc.d(file, "file");
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.getUriForFile(cyhVar.a, "com.ucare.we.provider", file), "application/pdf");
                    cyhVar.a.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(cyhVar.a, dqc.a("File Location:", (Object) file), 1).show();
                }
            } catch (Exception e) {
                String.valueOf(e.getMessage());
                e.printStackTrace();
            }
            return dmg.a;
        }
    }
}
