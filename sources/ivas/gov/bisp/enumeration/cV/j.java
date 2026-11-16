package ivas.gov.bisp.enumeration.cV;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static int a = 0;
    private static int b = 1;
    public static long c;
    public static Method d;

    @SuppressLint({"NewApi"})
    public static boolean b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-18)) | ((~i2) & 17)) - (~((i2 & 17) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = false;
        try {
            if (d == null) {
                int i5 = i2 & 89;
                int i6 = ((i2 | 89) & (~i5)) + (i5 << 1);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    return Trace.isEnabled();
                }
                int i7 = 41 / 0;
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (d == null) {
                int i8 = a;
                int i9 = i8 & 71;
                int i10 = i8 | 71;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
                long j = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                int i13 = b;
                int i14 = i13 & 11;
                int i15 = i14 + ((i13 ^ 11) | i14);
                a = i15 % 128;
                int i16 = i15 % 2;
                c = j;
                Class[] clsArr = new Class[1];
                Class cls = Long.TYPE;
                int i17 = b;
                int i18 = ((i17 & 102) + (i17 | 102)) - 1;
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    clsArr[0] = cls;
                    d = Trace.class.getMethod("isTagEnabled", clsArr);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                clsArr[0] = cls;
                d = Trace.class.getMethod("isTagEnabled", clsArr);
            }
            Method method = d;
            Object[] objArr = new Object[1];
            int i19 = a;
            int i20 = i19 & 125;
            int i21 = (i19 ^ 125) | i20;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            objArr[0] = Long.valueOf(c);
            Object objInvoke = method.invoke(null, objArr);
            int i24 = a;
            int i25 = (((i24 | 68) << 1) - (i24 ^ 68)) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
            int i27 = a + 81;
            b = i27 % 128;
            int i28 = i27 % 2;
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (!(cause instanceof RuntimeException)) {
                    throw new RuntimeException(cause);
                }
                int i29 = b;
                int i30 = i29 & 57;
                int i31 = (((i29 ^ 57) | i30) << 1) - ((i29 | 57) & (~i30));
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    throw ((RuntimeException) cause);
                }
                int i32 = 45 / 0;
                throw ((RuntimeException) cause);
            }
        }
        int i33 = b;
        int i34 = i33 ^ 23;
        int i35 = (((i33 & 23) | i34) << 1) - i34;
        a = i35 % 128;
        int i36 = i35 % 2;
        return zBooleanValue;
    }
}
