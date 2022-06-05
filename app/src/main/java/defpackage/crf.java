package defpackage;

import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: crf  reason: default package */
/* loaded from: classes2.dex */
public final class crf implements crg {

    /* renamed from: crf$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[crc.values().length];
            a = iArr;
            try {
                iArr[crc.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[crc.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[crc.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[crc.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[crc.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[crc.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[crc.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[crc.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[crc.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[crc.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[crc.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[crc.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[crc.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        crg crgVar;
        switch (AnonymousClass1.a[crcVar.ordinal()]) {
            case 1:
                crgVar = new csu();
                break;
            case 2:
                crgVar = new ctg();
                break;
            case 3:
                crgVar = new cst();
                break;
            case 4:
                crgVar = new csz();
                break;
            case 5:
                crgVar = new ctp();
                break;
            case 6:
                crgVar = new csp();
                break;
            case 7:
                crgVar = new csr();
                break;
            case 8:
                crgVar = new csn();
                break;
            case 9:
                crgVar = new csw();
                break;
            case 10:
                crgVar = new cth();
                break;
            case 11:
                crgVar = new csl();
                break;
            case 12:
                crgVar = new crv();
                break;
            case 13:
                crgVar = new crh();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(crcVar)));
        }
        return crgVar.a(str, crcVar, i, i2, map);
    }
}
