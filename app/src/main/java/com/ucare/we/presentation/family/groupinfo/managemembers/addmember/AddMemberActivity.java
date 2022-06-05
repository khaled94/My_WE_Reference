package com.ucare.we.presentation.family.groupinfo.managemembers.addmember;

import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.ActivityCompat;
import com.ucare.we.R;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020'H\u0002J\"\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,H\u0015J\"\u0010-\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,H\u0003J\"\u0010.\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,H\u0003J\u0012\u0010/\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u001a\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0016\u00106\u001a\u00020$2\f\u00107\u001a\b\u0012\u0004\u0012\u00020508H\u0016J-\u00109\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00052\u000e\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u0002050;2\u0006\u0010<\u001a\u00020=H\u0016¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u0002052\u0006\u0010@\u001a\u000205H\u0002J\b\u0010A\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/addmember/AddMemberActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/NumbersActionsListener;", "()V", "MY_PERMISSIONS_REQUEST_IMEI", "", "PICK_CONTACT", "btnAddMember", "Landroid/widget/Button;", "btnPickContact", "etMobileNumber", "Landroid/widget/EditText;", "familyProvider", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;", "getFamilyProvider", "()Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;", "setFamilyProvider", "(Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;)V", "ibPickContact", "Landroid/widget/ImageButton;", "imgBackButton", "Landroid/widget/ImageView;", "ivMemberAvatar", "Lde/hdodenhof/circleimageview/CircleImageView;", "llNumber", "Landroidx/appcompat/widget/LinearLayoutCompat;", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "tvMemberName", "Landroid/widget/TextView;", "txtTitle", "getPermissions", "", "initViews", "isValidPhone", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onContactPickCompleted", "onContactSelectedResult", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNumbersActionFailure", "failureReason", "failureMessage", "", "onNumbersActionSuccess", "response", "Lcom/ucare/we/model/ServerResponse;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "phoneNumberWithoutCountryCode", "phoneNumberWithCountryCode", "resetError", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AddMemberActivity extends czy implements dfc {
    @Inject
    public dfb a;
    @Inject
    public djg b;
    private final int c = 1000;
    private final int d = 20;
    private ImageView e;
    private TextView f;
    private Button g;
    private ImageButton h;
    private Button i;
    private EditText j;
    private CircleImageView k;
    private TextView l;
    private LinearLayoutCompat m;

    /* renamed from: lambda$3BtRkXQ-GGh5gsQUYTz3lkVCI8U */
    public static /* synthetic */ void m46lambda$3BtRkXQGGh5gsQUYTz3lkVCI8U(AddMemberActivity addMemberActivity, View view) {
        b(addMemberActivity, view);
    }

    public static /* synthetic */ void lambda$A_RXMlXN0wfH1xFF1xbUOLq5VRs(AddMemberActivity addMemberActivity, View view) {
        a(addMemberActivity, view);
    }

    public static /* synthetic */ void lambda$IY77cmmZO5A7O8CM8kT53su5kjQ(CharSequence[] charSequenceArr, AddMemberActivity addMemberActivity, DialogInterface dialogInterface, int i) {
        a(charSequenceArr, addMemberActivity, dialogInterface, i);
    }

    /* renamed from: lambda$sTBcBSvXCT5ts-l2uQj0bPl38KI */
    public static /* synthetic */ void m47lambda$sTBcBSvXCT5tsl2uQj0bPl38KI(AddMemberActivity addMemberActivity, View view) {
        c(addMemberActivity, view);
    }

    private dfb a() {
        dfb dfbVar = this.a;
        if (dfbVar != null) {
            return dfbVar;
        }
        dqc.a("familyProvider");
        throw null;
    }

    private djg b() {
        djg djgVar = this.b;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_members);
        a(getString(R.string.familyAddMemeber), false, false);
        View findViewById = findViewById(R.id.txtTitle);
        dqc.b(findViewById, "findViewById(R.id.txtTitle)");
        this.f = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById2, "findViewById(R.id.imgBackButton)");
        this.e = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.btnPickContact);
        dqc.b(findViewById3, "findViewById(R.id.btnPickContact)");
        this.g = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.ibPickContact);
        dqc.b(findViewById4, "findViewById(R.id.ibPickContact)");
        this.h = (ImageButton) findViewById4;
        View findViewById5 = findViewById(R.id.etMobileNumber);
        dqc.b(findViewById5, "findViewById(R.id.etMobileNumber)");
        this.j = (EditText) findViewById5;
        View findViewById6 = findViewById(R.id.btnAddMember);
        dqc.b(findViewById6, "findViewById(R.id.btnAddMember)");
        this.i = (Button) findViewById6;
        View findViewById7 = findViewById(R.id.ivMemberAvatar);
        dqc.b(findViewById7, "findViewById(R.id.ivMemberAvatar)");
        this.k = (CircleImageView) findViewById7;
        View findViewById8 = findViewById(R.id.tvMemberName);
        dqc.b(findViewById8, "findViewById(R.id.tvMemberName)");
        this.l = (TextView) findViewById8;
        View findViewById9 = findViewById(R.id.llNumber);
        dqc.b(findViewById9, "findViewById(R.id.llNumber)");
        this.m = (LinearLayoutCompat) findViewById9;
        TextView textView = this.f;
        if (textView == null) {
            dqc.a("txtTitle");
            throw null;
        }
        textView.setText(R.string.familyAddMemeber);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.addmember.-$$Lambda$AddMemberActivity$sTBcBSvXCT5ts-l2uQj0bPl38KI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddMemberActivity.m47lambda$sTBcBSvXCT5tsl2uQj0bPl38KI(AddMemberActivity.this, view);
                }
            });
            ImageButton imageButton = this.h;
            if (imageButton == null) {
                dqc.a("ibPickContact");
                throw null;
            }
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.addmember.-$$Lambda$AddMemberActivity$A_RXMlXN0wfH1xFF1xbUOLq5VRs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddMemberActivity.lambda$A_RXMlXN0wfH1xFF1xbUOLq5VRs(AddMemberActivity.this, view);
                }
            });
            Button button = this.i;
            if (button == null) {
                dqc.a("btnAddMember");
                throw null;
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.addmember.-$$Lambda$AddMemberActivity$3BtRkXQ-GGh5gsQUYTz3lkVCI8U
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddMemberActivity.m46lambda$3BtRkXQGGh5gsQUYTz3lkVCI8U(AddMemberActivity.this, view);
                }
            });
            EditText editText = this.j;
            if (editText == null) {
                dqc.a("etMobileNumber");
                throw null;
            }
            if (editText.getText().toString().length() == 0) {
                Button button2 = this.i;
                if (button2 == null) {
                    dqc.a("btnAddMember");
                    throw null;
                }
                button2.setEnabled(false);
                Button button3 = this.i;
                if (button3 == null) {
                    dqc.a("btnAddMember");
                    throw null;
                }
                button3.setAlpha(0.1f);
            }
            EditText editText2 = this.j;
            if (editText2 == null) {
                dqc.a("etMobileNumber");
                throw null;
            }
            editText2.addTextChangedListener(new a());
            a().f = this;
            return;
        }
        dqc.a("imgBackButton");
        throw null;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/addmember/AddMemberActivity$onCreate$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        a() {
            AddMemberActivity.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (String.valueOf(charSequence).length() > 9) {
                Button button = AddMemberActivity.this.i;
                if (button != null) {
                    button.setEnabled(true);
                    Button button2 = AddMemberActivity.this.i;
                    if (button2 != null) {
                        button2.setAlpha(1.0f);
                        return;
                    } else {
                        dqc.a("btnAddMember");
                        throw null;
                    }
                }
                dqc.a("btnAddMember");
                throw null;
            }
            Button button3 = AddMemberActivity.this.i;
            if (button3 != null) {
                button3.setEnabled(false);
                Button button4 = AddMemberActivity.this.i;
                if (button4 != null) {
                    button4.setAlpha(0.5f);
                    return;
                } else {
                    dqc.a("btnAddMember");
                    throw null;
                }
            }
            dqc.a("btnAddMember");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        dqc.d(strArr, "permissions");
        dqc.d(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.d) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), this.c);
            } else {
                Toast.makeText(this, getString(R.string.readContactsPermission), 0).show();
            }
        }
    }

    @Override // defpackage.dfc
    public final void a(ServerResponse<String> serverResponse) {
        dqc.d(serverResponse, "response");
        b().a();
        UnNavigateResponseActivity.a(this, 0, serverResponse.getHeader().getResponseMessage(), "", false, false, false, 8009, false);
    }

    @Override // defpackage.dfc
    public final void b(int i, String str) {
        b().a();
        UnNavigateResponseActivity.a(this, i, str, getString(R.string.please_try_again), i == 3259 || i == 3239 || i == 9001 || i == 8001, false, true, 8000, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String string;
        super.onActivityResult(i, i2, intent);
        EditText editText = this.j;
        if (editText == null) {
            dqc.a("etMobileNumber");
            throw null;
        }
        editText.setError(null);
        EditText editText2 = this.j;
        if (editText2 == null) {
            dqc.a("etMobileNumber");
            throw null;
        }
        editText2.requestFocus();
        if (i == 8009) {
            if (i2 != -1) {
                return;
            }
            finish();
        } else if (i != this.c || i2 != -1) {
        } else {
            dqc.a(intent);
            Uri data = intent.getData();
            dqc.a("Got a result: ", (Object) data);
            Cursor query = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new String[]{data == null ? null : data.getLastPathSegment()}, null);
            if (query == null) {
                return;
            }
            int columnIndex = query.getColumnIndex("data1");
            int columnIndex2 = query.getColumnIndex("data2");
            String str = "";
            if (query.getCount() > 1) {
                String.valueOf(query.getCount());
                final CharSequence[] charSequenceArr = new CharSequence[query.getCount()];
                if (!query.moveToFirst()) {
                    return;
                }
                int i3 = 0;
                while (!query.isAfterLast()) {
                    if (ContactsContract.CommonDataKinds.Phone.getTypeLabel(getResources(), query.getInt(columnIndex2), str) == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String string2 = query.getString(columnIndex);
                    int i4 = i3 + 1;
                    dqc.b(string2, "number");
                    String str2 = string2;
                    StringBuilder sb = new StringBuilder();
                    int length = str2.length();
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = columnIndex;
                        char charAt = str2.charAt(i5);
                        if (!dsa.a(charAt)) {
                            sb.append(charAt);
                        }
                        i5++;
                        columnIndex = i6;
                    }
                    String sb2 = sb.toString();
                    dqc.b(sb2, "filterTo(StringBuilder(), predicate).toString()");
                    charSequenceArr[i3] = sb2;
                    query.moveToNext();
                    i3 = i4;
                    columnIndex = columnIndex;
                }
                Object[] array = dmj.e(charSequenceArr).toArray(new CharSequence[0]);
                if (array != null) {
                    CharSequence[] charSequenceArr2 = (CharSequence[]) array;
                    String.valueOf(charSequenceArr2.length);
                    if (charSequenceArr2.length > 1) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle(getString(R.string.select_contact_phone_number_and_type));
                        Object[] array2 = dmj.e(charSequenceArr).toArray(new CharSequence[0]);
                        if (array2 != null) {
                            builder.setItems((CharSequence[]) array2, new DialogInterface.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.addmember.-$$Lambda$AddMemberActivity$IY77cmmZO5A7O8CM8kT53su5kjQ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i7) {
                                    AddMemberActivity.lambda$IY77cmmZO5A7O8CM8kT53su5kjQ(charSequenceArr, this, dialogInterface, i7);
                                }
                            });
                            AlertDialog create = builder.create();
                            dqc.b(create, "builder.create()");
                            create.setOwnerActivity(this);
                            create.show();
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String str3 = (String) charSequenceArr2[0];
                    LinearLayoutCompat linearLayoutCompat = this.m;
                    if (linearLayoutCompat == null) {
                        dqc.a("llNumber");
                        throw null;
                    }
                    linearLayoutCompat.setVisibility(0);
                    TextView textView = this.l;
                    if (textView == null) {
                        dqc.a("tvMemberName");
                        throw null;
                    }
                    StringBuilder sb3 = new StringBuilder("(");
                    sb3.append((Object) (str3 == null ? null : djp.a(str3, this)));
                    sb3.append(')');
                    textView.setText(sb3.toString());
                    CircleImageView circleImageView = this.k;
                    if (circleImageView == null) {
                        dqc.a("ivMemberAvatar");
                        throw null;
                    }
                    circleImageView.setImageBitmap(str3 == null ? null : djp.b(str3, this));
                    EditText editText3 = this.j;
                    if (editText3 == null) {
                        dqc.a("etMobileNumber");
                        throw null;
                    }
                    if (str3 != null) {
                        str = str3;
                    }
                    editText3.setText(a(str));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (query.getCount() != 1) {
            } else {
                Uri data2 = intent.getData();
                ContentResolver contentResolver = getContentResolver();
                dqc.a(data2);
                Cursor query2 = contentResolver.query(data2, null, null, null, null);
                if (dqc.a(query2 == null ? null : Boolean.valueOf(query2.moveToFirst()), Boolean.TRUE)) {
                    String string3 = query2.getString(query2.getColumnIndexOrThrow("_id"));
                    dqc.b(string3, "contentCursor.getString(\n                                contentCursor.getColumnIndexOrThrow(\n                                    ContactsContract.Contacts._ID\n                                )\n                            )");
                    String string4 = query2.getString(query2.getColumnIndex("has_phone_number"));
                    dqc.b(string4, "contentCursor.getString(\n                                contentCursor.getColumnIndex(\n                                    ContactsContract.Contacts.HAS_PHONE_NUMBER\n                                )\n                            )");
                    if (dsg.b(string4, "1")) {
                        Cursor query3 = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, dqc.a("contact_id = ", (Object) string3), null, null);
                        if (query3 != null) {
                            query3.moveToFirst();
                        }
                        String a2 = (query3 == null || (string = query3.getString(query3.getColumnIndex("data1"))) == null) ? null : dsg.a(string, " ", str);
                        LinearLayoutCompat linearLayoutCompat2 = this.m;
                        if (linearLayoutCompat2 == null) {
                            dqc.a("llNumber");
                            throw null;
                        }
                        linearLayoutCompat2.setVisibility(0);
                        TextView textView2 = this.l;
                        if (textView2 == null) {
                            dqc.a("tvMemberName");
                            throw null;
                        }
                        StringBuilder sb4 = new StringBuilder("(");
                        sb4.append((Object) (a2 == null ? null : djp.a(a2, this)));
                        sb4.append(')');
                        textView2.setText(sb4.toString());
                        CircleImageView circleImageView2 = this.k;
                        if (circleImageView2 != null) {
                            circleImageView2.setImageBitmap(a2 == null ? null : djp.b(a2, this));
                            EditText editText4 = this.j;
                            if (editText4 == null) {
                                dqc.a("etMobileNumber");
                                throw null;
                            }
                            if (a2 != null) {
                                str = a2;
                            }
                            editText4.setText(a(str));
                        } else {
                            dqc.a("ivMemberAvatar");
                            throw null;
                        }
                    }
                }
                super.onActivityResult(i, i2, intent);
            }
        }
    }

    public static final void a(CharSequence[] charSequenceArr, AddMemberActivity addMemberActivity, DialogInterface dialogInterface, int i) {
        dqc.d(charSequenceArr, "$numbers");
        dqc.d(addMemberActivity, "this$0");
        String str = (String) charSequenceArr[i];
        LinearLayoutCompat linearLayoutCompat = addMemberActivity.m;
        if (linearLayoutCompat == null) {
            dqc.a("llNumber");
            throw null;
        }
        linearLayoutCompat.setVisibility(0);
        TextView textView = addMemberActivity.l;
        if (textView == null) {
            dqc.a("tvMemberName");
            throw null;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append((Object) (str == null ? null : djp.a(str, addMemberActivity)));
        sb.append(')');
        textView.setText(sb.toString());
        CircleImageView circleImageView = addMemberActivity.k;
        if (circleImageView == null) {
            dqc.a("ivMemberAvatar");
            throw null;
        }
        circleImageView.setImageBitmap(str == null ? null : djp.b(str, addMemberActivity));
        EditText editText = addMemberActivity.j;
        if (editText == null) {
            dqc.a("etMobileNumber");
            throw null;
        }
        if (str == null) {
            str = "";
        }
        editText.setText(a(str));
    }

    private static String a(String str) {
        Pattern compile = Pattern.compile("\\+(?:998|2|996|995|994|993|992|977|976|975|974|973|972|971|970|968|967|966|965|964|963|962|961|960|886|880|856|855|853|852|850|692|691|690|689|688|687|686|685|683|682|681|680|679|678|677|676|675|674|673|672|670|599|598|597|595|593|592|591|590|509|508|507|506|505|504|503|502|501|500|423|421|420|389|387|386|385|383|382|381|380|379|378|377|376|375|374|373|372|371|370|359|358|357|356|355|354|353|352|351|350|299|298|297|291|290|269|268|267|266|265|264|263|262|261|260|258|257|256|255|254|253|252|251|250|249|248|246|245|244|243|242|241|240|239|238|237|236|235|234|233|232|231|230|229|228|227|226|225|224|223|222|221|220|218|216|213|212|211|98|95|94|93|92|91|90|86|84|82|81|66|65|64|63|62|61|60|58|57|56|55|54|53|52|51|49|48|47|46|45|44\\D?1624|44\\D?1534|44\\D?1481|44|43|41|40|39|36|34|33|32|31|30|27|20|7|1\\D?939|1\\D?876|1\\D?869|1\\D?868|1\\D?849|1\\D?829|1\\D?809|1\\D?787|1\\D?784|1\\D?767|1\\D?758|1\\D?721|1\\D?684|1\\D?671|1\\D?670|1\\D?664|1\\D?649|1\\D?473|1\\D?441|1\\D?345|1\\D?340|1\\D?284|1\\D?268|1\\D?264|1\\D?246|1\\D?242|1)\\D?");
        dqc.b(compile, "compile(\n            \"\\\\+(?:998|2|996|995|994|993|992|977|976|975|974|973|972|971|970|968|967|966|965|964|963|962|961|960|886|880|856|855|853|852|850|692|691|690|689|688|687|686|685|683|682|681|680|679|678|677|676|675|674|673|672|670|599|598|597|595|593|592|591|590|509|508|507|506|505|504|503|502|501|500|423|421|420|389|387|386|385|383|382|381|380|379|378|377|376|375|374|373|372|371|370|359|358|357|356|355|354|353|352|351|350|299|298|297|291|290|269|268|267|266|265|264|263|262|261|260|258|257|256|255|254|253|252|251|250|249|248|246|245|244|243|242|241|240|239|238|237|236|235|234|233|232|231|230|229|228|227|226|225|224|223|222|221|220|218|216|213|212|211|98|95|94|93|92|91|90|86|84|82|81|66|65|64|63|62|61|60|58|57|56|55|54|53|52|51|49|48|47|46|45|44\\\\D?1624|44\\\\D?1534|44\\\\D?1481|44|43|41|40|39|36|34|33|32|31|30|27|20|7|1\\\\D?939|1\\\\D?876|1\\\\D?869|1\\\\D?868|1\\\\D?849|1\\\\D?829|1\\\\D?809|1\\\\D?787|1\\\\D?784|1\\\\D?767|1\\\\D?758|1\\\\D?721|1\\\\D?684|1\\\\D?671|1\\\\D?670|1\\\\D?664|1\\\\D?649|1\\\\D?473|1\\\\D?441|1\\\\D?345|1\\\\D?340|1\\\\D?284|1\\\\D?268|1\\\\D?264|1\\\\D?246|1\\\\D?242|1)\\\\D?\"\n        )");
        String pattern = compile.pattern();
        dqc.b(pattern, "compile.pattern()");
        return new dsf(pattern).a(str, "");
    }

    public static final void c(AddMemberActivity addMemberActivity, View view) {
        dqc.d(addMemberActivity, "this$0");
        addMemberActivity.finish();
    }

    public static final void a(AddMemberActivity addMemberActivity, View view) {
        dqc.d(addMemberActivity, "this$0");
        ActivityCompat.requestPermissions(addMemberActivity, new String[]{"android.permission.READ_CONTACTS"}, addMemberActivity.d);
    }

    public static final void b(AddMemberActivity addMemberActivity, View view) {
        dqc.d(addMemberActivity, "this$0");
        Drawable drawable = addMemberActivity.getResources().getDrawable(R.drawable.ic_error_red);
        boolean z = false;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        EditText editText = addMemberActivity.j;
        if (editText == null) {
            dqc.a("etMobileNumber");
            throw null;
        }
        if (TextUtils.isEmpty(editText.getText().toString())) {
            EditText editText2 = addMemberActivity.j;
            if (editText2 == null) {
                dqc.a("etMobileNumber");
                throw null;
            }
            editText2.setError(addMemberActivity.getResources().getString(R.string.no_mobile_number), drawable);
            EditText editText3 = addMemberActivity.j;
            if (editText3 == null) {
                dqc.a("etMobileNumber");
                throw null;
            }
            editText3.requestFocus();
        } else {
            EditText editText4 = addMemberActivity.j;
            if (editText4 == null) {
                dqc.a("etMobileNumber");
                throw null;
            }
            if (!dsg.c(editText4.getText().toString(), "027")) {
                EditText editText5 = addMemberActivity.j;
                if (editText5 == null) {
                    dqc.a("etMobileNumber");
                    throw null;
                } else if (editText5.getText().toString().length() < addMemberActivity.getResources().getInteger(R.integer.mobile_number)) {
                    EditText editText6 = addMemberActivity.j;
                    if (editText6 != null) {
                        editText6.setError(addMemberActivity.getResources().getString(R.string.default_service_number_validation), drawable);
                        EditText editText7 = addMemberActivity.j;
                        if (editText7 == null) {
                            dqc.a("etMobileNumber");
                            throw null;
                        }
                        editText7.requestFocus();
                    } else {
                        dqc.a("etMobileNumber");
                        throw null;
                    }
                }
            }
            EditText editText8 = addMemberActivity.j;
            if (editText8 == null) {
                dqc.a("etMobileNumber");
                throw null;
            }
            String obj = editText8.getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = obj.substring(0, 1);
            dqc.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (!dsg.b(substring, "0")) {
                EditText editText9 = addMemberActivity.j;
                if (editText9 == null) {
                    dqc.a("etMobileNumber");
                    throw null;
                }
                String obj2 = editText9.getText().toString();
                if (obj2 != null) {
                    String substring2 = obj2.substring(0, 1);
                    dqc.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (!dsg.b(substring2, "٠")) {
                        EditText editText10 = addMemberActivity.j;
                        if (editText10 != null) {
                            editText10.setError(addMemberActivity.getResources().getString(R.string.add_account_number_validation), drawable);
                            EditText editText11 = addMemberActivity.j;
                            if (editText11 == null) {
                                dqc.a("etMobileNumber");
                                throw null;
                            }
                            editText11.requestFocus();
                        } else {
                            dqc.a("etMobileNumber");
                            throw null;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            z = true;
        }
        if (!z) {
            return;
        }
        addMemberActivity.b().a(addMemberActivity, addMemberActivity.getString(R.string.loading));
        dfb a2 = addMemberActivity.a();
        EditText editText12 = addMemberActivity.j;
        if (editText12 != null) {
            a2.a("add", editText12.getText().toString());
        } else {
            dqc.a("etMobileNumber");
            throw null;
        }
    }
}
