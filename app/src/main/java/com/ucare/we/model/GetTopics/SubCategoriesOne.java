package com.ucare.we.model.GetTopics;

import java.util.List;

/* loaded from: classes2.dex */
public class SubCategoriesOne {
    @cqh(a = "id")
    @cqf
    public String id;
    @cqh(a = "name_ar")
    @cqf
    public String nameAr;
    @cqh(a = "name_en")
    @cqf
    public String nameEn;
    @cqh(a = "sub_categories_2")
    @cqf
    public List<SubCategoriesTwo> subCategories2 = null;

    public String toString() {
        if (new djb().f()) {
            return this.nameAr;
        }
        return this.nameEn;
    }
}
