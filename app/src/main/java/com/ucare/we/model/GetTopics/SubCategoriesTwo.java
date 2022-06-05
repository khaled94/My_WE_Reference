package com.ucare.we.model.GetTopics;

/* loaded from: classes2.dex */
public class SubCategoriesTwo {
    @cqh(a = "id")
    @cqf
    public String id;
    @cqh(a = "name_ar")
    @cqf
    public String nameAr;
    @cqh(a = "name_en")
    @cqf
    public String nameEn;

    public String toString() {
        if (new djb().f()) {
            return this.nameAr;
        }
        return this.nameEn;
    }
}
