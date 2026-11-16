package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class J {
    private static int a = 0;
    private static int b = 1;
    public static volatile J c;
    public static final J d = new J(true);
    public final Map<bjX, o0OOO0o.OooO<?, ?>> e;

    static {
        int i = a;
        int i2 = ((i & 19) - (~(-(-(i | 19))))) - 1;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public J() {
        this.e = new HashMap();
    }

    public static J d() {
        J j;
        J j2 = c;
        if (j2 != null) {
            return j2;
        }
        synchronized (J.class) {
            j = c;
            if (j == null) {
                Class<?> cls = C0058o.c;
                J j3 = null;
                if (cls != null) {
                    try {
                        j3 = (J) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                    } catch (Exception unused) {
                    }
                }
                if (j3 == null) {
                    j3 = d;
                }
                c = j3;
                j = j3;
            }
        }
        return j;
    }

    public static final class bjX {
        private static int a = 0;
        private static int b = 1;
        public final Object c;
        public final int d;

        public bjX(Object obj, int i) {
            this.c = obj;
            this.d = i;
        }

        public final int hashCode() {
            int iIdentityHashCode;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 116) + (i2 | 116)) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int iIdentityHashCode2 = System.identityHashCode(this.c);
                int i4 = iIdentityHashCode2 ^ 65535;
                int i5 = ((65535 & iIdentityHashCode2) | i4) << 1;
                int i6 = -i4;
                iIdentityHashCode = (i5 & i6) + (i5 | i6);
            } else {
                iIdentityHashCode = System.identityHashCode(this.c) * 65535;
            }
            int i7 = -(-this.d);
            int i8 = iIdentityHashCode & i7;
            int i9 = ((iIdentityHashCode ^ i7) | i8) << 1;
            int i10 = -((i7 | iIdentityHashCode) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            int i12 = a;
            int i13 = (i12 ^ 99) + ((i12 & 99) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                return i11;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 25;
            int i4 = ((i2 ^ 25) | i3) << 1;
            int i5 = -((~i3) & (i2 | 25));
            int i6 = (i4 & i5) + (i4 | i5);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            boolean z = false;
            if (!(obj instanceof bjX)) {
                int i9 = i7 + 75;
                int i10 = i9 % 128;
                a = i10;
                int i11 = i9 % 2;
                int i12 = i10 & 57;
                int i13 = (i12 - (~((i10 ^ 57) | i12))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            bjX bjx = (bjX) obj;
            if (this.c == bjx.c) {
                int i15 = i2 & 113;
                int i16 = (i15 - (~(-(-((i2 ^ 113) | i15))))) - 1;
                int i17 = i16 % 128;
                b = i17;
                if (i16 % 2 != 0 ? this.d == bjx.d : this.d == bjx.d) {
                    int i18 = (i17 & (-56)) | ((~i17) & 55);
                    int i19 = (i17 & 55) << 1;
                    int i20 = (i18 & i19) + (i18 | i19);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    z = true;
                }
            }
            int i22 = b;
            int i23 = ((i22 | 57) << 1) - (i22 ^ 57);
            a = i23 % 128;
            if (i23 % 2 == 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public J(boolean z) {
        this.e = Collections.emptyMap();
    }
}
