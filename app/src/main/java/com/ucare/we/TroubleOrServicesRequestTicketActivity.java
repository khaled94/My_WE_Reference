package com.ucare.we;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.adapters.TicketsImageListAdapter;
import com.ucare.we.model.DeviceTypes;
import com.ucare.we.model.ticket.Category;
import com.ucare.we.model.ticket.SubmitTicketRequest;
import com.ucare.we.model.ticket.TroubleTicketsResponseTypes;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class TroubleOrServicesRequestTicketActivity extends czy implements dhq {
    private static final String o = TroubleOrServicesRequestTicketActivity.class.getSimpleName();
    @Inject
    djg a;
    @BindView(R.id.addImage)
    ImageView addImage;
    @BindView(R.id.address)
    EditText address;
    @Inject
    dij b;
    @BindView(R.id.btn_send_ticket)
    Button btnSendTicket;
    @Inject
    djw c;
    @BindView(R.id.contactEmailEditText)
    TextInputEditText contactEmailEditText;
    @BindView(R.id.contactNumber)
    TextInputEditText contactNumber;
    @Inject
    dio d;
    ArrayList<Category> e;
    TroubleOrServicesRequestTicketActivity h;
    ArrayList<Bitmap> i;
    @BindView(R.id.imagesRecyclerView)
    RecyclerView imagesRecyclerView;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    ArrayList<String> j;
    TicketsImageListAdapter k;
    Intent l;
    String m;
    String n;
    @BindView(R.id.reasonTypeHint)
    TextView reasonTypeHintTextView;
    @BindView(R.id.troubleDescriptionEditText)
    EditText troubleDescriptionEditText;
    @BindView(R.id.troubleType)
    TextView troubleType;
    @BindView(R.id.troubleTypeLinearLayout)
    LinearLayout troubleTypeLinearLayout;
    @BindView(R.id.til_email)
    TextInputLayout txtInputEmail;
    @BindView(R.id.til_number)
    TextInputLayout txtInputNumber;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    private final int p = 4;
    private final int q = 3;
    private final TextWatcher r = new TextWatcher() { // from class: com.ucare.we.TroubleOrServicesRequestTicketActivity.1
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        {
            TroubleOrServicesRequestTicketActivity.this = this;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (TroubleOrServicesRequestTicketActivity.this.troubleDescriptionEditText.getText().toString().length() == 0 || TroubleOrServicesRequestTicketActivity.this.troubleDescriptionEditText.getText().toString().length() == 0 || TroubleOrServicesRequestTicketActivity.this.contactEmailEditText.getText().toString().length() == 0 || TroubleOrServicesRequestTicketActivity.this.contactNumber.toString().trim().length() == 0 || TroubleOrServicesRequestTicketActivity.this.troubleType.getText().equals(TroubleOrServicesRequestTicketActivity.this.getString(R.string.not_set))) {
                TroubleOrServicesRequestTicketActivity.this.btnSendTicket.setAlpha(0.6f);
                TroubleOrServicesRequestTicketActivity.this.btnSendTicket.setEnabled(false);
                return;
            }
            TroubleOrServicesRequestTicketActivity.this.btnSendTicket.setAlpha(1.0f);
            TroubleOrServicesRequestTicketActivity.this.btnSendTicket.setEnabled(true);
        }
    };
    String f = "";
    String g = "";

    public static /* synthetic */ void lambda$Q5eY4JY5_3GBOSIHm4_SZ6FwcFQ(TroubleOrServicesRequestTicketActivity troubleOrServicesRequestTicketActivity, View view, boolean z) {
        troubleOrServicesRequestTicketActivity.b(view, z);
    }

    public static /* synthetic */ void lambda$jDnnCc1e1E2CEKi9fVoJB6UCgHA(TroubleOrServicesRequestTicketActivity troubleOrServicesRequestTicketActivity, View view, boolean z) {
        troubleOrServicesRequestTicketActivity.a(view, z);
    }

    public static /* synthetic */ void lambda$tHZ1X1YRBrUImbIWdfe8awCPYX0(TroubleOrServicesRequestTicketActivity troubleOrServicesRequestTicketActivity, View view) {
        troubleOrServicesRequestTicketActivity.a(view);
    }

    @Override // defpackage.dhq
    public final void a(ArrayList<DeviceTypes> arrayList) {
    }

    @Override // defpackage.dhq
    public final void d(String str) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.trouble_ticket_activity);
        ButterKnife.bind(this);
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.h = this;
        this.txtTitle.setText(getString(R.string.trouble_ticket));
        a(getString(R.string.trouble_ticket), false, false);
        this.btnSendTicket.setAlpha(0.6f);
        this.btnSendTicket.setEnabled(false);
        this.b.a = this;
        Intent intent = getIntent();
        this.l = intent;
        this.m = intent.getExtras().getString("TROUBLE_TICKET_ACTIVITY_KEY");
        this.a.a(this, getString(R.string.loading));
        this.b.a();
        if (this.m.equals("SERVICE_TICKET")) {
            this.txtTitle.setText(R.string.new_request);
            a(getString(R.string.new_request), false, false);
            this.troubleDescriptionEditText.setHint(R.string.trouble_description);
            this.reasonTypeHintTextView.setText(R.string.request_type);
            this.n = getString(R.string.request_type);
        } else {
            this.n = getString(R.string.trouble_type);
        }
        this.k = new TicketsImageListAdapter(this);
        this.imagesRecyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.imagesRecyclerView.setAdapter(this.k);
        this.troubleDescriptionEditText.addTextChangedListener(this.r);
        this.address.addTextChangedListener(this.r);
        this.contactNumber.addTextChangedListener(this.r);
        this.contactNumber.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.-$$Lambda$TroubleOrServicesRequestTicketActivity$Q5eY4JY5_3GBOSIHm4_SZ6FwcFQ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                TroubleOrServicesRequestTicketActivity.lambda$Q5eY4JY5_3GBOSIHm4_SZ6FwcFQ(TroubleOrServicesRequestTicketActivity.this, view, z);
            }
        });
        this.contactEmailEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.-$$Lambda$TroubleOrServicesRequestTicketActivity$jDnnCc1e1E2CEKi9fVoJB6UCgHA
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                TroubleOrServicesRequestTicketActivity.lambda$jDnnCc1e1E2CEKi9fVoJB6UCgHA(TroubleOrServicesRequestTicketActivity.this, view, z);
            }
        });
        this.contactEmailEditText.addTextChangedListener(this.r);
        this.troubleType.addTextChangedListener(this.r);
        this.troubleTypeLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.TroubleOrServicesRequestTicketActivity.2
            {
                TroubleOrServicesRequestTicketActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent2 = new Intent(TroubleOrServicesRequestTicketActivity.this, TroubleTicketSelectTypeActivity.class);
                intent2.putParcelableArrayListExtra("TROUBLE_TYPES_LIST", TroubleOrServicesRequestTicketActivity.this.e);
                intent2.putExtra("TROUBLE_TYPE", TroubleOrServicesRequestTicketActivity.this.f);
                intent2.putExtra("TOOL_BAR_TITLE", TroubleOrServicesRequestTicketActivity.this.n);
                TroubleOrServicesRequestTicketActivity.this.startActivityForResult(intent2, 1);
            }
        });
        this.btnSendTicket.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$TroubleOrServicesRequestTicketActivity$tHZ1X1YRBrUImbIWdfe8awCPYX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TroubleOrServicesRequestTicketActivity.lambda$tHZ1X1YRBrUImbIWdfe8awCPYX0(TroubleOrServicesRequestTicketActivity.this, view);
            }
        });
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.TroubleOrServicesRequestTicketActivity.3
            {
                TroubleOrServicesRequestTicketActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TroubleOrServicesRequestTicketActivity.this.finish();
                djm.a((Activity) TroubleOrServicesRequestTicketActivity.this);
            }
        });
        this.addImage.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.TroubleOrServicesRequestTicketActivity.4
            {
                TroubleOrServicesRequestTicketActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int checkSelfPermission = ContextCompat.checkSelfPermission(TroubleOrServicesRequestTicketActivity.this, "android.permission.WRITE_EXTERNAL_STORAGE");
                int checkSelfPermission2 = ContextCompat.checkSelfPermission(TroubleOrServicesRequestTicketActivity.this, "android.permission.READ_EXTERNAL_STORAGE");
                if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
                    TroubleOrServicesRequestTicketActivity.this.c();
                } else {
                    ActivityCompat.requestPermissions(TroubleOrServicesRequestTicketActivity.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 2);
                }
            }
        });
    }

    public /* synthetic */ void b(View view, boolean z) {
        if (!z) {
            d();
            return;
        }
        this.txtInputNumber.setErrorEnabled(false);
        this.txtInputNumber.setError(null);
        c(this.contactNumber);
    }

    public /* synthetic */ void a(View view, boolean z) {
        if (!z) {
            e();
            return;
        }
        this.txtInputEmail.setErrorEnabled(false);
        this.txtInputEmail.setError(null);
        c(this.contactEmailEditText);
    }

    public /* synthetic */ void a(View view) {
        if (!d() || !e()) {
            return;
        }
        this.a.a(this, getString(R.string.loading));
        SubmitTicketRequest submitTicketRequest = new SubmitTicketRequest();
        submitTicketRequest.setContactMsisdn(this.contactNumber.getText().toString());
        submitTicketRequest.setDescription(this.troubleDescriptionEditText.getText().toString());
        submitTicketRequest.setMsisdn(this.c.m());
        submitTicketRequest.setEmail(this.contactEmailEditText.getText().toString());
        submitTicketRequest.setType(this.g);
        String u = this.c.u();
        if (!TextUtils.isEmpty(u)) {
            String[] split = u.split("\\s+");
            for (int i = 0; i < split.length; i++) {
                if (i == 0) {
                    submitTicketRequest.setFirstName(split[i]);
                } else if (i != 1) {
                    if (i == 2) {
                        submitTicketRequest.setLastName(split[i]);
                    }
                } else if (split.length > 2) {
                    submitTicketRequest.setMiddleName(split[i]);
                } else {
                    submitTicketRequest.setLastName(split[i]);
                }
            }
        }
        this.b.a(submitTicketRequest);
    }

    public void c() {
        String[] strArr = {getString(R.string.gallery), getString(R.string.camera)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.ucare.we.TroubleOrServicesRequestTicketActivity.5
            {
                TroubleOrServicesRequestTicketActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    TroubleOrServicesRequestTicketActivity.this.startActivityForResult(intent, 3);
                } else if (i != 1) {
                } else {
                    TroubleOrServicesRequestTicketActivity.this.startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE"), 4);
                }
            }
        });
        builder.show();
    }

    @Override // defpackage.dhq
    public final void a(String str) {
        this.a.a();
        if (this.j.size() > 0) {
            this.b.a(this.j, str);
            return;
        }
        String string = getString(R.string.successfully);
        UnNavigateResponseActivity.a(this, string, getString(R.string.your_request_has_been_submitted_successfully) + "\n" + getString(R.string.ticket_numbet) + ": " + str, false);
        finish();
    }

    @Override // defpackage.dhq
    public final void b(String str) {
        this.a.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dhq
    public final void a(TroubleTicketsResponseTypes troubleTicketsResponseTypes) {
        this.a.a();
        if (this.m.equals("SERVICE_TICKET")) {
            if (this.d.g()) {
                this.e = troubleTicketsResponseTypes.getBroadbandServiceRequest();
            } else {
                this.e = troubleTicketsResponseTypes.getMobileServiceRequest();
            }
        } else if (this.d.g()) {
            this.e = troubleTicketsResponseTypes.getADSLCategories();
        } else if (!this.d.f()) {
        } else {
            this.e = troubleTicketsResponseTypes.getMobileCategories();
        }
    }

    @Override // defpackage.dhq
    public final void c(String str) {
        this.a.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dhq
    public final Bitmap a(int i) {
        return this.i.get(i);
    }

    @Override // defpackage.dhq
    public final void b(int i) {
        this.i.remove(i);
        this.j.remove(i);
        this.k.notifyDataSetChanged();
    }

    @Override // defpackage.dhq
    public final ArrayList<Bitmap> a() {
        return this.i;
    }

    @Override // defpackage.dhq
    public final void a(String str, String str2) {
        String string = getString(R.string.successfully);
        UnNavigateResponseActivity.a(this, string, getString(R.string.your_request_has_been_submitted_successfully) + "\n" + getString(R.string.ticket_numbet) + ": " + str2, false);
        finish();
    }

    @Override // defpackage.dhq
    public final void b() {
        this.troubleTypeLinearLayout.setEnabled(false);
        this.troubleType.setEnabled(false);
        this.troubleTypeLinearLayout.setClickable(false);
        this.troubleType.setClickable(false);
        this.troubleDescriptionEditText.setEnabled(false);
        this.contactNumber.setEnabled(false);
        this.contactEmailEditText.setEnabled(false);
        UnNavigateResponseActivity.a(this, "", getString(R.string.please_try_again), true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Cursor query;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && intent != null) {
            String stringExtra = intent.getStringExtra("TROUBLE_TYPE");
            this.f = stringExtra;
            if (stringExtra.isEmpty()) {
                return;
            }
            this.troubleType.setText(this.f);
            this.g = intent.getStringExtra("TROUBLE_ID");
            return;
        }
        String str2 = null;
        if (i == 3) {
            if (i2 != -1) {
                Toast.makeText(this, "You haven't picked Image", 1).show();
                return;
            }
            String[] strArr = {"_data"};
            Cursor query2 = getApplicationContext().getContentResolver().query(intent.getData(), strArr, null, null, null);
            if (query2 != null) {
                if (query2.moveToFirst()) {
                    str2 = query2.getString(query2.getColumnIndexOrThrow(strArr[0]));
                }
                query2.close();
            }
            if (str2 == null) {
                str2 = "Not found";
            }
            this.i.add(BitmapFactory.decodeFile(str2));
            this.j.add(str2);
            this.k.notifyDataSetChanged();
        } else if (i != 4 || i2 != -1 || i != 4 || i2 != -1) {
        } else {
            Bitmap bitmap = (Bitmap) intent.getExtras().get("data");
            Context applicationContext = getApplicationContext();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
            Uri parse = Uri.parse(MediaStore.Images.Media.insertImage(applicationContext.getContentResolver(), bitmap, "Title", (String) null));
            this.i.add(bitmap);
            ArrayList<String> arrayList = this.j;
            if (getContentResolver() == null || (query = getContentResolver().query(parse, null, null, null, null)) == null) {
                str = "";
            } else {
                query.moveToFirst();
                str = query.getString(query.getColumnIndex("_data"));
                query.close();
            }
            arrayList.add(str);
            this.k.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 2 && iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
            c();
        }
    }

    private boolean d() {
        if (TextUtils.isEmpty(this.contactNumber.getText().toString())) {
            this.txtInputNumber.setError(getResources().getString(R.string.no_mobile_number));
            a(this.contactNumber);
            return false;
        } else if (!this.contactNumber.getText().toString().startsWith("027") && this.contactNumber.getText().toString().length() < getResources().getInteger(R.integer.mobile_number)) {
            this.txtInputNumber.setError(getResources().getString(R.string.default_service_number_validation));
            a(this.contactNumber);
            return false;
        } else if (!this.contactNumber.getText().toString().substring(0, 1).equals("0") && !this.contactNumber.getText().toString().substring(0, 1).equals("٠")) {
            this.txtInputNumber.setError(getResources().getString(R.string.add_account_number_validation));
            a(this.contactNumber);
            return false;
        } else {
            b(this.contactNumber);
            this.txtInputNumber.setError(null);
            return true;
        }
    }

    private boolean e() {
        if (TextUtils.isEmpty(this.contactEmailEditText.getText().toString())) {
            this.txtInputEmail.setError(getResources().getString(R.string.valid_mail));
            a(this.contactEmailEditText);
            return false;
        } else if (!djm.c(this.contactEmailEditText.getText().toString())) {
            this.txtInputEmail.setError(getResources().getString(R.string.valid_mail));
            a(this.contactEmailEditText);
            return false;
        } else {
            b(this.contactEmailEditText);
            this.txtInputEmail.setError(null);
            return true;
        }
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void b(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void c(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_focused));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }
}
