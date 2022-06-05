package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class NavType<T> {
    private final boolean mNullableAllowed;
    public static final NavType<Integer> IntType = new NavType<Integer>(false) { // from class: androidx.navigation.NavType.1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_INT;
        }

        public void put(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }
    };
    public static final NavType<Integer> ReferenceType = new NavType<Integer>(false) { // from class: androidx.navigation.NavType.2
        @Override // androidx.navigation.NavType
        public String getName() {
            return "reference";
        }

        public void put(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String str) {
            throw new UnsupportedOperationException("References don't support parsing string values.");
        }
    };
    public static final NavType<int[]> IntArrayType = new NavType<int[]>(true) { // from class: androidx.navigation.NavType.3
        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer[]";
        }

        public void put(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }

        @Override // androidx.navigation.NavType
        public int[] get(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public int[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };
    public static final NavType<Long> LongType = new NavType<Long>(false) { // from class: androidx.navigation.NavType.4
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long";
        }

        public void put(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }
    };
    public static final NavType<long[]> LongArrayType = new NavType<long[]>(true) { // from class: androidx.navigation.NavType.5
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long[]";
        }

        public void put(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }

        @Override // androidx.navigation.NavType
        public long[] get(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public long[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };
    public static final NavType<Float> FloatType = new NavType<Float>(false) { // from class: androidx.navigation.NavType.6
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_FLOAT;
        }

        public void put(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }
    };
    public static final NavType<float[]> FloatArrayType = new NavType<float[]>(true) { // from class: androidx.navigation.NavType.7
        @Override // androidx.navigation.NavType
        public String getName() {
            return "float[]";
        }

        public void put(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }

        @Override // androidx.navigation.NavType
        public float[] get(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public float[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };
    public static final NavType<Boolean> BoolType = new NavType<Boolean>(false) { // from class: androidx.navigation.NavType.8
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_BOOLEAN;
        }

        public void put(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }
    };
    public static final NavType<boolean[]> BoolArrayType = new NavType<boolean[]>(true) { // from class: androidx.navigation.NavType.9
        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean[]";
        }

        public void put(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }

        @Override // androidx.navigation.NavType
        public boolean[] get(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public boolean[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };
    public static final NavType<String> StringType = new NavType<String>(true) { // from class: androidx.navigation.NavType.10
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_STRING;
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String str) {
            return str;
        }

        public void put(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }

        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }
    };
    public static final NavType<String[]> StringArrayType = new NavType<String[]>(true) { // from class: androidx.navigation.NavType.11
        @Override // androidx.navigation.NavType
        public String getName() {
            return "string[]";
        }

        public void put(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }

        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };

    public abstract T get(Bundle bundle, String str);

    public abstract String getName();

    public abstract T parseValue(String str);

    public abstract void put(Bundle bundle, String str, T t);

    NavType(boolean z) {
        this.mNullableAllowed = z;
    }

    public boolean isNullableAllowed() {
        return this.mNullableAllowed;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T parseAndPut(Bundle bundle, String str, String str2) {
        T parseValue = parseValue(str2);
        put(bundle, str, parseValue);
        return parseValue;
    }

    public String toString() {
        return getName();
    }

    public static NavType<?> fromArgType(String str, String str2) {
        String str3;
        if (IntType.getName().equals(str)) {
            return IntType;
        }
        if (IntArrayType.getName().equals(str)) {
            return IntArrayType;
        }
        if (LongType.getName().equals(str)) {
            return LongType;
        }
        if (LongArrayType.getName().equals(str)) {
            return LongArrayType;
        }
        if (BoolType.getName().equals(str)) {
            return BoolType;
        }
        if (BoolArrayType.getName().equals(str)) {
            return BoolArrayType;
        }
        if (StringType.getName().equals(str)) {
            return StringType;
        }
        if (StringArrayType.getName().equals(str)) {
            return StringArrayType;
        }
        if (FloatType.getName().equals(str)) {
            return FloatType;
        }
        if (FloatArrayType.getName().equals(str)) {
            return FloatArrayType;
        }
        if (ReferenceType.getName().equals(str)) {
            return ReferenceType;
        }
        if (str != null && !str.isEmpty()) {
            try {
                if (!str.startsWith(".") || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                if (str.endsWith("[]")) {
                    str3 = str3.substring(0, str3.length() - 2);
                    Class<?> cls = Class.forName(str3);
                    if (Parcelable.class.isAssignableFrom(cls)) {
                        return new ParcelableArrayType(cls);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        return new SerializableArrayType(cls);
                    }
                } else {
                    Class<?> cls2 = Class.forName(str3);
                    if (Parcelable.class.isAssignableFrom(cls2)) {
                        return new ParcelableType(cls2);
                    }
                    if (Enum.class.isAssignableFrom(cls2)) {
                        return new EnumType(cls2);
                    }
                    if (Serializable.class.isAssignableFrom(cls2)) {
                        return new SerializableType(cls2);
                    }
                }
                throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return StringType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NavType inferFromValue(String str) {
        try {
            try {
                try {
                    try {
                        IntType.parseValue(str);
                        return IntType;
                    } catch (IllegalArgumentException unused) {
                        return StringType;
                    }
                } catch (IllegalArgumentException unused2) {
                    FloatType.parseValue(str);
                    return FloatType;
                }
            } catch (IllegalArgumentException unused3) {
                BoolType.parseValue(str);
                return BoolType;
            }
        } catch (IllegalArgumentException unused4) {
            LongType.parseValue(str);
            return LongType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NavType inferFromValueType(Object obj) {
        if (obj instanceof Integer) {
            return IntType;
        }
        if (obj instanceof int[]) {
            return IntArrayType;
        }
        if (obj instanceof Long) {
            return LongType;
        }
        if (obj instanceof long[]) {
            return LongArrayType;
        }
        if (obj instanceof Float) {
            return FloatType;
        }
        if (obj instanceof float[]) {
            return FloatArrayType;
        }
        if (obj instanceof Boolean) {
            return BoolType;
        }
        if (obj instanceof boolean[]) {
            return BoolArrayType;
        }
        if ((obj instanceof String) || obj == null) {
            return StringType;
        }
        if (obj instanceof String[]) {
            return StringArrayType;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new ParcelableArrayType(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new SerializableArrayType(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new ParcelableType(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new EnumType(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new SerializableType(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    /* loaded from: classes.dex */
    public static final class ParcelableType<D> extends NavType<D> {
        private final Class<D> mType;

        public ParcelableType(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
            }
            this.mType = cls;
        }

        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String str, D d) {
            this.mType.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (!(d instanceof Serializable)) {
            } else {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        @Override // androidx.navigation.NavType
        public final D get(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public final D parseValue(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.mType.getName();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.mType.equals(((ParcelableType) obj).mType);
            }
            return false;
        }

        public final int hashCode() {
            return this.mType.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class<D[]> mArrayType;

        public ParcelableArrayType(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.mArrayType = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public final void put(Bundle bundle, String str, D[] dArr) {
            this.mArrayType.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }

        @Override // androidx.navigation.NavType
        public final D[] get(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // androidx.navigation.NavType
        public final D[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.mArrayType.getName();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.mArrayType.equals(((ParcelableArrayType) obj).mArrayType);
            }
            return false;
        }

        public final int hashCode() {
            return this.mArrayType.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class<D> mType;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Object obj) {
            put(bundle, str, (String) obj);
        }

        public SerializableType(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (cls.isEnum()) {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            } else {
                this.mType = cls;
            }
        }

        SerializableType(boolean z, Class<D> cls) {
            super(z);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            this.mType = cls;
        }

        public void put(Bundle bundle, String str, D d) {
            this.mType.cast(d);
            bundle.putSerializable(str, d);
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.mType.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableType) {
                return this.mType.equals(((SerializableType) obj).mType);
            }
            return false;
        }

        public int hashCode() {
            return this.mType.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class EnumType<D extends Enum> extends SerializableType<D> {
        private final Class<D> mType;

        public EnumType(Class<D> cls) {
            super(false, cls);
            if (!cls.isEnum()) {
                throw new IllegalArgumentException(cls + " is not an Enum type.");
            }
            this.mType = cls;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public final D parseValue(String str) {
            D[] enumConstants;
            for (D d : this.mType.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.mType.getName() + ".");
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public final String getName() {
            return this.mType.getName();
        }
    }

    /* loaded from: classes.dex */
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class<D[]> mArrayType;

        public SerializableArrayType(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.mArrayType = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void put(Bundle bundle, String str, D[] dArr) {
            this.mArrayType.cast(dArr);
            bundle.putSerializable(str, dArr);
        }

        @Override // androidx.navigation.NavType
        public final D[] get(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // androidx.navigation.NavType
        public final D[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.mArrayType.getName();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.mArrayType.equals(((SerializableArrayType) obj).mArrayType);
            }
            return false;
        }

        public final int hashCode() {
            return this.mArrayType.hashCode();
        }
    }
}
