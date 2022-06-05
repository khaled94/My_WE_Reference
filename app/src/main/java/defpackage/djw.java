package defpackage;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundleBody;
import com.ucare.we.model.SignInModel.GroupFamilyModel;
import com.ucare.we.model.UserCredentials;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;

/* renamed from: djw  reason: default package */
/* loaded from: classes2.dex */
public final class djw extends czz {
    @Inject
    protected SharedPreferences a;

    public final void a(boolean z) {
        this.a.edit().putBoolean("BALANCE_TRANSFER_FEATURE_FLAG", z).apply();
    }

    public final boolean a() {
        return this.a.getBoolean("BALANCE_TRANSFER_FEATURE_FLAG", true);
    }

    public final void b(boolean z) {
        this.a.edit().putBoolean("BALANCE_TRANSFER_HISTORY_FEATURE_FLAG", z).apply();
    }

    public final boolean b() {
        return this.a.getBoolean("BALANCE_TRANSFER_HISTORY_FEATURE_FLAG", true);
    }

    public final void c(boolean z) {
        this.a.edit().putBoolean("first_open", z).apply();
    }

    public final boolean c() {
        return this.a.getBoolean("first_open", true);
    }

    public final void d(boolean z) {
        this.a.edit().putBoolean("QOUTA_TRANSFER_FEATURE_FLAG", z).apply();
    }

    public final boolean d() {
        return this.a.getBoolean("QOUTA_TRANSFER_FEATURE_FLAG", true);
    }

    public final void e(boolean z) {
        this.a.edit().putBoolean("AUTO_PAY_FEATURE_FLAG", z).apply();
    }

    public final void f(boolean z) {
        this.a.edit().putBoolean("REQUEST_DEVICE_FEATURE_FLAG", z).apply();
    }

    public final boolean e() {
        return this.a.getBoolean("REQUEST_DEVICE_FEATURE_FLAG", true);
    }

    public final void g(boolean z) {
        this.a.edit().putBoolean("SUSPEND_RESUME_FEATURE_FLAG", z).apply();
    }

    public final boolean f() {
        return this.a.getBoolean("SUSPEND_RESUME_FEATURE_FLAG", true);
    }

    public final void h(boolean z) {
        this.a.edit().putBoolean("REQUEST_USER_NAME_PASSWORD_FEATURE_FLAG", z).apply();
    }

    public final boolean g() {
        return this.a.getBoolean("REQUEST_USER_NAME_PASSWORD_FEATURE_FLAG", true);
    }

    public final void i(boolean z) {
        this.a.edit().putBoolean("TROUBLE_TICKET_FEATURE_FLAG", z).apply();
    }

    public final void j(boolean z) {
        this.a.edit().putBoolean("SALNY_FEATURE_FLAG", z).apply();
    }

    public final void a(String str) {
        this.a.edit().putString("anonymous_token", str).apply();
    }

    public final String h() {
        return this.a.getString("anonymous_token", "");
    }

    public final String b(String str) {
        return this.a.getString("PREF_LANGUAGE", str);
    }

    public final boolean i() {
        return this.a.getBoolean("isDiscoverWe", false);
    }

    public final void k(boolean z) {
        this.a.edit().putBoolean("isDiscoverWe", z).apply();
    }

    public final void j() {
        this.a.edit().putBoolean("isStored", true).apply();
    }

    public final void c(String str) {
        this.a.edit().putString("PREF_LANGUAGE", str).apply();
    }

    public final String k() {
        return this.a.getString("PREF_LANGUAGE", "en");
    }

    public final Boolean l() {
        return Boolean.valueOf(this.a.getString("PREF_LANGUAGE", "en").equalsIgnoreCase("en"));
    }

    public final String m() {
        return this.a.getString("USERMOBILE", null);
    }

    public final void d(String str) {
        this.a.edit().putString("USERMOBILE", str).apply();
    }

    public final void e(String str) {
        this.a.edit().putString("USERNAME", str).apply();
    }

    public final String n() {
        return this.a.getString("PASSWORD", null);
    }

    public final void f(String str) {
        this.a.edit().putString("PASSWORD", str).apply();
    }

    public final void g(String str) {
        this.a.edit().putString("PASSWORD_RAW", str).apply();
    }

