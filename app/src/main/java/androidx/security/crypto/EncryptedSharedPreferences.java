package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.collection.ArraySet;
import defpackage.bxr;
import defpackage.byv;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String NULL_VALUE = "__NULL__";
    private static final String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final String mFileName;
    final bxo mKeyDeterministicAead;
    final List<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new ArrayList();
    final String mMasterKeyAlias;
    final SharedPreferences mSharedPreferences;
    final bxm mValueAead;

    EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, bxm bxmVar, bxo bxoVar) {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mMasterKeyAlias = str2;
        this.mValueAead = bxmVar;
        this.mKeyDeterministicAead = bxoVar;
    }

    public static SharedPreferences create(Context context, String str, MasterKey masterKey, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        return create(str, masterKey.getKeyAlias(), context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    @Deprecated
    public static SharedPreferences create(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        byt.a();
        byf.a();
        Context applicationContext = context.getApplicationContext();
        byv.a aVar = new byv.a();
        aVar.c = prefKeyEncryptionScheme.getKeyTemplate();
        bxt a = aVar.a(applicationContext, KEY_KEYSET_ALIAS, str).a("android-keystore://".concat(String.valueOf(str2))).a().a();
        byv.a aVar2 = new byv.a();
        aVar2.c = prefValueEncryptionScheme.getKeyTemplate();
        bxt a2 = aVar2.a(applicationContext, VALUE_KEYSET_ALIAS, str).a("android-keystore://".concat(String.valueOf(str2))).a().a();
        bxo bxoVar = (bxo) a.a(bxo.class);
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (bxm) a2.a(bxm.class), bxoVar);
    }

    /* JADX WARN: Init of enum AES256_SIV can be incorrect */
    /* loaded from: classes.dex */
    public enum PrefKeyEncryptionScheme {
        AES256_SIV(bxr.a("type.googleapis.com/google.crypto.tink.AesSivKey", caw.a().a().g().g(), r1));
        
        private final bxr mDeterministicAeadKeyTemplate;

        static {
            int i = bxr.a.a;
            new bys();
        }

        PrefKeyEncryptionScheme(bxr bxrVar) {
            this.mDeterministicAeadKeyTemplate = bxrVar;
        }

        final bxr getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    /* JADX WARN: Init of enum AES256_GCM can be incorrect */
    /* loaded from: classes.dex */
    public enum PrefValueEncryptionScheme {
        AES256_GCM(bxr.a("type.googleapis.com/google.crypto.tink.AesGcmKey", cao.a().a().g().g(), r1));
        
        private final bxr mAeadKeyTemplate;

        static {
            int i = bxr.a.a;
            new byk();
        }

        PrefValueEncryptionScheme(bxr bxrVar) {
            this.mAeadKeyTemplate = bxrVar;
        }

        final bxr getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    /* loaded from: classes.dex */
    static final class Editor implements SharedPreferences.Editor {
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final List<String> mKeysChanged = new CopyOnWriteArrayList();

        Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new ArraySet<>();
                set.add(EncryptedSharedPreferences.NULL_VALUE);
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EncryptedType.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.getId());
            allocate.putInt(i);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.getId());
            allocate.putLong(j);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.getId());
            allocate.putFloat(f);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : (byte) 0);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
            this.mKeysChanged.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String str : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(str) && !this.mEncryptedSharedPreferences.isReservedKey(str)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                    }
                }
            }
        }

        private void putEncryptedObject(String str, byte[] bArr) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.mKeysChanged.add(str);
            if (str == null) {
                str = EncryptedSharedPreferences.NULL_VALUE;
            }
            try {
                Pair<String, String> encryptKeyValuePair = this.mEncryptedSharedPreferences.encryptKeyValuePair(str, bArr);
                this.mEditor.putString((String) encryptKeyValuePair.first, (String) encryptKeyValuePair.second);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
            }
        }

        private void notifyListeners() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.mEncryptedSharedPreferences.mListeners) {
                for (String str : this.mKeysChanged) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, str);
                }
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey(entry.getKey())) {
                String decryptKey = decryptKey(entry.getKey());
                hashMap.put(decryptKey, getDecryptedObject(decryptKey));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof String)) ? str2 : (String) decryptedObject;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof Set) {
            set2 = (Set) decryptedObject;
        } else {
            set2 = new ArraySet<>();
        }
        return set2.size() > 0 ? set2 : set;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Integer)) ? i : ((Integer) decryptedObject).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Long)) ? j : ((Long) decryptedObject).longValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Float)) ? f : ((Float) decryptedObject).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Boolean)) ? z : ((Boolean) decryptedObject).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        return this.mSharedPreferences.contains(encryptKey(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        EncryptedType(int i) {
            this.mId = i;
        }

        public final int getId() {
            return this.mId;
        }

        public static EncryptedType fromId(int i) {
            if (i != 0) {
                if (i == 1) {
                    return STRING_SET;
                }
                if (i == 2) {
                    return INT;
                }
                if (i == 3) {
                    return LONG;
                }
                if (i == 4) {
                    return FLOAT;
                }
                if (i == 5) {
                    return BOOLEAN;
                }
                return null;
            }
            return STRING;
        }
    }

    private Object getDecryptedObject(String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            String encryptKey = encryptKey(str);
            String string = this.mSharedPreferences.getString(encryptKey, null);
            if (string == null) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(this.mValueAead.b(cfv.a(string), encryptKey.getBytes(StandardCharsets.UTF_8)));
            boolean z = false;
            wrap.position(0);
            switch (AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.fromId(wrap.getInt()).ordinal()]) {
                case 1:
                    int i = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (!charBuffer.equals(NULL_VALUE)) {
                        return charBuffer;
                    }
                    return null;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    if (wrap.get() != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                case 6:
                    ArraySet arraySet = new ArraySet();
                    while (wrap.hasRemaining()) {
                        int i2 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i2);
                        wrap.position(wrap.position() + i2);
                        arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (arraySet.size() == 1 && NULL_VALUE.equals(arraySet.valueAt(0))) {
                        return null;
                    }
                    return arraySet;
                default:
                    return null;
            }
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType = iArr;
            try {
                iArr[EncryptedType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    final String encryptKey(String str) {
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            return cfv.a(this.mKeyDeterministicAead.a(str.getBytes(StandardCharsets.UTF_8), this.mFileName.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    final String decryptKey(String str) {
        try {
            String str2 = new String(this.mKeyDeterministicAead.b(cfv.a(str), this.mFileName.getBytes()), StandardCharsets.UTF_8);
            if (!str2.equals(NULL_VALUE)) {
                return str2;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    final boolean isReservedKey(String str) {
        return KEY_KEYSET_ALIAS.equals(str) || VALUE_KEYSET_ALIAS.equals(str);
    }

    final Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) throws GeneralSecurityException {
        String encryptKey = encryptKey(str);
        return new Pair<>(encryptKey, cfv.a(this.mValueAead.a(bArr, encryptKey.getBytes(StandardCharsets.UTF_8))));
    }
}
