package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ucare.we.R;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: djm  reason: default package */
/* loaded from: classes2.dex */
public final class djm {
    public static String a(float f) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("en", "US"));
        decimalFormat.applyPattern("##.##");
        return decimalFormat.format(f);
    }

    public static void a(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static boolean a() throws InterruptedException, IOException {
        return Runtime.getRuntime().exec("ping -c 1 www.google.com").waitFor() == 0;
    }

    public static String a(Context context, String str) {
        if (str.equals("01")) {
            return context.getString(R.string.jan_short);
        }
        if (str.equals("02")) {
            return context.getString(R.string.feb_short);
        }
        if (str.equals("03")) {
            return context.getString(R.string.mar_short);
        }
        if (str.equals("04")) {
            return context.getString(R.string.apr_short);
        }
        if (str.equals("05")) {
            return context.getString(R.string.may_short);
        }
        if (str.equals("06")) {
            return context.getString(R.string.june_short);
        }
        if (str.equals("07")) {
            return context.getString(R.string.july_short);
        }
        if (str.equals("08")) {
            return context.getString(R.string.aug_short);
        }
        if (str.equals("09")) {
            return context.getString(R.string.sep_short);
        }
        if (str.equals("10")) {
            return context.getString(R.string.oct_short);
        }
        if (str.equals("11")) {
            return context.getString(R.string.nov_short);
        }
        return str.equals("12") ? context.getString(R.string.dec_short) : "Error";
    }

    public static void b(Activity activity) {
        if (activity.getCurrentFocus() != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public static void a(Context context) {
        String str;
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        Date time = calendar.getTime();
        int a = djv.a("REFRESH_DATE_MONTH");
        int a2 = djv.a("REFRESH_DATE_DAY");
        int a3 = djv.a("REFRESH_DATE_YEAR");
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, a3);
        calendar2.set(2, a);
        calendar2.set(5, a2);
        int i6 = calendar.get(9);
        if (i6 == 0) {
            str = context.getString(R.string.AM);
        } else {
            str = i6 == 1 ? context.getString(R.string.PM) : "";
        }
        if (i4 > 12) {
            i4 -= 12;
        }
        if (calendar2.before(time)) {
            djv.b("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", context.getString(R.string.refreshed_at) + " " + i3 + "-" + i2 + "-" + i + " " + i4 + ":" + String.format(Locale.ENGLISH, "%02d", Integer.valueOf(i5)) + " " + str);
        } else {
            djv.b("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", context.getString(R.string.refreshed_at) + " " + i4 + ":" + String.format(Locale.ENGLISH, "%02d", Integer.valueOf(i5)) + " " + str);
        }
        djv.a("REFRESH_DATE_MONTH", i2);
        djv.a("REFRESH_DATE_DAY", i3);
        djv.a("REFRESH_DATE_YEAR", i);
    }

    public static String c(Activity activity) {
        int i = Calendar.getInstance().get(11);
        if (i < 0 || i >= 12) {
            if (i >= 12 && i < 18) {
                return activity.getString(R.string.Good_Afternoon);
            }
            return ((i < 18 || i >= 21) && (i < 21 || i >= 24)) ? "" : activity.getString(R.string.Good_Evening);
        }
        return activity.getString(R.string.good_morning);
    }

    public static String a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        new Date();
        if (str != null) {
            try {
                return simpleDateFormat2.format(simpleDateFormat.parse(str));
            } catch (ParseException e) {
                e.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public static String b(String str) {
        try {
            String[] split = str.split("[-]", 0);
            String str2 = split[1];
            String str3 = split[0];
            String str4 = split[2];
            str2.replaceAll("0", "");
            return str4 + " " + new SimpleDateFormat("MMMM").format(new SimpleDateFormat("MM").parse(str2)) + " " + str3;
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean c(String str) {
        return Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(str).matches();
    }

    public static String d(String str) {
        String str2 = "";
        for (int length = str.length() - 1; length >= 0; length--) {
            str2 = str2 + str.charAt(length);
        }
        Character valueOf = Character.valueOf(str2.charAt((str2.length() - 1) - 0));
        Character valueOf2 = Character.valueOf(str2.charAt((str2.length() - 1) - 2));
        char[] charArray = str2.toCharArray();
        charArray[(str2.length() - 1) - 0] = valueOf2.charValue();
        charArray[(str2.length() - 1) - 2] = valueOf.charValue();
        Character valueOf3 = Character.valueOf(str2.charAt(0));
        charArray[0] = Character.valueOf(str2.charAt(1)).charValue();
        charArray[1] = valueOf3.charValue();
        return String.valueOf(charArray);
    }

    public static Resources a(Context context, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources();
    }
}
