package ivas.gov.bisp.enumeration.p022av;

import android.os.SystemClock;
import android.util.Log;
import ivas.gov.bisp.enumeration.p003ac.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class S {
    private static int a = 1;
    private static int b;
    public static boolean c = Log.isLoggable("Volley", 2);
    public static final String d = S.class.getName();

    static {
        int i = a;
        int i2 = i & 115;
        int i3 = (i ^ 115) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void d(String str, Object... objArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 38) << 1) - (i2 ^ 38);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        Log.e("Volley", c(str, objArr));
        int i6 = a;
        int i7 = i6 & 11;
        int i8 = i7 + ((i6 ^ 11) | i7);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void e(String str, Object... objArr) {
        int i = 2 % 2;
        int i2 = b + 89;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!(!c)) {
            c(str, objArr);
            int i3 = b;
            int i4 = (i3 & (-30)) | ((~i3) & 29);
            int i5 = (i3 & 29) << 1;
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = a;
        int i9 = i8 ^ 13;
        int i10 = (i8 & 13) << 1;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 81 / 0;
        }
    }

    public static class bKl {
        private static int a = 1;
        private static int b;
        public static final boolean c = S.c;
        public final List<bKm> d = new ArrayList();
        public boolean e = false;

        public static class bKm {
            public final String a;
            public final long b;
            public final long c;

            public bKm(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }
        }

        static {
            int i = b;
            int i2 = i & 25;
            int i3 = (i | 25) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = (i3 & i4) + (i3 | i4);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 47 / 0;
            }
        }

        public void c(String str, long j) {
            synchronized (this) {
                if (this.e) {
                    throw new IllegalStateException("Marker added to finished log");
                }
                this.d.add(new bKm(str, j, SystemClock.elapsedRealtime()));
            }
        }

        public void d(String str) {
            long j;
            synchronized (this) {
                this.e = true;
                if (this.d.size() == 0) {
                    j = 0;
                } else {
                    long j2 = this.d.get(0).c;
                    List<bKm> list = this.d;
                    j = list.get((-2) - (list.size() ^ (-1))).c - j2;
                }
                if (j <= 0) {
                    return;
                }
                long j3 = this.d.get(0).c;
                S.c("(%-4d ms) %s", Long.valueOf(j), str);
                for (bKm bkm : this.d) {
                    long j4 = bkm.c;
                    S.c("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(bkm.b), bkm.a);
                    j3 = j4;
                }
            }
        }

        public void finalize() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            if (!this.e) {
                int i6 = (-2) - ((((i4 | 20) << 1) - (i4 ^ 20)) ^ (-1));
                b = i6 % 128;
                int i7 = i6 % 2;
                d("Request on the loose");
                S.d("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
                int i8 = a + 101;
                b = i8 % 128;
                int i9 = i8 % 2;
            }
            int i10 = a + 113;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    public static String c(String str, Object... objArr) {
        String string;
        String strSubstring;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 43;
        int i5 = ((i3 & 43) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        if (objArr != null) {
            int i9 = i3 + 71;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                String.format(Locale.US, str, objArr);
                obj.hashCode();
                throw null;
            }
            str = String.format(Locale.US, str, objArr);
            int i10 = b;
            int i11 = (-2) - (((i10 & 126) + (i10 | 126)) ^ (-1));
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i13 = a + 97;
        b = i13 % 128;
        char c2 = 4;
        int i14 = i13 % 2 != 0 ? 4 : 2;
        while (true) {
            if (i14 >= stackTrace.length) {
                int i15 = b;
                int i16 = (((i15 | 84) << 1) - (i15 ^ 84)) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                string = "<unknown>";
                break;
            }
            int i18 = a + 107;
            b = i18 % 128;
            if (i18 % 2 != 0) {
                stackTrace[i14].getClassName().equals(d);
                throw null;
            }
            if (!stackTrace[i14].getClassName().equals(d)) {
                int i19 = b;
                int i20 = i19 ^ 29;
                int i21 = ((i19 & 29) | i20) << 1;
                int i22 = -i20;
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
                String className = stackTrace[i14].getClassName();
                int iLastIndexOf = className.lastIndexOf(46);
                int i25 = b;
                int i26 = ((i25 & (-24)) | ((~i25) & 23)) + ((i25 & 23) << 1);
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    strSubstring = className.substring(iLastIndexOf);
                    i = 86;
                } else {
                    int i27 = iLastIndexOf & 1;
                    int i28 = (iLastIndexOf ^ 1) | i27;
                    strSubstring = className.substring(((i27 | i28) << 1) - (i28 ^ i27));
                    i = 36;
                }
                int iLastIndexOf2 = strSubstring.lastIndexOf(i);
                int i29 = iLastIndexOf2 & 1;
                int i30 = -(-(iLastIndexOf2 | 1));
                StringBuilder sbB = P.b(strSubstring.substring((i29 ^ i30) + ((i30 & i29) << 1)), ".");
                int i31 = a;
                int i32 = (i31 | 21) << 1;
                int i33 = -(((~i31) & 21) | (i31 & (-22)));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                b = i34 % 128;
                if (i34 % 2 != 0) {
                    sbB.append(stackTrace[i14].getMethodName());
                    sbB.toString();
                    throw null;
                }
                sbB.append(stackTrace[i14].getMethodName());
                string = sbB.toString();
                int i35 = a;
                int i36 = i35 & 125;
                int i37 = i36 + ((i35 ^ 125) | i36);
                b = i37 % 128;
                if (i37 % 2 != 0) {
                    throw null;
                }
                int i38 = i35 & 39;
                int i39 = ((i35 ^ 39) | i38) << 1;
                int i40 = -((i35 | 39) & (~i38));
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                b = i41 % 128;
                int i42 = i41 % 2;
                break;
            }
            int i43 = (i14 ^ (-3)) + ((i14 & (-3)) << 1);
            i14 = (i43 & 4) + (i43 | 4);
            int i44 = a;
            int i45 = i44 | 41;
            int i46 = i45 << 1;
            int i47 = -((~(i44 & 41)) & i45);
            int i48 = (i46 & i47) + (i47 | i46);
            b = i48 % 128;
            int i49 = i48 % 2;
        }
        Locale locale = Locale.US;
        Object[] objArr2 = new Object[3];
        Thread threadCurrentThread = Thread.currentThread();
        int i50 = a + 94;
        int i51 = (i50 ^ (-1)) + (i50 << 1);
        b = i51 % 128;
        if (i51 % 2 != 0) {
            objArr2[0] = Long.valueOf(threadCurrentThread.getId());
            objArr2[0] = string;
        } else {
            objArr2[0] = Long.valueOf(threadCurrentThread.getId());
            objArr2[1] = string;
            c2 = 2;
        }
        int i52 = b;
        int i53 = (((i52 | 121) << 1) - (~(-(((~i52) & 121) | (i52 & (-122)))))) - 1;
        a = i53 % 128;
        if (i53 % 2 != 0) {
            objArr2[c2] = str;
            return String.format(locale, "[%d] %s: %s", objArr2);
        }
        objArr2[c2] = str;
        int i54 = 29 / 0;
        return String.format(locale, "[%d] %s: %s", objArr2);
    }
}
