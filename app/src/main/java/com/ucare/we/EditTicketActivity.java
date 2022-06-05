package com.ucare.we;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ucare.we.adapters.TicketsImageListAdapter;
import com.ucare.we.model.DeviceTypes;
import com.ucare.we.model.ticket.QueryTicketResponse;
import com.ucare.we.model.ticket.TroubleTicketsResponseTypes;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class EditTicketActivity extends czy implements dhq {
    QueryTicketResponse a;
    @BindView(R.id.addImage)
    ImageView addImage;
    @Inject
    djw b;
    @BindView(R.id.btn_send_ticket)
    Button btnSendTicket;
    @Inject
    dij c;
    @Inject
    djg d;
    TicketsImageListAdapter e;
    ArrayList<Bitmap> f;
    ArrayList<String> g;
    private final int h = 4;
    private final int i = 3;
    @BindView(R.id.imagesRecyclerView)
    RecyclerView imagesRecyclerView;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.serviceNumber)
    TextView serviceNumber;
    @BindView(R.id.ticketID)
    TextView ticketID;
    @BindView(R.id.ticketStatus)
    TextView ticketStatus;
    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @Override // defpackage.dhq
    public final void a(TroubleTicketsResponseTypes troubleTicketsResponseTypes) {
    }

    @Override // defpackage.dhq
    public final void a(String str) {
    }

    @Override // defpackage.dhq
    public final void a(ArrayList<DeviceTypes> arrayList) {
    }

    @Override // defpackage.dhq
    public final void b(String str) {
    }

    @Override // defpackage.dhq
    public final void c(String str) {
    }

    @Override // defpackage.dhq
    public final void d(String str) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.edit_ticket_activity);
        ButterKnife.bind(this);
        a(getString(R.string.update_ticket), false, false);
        this.txtTitle.setText(getString(R.string.update_ticket));
        this.btnSendTicket.setAlpha(0.6f);
        this.btnSendTicket.setEnabled(false);
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.a = (QueryTicketResponse) getIntent().getParcelableExtra("TICKET");
        TextView textView = this.ticketID;
        textView.setText(getString(R.string.Ticket_id) + ":" + this.a.getRequestNo());
        this.serviceNumber.setText(this.a.getServiceNo());
        if (this.b.k().equalsIgnoreCase("ar")) {
            this.ticketStatus.setText(this.a.getStatusDescAr());
        } else {
            this.ticketStatus.setText(this.a.getStatusDescEn());
        }
        this.e = new TicketsImageListAdapter(this);
        this.c.a = this;
        this.addImage.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.EditTicketActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int checkSelfPermission = ContextCompat.checkSelfPermission(EditTicketActivity.this, "android.permission.WRITE_EXTERNAL_STORAGE");
                int checkSelfPermission2 = ContextCompat.checkSelfPermission(EditTicketActivity.this, "android.permission.READ_EXTERNAL_STORAGE");
                if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
                    EditTicketActivity.this.c();
                } else {
                    ActivityCompat.requestPermissions(EditTicketActivity.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 2);
                }
            }
        });
        this.btnSendTicket.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.EditTicketActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                djg djgVar = EditTicketActivity.this.d;
                EditTicketActivity editTicketActivity = EditTicketActivity.this;
                djgVar.a(editTicketActivity, editTicketActivity.getString(R.string.loading));
                EditTicketActivity.this.c.a(EditTicketActivity.this.g, EditTicketActivity.this.a.getRequestNo());
            }
        });
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.EditTicketActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditTicketActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String[] strArr = {getString(R.string.gallery), getString(R.string.camera)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.ucare.we.EditTicketActivity.4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    EditTicketActivity.this.startActivityForResult(intent, 3);
                } else if (i != 1) {
                } else {
                    EditTicketActivity.this.startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE"), 4);
                }
            }
        });
        builder.show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Cursor query;
        super.onActivityResult(i, i2, intent);
        String str2 = null;
        if (i == 3) {
            if (i2 != -1) {
                Toast.makeText(this, "You haven't picked Image", 1).show();
            } else {
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
                this.f.add(BitmapFactory.decodeFile(str2));
                this.g.add(str2);
                this.imagesRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
                this.imagesRecyclerView.setHasFixedSize(true);
                this.imagesRecyclerView.setAdapter(this.e);
                this.e.notifyDataSetChanged();
            }
        } else if (i == 4 && i2 == -1 && i == 4 && i2 == -1) {
            Bitmap bitmap = (Bitmap) intent.getExtras().get("data");
            Context applicationContext = getApplicationContext();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
            Uri parse = Uri.parse(MediaStore.Images.Media.insertImage(applicationContext.getContentResolver(), bitmap, "Title", (String) null));
            this.f.add(bitmap);
            ArrayList<String> arrayList = this.g;
            if (getContentResolver() == null || (query = getContentResolver().query(parse, null, null, null, null)) == null) {
                str = "";
            } else {
                query.moveToFirst();
                str = query.getString(query.getColumnIndex("_data"));
                query.close();
            }
            arrayList.add(str);
            this.imagesRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.imagesRecyclerView.setHasFixedSize(true);
            this.imagesRecyclerView.setAdapter(this.e);
            this.e.notifyDataSetChanged();
        }
        if (this.g.size() > 0) {
            this.btnSendTicket.setAlpha(1.0f);
            this.btnSendTicket.setEnabled(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 2 && iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
            c();
        }
    }

    @Override // defpackage.dhq
    public final Bitmap a(int i) {
        return this.f.get(i);
    }

    @Override // defpackage.dhq
    public final void b(int i) {
        this.f.remove(i);
        this.g.remove(i);
        this.e.notifyDataSetChanged();
        if (this.f.size() <= 0) {
            this.btnSendTicket.setAlpha(0.6f);
            this.btnSendTicket.setEnabled(false);
        }
    }

    @Override // defpackage.dhq
    public final ArrayList<Bitmap> a() {
        return this.f;
    }

    @Override // defpackage.dhq
    public final void a(String str, String str2) {
        this.d.a();
        UnNavigateResponseActivity.a(this, getString(R.string.successful), str, false);
        finish();
    }

    @Override // defpackage.dhq
    public final void b() {
        UnNavigateResponseActivity.a(this, "", getString(R.string.please_try_again), true);
    }
}
