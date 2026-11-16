package ivas.gov.bisp.enumeration.H;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class h {
    private static int a = 0;
    private static int b = 1;
    public static final /* synthetic */ int c = 0;

    static {
        Class cls;
        Class[] clsArr;
        Object obj = null;
        if (Build.VERSION.SDK_INT < 29) {
            int i = a;
            int i2 = (i & (-38)) | ((~i) & 37);
            int i3 = -(-((i & 37) << 1));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class[] clsArr2 = new Class[1];
                int i6 = b;
                int i7 = i6 & 117;
                int i8 = i6 | 117;
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    cls = Long.TYPE;
                    clsArr2[0] = cls;
                    Trace.class.getMethod("isTagEnabled", clsArr2);
                } else {
                    cls = Long.TYPE;
                    clsArr2[0] = cls;
                    Trace.class.getMethod("isTagEnabled", clsArr2);
                }
                int i10 = b;
                int i11 = i10 & 111;
                int i12 = i11 + ((i10 ^ 111) | i11);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    clsArr = new Class[3];
                    clsArr[0] = cls;
                    clsArr[1] = String.class;
                } else {
                    clsArr = new Class[3];
                    clsArr[0] = cls;
                    clsArr[1] = String.class;
                }
                Class cls2 = Integer.TYPE;
                int i13 = a;
                int i14 = (i13 | 77) << 1;
                int i15 = -(((~i13) & 77) | (i13 & (-78)));
                int i16 = (i14 & i15) + (i15 | i14);
                b = i16 % 128;
                int i17 = i16 % 2;
                clsArr[2] = cls2;
                Trace.class.getMethod("asyncTraceBegin", clsArr);
                Class[] clsArr3 = new Class[3];
                int i18 = b;
                int i19 = (((i18 | 94) << 1) - (i18 ^ 94)) - 1;
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    clsArr3[0] = cls;
                    clsArr3[1] = String.class;
                    clsArr3[2] = cls2;
                } else {
                    clsArr3[0] = cls;
                    clsArr3[1] = String.class;
                    clsArr3[2] = cls2;
                }
                Trace.class.getMethod("asyncTraceEnd", clsArr3);
                Class[] clsArr4 = new Class[3];
                clsArr4[0] = cls;
                int i20 = a;
                int i21 = ((i20 ^ 61) | (i20 & 61)) << 1;
                int i22 = -(((~i20) & 61) | (i20 & (-62)));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
                clsArr4[1] = String.class;
                clsArr4[2] = cls2;
                Trace.class.getMethod("traceCounter", clsArr4);
                int i25 = a;
                int i26 = i25 & 91;
                int i27 = i26 + ((i25 ^ 91) | i26);
                b = i27 % 128;
                int i28 = i27 % 2;
                int i29 = (-2) - ((i25 + 28) ^ (-1));
                b = i29 % 128;
                int i30 = i29 % 2;
                int i31 = 2 % 2;
            } catch (Exception unused) {
                return;
            }
        }
        int i32 = b;
        int i33 = ((i32 | 11) << 1) - (i32 ^ 11);
        a = i33 % 128;
        if (i33 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
