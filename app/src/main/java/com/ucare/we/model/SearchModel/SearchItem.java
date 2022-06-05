package com.ucare.we.model.SearchModel;

import android.content.Context;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class SearchItem {
    Context context;
    String itemName;
    String itemTag;

    public SearchItem(String str, Context context) {
        this.itemName = str;
        this.context = context;
        initializeTags();
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String str) {
        this.itemName = str;
    }

    public String getItemTag() {
        return this.itemTag;
    }

    public void setItemTag(String str) {
        this.itemTag = str;
    }

    public void initializeTags() {
        if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.plans_and_services))) {
            this.itemTag = this.context.getString(R.string.plans_and_services_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.change_plan))) {
            this.itemTag = this.context.getString(R.string.change_plan_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.offers_and_extras))) {
            this.itemTag = this.context.getString(R.string.offers_and_extras_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.anonymous_recharge))) {
            this.itemTag = this.context.getString(R.string.anonymous_recharge_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.anonymous_adsl_payment))) {
            this.itemTag = this.context.getString(R.string.anonymous_ADSL_payment_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.account_managment))) {
            this.itemTag = this.context.getString(R.string.account_management_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.profile))) {
            this.itemTag = this.context.getString(R.string.profile_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.offering_usage))) {
            this.itemTag = this.context.getString(R.string.usage_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.balance_transfer))) {
            this.itemTag = this.context.getString(R.string.balance_transfer_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.auto_recharge))) {
            this.itemTag = this.context.getString(R.string.auto_recharge);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.recharge_Payment))) {
            this.itemTag = this.context.getString(R.string.recharge_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.balance_details))) {
            this.itemTag = this.context.getString(R.string.balance_details_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.favorite_numbers))) {
            this.itemTag = this.context.getString(R.string.favorite_numbers_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.payment_history))) {
            this.itemTag = this.context.getString(R.string.payment_history_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.auto_pay))) {
            this.itemTag = this.context.getString(R.string.auto_pay_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.payment))) {
            this.itemTag = this.context.getString(R.string.bill_payment_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.bill_limit))) {
            this.itemTag = this.context.getString(R.string.bill_limit_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.bill_summary))) {
            this.itemTag = this.context.getString(R.string.bill_summary_tag);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.Suspend_resume_service))) {
            this.itemTag = this.context.getString(R.string.Suspend_resume_service);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.balance_transfer_history))) {
            this.itemTag = this.context.getString(R.string.Suspend_resume_service);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.quota_transfer))) {
            this.itemTag = this.context.getString(R.string.quota_transfer);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.submit_service_ticket))) {
            this.itemTag = this.context.getString(R.string.submit_service_ticket);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.submit_trouble_ticket))) {
            this.itemTag = this.context.getString(R.string.submit_trouble_ticket);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.query_request))) {
            this.itemTag = this.context.getString(R.string.query_request);
        } else if (this.itemName.equalsIgnoreCase(this.context.getString(R.string.request_adsl_username_password))) {
            this.itemTag = this.context.getString(R.string.request_adsl_username_password);
        } else if (!this.itemName.equalsIgnoreCase(this.context.getString(R.string.request_device))) {
        } else {
            this.itemTag = this.context.getString(R.string.request_device);
        }
    }
}
