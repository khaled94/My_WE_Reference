package com.bumptech.glide.load.engine;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {
    private static final StackTraceElement[] b = new StackTraceElement[0];
    public Exception a;
    private final List<Throwable> c;
    private ck d;
    private cf e;
    private Class<?> f;
    private String g;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.g = str;
        setStackTrace(b);
        this.c = list;
    }

    public final void a(ck ckVar, cf cfVar, Class<?> cls) {
        this.d = ckVar;
        this.e = cfVar;
        this.f = cls;
    }

    private List<Throwable> b() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public final void a() {
        List<Throwable> b2 = b();
        int size = b2.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            b2.get(i);
            i = i2;
        }
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).c) {
                a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        a(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        a(printWriter);
    }

    private void a(Appendable appendable) {
        a(this, appendable);
        a(this.c, new a(appendable));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.g);
        String str = "";
        sb.append(this.f != null ? ", " + this.f : str);
        sb.append(this.e != null ? ", " + this.e : str);
        if (this.d != null) {
            str = ", " + this.d;
        }
        sb.append(str);
        List<Throwable> b2 = b();
        if (b2.isEmpty()) {
            return sb.toString();
        }
        if (b2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(b2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : b2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    private static void a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private static void a(List<Throwable> list, Appendable appendable) {
        try {
            b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).a(appendable);
            } else {
                a(th, appendable);
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {
        private final Appendable a;
        private boolean b = true;

        private static CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.b) {
                this.b = false;
                this.a.append("  ");
            }
            if (c == '\n') {
                z = true;
            }
            this.b = z;
            this.a.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = a(charSequence);
            return append(a, 0, a.length());
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = a(charSequence);
            boolean z = false;
            if (this.b) {
                this.b = false;
                this.a.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.b = z;
            this.a.append(a, i, i2);
            return this;
        }
    }
}
