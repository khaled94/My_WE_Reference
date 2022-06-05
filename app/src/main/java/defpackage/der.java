package defpackage;

import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.transferunits.TransferUnitResponse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managebundle/providers/TransferUnitsListener;", "", "onTransferUnitFailure", "", "failureReason", "", "failureMessage", "", "onTransferUnitSuccess", "response", "Lcom/ucare/we/model/ServerResponse;", "Lcom/ucare/we/model/remote/transferunits/TransferUnitResponse;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: der  reason: default package */
/* loaded from: classes2.dex */
public interface der {
    void a();

    void a(ServerResponse<TransferUnitResponse> serverResponse);
}
