package defpackage;

import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.grouppaymentrelation.FamilyPaymentRelationResponse;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\b\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\nH&¨\u0006\u000e"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManagePaymentRelationListener;", "", "onManagePaymentRelationFailure", "", "failureReason", "", "failureMessage", "", "onManagePaymentRelationSuccess", "familyPaymentRelationResponse", "Lcom/ucare/we/model/ServerResponse;", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/grouppaymentrelation/FamilyPaymentRelationResponse;", "Lkotlin/collections/ArrayList;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dex  reason: default package */
/* loaded from: classes2.dex */
public interface dex {
    void a();

    void a(ServerResponse<ArrayList<FamilyPaymentRelationResponse>> serverResponse);
}
