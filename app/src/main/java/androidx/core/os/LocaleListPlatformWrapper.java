package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class LocaleListPlatformWrapper implements LocaleListInterface {
    private final LocaleList mLocaleList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocaleListPlatformWrapper(LocaleList localeList) {
        this.mLocaleList = localeList;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Object getLocaleList() {
        return this.mLocaleList;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Locale get(int i) {
        return this.mLocaleList.get(i);
    }

    @Override // androidx.core.os.LocaleListInterface
    public final boolean isEmpty() {
        return this.mLocaleList.isEmpty();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int size() {
        return this.mLocaleList.size();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int indexOf(Locale locale) {
        return this.mLocaleList.indexOf(locale);
    }

    public final boolean equals(Object obj) {
        return this.mLocaleList.equals(((LocaleListInterface) obj).getLocaleList());
    }

    public final int hashCode() {
        return this.mLocaleList.hashCode();
    }

    public final String toString() {
        return this.mLocaleList.toString();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final String toLanguageTags() {
        return this.mLocaleList.toLanguageTags();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Locale getFirstMatch(String[] strArr) {
        return this.mLocaleList.getFirstMatch(strArr);
    }
}
