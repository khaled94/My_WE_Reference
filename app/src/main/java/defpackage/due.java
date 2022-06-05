package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0087\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\\\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u0002H\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0087\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "(Ljava/lang/String;I)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "invoke", "", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: due  reason: default package */
/* loaded from: classes2.dex */
public enum due {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: due$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[due.values().length];
            iArr[due.DEFAULT.ordinal()] = 1;
            iArr[due.ATOMIC.ordinal()] = 2;
            iArr[due.UNDISPATCHED.ordinal()] = 3;
            iArr[due.LAZY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(dow<? super dnu<? super T>, ? extends Object> dowVar, dnu<? super T> dnuVar) {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            try {
                dnu a2 = dnz.a(dnz.a(dowVar, dnuVar));
                dmb.a aVar = dmb.a;
                dyg.a(a2, dmb.d(dmg.a));
            } catch (Throwable th) {
                dzi.a(dnuVar, th);
            }
        } else if (i == 2) {
            dqc.d(dowVar, "$this$startCoroutine");
            dqc.d(dnuVar, "completion");
            dnu a3 = dnz.a(dnz.a(dowVar, dnuVar));
            dmg dmgVar = dmg.a;
            dmb.a aVar2 = dmb.a;
            a3.resumeWith(dmb.d(dmgVar));
        } else if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            dqc.d(dnuVar, "completion");
            try {
                dnw context = dnuVar.getContext();
                Object a4 = dzc.a(context, null);
                if (dowVar != null) {
                    Object invoke = ((dow) dqj.a(dowVar, 1)).invoke(dnuVar);
                    dzc.b(context, a4);
                    if (invoke == dny.COROUTINE_SUSPENDED) {
                        return;
                    }
                    dmb.a aVar3 = dmb.a;
                    dnuVar.resumeWith(dmb.d(invoke));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } catch (Throwable th2) {
                dmb.a aVar4 = dmb.a;
                dnuVar.resumeWith(dmb.d(dmc.a(th2)));
            }
        }
    }

    public final <R, T> void invoke(dph<? super R, ? super dnu<? super T>, ? extends Object> dphVar, R r, dnu<? super T> dnuVar) {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            dzi.a(dphVar, r, dnuVar);
        } else if (i == 2) {
            dqc.d(dphVar, "$this$startCoroutine");
            dqc.d(dnuVar, "completion");
            dnu a2 = dnz.a(dnz.a(dphVar, r, dnuVar));
            dmg dmgVar = dmg.a;
            dmb.a aVar = dmb.a;
            a2.resumeWith(dmb.d(dmgVar));
        } else if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            dqc.d(dnuVar, "completion");
            try {
                dnw context = dnuVar.getContext();
                Object a3 = dzc.a(context, null);
                if (dphVar != null) {
                    Object invoke = ((dph) dqj.a(dphVar, 2)).invoke(r, dnuVar);
                    dzc.b(context, a3);
                    if (invoke == dny.COROUTINE_SUSPENDED) {
                        return;
                    }
                    dmb.a aVar2 = dmb.a;
                    dnuVar.resumeWith(dmb.d(invoke));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } catch (Throwable th) {
                dmb.a aVar3 = dmb.a;
                dnuVar.resumeWith(dmb.d(dmc.a(th)));
            }
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
