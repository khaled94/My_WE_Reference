package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: bia  reason: default package */
/* loaded from: classes2.dex */
public interface bia extends IInterface {
    void a(Status status) throws RemoteException;

    void a(DataHolder dataHolder) throws RemoteException;

    void b(DataHolder dataHolder) throws RemoteException;

    void c(DataHolder dataHolder) throws RemoteException;

    void d(DataHolder dataHolder) throws RemoteException;
}
