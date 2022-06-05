package com.ucare.we.model.remote.faqlist;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes2.dex */
public class FaqListResponseBody {
    @cqh(a = "content")
    @cqf
    private Content content;
    @cqh(a = "id")
    @cqf
    private Integer id;
    @cqh(a = "localizedContent")
    @cqf
    private String localizedContent;
    @cqh(a = "localizedTitle")
    @cqf
    private String localizedTitle;
    @cqh(a = "order")
    @cqf
    private Integer order;
    @cqh(a = TypedValues.Attributes.S_TARGET)
    @cqf
    private String target;
    @cqh(a = "title")
    @cqf
    private Title title;
    @cqh(a = "type")
    @cqf
    private String type;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder(Integer num) {
        this.order = num;
    }

    public String getTarget() {
        return this.target;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Title getTitle() {
        return this.title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return this.content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getLocalizedTitle() {
        return this.localizedTitle;
    }

    public void setLocalizedTitle(String str) {
        this.localizedTitle = str;
    }

    public String getLocalizedContent() {
        return this.localizedContent;
    }

    public void setLocalizedContent(String str) {
        this.localizedContent = str;
    }
}
