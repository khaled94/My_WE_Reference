package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: acx  reason: default package */
/* loaded from: classes.dex */
public final class acx implements Parcelable.Creator<aah> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aah createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        uw[] uwVarArr = null;
        uw[] uwVarArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    i2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.h(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.c(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.g(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.a(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
                case '\n':
                    uwVarArr = (uw[]) SafeParcelReader.c(parcel, readInt, uw.CREATOR);
                    break;
                case 11:
                    uwVarArr2 = (uw[]) SafeParcelReader.c(parcel, readInt, uw.CREATOR);
                    break;
                case '\f':
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\r':
                    i4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 14:
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 15:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new aah(i, i2, i3, str, iBinder, scopeArr, bundle, account, uwVarArr, uwVarArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aah[] newArray(int i) {
        return new aah[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(aah aahVar, Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, aahVar.a);
        abc.a(parcel, 2, aahVar.b);
        abc.a(parcel, 3, aahVar.c);
        abc.a(parcel, 4, aahVar.d);
        abc.a(parcel, 5, aahVar.e);
        abc.a(parcel, 6, aahVar.f, i);
        abc.a(parcel, 7, aahVar.g);
        abc.a(parcel, 8, aahVar.h, i);
        abc.a(parcel, 10, aahVar.i, i);
        abc.a(parcel, 11, aahVar.j, i);
        abc.a(parcel, 12, aahVar.k);
        abc.a(parcel, 13, aahVar.l);
        abc.a(parcel, 14, aahVar.m);
        abc.a(parcel, 15, aahVar.n);
        abc.b(parcel, a);
    }
}
