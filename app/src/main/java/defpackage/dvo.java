package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import defpackage.dnw;
import defpackage.dvi;
import defpackage.dyn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00020\u007f2\u00030Ã\u0001:\u0006Ò\u0001Ó\u0001Ô\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010Z\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0004¢\u0006\u0004\bZ\u0010[JF\u0010d\u001a\u00020c2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00012'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010eJ6\u0010d\u001a\u00020c2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010fJ\u0013\u0010g\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\bg\u0010\u001dJ\u000f\u0010h\u001a\u00020\u0001H\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\bj\u0010\u001dJ&\u0010m\u001a\u00020l2\u0014\u0010k\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110^H\u0082\b¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bo\u0010-J\u0019\u0010q\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bp\u0010(J\u001b\u0010s\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\br\u0010-J@\u0010t\u001a\u00020\t2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a2\u0006\u0010\\\u001a\u00020\u0001H\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010w\u001a\u00020/H\u0010¢\u0006\u0004\bv\u00101J\u001f\u0010x\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\bx\u0010yJ.\u0010{\u001a\u00020\u0011\"\n\b\u0000\u0010z\u0018\u0001*\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0082\b¢\u0006\u0004\b{\u0010yJ\u0019\u0010\\\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\\\u0010+J\u0019\u0010|\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b|\u0010\u0016J\u000f\u0010}\u001a\u00020\u0011H\u0014¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0081\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JI\u0010\u008c\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u00012\u001d\u0010k\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050^ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001JX\u0010\u0091\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001JX\u0010\u0095\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0090\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0096\u0001\u0010iJ\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u009c\u0001\u00101J\u0011\u0010\u009d\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u009d\u0001\u00101J$\u0010\u009e\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\"\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J(\u0010¢\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J&\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J-\u0010¦\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0082\u0010¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010©\u0001\u001a\u0004\u0018\u000108*\u00030¨\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001f\u0010«\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b«\u0001\u0010yJ&\u0010¬\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020X0®\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010³\u0001\u001a\u0004\u0018\u00010\r8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010OR\u0016\u0010µ\u0001\u001a\u00020\u00018DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010iR\u0016\u0010·\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010iR\u0016\u0010¸\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010iR\u0013\u0010¹\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010iR\u0013\u0010º\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010iR\u0013\u0010»\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010iR\u0016\u0010¼\u0001\u001a\u00020\u00018TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010iR\u0019\u0010À\u0001\u001a\u0007\u0012\u0002\b\u00030½\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010Â\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010iR\u0015\u0010Æ\u0001\u001a\u00030Ã\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R.\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010LR\u001e\u0010Ï\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010>R\u001b\u0010Ð\u0001\u001a\u00020\u0001*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Õ\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "", "active", "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", "", "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJob", "(Lkotlinx/coroutines/Job;)V", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", ExifInterface.GPS_DIRECTION_TRUE, "notifyHandlers", "onCompletionInternal", "onStart", "()V", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", "", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dvo  reason: default package */
/* loaded from: classes2.dex */
public class dvo implements dtn, dvi, dvv {
    static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(dvo.class, Object.class, "_state");
    public volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    protected void a(Object obj) {
    }

    public boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String c() {
        return "Job was cancelled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(Object obj) {
    }

    protected boolean e() {
        return false;
    }

    protected boolean e(Throwable th) {
        return false;
    }

    public boolean f() {
        return true;
    }

    protected void k() {
    }

    public dvo(boolean z) {
        this._state = z ? dvp.g : dvp.f;
        this._parentHandle = null;
    }

    @Override // defpackage.dnw
    public <R> R fold(R r, dph<? super R, ? super dnw.b, ? extends R> dphVar) {
        return (R) dnw.b.a.a(this, r, dphVar);
    }

    @Override // defpackage.dnw.b, defpackage.dnw
    public <E extends dnw.b> E get(dnw.c<E> cVar) {
        return (E) dnw.b.a.a(this, cVar);
    }

    @Override // defpackage.dnw
    public dnw minusKey(dnw.c<?> cVar) {
        return dnw.b.a.b(this, cVar);
    }

    @Override // defpackage.dnw
    public dnw plus(dnw dnwVar) {
        return dnw.b.a.a(this, dnwVar);
    }

    @Override // defpackage.dnw.b
    public final dnw.c<?> getKey() {
        return dvi.b;
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dvo$c */
    /* loaded from: classes2.dex */
    public static final class c extends dyn.a {
        final /* synthetic */ dyn a;
        final /* synthetic */ dvo b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(dyn dynVar, dvo dvoVar, Object obj) {
            super(dynVar);
            this.a = dynVar;
            this.b = dvoVar;
            this.c = obj;
        }

        @Override // defpackage.dyc
        public final /* synthetic */ Object a() {
            if (this.b.i() == this.c) {
                return null;
            }
            return dym.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(dvi dviVar) {
        if (dug.a()) {
            if (!(((dtl) this._parentHandle) == null)) {
                throw new AssertionError();
            }
        }
        if (dviVar != null) {
            dviVar.h();
            dtl a2 = dviVar.a(this);
            this._parentHandle = a2;
            if (!j()) {
                return;
            }
            a2.dispose();
            this._parentHandle = dvt.a;
            return;
        }
        this._parentHandle = dvt.a;
    }

    @Override // defpackage.dvi
    public boolean a() {
        Object i = i();
        return (i instanceof dvd) && ((dvd) i).w_();
    }

    public final boolean j() {
        return !(i() instanceof dvd);
    }

    private final Object a(b bVar, Object obj) {
        ArrayList arrayList;
        dyy dyyVar;
        Throwable a2;
        boolean z = true;
        if (dug.a()) {
            if (!(i() == bVar)) {
                throw new AssertionError();
            }
        }
        if (!dug.a() || (!bVar.c())) {
            if (dug.a() && bVar._isCompleting == 0) {
                throw new AssertionError();
            }
            Throwable th = null;
            dtr dtrVar = obj instanceof dtr ? (dtr) obj : null;
            if (dtrVar != null) {
                th = dtrVar.a;
            }
            synchronized (bVar) {
                Object obj2 = bVar._exceptionsHolder;
                if (obj2 == null) {
                    arrayList = b.e();
                } else if (obj2 instanceof Throwable) {
                    ArrayList e = b.e();
                    e.add(obj2);
                    arrayList = e;
                } else if (!(obj2 instanceof ArrayList)) {
                    throw new IllegalStateException(dqc.a("State is ", obj2).toString());
                } else {
                    arrayList = (ArrayList) obj2;
                }
                Throwable th2 = (Throwable) bVar._rootCause;
                if (th2 != null) {
                    arrayList.add(0, th2);
                }
                if (th != null && !dqc.a(th, th2)) {
                    arrayList.add(th);
                }
                dyyVar = dvp.e;
                bVar._exceptionsHolder = dyyVar;
                ArrayList arrayList2 = arrayList;
                a2 = a(bVar, (List<? extends Throwable>) arrayList2);
                if (a2 != null) {
                    a(a2, (List<? extends Throwable>) arrayList2);
                }
            }
            if (a2 != null && a2 != th) {
                obj = new dtr(a2);
            }
            if (a2 != null) {
                if (!f(a2) && !e(a2)) {
                    z = false;
                }
                if (z) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                    ((dtr) obj).b();
                }
            }
            a(obj);
            boolean compareAndSet = c.compareAndSet(this, bVar, dvp.a(obj));
            if (dug.a() && !compareAndSet) {
                throw new AssertionError();
            }
            b(bVar, obj);
            return obj;
        }
        throw new AssertionError();
    }

    private final Throwable a(b bVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!bVar.d()) {
                return null;
            }
            return new JobCancellationException(c(), null, this);
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private static void a(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable b2 = !dug.c() ? th : dyx.b(th);
        for (Throwable th2 : list) {
            if (dug.c()) {
                th2 = dyx.b(th2);
            }
            if (th2 != th && th2 != b2 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                dlr.a(th, th2);
            }
        }
    }

    private final boolean a(dvd dvdVar, Object obj) {
        if (dug.a()) {
            if (!((dvdVar instanceof dus) || (dvdVar instanceof dvn))) {
                throw new AssertionError();
            }
        }
        if (!dug.a() || (!(obj instanceof dtr))) {
            if (!c.compareAndSet(this, dvdVar, dvp.a(obj))) {
                return false;
            }
            a(obj);
            b(dvdVar, obj);
            return true;
        }
        throw new AssertionError();
    }

    private final boolean f(Throwable th) {
        if (e()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        dtl dtlVar = (dtl) this._parentHandle;
        return (dtlVar == null || dtlVar == dvt.a) ? z : dtlVar.b(th) || z;
    }

    private final int b(Object obj) {
        dus dusVar;
        if (!(obj instanceof dus)) {
            if (!(obj instanceof dvc)) {
                return 0;
            }
            if (!c.compareAndSet(this, obj, ((dvc) obj).a)) {
                return -1;
            }
            k();
            return 1;
        } else if (((dus) obj).a) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            dusVar = dvp.g;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, dusVar)) {
                return -1;
            }
            k();
            return 1;
        }
    }

    @Override // defpackage.dvi
    public final CancellationException g() {
        Object i = i();
        if (!(i instanceof b)) {
            if (i instanceof dvd) {
                throw new IllegalStateException(dqc.a("Job is still new or active: ", (Object) this).toString());
            }
            if (!(i instanceof dtr)) {
                return new JobCancellationException(dqc.a(getClass().getSimpleName(), (Object) " has completed normally"), null, this);
            }
            return a(((dtr) i).a, (String) null);
        }
        Throwable th = (Throwable) ((b) i)._rootCause;
        if (th != null) {
            return a(th, dqc.a(getClass().getSimpleName(), (Object) " is cancelling"));
        }
        throw new IllegalStateException(dqc.a("Job is still new or active: ", (Object) this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CancellationException a(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = c();
            }
            return new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    @Override // defpackage.dvi
    public final duq a_(dow<? super Throwable, dmg> dowVar) {
        return a(false, true, dowVar);
    }

    private final boolean a(Object obj, dvs dvsVar, dvn dvnVar) {
        int a2;
        dvs dvsVar2 = dvsVar;
        dvn dvnVar2 = dvnVar;
        c cVar = new c(dvnVar2, this, obj);
        do {
            a2 = dvsVar2.i().a(dvnVar2, dvsVar2, cVar);
            if (a2 == 1) {
                return true;
            }
        } while (a2 != 2);
        return false;
    }

    private final void a(dvn dvnVar) {
        dvnVar.a(new dvs());
        c.compareAndSet(this, dvnVar, dym.a(dvnVar.g()));
    }

    public void b(Throwable th) {
        e((Object) th);
    }

    @Override // defpackage.dtn
    public final void a(dvv dvvVar) {
        e(dvvVar);
    }

    public boolean c(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return e((Object) th) && f();
    }

    public final boolean d(Throwable th) {
        return e((Object) th);
    }

    private boolean e(Object obj) {
        Object obj2;
        dyy dyyVar;
        dyy dyyVar2;
        dyy dyyVar3;
        obj2 = dvp.b;
        if (!b() || (obj2 = f(obj)) != dvp.a) {
            dyyVar = dvp.b;
            if (obj2 == dyyVar) {
                obj2 = h(obj);
            }
            dyyVar2 = dvp.b;
            if (obj2 == dyyVar2 || obj2 == dvp.a) {
                return true;
            }
            dyyVar3 = dvp.d;
            if (obj2 == dyyVar3) {
                return false;
            }
            c(obj2);
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Throwable] */
    @Override // defpackage.dvv
    public final CancellationException l() {
        CancellationException cancellationException;
        Object i = i();
        CancellationException cancellationException2 = null;
        if (!(i instanceof b)) {
            if (i instanceof dtr) {
                cancellationException = ((dtr) i).a;
            } else if (i instanceof dvd) {
                throw new IllegalStateException(dqc.a("Cannot be cancelling child in this state: ", i).toString());
            } else {
                cancellationException = null;
            }
        } else {
            cancellationException = (Throwable) ((b) i)._rootCause;
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        return cancellationException2 == null ? new JobCancellationException(dqc.a("Parent job is ", (Object) j(i)), cancellationException, this) : cancellationException2;
    }

    private final Throwable g(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(c(), null, this) : th;
        } else if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        } else {
            return ((dvv) obj).l();
        }
    }

    private final dvs a(dvd dvdVar) {
        dvs b2 = dvdVar.b();
        if (b2 == null) {
            if (dvdVar instanceof dus) {
                return new dvs();
            }
            if (dvdVar instanceof dvn) {
                a((dvn) dvdVar);
                return null;
            }
            throw new IllegalStateException(dqc.a("State should have list: ", (Object) dvdVar).toString());
        }
        return b2;
    }

    private final Object a(Object obj, Object obj2) {
        dyy dyyVar;
        dyy dyyVar2;
        if (!(obj instanceof dvd)) {
            dyyVar2 = dvp.b;
            return dyyVar2;
        } else if (((obj instanceof dus) || (obj instanceof dvn)) && !(obj instanceof dtm) && !(obj2 instanceof dtr)) {
            if (a((dvd) obj, obj2)) {
                return obj2;
            }
            dyyVar = dvp.c;
            return dyyVar;
        } else {
            return c((dvd) obj, obj2);
        }
    }

    private final Object c(dvd dvdVar, Object obj) {
        dyy dyyVar;
        dyy dyyVar2;
        dyy dyyVar3;
        dvs a2 = a(dvdVar);
        if (a2 == null) {
            dyyVar3 = dvp.c;
            return dyyVar3;
        }
        dtm dtmVar = null;
        b bVar = dvdVar instanceof b ? (b) dvdVar : null;
        if (bVar == null) {
            bVar = new b(a2, null);
        }
        synchronized (bVar) {
            if (bVar._isCompleting != 0) {
                dyyVar2 = dvp.b;
                return dyyVar2;
            }
            bVar._isCompleting = 1;
            if (bVar != dvdVar && !c.compareAndSet(this, dvdVar, bVar)) {
                dyyVar = dvp.c;
                return dyyVar;
            }
            if (dug.a() && !(!bVar.c())) {
                throw new AssertionError();
            }
            boolean d = bVar.d();
            dtr dtrVar = obj instanceof dtr ? (dtr) obj : null;
            if (dtrVar != null) {
                bVar.a(dtrVar.a);
            }
            Throwable th = (Throwable) bVar._rootCause;
            if (!(true ^ d)) {
                th = null;
            }
            dmg dmgVar = dmg.a;
            if (th != null) {
                a(a2, th);
            }
            dtm dtmVar2 = dvdVar instanceof dtm ? (dtm) dvdVar : null;
            if (dtmVar2 == null) {
                dvs b2 = dvdVar.b();
                if (b2 != null) {
                    dtmVar = a((dyn) b2);
                }
            } else {
                dtmVar = dtmVar2;
            }
            if (dtmVar != null && a(bVar, dtmVar, obj)) {
                return dvp.a;
            }
            return a(bVar, obj);
        }
    }

    private static Throwable i(Object obj) {
        dtr dtrVar = obj instanceof dtr ? (dtr) obj : null;
        if (dtrVar == null) {
            return null;
        }
        return dtrVar.a;
    }

    private final boolean a(b bVar, dtm dtmVar, Object obj) {
        while (dvi.a.a(dtmVar.a, false, false, new a(this, bVar, dtmVar, obj), 1) == dvt.a) {
            dtmVar = a((dyn) dtmVar);
            if (dtmVar == null) {
                return false;
            }
        }
        return true;
    }

    private static dtm a(dyn dynVar) {
        while (dynVar.z_()) {
            dynVar = dynVar.i();
        }
        while (true) {
            dynVar = dym.a(dynVar.g());
            if (!dynVar.z_()) {
                if (dynVar instanceof dtm) {
                    return (dtm) dynVar;
                }
                if (dynVar instanceof dvs) {
                    return null;
                }
            }
        }
    }

    @Override // defpackage.dvi
    public final dtl a(dtn dtnVar) {
        return (dtl) dvi.a.a(this, true, false, new dtm(dtnVar), 2);
    }

    public void a_(Throwable th) {
        throw th;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d() + '{' + j(i()) + '}');
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    private static String j(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof dvd ? ((dvd) obj).w_() ? "Active" : "New" : obj instanceof dtr ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.d() ? "Cancelling" : bVar._isCompleting != 0 ? "Completing" : "Active";
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "exception", "", "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", "", "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dvo$b */
    /* loaded from: classes2.dex */
    public static final class b implements dvd {
        volatile /* synthetic */ Object _rootCause;
        final dvs a;
        volatile /* synthetic */ int _isCompleting = 0;
        volatile /* synthetic */ Object _exceptionsHolder = null;

        @Override // defpackage.dvd
        public final dvs b() {
            return this.a;
        }

        public b(dvs dvsVar, Throwable th) {
            this.a = dvsVar;
            this._rootCause = th;
        }

        static ArrayList<Throwable> e() {
            return new ArrayList<>(4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.a + ']';
        }

        public final boolean c() {
            dyy dyyVar;
            Object obj = this._exceptionsHolder;
            dyyVar = dvp.e;
            return obj == dyyVar;
        }

        public final boolean d() {
            return ((Throwable) this._rootCause) != null;
        }

        @Override // defpackage.dvd
        public final boolean w_() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                Object obj = this._exceptionsHolder;
                if (obj != null) {
                    if (!(obj instanceof Throwable)) {
                        if (!(obj instanceof ArrayList)) {
                            throw new IllegalStateException(dqc.a("State is ", obj).toString());
                        }
                        ((ArrayList) obj).add(th);
                        return;
                    } else if (th == obj) {
                        return;
                    } else {
                        ArrayList<Throwable> e = e();
                        e.add(obj);
                        e.add(th);
                        dmg dmgVar = dmg.a;
                        this._exceptionsHolder = e;
                        return;
                    }
                }
                this._exceptionsHolder = th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dvo$a */
    /* loaded from: classes2.dex */
    public static final class a extends dvn {
        private final dvo a;
        private final b c;
        private final dtm f;
        private final Object g;

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Throwable th) {
            a(th);
            return dmg.a;
        }

        public a(dvo dvoVar, b bVar, dtm dtmVar, Object obj) {
            this.a = dvoVar;
            this.c = bVar;
            this.f = dtmVar;
            this.g = obj;
        }

        @Override // defpackage.dtt
        public final void a(Throwable th) {
            dvo.a(this.a, this.c, this.f, this.g);
        }
    }

    public final Object i() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof dyu)) {
                return obj;
            }
            ((dyu) obj).a(this);
        }
    }

    private final void a(dvs dvsVar, Throwable th) {
        dvs dvsVar2 = dvsVar;
        CompletionHandlerException completionHandlerException = null;
        for (dyn dynVar = (dyn) dvsVar2.g(); !dqc.a(dynVar, dvsVar2); dynVar = dynVar.h()) {
            if (dynVar instanceof dvj) {
                dvn dvnVar = (dvn) dynVar;
                try {
                    dvnVar.a(th);
                } catch (Throwable th2) {
                    CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 == null) {
                        completionHandlerException2 = null;
                    } else {
                        dlr.a(completionHandlerException2, th2);
                    }
                    if (completionHandlerException2 == null) {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + dvnVar + " for " + this, th2);
                    }
                }
            }
        }
        CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            a_(completionHandlerException3);
        }
        f(th);
    }

    private final void b(dvs dvsVar, Throwable th) {
        dvs dvsVar2 = dvsVar;
        CompletionHandlerException completionHandlerException = null;
        for (dyn dynVar = (dyn) dvsVar2.g(); !dqc.a(dynVar, dvsVar2); dynVar = dynVar.h()) {
            if (dynVar instanceof dvn) {
                dvn dvnVar = (dvn) dynVar;
                try {
                    dvnVar.a(th);
                } catch (Throwable th2) {
                    CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 == null) {
                        completionHandlerException2 = null;
                    } else {
                        dlr.a(completionHandlerException2, th2);
                    }
                    if (completionHandlerException2 == null) {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + dvnVar + " for " + this, th2);
                    }
                }
            }
        }
        CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            a_(completionHandlerException3);
        }
    }

    @Override // defpackage.dvi
    public final boolean h() {
        int b2;
        do {
            b2 = b(i());
            if (b2 == 0) {
                return false;
            }
        } while (b2 != 1);
        return true;
    }

    @Override // defpackage.dvi
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(c(), null, this);
        }
        b((Throwable) cancellationException);
    }

    private final Object f(Object obj) {
        dyy dyyVar;
        Object a2;
        dyy dyyVar2;
        do {
            Object i = i();
            if (!(i instanceof dvd) || ((i instanceof b) && ((b) i)._isCompleting != 0)) {
                dyyVar = dvp.b;
                return dyyVar;
            }
            a2 = a(i, new dtr(g(obj)));
            dyyVar2 = dvp.c;
        } while (a2 == dyyVar2);
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r8.i()
            boolean r3 = r2 instanceof defpackage.dvo.b
            r4 = 1
            if (r3 == 0) goto L50
            monitor-enter(r2)
            r3 = r2
            dvo$b r3 = (defpackage.dvo.b) r3     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L1b
            dyy r9 = defpackage.dvp.d()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)
            return r9
        L1b:
            r3 = r2
            dvo$b r3 = (defpackage.dvo.b) r3     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r3.d()     // Catch: java.lang.Throwable -> L4d
            if (r9 != 0) goto L26
            if (r3 != 0) goto L32
        L26:
            if (r1 != 0) goto L2c
            java.lang.Throwable r1 = r8.g(r9)     // Catch: java.lang.Throwable -> L4d
        L2c:
            r9 = r2
            dvo$b r9 = (defpackage.dvo.b) r9     // Catch: java.lang.Throwable -> L4d
            r9.a(r1)     // Catch: java.lang.Throwable -> L4d
        L32:
            r9 = r2
            dvo$b r9 = (defpackage.dvo.b) r9     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r9 = r9._rootCause     // Catch: java.lang.Throwable -> L4d
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch: java.lang.Throwable -> L4d
            r1 = r3 ^ 1
            if (r1 == 0) goto L3e
            r0 = r9
        L3e:
            monitor-exit(r2)
            if (r0 == 0) goto L48
            dvo$b r2 = (defpackage.dvo.b) r2
            dvs r9 = r2.a
            r8.a(r9, r0)
        L48:
            dyy r9 = defpackage.dvp.c()
            return r9
        L4d:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L50:
            boolean r3 = r2 instanceof defpackage.dvd
            if (r3 == 0) goto Ld1
            if (r1 != 0) goto L5a
            java.lang.Throwable r1 = r8.g(r9)
        L5a:
            r3 = r2
            dvd r3 = (defpackage.dvd) r3
            boolean r5 = r3.w_()
            if (r5 == 0) goto La9
            boolean r2 = defpackage.dug.a()
            if (r2 == 0) goto L75
            boolean r2 = r3 instanceof defpackage.dvo.b
            r2 = r2 ^ r4
            if (r2 == 0) goto L6f
            goto L75
        L6f:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L75:
            boolean r2 = defpackage.dug.a()
            if (r2 == 0) goto L88
            boolean r2 = r3.w_()
            if (r2 == 0) goto L82
            goto L88
        L82:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L88:
            dvs r2 = r8.a(r3)
            r5 = 0
            if (r2 != 0) goto L91
        L8f:
            r4 = 0
            goto La2
        L91:
            dvo$b r6 = new dvo$b
            r6.<init>(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.dvo.c
            boolean r3 = r7.compareAndSet(r8, r3, r6)
            if (r3 != 0) goto L9f
            goto L8f
        L9f:
            r8.a(r2, r1)
        La2:
            if (r4 == 0) goto L2
            dyy r9 = defpackage.dvp.c()
            return r9
        La9:
            dtr r3 = new dtr
            r3.<init>(r1)
            java.lang.Object r3 = r8.a(r2, r3)
            dyy r4 = defpackage.dvp.c()
            if (r3 == r4) goto Lbf
            dyy r2 = defpackage.dvp.e()
            if (r3 == r2) goto L2
            return r3
        Lbf:
            java.lang.String r9 = "Cannot happen in "
            java.lang.String r9 = defpackage.dqc.a(r9, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        Ld1:
            dyy r9 = defpackage.dvp.d()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvo.h(java.lang.Object):java.lang.Object");
    }

    public final Object d(Object obj) {
        Object a2;
        dyy dyyVar;
        dyy dyyVar2;
        do {
            a2 = a(i(), obj);
            dyyVar = dvp.b;
            if (a2 != dyyVar) {
                dyyVar2 = dvp.c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, i(obj));
            }
        } while (a2 == dyyVar2);
        return a2;
    }

    private final void b(dvd dvdVar, Object obj) {
        dtl dtlVar = (dtl) this._parentHandle;
        if (dtlVar != null) {
            dtlVar.dispose();
            this._parentHandle = dvt.a;
        }
        Throwable th = null;
        dtr dtrVar = obj instanceof dtr ? (dtr) obj : null;
        if (dtrVar != null) {
            th = dtrVar.a;
        }
        if (dvdVar instanceof dvn) {
            try {
                ((dvn) dvdVar).a(th);
                return;
            } catch (Throwable th2) {
                a_(new CompletionHandlerException("Exception in completion handler " + dvdVar + " for " + this, th2));
                return;
            }
        }
        dvs b2 = dvdVar.b();
        if (b2 == null) {
            return;
        }
        b(b2, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [dvc] */
    @Override // defpackage.dvi
    public final duq a(boolean z, boolean z2, dow<? super Throwable, dmg> dowVar) {
        dvh dvhVar;
        Throwable th;
        Throwable th2 = null;
        if (z) {
            dvg dvgVar = dowVar instanceof dvj ? (dvj) dowVar : null;
            if (dvgVar == null) {
                dvgVar = new dvg(dowVar);
            }
            dvhVar = dvgVar;
        } else {
            dvhVar = dowVar instanceof dvn ? (dvn) dowVar : null;
            if (dvhVar == null) {
                dvhVar = null;
            } else if (dug.a() && !(!(dvhVar instanceof dvj))) {
                throw new AssertionError();
            }
            if (dvhVar == null) {
                dvhVar = new dvh(dowVar);
            }
        }
        dvhVar.b = this;
        while (true) {
            Object i = i();
            if (i instanceof dus) {
                dus dusVar = (dus) i;
                if (dusVar.a) {
                    if (c.compareAndSet(this, i, dvhVar)) {
                        return dvhVar;
                    }
                } else {
                    dvs dvsVar = new dvs();
                    if (!dusVar.a) {
                        dvsVar = new dvc(dvsVar);
                    }
                    c.compareAndSet(this, dusVar, dvsVar);
                }
            } else if (i instanceof dvd) {
                dvs b2 = ((dvd) i).b();
                if (b2 != null) {
                    duq duqVar = dvt.a;
                    if (!z || !(i instanceof b)) {
                        th = null;
                    } else {
                        synchronized (i) {
                            th = (Throwable) ((b) i)._rootCause;
                            if (th == null || ((dowVar instanceof dtm) && ((b) i)._isCompleting == 0)) {
                                if (a(i, b2, dvhVar)) {
                                    if (th == null) {
                                        return dvhVar;
                                    }
                                    duqVar = dvhVar;
                                }
                            }
                            dmg dmgVar = dmg.a;
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            dowVar.invoke(th);
                        }
                        return duqVar;
                    } else if (a(i, b2, dvhVar)) {
                        return dvhVar;
                    }
                } else if (i == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                } else {
                    a((dvn) i);
                }
            } else {
                if (z2) {
                    dtr dtrVar = i instanceof dtr ? (dtr) i : null;
                    if (dtrVar != null) {
                        th2 = dtrVar.a;
                    }
                    dowVar.invoke(th2);
                }
                return dvt.a;
            }
        }
    }

    @Override // defpackage.dvi
    public final Object a(dnu<? super dmg> dnuVar) {
        boolean z;
        while (true) {
            Object i = i();
            if (i instanceof dvd) {
                if (b(i) >= 0) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            dvm.a(dnuVar.getContext());
            return dmg.a;
        }
        dtg dtgVar = new dtg(dnz.a(dnuVar), 1);
        dtgVar.b();
        dtg dtgVar2 = dtgVar;
        dti.a(dtgVar2, a(false, true, (dow<? super Throwable, dmg>) new dvw(dtgVar2)));
        Object e = dtgVar.e();
        if (e == dny.COROUTINE_SUSPENDED) {
            dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
        }
        if (e != dny.COROUTINE_SUSPENDED) {
            e = dmg.a;
        }
        return e == dny.COROUTINE_SUSPENDED ? e : dmg.a;
    }

    public String d() {
        return getClass().getSimpleName();
    }

    public static final /* synthetic */ void a(dvo dvoVar, b bVar, dtm dtmVar, Object obj) {
        if (dug.a()) {
            if (!(dvoVar.i() == bVar)) {
                throw new AssertionError();
            }
        }
        dtm a2 = a((dyn) dtmVar);
        if (a2 == null || !dvoVar.a(bVar, a2, obj)) {
            dvoVar.c(dvoVar.a(bVar, obj));
        }
    }
}
