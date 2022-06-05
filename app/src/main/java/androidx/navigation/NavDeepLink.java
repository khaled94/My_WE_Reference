package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class NavDeepLink {
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private final String mAction;
    private final ArrayList<String> mArguments;
    private boolean mExactDeepLink;
    private boolean mIsParameterizedQuery;
    private final String mMimeType;
    private Pattern mMimeTypePattern;
    private final Map<String, ParamQuery> mParamArgMap;
    private Pattern mPattern;
    private final String mUri;

    NavDeepLink(String str, String str2, String str3) {
        this.mArguments = new ArrayList<>();
        this.mParamArgMap = new HashMap();
        this.mPattern = null;
        this.mExactDeepLink = false;
        this.mIsParameterizedQuery = false;
        this.mMimeTypePattern = null;
        this.mUri = str;
        this.mAction = str2;
        this.mMimeType = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.mIsParameterizedQuery = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!SCHEME_PATTERN.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.mIsParameterizedQuery) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    buildPathRegex(str.substring(0, matcher.start()), sb, compile);
                }
                this.mExactDeepLink = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    ParamQuery paramQuery = new ParamQuery();
                    int i = 0;
                    while (matcher2.find()) {
                        paramQuery.addArgumentName(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(i, matcher2.start())));
                        sb2.append("(.+?)?");
                        i = matcher2.end();
                    }
                    if (i < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i)));
                    }
                    paramQuery.setParamRegex(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.mParamArgMap.put(str4, paramQuery);
                }
            } else {
                this.mExactDeepLink = buildPathRegex(str, sb, compile);
            }
            this.mPattern = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"));
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
            }
            MimeType mimeType = new MimeType(str3);
            this.mMimeTypePattern = Pattern.compile(("^(" + mimeType.mType + "|[*]+)/(" + mimeType.mSubType + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NavDeepLink(String str) {
        this(str, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x0013 -> B:7:0x0014). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean buildPathRegex(java.lang.String r7, java.lang.StringBuilder r8, java.util.regex.Pattern r9) {
        /*
            r6 = this;
            java.util.regex.Matcher r9 = r9.matcher(r7)
            java.lang.String r0 = ".*"
            boolean r0 = r7.contains(r0)
            r1 = 1
            r2 = 0
            r3 = r6
            if (r0 != 0) goto L12
            r0 = 0
            r4 = 1
            goto L14
        L12:
            r0 = 0
        L13:
            r4 = 0
        L14:
            boolean r5 = r9.find()
            if (r5 == 0) goto L3c
            java.lang.String r4 = r9.group(r1)
            java.util.ArrayList<java.lang.String> r5 = r3.mArguments
            r5.add(r4)
            int r4 = r9.start()
            java.lang.String r0 = r7.substring(r0, r4)
            java.lang.String r0 = java.util.regex.Pattern.quote(r0)
            r8.append(r0)
            java.lang.String r0 = "(.+?)"
            r8.append(r0)
            int r0 = r9.end()
            goto L13
        L3c:
            int r9 = r7.length()
            if (r0 >= r9) goto L4d
            java.lang.String r7 = r7.substring(r0)
            java.lang.String r7 = java.util.regex.Pattern.quote(r7)
            r8.append(r7)
        L4d:
            java.lang.String r7 = "($|(\\?(.)*))"
            r8.append(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDeepLink.buildPathRegex(java.lang.String, java.lang.StringBuilder, java.util.regex.Pattern):boolean");
    }

    final boolean matches(Uri uri) {
        return matches(new NavDeepLinkRequest(uri, null, null));
    }

    final boolean matches(NavDeepLinkRequest navDeepLinkRequest) {
        if (matchUri(navDeepLinkRequest.getUri()) && matchAction(navDeepLinkRequest.getAction())) {
            return matchMimeType(navDeepLinkRequest.getMimeType());
        }
        return false;
    }

    private boolean matchUri(Uri uri) {
        if ((uri == null) == (this.mPattern != null)) {
            return false;
        }
        return uri == null || this.mPattern.matcher(uri.toString()).matches();
    }

    private boolean matchAction(String str) {
        if ((str == null) == (this.mAction != null)) {
            return false;
        }
        return str == null || this.mAction.equals(str);
    }

    private boolean matchMimeType(String str) {
        if ((str == null) == (this.mMimeType != null)) {
            return false;
        }
        return str == null || this.mMimeTypePattern.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isExactDeepLink() {
        return this.mExactDeepLink;
    }

    public final String getUriPattern() {
        return this.mUri;
    }

    public final String getAction() {
        return this.mAction;
    }

    public final String getMimeType() {
        return this.mMimeType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getMimeTypeMatchRating(String str) {
        if (this.mMimeType == null || !this.mMimeTypePattern.matcher(str).matches()) {
            return -1;
        }
        return new MimeType(this.mMimeType).compareTo(new MimeType(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle getMatchingArguments(Uri uri, Map<String, NavArgument> map) {
        Matcher matcher;
        Matcher matcher2 = this.mPattern.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.mArguments.size();
        int i = 0;
        while (i < size) {
            String str = this.mArguments.get(i);
            i++;
            if (parseArgument(bundle, str, Uri.decode(matcher2.group(i)), map.get(str))) {
                return null;
            }
        }
        if (this.mIsParameterizedQuery) {
            for (String str2 : this.mParamArgMap.keySet()) {
                ParamQuery paramQuery = this.mParamArgMap.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(paramQuery.getParamRegex()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                for (int i2 = 0; i2 < paramQuery.size(); i2++) {
                    String decode = matcher != null ? Uri.decode(matcher.group(i2 + 1)) : null;
                    String argumentName = paramQuery.getArgumentName(i2);
                    NavArgument navArgument = map.get(argumentName);
                    if (navArgument != null && (decode == null || decode.replaceAll("[{}]", "").equals(argumentName))) {
                        if (navArgument.getDefaultValue() != null) {
                            decode = navArgument.getDefaultValue().toString();
                        } else if (navArgument.isNullable()) {
                            decode = null;
                        }
                    }
                    if (parseArgument(bundle, argumentName, decode, navArgument)) {
                        return null;
                    }
                }
            }
        }
        return bundle;
    }

    private boolean parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            try {
                navArgument.getType().parseAndPut(bundle, str, str2);
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        }
        bundle.putString(str, str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ParamQuery {
        private ArrayList<String> mArguments = new ArrayList<>();
        private String mParamRegex;

        ParamQuery() {
        }

        void setParamRegex(String str) {
            this.mParamRegex = str;
        }

        String getParamRegex() {
            return this.mParamRegex;
        }

        void addArgumentName(String str) {
            this.mArguments.add(str);
        }

        String getArgumentName(int i) {
            return this.mArguments.get(i);
        }

        public int size() {
            return this.mArguments.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class MimeType implements Comparable<MimeType> {
        String mSubType;
        String mType;

        MimeType(String str) {
            String[] split = str.split("/", -1);
            this.mType = split[0];
            this.mSubType = split[1];
        }

        public int compareTo(MimeType mimeType) {
            int i = this.mType.equals(mimeType.mType) ? 2 : 0;
            return this.mSubType.equals(mimeType.mSubType) ? i + 1 : i;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private String mAction;
        private String mMimeType;
        private String mUriPattern;

        public static Builder fromUriPattern(String str) {
            Builder builder = new Builder();
            builder.setUriPattern(str);
            return builder;
        }

        public static Builder fromAction(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            Builder builder = new Builder();
            builder.setAction(str);
            return builder;
        }

        public static Builder fromMimeType(String str) {
            Builder builder = new Builder();
            builder.setMimeType(str);
            return builder;
        }

        public final Builder setUriPattern(String str) {
            this.mUriPattern = str;
            return this;
        }

        public final Builder setAction(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.mAction = str;
            return this;
        }

        public final Builder setMimeType(String str) {
            this.mMimeType = str;
            return this;
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.mUriPattern, this.mAction, this.mMimeType);
        }
    }
}
