package defpackage;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogFragment;
import com.ucare.we.QueryTicketActivity;
import java.util.Calendar;

/* renamed from: czb  reason: default package */
/* loaded from: classes2.dex */
public class czb extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    dif a;
    String b;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.a = (QueryTicketActivity) getActivity();
        this.b = getArguments().getString("PICKER_TYPE");
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), this, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(calendar.getTimeInMillis());
        return datePickerDialog;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = i2 + 1;
        if (this.b.equals("TO_PICKER")) {
            dif difVar = this.a;
            difVar.b(i + "-" + i4 + "-" + i3);
        } else if (!this.b.equals("FROM_PICKER")) {
        } else {
            dif difVar2 = this.a;
            difVar2.a(i + "-" + i4 + "-" + i3);
        }
    }
}
