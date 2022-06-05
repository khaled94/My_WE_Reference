package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.DialogFragment;
import com.afollestad.materialdialogs.commons.R;
import defpackage.w;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: ac  reason: default package */
/* loaded from: classes.dex */
public class ac extends DialogFragment implements w.d {
    private File a;
    private File[] b;
    private boolean c = true;
    private b d;

    /* renamed from: ac$a */
    /* loaded from: classes.dex */
    public static class a implements Serializable {
        int a;
        String b;
        String c;
        String[] d;
        String e;
    }

    /* renamed from: ac$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    private CharSequence[] a() {
        File[] fileArr = this.b;
        if (fileArr == null) {
            return this.c ? new String[]{b().e} : new String[0];
        }
        int length = fileArr.length;
        boolean z = this.c;
        String[] strArr = new String[length + (z ? 1 : 0)];
        if (z) {
            strArr[0] = b().e;
        }
        for (int i = 0; i < this.b.length; i++) {
            strArr[this.c ? i + 1 : i] = this.b[i].getName();
        }
        return strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
        if (r11.substring(0, r10).equals(r15) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File[] a(java.lang.String r17, java.lang.String[] r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r16
            r2 = r18
            java.io.File r3 = r1.a
            java.io.File[] r3 = r3.listFiles()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto Ldc
            android.webkit.MimeTypeMap r5 = android.webkit.MimeTypeMap.getSingleton()
            int r6 = r3.length
            r7 = 0
            r8 = 0
        L1a:
            if (r8 >= r6) goto Lc7
            r9 = r3[r8]
            boolean r10 = r9.isDirectory()
            if (r10 == 0) goto L29
            r4.add(r9)
            goto Lc3
        L29:
            if (r2 == 0) goto L50
            int r11 = r2.length
            r12 = 0
        L2d:
            if (r12 >= r11) goto L48
            r13 = r2[r12]
            java.lang.String r14 = r9.getName()
            java.lang.String r14 = r14.toLowerCase()
            java.lang.String r13 = r13.toLowerCase()
            boolean r13 = r14.endsWith(r13)
            if (r13 == 0) goto L45
            r10 = 1
            goto L49
        L45:
            int r12 = r12 + 1
            goto L2d
        L48:
            r10 = 0
        L49:
            if (r10 == 0) goto Lc3
            r4.add(r9)
            goto Lc3
        L50:
            if (r0 == 0) goto Lc3
            if (r0 == 0) goto Lbd
        */
        //  java.lang.String r11 = "*/*"
        /*
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L5d
            goto Lbd
        L5d:
            java.net.URI r11 = r9.toURI()
            java.lang.String r11 = r11.toString()
            r12 = 46
            int r12 = r11.lastIndexOf(r12)
            r13 = -1
            if (r12 == r13) goto Lbb
            int r12 = r12 + 1
            java.lang.String r11 = r11.substring(r12)
            java.lang.String r12 = "json"
            boolean r12 = r11.endsWith(r12)
            if (r12 == 0) goto L83
            java.lang.String r10 = "application/json"
            boolean r10 = r0.startsWith(r10)
            goto Lbe
        L83:
            java.lang.String r11 = r5.getMimeTypeFromExtension(r11)
            if (r11 == 0) goto Lbb
            boolean r12 = r11.equals(r0)
            if (r12 == 0) goto L90
            goto Lbd
        L90:
            r12 = 47
            int r14 = r0.lastIndexOf(r12)
            if (r14 == r13) goto Lbb
            java.lang.String r15 = r0.substring(r7, r14)
            int r14 = r14 + 1
            java.lang.String r14 = r0.substring(r14)
            java.lang.String r10 = "*"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto Lbb
            int r10 = r11.lastIndexOf(r12)
            if (r10 == r13) goto Lbb
            java.lang.String r10 = r11.substring(r7, r10)
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto Lbb
            goto Lbd
        Lbb:
            r10 = 0
            goto Lbe
        Lbd:
            r10 = 1
        Lbe:
            if (r10 == 0) goto Lc3
            r4.add(r9)
        Lc3:
            int r8 = r8 + 1
            goto L1a
        Lc7:
            ac$c r0 = new ac$c
            r0.<init>(r7)
            java.util.Collections.sort(r4, r0)
            int r0 = r4.size()
            java.io.File[] r0 = new java.io.File[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.io.File[] r0 = (java.io.File[]) r0
            return r0
        Ldc:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac.a(java.lang.String, java.lang.String[]):java.io.File[]");
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 23 && ActivityCompat.checkSelfPermission(getActivity(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return new w.a(getActivity()).a(R.string.md_error_label).b(R.string.md_storage_perm_error).c(17039370).d();
        }
        if (getArguments() == null || !getArguments().containsKey("builder")) {
            throw new IllegalStateException("You must create a FileChooserDialog using the Builder.");
        }
        if (!getArguments().containsKey("current_path")) {
            getArguments().putString("current_path", b().b);
        }
        File file = new File(getArguments().getString("current_path"));
        this.a = file;
        try {
            boolean z = true;
            if (file.getPath().split("/").length <= 1) {
                z = false;
            }
            this.c = z;
        } catch (IndexOutOfBoundsException unused) {
            this.c = false;
        }
        this.b = a(b().c, b().d);
        return new w.a(getActivity()).a(this.a.getAbsolutePath()).a(a()).a(this).b(new w.i() { // from class: ac.1
            @Override // defpackage.w.i
            public final void onClick(w wVar, s sVar) {
                wVar.dismiss();
            }
        }).c().e(b().a).d();
    }

    @Override // defpackage.w.d
    public final void a(int i) {
        boolean z = true;
        if (this.c && i == 0) {
            File parentFile = this.a.getParentFile();
            this.a = parentFile;
            if (parentFile.getAbsolutePath().equals("/storage/emulated")) {
                this.a = this.a.getParentFile();
            }
            if (this.a.getParent() == null) {
                z = false;
            }
            this.c = z;
        } else {
            File[] fileArr = this.b;
            if (this.c) {
                i--;
            }
            File file = fileArr[i];
            this.a = file;
            this.c = true;
            if (file.getAbsolutePath().equals("/storage/emulated")) {
                this.a = Environment.getExternalStorageDirectory();
            }
        }
        if (this.a.isFile()) {
            dismiss();
            return;
        }
        this.b = a(b().c, b().d);
        w wVar = (w) getDialog();
        wVar.setTitle(this.a.getAbsolutePath());
        getArguments().putString("current_path", this.a.getAbsolutePath());
        wVar.a(a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d = (b) activity;
    }

    private a b() {
        return (a) getArguments().getSerializable("builder");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac$c */
    /* loaded from: classes.dex */
    public static class c implements Comparator<File> {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (!file3.isDirectory() || file4.isDirectory()) {
                if (!file3.isDirectory() && file4.isDirectory()) {
                    return 1;
                }
                return file3.getName().compareTo(file4.getName());
            }
            return -1;
        }
    }
}
