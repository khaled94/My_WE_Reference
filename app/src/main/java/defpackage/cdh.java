package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* renamed from: cdh  reason: default package */
/* loaded from: classes2.dex */
public enum cdh {
    DOUBLE(0, a.SCALAR, cdn.DOUBLE),
    FLOAT(1, a.SCALAR, cdn.FLOAT),
    INT64(2, a.SCALAR, cdn.LONG),
    UINT64(3, a.SCALAR, cdn.LONG),
    INT32(4, a.SCALAR, cdn.INT),
    FIXED64(5, a.SCALAR, cdn.LONG),
    FIXED32(6, a.SCALAR, cdn.INT),
    BOOL(7, a.SCALAR, cdn.BOOLEAN),
    STRING(8, a.SCALAR, cdn.STRING),
    MESSAGE(9, a.SCALAR, cdn.MESSAGE),
    BYTES(10, a.SCALAR, cdn.BYTE_STRING),
    UINT32(11, a.SCALAR, cdn.INT),
    ENUM(12, a.SCALAR, cdn.ENUM),
    SFIXED32(13, a.SCALAR, cdn.INT),
    SFIXED64(14, a.SCALAR, cdn.LONG),
    SINT32(15, a.SCALAR, cdn.INT),
    SINT64(16, a.SCALAR, cdn.LONG),
    GROUP(17, a.SCALAR, cdn.MESSAGE),
    DOUBLE_LIST(18, a.VECTOR, cdn.DOUBLE),
    FLOAT_LIST(19, a.VECTOR, cdn.FLOAT),
    INT64_LIST(20, a.VECTOR, cdn.LONG),
    UINT64_LIST(21, a.VECTOR, cdn.LONG),
    INT32_LIST(22, a.VECTOR, cdn.INT),
    FIXED64_LIST(23, a.VECTOR, cdn.LONG),
    FIXED32_LIST(24, a.VECTOR, cdn.INT),
    BOOL_LIST(25, a.VECTOR, cdn.BOOLEAN),
    STRING_LIST(26, a.VECTOR, cdn.STRING),
    MESSAGE_LIST(27, a.VECTOR, cdn.MESSAGE),
    BYTES_LIST(28, a.VECTOR, cdn.BYTE_STRING),
    UINT32_LIST(29, a.VECTOR, cdn.INT),
    ENUM_LIST(30, a.VECTOR, cdn.ENUM),
    SFIXED32_LIST(31, a.VECTOR, cdn.INT),
    SFIXED64_LIST(32, a.VECTOR, cdn.LONG),
    SINT32_LIST(33, a.VECTOR, cdn.INT),
    SINT64_LIST(34, a.VECTOR, cdn.LONG),
    DOUBLE_LIST_PACKED(35, a.PACKED_VECTOR, cdn.DOUBLE),
    FLOAT_LIST_PACKED(36, a.PACKED_VECTOR, cdn.FLOAT),
    INT64_LIST_PACKED(37, a.PACKED_VECTOR, cdn.LONG),
    UINT64_LIST_PACKED(38, a.PACKED_VECTOR, cdn.LONG),
    INT32_LIST_PACKED(39, a.PACKED_VECTOR, cdn.INT),
    FIXED64_LIST_PACKED(40, a.PACKED_VECTOR, cdn.LONG),
    FIXED32_LIST_PACKED(41, a.PACKED_VECTOR, cdn.INT),
    BOOL_LIST_PACKED(42, a.PACKED_VECTOR, cdn.BOOLEAN),
    UINT32_LIST_PACKED(43, a.PACKED_VECTOR, cdn.INT),
    ENUM_LIST_PACKED(44, a.PACKED_VECTOR, cdn.ENUM),
    SFIXED32_LIST_PACKED(45, a.PACKED_VECTOR, cdn.INT),
    SFIXED64_LIST_PACKED(46, a.PACKED_VECTOR, cdn.LONG),
    SINT32_LIST_PACKED(47, a.PACKED_VECTOR, cdn.INT),
    SINT64_LIST_PACKED(48, a.PACKED_VECTOR, cdn.LONG),
    GROUP_LIST(49, a.VECTOR, cdn.MESSAGE),
    MAP(50, a.MAP, cdn.VOID);
    
    private static final Type[] EMPTY_TYPES = new Type[0];
    private static final cdh[] VALUES;
    private final a collection;
    private final Class<?> elementType;
    private final int id;
    private final cdn javaType;
    private final boolean primitiveScalar;

    static {
        cdh[] values = values();
        VALUES = new cdh[values.length];
        for (cdh cdhVar : values) {
            VALUES[cdhVar.id] = cdhVar;
        }
    }

    cdh(int i, a aVar, cdn cdnVar) {
        int i2;
        this.id = i;
        this.collection = aVar;
        this.javaType = cdnVar;
        int i3 = AnonymousClass1.a[aVar.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.elementType = cdnVar.getBoxedType();
        } else if (i3 == 2) {
            this.elementType = cdnVar.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (aVar != a.SCALAR || (i2 = AnonymousClass1.b[cdnVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    /* renamed from: cdh$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[cdn.values().length];
            b = iArr;
            try {
                iArr[cdn.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[cdn.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[cdn.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.values().length];
            a = iArr2;
            try {
                iArr2[a.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[a.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final int id() {
        return this.id;
    }

    public final cdn getJavaType() {
        return this.javaType;
    }

    public final boolean isPacked() {
        return a.PACKED_VECTOR.equals(this.collection);
    }

    public final boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public final boolean isScalar() {
        return this.collection == a.SCALAR;
    }

    public final boolean isList() {
        return this.collection.isList();
    }

    public final boolean isMap() {
        return this.collection == a.MAP;
    }

    public final boolean isValidForField(Field field) {
        if (a.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static cdh forId(int i) {
        if (i >= 0) {
            cdh[] cdhVarArr = VALUES;
            if (i < cdhVarArr.length) {
                return cdhVarArr[i];
            }
            return null;
        }
        return null;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        Type[] genericInterfaces;
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType) || !List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return null;
        }
        return genericSuperclass;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        boolean z;
        while (true) {
            int i = 0;
            if (cls != List.class) {
                Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length != typeParameters.length) {
                                throw new RuntimeException("Type array mismatch");
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 >= typeParameters.length) {
                                    z = false;
                                    break;
                                } else if (type == typeParameters[i3]) {
                                    actualTypeArguments[i2] = typeArr[i3];
                                    z = true;
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (!z) {
                                throw new RuntimeException("Unable to find replacement for ".concat(String.valueOf(type)));
                            }
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            Class<?> cls2 = interfaces[i];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else if (typeArr.length != 1) {
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            } else {
                return typeArr[0];
            }
        }
    }

    /* renamed from: cdh$a */
    /* loaded from: classes2.dex */
    enum a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        private final boolean isList;

        a(boolean z) {
            this.isList = z;
        }

        public final boolean isList() {
            return this.isList;
        }
    }
}
