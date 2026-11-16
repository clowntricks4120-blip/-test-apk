package ivas.gov.bisp.enumeration.bQ;

import ivas.gov.bisp.enumeration.O.r;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class O {
    private static int a = 0;
    private static int b = 1;

    public static final class byr {
        private static int a = 0;
        private static int b = 1;
        public static final Method c;

        /* JADX WARN: Code duplicated, block: B:17:0x0097  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:60:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x00e8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x0121 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x003a A[SYNTHETIC] */
        static {
            Method method;
            boolean z;
            int i;
            int i2;
            Class<?> cls;
            int i3;
            Method[] methods = Throwable.class.getMethods();
            r.m(methods, "throwableMethods");
            int i4 = a;
            int i5 = i4 & 121;
            int i6 = (i4 | 121) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int length = methods.length;
            int i11 = (i9 | 59) << 1;
            int i12 = -(((~i9) & 59) | (i9 & (-60)));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            int i16 = 0;
            while (true) {
                Object obj = null;
                if (i16 >= length) {
                    method = null;
                    break;
                }
                int i17 = a;
                int i18 = i17 & 37;
                int i19 = -(-((i17 ^ 37) | i18));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    r.f(methods[i16].getName(), "addSuppressed");
                    throw null;
                }
                method = methods[i16];
                boolean zF = r.f(method.getName(), "addSuppressed");
                int i21 = b;
                int i22 = (i21 & (-54)) | ((~i21) & 53);
                int i23 = (i21 & 53) << 1;
                int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    if (!(!zF)) {
                        z = false;
                        int i25 = (i21 & (-8)) | ((~i21) & 7);
                        int i26 = (i21 & 7) << 1;
                        i2 = (i25 & i26) + (i26 | i25);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            r.m(method.getParameterTypes(), "it.parameterTypes");
                            obj.hashCode();
                            throw null;
                        }
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        r.m(parameterTypes, "it.parameterTypes");
                        int i27 = b;
                        int i28 = ((i27 ^ 29) - (~(-(-((i27 & 29) << 1))))) - 1;
                        int i29 = i28 % 128;
                        a = i29;
                        if (i28 % 2 != 0 ? parameterTypes.length == 1 : parameterTypes.length == 0) {
                            int i30 = i29 ^ 47;
                            int i31 = (i29 & 47) << 1;
                            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                            int i33 = i32 % 128;
                            b = i33;
                            int i34 = i32 % 2;
                            cls = parameterTypes[0];
                            int i35 = i33 & 109;
                            int i36 = -(-((i33 ^ 109) | i35));
                            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                            a = i37 % 128;
                            int i38 = i37 % 2;
                        }
                        if (!r.f(cls, Throwable.class)) {
                            if (z) {
                                int i39 = a;
                                int i40 = i39 & 61;
                                i3 = i40 + ((i39 ^ 61) | i40);
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    break;
                                } else {
                                    throw null;
                                }
                            }
                        }
                    }
                    i16 = ((i16 & 1) << 1) + (i16 ^ 1);
                    i = a + 65;
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i41 = 3 % 4;
                    }
                } else {
                    if (!(!zF)) {
                        z = true;
                        int i210 = (i21 & (-8)) | ((~i21) & 7);
                        int i211 = (i21 & 7) << 1;
                        i2 = (i210 & i211) + (i211 | i210);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            r.m(method.getParameterTypes(), "it.parameterTypes");
                            obj.hashCode();
                            throw null;
                        }
                        Class<?>[] parameterTypes2 = method.getParameterTypes();
                        r.m(parameterTypes2, "it.parameterTypes");
                        int i212 = b;
                        int i213 = ((i212 ^ 29) - (~(-(-((i212 & 29) << 1))))) - 1;
                        int i214 = i213 % 128;
                        a = i214;
                        cls = i213 % 2 != 0 ? null : null;
                        if (!r.f(cls, Throwable.class)) {
                            if (z) {
                                int i310 = a;
                                int i42 = i310 & 61;
                                i3 = i42 + ((i310 ^ 61) | i42);
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    break;
                                } else {
                                    throw null;
                                }
                            }
                        }
                    }
                    i16 = ((i16 & 1) << 1) + (i16 ^ 1);
                    i = a + 65;
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i43 = 3 % 4;
                    }
                }
                int i44 = b;
                int i45 = (i44 & 87) + (i44 | 87);
                a = i45 % 128;
                int i46 = i45 % 2;
                i16 = ((i16 & 1) << 1) + (i16 ^ 1);
                i = a + 65;
                b = i % 128;
                if (i % 2 == 0) {
                    int i47 = 3 % 4;
                }
            }
            c = method;
            int length2 = methods.length;
            int i48 = b;
            int i49 = i48 & 109;
            int i50 = ((i48 | 109) & (~i49)) + (i49 << 1);
            a = i50 % 128;
            int i51 = i50 % 2;
            int i52 = 0;
            while (i52 < length2) {
                int i53 = b;
                int i54 = ((i53 & 52) + (i53 | 52)) - 1;
                a = i54 % 128;
                if (i54 % 2 == 0) {
                    if (r.f(methods[i52].getName(), "getSuppressed")) {
                        break;
                    }
                    int i55 = (i52 & 22) | ((~i52) & (-23));
                    int i56 = -(-((i52 & (-23)) << 1));
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    int i58 = i57 ^ 24;
                    int i59 = ((i57 & 24) | i58) << 1;
                    int i60 = -i58;
                    i52 = (i60 | i59) + (i59 & i60);
                    int i61 = b;
                    int i62 = (i61 ^ 51) + ((i61 & 51) << 1);
                    a = i62 % 128;
                    int i63 = i62 % 2;
                } else {
                    int i64 = 64 / 0;
                    if (!(!r.f(methods[i52].getName(), "getSuppressed"))) {
                        break;
                    }
                    int i510 = (i52 & 22) | ((~i52) & (-23));
                    int i511 = -(-((i52 & (-23)) << 1));
                    int i512 = ((i510 | i511) << 1) - (i511 ^ i510);
                    int i513 = i512 ^ 24;
                    int i514 = ((i512 & 24) | i513) << 1;
                    int i65 = -i513;
                    i52 = (i65 | i514) + (i514 & i65);
                    int i66 = b;
                    int i67 = (i66 ^ 51) + ((i66 & 51) << 1);
                    a = i67 % 128;
                    int i68 = i67 % 2;
                }
            }
            int i69 = a;
            int i70 = i69 & 93;
            int i71 = (((i69 ^ 93) | i70) << 1) - ((i69 | 93) & (~i70));
            b = i71 % 128;
            if (i71 % 2 == 0) {
                throw null;
            }
        }
    }

    public void c(Throwable th, Throwable th2) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 103;
        int i4 = (((i2 & 103) | i3) << 1) - i3;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            Method method = byr.c;
            throw null;
        }
        Method method2 = byr.c;
        if (method2 != null) {
            int i5 = b;
            int i6 = ((i5 & 115) - (~(i5 | 115))) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                objArr = new Object[0];
                objArr[1] = th2;
            } else {
                objArr = new Object[]{th2};
            }
            method2.invoke(th, objArr);
            int i7 = a;
            int i8 = i7 & 15;
            int i9 = (i7 ^ 15) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = (-2) - ((b + 120) ^ (-1));
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
