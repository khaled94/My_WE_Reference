package com.ucare.we.model.TroubleTicket;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TroubleTicketResponse {
    @cqh(a = "ticket_status_SR")
    ArrayList<TroubleTicketResponseBody> troubleTicketResponseBodyArrayList;

    public ArrayList<TroubleTicketResponseBody> getTroubleTicketResponseBodyArrayList() {
        return this.troubleTicketResponseBodyArrayList;
    }

    public void setTroubleTicketResponseBodyArrayList(ArrayList<TroubleTicketResponseBody> arrayList) {
        this.troubleTicketResponseBodyArrayList = arrayList;
    }
}