    public final String o() {
        return this.a.getString("PASSWORD_RAW", null);
    }

    public final void h(String str) {
        this.a.edit().putString("EMAIL", str).apply();
    }

    public final void p() {
        this.a.edit().remove("USERMOBILE").apply();
    }

    public final void q() {
        this.a.edit().remove("PASSWORD").apply();
    }

    public final String r() {
        return this.a.getString("MAINUSERMOBILE", null);
    }

    public final String s() {
        return this.a.getString("EMAIL", null);
    }

    public final void i(String str) {
        this.a.edit().putString("MAINUSERMOBILE", str).apply();
    }

    public final String t() {
        return this.a.getString("MAINUSERPASSWORD", null);
    }

    public final String u() {
        return this.a.getString("USERNAME", null);
    }

    public final void j(String str) {
        this.a.edit().putString("MAINUSERPASSWORD", str).apply();
    }

    public final void k(String str) {
        this.a.edit().putString("PREF_MAIN_USER_STATUS", str).apply();
    }

    public final String v() {
        return this.a.getString("PREF_ACTIVE_USER_STATUS", "");
    }

    public final void l(String str) {
        this.a.edit().putString("PREF_ACTIVE_USER_STATUS", str).apply();
    }

    public final String w() {
        return this.a.getString("PREF_ACTIVE_USER_ROLE", "");
    }

    public final void m(String str) {
        this.a.edit().putString("PREF_ACTIVE_USER_ROLE", str).apply();
    }

    public final void x() {
        this.a.edit().remove("MAINUSERMOBILE").apply();
    }

    public final void y() {
        this.a.edit().remove("MAINUSERPASSWORD").apply();
    }

    public final float z() {
        return this.a.getFloat("USER_BALANCE", 0.0f);
    }

    public final void a(float f) {
        this.a.edit().putFloat("USER_BALANCE", f).apply();
    }

    public final List<UserCredentials> A() {
        return (List) new Gson().a(this.a.getString("USER_CREDENTIALS".concat(String.valueOf(B())), null), new crb<List<UserCredentials>>() { // from class: djw.1
        }.b);
    }

    public final void a(List<UserCredentials> list) {
        String m = m();
        this.a.edit().putString("USER_CREDENTIALS".concat(String.valueOf(m)), new Gson().a(list)).apply();
    }

    public final void b(List<String> list) {
        String r = r();
        this.a.edit().putString("USER_ASSOCIATED_ACCOUNTS".concat(String.valueOf(r)), new Gson().a(list)).apply();
    }

    public final void n(String str) {
        this.a.edit().putString("original", str).apply();
    }

    public final String B() {
        return this.a.getString("original", "");
    }

    public final void o(String str) {
        this.a.edit().putString("switched", str).apply();
    }

    public final String C() {
        return this.a.getString("switched", "");
    }

    public final void p(String str) {
        this.a.edit().putString("CACHED_BILL_SUMMARY_RESPONSE", str).apply();
    }

    public final String D() {
        return this.a.getString("CACHED_BILL_SUMMARY_RESPONSE", "");
    }

    public final void q(String str) {
        this.a.edit().putString("FACEBOOK_LOGIN_TOKEN", str).apply();
    }

    public final String E() {
        return this.a.getString("FACEBOOK_LOGIN_TOKEN", "");
    }

    public final void r(String str) {
        this.a.edit().putString("HUAWEI_LOGIN_TOKEN", str).apply();
    }

    public final String F() {
        return this.a.getString("HUAWEI_LOGIN_TOKEN", "");
    }

    public final void s(String str) {
        this.a.edit().putString("GOOGLE_LOGIN_TOKEN", str).apply();
    }

    public final String G() {
        return this.a.getString("GOOGLE_LOGIN_TOKEN", "");
    }

    public final void t(String str) {
        this.a.edit().putString("FCM_TOKEN", str).apply();
    }

    public final String H() {
        return this.a.getString("FCM_TOKEN", "");
    }

    public final void u(String str) {
        this.a.edit().putString("ASSOCIATE_JWT", str).apply();
    }

    public final String I() {
        return this.a.getString("ASSOCIATE_JWT", "");
    }

    public final void v(String str) {
        this.a.edit().putString(str, str).apply();
    }

    public final String J() {
        return this.a.getString("jwt", "");
    }

