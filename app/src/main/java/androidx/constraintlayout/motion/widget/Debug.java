package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

/* loaded from: classes.dex */
public class Debug {
    public static void logStack(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            String fileName = stackTrace[i2].getFileName();
            int lineNumber = stackTrace[i2].getLineNumber();
            String methodName = stackTrace[i2].getMethodName();
            StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 16 + String.valueOf(methodName).length());
            sb.append(".(");
            sb.append(fileName);
            sb.append(":");
            sb.append(lineNumber);
            sb.append(") ");
            sb.append(methodName);
            String sb2 = sb.toString();
            str3 = String.valueOf(str3).concat(" ");
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(sb2).length() + String.valueOf(str3).length());
            sb3.append(str2);
            sb3.append(str3);
            sb3.append(sb2);
            sb3.append(str3);
        }
    }

    public static void printStack(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            String fileName = stackTrace[i2].getFileName();
            int lineNumber = stackTrace[i2].getLineNumber();
            StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 16);
            sb.append(".(");
            sb.append(fileName);
            sb.append(":");
            sb.append(lineNumber);
            sb.append(") ");
            String sb2 = sb.toString();
            str2 = String.valueOf(str2).concat(" ");
            PrintStream printStream = System.out;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(sb2).length() + String.valueOf(str2).length());
            sb3.append(str);
            sb3.append(str2);
            sb3.append(sb2);
            sb3.append(str2);
            printStream.println(sb3.toString());
        }
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void dumpPoc(Object obj) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        String name = cls.getName();
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 35 + String.valueOf(name).length());
        sb3.append(sb2);
        sb3.append("------------- ");
        sb3.append(name);
        sb3.append(" --------------------");
        printStream.println(sb3.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    PrintStream printStream2 = System.out;
                    String name2 = field.getName();
                    String valueOf = String.valueOf(obj2);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(name2).length() + String.valueOf(valueOf).length());
                    sb4.append(sb2);
                    sb4.append("    ");
                    sb4.append(name2);
                    sb4.append(" ");
                    sb4.append(valueOf);
                    printStream2.println(sb4.toString());
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream3 = System.out;
        String simpleName = cls.getSimpleName();
        StringBuilder sb5 = new StringBuilder(String.valueOf(sb2).length() + 35 + String.valueOf(simpleName).length());
        sb5.append(sb2);
        sb5.append("------------- ");
        sb5.append(simpleName);
        sb5.append(" --------------------");
        printStream3.println(sb5.toString());
    }

    public static String getName(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder(12);
                sb.append("?");
                sb.append(i);
                return sb.toString();
            }
        }
        return "UNKNOWN";
    }

    public static String getName(Context context, int[] iArr) {
        String str;
        try {
            int length = iArr.length;
            StringBuilder sb = new StringBuilder(12);
            sb.append(length);
            sb.append("[");
            String sb2 = sb.toString();
            int i = 0;
            while (i < iArr.length) {
                String valueOf = String.valueOf(sb2);
                String str2 = i == 0 ? "" : " ";
                String concat = str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
                try {
                    str = context.getResources().getResourceEntryName(iArr[i]);
                } catch (Resources.NotFoundException unused) {
                    int i2 = iArr[i];
                    StringBuilder sb3 = new StringBuilder(14);
                    sb3.append("? ");
                    sb3.append(i2);
                    sb3.append(" ");
                    str = sb3.toString();
                }
                String valueOf2 = String.valueOf(concat);
                String valueOf3 = String.valueOf(str);
                sb2 = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                i++;
            }
            return String.valueOf(sb2).concat("]");
        } catch (Exception unused2) {
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i) {
        return getState(motionLayout, i, -1);
    }

    public static String getState(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        return (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) ? resourceEntryName : resourceEntryName.replaceAll(String.valueOf(CharBuffer.allocate((resourceEntryName.length() - i2) / length).toString().replace((char) 0, '.')).concat("_"), "_");
    }

    public static String getActionType(MotionEvent motionEvent) {
        Field[] fields;
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        return sb.toString();
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 18 + String.valueOf(methodName).length());
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(") ");
        sb.append(methodName);
        sb.append("()");
        return sb.toString();
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        return sb.toString();
    }

    public static String getCallFrom(int i) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i + 2];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        return sb.toString();
    }

    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 18 + String.valueOf(str).length());
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(") ");
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        int childCount = viewGroup.getChildCount();
        PrintStream printStream = System.out;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 21);
        sb3.append(str);
        sb3.append(" children ");
        sb3.append(childCount);
        printStream.println(sb3.toString());
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            PrintStream printStream2 = System.out;
            String name = getName(childAt);
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(name).length());
            sb4.append(sb2);
            sb4.append("     ");
            sb4.append(name);
            printStream2.println(sb4.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        PrintStream printStream3 = System.out;
                        String name2 = field.getName();
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(sb2).length() + 8 + String.valueOf(name2).length() + String.valueOf(valueOf).length());
                        sb5.append(sb2);
                        sb5.append("       ");
                        sb5.append(name2);
                        sb5.append(" ");
                        sb5.append(valueOf);
                        printStream3.println(sb5.toString());
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 18 + String.valueOf(str).length());
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(") ");
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        PrintStream printStream = System.out;
        String name = layoutParams.getClass().getName();
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 28 + String.valueOf(name).length());
        sb3.append(" >>>>>>>>>>>>>>>>>>. dump ");
        sb3.append(sb2);
        sb3.append("  ");
        sb3.append(name);
        printStream.println(sb3.toString());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name2 = field.getName();
                if (name2.contains("To") && !obj.toString().equals("-1")) {
                    PrintStream printStream2 = System.out;
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 8 + String.valueOf(name2).length() + String.valueOf(valueOf).length());
                    sb4.append(sb2);
                    sb4.append("       ");
                    sb4.append(name2);
                    sb4.append(" ");
                    sb4.append(valueOf);
                    printStream2.println(sb4.toString());
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream3 = System.out;
        String valueOf2 = String.valueOf(sb2);
        printStream3.println(valueOf2.length() != 0 ? " <<<<<<<<<<<<<<<<< dump ".concat(valueOf2) : new String(" <<<<<<<<<<<<<<<<< dump "));
    }
}
