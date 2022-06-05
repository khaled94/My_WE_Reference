package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        ChainHead[] chainHeadArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i2 = 0;
        } else {
            int i4 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = i4;
            i2 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (arrayList == null || (arrayList != null && arrayList.contains(chainHead.mFirst))) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r2.mHorizontalChainStyle == 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r2.mVerticalChainStyle == 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03e6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r38, androidx.constraintlayout.core.LinearSystem r39, int r40, int r41, androidx.constraintlayout.core.widgets.ChainHead r42) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.LinearSystem, int, int, androidx.constraintlayout.core.widgets.ChainHead):void");
    }
}
