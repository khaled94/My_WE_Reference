package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* renamed from: boz  reason: default package */
/* loaded from: classes2.dex */
public interface boz extends IInterface {
    List<buq> a(bva bvaVar, boolean z) throws RemoteException;

    List<bvd> a(String str, String str2, bva bvaVar) throws RemoteException;

    List<bvd> a(String str, String str2, String str3) throws RemoteException;

    List<buq> a(String str, String str2, String str3, boolean z) throws RemoteException;

    List<buq> a(String str, String str2, boolean z, bva bvaVar) throws RemoteException;

    void a(long j, String str, String str2, String str3) throws RemoteException;

    void a(bli bliVar, bva bvaVar) throws RemoteException;

    void a(bli bliVar, String str, String str2) throws RemoteException;

    void a(buq buqVar, bva bvaVar) throws RemoteException;

    void a(bva bvaVar) throws RemoteException;

    void a(bvd bvdVar) throws RemoteException;

    void a(bvd bvdVar, bva bvaVar) throws RemoteException;

    byte[] a(bli bliVar, String str) throws RemoteException;

    void b(bva bvaVar) throws RemoteException;

    String c(bva bvaVar) throws RemoteException;

    void d(bva bvaVar) throws RemoteException;
}
