package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b;\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\u0010Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010~\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0x0wH\u0002J\u000e\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020y0xH\u0002J\u000f\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020y0xH\u0002J\u0013\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020yH\u0002J.\u0010\u0084\u0001\u001a\u00020A2\u0010\u0010\u0085\u0001\u001a\u000b\u0012\u0004\u0012\u00020A\u0018\u00010\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020A2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0007J\u0018\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0007J\u0093\u0001\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u00042\u0010\u0010\u0093\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u00042\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00042\u0007\u0010\u009c\u0001\u001a\u00020\u00042\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u009e\u0001\u001a\u00030\u0097\u00012\b\u0010\u009f\u0001\u001a\u00030\u0097\u00012\b\u0010 \u0001\u001a\u00030\u0097\u0001H\u0007J\u0093\u0001\u0010¡\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u00042\u0010\u0010\u0093\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u00042\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00042\u0007\u0010\u009c\u0001\u001a\u00020\u00042\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u009e\u0001\u001a\u00030\u0097\u00012\b\u0010\u009f\u0001\u001a\u00030\u0097\u00012\b\u0010 \u0001\u001a\u00030\u0097\u0001H\u0007J§\u0001\u0010¢\u0001\u001a\u0005\u0018\u00010\u008f\u00012\u0007\u0010\u0083\u0001\u001a\u00020y2\u0007\u0010\u0092\u0001\u001a\u00020\u00042\u0010\u0010\u0093\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u00042\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00042\u0007\u0010\u009c\u0001\u001a\u00020\u00042\b\u0010£\u0001\u001a\u00030\u0097\u00012\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u009e\u0001\u001a\u00030\u0097\u00012\b\u0010¤\u0001\u001a\u00030¥\u00012\b\u0010\u009f\u0001\u001a\u00030\u0097\u00012\b\u0010 \u0001\u001a\u00030\u0097\u00012\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0004H\u0002JD\u0010§\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\t\u0010¨\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010©\u0001\u001a\u0004\u0018\u00010\u00042\n\u0010ª\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0007J\u0016\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0007J.\u0010®\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010¯\u0001\u001a\u00030\u008f\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010±\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0007J®\u0001\u0010²\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010x2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u00042\u0010\u0010\u0093\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u00042\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00042\u0007\u0010\u009c\u0001\u001a\u00020\u00042\b\u0010£\u0001\u001a\u00030\u0097\u00012\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u009e\u0001\u001a\u00030\u0097\u00012\b\u0010\u009f\u0001\u001a\u00030\u0097\u00012\b\u0010 \u0001\u001a\u00030\u0097\u00012\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010³\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0007J\u0019\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020A0\u0086\u00012\u0007\u0010\u0083\u0001\u001a\u00020yH\u0002J\u0016\u0010µ\u0001\u001a\u0005\u0018\u00010\u008b\u00012\b\u0010¶\u0001\u001a\u00030\u008f\u0001H\u0007J\u0018\u0010·\u0001\u001a\u0005\u0018\u00010¸\u00012\n\u0010¶\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0007J\u0016\u0010¹\u0001\u001a\u0005\u0018\u00010\u008b\u00012\b\u0010º\u0001\u001a\u00030\u008f\u0001H\u0007J\u0018\u0010»\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0007J\u001d\u0010½\u0001\u001a\u00030«\u00012\u0007\u0010©\u0001\u001a\u00020\u00042\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0007J%\u0010¾\u0001\u001a\u00030«\u00012\u000f\u0010¿\u0001\u001a\n\u0012\u0004\u0012\u00020y\u0018\u00010x2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0002J\u0012\u0010À\u0001\u001a\u00020A2\u0007\u0010Á\u0001\u001a\u00020AH\u0007J\t\u0010Â\u0001\u001a\u00020AH\u0007J\u0016\u0010Ã\u0001\u001a\u0005\u0018\u00010\u008b\u00012\b\u0010¶\u0001\u001a\u00030\u008f\u0001H\u0007J\u0013\u0010Ä\u0001\u001a\u00020A2\b\u0010¶\u0001\u001a\u00030\u008f\u0001H\u0007J\u0016\u0010Å\u0001\u001a\u0005\u0018\u00010\u008b\u00012\b\u0010º\u0001\u001a\u00030\u008f\u0001H\u0007J\u0014\u0010Æ\u0001\u001a\u00030\u0097\u00012\b\u0010º\u0001\u001a\u00030\u008f\u0001H\u0007J\u0013\u0010Ç\u0001\u001a\u00030\u0097\u00012\u0007\u0010È\u0001\u001a\u00020AH\u0007J?\u0010É\u0001\u001a\u00030Ê\u00012\b\u0010¶\u0001\u001a\u00030\u008f\u00012\t\u0010¨\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010©\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010È\u0001\u001a\u00020A2\n\u0010Ë\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0007J\n\u0010Ì\u0001\u001a\u00030Ê\u0001H\u0007J-\u0010Í\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\n\u0010¶\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010yH\u0007J-\u0010Î\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\n\u0010¶\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010yH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@X\u0082\u0004¢\u0006\u0004\n\u0002\u0010BR\u000e\u0010C\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R \u0010v\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0x0wX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010z\u001a\b\u0012\u0004\u0012\u00020y0xX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010{\u001a\b\u0012\u0004\u0012\u00020y0xX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020}X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006×\u0001"}, d2 = {"Lcom/facebook/internal/NativeProtocol;", "", "()V", "ACTION_APPINVITE_DIALOG", "", "ACTION_CAMERA_EFFECT", "ACTION_FEED_DIALOG", "ACTION_LIKE_DIALOG", "ACTION_MESSAGE_DIALOG", "ACTION_OGACTIONPUBLISH_DIALOG", "ACTION_OGMESSAGEPUBLISH_DIALOG", "ACTION_SHARE_STORY", "AUDIENCE_EVERYONE", "AUDIENCE_FRIENDS", "AUDIENCE_ME", "BRIDGE_ARG_ACTION_ID_STRING", "BRIDGE_ARG_APP_NAME_STRING", "BRIDGE_ARG_ERROR_BUNDLE", "BRIDGE_ARG_ERROR_CODE", "BRIDGE_ARG_ERROR_DESCRIPTION", "BRIDGE_ARG_ERROR_JSON", "BRIDGE_ARG_ERROR_SUBCODE", "BRIDGE_ARG_ERROR_TYPE", "CONTENT_SCHEME", "ERROR_APPLICATION_ERROR", "ERROR_NETWORK_ERROR", "ERROR_PERMISSION_DENIED", "ERROR_PROTOCOL_ERROR", "ERROR_SERVICE_DISABLED", "ERROR_UNKNOWN_ERROR", "ERROR_USER_CANCELED", "EXTRA_ACCESS_TOKEN", "EXTRA_APPLICATION_ID", "EXTRA_APPLICATION_NAME", "EXTRA_AUTHENTICATION_TOKEN", "EXTRA_DATA_ACCESS_EXPIRATION_TIME", "EXTRA_DIALOG_COMPLETE_KEY", "EXTRA_DIALOG_COMPLETION_GESTURE_KEY", "EXTRA_EXPIRES_SECONDS_SINCE_EPOCH", "EXTRA_GET_INSTALL_DATA_PACKAGE", "EXTRA_GRAPH_API_VERSION", "EXTRA_LOGGER_REF", "EXTRA_NONCE", "EXTRA_PERMISSIONS", "EXTRA_PROTOCOL_ACTION", "EXTRA_PROTOCOL_BRIDGE_ARGS", "EXTRA_PROTOCOL_CALL_ID", "EXTRA_PROTOCOL_METHOD_ARGS", "EXTRA_PROTOCOL_METHOD_RESULTS", "EXTRA_PROTOCOL_VERSION", "EXTRA_PROTOCOL_VERSIONS", "EXTRA_TOAST_DURATION_MS", "EXTRA_USER_ID", "FACEBOOK_PROXY_AUTH_ACTIVITY", "FACEBOOK_PROXY_AUTH_APP_ID_KEY", "FACEBOOK_PROXY_AUTH_E2E_KEY", "FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY", "FACEBOOK_SDK_VERSION_KEY", "FACEBOOK_TOKEN_REFRESH_ACTIVITY", "IMAGE_URL_KEY", "IMAGE_USER_GENERATED_KEY", "INTENT_ACTION_PLATFORM_ACTIVITY", "INTENT_ACTION_PLATFORM_SERVICE", "KNOWN_PROTOCOL_VERSIONS", "", "", "[Ljava/lang/Integer;", "MESSAGE_GET_ACCESS_TOKEN_REPLY", "MESSAGE_GET_ACCESS_TOKEN_REQUEST", "MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY", "MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST", "MESSAGE_GET_INSTALL_DATA_REPLY", "MESSAGE_GET_INSTALL_DATA_REQUEST", "MESSAGE_GET_LIKE_STATUS_REPLY", "MESSAGE_GET_LIKE_STATUS_REQUEST", "MESSAGE_GET_LOGIN_STATUS_REPLY", "MESSAGE_GET_LOGIN_STATUS_REQUEST", "MESSAGE_GET_PROTOCOL_VERSIONS_REPLY", "MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST", "NO_PROTOCOL_AVAILABLE", "OPEN_GRAPH_CREATE_OBJECT_KEY", "PLATFORM_PROVIDER", "PLATFORM_PROVIDER_VERSIONS", "PLATFORM_PROVIDER_VERSION_COLUMN", "PROTOCOL_VERSION_20121101", "PROTOCOL_VERSION_20130502", "PROTOCOL_VERSION_20130618", "PROTOCOL_VERSION_20131107", "PROTOCOL_VERSION_20140204", "PROTOCOL_VERSION_20140324", "PROTOCOL_VERSION_20140701", "PROTOCOL_VERSION_20141001", "PROTOCOL_VERSION_20141028", "PROTOCOL_VERSION_20141107", "PROTOCOL_VERSION_20141218", "PROTOCOL_VERSION_20160327", "PROTOCOL_VERSION_20170213", "PROTOCOL_VERSION_20170411", "PROTOCOL_VERSION_20170417", "PROTOCOL_VERSION_20171115", "PROTOCOL_VERSION_20210906", "RESULT_ARGS_ACCESS_TOKEN", "RESULT_ARGS_DIALOG_COMPLETE_KEY", "RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY", "RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH", "RESULT_ARGS_GRAPH_DOMAIN", "RESULT_ARGS_PERMISSIONS", "RESULT_ARGS_SIGNED_REQUEST", "STATUS_ERROR_CODE", "STATUS_ERROR_DESCRIPTION", "STATUS_ERROR_JSON", "STATUS_ERROR_SUBCODE", "STATUS_ERROR_TYPE", "TAG", "WEB_DIALOG_ACTION", "WEB_DIALOG_IS_FALLBACK", "WEB_DIALOG_PARAMS", "WEB_DIALOG_URL", "actionToAppInfoMap", "", "", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "effectCameraAppInfoList", "facebookAppInfoList", "protocolVersionsAsyncUpdating", "Ljava/util/concurrent/atomic/AtomicBoolean;", "buildActionToAppInfoMap", "buildEffectCameraAppInfoList", "buildFacebookAppList", "buildPlatformProviderVersionURI", "Landroid/net/Uri;", "appInfo", "computeLatestAvailableVersionFromVersionSpec", "allAvailableFacebookAppVersions", "Ljava/util/TreeSet;", "latestSdkVersion", "versionSpec", "", "createBundleForException", "Landroid/os/Bundle;", "e", "Lcom/facebook/FacebookException;", "createFacebookLiteIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "applicationId", "permissions", "", "e2e", "isRerequest", "", "isForPublish", "defaultAudience", "Lcom/facebook/login/DefaultAudience;", "clientState", "authType", "messengerPageId", "resetMessengerState", "isFamilyLogin", "shouldSkipAccountDedupe", "createInstagramIntent", "createNativeAppIntent", "ignoreAppSwitchToLoggedOut", "targetApp", "Lcom/facebook/login/LoginTargetApp;", "nonce", "createPlatformActivityIntent", "callId", "action", "versionResult", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "extras", "createPlatformServiceIntent", "createProtocolResultIntent", "requestIntent", "results", "error", "createProxyAuthIntents", "createTokenRefreshIntent", "fetchAllAvailableProtocolVersionsForAppInfo", "getBridgeArgumentsFromIntent", "intent", "getCallIdFromIntent", "Ljava/util/UUID;", "getErrorDataFromResultIntent", "resultIntent", "getExceptionFromErrorData", "errorData", "getLatestAvailableProtocolVersionForAction", "getLatestAvailableProtocolVersionForAppInfoList", "appInfoList", "getLatestAvailableProtocolVersionForService", "minimumVersion", "getLatestKnownVersion", "getMethodArgumentsFromIntent", "getProtocolVersionFromIntent", "getSuccessResultsFromIntent", "isErrorResult", "isVersionCompatibleWithBucketedIntent", "version", "setupProtocolRequestIntent", "", "params", "updateAllAvailableProtocolVersionsAsync", "validateActivityIntent", "validateServiceIntent", "EffectTestAppInfo", "FBLiteAppInfo", "InstagramAppInfo", "KatanaAppInfo", "MessengerAppInfo", "NativeAppInfo", "ProtocolVersionQueryResult", "WakizashiAppInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qd  reason: default package */
/* loaded from: classes2.dex */
public final class qd {
    public static final qd a;
    private static final String b;
    private static final List<f> c;
    private static final List<f> d;
    private static final Map<String, List<f>> e;
    private static final AtomicBoolean f = new AtomicBoolean(false);
    private static final Integer[] g = {20210906, 20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101};

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/NativeProtocol$EffectTestAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qd$a */
    /* loaded from: classes2.dex */
    public static final class a extends f {
        @Override // defpackage.qd.f
        public final /* bridge */ /* synthetic */ String a() {
            return null;
        }

        @Override // defpackage.qd.f
        public final String b() {
            return "com.facebook.arstudio.player";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/NativeProtocol$InstagramAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "getResponseType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qd$c */
    /* loaded from: classes2.dex */
    static final class c extends f {
        @Override // defpackage.qd.f
        public final String a() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // defpackage.qd.f
        public final String b() {
            return "com.instagram.android";
        }

        @Override // defpackage.qd.f
        public final String c() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/NativeProtocol$MessengerAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qd$e */
    /* loaded from: classes2.dex */
    public static final class e extends f {
        @Override // defpackage.qd.f
        public final /* bridge */ /* synthetic */ String a() {
            return null;
        }

        @Override // defpackage.qd.f
        public final String b() {
            return "com.facebook.orca";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/NativeProtocol$WakizashiAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qd$h */
    /* loaded from: classes2.dex */
    public static final class h extends f {
        @Override // defpackage.qd.f
        public final String a() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // defpackage.qd.f
        public final String b() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        qd qdVar = new qd();
        a = qdVar;
        String name = qd.class.getName();
        dqc.b(name, "NativeProtocol::class.java.name");
        b = name;
        c = qdVar.f();
        d = qdVar.g();
        e = qdVar.h();
    }

    private qd() {
    }

    public static final /* synthetic */ TreeSet a(qd qdVar, f fVar) {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            return qdVar.a(fVar);
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    public static final /* synthetic */ List d() {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean e() {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    private final List<f> f() {
        if (qx.a(this)) {
            return null;
        }
        try {
            return dmq.c(new d(), new h());
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final List<f> g() {
        if (qx.a(this)) {
            return null;
        }
        try {
            ArrayList c2 = dmq.c(new a());
            c2.addAll(f());
            return c2;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final Map<String, List<f>> h() {
        if (qx.a(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new e());
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", c);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", c);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", c);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", c);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", c);
            return hashMap;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private static Intent a(Context context, Intent intent) {
        ResolveInfo resolveActivity;
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveActivity.activityInfo.packageName;
            dqc.b(str, "resolveInfo.activityInfo.packageName");
            if (pp.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    private static Intent b(Context context, Intent intent) {
        ResolveInfo resolveService;
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveService.serviceInfo.packageName;
            dqc.b(str, "resolveInfo.serviceInfo.packageName");
            if (pp.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    public static final Intent a(Context context, String str, Collection<String> collection, String str2, boolean z, rj rjVar, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4) {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            dqc.d(str, "applicationId");
            dqc.d(collection, "permissions");
            dqc.d(str2, "e2e");
            dqc.d(rjVar, "defaultAudience");
            dqc.d(str3, "clientState");
            dqc.d(str4, "authType");
            return a(context, a.a(new b(), str, collection, str2, z, rjVar, str3, str4, false, str5, z2, rz.FACEBOOK, z3, z4, ""));
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    public static final Intent b(Context context, String str, Collection<String> collection, String str2, boolean z, rj rjVar, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4) {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            dqc.d(str, "applicationId");
            dqc.d(collection, "permissions");
            dqc.d(str2, "e2e");
            dqc.d(rjVar, "defaultAudience");
            dqc.d(str3, "clientState");
            dqc.d(str4, "authType");
            return a(context, a.a(new c(), str, collection, str2, z, rjVar, str3, str4, false, str5, z2, rz.INSTAGRAM, z3, z4, ""));
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    private final Intent a(f fVar, String str, Collection<String> collection, String str2, boolean z, rj rjVar, String str3, String str4, boolean z2, String str5, boolean z3, rz rzVar, boolean z4, boolean z5, String str6) {
        if (qx.a(this)) {
            return null;
        }
        try {
            String a2 = fVar.a();
            if (a2 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(fVar.b(), a2).putExtra("client_id", str);
            dqc.b(putExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", ly.l());
            if (!qi.a(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!qi.a(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", fVar.c());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", rjVar.getNativeProtocolAudience());
            }
            putExtra.putExtra("legacy_override", ly.e());
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                putExtra.putExtra("fx_app", rzVar.toString());
            }
            if (z5) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public static final List<Intent> a(String str, Collection<String> collection, String str2, boolean z, rj rjVar, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, boolean z5, String str6) {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            dqc.d(str, "applicationId");
            dqc.d(collection, "permissions");
            dqc.d(str2, "e2e");
            dqc.d(rjVar, "defaultAudience");
            dqc.d(str3, "clientState");
            dqc.d(str4, "authType");
            ArrayList arrayList = new ArrayList();
            for (f fVar : c) {
                ArrayList arrayList2 = arrayList;
                Intent a2 = a.a(fVar, str, collection, str2, z, rjVar, str3, str4, z2, str5, z3, rz.FACEBOOK, z4, z5, str6);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    public static final int a() {
        if (qx.a(qd.class)) {
            return 0;
        }
        try {
            return g[0].intValue();
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return 0;
        }
    }

    private static boolean b(int i2) {
        if (qx.a(qd.class)) {
            return false;
        }
        try {
            return dmj.a(g, Integer.valueOf(i2)) && i2 >= 20140701;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return false;
        }
    }

    public static final Intent a(Intent intent, Bundle bundle, FacebookException facebookException) {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            dqc.d(intent, "requestIntent");
            UUID c2 = c(intent);
            if (c2 == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", b(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", c2.toString());
            if (facebookException != null) {
                bundle2.putBundle("error", a(facebookException));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    public static final Intent a(Context context) {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            for (f fVar : c) {
                Intent b2 = b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(fVar.b()).addCategory("android.intent.category.DEFAULT"));
                if (b2 != null) {
                    return b2;
                }
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    private static int b(Intent intent) {
        if (qx.a(qd.class)) {
            return 0;
        }
        try {
            dqc.d(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return 0;
        }
    }

    private static UUID c(Intent intent) {
        String str;
        if (!qx.a(qd.class) && intent != null) {
            try {
                if (b(b(intent))) {
                    Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                    str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                } else {
                    str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                }
                if (str == null) {
                    return null;
                }
                try {
                    return UUID.fromString(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            } catch (Throwable th) {
                qx.a(th, qd.class);
                return null;
            }
        }
        return null;
    }

    public static final Bundle a(Intent intent) {
        if (qx.a(qd.class)) {
            return null;
        }
        try {
            dqc.d(intent, "intent");
            if (!b(b(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return null;
        }
    }

    public static final FacebookException a(Bundle bundle) {
        if (!qx.a(qd.class) && bundle != null) {
            try {
                String string = bundle.getString("error_type");
                if (string == null) {
                    string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
                }
                String string2 = bundle.getString("error_description");
                if (string2 == null) {
                    string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
                if (string != null && dsg.b(string, "UserCanceled")) {
                    return new FacebookOperationCanceledException(string2);
                }
                return new FacebookException(string2);
            } catch (Throwable th) {
                qx.a(th, qd.class);
                return null;
            }
        }
        return null;
    }

    private static Bundle a(FacebookException facebookException) {
        if (!qx.a(qd.class) && facebookException != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("error_description", facebookException.toString());
                if (facebookException instanceof FacebookOperationCanceledException) {
                    bundle.putString("error_type", "UserCanceled");
                }
                return bundle;
            } catch (Throwable th) {
                qx.a(th, qd.class);
                return null;
            }
        }
        return null;
    }

    public static final int a(int i2) {
        if (qx.a(qd.class)) {
            return 0;
        }
        try {
            return a.a(c, new int[]{i2}).a;
        } catch (Throwable th) {
            qx.a(th, qd.class);
            return 0;
        }
    }

    private final g a(List<? extends f> list, int[] iArr) {
        TreeSet<Integer> treeSet;
        if (qx.a(this)) {
            return null;
        }
        try {
            b();
            if (list == null) {
                g.a aVar = g.b;
                return g.a.a();
            }
            for (f fVar : list) {
                if (fVar.b == null || (treeSet = fVar.b) == null || treeSet.isEmpty()) {
                    fVar.a(false);
                }
                int a2 = a(fVar.b, a(), iArr);
                if (a2 != -1) {
                    g.a aVar2 = g.b;
                    g gVar = new g((byte) 0);
                    gVar.c = fVar;
                    gVar.a = a2;
                    return gVar;
                }
            }
            g.a aVar3 = g.b;
            return g.a.a();
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public static final void b() {
        if (qx.a(qd.class)) {
            return;
        }
        try {
            if (!f.compareAndSet(false, true)) {
                return;
            }
            ly.a().execute(i.a);
        } catch (Throwable th) {
            qx.a(th, qd.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qd$i */
    /* loaded from: classes2.dex */
    public static final class i implements Runnable {
        public static final i a = new i();

        i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                qd qdVar = qd.a;
                for (f fVar : qd.d()) {
                    fVar.a(true);
                }
                qd qdVar2 = qd.a;
                qd.e().set(false);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    private final TreeSet<Integer> a(f fVar) {
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfo;
        Cursor cursor2;
        if (qx.a(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = ly.k().getContentResolver();
            String[] strArr = {"version"};
            Uri b2 = b(fVar);
            try {
                try {
                    providerInfo = ly.k().getPackageManager().resolveContentProvider(fVar.b() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException unused) {
                    providerInfo = null;
                }
                if (providerInfo != null) {
                    try {
                        cursor2 = contentResolver.query(b2, strArr, null, null, null);
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                        cursor2 = null;
                    }
                    if (cursor2 != null) {
                        while (cursor2.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                            } catch (Throwable th2) {
                                cursor = cursor2;
                                th = th2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursor2 = null;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (Throwable th4) {
            qx.a(th4, this);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if ((r3 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        return java.lang.Math.min(r4, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.util.TreeSet<java.lang.Integer> r8, int r9, int[] r10) {
        /*
            java.lang.Class<qd> r0 = defpackage.qd.class
            boolean r1 = defpackage.qx.a(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "versionSpec"
            defpackage.dqc.d(r10, r1)     // Catch: java.lang.Throwable -> L56
            r1 = -1
            if (r8 != 0) goto L13
            return r1
        L13:
            int r3 = r10.length     // Catch: java.lang.Throwable -> L56
            int r3 = r3 + (-1)
            java.util.Iterator r8 = r8.descendingIterator()     // Catch: java.lang.Throwable -> L56
            r4 = -1
        L1b:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L55
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = "fbAppVersion"
            defpackage.dqc.b(r5, r6)     // Catch: java.lang.Throwable -> L56
            int r6 = r5.intValue()     // Catch: java.lang.Throwable -> L56
            int r4 = java.lang.Math.max(r4, r6)     // Catch: java.lang.Throwable -> L56
        L34:
            if (r3 < 0) goto L41
            r6 = r10[r3]     // Catch: java.lang.Throwable -> L56
            int r7 = r5.intValue()     // Catch: java.lang.Throwable -> L56
            if (r6 <= r7) goto L41
            int r3 = r3 + (-1)
            goto L34
        L41:
            if (r3 >= 0) goto L44
            return r1
        L44:
            r6 = r10[r3]     // Catch: java.lang.Throwable -> L56
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L56
            if (r6 != r5) goto L1b
            int r3 = r3 % 2
            if (r3 != 0) goto L55
            int r8 = java.lang.Math.min(r4, r9)     // Catch: java.lang.Throwable -> L56
            return r8
        L55:
            return r1
        L56:
            r8 = move-exception
            defpackage.qx.a(r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd.a(java.util.TreeSet, int, int[]):int");
    }

    private final Uri b(f fVar) {
        if (qx.a(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + fVar.b() + ".provider.PlatformProvider/versions");
            dqc.b(parse, "Uri.parse(CONTENT_SCHEME…ATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "()V", "availableVersions", "Ljava/util/TreeSet;", "", "fetchAvailableVersions", "", "force", "", "getAvailableVersions", "getLoginActivity", "", "getPackage", "getResponseType", "onAvailableVersionsNullOrEmpty", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qd$f */
    /* loaded from: classes2.dex */
    public static abstract class f {
        TreeSet<Integer> b;

        public abstract String a();

        public abstract String b();

        public String c() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1.isEmpty() == false) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x002b A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x0011, B:11:0x0019, B:13:0x001f, B:19:0x002b), top: B:24:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void a(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L11
                java.util.TreeSet<java.lang.Integer> r1 = r0.b     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L11
                java.util.TreeSet<java.lang.Integer> r1 = r0.b     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L11
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L19
            L11:
                qd r1 = defpackage.qd.a     // Catch: java.lang.Throwable -> L30
                java.util.TreeSet r1 = defpackage.qd.a(r1, r0)     // Catch: java.lang.Throwable -> L30
                r0.b = r1     // Catch: java.lang.Throwable -> L30
            L19:
                java.util.TreeSet<java.lang.Integer> r1 = r0.b     // Catch: java.lang.Throwable -> L30
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L28
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L26
                goto L28
            L26:
                r1 = 0
                goto L29
            L28:
                r1 = 1
            L29:
                if (r1 == 0) goto L2e
                r0.d()     // Catch: java.lang.Throwable -> L30
            L2e:
                monitor-exit(r0)
                return
            L30:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qd.f.a(boolean):void");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/NativeProtocol$FBLiteAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qd$b */
    /* loaded from: classes2.dex */
    static final class b extends f {
        public static final a a = new a((byte) 0);

        @Override // defpackage.qd.f
        public final String a() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        @Override // defpackage.qd.f
        public final String b() {
            return "com.facebook.lite";
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/NativeProtocol$FBLiteAppInfo$Companion;", "", "()V", "FACEBOOK_LITE_ACTIVITY", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: qd$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "", "()V", "<set-?>", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "appInfo", "getAppInfo", "()Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "protocolVersion", "getProtocolVersion", "()I", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qd$g */
    /* loaded from: classes2.dex */
    public static final class g {
        public static final a b = new a((byte) 0);
        int a;
        private f c;

        private g() {
        }

        public /* synthetic */ g(byte b2) {
            this();
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult$Companion;", "", "()V", "create", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "nativeAppInfo", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "protocolVersion", "", "createEmpty", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: qd$g$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public static g a() {
                g gVar = new g((byte) 0);
                gVar.a = -1;
                return gVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/facebook/internal/NativeProtocol$KatanaAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "isAndroidAPIVersionNotLessThan30", "", "onAvailableVersionsNullOrEmpty", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qd$d */
    /* loaded from: classes2.dex */
    public static final class d extends f {
        @Override // defpackage.qd.f
        public final String a() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // defpackage.qd.f
        public final String b() {
            return "com.facebook.katana";
        }

        @Override // defpackage.qd.f
        public final void d() {
            if (ly.k().getApplicationInfo().targetSdkVersion >= 30) {
                qd qdVar = qd.a;
                qd.c();
            }
        }
    }
}
