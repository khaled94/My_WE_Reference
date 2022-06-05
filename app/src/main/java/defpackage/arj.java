package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import defpackage.arj;
import defpackage.arl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: arj  reason: default package */
/* loaded from: classes.dex */
public abstract class arj<MessageType extends arj<MessageType, BuilderType>, BuilderType extends arl<MessageType, BuilderType>> implements aui {
    private static boolean zzacu = false;
    protected int zzact = 0;

    @Override // defpackage.aui
    public final art h() {
        try {
            asb d = art.d(o());
            a(d.a);
            return d.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] i() {
        try {
            byte[] bArr = new byte[o()];
            zzee a = zzee.a(bArr);
            a(a);
            a.j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public void c(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void a(Iterable<T> iterable, List<? super T> list) {
        atb.a(iterable);
        if (iterable instanceof atp) {
            List<?> i_ = ((atp) iterable).i_();
            atp atpVar = (atp) list;
            int size = list.size();
            for (Object obj : i_) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(atpVar.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = atpVar.size() - 1; size2 >= size; size2--) {
                        atpVar.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof art) {
                    atpVar.a((art) obj);
                } else {
                    atpVar.add((String) obj);
                }
            }
        } else if (iterable instanceof auu) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }
}