    public final boolean K() {
        return this.a.getBoolean("SALEFNY_PROMISE_TO_PAY", false);
    }

    public final void l(boolean z) {
        this.a.edit().putBoolean("SALEFNY_PROMISE_TO_PAY", z).apply();
    }

    public final boolean L() {
        return this.a.getBoolean("ONE_TIME_POPUP", false);
    }

    public final void m(boolean z) {
        this.a.edit().putBoolean("ONE_TIME_POPUP", z).apply();
    }

    public final boolean M() {
        return this.a.getBoolean("REGIONAL_POPUP_DISPLY", false);
    }

    public final void n(boolean z) {
        this.a.edit().putBoolean("REGIONAL_POPUP_DISPLY", z).apply();
    }

    public final String N() {
        return this.a.getString("FMC_ID", "");
    }

    public final void w(String str) {
        this.a.edit().putString("FMC_ID", str).apply();
    }

    public final boolean O() {
        return this.a.getBoolean("IS_FMC", false);
    }

    public final void o(boolean z) {
        this.a.edit().putBoolean("IS_FMC", z).apply();
    }

    public final void x(String str) {
        this.a.edit().putString("FAMILY_GROUP", str).commit();
    }

    public final GroupFamilyModel P() {
        String string = this.a.getString("FAMILY_GROUP", "");
        if (string.isEmpty()) {
            return new GroupFamilyModel();
        }
        return (GroupFamilyModel) new Gson().a(string, (Class<Object>) GroupFamilyModel.class);
    }

    public final boolean Q() {
        return this.a.getBoolean("IS_IPTV", false);
    }

    public final void p(boolean z) {
        this.a.edit().putBoolean("IS_IPTV", z).apply();
    }

    public final boolean R() {
        return this.a.getBoolean("VALID_MAIN_PLAN", false);
    }

    public final void q(boolean z) {
        this.a.edit().putBoolean("VALID_MAIN_PLAN", z).apply();
    }

    public final boolean S() {
        return this.a.getBoolean("REGISTERED_MSISDN", true);
    }

    public final void r(boolean z) {
        this.a.edit().putBoolean("REGISTERED_MSISDN", z).apply();
    }

    public final boolean T() {
        return this.a.getBoolean("IS_REFRESHED", false);
    }

    public final void s(boolean z) {
        this.a.edit().putBoolean("IS_REFRESHED", z).apply();
    }

    public final String U() {
        return this.a.getString("CREDIT_CARD_NUMBER", "");
    }

    public final void y(String str) {
        this.a.edit().putString("CREDIT_CARD_NUMBER", str).apply();
    }

    public final String V() {
        return this.a.getString("CREDIT_CARD_TYPE", "");
    }

    public final void z(String str) {
        this.a.edit().putString("CREDIT_CARD_TYPE", str).apply();
    }

    public final String W() {
        return this.a.getString("SELECTED_FMC_MEMBER_ADD_ONS", "");
    }

    public final void A(String str) {
        this.a.edit().putString("SELECTED_FMC_MEMBER_ADD_ONS", str).apply();
    }

    public final ArrayList<String> X() {
        new HashSet();
        Set<String> stringSet = this.a.getStringSet("FMC_MOBILE_MSISDNS", new HashSet());
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(stringSet);
        return arrayList;
    }

    public final void a(ArrayList<String> arrayList) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        this.a.edit().putStringSet("FMC_MOBILE_MSISDNS", hashSet).apply();
    }

    public final ArrayList<String> Y() {
        Set<String> stringSet = this.a.getStringSet("FMC_ADSL_MSISDNS", null);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(stringSet);
        return arrayList;
    }

    public final void b(ArrayList<String> arrayList) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        this.a.edit().putStringSet("FMC_ADSL_MSISDNS", hashSet).apply();
    }

    public final void B(String str) {
        this.a.edit().putString("MAIN_PLAN", str).commit();
    }

    public final ResponseViewMoreBundleBody Z() {
        String string = this.a.getString("MAIN_PLAN", "");
        if (string.isEmpty()) {
            return new ResponseViewMoreBundleBody();
        }
        return (ResponseViewMoreBundleBody) new Gson().a(string, (Class<Object>) ResponseViewMoreBundleBody.class);
    }
}
