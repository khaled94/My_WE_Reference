package io.realm;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes2.dex */
public enum RealmFieldType {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    LIST(13),
    LINKING_OBJECTS(14),
    INTEGER_LIST(128),
    BOOLEAN_LIST(129),
    STRING_LIST(130),
    BINARY_LIST(132),
    DATE_LIST(136),
    FLOAT_LIST(137),
    DOUBLE_LIST(138);
    
    private static final RealmFieldType[] basicTypes = new RealmFieldType[15];
    private static final RealmFieldType[] listTypes = new RealmFieldType[15];
    private final int nativeValue;

    static {
        RealmFieldType[] values;
        for (RealmFieldType realmFieldType : values()) {
            int i = realmFieldType.nativeValue;
            if (i < 128) {
                basicTypes[i] = realmFieldType;
            } else {
                listTypes[i - 128] = realmFieldType;
            }
        }
    }

    RealmFieldType(int i) {
        this.nativeValue = i;
    }

    public final int getNativeValue() {
        return this.nativeValue;
    }

    public final boolean isValid(Object obj) {
        int i = this.nativeValue;
        if (i == 0) {
            return (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte);
        } else if (i == 1) {
            return obj instanceof Boolean;
        } else {
            if (i == 2) {
                return obj instanceof String;
            }
            if (i == 4) {
                return (obj instanceof byte[]) || (obj instanceof ByteBuffer);
            } else if (i == 132) {
                return false;
            } else {
                switch (i) {
                    case 8:
                        return obj instanceof Date;
                    case 9:
                        return obj instanceof Float;
                    case 10:
                        return obj instanceof Double;
                    default:
                        switch (i) {
                            case 12:
                            case 13:
                            case 14:
                                break;
                            default:
                                switch (i) {
                                    case 128:
                                    case 129:
                                    case 130:
                                        break;
                                    default:
                                        switch (i) {
                                            case 136:
                                            case 137:
                                            case 138:
                                                break;
                                            default:
                                                throw new RuntimeException("Unsupported Realm type:  ".concat(String.valueOf(this)));
                                        }
                                }
                        }
                        return false;
                }
            }
        }
    }

    public static RealmFieldType fromNativeValue(int i) {
        RealmFieldType realmFieldType;
        RealmFieldType realmFieldType2;
        if (i >= 0) {
            RealmFieldType[] realmFieldTypeArr = basicTypes;
            if (i < realmFieldTypeArr.length && (realmFieldType2 = realmFieldTypeArr[i]) != null) {
                return realmFieldType2;
            }
        }
        if (128 <= i) {
            int i2 = i - 128;
            RealmFieldType[] realmFieldTypeArr2 = listTypes;
            if (i2 < realmFieldTypeArr2.length && (realmFieldType = realmFieldTypeArr2[i2]) != null) {
                return realmFieldType;
            }
        }
        throw new IllegalArgumentException("Invalid native Realm type: ".concat(String.valueOf(i)));
    }
}
