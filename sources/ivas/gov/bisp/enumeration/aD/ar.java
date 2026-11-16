package ivas.gov.bisp.enumeration.aD;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ar {
    private static int a = 1;
    private static int b;
    public static final long c;
    public static final Logger d = Logger.getLogger(ar.class.getName());
    public static final Unsafe e;
    public static final Class<?> f;
    public static final boolean g;
    public static final bkn h;
    public static final boolean i;
    public static final boolean j;
    public static final boolean k;
    public static final boolean l;

    public class bkm implements PrivilegedExceptionAction<Unsafe> {
        private static int a = 1;
        private static int b;

        @Override // java.security.PrivilegedExceptionAction
        public /* synthetic */ Unsafe run() throws IllegalAccessException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 93;
            int i4 = (i3 - (~(-(-((i2 ^ 93) | i3))))) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return c();
            }
            c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0093 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x001c A[SYNTHETIC] */
        public Unsafe c() throws IllegalAccessException {
            Object obj;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 59) + (i3 | 59);
            b = i4 % 128;
            int i5 = i4 % 2;
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = i5 != 0 ? declaredFields.length : declaredFields.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    int i7 = b + 39;
                    a = i7 % 128;
                    int i8 = i7 % 2;
                    return null;
                }
                int i9 = a;
                int i10 = i9 & 29;
                int i11 = (i10 - (~((i9 ^ 29) | i10))) - 1;
                b = i11 % 128;
                Field field = i11 % 2 != 0 ? declaredFields[i6] : declaredFields[i6];
                field.setAccessible(true);
                int i12 = a;
                int i13 = i12 & 3;
                int i14 = i13 + ((i12 ^ 3) | i13);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    obj = field.get(null);
                    int i15 = 6 / 0;
                    if (Unsafe.class.isInstance(obj)) {
                        break;
                    }
                    i6 = ((i6 & 1) << 1) + ((i6 & (-2)) | ((~i6) & 1));
                    int i16 = b;
                    i = (i16 & 59) + (i16 | 59);
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i17 = 3 % 3;
                    }
                } else {
                    obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        break;
                    }
                    i6 = ((i6 & 1) << 1) + ((i6 & (-2)) | ((~i6) & 1));
                    int i18 = b;
                    i = (i18 & 59) + (i18 | 59);
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i19 = 3 % 3;
                    }
                }
            }
            Unsafe unsafe = (Unsafe) Unsafe.class.cast(obj);
            int i20 = a;
            int i21 = ((i20 & 68) + (i20 | 68)) - 1;
            b = i21 % 128;
            if (i21 % 2 == 0) {
                return unsafe;
            }
            throw null;
        }
    }

    public static abstract class bkn {
        private static int a = 0;
        private static int b = 1;
        public Unsafe c;

        public bkn(Unsafe unsafe) {
            this.c = unsafe;
        }

        public final Object c(Object obj, long j) {
            int i = 2 % 2;
            int i2 = b + 81;
            a = i2 % 128;
            int i3 = i2 % 2;
            Object object = this.c.getObject(obj, j);
            int i4 = a + 109;
            b = i4 % 128;
            int i5 = i4 % 2;
            return object;
        }

        public final int d(Class<?> cls) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 31) + ((i2 & 31) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            int iArrayBaseOffset = this.c.arrayBaseOffset(cls);
            if (i4 != 0) {
                int i5 = 93 / 0;
            }
            return iArrayBaseOffset;
        }

        public final int e(Class<?> cls) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 35) << 1) - (i2 ^ 35);
            a = i3 % 128;
            int i4 = i3 % 2;
            int iArrayIndexScale = this.c.arrayIndexScale(cls);
            int i5 = b;
            int i6 = i5 & 87;
            int i7 = ((i5 | 87) & (~i6)) + (i6 << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return iArrayIndexScale;
            }
            throw null;
        }

        public abstract boolean f(Object obj, long j);

        public abstract byte g(Object obj, long j);

        public abstract float h(Object obj, long j);

        public abstract double i(Object obj, long j);

        public final int j(Object obj, long j) {
            int i;
            int i2 = 2 % 2;
            int i3 = b + 103;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                i = this.c.getInt(obj, j);
                int i4 = 47 / 0;
            } else {
                i = this.c.getInt(obj, j);
            }
            int i5 = b;
            int i6 = i5 & 15;
            int i7 = ((i5 ^ 15) | i6) << 1;
            int i8 = -((i5 | 15) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return i;
            }
            throw null;
        }

        public final long k(Object obj, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
            a = i3 % 128;
            int i4 = i3 % 2;
            long j2 = this.c.getLong(obj, j);
            int i5 = a + 7;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return j2;
        }

        public final long l(Field field) {
            int i = 2 % 2;
            int i2 = a + 63;
            b = i2 % 128;
            int i3 = i2 % 2;
            Unsafe unsafe = this.c;
            if (i3 != 0) {
                return unsafe.objectFieldOffset(field);
            }
            long jObjectFieldOffset = unsafe.objectFieldOffset(field);
            int i4 = 0 / 0;
            return jObjectFieldOffset;
        }

        public abstract void m(Object obj, long j, boolean z);

        public abstract void n(Object obj, long j, byte b2);

        public abstract void o(Object obj, long j, float f);

        public abstract void p(Object obj, long j, double d);

        public final void q(Object obj, long j, int i) {
            int i2 = 2 % 2;
            int i3 = a + 105;
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.putInt(obj, j, i);
            int i5 = b;
            int i6 = i5 & 49;
            int i7 = (((i5 ^ 49) | i6) << 1) - ((i5 | 49) & (~i6));
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void r(Object obj, long j, long j2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 25;
            int i4 = (i2 ^ 25) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            this.c.putLong(obj, j, j2);
            int i7 = b;
            int i8 = (((i7 | 70) << 1) - (i7 ^ 70)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        public final void s(Object obj, long j, Object obj2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 119;
            int i4 = -(-(i2 | 119));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            this.c.putObject(obj, j, obj2);
            if (i6 != 0) {
                int i7 = 75 / 0;
            }
            int i8 = (-2) - ((b + 38) ^ (-1));
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 56 / 0;
            }
        }
    }

    public static final class bko extends bkn {
        private static int a = 1;
        private static int b;

        public bko(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final float h(Object obj, long j) {
            int i = 2 % 2;
            int i2 = a + 11;
            b = i2 % 128;
            int i3 = i2 % 2;
            float fIntBitsToFloat = Float.intBitsToFloat(j(obj, j));
            int i4 = a;
            int i5 = (i4 & (-8)) | ((~i4) & 7);
            int i6 = -(-((i4 & 7) << 1));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return fIntBitsToFloat;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final double i(Object obj, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 123;
            int i4 = -(-((i2 ^ 123) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            double dLongBitsToDouble = Double.longBitsToDouble(k(obj, j));
            int i7 = b;
            int i8 = i7 ^ 117;
            int i9 = -(-((i7 & 117) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return dLongBitsToDouble;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void n(Object obj, long j, byte b2) {
            int i = 2 % 2;
            int i2 = b + 29;
            a = i2 % 128;
            int i3 = i2 % 2;
            if (!ar.l) {
                ar.u(obj, j, b2);
                int i4 = a;
                int i5 = (i4 & 67) + (i4 | 67);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i6 = b;
            int i7 = ((i6 ^ 49) | (i6 & 49)) << 1;
            int i8 = -(((~i6) & 49) | (i6 & (-50)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            ar.s(obj, j, b2);
            int i11 = b;
            int i12 = i11 | 85;
            int i13 = (i12 << 1) - ((~(i11 & 85)) & i12);
            a = i13 % 128;
            int i14 = i13 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void o(Object obj, long j, float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
            a = i3 % 128;
            int i4 = i3 % 2;
            q(obj, j, Float.floatToIntBits(f));
            int i5 = a;
            int i6 = i5 & 9;
            int i7 = i5 | 9;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void p(Object obj, long j, double d) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 66) + ((i2 & 66) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            r(obj, j, Double.doubleToLongBits(d));
            int i6 = b;
            int i7 = ((i6 & 101) - (~(-(-(i6 | 101))))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:11:0x0035  */
        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final boolean f(Object obj, long j) {
            boolean z;
            int i = 2 % 2;
            int i2 = a + 5;
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean z2 = true;
            if (!ar.l) {
                if (ar.c(obj, j) != 0) {
                    int i4 = a;
                    int i5 = i4 & 125;
                    int i6 = (i5 - (~((i4 ^ 125) | i5))) - 1;
                    int i7 = i6 % 128;
                    b = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 & 91;
                    int i10 = i9 + ((i7 ^ 91) | i9);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    int i12 = a;
                    int i13 = (i12 & (-4)) | ((~i12) & 3);
                    int i14 = (i12 & 3) << 1;
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    z2 = false;
                }
                int i17 = a + 59;
                b = i17 % 128;
                int i18 = i17 % 2;
                return z2;
            }
            int i19 = b + 61;
            a = i19 % 128;
            int i20 = i19 % 2;
            byte bK = ar.k(obj, j);
            if (i20 == 0) {
                int i21 = 22 / 0;
                if (bK == 0) {
                    int i22 = b + 61;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    z = false;
                } else {
                    z = true;
                }
            } else if (bK == 0) {
                int i24 = b + 61;
                a = i24 % 128;
                int i25 = i24 % 2;
                z = false;
            } else {
                z = true;
            }
            int i26 = b;
            int i27 = (i26 ^ 63) + ((i26 & 63) << 1);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 79 / 0;
            }
            return z;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final byte g(Object obj, long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
            b = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                boolean z = ar.l;
                throw null;
            }
            if (!ar.l) {
                byte bC = ar.c(obj, j);
                int i4 = b;
                int i5 = ((i4 ^ 95) | (i4 & 95)) << 1;
                int i6 = -(((~i4) & 95) | (i4 & (-96)));
                int i7 = (i5 & i6) + (i6 | i5);
                a = i7 % 128;
                int i8 = i7 % 2;
                return bC;
            }
            int i9 = b;
            int i10 = i9 & 33;
            int i11 = (i9 ^ 33) | i10;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return ar.k(obj, j);
            }
            ar.k(obj, j);
            obj2.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void m(Object obj, long j, boolean z) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 5;
            int i4 = ((i2 ^ 5) | i3) << 1;
            int i5 = -((i2 | 5) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            if (!ar.l) {
                ar.u(obj, j, z ? (byte) 1 : (byte) 0);
                int i8 = a + 19;
                b = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            int i10 = a;
            int i11 = (-2) - (((i10 ^ 40) + ((i10 & 40) << 1)) ^ (-1));
            b = i11 % 128;
            Object obj2 = null;
            if (i11 % 2 != 0) {
                ar.s(obj, j, z ? (byte) 1 : (byte) 0);
                throw null;
            }
            ar.s(obj, j, z ? (byte) 1 : (byte) 0);
            int i12 = b;
            int i13 = ((i12 ^ 13) | (i12 & 13)) << 1;
            int i14 = -(((~i12) & 13) | (i12 & (-14)));
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public static final class bkp extends bkn {
        private static int a = 1;
        private static int b;

        public bkp(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final float h(Object obj, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 37;
            int i4 = -(-((i2 ^ 37) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return Float.intBitsToFloat(j(obj, j));
            }
            Float.intBitsToFloat(j(obj, j));
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final double i(Object obj, long j) {
            double dLongBitsToDouble;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 51;
            int i4 = -(-((i2 & 51) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                dLongBitsToDouble = Double.longBitsToDouble(k(obj, j));
                int i6 = 40 / 0;
            } else {
                dLongBitsToDouble = Double.longBitsToDouble(k(obj, j));
            }
            int i7 = a;
            int i8 = (i7 & 29) + (i7 | 29);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return dLongBitsToDouble;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void m(Object obj, long j, boolean z) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 45;
            int i4 = (((i2 | 45) & (~i3)) - (~(i3 << 1))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (!ar.l) {
                ar.u(obj, j, z ? (byte) 1 : (byte) 0);
                int i6 = a;
                int i7 = (i6 ^ 29) + ((i6 & 29) << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            int i9 = a;
            int i10 = i9 & 119;
            int i11 = -(-((i9 ^ 119) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            ar.s(obj, j, z ? (byte) 1 : (byte) 0);
            int i14 = a;
            int i15 = i14 & 119;
            int i16 = i14 | 119;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void o(Object obj, long j, float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 123) | (i2 & 123)) << 1;
            int i4 = -(((~i2) & 123) | (i2 & (-124)));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            q(obj, j, Float.floatToIntBits(f));
            int i7 = a + 123;
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void p(Object obj, long j, double d) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 51) | (i2 & 51)) << 1;
            int i4 = -(((~i2) & 51) | (i2 & (-52)));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                r(obj, j, Double.doubleToLongBits(d));
                return;
            }
            r(obj, j, Double.doubleToLongBits(d));
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final boolean f(Object obj, long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 117) - (~(-(-((i2 & 117) << 1))))) - 1;
            b = i3 % 128;
            Object obj2 = null;
            boolean z = false;
            if (i3 % 2 == 0 ? ar.l : ar.l) {
                if (ar.k(obj, j) == 0) {
                    int i4 = b;
                    int i5 = ((i4 | 17) << 1) - (i4 ^ 17);
                    a = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = (i4 & (-86)) | ((~i4) & 85);
                    int i8 = -(-((i4 & 85) << 1));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    z = true;
                }
                int i11 = b;
                int i12 = ((i11 | 111) << 1) - (i11 ^ 111);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    return z;
                }
                obj2.hashCode();
                throw null;
            }
            if (ar.c(obj, j) != 0) {
                int i13 = a;
                int i14 = (i13 & 99) + (i13 | 99);
                int i15 = i14 % 128;
                b = i15;
                z = i14 % 2 == 0;
                int i16 = i15 ^ 67;
                int i17 = (i15 & 67) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                int i19 = i18 % 2;
            } else {
                int i20 = a + 41;
                b = i20 % 128;
                int i21 = i20 % 2;
            }
            int i22 = b + 15;
            a = i22 % 128;
            if (i22 % 2 != 0) {
                return z;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final byte g(Object obj, long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 13) | (i2 & 13)) << 1;
            int i4 = -(((~i2) & 13) | (i2 & (-14)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (!ar.l) {
                byte bC = ar.c(obj, j);
                int i7 = a;
                int i8 = ((i7 & 53) - (~(-(-(i7 | 53))))) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
                return bC;
            }
            int i10 = a;
            int i11 = i10 & 89;
            int i12 = -(-(i10 | 89));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            Object obj2 = null;
            if (i13 % 2 != 0) {
                ar.k(obj, j);
                obj2.hashCode();
                throw null;
            }
            byte bK = ar.k(obj, j);
            int i14 = a;
            int i15 = (((i14 | 18) << 1) - (i14 ^ 18)) - 1;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                return bK;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void n(Object obj, long j, byte b2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 97) + (i2 | 97);
            a = i3 % 128;
            int i4 = i3 % 2;
            if (!ar.l) {
                ar.u(obj, j, b2);
                int i5 = b + 81;
                a = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            int i7 = a;
            int i8 = (i7 ^ 77) + ((i7 & 77) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            ar.s(obj, j, b2);
            int i10 = a;
            int i11 = ((((i10 ^ 11) | (i10 & 11)) << 1) - (~(-(((~i10) & 11) | (i10 & (-12)))))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public static final class bkq extends bkn {
        private static int a = 0;
        private static int b = 1;

        public bkq(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final boolean f(Object obj, long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 97) + ((i2 & 97) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.c.getBoolean(obj, j);
            int i5 = b + 77;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final byte g(Object obj, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 55) + (i2 | 55);
            a = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                this.c.getByte(obj, j);
                obj2.hashCode();
                throw null;
            }
            byte b2 = this.c.getByte(obj, j);
            int i4 = b;
            int i5 = i4 & 7;
            int i6 = i5 + ((i4 ^ 7) | i5);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return b2;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final float h(Object obj, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 73) | (i2 & 73)) << 1) - (((~i2) & 73) | (i2 & (-74)));
            a = i3 % 128;
            int i4 = i3 % 2;
            float f = this.c.getFloat(obj, j);
            if (i4 != 0) {
                int i5 = 95 / 0;
            }
            int i6 = b;
            int i7 = i6 & 117;
            int i8 = (i6 ^ 117) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return f;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final double i(Object obj, long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 69;
            int i4 = (((i2 ^ 69) | i3) << 1) - ((i2 | 69) & (~i3));
            b = i4 % 128;
            int i5 = i4 % 2;
            double d = this.c.getDouble(obj, j);
            int i6 = a;
            int i7 = i6 ^ 29;
            int i8 = ((i6 & 29) | i7) << 1;
            int i9 = -i7;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return d;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void m(Object obj, long j, boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 & 34) + (i2 | 34)) ^ (-1));
            a = i3 % 128;
            if (i3 % 2 == 0) {
                this.c.putBoolean(obj, j, z);
            } else {
                this.c.putBoolean(obj, j, z);
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void n(Object obj, long j, byte b2) {
            int i = 2 % 2;
            int i2 = b + 35;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                this.c.putByte(obj, j, b2);
                throw null;
            }
            this.c.putByte(obj, j, b2);
            int i3 = b;
            int i4 = ((((i3 ^ 107) | (i3 & 107)) << 1) - (~(-(((~i3) & 107) | (i3 & (-108)))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void o(Object obj, long j, float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-116)) | ((~i2) & 115)) + ((i2 & 115) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.putFloat(obj, j, f);
            int i5 = b;
            int i6 = ((i5 ^ 87) | (i5 & 87)) << 1;
            int i7 = -(((~i5) & 87) | (i5 & (-88)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.ar.bkn
        public final void p(Object obj, long j, double d) {
            int i = 2 % 2;
            int i2 = b + 15;
            a = i2 % 128;
            int i3 = i2 % 2;
            this.c.putDouble(obj, j, d);
            int i4 = a + 77;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x055e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0591  */
    /* JADX WARN: Code duplicated, block: B:127:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:129:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:130:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:135:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:137:0x060d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0611  */
    /* JADX WARN: Code duplicated, block: B:142:0x0626  */
    /* JADX WARN: Code duplicated, block: B:143:0x0629  */
    /* JADX WARN: Code duplicated, block: B:147:0x0633  */
    /* JADX WARN: Code duplicated, block: B:148:0x064b  */
    /* JADX WARN: Code duplicated, block: B:151:0x065d  */
    /* JADX WARN: Code duplicated, block: B:153:0x065f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0664  */
    /* JADX WARN: Code duplicated, block: B:157:0x066c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0674  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00e5  */
    static {
        boolean zI;
        Class<?> cls;
        bkn bkqVar;
        Class<?>[] clsArr;
        Class<?>[] clsArr2;
        boolean z;
        int i2;
        Class<?>[] clsArr3;
        Class<?>[] clsArr4;
        Class<?> cls2;
        char c2;
        Class<?>[] clsArr5;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Field fieldG;
        boolean z3;
        int i8;
        int i9;
        bkn bknVar;
        int i10;
        Unsafe unsafeQ = q();
        int i11 = a + 49;
        b = i11 % 128;
        int i12 = i11 % 2;
        e = unsafeQ;
        f = C0061r.c;
        Class<?> cls3 = Long.TYPE;
        int i13 = b + 21;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            zI = i(cls3);
            g = zI;
            cls = Integer.TYPE;
            int i14 = 96 / 0;
        } else {
            zI = i(cls3);
            g = zI;
            cls = Integer.TYPE;
        }
        int i15 = a;
        int i16 = i15 & 29;
        int i17 = ((i15 ^ 29) | i16) << 1;
        int i18 = -((i15 | 29) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        b = i19 % 128;
        int i20 = i19 % 2;
        boolean zI2 = i(cls);
        i = zI2;
        if (unsafeQ != null) {
            int i21 = a;
            int i22 = i21 ^ 21;
            int i23 = ((((i21 & 21) | i22) << 1) - (~(-i22))) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
            if (C0061r.b()) {
                int i25 = a;
                int i26 = (((i25 ^ 123) | (i25 & 123)) << 1) - (((~i25) & 123) | (i25 & (-124)));
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
                if (zI) {
                    bkqVar = new bkp(unsafeQ);
                    int i27 = a;
                    int i28 = i27 & 119;
                    int i29 = (i27 ^ 119) | i28;
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    int i32 = 2 % 2;
                } else if (zI2) {
                    bkqVar = new bko(unsafeQ);
                    int i33 = a;
                    int i34 = i33 & 39;
                    int i35 = -(-((i33 ^ 39) | i34));
                    int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                    b = i36 % 128;
                    if (i36 % 2 == 0) {
                        int i37 = 2 % 2;
                    }
                } else {
                    bkqVar = null;
                }
            } else {
                bkqVar = new bkq(unsafeQ);
                int i38 = b;
                int i39 = ((i38 ^ 24) + ((i38 & 24) << 1)) - 1;
                a = i39 % 128;
                int i40 = i39 % 2;
                int i41 = 2 % 2;
            }
        } else {
            bkqVar = null;
        }
        h = bkqVar;
        if (unsafeQ == null) {
            int i42 = b;
            int i43 = i42 | 11;
            int i44 = ((i43 << 1) - (~(-((~(i42 & 11)) & i43)))) - 1;
            a = i44 % 128;
            int i45 = i44 % 2;
            int i46 = 2 % 2;
            z = false;
        } else {
            try {
                Class<?> cls4 = unsafeQ.getClass();
                Class<?>[] clsArr6 = new Class[1];
                int i47 = b;
                int i48 = ((i47 & 124) + (i47 | 124)) - 1;
                a = i48 % 128;
                if (i48 % 2 == 0) {
                    clsArr6[0] = Field.class;
                    cls4.getMethod("objectFieldOffset", clsArr6);
                } else {
                    clsArr6[0] = Field.class;
                    cls4.getMethod("objectFieldOffset", clsArr6);
                }
                Class<?>[] clsArr7 = new Class[2];
                clsArr7[0] = Object.class;
                int i49 = a;
                int i50 = i49 & 11;
                int i51 = (~i50) & (i49 | 11);
                int i52 = i50 << 1;
                int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
                b = i53 % 128;
                int i54 = i53 % 2;
                clsArr7[1] = cls3;
                cls4.getMethod("getLong", clsArr7);
                if (g() == null) {
                    int i55 = a;
                    int i56 = (i55 & (-92)) | ((~i55) & 91);
                    int i57 = (i55 & 91) << 1;
                    int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    int i60 = 2 % 2;
                    int i410 = b;
                    int i411 = i410 | 11;
                    int i412 = ((i411 << 1) - (~(-((~(i410 & 11)) & i411)))) - 1;
                    a = i412 % 128;
                    int i413 = i412 % 2;
                    int i414 = 2 % 2;
                    z = false;
                } else {
                    if (!C0061r.b()) {
                        cls4.getMethod("getByte", cls3);
                        Class<?>[] clsArr8 = new Class[2];
                        int i61 = a;
                        int i62 = ((i61 & (-86)) | ((~i61) & 85)) + ((i61 & 85) << 1);
                        b = i62 % 128;
                        int i63 = i62 % 2;
                        clsArr8[0] = cls3;
                        clsArr8[1] = Byte.TYPE;
                        cls4.getMethod("putByte", clsArr8);
                        Class<?>[] clsArr9 = new Class[1];
                        int i64 = b;
                        int i65 = (i64 & 125) + (i64 | 125);
                        a = i65 % 128;
                        int i66 = i65 % 2;
                        clsArr9[0] = cls3;
                        cls4.getMethod("getInt", clsArr9);
                        Class<?>[] clsArr10 = new Class[2];
                        clsArr10[0] = cls3;
                        int i67 = a + 41;
                        b = i67 % 128;
                        if (i67 % 2 != 0) {
                            clsArr10[1] = cls;
                            cls4.getMethod("putInt", clsArr10);
                            clsArr = new Class[]{cls3};
                        } else {
                            clsArr10[1] = cls;
                            cls4.getMethod("putInt", clsArr10);
                            clsArr = new Class[]{cls3};
                        }
                        cls4.getMethod("getLong", clsArr);
                        Class<?>[] clsArr11 = {cls3, cls3};
                        int i68 = b + 95;
                        a = i68 % 128;
                        if (i68 % 2 == 0) {
                            cls4.getMethod("putLong", clsArr11);
                            clsArr2 = new Class[4];
                            clsArr2[0] = cls3;
                            clsArr2[0] = cls3;
                            clsArr2[2] = cls3;
                        } else {
                            cls4.getMethod("putLong", clsArr11);
                            clsArr2 = new Class[]{cls3, cls3, cls3};
                        }
                        cls4.getMethod("copyMemory", clsArr2);
                        Class<?>[] clsArr12 = new Class[5];
                        clsArr12[0] = Object.class;
                        clsArr12[1] = cls3;
                        int i69 = b;
                        int i70 = i69 & 79;
                        int i71 = -(-((i69 ^ 79) | i70));
                        int i72 = (i70 & i71) + (i71 | i70);
                        a = i72 % 128;
                        int i73 = i72 % 2;
                        clsArr12[2] = Object.class;
                        clsArr12[3] = cls3;
                        clsArr12[4] = cls3;
                        cls4.getMethod("copyMemory", clsArr12);
                        int i74 = b;
                        int i75 = (((i74 | 124) << 1) - (i74 ^ 124)) - 1;
                        a = i75 % 128;
                        int i76 = i75 % 2;
                        int i77 = 2 % 2;
                    }
                    int i78 = a;
                    int i79 = i78 & 63;
                    int i80 = (i78 ^ 63) | i79;
                    int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                    b = i81 % 128;
                    if (i81 % 2 == 0) {
                        int i82 = 2 % 2;
                    }
                    z = true;
                }
            } catch (Throwable th) {
                Logger logger = d;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder();
                int i83 = a;
                int i84 = i83 & 85;
                int i85 = (i84 - (~((i83 ^ 85) | i84))) - 1;
                b = i85 % 128;
                int i86 = i85 % 2;
                sb.append("platform method missing - proto runtime falling back to safer methods: ");
                sb.append(th);
                int i87 = b;
                int i88 = i87 & 101;
                int i89 = (i87 ^ 101) | i88;
                int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                a = i90 % 128;
                int i91 = i90 % 2;
                logger.log(level, sb.toString());
                int i92 = a + 77;
                b = i92 % 128;
                if (i92 % 2 != 0) {
                    int i93 = 3 / 5;
                } else {
                    int i94 = 2 % 2;
                }
            }
        }
        j = z;
        Unsafe unsafe = e;
        if (unsafe != null) {
            try {
                Class<?> cls5 = unsafe.getClass();
                cls5.getMethod("objectFieldOffset", Field.class);
                Class<?>[] clsArr13 = new Class[1];
                int i95 = a;
                int i96 = ((i95 | 55) << 1) - (i95 ^ 55);
                b = i96 % 128;
                if (i96 % 2 != 0) {
                    clsArr13[0] = Class.class;
                    cls5.getMethod("arrayBaseOffset", clsArr13);
                    Class<?>[] clsArr14 = new Class[0];
                    clsArr14[0] = Class.class;
                    cls5.getMethod("arrayIndexScale", clsArr14);
                    i2 = 4;
                } else {
                    clsArr13[0] = Class.class;
                    cls5.getMethod("arrayBaseOffset", clsArr13);
                    cls5.getMethod("arrayIndexScale", Class.class);
                    i2 = 2;
                }
                int i97 = b;
                int i98 = (i97 | 105) << 1;
                int i99 = -(((~i97) & 105) | (i97 & (-106)));
                int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
                a = i100 % 128;
                int i101 = i100 % 2;
                Class<?>[] clsArr15 = new Class[i2];
                clsArr15[0] = Object.class;
                Class<?> cls6 = Long.TYPE;
                clsArr15[1] = cls6;
                cls5.getMethod("getInt", clsArr15);
                Class<?>[] clsArr16 = new Class[3];
                int i102 = a;
                int i103 = i102 & 53;
                int i104 = (i102 | 53) & (~i103);
                int i105 = -(-(i103 << 1));
                int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
                b = i106 % 128;
                int i107 = i106 % 2;
                clsArr16[0] = Object.class;
                clsArr16[1] = cls6;
                clsArr16[2] = Integer.TYPE;
                cls5.getMethod("putInt", clsArr16);
                Class<?>[] clsArr17 = new Class[2];
                int i108 = a + 17;
                b = i108 % 128;
                int i109 = i108 % 2;
                clsArr17[0] = Object.class;
                clsArr17[1] = cls6;
                cls5.getMethod("getLong", clsArr17);
                Class<?>[] clsArr18 = new Class[3];
                int i110 = a;
                int i111 = ((i110 | 3) << 1) - (i110 ^ 3);
                b = i111 % 128;
                if (i111 % 2 != 0) {
                    clsArr18[0] = Object.class;
                    clsArr18[1] = cls6;
                    clsArr18[4] = cls6;
                    cls5.getMethod("putLong", clsArr18);
                    clsArr3 = new Class[2];
                } else {
                    clsArr18[0] = Object.class;
                    clsArr18[1] = cls6;
                    clsArr18[2] = cls6;
                    cls5.getMethod("putLong", clsArr18);
                    clsArr3 = new Class[2];
                }
                int i112 = b + 103;
                a = i112 % 128;
                int i113 = i112 % 2;
                clsArr3[0] = Object.class;
                clsArr3[1] = cls6;
                cls5.getMethod("getObject", clsArr3);
                Class<?>[] clsArr19 = new Class[3];
                clsArr19[0] = Object.class;
                int i114 = b;
                int i115 = ((i114 ^ 58) + ((i114 & 58) << 1)) - 1;
                a = i115 % 128;
                int i116 = i115 % 2;
                clsArr19[1] = cls6;
                clsArr19[2] = Object.class;
                cls5.getMethod("putObject", clsArr19);
                if (C0061r.b()) {
                    int i117 = a;
                    int i118 = i117 & 81;
                    int i119 = ((i117 | 81) & (~i118)) + (i118 << 1);
                    int i120 = i119 % 128;
                    b = i120;
                    int i121 = i119 % 2;
                    int i122 = (((i120 & (-76)) | ((~i120) & 75)) - (~(-(-((i120 & 75) << 1))))) - 1;
                    a = i122 % 128;
                    if (i122 % 2 != 0) {
                        int i123 = 2 % 2;
                    }
                } else {
                    cls5.getMethod("getByte", Object.class, cls6);
                    Class<?>[] clsArr20 = new Class[3];
                    int i124 = a;
                    int i125 = (((i124 | 10) << 1) - (i124 ^ 10)) - 1;
                    b = i125 % 128;
                    int i126 = i125 % 2;
                    clsArr20[0] = Object.class;
                    clsArr20[1] = cls6;
                    clsArr20[2] = Byte.TYPE;
                    cls5.getMethod("putByte", clsArr20);
                    Class<?>[] clsArr21 = new Class[2];
                    int i127 = a;
                    int i128 = ((i127 | 95) << 1) - (i127 ^ 95);
                    b = i128 % 128;
                    if (i128 % 2 != 0) {
                        clsArr21[0] = Object.class;
                        clsArr21[1] = cls6;
                        cls5.getMethod("getBoolean", clsArr21);
                        clsArr4 = new Class[3];
                        cls2 = Object.class;
                        c2 = 1;
                    } else {
                        clsArr21[0] = Object.class;
                        clsArr21[1] = cls6;
                        cls5.getMethod("getBoolean", clsArr21);
                        clsArr4 = new Class[3];
                        cls2 = Object.class;
                        c2 = 0;
                    }
                    clsArr4[c2] = cls2;
                    clsArr4[1] = cls6;
                    clsArr4[2] = Boolean.TYPE;
                    cls5.getMethod("putBoolean", clsArr4);
                    cls5.getMethod("getFloat", Object.class, cls6);
                    Class<?>[] clsArr22 = new Class[3];
                    clsArr22[0] = Object.class;
                    int i129 = b;
                    int i130 = i129 ^ 119;
                    int i131 = -(-((i129 & 119) << 1));
                    int i132 = (i130 & i131) + (i131 | i130);
                    a = i132 % 128;
                    if (i132 % 2 == 0) {
                        clsArr22[0] = cls6;
                        clsArr22[2] = Float.TYPE;
                        cls5.getMethod("putFloat", clsArr22);
                        clsArr5 = new Class[3];
                        clsArr5[1] = Object.class;
                    } else {
                        clsArr22[1] = cls6;
                        clsArr22[2] = Float.TYPE;
                        cls5.getMethod("putFloat", clsArr22);
                        clsArr5 = new Class[2];
                        clsArr5[0] = Object.class;
                    }
                    int i133 = b;
                    int i134 = i133 & 13;
                    int i135 = (i134 - (~(-(-((i133 ^ 13) | i134))))) - 1;
                    a = i135 % 128;
                    int i136 = i135 % 2;
                    clsArr5[1] = cls6;
                    cls5.getMethod("getDouble", clsArr5);
                    Class<?>[] clsArr23 = new Class[3];
                    clsArr23[0] = Object.class;
                    int i137 = b;
                    int i138 = i137 ^ 91;
                    int i139 = (((i137 & 91) | i138) << 1) - i138;
                    a = i139 % 128;
                    int i140 = i139 % 2;
                    clsArr23[1] = cls6;
                    clsArr23[2] = Double.TYPE;
                    cls5.getMethod("putDouble", clsArr23);
                    int i141 = 2 % 2;
                }
                z2 = true;
            } catch (Throwable th2) {
                Logger logger2 = d;
                Level level2 = Level.WARNING;
                StringBuilder sb2 = new StringBuilder();
                int i142 = b;
                int i143 = (-2) - ((((i142 | 18) << 1) - (i142 ^ 18)) ^ (-1));
                a = i143 % 128;
                if (i143 % 2 == 0) {
                    Object obj = null;
                    sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb2.append(th2);
                    obj.hashCode();
                    throw null;
                }
                sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                sb2.append(th2);
                logger2.log(level2, sb2.toString());
                int i144 = a;
                int i145 = i144 & 13;
                int i146 = (i144 ^ 13) | i145;
                int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
                b = i147 % 128;
                int i148 = i147 % 2;
                int i149 = 2 % 2;
                z2 = false;
            }
            k = z2;
            c = e(byte[].class);
            int i150 = b;
            i3 = (-2) - ((((i150 | 76) << 1) - (i150 ^ 76)) ^ (-1));
            a = i3 % 128;
            if (i3 % 2 != 0) {
                e(boolean[].class);
                f(boolean[].class);
                throw null;
            }
            e(boolean[].class);
            f(boolean[].class);
            int i151 = b;
            int i152 = ((i151 | 55) << 1) - (i151 ^ 55);
            a = i152 % 128;
            int i153 = i152 % 2;
            e(int[].class);
            f(int[].class);
            int i154 = b;
            int i155 = i154 & 89;
            i4 = (((i154 ^ 89) | i155) << 1) - ((i154 | 89) & (~i155));
            a = i4 % 128;
            if (i4 % 2 != 0) {
                e(long[].class);
                f(long[].class);
                throw null;
            }
            e(long[].class);
            f(long[].class);
            int i156 = b;
            int i157 = i156 & 119;
            i5 = i157 + ((i156 ^ 119) | i157);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                e(float[].class);
                f(float[].class);
                throw null;
            }
            e(float[].class);
            f(float[].class);
            int i158 = b;
            int i159 = i158 | 37;
            i6 = ((i159 << 1) - (~(-((~(i158 & 37)) & i159)))) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                e(double[].class);
                f(double[].class);
                int i160 = 71 / 0;
            } else {
                e(double[].class);
                f(double[].class);
            }
            e(Object[].class);
            f(Object[].class);
            int i161 = a;
            int i162 = i161 & 123;
            int i163 = -(-((i161 ^ 123) | i162));
            i7 = ((i162 | i163) << 1) - (i163 ^ i162);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                g();
                throw null;
            }
            fieldG = g();
            if (fieldG != null) {
                int i164 = b;
                int i165 = i164 ^ 123;
                i9 = ((((i164 & 123) | i165) << 1) - (~(-i165))) - 1;
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                bknVar = h;
                if (bknVar != null) {
                    bknVar.l(fieldG);
                    int i166 = a;
                    int i167 = i166 & 67;
                    i10 = ((i166 | 67) & (~i167)) + (i167 << 1);
                    b = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i168 = 2 % 2;
                    }
                }
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                int i169 = b;
                int i170 = (((i169 | 27) << 1) - (~(-(((~i169) & 27) | (i169 & (-28)))))) - 1;
                a = i170 % 128;
                int i171 = i170 % 2;
                int i172 = 2 % 2;
                z3 = false;
            } else {
                z3 = true;
            }
            l = z3;
            int i173 = b;
            i8 = (i173 ^ 57) + ((i173 & 57) << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i174 = 0 / 0;
            }
        }
        int i175 = a;
        int i176 = (-2) - (((i175 & 80) + (i175 | 80)) ^ (-1));
        int i177 = i176 % 128;
        b = i177;
        int i178 = i176 % 2;
        int i179 = (((i177 & (-60)) | ((~i177) & 59)) - (~(-(-((i177 & 59) << 1))))) - 1;
        a = i179 % 128;
        int i180 = i179 % 2;
        int i181 = 2 % 2;
        z2 = false;
        k = z2;
        c = e(byte[].class);
        int i1510 = b;
        i3 = (-2) - ((((i1510 | 76) << 1) - (i1510 ^ 76)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            e(boolean[].class);
            f(boolean[].class);
            throw null;
        }
        e(boolean[].class);
        f(boolean[].class);
        int i1511 = b;
        int i1512 = ((i1511 | 55) << 1) - (i1511 ^ 55);
        a = i1512 % 128;
        int i1513 = i1512 % 2;
        e(int[].class);
        f(int[].class);
        int i1514 = b;
        int i1515 = i1514 & 89;
        i4 = (((i1514 ^ 89) | i1515) << 1) - ((i1514 | 89) & (~i1515));
        a = i4 % 128;
        if (i4 % 2 != 0) {
            e(long[].class);
            f(long[].class);
            throw null;
        }
        e(long[].class);
        f(long[].class);
        int i1516 = b;
        int i1517 = i1516 & 119;
        i5 = i1517 + ((i1516 ^ 119) | i1517);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            e(float[].class);
            f(float[].class);
            throw null;
        }
        e(float[].class);
        f(float[].class);
        int i1518 = b;
        int i1519 = i1518 | 37;
        i6 = ((i1519 << 1) - (~(-((~(i1518 & 37)) & i1519)))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            e(double[].class);
            f(double[].class);
            int i1610 = 71 / 0;
        } else {
            e(double[].class);
            f(double[].class);
        }
        e(Object[].class);
        f(Object[].class);
        int i1611 = a;
        int i1612 = i1611 & 123;
        int i1613 = -(-((i1611 ^ 123) | i1612));
        i7 = ((i1612 | i1613) << 1) - (i1613 ^ i1612);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            g();
            throw null;
        }
        fieldG = g();
        if (fieldG != null) {
            int i1614 = b;
            int i1615 = i1614 ^ 123;
            i9 = ((((i1614 & 123) | i1615) << 1) - (~(-i1615))) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            bknVar = h;
            if (bknVar != null) {
                bknVar.l(fieldG);
                int i1616 = a;
                int i1617 = i1616 & 67;
                i10 = ((i1616 | 67) & (~i1617)) + (i1617 << 1);
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    int i1618 = 2 % 2;
                }
            }
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            int i1619 = b;
            int i1710 = (((i1619 | 27) << 1) - (~(-(((~i1619) & 27) | (i1619 & (-28)))))) - 1;
            a = i1710 % 128;
            int i1711 = i1710 % 2;
            int i1712 = 2 % 2;
            z3 = false;
        } else {
            z3 = true;
        }
        l = z3;
        int i1713 = b;
        i8 = (i1713 ^ 57) + ((i1713 & 57) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i1714 = 0 / 0;
        }
    }

    public static byte c(Object obj, long j2) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 33) | (i3 & 33)) << 1;
        int i5 = -(((~i3) & 33) | (i3 & (-34)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        byte bN = (byte) ((n(obj, i6 % 2 == 0 ? (-4) | j2 : (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
        int i7 = a;
        int i8 = i7 & 53;
        int i9 = (i7 ^ 53) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return bN;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public static int e(Class<?> cls) {
        int i2;
        int iD;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (((i4 | 112) << 1) - (i4 ^ 112)) - 1;
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            int i7 = 11 / 0;
            if (k) {
                i2 = ((i6 & (-34)) | ((~i6) & 33)) + ((i6 & 33) << 1);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    h.d(cls);
                    throw null;
                }
                iD = h.d(cls);
            } else {
                int i8 = (i6 & (-106)) | ((~i6) & 105);
                int i9 = -(-((i6 & 105) << 1));
                int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                iD = -1;
            }
        } else if (k) {
            i2 = ((i6 & (-34)) | ((~i6) & 33)) + ((i6 & 33) << 1);
            b = i2 % 128;
            if (i2 % 2 == 0) {
                h.d(cls);
                throw null;
            }
            iD = h.d(cls);
        } else {
            int i12 = (i6 & (-106)) | ((~i6) & 105);
            int i13 = -(-((i6 & 105) << 1));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            iD = -1;
        }
        int i16 = b;
        int i17 = i16 & 73;
        int i18 = (i17 - (~((i16 ^ 73) | i17))) - 1;
        a = i18 % 128;
        if (i18 % 2 != 0) {
            return iD;
        }
        throw null;
    }

    public static int f(Class<?> cls) {
        int iE;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 53;
        int i5 = (i4 << 1) - ((~(i3 & 53)) & i4);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (k) {
            iE = h.e(cls);
            int i7 = b;
            int i8 = (i7 & 103) + (i7 | 103);
            a = i8 % 128;
            int i9 = i8 % 2;
        } else {
            int i10 = i6 + 79;
            b = i10 % 128;
            int i11 = i10 % 2;
            iE = -1;
        }
        int i12 = a;
        int i13 = i12 & 107;
        int i14 = i13 + ((i12 ^ 107) | i13);
        b = i14 % 128;
        int i15 = i14 % 2;
        return iE;
    }

    public static boolean h(Object obj, long j2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 45) + (i3 | 45);
        b = i4 % 128;
        int i5 = i4 % 2;
        boolean zF = h.f(obj, j2);
        int i6 = a + 55;
        b = i6 % 128;
        int i7 = i6 % 2;
        return zF;
    }

    public static byte j(byte[] bArr, long j2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 17) + ((i3 & 17) << 1);
        b = i4 % 128;
        byte bG = i4 % 2 != 0 ? h.g(bArr, j2 | c) : h.g(bArr, c + j2);
        int i5 = b;
        int i6 = ((i5 | 61) << 1) - (i5 ^ 61);
        a = i6 % 128;
        int i7 = i6 % 2;
        return bG;
    }

    public static byte k(Object obj, long j2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 87;
        int i5 = ((i3 & 87) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int iN = (n(obj, i7 % 2 != 0 ? (-4) - j2 : (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255;
        int i8 = a;
        int i9 = i8 + 37;
        b = i9 % 128;
        int i10 = i9 % 2;
        byte b2 = (byte) iN;
        int i11 = i8 + 109;
        b = i11 % 128;
        int i12 = i11 % 2;
        return b2;
    }

    public static double l(Object obj, long j2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 6) + ((i3 & 6) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return h.i(obj, j2);
        }
        h.i(obj, j2);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static float m(Object obj, long j2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 68) + ((i3 & 68) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        float fH = h.h(obj, j2);
        int i7 = a;
        int i8 = i7 & 23;
        int i9 = (i8 - (~(-(-((i7 ^ 23) | i8))))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 93 / 0;
        }
        return fH;
    }

    public static int n(Object obj, long j2) {
        int i2 = 2 % 2;
        int i3 = a + 31;
        b = i3 % 128;
        int i4 = i3 % 2;
        int iJ = h.j(obj, j2);
        int i5 = b;
        int i6 = i5 & 89;
        int i7 = -(-(i5 | 89));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return iJ;
        }
        throw null;
    }

    public static Object o(Object obj, long j2) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 9;
        int i5 = i4 + ((i3 ^ 9) | i4);
        a = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            h.c(obj, j2);
            obj2.hashCode();
            throw null;
        }
        Object objC = h.c(obj, j2);
        int i6 = b;
        int i7 = i6 & 59;
        int i8 = -(-((i6 ^ 59) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return objC;
        }
        throw null;
    }

    public static long p(Object obj, long j2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 111;
        int i5 = ((i3 ^ 111) | i4) << 1;
        int i6 = -((i3 | 111) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        long jK = h.k(obj, j2);
        int i9 = b;
        int i10 = (i9 ^ 113) + ((i9 & 113) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return jK;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static Unsafe q() {
        Unsafe unsafe;
        int i2 = 2 % 2;
        Object obj = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new bkm());
            int i3 = a;
            int i4 = (i3 & 64) + (i3 | 64);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 & 93;
            int i8 = (i3 ^ 93) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
        } catch (Throwable unused) {
            unsafe = null;
        }
        int i11 = b;
        int i12 = i11 & 33;
        int i13 = -(-(i11 | 33));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            return unsafe;
        }
        obj.hashCode();
        throw null;
    }

    public static void r(Object obj, long j2, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 80) + (i3 | 80)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        h.m(obj, j2, z);
        if (i5 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static void t(byte[] bArr, long j2, byte b2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 23) + (i3 | 23);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            h.n(bArr, j2 | c, b2);
        } else {
            h.n(bArr, c + j2, b2);
        }
    }

    public static void v(Object obj, long j2, Object obj2) {
        int i2 = 2 % 2;
        int i3 = b + 85;
        a = i3 % 128;
        int i4 = i3 % 2;
        h.s(obj, j2, obj2);
        int i5 = b;
        int i6 = i5 ^ 45;
        int i7 = ((i5 & 45) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public static void w(Object obj, long j2, float f2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 22) + (i3 | 22)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        h.o(obj, j2, f2);
        int i6 = a;
        int i7 = (i6 ^ 15) + ((i6 & 15) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public static void x(Object obj, long j2, double d2) {
        int i2 = 2 % 2;
        int i3 = b + 109;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            h.p(obj, j2, d2);
            return;
        }
        h.p(obj, j2, d2);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static void y(Object obj, long j2, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 79;
        int i6 = -(-((i4 ^ 79) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        h.q(obj, j2, i2);
        int i9 = b;
        int i10 = (((i9 | 69) << 1) - (~(-(((~i9) & 69) | (i9 & (-70)))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public static void z(Object obj, long j2, long j3) {
        int i2 = 2 % 2;
        int i3 = b + 85;
        a = i3 % 128;
        int i4 = i3 % 2;
        h.r(obj, j2, j3);
        int i5 = b;
        int i6 = (i5 & (-10)) | ((~i5) & 9);
        int i7 = -(-((i5 & 9) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public static <T> T d(Class<T> cls) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 67) + ((i3 & 67) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        try {
            T t = (T) e.allocateInstance(cls);
            int i6 = a;
            int i7 = i6 & 17;
            int i8 = ((i6 ^ 17) | i7) << 1;
            int i9 = -((i6 | 17) & (~i7));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return t;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void s(Object obj, long j2, byte b2) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 71;
        int i7 = (i5 ^ 71) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        long j3 = i8 % 2 != 0 ? (-4) ^ j2 : (-4) & j2;
        int iN = n(obj, j3);
        int i9 = ((~((int) j2)) & 3) << 3;
        bkn bknVar = h;
        int i10 = b;
        int i11 = i10 + 105;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            i2 = (b2 & 11308) >>> i9;
            i3 = 16927 - (~(-(~(-(-i9)))));
        } else {
            i2 = (b2 & 255) << i9;
            i3 = 255 << i9;
        }
        int i12 = i10 & 111;
        int i13 = i10 | 111;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (~i3) & iN;
        int i17 = i2 & i16;
        int i18 = (i16 | i2) & (~i17);
        bknVar.q(obj, j3, (i18 & i17) | (i18 ^ i17));
        int i19 = a;
        int i20 = i19 & 75;
        int i21 = ((i19 ^ 75) | i20) << 1;
        int i22 = -((i19 | 75) & (~i20));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            throw null;
        }
    }

    public static void u(Object obj, long j2, byte b2) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 49;
        a = i5 % 128;
        int i6 = i5 % 2;
        long j3 = (-4) & j2;
        int iN = n(obj, j3);
        int i7 = a;
        int i8 = ((i7 ^ 85) | (i7 & 85)) << 1;
        int i9 = -((i7 & (-86)) | ((~i7) & 85));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = (int) j2;
            int i12 = (i11 & 5) ^ 4;
            int i13 = ((i11 & 4) | i12) << 1;
            int i14 = -i12;
            i2 = (i13 & i14) + (i13 | i14);
        } else {
            i2 = (((int) j2) & 3) << 3;
        }
        bkn bknVar = h;
        int i15 = (i7 ^ 51) + ((i7 & 51) << 1);
        int i16 = i15 % 128;
        b = i16;
        if (i15 % 2 != 0) {
            int i17 = ((~b2) & 18674) | (b2 & (-18675));
            int i18 = b2 & 18674;
            i3 = ((i17 & i18) | (i17 ^ i18)) >>> i2;
        } else {
            i3 = (b2 & 255) << i2;
        }
        int i19 = i16 + 67;
        a = i19 % 128;
        int i20 = i19 % 2;
        int i21 = (~(255 << i2)) & iN;
        int i22 = i3 & i21;
        int i23 = (i3 | i21) & (~i22);
        bknVar.q(obj, j3, (i23 & i22) | (i23 ^ i22));
        int i24 = a;
        int i25 = ((i24 ^ 59) | (i24 & 59)) << 1;
        int i26 = -(((~i24) & 59) | (i24 & (-60)));
        int i27 = (i25 & i26) + (i26 | i25);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 4 / 0;
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 9;
        int i5 = -(-((i3 ^ 9) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        Field field = null;
        if (i6 % 2 != 0) {
            C0061r.b();
            throw null;
        }
        if (C0061r.b()) {
            try {
                declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                int i7 = b;
                int i8 = i7 & 63;
                int i9 = -(-((i7 ^ 63) | i8));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
            } catch (Throwable unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                int i12 = b + 86;
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    return declaredField;
                }
                throw null;
            }
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
            int i14 = b;
            int i15 = i14 & 117;
            int i16 = (i14 | 117) & (~i15);
            int i17 = i15 << 1;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            a = i18 % 128;
            int i19 = i18 % 2;
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 != null) {
            int i20 = b;
            int i21 = i20 & 71;
            int i22 = (((i20 | 71) & (~i21)) - (~(-(-(i21 << 1))))) - 1;
            a = i22 % 128;
            if (i22 % 2 == 0) {
                declaredField2.getType();
                Class cls = Long.TYPE;
                field.hashCode();
                throw null;
            }
            if (declaredField2.getType() == Long.TYPE) {
                int i23 = b;
                int i24 = i23 & 13;
                int i25 = (((i23 ^ 13) | i24) << 1) - ((i23 | 13) & (~i24));
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = 47 / 0;
                }
                field = declaredField2;
            }
        }
        int i27 = b;
        int i28 = (i27 & 99) + (i27 | 99);
        a = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 82 / 0;
        }
        return field;
    }

    public static boolean i(Class<?> cls) {
        Class<?>[] clsArr;
        Class<?> cls2;
        Class<?>[] clsArr2;
        int i2 = 2 % 2;
        int i3 = a + 93;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            C0061r.b();
            throw null;
        }
        if (!C0061r.b()) {
            int i4 = b;
            int i5 = (-2) - (((i4 ^ 82) + ((i4 & 82) << 1)) ^ (-1));
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = ((i4 & (-30)) | ((~i4) & 29)) + ((i4 & 29) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        try {
            Class<?> cls3 = f;
            Class<?> cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", cls, cls4);
            int i9 = a + 101;
            b = i9 % 128;
            int i10 = i9 % 2;
            cls3.getMethod("pokeLong", cls, Long.TYPE, cls4);
            int i11 = b;
            int i12 = ((i11 ^ 112) + ((i11 & 112) << 1)) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                clsArr = new Class[2];
                clsArr[1] = cls;
                cls2 = Integer.TYPE;
                clsArr[1] = cls2;
                clsArr[3] = cls4;
            } else {
                cls2 = Integer.TYPE;
                clsArr = new Class[]{cls, cls2, cls4};
            }
            int i13 = a;
            int i14 = (i13 | 85) << 1;
            int i15 = -(i13 ^ 85);
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                cls3.getMethod("pokeInt", clsArr);
                Class<?>[] clsArr3 = new Class[4];
                clsArr3[1] = cls;
                clsArr3[1] = cls4;
                cls3.getMethod("peekInt", clsArr3);
            } else {
                cls3.getMethod("pokeInt", clsArr);
                cls3.getMethod("peekInt", cls, cls4);
            }
            int i17 = a;
            int i18 = ((i17 ^ 23) | (i17 & 23)) << 1;
            int i19 = -(((~i17) & 23) | (i17 & (-24)));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            b = i20 % 128;
            int i21 = i20 % 2;
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            Class<?>[] clsArr4 = new Class[1];
            int i22 = b;
            int i23 = ((i22 | 87) << 1) - (i22 ^ 87);
            a = i23 % 128;
            int i24 = i23 % 2;
            clsArr4[0] = cls;
            cls3.getMethod("peekByte", clsArr4);
            Class<?>[] clsArr5 = new Class[4];
            clsArr5[0] = cls;
            clsArr5[1] = byte[].class;
            int i25 = a;
            int i26 = (i25 & (-104)) | ((~i25) & 103);
            int i27 = (i25 & 103) << 1;
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            b = i28 % 128;
            if (i28 % 2 != 0) {
                clsArr5[4] = cls2;
                clsArr5[5] = cls2;
                cls3.getMethod("pokeByteArray", clsArr5);
                clsArr2 = new Class[3];
                clsArr2[1] = cls;
            } else {
                clsArr5[2] = cls2;
                clsArr5[3] = cls2;
                cls3.getMethod("pokeByteArray", clsArr5);
                clsArr2 = new Class[4];
                clsArr2[0] = cls;
            }
            clsArr2[1] = byte[].class;
            clsArr2[2] = cls2;
            clsArr2[3] = cls2;
            cls3.getMethod("peekByteArray", clsArr2);
            int i29 = a;
            int i30 = (i29 & 92) + (i29 | 92);
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            b = i31 % 128;
            int i32 = i31 % 2;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
