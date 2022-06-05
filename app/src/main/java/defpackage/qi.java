package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.FacebookException;
import defpackage.lk;
import defpackage.lz;
import defpackage.pr;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001:\bð\u0001ñ\u0001ò\u0001ó\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u000200H\u0002J \u00101\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0002J'\u00102\u001a\u00020 \"\u0004\b\u0000\u001032\b\u00104\u001a\u0004\u0018\u0001H32\b\u00105\u001a\u0004\u0018\u0001H3H\u0007¢\u0006\u0002\u00106J7\u00107\u001a\u0012\u0012\u0004\u0012\u0002H308j\b\u0012\u0004\u0012\u0002H3`9\"\u0004\b\u0000\u001032\u0012\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u0002H30;\"\u0002H3H\u0007¢\u0006\u0002\u0010<J-\u0010=\u001a\b\u0012\u0004\u0012\u0002H30>\"\u0004\b\u0000\u001032\u0012\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u0002H30;\"\u0002H3H\u0007¢\u0006\u0002\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\u0004H\u0007J&\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u00042\b\u0010F\u001a\u0004\u0018\u00010\u00042\b\u0010G\u001a\u0004\u0018\u00010HH\u0007J\b\u0010I\u001a\u00020*H\u0007J\u0018\u0010J\u001a\u00020*2\u0006\u0010/\u001a\u0002002\u0006\u0010K\u001a\u00020\u0004H\u0002J\u0010\u0010L\u001a\u00020*2\u0006\u0010/\u001a\u000200H\u0007J\u0012\u0010M\u001a\u00020*2\b\u0010N\u001a\u0004\u0018\u00010OH\u0007J\u001e\u0010P\u001a\u0004\u0018\u00010\u00042\b\u0010Q\u001a\u0004\u0018\u00010\u00042\b\u0010R\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020UH\u0002J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040>2\u0006\u0010W\u001a\u00020XH\u0007J\u001c\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010Z2\u0006\u0010[\u001a\u00020\u001aH\u0007J\u001c\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040Z2\u0006\u0010[\u001a\u00020\u001aH\u0007J\u001a\u0010]\u001a\u00020\u00062\b\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020aH\u0007J\u0012\u0010b\u001a\u00020*2\b\u0010c\u001a\u0004\u0018\u00010dH\u0007J\u0012\u0010e\u001a\u00020*2\b\u0010f\u001a\u0004\u0018\u00010gH\u0007J\b\u0010h\u001a\u00020 H\u0002J4\u0010i\u001a\n\u0012\u0004\u0012\u0002H3\u0018\u00010>\"\u0004\b\u0000\u001032\u000e\u0010j\u001a\n\u0012\u0004\u0012\u0002H3\u0018\u00010>2\f\u0010k\u001a\b\u0012\u0004\u0012\u0002H30lH\u0007J\u0010\u0010m\u001a\u00020\u00042\u0006\u0010n\u001a\u00020\u0006H\u0007J\u0012\u0010o\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u000100H\u0007J\u0010\u0010p\u001a\u00020\u00042\u0006\u0010/\u001a\u000200H\u0007J\n\u0010q\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010r\u001a\u0004\u0018\u00010s2\b\u0010t\u001a\u0004\u0018\u00010H2\b\u0010u\u001a\u0004\u0018\u00010\u00042\u0006\u0010v\u001a\u00020sH\u0007J\u0010\u0010w\u001a\u00020\u00132\u0006\u0010x\u001a\u00020DH\u0007J\n\u0010y\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010z\u001a\u00020\u00042\b\u0010{\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010|\u001a\u00020}2\u0006\u0010B\u001a\u00020\u0004H\u0002J\u0019\u0010~\u001a\u00020*2\u0006\u0010B\u001a\u00020\u00042\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J\u0013\u0010\u0081\u0001\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u000100H\u0007JL\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u00012\f\u0010\u0084\u0001\u001a\u0007\u0012\u0002\b\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u00042!\u0010\u0087\u0001\u001a\u0011\u0012\r\b\u0001\u0012\t\u0012\u0002\b\u0003\u0018\u00010\u0085\u00010;\"\t\u0012\u0002\b\u0003\u0018\u00010\u0085\u0001H\u0007¢\u0006\u0003\u0010\u0088\u0001JG\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00020\u00042!\u0010\u0087\u0001\u001a\u0011\u0012\r\b\u0001\u0012\t\u0012\u0002\b\u0003\u0018\u00010\u0085\u00010;\"\t\u0012\u0002\b\u0003\u0018\u00010\u0085\u0001H\u0007¢\u0006\u0003\u0010\u008a\u0001J\u0014\u0010\u008b\u0001\u001a\u00020\u00042\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J(\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010[\u001a\u00020\u001a2\b\u0010u\u001a\u0004\u0018\u00010\u00042\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010DH\u0007J\u0013\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u001aH\u0007J\u001d\u0010\u0094\u0001\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u00010\u001a2\b\u00105\u001a\u0004\u0018\u00010\u001aH\u0007J\u001c\u0010\u0095\u0001\u001a\u00020\u00042\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010T\u001a\u00030\u0098\u0001H\u0002J;\u0010\u0099\u0001\u001a\u0014\u0012\u0004\u0012\u0002H30\u009a\u0001j\t\u0012\u0004\u0012\u0002H3`\u009b\u0001\"\u0004\b\u0000\u001032\u0012\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u0002H30;\"\u0002H3H\u0007¢\u0006\u0003\u0010\u009c\u0001J\u001d\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u009e\u0001\u001a\u00020\u00042\u0007\u0010T\u001a\u00030\u0098\u0001H\u0002J\u001c\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u009e\u0001\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u0004H\u0002J$\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00012\n\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010 \u0001H\u0007J?\u0010£\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010¤\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010¥\u0001\u001a\u00030\u0083\u00012\u0017\u0010¦\u0001\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010;\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0007J\u0011\u0010©\u0001\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0007J\u0014\u0010ª\u0001\u001a\u00020 2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010DH\u0007J\u0015\u0010«\u0001\u001a\u00020 2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0007J\u0014\u0010®\u0001\u001a\u00020 2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010DH\u0007J\u0011\u0010¯\u0001\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0002J\u0013\u0010°\u0001\u001a\u00020 2\b\u0010Q\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010°\u0001\u001a\u00020 \"\u0004\b\u0000\u001032\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u0002H3\u0018\u00010²\u0001H\u0007J3\u0010³\u0001\u001a\u00020 \"\u0004\b\u0000\u001032\u0010\u0010´\u0001\u001a\u000b\u0012\u0004\u0012\u0002H3\u0018\u00010²\u00012\u0010\u0010µ\u0001\u001a\u000b\u0012\u0004\u0012\u0002H3\u0018\u00010²\u0001H\u0007J\u0014\u0010¶\u0001\u001a\u00020 2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010DH\u0007J\u0018\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040¸\u00012\u0006\u0010W\u001a\u00020XH\u0007J\u0017\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040>2\u0006\u0010W\u001a\u00020XH\u0007J\u001e\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040Z2\u0007\u0010»\u0001\u001a\u00020\u0004H\u0007J'\u0010¼\u0001\u001a\u00020*2\t\u0010½\u0001\u001a\u0004\u0018\u00010\u00042\u0011\u0010¾\u0001\u001a\f\u0018\u00010¿\u0001j\u0005\u0018\u0001`À\u0001H\u0007J\u001f\u0010¼\u0001\u001a\u00020*2\t\u0010½\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J+\u0010¼\u0001\u001a\u00020*2\t\u0010½\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u00042\n\u0010Â\u0001\u001a\u0005\u0018\u00010Ã\u0001H\u0007JF\u0010Ä\u0001\u001a\u000b\u0012\u0005\u0012\u0003HÅ\u0001\u0018\u00010>\"\u0004\b\u0000\u00103\"\u0005\b\u0001\u0010Å\u00012\u000e\u0010j\u001a\n\u0012\u0004\u0012\u0002H3\u0018\u00010>2\u0015\u0010Æ\u0001\u001a\u0010\u0012\u0004\u0012\u0002H3\u0012\u0005\u0012\u0003HÅ\u00010Ç\u0001H\u0007J\"\u0010È\u0001\u001a\u00020\u00042\u0017\u0010Ä\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040ZH\u0007J\u0013\u0010É\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010u\u001a\u00020\u0004H\u0007J\u0011\u0010Ê\u0001\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0007J\u0014\u0010Ë\u0001\u001a\u00020H2\t\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J.\u0010Í\u0001\u001a\u00020*2\u0006\u00105\u001a\u00020H2\b\u0010u\u001a\u0004\u0018\u00010\u00042\u0011\u0010Î\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010>H\u0007J&\u0010Ï\u0001\u001a\u00020 2\u0006\u0010t\u001a\u00020H2\b\u0010u\u001a\u0004\u0018\u00010\u00042\t\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0001H\u0007J&\u0010Ñ\u0001\u001a\u00020*2\u0006\u00105\u001a\u00020H2\b\u0010u\u001a\u0004\u0018\u00010\u00042\t\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010Ò\u0001\u001a\u00020*2\u0006\u00105\u001a\u00020H2\b\u0010u\u001a\u0004\u0018\u00010\u00042\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010DH\u0007J\u0013\u0010Ó\u0001\u001a\u00020\u00042\b\u0010^\u001a\u0004\u0018\u00010_H\u0007J%\u0010Ô\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010Z2\b\u0010Õ\u0001\u001a\u00030Ö\u0001H\u0007J\t\u0010×\u0001\u001a\u00020*H\u0002J\t\u0010Ø\u0001\u001a\u00020\u0006H\u0002J\u0012\u0010Ù\u0001\u001a\u00020*2\u0007\u0010Ú\u0001\u001a\u000200H\u0002J\u0012\u0010Û\u0001\u001a\u00020*2\u0007\u0010Ú\u0001\u001a\u000200H\u0002J\t\u0010Ü\u0001\u001a\u00020*H\u0002J\t\u0010Ý\u0001\u001a\u00020*H\u0002J\u0015\u0010Þ\u0001\u001a\u00020*2\n\u0010ß\u0001\u001a\u0005\u0018\u00010à\u0001H\u0007J\u001f\u0010á\u0001\u001a\u00020\u00042\t\u0010â\u0001\u001a\u0004\u0018\u00010\u001a2\t\u0010ã\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J6\u0010ä\u0001\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010\u00042\u0007\u0010å\u0001\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0007J\u001a\u0010æ\u0001\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001a2\u0007\u0010Ú\u0001\u001a\u000200H\u0007J\u0014\u0010ç\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010T\u001a\u00030\u0098\u0001H\u0007J\u0013\u0010ç\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010u\u001a\u00020\u0004H\u0007J\u0016\u0010è\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010T\u001a\u0005\u0018\u00010\u0098\u0001H\u0007J\u0015\u0010è\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010u\u001a\u0004\u0018\u00010\u0004H\u0007J\u001d\u0010é\u0001\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010ê\u0001\u001a\u0004\u0018\u00010X2\t\u0010â\u0001\u001a\u0004\u0018\u00010\u001a2\t\u0010ë\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010ì\u0001\u001a\u0004\u0018\u00010\u001a2\t\u0010â\u0001\u001a\u0004\u0018\u00010\u001a2\t\u0010ë\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J0\u0010í\u0001\u001a\t\u0012\u0004\u0012\u0002H30²\u0001\"\u0004\b\u0000\u001032\u0012\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u0002H30;\"\u0002H3H\u0007¢\u0006\u0003\u0010î\u0001J.\u0010ï\u0001\u001a\u00020*2\b\u0010Õ\u0001\u001a\u00030Ö\u00012\u0019\u0010Ä\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010ZH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\u001f\u0010\"R\u0011\u0010#\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u000e\u0010$\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010%\u001a\u0004\u0018\u00010\u00168G¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u000e\u0010'\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006ô\u0001"}, d2 = {"Lcom/facebook/internal/Utility;", "", "()V", "ARC_DEVICE_PATTERN", "", "DEFAULT_STREAM_BUFFER_SIZE", "", "EXTRA_APP_EVENTS_INFO_FORMAT_VERSION", "FACEBOOK_PROFILE_FIELDS", "HASH_ALGORITHM_MD5", "HASH_ALGORITHM_SHA1", "HASH_ALGORITHM_SHA256", "INSTAGRAM_PROFILE_FIELDS", "LOG_TAG", "NO_CARRIER", "REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS", "URL_SCHEME", "UTF8", "availableExternalStorageGB", "", "carrierName", "currentLocale", "Ljava/util/Locale;", "getCurrentLocale", "()Ljava/util/Locale;", "dataProcessingOptions", "Lorg/json/JSONObject;", "getDataProcessingOptions", "()Lorg/json/JSONObject;", "deviceTimeZoneName", "deviceTimezoneAbbreviation", "isAutoAppLinkSetup", "", "isAutoAppLinkSetup$annotations", "()Z", "isDataProcessingRestricted", "numCPUCores", "resourceLocale", "getResourceLocale", "timestampOfLastCheck", "totalExternalStorageGB", "appendAnonIdUnderCompliance", "", "params", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "context", "Landroid/content/Context;", "appendAttributionIdUnderCompliance", "areObjectsEqual", ExifInterface.GPS_DIRECTION_TRUE, "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "arrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ts", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "asListNoNulls", "", "array", "([Ljava/lang/Object;)Ljava/util/List;", "awaitGetGraphMeRequestWithCache", "accessToken", "buildUri", "Landroid/net/Uri;", "authority", "path", "parameters", "Landroid/os/Bundle;", "clearCaches", "clearCookiesForDomain", "domain", "clearFacebookCookies", "closeQuietly", "closeable", "Ljava/io/Closeable;", "coerceValueIfNullOrEmpty", "s", "valueIfNullOrEmpty", "convertBytesToGB", "bytes", "", "convertJSONArrayToList", "jsonArray", "Lorg/json/JSONArray;", "convertJSONObjectToHashMap", "", "jsonObject", "convertJSONObjectToStringMap", "copyAndCloseInputStream", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "deleteDirectory", "directoryOrFile", "Ljava/io/File;", "disconnectQuietly", "connection", "Ljava/net/URLConnection;", "externalStorageExists", "filter", TypedValues.Attributes.S_TARGET, "predicate", "Lcom/facebook/internal/Utility$Predicate;", "generateRandomString", "length", "getActivityName", "getAppName", "getAppVersion", "getBundleLongAsDate", "Ljava/util/Date;", "bundle", "key", "dateBase", "getContentSize", "contentUri", "getCurrentTokenDomainWithDefault", "getGraphDomainFromTokenDomain", "tokenGraphDomain", "getGraphMeRequestWithCache", "Lcom/facebook/GraphRequest;", "getGraphMeRequestWithCacheAsync", "callback", "Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "getMetadataApplicationId", "getMethodQuietly", "Ljava/lang/reflect/Method;", "clazz", "Ljava/lang/Class;", "methodName", "parameterTypes", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getProfileFieldsForGraphDomain", "graphDomain", "getStringPropertyAsJSON", "nonJSONPropertyKey", "getUriString", "uri", "handlePermissionResponse", "Lcom/facebook/internal/Utility$PermissionsLists;", "result", "hasSameId", "hashBytes", "hash", "Ljava/security/MessageDigest;", "", "hashSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "([Ljava/lang/Object;)Ljava/util/HashSet;", "hashWithAlgorithm", "algorithm", "intersectRanges", "", "range1", "range2", "invokeMethodQuietly", "receiver", "method", "args", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "isAutofillAvailable", "isChromeOS", "isContentUri", "isCurrentAccessToken", "token", "Lcom/facebook/AccessToken;", "isFileUri", "isGooglePlayServicesAvailable", "isNullOrEmpty", "c", "", "isSubset", "subset", "superset", "isWebUri", "jsonArrayToSet", "", "jsonArrayToStringList", "jsonStrToMap", "str", "logd", "tag", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", NotificationCompat.CATEGORY_MESSAGE, "t", "", "map", "K", "mapper", "Lcom/facebook/internal/Utility$Mapper;", "mapToJsonStr", "md5hash", "mustFixWindowParamsForAutofill", "parseUrlQueryString", "queryString", "putCommaSeparatedStringList", "list", "putJSONValueInBundle", "value", "putNonEmptyString", "putUri", "readStreamToString", "readStringMapFromParcel", "parcel", "Landroid/os/Parcel;", "refreshAvailableExternalStorage", "refreshBestGuessNumberOfCPUCores", "refreshCarrierName", "appContext", "refreshPeriodicExtendedDeviceInfo", "refreshTimezone", "refreshTotalExternalStorage", "runOnNonUiThread", "runnable", "Ljava/lang/Runnable;", "safeGetStringFromResponse", "response", "propertyName", "setAppEventAttributionParameters", "limitEventUsage", "setAppEventExtendedDeviceInfoParameters", "sha1hash", "sha256hash", "stringsEqualOrEmpty", "tryGetJSONArrayFromResponse", "propertyKey", "tryGetJSONObjectFromResponse", "unmodifiableCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "writeStringMapToParcel", "GraphMeRequestWithCacheCallback", "Mapper", "PermissionsLists", "Predicate", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qi  reason: default package */
/* loaded from: classes2.dex */
public final class qi {
    private static int b;
    public static final qi a = new qi();
    private static long c = -1;
    private static long d = -1;
    private static long e = -1;
    private static String f = "";
    private static String g = "";
    private static String h = "NoCarrier";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "", "onFailure", "", "error", "Lcom/facebook/FacebookException;", "onSuccess", "userInfo", "Lorg/json/JSONObject;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qi$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(FacebookException facebookException);

        void a(JSONObject jSONObject);
    }

    private qi() {
    }

    public static final <T> boolean a(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean a(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final String a(String str, String str2) {
        return a(str) ? str2 : str;
    }

    public static final String b(String str) {
        dqc.d(str, "key");
        return b("MD5", str);
    }

    public static final String a(byte[] bArr) {
        dqc.d(bArr, "bytes");
        return a("SHA-1", bArr);
    }

    public static final String c(String str) {
        if (str == null) {
            return null;
        }
        return b("SHA-256", str);
    }

    private static String b(String str, String str2) {
        Charset charset = dsd.a;
        if (str2 != null) {
            byte[] bytes = str2.getBytes(charset);
            dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
            return a(str, bytes);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private static String a(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            dqc.b(messageDigest, "hash");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString((b2 >> 0) & 15));
            }
            String sb2 = sb.toString();
            dqc.b(sb2, "builder.toString()");
            return sb2;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        dqc.b(build, "builder.build()");
        return build;
    }

    public static final Bundle d(String str) {
        Bundle bundle = new Bundle();
        if (!a(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Object[] array = dsg.a(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                for (String str2 : (String[]) array) {
                    Object[] array2 = dsg.a(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr = (String[]) array2;
                        try {
                            if (strArr.length == 2) {
                                bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                            } else if (strArr.length == 1) {
                                bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                            }
                        } catch (UnsupportedEncodingException e2) {
                            a("FacebookSDK", (Exception) e2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return bundle;
    }

    public static final void a(Bundle bundle, String str, String str2) {
        dqc.d(bundle, "b");
        if (!a(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static final void a(Bundle bundle, String str, Uri uri) {
        dqc.d(bundle, "b");
        if (uri != null) {
            a(bundle, str, uri.toString());
        }
    }

    public static final boolean a(Bundle bundle, String str, Object obj) {
        dqc.d(bundle, "bundle");
        bundle.putString(str, obj.toString());
        return true;
    }

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void a(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final String a(Context context) {
        qj.a((Object) context, "context");
        return ly.m();
    }

    public static final Map<String, Object> a(JSONObject jSONObject) {
        dqc.d(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        for (int i = 0; i < length; i++) {
            try {
                String string = names.getString(i);
                dqc.b(string, "keys.getString(i)");
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = a((JSONObject) obj);
                }
                dqc.b(obj, "value");
                hashMap.put(string, obj);
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static final Map<String, String> b(JSONObject jSONObject) {
        dqc.d(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                dqc.b(next, "key");
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final List<String> a(JSONArray jSONArray) {
        dqc.d(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                dqc.b(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final Object a(JSONObject jSONObject, String str, String str2) throws JSONException {
        dqc.d(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    public static final String a(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            dqc.b(sb2, "stringBuilder.toString()");
                            a((Closeable) bufferedInputStream);
                            a(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a((Closeable) bufferedInputStream);
                    a(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    public static final int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Throwable th;
        dqc.d(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = dsg.a(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array != null) {
            for (String str2 : (String[]) array) {
                Object[] array2 = dsg.a(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr = (String[]) array2;
                    if (strArr.length > 0) {
                        StringBuilder sb = new StringBuilder();
                        String str3 = strArr[0];
                        int length = str3.length() - 1;
                        int i = 0;
                        boolean z = false;
                        while (i <= length) {
                            boolean z2 = dqc.a(str3.charAt(!z ? i : length), 32) <= 0;
                            if (z) {
                                if (!z2) {
                                    break;
                                }
                                length--;
                            } else if (!z2) {
                                z = true;
                            } else {
                                i++;
                            }
                        }
                        sb.append(str3.subSequence(i, length + 1).toString());
                        sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                        cookieManager.setCookie(str, sb.toString());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManager.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final void b(Context context) {
        dqc.d(context, "context");
        a(context, "facebook.com");
        a(context, ".facebook.com");
        a(context, "https://facebook.com");
        a(context, "https://.facebook.com");
    }

    public static final void a(String str, Exception exc) {
        if (!ly.c() || str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(exc.getClass().getSimpleName());
        sb.append(": ");
        sb.append(exc.getMessage());
    }

    public static final void a() {
        ly.c();
    }

    public static final void e(String str) {
        if (ly.c()) {
            a(str);
        }
    }

    public static final <T> boolean a(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return dqc.a(t, t2);
    }

    public static final <T> List<T> a(T... tArr) {
        dqc.d(tArr, "array");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            T t = tArr[i];
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final List<String> b(JSONArray jSONArray) throws JSONException {
        dqc.d(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static final Set<String> c(JSONArray jSONArray) throws JSONException {
        dqc.d(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            dqc.b(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final String a(Map<String, String> map) {
        dqc.d(map, "map");
        String str = "";
        if (map.isEmpty()) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            str = jSONObject.toString();
        } catch (JSONException unused) {
        }
        dqc.b(str, "try {\n        val jsonOb…ion) {\n        \"\"\n      }");
        return str;
    }

    public static final Map<String, String> f(String str) {
        dqc.d(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                dqc.b(next, "key");
                String string = jSONObject.getString(next);
                dqc.b(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void a(JSONObject jSONObject, pg pgVar, String str, boolean z, Context context) throws JSONException {
        dqc.d(jSONObject, "params");
        dqc.d(context, "context");
        if (!pr.a(pr.b.ServiceUpdateCompliance)) {
            jSONObject.put("anon_id", str);
        }
        boolean z2 = true;
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", ly.r());
        if (pgVar != null) {
            if (pr.a(pr.b.ServiceUpdateCompliance)) {
                if (Build.VERSION.SDK_INT < 31 || !g(context)) {
                    jSONObject.put("anon_id", str);
                } else if (!pgVar.c) {
                    jSONObject.put("anon_id", str);
                }
            }
            if (pgVar.a != null) {
                if (!pr.a(pr.b.ServiceUpdateCompliance)) {
                    jSONObject.put("attribution", pgVar.a);
                } else if (Build.VERSION.SDK_INT < 31 || !g(context)) {
                    jSONObject.put("attribution", pgVar.a);
                } else if (!pgVar.c) {
                    jSONObject.put("attribution", pgVar.a);
                }
            }
            if (pgVar.a() != null) {
                jSONObject.put("advertiser_id", pgVar.a());
                jSONObject.put("advertiser_tracking_enabled", !pgVar.c);
            }
            if (!pgVar.c) {
                String b2 = nd.b();
                if (b2.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    jSONObject.put("ud", b2);
                }
            }
            if (pgVar.b == null) {
                return;
            }
            jSONObject.put("installer_package", pgVar.b);
        }
    }

    public static final String b() {
        Context k = ly.k();
        if (k == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = k.getPackageManager().getPackageInfo(k.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final void a(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i;
        Display display;
        PackageInfo packageInfo;
        dqc.d(jSONObject, "params");
        dqc.d(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i2 = 0;
        if (c == -1 || System.currentTimeMillis() - c >= 1800000) {
            c = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                dqc.b(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
                f = displayName;
                dqc.b(timeZone, "tz");
                String id = timeZone.getID();
                dqc.b(id, "tz.id");
                g = id;
            } catch (AssertionError | Exception unused) {
            }
            if (dqc.a((Object) h, (Object) "NoCarrier")) {
                try {
                    Object systemService = context.getSystemService("phone");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    dqc.b(networkOperatorName, "telephonyManager.networkOperatorName");
                    h = networkOperatorName;
                } catch (Exception unused2) {
                }
            }
            try {
                if (k()) {
                    File externalStorageDirectory = Environment.getExternalStorageDirectory();
                    dqc.b(externalStorageDirectory, "path");
                    StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                    d = statFs.getBlockCount() * statFs.getBlockSize();
                }
                d = a(d);
            } catch (Exception unused3) {
            }
            try {
                if (k()) {
                    File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
                    dqc.b(externalStorageDirectory2, "path");
                    StatFs statFs2 = new StatFs(externalStorageDirectory2.getPath());
                    e = statFs2.getAvailableBlocks() * statFs2.getBlockSize();
                }
                e = a(e);
            } catch (Exception unused4) {
            }
        }
        String packageName = context.getPackageName();
        int i3 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused5) {
            str = "";
        }
        if (packageInfo == null) {
            return;
        }
        i3 = packageInfo.versionCode;
        str = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            Resources resources = context.getResources();
            dqc.b(resources, "appContext.resources");
            locale = resources.getConfiguration().locale;
        } catch (Exception unused6) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        dqc.b(locale, "locale");
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(f);
        jSONArray.put(h);
        double d2 = 0.0d;
        try {
            display = null;
            if (Build.VERSION.SDK_INT >= 17) {
                Object systemService2 = context.getSystemService("display");
                if (!(systemService2 instanceof DisplayManager)) {
                    systemService2 = null;
                }
                DisplayManager displayManager = (DisplayManager) systemService2;
                if (displayManager != null) {
                    display = displayManager.getDisplay(0);
                }
            } else {
                Object systemService3 = context.getSystemService("window");
                if (!(systemService3 instanceof WindowManager)) {
                    systemService3 = null;
                }
                WindowManager windowManager = (WindowManager) systemService3;
                if (windowManager != null) {
                    display = windowManager.getDefaultDisplay();
                }
            }
        } catch (Exception unused7) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            try {
                int i5 = displayMetrics.heightPixels;
                try {
                    d2 = displayMetrics.density;
                } catch (Exception unused8) {
                }
                i = i5;
                i2 = i4;
            } catch (Exception unused9) {
                i2 = i4;
            }
            jSONArray.put(i2);
            jSONArray.put(i);
            jSONArray.put(new DecimalFormat("#.##").format(d2));
            jSONArray.put(j());
            jSONArray.put(d);
            jSONArray.put(e);
            jSONArray.put(g);
            jSONObject.put("extinfo", jSONArray.toString());
        }
        i = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(j());
        jSONArray.put(d);
        jSONArray.put(e);
        jSONArray.put(g);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final Method a(Class<?> cls, String str, Class<?>... clsArr) {
        dqc.d(cls, "clazz");
        dqc.d(str, "methodName");
        dqc.d(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method a(String str, String str2, Class<?>... clsArr) {
        dqc.d(str, "className");
        dqc.d(str2, "methodName");
        dqc.d(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            dqc.b(cls, "Class.forName(className)");
            return a(cls, str2, (Class[]) Arrays.copyOf(clsArr, 1));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object a(Object obj, Method method, Object... objArr) {
        dqc.d(method, "method");
        dqc.d(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final String c(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        String simpleName = context.getClass().getSimpleName();
        dqc.b(simpleName, "context.javaClass.simpleName");
        return simpleName;
    }

    public static final boolean a(Uri uri) {
        if (uri != null) {
            return dsg.b("http", uri.getScheme()) || dsg.b("https", uri.getScheme()) || dsg.b("fbstaging", uri.getScheme());
        }
        return false;
    }

    public static final boolean b(Uri uri) {
        return uri != null && dsg.b("content", uri.getScheme());
    }

    public static final boolean c(Uri uri) {
        return uri != null && dsg.b("file", uri.getScheme());
    }

    public static final long d(Uri uri) {
        dqc.d(uri, "contentUri");
        Cursor cursor = null;
        try {
            cursor = ly.k().getContentResolver().query(uri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j = cursor.getLong(columnIndex);
            cursor.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static final Date a(Bundle bundle, String str, Date date) {
        long j;
        dqc.d(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Number) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (j == 0) {
            return new Date((long) LocationRequestCompat.PASSIVE_INTERVAL);
        }
        return new Date(date.getTime() + (j * 1000));
    }

    public static final void a(Parcel parcel, Map<String, String> map) {
        dqc.d(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final Map<String, String> a(Parcel parcel) {
        dqc.d(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static final boolean a(lk lkVar) {
        if (lkVar != null) {
            lk.b bVar = lk.l;
            return dqc.a(lkVar, lk.b.a());
        }
        return false;
    }

    public static final String g(String str) {
        String g2 = ly.g();
        if (str == null) {
            return g2;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1253231569) {
            if (str.equals("gaming")) {
                return dsg.a(g2, "facebook.com", "fb.gg");
            }
        } else if (hashCode == 28903346 && str.equals("instagram")) {
            return dsg.a(g2, "facebook.com", "instagram.com");
        }
        return g2;
    }

    public static final void a(String str, a aVar) {
        dqc.d(str, "accessToken");
        dqc.d(aVar, "callback");
        JSONObject a2 = qf.a(str);
        if (a2 != null) {
            aVar.a(a2);
            return;
        }
        lz i = i(str);
        i.a(new c(aVar, str));
        i.a();
    }

    public static final JSONObject h(String str) {
        dqc.d(str, "accessToken");
        JSONObject a2 = qf.a(str);
        if (a2 != null) {
            return a2;
        }
        mc a3 = lz.k.a(i(str));
        if (a3.c == null) {
            return a3.a;
        }
        return null;
    }

    private static lz i(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", j(i()));
        bundle.putString("access_token", str);
        lz.c cVar = lz.k;
        lz a2 = lz.c.a();
        a2.a(bundle);
        a2.a(md.GET);
        return a2;
    }

    private static String j(String str) {
        return dqc.a((Object) str, (Object) "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    private static String i() {
        lk.b bVar = lk.l;
        lk a2 = lk.b.a();
        return (a2 == null || a2.k == null) ? "facebook" : a2.k;
    }

    private static int j() {
        int i = b;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(d.a);
            if (listFiles != null) {
                b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (b <= 0) {
            b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "fileName", "", "accept"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qi$d */
    /* loaded from: classes2.dex */
    public static final class d implements FilenameFilter {
        public static final d a = new d();

        d() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    private static boolean k() {
        return dqc.a((Object) "mounted", (Object) Environment.getExternalStorageState());
    }

    private static long a(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    private static boolean g(Context context) {
        Method a2 = a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (a2 == null) {
            return false;
        }
        Object a3 = a((Object) null, a2, context);
        return (a3 instanceof Integer) && !(dqc.a(a3, (Object) 0) ^ true);
    }

    public static final b c(JSONObject jSONObject) throws JSONException {
        String optString;
        dqc.d(jSONObject, "result");
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (optString2 != null && !dqc.a((Object) optString2, (Object) "installed") && (optString = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS)) != null) {
                if (dqc.a((Object) optString, (Object) "granted")) {
                    arrayList.add(optString2);
                } else if (dqc.a((Object) optString, (Object) "declined")) {
                    arrayList2.add(optString2);
                } else if (dqc.a((Object) optString, (Object) "expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new b(arrayList, arrayList2, arrayList3);
    }

    public static final String c() {
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        dqc.b(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    public static final boolean d(Context context) {
        AutofillManager autofillManager;
        dqc.d(context, "context");
        dqc.d(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    public static final boolean e(Context context) {
        dqc.d(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        if (Build.DEVICE == null) {
            return false;
        }
        String str = Build.DEVICE;
        dqc.b(str, "Build.DEVICE");
        return new dsf(".+_cheets|cheets_.+").a(str);
    }

    public static final Locale d() {
        try {
            Resources resources = ly.k().getResources();
            dqc.b(resources, "FacebookSdk.getApplicationContext().resources");
            return resources.getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Locale e() {
        Locale d2 = d();
        if (d2 == null) {
            Locale locale = Locale.getDefault();
            dqc.b(locale, "Locale.getDefault()");
            return locale;
        }
        return d2;
    }

    public static final void a(Runnable runnable) {
        try {
            ly.a().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final String f(Context context) {
        String str;
        dqc.d(context, "context");
        try {
            String n = ly.n();
            if (n != null) {
                return n;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                str = applicationInfo.nonLocalizedLabel.toString();
            } else {
                str = context.getString(i);
                dqc.b(str, "context.getString(stringId)");
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final boolean f() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            dqi dqiVar = dqi.a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{ly.m()}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context k = ly.k();
            PackageManager packageManager = k.getPackageManager();
            String packageName = k.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (dqc.a((Object) packageName, (Object) resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final JSONObject g() {
        if (qx.a(qi.class)) {
            return null;
        }
        try {
            String string = ly.k().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, qi.class);
            return null;
        }
    }

    public static final boolean h() {
        if (qx.a(qi.class)) {
            return false;
        }
        try {
            JSONObject g2 = g();
            if (g2 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = g2.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    dqc.b(string, "options.getString(i)");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = string.toLowerCase();
                    dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (dqc.a((Object) lowerCase, (Object) "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, qi.class);
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/Utility$PermissionsLists;", "", "grantedPermissions", "", "", "declinedPermissions", "expiredPermissions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDeclinedPermissions", "()Ljava/util/List;", "setDeclinedPermissions", "(Ljava/util/List;)V", "getExpiredPermissions", "setExpiredPermissions", "getGrantedPermissions", "setGrantedPermissions", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qi$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public List<String> a;
        public List<String> b;
        public List<String> c;

        public b(List<String> list, List<String> list2, List<String> list3) {
            dqc.d(list, "grantedPermissions");
            dqc.d(list2, "declinedPermissions");
            dqc.d(list3, "expiredPermissions");
            this.a = list;
            this.b = list2;
            this.c = list3;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qi$c */
    /* loaded from: classes2.dex */
    static final class c implements lz.b {
        final /* synthetic */ a a;
        final /* synthetic */ String b;

        c(a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        @Override // defpackage.lz.b
        public final void a(mc mcVar) {
            dqc.d(mcVar, "response");
            if (mcVar.c != null) {
                this.a.a(mcVar.c.a);
                return;
            }
            String str = this.b;
            JSONObject jSONObject = mcVar.a;
            if (jSONObject != null) {
                qf.a(str, jSONObject);
                this.a.a(mcVar.a);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
