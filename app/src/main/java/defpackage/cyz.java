package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.StoreLocatorByCity.StoresByIDResponse;
import com.ucare.we.model.StoreResponseBody;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: cyz  reason: default package */
/* loaded from: classes2.dex */
public final class cyz {
    Context a;
    cza b;
    au.b<JSONArray> c = new au.b<JSONArray>() { // from class: cyz.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONArray jSONArray) {
            cyz.this.b.c();
            ArrayList arrayList = (ArrayList) new Gson().a(String.valueOf(jSONArray), new crb<List<StoresByIDResponse>>() { // from class: cyz.1.1
            }.b);
            ArrayList<StoreResponseBody> arrayList2 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                StoreResponseBody storeResponseBody = new StoreResponseBody();
                storeResponseBody.setArBranchAddress(((StoresByIDResponse) arrayList.get(i)).getArabicAddress());
                storeResponseBody.setEnBranchAddress(((StoresByIDResponse) arrayList.get(i)).getEnglishAddress());
                storeResponseBody.setArBranchName(((StoresByIDResponse) arrayList.get(i)).getArabicName());
                storeResponseBody.setEnBranchName(((StoresByIDResponse) arrayList.get(i)).getEnglishName());
                if (!TextUtils.isEmpty(((StoresByIDResponse) arrayList.get(i)).getLatitude())) {
                    storeResponseBody.setLatitude(Double.valueOf(((StoresByIDResponse) arrayList.get(i)).getLatitude()).doubleValue());
                }
                if (!TextUtils.isEmpty(((StoresByIDResponse) arrayList.get(i)).getLongitude())) {
                    storeResponseBody.setLongitude(Double.valueOf(((StoresByIDResponse) arrayList.get(i)).getLongitude()).doubleValue());
                }
                storeResponseBody.setBranchId(((StoresByIDResponse) arrayList.get(i)).getStoreId());
                arrayList2.add(storeResponseBody);
            }
            cyz.this.b.a(arrayList2);
        }
    };
    au.a d = new au.a() { // from class: cyz.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyz.this.b.c();
            cyz.this.b.a();
        }
    };

    public cyz(Context context, cza czaVar) {
        this.a = context;
        this.b = czaVar;
    }
}
