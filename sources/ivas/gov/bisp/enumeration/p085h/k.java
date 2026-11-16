package ivas.gov.bisp.enumeration.p085h;

import android.app.Activity;
import android.text.TextUtils;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class k extends l {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ int d = 0;

    public interface aIu {
        void e(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Activity activity, String[] strArr, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 87;
        int i5 = (i3 & 87) << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        int length = strArr.length;
        int i8 = i7 != 0 ? 1 : 0;
        int i9 = i3 & 121;
        int i10 = (((i3 | 121) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        while (i8 < length) {
            int i12 = b;
            int i13 = i12 & 23;
            int i14 = (i12 ^ 23) | i13;
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                TextUtils.isEmpty(strArr[i8]);
                throw null;
            }
            if (TextUtils.isEmpty(strArr[i8])) {
                throw new IllegalArgumentException(j.u(j.w("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            int i16 = b;
            int i17 = (i16 | 125) << 1;
            int i18 = -(((~i16) & 125) | (i16 & (-126)));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            a = i20;
            if (i19 % 2 == 0) {
                i8 = (((i8 & (-108)) | ((~i8) & 107)) - (~((i8 & 107) << 1))) - 1;
            } else {
                int i21 = (i8 & (-97)) | ((~i8) & 96);
                int i22 = -(-((i8 & 96) << 1));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = i23 & (-95);
                int i25 = (i23 ^ (-95)) | i24;
                i8 = ((i24 | i25) << 1) - (i24 ^ i25);
            }
            int i26 = (i20 & (-106)) | ((~i20) & 105);
            int i27 = -(-((i20 & 105) << 1));
            int i28 = (i26 & i27) + (i27 | i26);
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        if (!(!(activity instanceof aIu))) {
            int i30 = b;
            int i31 = (i30 & 45) + (i30 | 45);
            a = i31 % 128;
            int i32 = i31 % 2;
            ((aIu) activity).e(i);
            int i33 = a;
            int i34 = i33 & 23;
            int i35 = (i33 ^ 23) | i34;
            int i36 = (i34 & i35) + (i35 | i34);
            b = i36 % 128;
            int i37 = i36 % 2;
        }
        activity.requestPermissions(strArr, i);
        int i38 = a;
        int i39 = ((i38 & 52) + (i38 | 52)) - 1;
        b = i39 % 128;
        if (i39 % 2 != 0) {
            int i40 = 13 / 0;
        }
    }
}
