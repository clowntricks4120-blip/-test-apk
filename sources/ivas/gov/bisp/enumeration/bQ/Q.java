package ivas.gov.bisp.enumeration.bQ;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bR.aS;
import ivas.gov.bisp.enumeration.bV.B;

/* JADX INFO: loaded from: classes.dex */
public final class Q {
    private static int a = 0;
    private static int b = 1;
    public static final O c;

    /* JADX WARN: Code duplicated, block: B:108:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:122:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    /* JADX WARN: Code duplicated, block: B:47:0x015e A[Catch: ClassCastException -> 0x016a, ClassNotFoundException -> 0x01ae, TRY_ENTER, TRY_LEAVE, TryCatch #4 {ClassCastException -> 0x016a, blocks: (B:47:0x015e, B:49:0x0164, B:50:0x0167), top: B:119:0x015c, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0164 A[Catch: ClassCastException -> 0x016a, ClassNotFoundException -> 0x01ae, TRY_ENTER, TRY_LEAVE, TryCatch #4 {ClassCastException -> 0x016a, blocks: (B:47:0x015e, B:49:0x0164, B:50:0x0167), top: B:119:0x015c, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0206  */
    /* JADX WARN: Code duplicated, block: B:79:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0218  */
    static {
        int i;
        int i2;
        O o2;
        Object objNewInstance;
        int i3;
        Object objNewInstance2;
        int i4;
        int iAx;
        String property = System.getProperty("java.specification.version");
        Object obj = null;
        if (property != null) {
            int i5 = b;
            int i6 = i5 & 11;
            int i7 = -(-((i5 ^ 11) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            try {
                if (i8 % 2 == 0 ? (iAx = B.ax(property, '.', 0, false, 6)) >= 0 : (iAx = B.ax(property, 'G', 0, true, 27)) >= 0) {
                    int i9 = (iAx ^ 1) + ((iAx & 1) << 1);
                    int iAx2 = B.ax(property, '.', i9, false, 4);
                    int i10 = b;
                    int i11 = (i10 & 83) + (i10 | 83);
                    a = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 17 / 0;
                        if (iAx2 < 0) {
                            iAx2 = property.length();
                            int i13 = a + 83;
                            b = i13 % 128;
                            int i14 = i13 % 2;
                            int i15 = 2 % 2;
                        }
                    } else if (iAx2 < 0) {
                        iAx2 = property.length();
                        int i16 = a + 83;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = 2 % 2;
                    }
                    String strSubstring = property.substring(0, iAx);
                    r.m(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int i19 = a;
                    int i20 = i19 & 79;
                    int i21 = i20 + ((i19 ^ 79) | i20);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    String strSubstring2 = property.substring(i9, iAx2);
                    int i23 = a;
                    int i24 = i23 & 27;
                    int i25 = (i23 ^ 27) | i24;
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    b = i26 % 128;
                    if (i26 % 2 == 0) {
                        r.m(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        Integer.parseInt(strSubstring);
                        Integer.parseInt(strSubstring2);
                        obj.hashCode();
                        throw null;
                    }
                    r.m(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    i2 = (Integer.parseInt(strSubstring2) - (~(-(~(Integer.parseInt(strSubstring) * 65536))))) - 2;
                    int i27 = a;
                    int i28 = ((i27 ^ 10) + ((i27 & 10) << 1)) - 1;
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = 2 % 2;
                } else {
                    int i31 = a;
                    int i32 = i31 & 29;
                    int i33 = ((i31 ^ 29) | i32) << 1;
                    int i34 = -((i31 | 29) & (~i32));
                    int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                    b = i35 % 128;
                    if (i35 % 2 == 0) {
                        int i36 = Integer.parseInt(property);
                        i2 = ((i36 & 65536) - (~(-(-(i36 | 65536))))) - 1;
                    } else {
                        i2 = Integer.parseInt(property) * 65536;
                    }
                    int i37 = b;
                    int i38 = (i37 & (-12)) | ((~i37) & 11);
                    int i39 = (i37 & 11) << 1;
                    int i40 = (i38 & i39) + (i39 | i38);
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    int i42 = 2 % 2;
                }
            } catch (NumberFormatException unused) {
                int i43 = b;
                int i44 = i43 & 19;
                int i45 = (i43 | 19) & (~i44);
                int i46 = -(-(i44 << 1));
                i = ((i45 | i46) << 1) - (i45 ^ i46);
                a = i % 128;
                if (i % 2 == 0) {
                    int i47 = 2 % 2;
                }
                i2 = 65542;
            }
        } else {
            int i48 = b;
            int i49 = i48 & 19;
            int i410 = (i48 | 19) & (~i49);
            int i411 = -(-(i49 << 1));
            i = ((i410 | i411) << 1) - (i410 ^ i411);
            a = i % 128;
            if (i % 2 == 0) {
                int i412 = 2 % 2;
            }
            i2 = 65542;
        }
        if (i2 < 65544) {
            int i50 = b;
            int i51 = ((i50 & (-76)) | ((~i50) & 75)) + ((i50 & 75) << 1);
            a = i51 % 128;
            int i52 = i51 % 2;
            if (i2 < 65536) {
                try {
                    objNewInstance = aS.class.newInstance();
                    r.m(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                    int i53 = a;
                    i3 = ((i53 ^ 119) - (~(-(-((i53 & 119) << 1))))) - 1;
                    b = i3 % 128;
                    try {
                        try {
                            if (i3 % 2 != 0) {
                                throw null;
                            }
                            o2 = (O) objNewInstance;
                            int i54 = 2 % 2;
                        } catch (ClassNotFoundException unused2) {
                            if (i2 < 65543) {
                                int i55 = b;
                                i4 = (i55 ^ 39) + ((i55 & 39) << 1);
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (i2 < 65536) {
                                    try {
                                        objNewInstance2 = ivas.gov.bisp.enumeration.bP.O.class.newInstance();
                                        r.m(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                                        int i56 = a;
                                        int i57 = i56 & 99;
                                        int i58 = -(-((i56 ^ 99) | i57));
                                        int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                                        b = i59 % 128;
                                        int i60 = i59 % 2;
                                        try {
                                            try {
                                                o2 = (O) objNewInstance2;
                                                int i61 = (i56 & 93) + (i56 | 93);
                                                b = i61 % 128;
                                                int i62 = i61 % 2;
                                                int i63 = 2 % 2;
                                            } catch (ClassCastException e) {
                                                ClassLoader classLoader = objNewInstance2.getClass().getClassLoader();
                                                ClassLoader classLoader2 = O.class.getClassLoader();
                                                if (r.f(classLoader, classLoader2)) {
                                                    throw e;
                                                }
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Instance class was loaded from a different classloader: ");
                                                sb.append(classLoader);
                                                sb.append(", base type classloader: ");
                                                sb.append(classLoader2);
                                                ClassNotFoundException classNotFoundException = new ClassNotFoundException(sb.toString(), e);
                                                int i64 = b;
                                                int i65 = i64 ^ 13;
                                                int i66 = ((i64 & 13) | i65) << 1;
                                                int i67 = -i65;
                                                int i68 = (i66 & i67) + (i66 | i67);
                                                a = i68 % 128;
                                                int i69 = i68 % 2;
                                                throw classNotFoundException;
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                            o2 = new O();
                                            int i70 = a;
                                            int i71 = (i70 & 77) + (i70 | 77);
                                            b = i71 % 128;
                                            int i72 = i71 % 2;
                                            int i73 = 2 % 2;
                                        }
                                    } catch (ClassNotFoundException unused4) {
                                        Object objNewInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                                        r.m(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                                        try {
                                            o2 = (O) objNewInstance3;
                                        } catch (ClassCastException e2) {
                                            ClassLoader classLoader3 = objNewInstance3.getClass().getClassLoader();
                                            ClassLoader classLoader4 = O.class.getClassLoader();
                                            if (r.f(classLoader3, classLoader4)) {
                                                throw e2;
                                            }
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Instance class was loaded from a different classloader: ");
                                            sb2.append(classLoader3);
                                            sb2.append(", base type classloader: ");
                                            sb2.append(classLoader4);
                                            ClassNotFoundException classNotFoundException2 = new ClassNotFoundException(sb2.toString(), e2);
                                            int i74 = a;
                                            int i75 = ((i74 & (-100)) | ((~i74) & 99)) + ((i74 & 99) << 1);
                                            b = i75 % 128;
                                            if (i75 % 2 != 0) {
                                                throw classNotFoundException2;
                                            }
                                            throw null;
                                        }
                                    }
                                } else {
                                    o2 = new O();
                                    int i76 = a;
                                    int i77 = (i76 & 77) + (i76 | 77);
                                    b = i77 % 128;
                                    int i78 = i77 % 2;
                                    int i79 = 2 % 2;
                                }
                            } else {
                                objNewInstance2 = ivas.gov.bisp.enumeration.bP.O.class.newInstance();
                                r.m(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                                int i510 = a;
                                int i511 = i510 & 99;
                                int i512 = -(-((i510 ^ 99) | i511));
                                int i513 = ((i511 | i512) << 1) - (i511 ^ i512);
                                b = i513 % 128;
                                int i610 = i513 % 2;
                                o2 = (O) objNewInstance2;
                                int i611 = (i510 & 93) + (i510 | 93);
                                b = i611 % 128;
                                int i612 = i611 % 2;
                                int i613 = 2 % 2;
                            }
                        }
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = objNewInstance.getClass().getClassLoader();
                        ClassLoader classLoader6 = O.class.getClassLoader();
                        if (r.f(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Instance class was loaded from a different classloader: ");
                        sb3.append(classLoader5);
                        sb3.append(", base type classloader: ");
                        sb3.append(classLoader6);
                        ClassNotFoundException classNotFoundException3 = new ClassNotFoundException(sb3.toString(), e3);
                        int i80 = a;
                        int i81 = i80 & 61;
                        int i82 = (((i80 | 61) & (~i81)) - (~(-(-(i81 << 1))))) - 1;
                        b = i82 % 128;
                        int i83 = i82 % 2;
                        throw classNotFoundException3;
                    }
                } catch (ClassNotFoundException unused5) {
                    Object objNewInstance4 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    r.m(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        o2 = (O) objNewInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader7 = objNewInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = O.class.getClassLoader();
                        if (r.f(classLoader7, classLoader8)) {
                            throw e4;
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Instance class was loaded from a different classloader: ");
                        sb4.append(classLoader7);
                        sb4.append(", base type classloader: ");
                        sb4.append(classLoader8);
                        ClassNotFoundException classNotFoundException4 = new ClassNotFoundException(sb4.toString(), e4);
                        int i84 = b + 87;
                        a = i84 % 128;
                        if (i84 % 2 == 0) {
                            throw classNotFoundException4;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            } else if (i2 < 65543) {
                int i514 = b;
                i4 = (i514 ^ 39) + ((i514 & 39) << 1);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i2 < 65536) {
                    objNewInstance2 = ivas.gov.bisp.enumeration.bP.O.class.newInstance();
                    r.m(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    int i515 = a;
                    int i516 = i515 & 99;
                    int i517 = -(-((i515 ^ 99) | i516));
                    int i518 = ((i516 | i517) << 1) - (i516 ^ i517);
                    b = i518 % 128;
                    int i614 = i518 % 2;
                    o2 = (O) objNewInstance2;
                    int i615 = (i515 & 93) + (i515 | 93);
                    b = i615 % 128;
                    int i616 = i615 % 2;
                    int i617 = 2 % 2;
                } else {
                    o2 = new O();
                    int i710 = a;
                    int i711 = (i710 & 77) + (i710 | 77);
                    b = i711 % 128;
                    int i712 = i711 % 2;
                    int i713 = 2 % 2;
                }
            } else {
                objNewInstance2 = ivas.gov.bisp.enumeration.bP.O.class.newInstance();
                r.m(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                int i519 = a;
                int i5110 = i519 & 99;
                int i5111 = -(-((i519 ^ 99) | i5110));
                int i5112 = ((i5110 | i5111) << 1) - (i5110 ^ i5111);
                b = i5112 % 128;
                int i618 = i5112 % 2;
                o2 = (O) objNewInstance2;
                int i619 = (i519 & 93) + (i519 | 93);
                b = i619 % 128;
                int i6110 = i619 % 2;
                int i6111 = 2 % 2;
            }
        } else {
            objNewInstance = aS.class.newInstance();
            r.m(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            int i520 = a;
            i3 = ((i520 ^ 119) - (~(-(-((i520 & 119) << 1))))) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            o2 = (O) objNewInstance;
            int i521 = 2 % 2;
        }
        c = o2;
        int i85 = a;
        int i86 = ((i85 & 20) + (i85 | 20)) - 1;
        b = i86 % 128;
        int i87 = i86 % 2;
    }
}
