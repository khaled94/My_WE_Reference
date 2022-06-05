package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.afollestad.materialdialogs.commons.R;
import defpackage.w;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: ad  reason: default package */
/* loaded from: classes.dex */
public class ad extends DialogFragment implements w.d {
    private File a;
    private File[] b;
    private boolean c = false;
    private b d;

    /* renamed from: ad$a */
    /* loaded from: classes.dex */
    public static class a implements Serializable {
        int a;
        int b;
        String c;
        boolean d;
        int e;
        String f;
    }

    /* renamed from: ad$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    private String[] a() {
        File[] fileArr = this.b;
        if (fileArr == null) {
            return this.c ? new String[]{d().f} : new String[0];
        }
        int length = fileArr.length;
        boolean z = this.c;
        String[] strArr = new String[length + (z ? 1 : 0)];
        if (z) {
            strArr[0] = "...";
        }
        for (int i = 0; i < this.b.length; i++) {
            strArr[this.c ? i + 1 : i] = this.b[i].getName();
        }
        return strArr;
    }

    private File[] b() {
        File[] listFiles = this.a.listFiles();
        ArrayList arrayList = new ArrayList();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file);
                }
            }
            Collections.sort(arrayList, new c((byte) 0));
            return (File[]) arrayList.toArray(new File[arrayList.size()]);
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 23 && ActivityCompat.checkSelfPermission(getActivity(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return new w.a(getActivity()).a(R.string.md_error_label).b(R.string.md_storage_perm_error).c(17039370).d();
        }
        if (getArguments() == null || !getArguments().containsKey("builder")) {
            throw new IllegalStateException("You must create a FolderChooserDialog using the Builder.");
        }
        if (!getArguments().containsKey("current_path")) {
            getArguments().putString("current_path", d().c);
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
        this.b = b();
        w.a e = new w.a(getActivity()).a(this.a.getAbsolutePath()).a(a()).a(this).a(new w.i() { // from class: ad.2
            @Override // defpackage.w.i
            public final void onClick(w wVar, s sVar) {
                wVar.dismiss();
                b unused2 = ad.this.d;
                File unused3 = ad.this.a;
            }
        }).b(new w.i() { // from class: ad.1
            @Override // defpackage.w.i
            public final void onClick(w wVar, s sVar) {
                wVar.dismiss();
            }
        }).c().c(d().a).e(d().b);
        if (d().d) {
            e.d(d().e);
            e.c(new w.i() { // from class: ad.3
                @Override // defpackage.w.i
                public final void onClick(w wVar, s sVar) {
                    ad.c(ad.this);
                }
            });
        }
        if (Objects.equals(d().c, "/")) {
            this.c = false;
        }
        return e.d();
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
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.b = b();
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

    private a d() {
        return (a) getArguments().getSerializable("builder");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ad$c */
    /* loaded from: classes.dex */
    public static class c implements Comparator<File> {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    static /* synthetic */ void c(ad adVar) {
        new w.a(adVar.getActivity()).a(adVar.d().e).a(new w.c() { // from class: ad.4
            @Override // defpackage.w.c
            public final void a(CharSequence charSequence) {
                File file = new File(ad.this.a, charSequence.toString());
                if (file.mkdir()) {
                    ad.this.c();
                    return;
                }
                FragmentActivity activity = ad.this.getActivity();
                Toast.makeText(activity, "Unable to create folder " + file.getAbsolutePath() + ", make sure you have the WRITE_EXTERNAL_STORAGE permission or root permissions.", 1).show();
            }
        }).e();
    }
}
