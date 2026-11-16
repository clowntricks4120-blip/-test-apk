package ivas.gov.bisp.enumeration.p027b;

import androidx.lifecycle.b;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ag {
    private static int a = 0;
    private static int b = 1;
    public static Map<Class<?>, Integer> c = new HashMap();
    public static Map<Class<?>, List<Constructor<? extends e>>> d;

    static {
        HashMap map = new HashMap();
        int i = a;
        int i2 = i & 65;
        int i3 = (i | 65) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        d = map;
        int i8 = i6 & 105;
        int i9 = ((i6 ^ 105) | i8) << 1;
        int i10 = -((i6 | 105) & (~i8));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public static String c(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        String strReplace = str.replace(".", "_");
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = i3 + ((i2 ^ 71) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        sb.append(strReplace);
        sb.append("_LifecycleAdapter");
        String string = sb.toString();
        int i6 = a;
        int i7 = i6 & 37;
        int i8 = i7 + ((i6 ^ 37) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    public static e b(Constructor<? extends e> constructor, Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 107) | (i2 & 107)) << 1;
        int i4 = -(((~i2) & 107) | (i2 & (-108)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        try {
            e eVarNewInstance = constructor.newInstance(obj);
            int i7 = b;
            int i8 = i7 ^ 15;
            int i9 = (i7 & 15) << 1;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = ((i11 ^ 75) | (i11 & 75)) << 1;
            int i14 = -(((~i11) & 75) | (i11 & (-76)));
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 9 / 0;
            }
            return eVarNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0301  */
    /* JADX WARN: Code duplicated, block: B:103:0x0314  */
    /* JADX WARN: Code duplicated, block: B:106:0x031b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0359  */
    /* JADX WARN: Code duplicated, block: B:112:0x036f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0370  */
    /* JADX WARN: Code duplicated, block: B:116:0x0379  */
    /* JADX WARN: Code duplicated, block: B:118:0x0390  */
    /* JADX WARN: Code duplicated, block: B:120:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:122:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:126:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:130:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:134:0x0400  */
    /* JADX WARN: Code duplicated, block: B:137:0x041f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0427  */
    /* JADX WARN: Code duplicated, block: B:142:0x0437  */
    /* JADX WARN: Code duplicated, block: B:145:0x044b  */
    /* JADX WARN: Code duplicated, block: B:147:0x045d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0468  */
    /* JADX WARN: Code duplicated, block: B:151:0x047d  */
    /* JADX WARN: Code duplicated, block: B:155:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0423 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x043a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01dc A[PHI: r8
  0x01dc: PHI (r8v44 java.lang.Boolean) = (r8v2 java.lang.Boolean), (r8v45 java.lang.Boolean) binds: [B:67:0x01da, B:64:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x020b  */
    /* JADX WARN: Code duplicated, block: B:80:0x021f  */
    /* JADX WARN: Code duplicated, block: B:83:0x023f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0259 A[LOOP:1: B:77:0x0209->B:85:0x0259, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x02be  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02fe  */
    public static int d(Class<?> cls) {
        Constructor<?> declaredConstructor;
        Boolean bool;
        Method[] declaredMethods;
        int length;
        int i;
        int i2;
        int i3;
        Class<? super Object> superclass;
        boolean z;
        ArrayList arrayList;
        Class<?>[] interfaces;
        int length2;
        int i4;
        int i5;
        int i6;
        int i7;
        Class<?> cls2;
        int i8;
        int i9;
        boolean z2;
        int i10;
        Collection collection;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        List listSingletonList;
        HashMap map;
        String name;
        int i19;
        int i20 = 2 % 2;
        int i21 = b;
        int i22 = i21 & 51;
        int i23 = (i21 ^ 51) | i22;
        int i24 = (i22 & i23) + (i23 | i22);
        a = i24 % 128;
        Object obj = null;
        if (i24 % 2 != 0) {
            throw null;
        }
        Integer num = (Integer) ((HashMap) c).get(cls);
        if (num != null) {
            int i25 = a;
            int i26 = (i25 & 23) + (i25 | 23);
            b = i26 % 128;
            int i27 = i26 % 2;
            int iIntValue = num.intValue();
            int i28 = a;
            int i29 = i28 ^ 37;
            int i30 = ((i28 & 37) | i29) << 1;
            int i31 = -i29;
            int i32 = (i30 & i31) + (i30 | i31);
            b = i32 % 128;
            int i33 = i32 % 2;
            return iIntValue;
        }
        if (cls.getCanonicalName() != null) {
            try {
                Package r7 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r7 != null) {
                    int i34 = b + 109;
                    a = i34 % 128;
                    if (i34 % 2 != 0) {
                        r7.getName();
                        throw null;
                    }
                    name = r7.getName();
                    int i35 = b;
                    int i36 = ((i35 ^ 23) | (i35 & 23)) << 1;
                    int i37 = -(((~i35) & 23) | (i35 & (-24)));
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                } else {
                    name = BuildConfig.FLAVOR;
                }
                if (!name.isEmpty()) {
                    int length3 = name.length() + 2;
                    canonicalName = canonicalName.substring((length3 ^ (-1)) + (length3 << 1));
                    int i40 = a;
                    int i41 = i40 & 37;
                    int i42 = (((i40 ^ 37) | i41) << 1) - ((i40 | 37) & (~i41));
                    b = i42 % 128;
                    int i43 = i42 % 2;
                }
                String strC = c(canonicalName);
                if (!name.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int i44 = a;
                    int i45 = ((i44 | 103) << 1) - (i44 ^ 103);
                    b = i45 % 128;
                    int i46 = i45 % 2;
                    sb.append(name);
                    sb.append(".");
                    int i47 = a;
                    int i48 = i47 & 3;
                    int i49 = -(-((i47 ^ 3) | i48));
                    int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                    b = i50 % 128;
                    int i51 = i50 % 2;
                    sb.append(strC);
                    strC = sb.toString();
                } else {
                    int i52 = a;
                    int i53 = ((i52 & 51) - (~(i52 | 51))) - 1;
                    b = i53 % 128;
                    int i54 = i53 % 2;
                }
                Class<?> cls3 = Class.forName(strC);
                Class<?>[] clsArr = new Class[1];
                int i55 = b;
                int i56 = i55 & 69;
                int i57 = ((i55 | 69) & (~i56)) + (i56 << 1);
                a = i57 % 128;
                if (i57 % 2 != 0) {
                    clsArr[0] = cls;
                } else {
                    clsArr[0] = cls;
                }
                declaredConstructor = cls3.getDeclaredConstructor(clsArr);
                if (!declaredConstructor.isAccessible()) {
                    int i58 = a + 49;
                    b = i58 % 128;
                    if (i58 % 2 == 0) {
                        declaredConstructor.setAccessible(false);
                    } else {
                        declaredConstructor.setAccessible(true);
                    }
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (declaredConstructor == null) {
                b bVar = b.a;
                Boolean bool2 = bVar.c.get(cls);
                int i59 = a;
                int i60 = (i59 & (-36)) | ((~i59) & 35);
                int i61 = (i59 & 35) << 1;
                int i62 = (i60 & i61) + (i61 | i60);
                int i63 = i62 % 128;
                b = i63;
                if (i62 % 2 == 0) {
                    bool = bool2;
                    int i64 = 42 / 0;
                    if (bool != null) {
                        int i65 = i63 & 7;
                        int i66 = (i63 ^ 7) | i65;
                        i17 = ((i65 | i66) << 1) - (i65 ^ i66);
                        a = i17 % 128;
                        if (i17 % 2 == 0) {
                            bool.booleanValue();
                            obj.hashCode();
                            throw null;
                        }
                        if (bool.booleanValue()) {
                            int i67 = a;
                            int i68 = i67 + 27;
                            b = i68 % 128;
                            int i69 = i68 % 2;
                            int i70 = i67 & 99;
                            int i71 = (i67 ^ 99) | i70;
                            i3 = (i70 ^ i71) + ((i71 & i70) << 1);
                        } else {
                            superclass = cls.getSuperclass();
                            if (superclass != null) {
                                int i72 = b;
                                int i73 = i72 & 119;
                                i16 = (i73 - (~((i72 ^ 119) | i73))) - 1;
                                a = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i74 = 65 / 0;
                                    if (InterfaceC0105b.class.isAssignableFrom(superclass)) {
                                        int i75 = a;
                                        int i76 = i75 ^ 55;
                                        int i77 = ((i75 & 55) | i76) << 1;
                                        int i78 = -i76;
                                        int i79 = (i77 ^ i78) + ((i77 & i78) << 1);
                                        b = i79 % 128;
                                        int i80 = i79 % 2;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else if (InterfaceC0105b.class.isAssignableFrom(superclass)) {
                                    int i710 = a;
                                    int i711 = i710 ^ 55;
                                    int i712 = ((i710 & 55) | i711) << 1;
                                    int i713 = -i711;
                                    int i714 = (i712 ^ i713) + ((i712 & i713) << 1);
                                    b = i714 % 128;
                                    int i81 = i714 % 2;
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (z) {
                                int i82 = a;
                                int i83 = i82 & 15;
                                int i84 = (i82 ^ 15) | i83;
                                i13 = ((i83 | i84) << 1) - (i84 ^ i83);
                                b = i13 % 128;
                                if (i13 % 2 == 0 ? d(superclass) != 1 : d(superclass) != 1) {
                                    arrayList = new ArrayList((Collection) ((HashMap) d).get(superclass));
                                    i14 = a;
                                    int i85 = i14 & 29;
                                    int i86 = -(-((i14 ^ 29) | i85));
                                    i15 = (i85 ^ i86) + ((i85 & i86) << 1);
                                    b = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        throw null;
                                    }
                                    int i87 = ((((i14 ^ 27) | (i14 & 27)) << 1) - (~(-(((~i14) & 27) | (i14 & (-28)))))) - 1;
                                    b = i87 % 128;
                                    int i88 = i87 % 2;
                                } else {
                                    int i89 = a;
                                    int i90 = i89 & 97;
                                    int i91 = ((i89 ^ 97) | i90) << 1;
                                    int i92 = -((i89 | 97) & (~i90));
                                    i3 = ((i91 | i92) << 1) - (i92 ^ i91);
                                }
                            } else {
                                arrayList = null;
                            }
                            interfaces = cls.getInterfaces();
                            length2 = interfaces.length;
                            i4 = 0;
                            while (true) {
                                if (i4 < length2) {
                                    int i93 = a;
                                    int i94 = (((i93 | 103) << 1) - (~(-(((~i93) & 103) | (i93 & (-104)))))) - 1;
                                    i7 = i94 % 128;
                                    b = i7;
                                    int i95 = i94 % 2;
                                    cls2 = interfaces[i4];
                                    if (cls2 != null) {
                                        int i96 = ((i7 & 114) + (i7 | 114)) - 1;
                                        a = i96 % 128;
                                        int i97 = i96 % 2;
                                        if (InterfaceC0105b.class.isAssignableFrom(cls2)) {
                                            int i98 = a;
                                            int i99 = i98 & 5;
                                            i9 = i99 + ((i98 ^ 5) | i99);
                                            b = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                int i100 = a;
                                                i8 = ((i100 & 80) + (i100 | 80)) - 1;
                                                b = i8 % 128;
                                                if (i8 % 2 == 0) {
                                                    int i101 = 15 / 0;
                                                }
                                            } else if (d(cls2) == 1) {
                                                int i102 = b;
                                                int i103 = (((i102 ^ 63) | (i102 & 63)) << 1) - ((i102 & (-64)) | ((~i102) & 63));
                                                a = i103 % 128;
                                                int i104 = i103 % 2;
                                                int i105 = i102 & 81;
                                                i10 = (((i102 | 81) & (~i105)) - (~(-(-(i105 << 1))))) - 1;
                                                a = i10 % 128;
                                                if (i10 % 2 != 0) {
                                                    int i106 = 2 / 4;
                                                }
                                            } else {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                    int i107 = b;
                                                    i12 = ((i107 & 10) + (i107 | 10)) - 1;
                                                    a = i12 % 128;
                                                    if (i12 % 2 != 0) {
                                                        int i108 = 4 / 3;
                                                    }
                                                }
                                                collection = (Collection) ((HashMap) d).get(cls2);
                                                int i109 = a;
                                                int i110 = i109 & 73;
                                                int i111 = (i109 ^ 73) | i110;
                                                i11 = ((i110 | i111) << 1) - (i111 ^ i110);
                                                b = i11 % 128;
                                                if (i11 % 2 != 0) {
                                                    arrayList.addAll(collection);
                                                    throw null;
                                                }
                                                arrayList.addAll(collection);
                                            }
                                        } else {
                                            int i1010 = a;
                                            i8 = ((i1010 & 80) + (i1010 | 80)) - 1;
                                            b = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                int i1011 = 15 / 0;
                                            }
                                        }
                                    } else {
                                        int i1012 = a;
                                        i8 = ((i1012 & 80) + (i1012 | 80)) - 1;
                                        b = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            int i1013 = 15 / 0;
                                        }
                                    }
                                    int i112 = i4 | 1;
                                    i4 = ((i112 << 1) - (~(-((~(i4 & 1)) & i112)))) - 1;
                                } else if (arrayList != null) {
                                    int i113 = b;
                                    i5 = (-2) - (((i113 & 40) + (i113 | 40)) ^ (-1));
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        ((HashMap) d).put(cls, arrayList);
                                        int i114 = 98 / 0;
                                    } else {
                                        ((HashMap) d).put(cls, arrayList);
                                    }
                                    int i115 = b;
                                    i6 = (i115 & 21) + (i115 | 21);
                                    a = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        int i116 = 21 / 0;
                                    }
                                }
                            }
                        }
                        b = i3 % 128;
                        int i117 = i3 % 2;
                    } else {
                        try {
                            declaredMethods = cls.getDeclaredMethods();
                            length = declaredMethods.length;
                            int i118 = a + 103;
                            b = i118 % 128;
                            int i119 = i118 % 2;
                            i = 0;
                            while (true) {
                                if (i < length) {
                                    int i120 = b;
                                    int i121 = (i120 & (-8)) | ((~i120) & 7);
                                    int i122 = (i120 & 7) << 1;
                                    i2 = (i121 & i122) + (i122 | i121);
                                    a = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        throw null;
                                    }
                                    if (((f) declaredMethods[i].getAnnotation(f.class)) != null) {
                                        int i123 = a;
                                        int i124 = ((i123 & (-114)) | ((~i123) & 113)) + ((i123 & 113) << 1);
                                        b = i124 % 128;
                                        int i125 = i124 % 2;
                                        bVar.c(cls, declaredMethods);
                                        int i610 = a;
                                        int i611 = i610 + 27;
                                        b = i611 % 128;
                                        int i612 = i611 % 2;
                                        int i715 = i610 & 99;
                                        int i716 = (i610 ^ 99) | i715;
                                        i3 = (i715 ^ i716) + ((i716 & i715) << 1);
                                        b = i3 % 128;
                                        int i1110 = i3 % 2;
                                    } else {
                                        int i126 = i ^ 127;
                                        int i127 = -(-((i & 127) << 1));
                                        int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                                        int i129 = i128 & (-126);
                                        int i130 = ((i128 ^ (-126)) | i129) << 1;
                                        int i131 = -((~i129) & (i128 | (-126)));
                                        i = ((i130 & i131) << 1) + (i130 ^ i131);
                                        int i132 = a;
                                        int i133 = (((i132 | 124) << 1) - (i132 ^ 124)) - 1;
                                        b = i133 % 128;
                                        int i134 = i133 % 2;
                                    }
                                } else {
                                    bVar.c.put(cls, Boolean.FALSE);
                                    int i135 = a;
                                    int i136 = i135 & 23;
                                    int i137 = -(-((i135 ^ 23) | i136));
                                    int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                                    int i139 = i138 % 128;
                                    b = i139;
                                    int i140 = i138 % 2;
                                    int i141 = ((i139 ^ 67) | (i139 & 67)) << 1;
                                    int i142 = -(((~i139) & 67) | (i139 & (-68)));
                                    int i143 = (i141 & i142) + (i142 | i141);
                                    a = i143 % 128;
                                    int i144 = i143 % 2;
                                    superclass = cls.getSuperclass();
                                    if (superclass != null) {
                                        int i717 = b;
                                        int i718 = i717 & 119;
                                        i16 = (i718 - (~((i717 ^ 119) | i718))) - 1;
                                        a = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            int i719 = 65 / 0;
                                            if (InterfaceC0105b.class.isAssignableFrom(superclass)) {
                                                int i7110 = a;
                                                int i7111 = i7110 ^ 55;
                                                int i7112 = ((i7110 & 55) | i7111) << 1;
                                                int i7113 = -i7111;
                                                int i7114 = (i7112 ^ i7113) + ((i7112 & i7113) << 1);
                                                b = i7114 % 128;
                                                int i810 = i7114 % 2;
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else if (InterfaceC0105b.class.isAssignableFrom(superclass)) {
                                            int i7115 = a;
                                            int i7116 = i7115 ^ 55;
                                            int i7117 = ((i7115 & 55) | i7116) << 1;
                                            int i7118 = -i7116;
                                            int i7119 = (i7117 ^ i7118) + ((i7117 & i7118) << 1);
                                            b = i7119 % 128;
                                            int i811 = i7119 % 2;
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        int i812 = a;
                                        int i813 = i812 & 15;
                                        int i814 = (i812 ^ 15) | i813;
                                        i13 = ((i813 | i814) << 1) - (i814 ^ i813);
                                        b = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            arrayList = new ArrayList((Collection) ((HashMap) d).get(superclass));
                                            i14 = a;
                                            int i815 = i14 & 29;
                                            int i816 = -(-((i14 ^ 29) | i815));
                                            i15 = (i815 ^ i816) + ((i815 & i816) << 1);
                                            b = i15 % 128;
                                            if (i15 % 2 == 0) {
                                                throw null;
                                            }
                                            int i817 = ((((i14 ^ 27) | (i14 & 27)) << 1) - (~(-(((~i14) & 27) | (i14 & (-28)))))) - 1;
                                            b = i817 % 128;
                                            int i818 = i817 % 2;
                                        } else {
                                            arrayList = new ArrayList((Collection) ((HashMap) d).get(superclass));
                                            i14 = a;
                                            int i819 = i14 & 29;
                                            int i8110 = -(-((i14 ^ 29) | i819));
                                            i15 = (i819 ^ i8110) + ((i819 & i8110) << 1);
                                            b = i15 % 128;
                                            if (i15 % 2 == 0) {
                                                throw null;
                                            }
                                            int i8111 = ((((i14 ^ 27) | (i14 & 27)) << 1) - (~(-(((~i14) & 27) | (i14 & (-28)))))) - 1;
                                            b = i8111 % 128;
                                            int i8112 = i8111 % 2;
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    interfaces = cls.getInterfaces();
                                    length2 = interfaces.length;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < length2) {
                                            int i910 = a;
                                            int i911 = (((i910 | 103) << 1) - (~(-(((~i910) & 103) | (i910 & (-104)))))) - 1;
                                            i7 = i911 % 128;
                                            b = i7;
                                            int i912 = i911 % 2;
                                            cls2 = interfaces[i4];
                                            if (cls2 != null) {
                                                int i913 = ((i7 & 114) + (i7 | 114)) - 1;
                                                a = i913 % 128;
                                                int i914 = i913 % 2;
                                                if (InterfaceC0105b.class.isAssignableFrom(cls2)) {
                                                    int i915 = a;
                                                    int i916 = i915 & 5;
                                                    i9 = i916 + ((i915 ^ 5) | i916);
                                                    b = i9 % 128;
                                                    if (i9 % 2 == 0) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (!z2) {
                                                        int i1014 = a;
                                                        i8 = ((i1014 & 80) + (i1014 | 80)) - 1;
                                                        b = i8 % 128;
                                                        if (i8 % 2 == 0) {
                                                            int i1015 = 15 / 0;
                                                        }
                                                    } else if (d(cls2) == 1) {
                                                        int i1016 = b;
                                                        int i1017 = (((i1016 ^ 63) | (i1016 & 63)) << 1) - ((i1016 & (-64)) | ((~i1016) & 63));
                                                        a = i1017 % 128;
                                                        int i1018 = i1017 % 2;
                                                        int i1019 = i1016 & 81;
                                                        i10 = (((i1016 | 81) & (~i1019)) - (~(-(-(i1019 << 1))))) - 1;
                                                        a = i10 % 128;
                                                        if (i10 % 2 != 0) {
                                                            int i1020 = 2 / 4;
                                                        }
                                                    } else {
                                                        if (arrayList == null) {
                                                            arrayList = new ArrayList();
                                                            int i1021 = b;
                                                            i12 = ((i1021 & 10) + (i1021 | 10)) - 1;
                                                            a = i12 % 128;
                                                            if (i12 % 2 != 0) {
                                                                int i1022 = 4 / 3;
                                                            }
                                                        }
                                                        collection = (Collection) ((HashMap) d).get(cls2);
                                                        int i1023 = a;
                                                        int i1111 = i1023 & 73;
                                                        int i1112 = (i1023 ^ 73) | i1111;
                                                        i11 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                                                        b = i11 % 128;
                                                        if (i11 % 2 != 0) {
                                                            arrayList.addAll(collection);
                                                            throw null;
                                                        }
                                                        arrayList.addAll(collection);
                                                    }
                                                } else {
                                                    int i10110 = a;
                                                    i8 = ((i10110 & 80) + (i10110 | 80)) - 1;
                                                    b = i8 % 128;
                                                    if (i8 % 2 == 0) {
                                                        int i10111 = 15 / 0;
                                                    }
                                                }
                                            } else {
                                                int i10112 = a;
                                                i8 = ((i10112 & 80) + (i10112 | 80)) - 1;
                                                b = i8 % 128;
                                                if (i8 % 2 == 0) {
                                                    int i10113 = 15 / 0;
                                                }
                                            }
                                            int i1113 = i4 | 1;
                                            i4 = ((i1113 << 1) - (~(-((~(i4 & 1)) & i1113)))) - 1;
                                        } else if (arrayList != null) {
                                            int i1114 = b;
                                            i5 = (-2) - (((i1114 & 40) + (i1114 | 40)) ^ (-1));
                                            a = i5 % 128;
                                            if (i5 % 2 != 0) {
                                                ((HashMap) d).put(cls, arrayList);
                                                int i1115 = 98 / 0;
                                            } else {
                                                ((HashMap) d).put(cls, arrayList);
                                            }
                                            int i1116 = b;
                                            i6 = (i1116 & 21) + (i1116 | 21);
                                            a = i6 % 128;
                                            if (i6 % 2 != 0) {
                                                int i1117 = 21 / 0;
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (NoClassDefFoundError e2) {
                            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                        }
                    }
                } else {
                    bool = bool2;
                    if (bool != null) {
                        int i613 = i63 & 7;
                        int i614 = (i63 ^ 7) | i613;
                        i17 = ((i613 | i614) << 1) - (i613 ^ i614);
                        a = i17 % 128;
                        if (i17 % 2 == 0) {
                            bool.booleanValue();
                            obj.hashCode();
                            throw null;
                        }
                        if (bool.booleanValue()) {
                            int i615 = a;
                            int i616 = i615 + 27;
                            b = i616 % 128;
                            int i617 = i616 % 2;
                            int i7120 = i615 & 99;
                            int i7121 = (i615 ^ 99) | i7120;
                            i3 = (i7120 ^ i7121) + ((i7121 & i7120) << 1);
                        } else {
                            superclass = cls.getSuperclass();
                            if (superclass != null) {
                                int i7122 = b;
                                int i7123 = i7122 & 119;
                                i16 = (i7123 - (~((i7122 ^ 119) | i7123))) - 1;
                                a = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i7124 = 65 / 0;
                                    if (InterfaceC0105b.class.isAssignableFrom(superclass)) {
                                        int i71110 = a;
                                        int i71111 = i71110 ^ 55;
                                        int i71112 = ((i71110 & 55) | i71111) << 1;
                                        int i71113 = -i71111;
                                        int i71114 = (i71112 ^ i71113) + ((i71112 & i71113) << 1);
                                        b = i71114 % 128;
                                        int i8113 = i71114 % 2;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else if (InterfaceC0105b.class.isAssignableFrom(superclass)) {
                                    int i71115 = a;
                                    int i71116 = i71115 ^ 55;
                                    int i71117 = ((i71115 & 55) | i71116) << 1;
                                    int i71118 = -i71116;
                                    int i71119 = (i71117 ^ i71118) + ((i71117 & i71118) << 1);
                                    b = i71119 % 128;
                                    int i8114 = i71119 % 2;
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (z) {
                                int i8115 = a;
                                int i8116 = i8115 & 15;
                                int i8117 = (i8115 ^ 15) | i8116;
                                i13 = ((i8116 | i8117) << 1) - (i8117 ^ i8116);
                                b = i13 % 128;
                                if (i13 % 2 == 0) {
                                    arrayList = new ArrayList((Collection) ((HashMap) d).get(superclass));
                                    i14 = a;
                                    int i8118 = i14 & 29;
                                    int i8119 = -(-((i14 ^ 29) | i8118));
                                    i15 = (i8118 ^ i8119) + ((i8118 & i8119) << 1);
                                    b = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        throw null;
                                    }
                                    int i81110 = ((((i14 ^ 27) | (i14 & 27)) << 1) - (~(-(((~i14) & 27) | (i14 & (-28)))))) - 1;
                                    b = i81110 % 128;
                                    int i81111 = i81110 % 2;
                                } else {
                                    arrayList = new ArrayList((Collection) ((HashMap) d).get(superclass));
                                    i14 = a;
                                    int i81112 = i14 & 29;
                                    int i81113 = -(-((i14 ^ 29) | i81112));
                                    i15 = (i81112 ^ i81113) + ((i81112 & i81113) << 1);
                                    b = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        throw null;
                                    }
                                    int i81114 = ((((i14 ^ 27) | (i14 & 27)) << 1) - (~(-(((~i14) & 27) | (i14 & (-28)))))) - 1;
                                    b = i81114 % 128;
                                    int i81115 = i81114 % 2;
                                }
                            } else {
                                arrayList = null;
                            }
                            interfaces = cls.getInterfaces();
                            length2 = interfaces.length;
                            i4 = 0;
                            while (true) {
                                if (i4 < length2) {
                                    int i917 = a;
                                    int i918 = (((i917 | 103) << 1) - (~(-(((~i917) & 103) | (i917 & (-104)))))) - 1;
                                    i7 = i918 % 128;
                                    b = i7;
                                    int i919 = i918 % 2;
                                    cls2 = interfaces[i4];
                                    if (cls2 != null) {
                                        int i9110 = ((i7 & 114) + (i7 | 114)) - 1;
                                        a = i9110 % 128;
                                        int i9111 = i9110 % 2;
                                        if (InterfaceC0105b.class.isAssignableFrom(cls2)) {
                                            int i9112 = a;
                                            int i9113 = i9112 & 5;
                                            i9 = i9113 + ((i9112 ^ 5) | i9113);
                                            b = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                int i10114 = a;
                                                i8 = ((i10114 & 80) + (i10114 | 80)) - 1;
                                                b = i8 % 128;
                                                if (i8 % 2 == 0) {
                                                    int i10115 = 15 / 0;
                                                }
                                            } else if (d(cls2) == 1) {
                                                int i10116 = b;
                                                int i10117 = (((i10116 ^ 63) | (i10116 & 63)) << 1) - ((i10116 & (-64)) | ((~i10116) & 63));
                                                a = i10117 % 128;
                                                int i10118 = i10117 % 2;
                                                int i10119 = i10116 & 81;
                                                i10 = (((i10116 | 81) & (~i10119)) - (~(-(-(i10119 << 1))))) - 1;
                                                a = i10 % 128;
                                                if (i10 % 2 != 0) {
                                                    int i1024 = 2 / 4;
                                                }
                                            } else {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                    int i1025 = b;
                                                    i12 = ((i1025 & 10) + (i1025 | 10)) - 1;
                                                    a = i12 % 128;
                                                    if (i12 % 2 != 0) {
                                                        int i1026 = 4 / 3;
                                                    }
                                                }
                                                collection = (Collection) ((HashMap) d).get(cls2);
                                                int i1027 = a;
                                                int i1118 = i1027 & 73;
                                                int i1119 = (i1027 ^ 73) | i1118;
                                                i11 = ((i1118 | i1119) << 1) - (i1119 ^ i1118);
                                                b = i11 % 128;
                                                if (i11 % 2 != 0) {
                                                    arrayList.addAll(collection);
                                                    throw null;
                                                }
                                                arrayList.addAll(collection);
                                            }
                                        } else {
                                            int i101110 = a;
                                            i8 = ((i101110 & 80) + (i101110 | 80)) - 1;
                                            b = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                int i101111 = 15 / 0;
                                            }
                                        }
                                    } else {
                                        int i101112 = a;
                                        i8 = ((i101112 & 80) + (i101112 | 80)) - 1;
                                        b = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            int i101113 = 15 / 0;
                                        }
                                    }
                                    int i11110 = i4 | 1;
                                    i4 = ((i11110 << 1) - (~(-((~(i4 & 1)) & i11110)))) - 1;
                                } else if (arrayList != null) {
                                    int i11111 = b;
                                    i5 = (-2) - (((i11111 & 40) + (i11111 | 40)) ^ (-1));
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        ((HashMap) d).put(cls, arrayList);
                                        int i11112 = 98 / 0;
                                    } else {
                                        ((HashMap) d).put(cls, arrayList);
                                    }
                                    int i11113 = b;
                                    i6 = (i11113 & 21) + (i11113 | 21);
                                    a = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        int i11114 = 21 / 0;
                                    }
                                }
                            }
                        }
                        b = i3 % 128;
                        int i11115 = i3 % 2;
                    } else {
                        declaredMethods = cls.getDeclaredMethods();
                        length = declaredMethods.length;
                        int i1120 = a + 103;
                        b = i1120 % 128;
                        int i1121 = i1120 % 2;
                        i = 0;
                        while (true) {
                            if (i < length) {
                                int i1210 = b;
                                int i1211 = (i1210 & (-8)) | ((~i1210) & 7);
                                int i1212 = (i1210 & 7) << 1;
                                i2 = (i1211 & i1212) + (i1212 | i1211);
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    throw null;
                                }
                                if (((f) declaredMethods[i].getAnnotation(f.class)) != null) {
                                    int i1213 = a;
                                    int i1214 = ((i1213 & (-114)) | ((~i1213) & 113)) + ((i1213 & 113) << 1);
                                    b = i1214 % 128;
                                    int i1215 = i1214 % 2;
                                    bVar.c(cls, declaredMethods);
                                    int i618 = a;
                                    int i619 = i618 + 27;
                                    b = i619 % 128;
                                    int i6110 = i619 % 2;
                                    int i7125 = i618 & 99;
                                    int i7126 = (i618 ^ 99) | i7125;
                                    i3 = (i7125 ^ i7126) + ((i7126 & i7125) << 1);
                                    b = i3 % 128;
                                    int i11116 = i3 % 2;
                                } else {
                                    int i1216 = i ^ 127;
                                    int i1217 = -(-((i & 127) << 1));
                                    int i1218 = (i1216 ^ i1217) + ((i1217 & i1216) << 1);
                                    int i1219 = i1218 & (-126);
                                    int i1310 = ((i1218 ^ (-126)) | i1219) << 1;
                                    int i1311 = -((~i1219) & (i1218 | (-126)));
                                    i = ((i1310 & i1311) << 1) + (i1310 ^ i1311);
                                    int i1312 = a;
                                    int i1313 = (((i1312 | 124) << 1) - (i1312 ^ 124)) - 1;
                                    b = i1313 % 128;
                                    int i1314 = i1313 % 2;
                                }
                            } else {
                                bVar.c.put(cls, Boolean.FALSE);
                                int i1315 = a;
                                int i1316 = i1315 & 23;
                                int i1317 = -(-((i1315 ^ 23) | i1316));
                                int i1318 = ((i1316 | i1317) << 1) - (i1317 ^ i1316);
                                int i1319 = i1318 % 128;
                                b = i1319;
                                int i145 = i1318 % 2;
                                int i146 = ((i1319 ^ 67) | (i1319 & 67)) << 1;
                                int i147 = -(((~i1319) & 67) | (i1319 & (-68)));
                                int i148 = (i146 & i147) + (i147 | i146);
                                a = i148 % 128;
                                int i149 = i148 % 2;
                                superclass = cls.getSuperclass();
                                if (superclass != null) {
                                    int i7127 = b;
                                    int i7128 = i7127 & 119;
                                    i16 = (i7128 - (~((i7127 ^ 119) | i7128))) - 1;
                                    a = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        int i7129 = 65 / 0;
                                        if (InterfaceC0105b.class.isAssignableFrom(superclass)) {
                                            int i711110 = a;
                                            int i711111 = i711110 ^ 55;
                                            int i711112 = ((i711110 & 55) | i711111) << 1;
                                            int i711113 = -i711111;
                                            int i711114 = (i711112 ^ i711113) + ((i711112 & i711113) << 1);
                                            b = i711114 % 128;
                                            int i81116 = i711114 % 2;
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else if (InterfaceC0105b.class.isAssignableFrom(superclass)) {
                                        int i711115 = a;
                                        int i711116 = i711115 ^ 55;
                                        int i711117 = ((i711115 & 55) | i711116) << 1;
                                        int i711118 = -i711116;
                                        int i711119 = (i711117 ^ i711118) + ((i711117 & i711118) << 1);
                                        b = i711119 % 128;
                                        int i81117 = i711119 % 2;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    int i81118 = a;
                                    int i81119 = i81118 & 15;
                                    int i81120 = (i81118 ^ 15) | i81119;
                                    i13 = ((i81119 | i81120) << 1) - (i81120 ^ i81119);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        arrayList = new ArrayList((Collection) ((HashMap) d).get(superclass));
                                        i14 = a;
                                        int i811110 = i14 & 29;
                                        int i811111 = -(-((i14 ^ 29) | i811110));
                                        i15 = (i811110 ^ i811111) + ((i811110 & i811111) << 1);
                                        b = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            throw null;
                                        }
                                        int i811112 = ((((i14 ^ 27) | (i14 & 27)) << 1) - (~(-(((~i14) & 27) | (i14 & (-28)))))) - 1;
                                        b = i811112 % 128;
                                        int i811113 = i811112 % 2;
                                    } else {
                                        arrayList = new ArrayList((Collection) ((HashMap) d).get(superclass));
                                        i14 = a;
                                        int i811114 = i14 & 29;
                                        int i811115 = -(-((i14 ^ 29) | i811114));
                                        i15 = (i811114 ^ i811115) + ((i811114 & i811115) << 1);
                                        b = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            throw null;
                                        }
                                        int i811116 = ((((i14 ^ 27) | (i14 & 27)) << 1) - (~(-(((~i14) & 27) | (i14 & (-28)))))) - 1;
                                        b = i811116 % 128;
                                        int i811117 = i811116 % 2;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                interfaces = cls.getInterfaces();
                                length2 = interfaces.length;
                                i4 = 0;
                                while (true) {
                                    if (i4 < length2) {
                                        int i9114 = a;
                                        int i9115 = (((i9114 | 103) << 1) - (~(-(((~i9114) & 103) | (i9114 & (-104)))))) - 1;
                                        i7 = i9115 % 128;
                                        b = i7;
                                        int i9116 = i9115 % 2;
                                        cls2 = interfaces[i4];
                                        if (cls2 != null) {
                                            int i9117 = ((i7 & 114) + (i7 | 114)) - 1;
                                            a = i9117 % 128;
                                            int i9118 = i9117 % 2;
                                            if (InterfaceC0105b.class.isAssignableFrom(cls2)) {
                                                int i9119 = a;
                                                int i91110 = i9119 & 5;
                                                i9 = i91110 + ((i9119 ^ 5) | i91110);
                                                b = i9 % 128;
                                                if (i9 % 2 == 0) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (!z2) {
                                                    int i101114 = a;
                                                    i8 = ((i101114 & 80) + (i101114 | 80)) - 1;
                                                    b = i8 % 128;
                                                    if (i8 % 2 == 0) {
                                                        int i101115 = 15 / 0;
                                                    }
                                                } else if (d(cls2) == 1) {
                                                    int i101116 = b;
                                                    int i101117 = (((i101116 ^ 63) | (i101116 & 63)) << 1) - ((i101116 & (-64)) | ((~i101116) & 63));
                                                    a = i101117 % 128;
                                                    int i101118 = i101117 % 2;
                                                    int i101119 = i101116 & 81;
                                                    i10 = (((i101116 | 81) & (~i101119)) - (~(-(-(i101119 << 1))))) - 1;
                                                    a = i10 % 128;
                                                    if (i10 % 2 != 0) {
                                                        int i1028 = 2 / 4;
                                                    }
                                                } else {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                        int i1029 = b;
                                                        i12 = ((i1029 & 10) + (i1029 | 10)) - 1;
                                                        a = i12 % 128;
                                                        if (i12 % 2 != 0) {
                                                            int i10210 = 4 / 3;
                                                        }
                                                    }
                                                    collection = (Collection) ((HashMap) d).get(cls2);
                                                    int i10211 = a;
                                                    int i11117 = i10211 & 73;
                                                    int i11118 = (i10211 ^ 73) | i11117;
                                                    i11 = ((i11117 | i11118) << 1) - (i11118 ^ i11117);
                                                    b = i11 % 128;
                                                    if (i11 % 2 != 0) {
                                                        arrayList.addAll(collection);
                                                        throw null;
                                                    }
                                                    arrayList.addAll(collection);
                                                }
                                            } else {
                                                int i1011110 = a;
                                                i8 = ((i1011110 & 80) + (i1011110 | 80)) - 1;
                                                b = i8 % 128;
                                                if (i8 % 2 == 0) {
                                                    int i1011111 = 15 / 0;
                                                }
                                            }
                                        } else {
                                            int i1011112 = a;
                                            i8 = ((i1011112 & 80) + (i1011112 | 80)) - 1;
                                            b = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                int i1011113 = 15 / 0;
                                            }
                                        }
                                        int i11119 = i4 | 1;
                                        i4 = ((i11119 << 1) - (~(-((~(i4 & 1)) & i11119)))) - 1;
                                    } else if (arrayList != null) {
                                        int i111110 = b;
                                        i5 = (-2) - (((i111110 & 40) + (i111110 | 40)) ^ (-1));
                                        a = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            ((HashMap) d).put(cls, arrayList);
                                            int i111111 = 98 / 0;
                                        } else {
                                            ((HashMap) d).put(cls, arrayList);
                                        }
                                        int i111112 = b;
                                        i6 = (i111112 & 21) + (i111112 | 21);
                                        a = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            int i111113 = 21 / 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ((HashMap) c).put(cls, Integer.valueOf(i18));
                int i150 = a;
                i19 = ((i150 | 67) << 1) - (i150 ^ 67);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    int i151 = 81 / 0;
                }
                return i18;
            }
            int i152 = b;
            int i153 = (((i152 & (-18)) | ((~i152) & 17)) - (~(-(-((i152 & 17) << 1))))) - 1;
            a = i153 % 128;
            if (i153 % 2 != 0) {
                Map<Class<?>, List<Constructor<? extends e>>> map2 = d;
                listSingletonList = Collections.singletonList(declaredConstructor);
                map = (HashMap) map2;
                int i154 = 17 / 0;
            } else {
                Map<Class<?>, List<Constructor<? extends e>>> map3 = d;
                listSingletonList = Collections.singletonList(declaredConstructor);
                map = (HashMap) map3;
            }
            int i155 = a;
            int i156 = (i155 & (-14)) | ((~i155) & 13);
            int i157 = -(-((i155 & 13) << 1));
            int i158 = ((i156 | i157) << 1) - (i157 ^ i156);
            b = i158 % 128;
            int i159 = i158 % 2;
            map.put(cls, listSingletonList);
            int i160 = a;
            int i161 = i160 & 109;
            int i162 = (((i160 ^ 109) | i161) << 1) - ((i160 | 109) & (~i161));
            b = i162 % 128;
            int i163 = i162 % 2;
            int i164 = b;
            int i165 = (i164 ^ 90) + ((i164 & 90) << 1);
            int i166 = (i165 ^ (-1)) + (i165 << 1);
            a = i166 % 128;
            int i167 = i166 % 2;
            i18 = 2;
            ((HashMap) c).put(cls, Integer.valueOf(i18));
            int i1510 = a;
            i19 = ((i1510 | 67) << 1) - (i1510 ^ 67);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                int i1511 = 81 / 0;
            }
            return i18;
        }
        int i168 = a;
        int i169 = i168 & 49;
        int i170 = i168 | 49;
        int i171 = (i169 ^ i170) + ((i170 & i169) << 1);
        b = i171 % 128;
        int i172 = i171 % 2;
        i18 = 1;
        ((HashMap) c).put(cls, Integer.valueOf(i18));
        int i1512 = a;
        i19 = ((i1512 | 67) << 1) - (i1512 ^ 67);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i1513 = 81 / 0;
        }
        return i18;
    }
}
