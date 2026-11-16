package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.y.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0328j {
    private static int a = 0;
    private static int b = 1;
    public static final Type[] c = new Type[0];

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.y.j$bld */
    public static final class bld implements GenericArrayType, Serializable {
        private static int a = 0;
        private static int b = 1;
        public final Type c;

        public bld(Type type) {
            this.c = C0328j.c(type);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0056  */
        /* JADX WARN: Code duplicated, block: B:9:0x0041  */
        public final boolean equals(Object obj) {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 65;
            int i5 = -(-(i3 | 65));
            int i6 = (i4 & i5) + (i5 | i4);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            boolean z = true;
            if (obj instanceof GenericArrayType) {
                int i9 = (-2) - ((i7 + 86) ^ (-1));
                a = i9 % 128;
                int i10 = i9 % 2;
                if (C0328j.e(this, (GenericArrayType) obj)) {
                    int i11 = b;
                    int i12 = i11 + 123;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = i11 + 43;
                    a = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 5 / 5;
                    }
                } else {
                    int i16 = a;
                    int i17 = i16 & 49;
                    int i18 = -(-((i16 ^ 49) | i17));
                    i = ((i17 | i18) << 1) - (i18 ^ i17);
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i19 = 2 % 3;
                    }
                    z = false;
                }
            } else {
                int i110 = a;
                int i111 = i110 & 49;
                int i112 = -(-((i110 ^ 49) | i111));
                i = ((i111 | i112) << 1) - (i112 ^ i111);
                b = i % 128;
                if (i % 2 == 0) {
                    int i113 = 2 % 3;
                }
                z = false;
            }
            int i20 = b;
            int i21 = i20 & 17;
            int i22 = (i20 ^ 17) | i21;
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            int i24 = i23 % 2;
            return z;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 81;
            int i4 = -(-((i2 ^ 81) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            b = i6;
            if (i5 % 2 == 0) {
                throw null;
            }
            Type type = this.c;
            int i7 = ((i6 ^ 25) - (~((i6 & 25) << 1))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return type;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 9;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 9)) & i3);
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            int iHashCode = this.c.hashCode();
            if (i7 == 0) {
                int i8 = 63 / 0;
            }
            int i9 = b;
            int i10 = i9 & 5;
            int i11 = (i9 ^ 5) | i10;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            String strB = C0328j.b(this.c);
            int i2 = a;
            int i3 = (-2) - ((((i2 | 48) << 1) - (i2 ^ 48)) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 != 0) {
                sb.append(strB);
                sb.append("[]");
                return sb.toString();
            }
            sb.append(strB);
            sb.append("[]");
            sb.toString();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.y.j$blf */
    public static final class blf implements WildcardType, Serializable {
        private static int a = 1;
        private static int b;
        public final Type c;
        public final Type d;

        public blf(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3;
            if (typeArr2.length <= 1) {
                int i = b;
                int i2 = i & 113;
                int i3 = (i | 113) & (~i2);
                int i4 = i2 << 1;
                int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
                a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                z = true;
            } else {
                int i8 = b;
                int i9 = ((i8 | 11) << 1) - (i8 ^ 11);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 % 2;
                }
                z = false;
            }
            i.i(z);
            if (typeArr.length == 1) {
                int i11 = a;
                int i12 = i11 & 1;
                int i13 = (i11 | 1) & (~i12);
                int i14 = i12 << 1;
                int i15 = (i13 & i14) + (i13 | i14);
                int i16 = i15 % 128;
                b = i16;
                int i17 = i15 % 2;
                int i18 = ((i16 & (-90)) | ((~i16) & 89)) + ((i16 & 89) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                int i20 = 2 % 2;
                z2 = true;
            } else {
                int i21 = a;
                int i22 = i21 & 21;
                int i23 = i21 | 21;
                int i24 = (i22 & i23) + (i23 | i22);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 2 % 2;
                }
                z2 = false;
            }
            i.i(z2);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                C0328j.d(typeArr[0]);
                int i26 = a;
                int i27 = (i26 ^ 35) + ((i26 & 35) << 1);
                b = i27 % 128;
                int i28 = i27 % 2;
                Object obj = null;
                this.d = null;
                this.c = C0328j.c(typeArr[0]);
                int i29 = a + 29;
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i30 = b;
            int i31 = i30 & 5;
            int i32 = ((i30 | 5) & (~i31)) + (i31 << 1);
            a = i32 % 128;
            int i33 = i32 % 2;
            Objects.requireNonNull(typeArr2[0]);
            C0328j.d(typeArr2[0]);
            int i34 = a;
            int i35 = i34 + 5;
            b = i35 % 128;
            if (i35 % 2 == 0 ? typeArr[0] != Object.class : typeArr[1] != Object.class) {
                int i36 = ((i34 ^ 78) + ((i34 & 78) << 1)) - 1;
                b = i36 % 128;
                if (i36 % 2 == 0) {
                    int i37 = 2 % 2;
                }
                z3 = false;
            } else {
                int i38 = (i34 & 103) + (i34 | 103);
                int i39 = i38 % 128;
                b = i39;
                z3 = i38 % 2 == 0;
                int i40 = i39 & 57;
                int i41 = -(-((i39 ^ 57) | i40));
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                a = i42 % 128;
                if (i42 % 2 != 0) {
                    int i43 = 2 % 2;
                }
            }
            i.i(z3);
            this.d = C0328j.c(typeArr2[0]);
            int i44 = b;
            int i45 = i44 & 35;
            int i46 = (i44 ^ 35) | i45;
            int i47 = (i45 & i46) + (i46 | i45);
            a = i47 % 128;
            if (i47 % 2 != 0) {
                this.c = Object.class;
            } else {
                this.c = Object.class;
                int i48 = 28 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0043  */
        /* JADX WARN: Code duplicated, block: B:16:0x0052  */
        /* JADX WARN: Code duplicated, block: B:18:0x0056  */
        public final boolean equals(Object obj) {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & (-14)) | ((~i3) & 13);
            int i5 = (i3 & 13) << 1;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 != 0) {
                boolean z = obj instanceof WildcardType;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            boolean z2 = false;
            if (obj instanceof WildcardType) {
                int i8 = i7 & 115;
                int i9 = i8 + ((i7 ^ 115) | i8);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 38 / 0;
                    if (!C0328j.e(this, (WildcardType) obj)) {
                        int i11 = a;
                        int i12 = i11 ^ 93;
                        int i13 = -(-((i11 & 93) << 1));
                        int i14 = (i12 & i13) + (i13 | i12);
                        b = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        int i16 = a;
                        i = ((i16 & 112) + (i16 | 112)) - 1;
                        b = i % 128;
                        if (i % 2 != 0) {
                            int i17 = 2 % 5;
                        }
                        z2 = true;
                    }
                } else if (!C0328j.e(this, (WildcardType) obj)) {
                    int i18 = a;
                    int i19 = i18 ^ 93;
                    int i110 = -(-((i18 & 93) << 1));
                    int i111 = (i19 & i110) + (i110 | i19);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                } else {
                    int i113 = a;
                    i = ((i113 & 112) + (i113 | 112)) - 1;
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i114 = 2 % 5;
                    }
                    z2 = true;
                }
            } else {
                int i115 = a;
                int i116 = i115 ^ 93;
                int i117 = -(-((i115 & 93) << 1));
                int i118 = (i116 & i117) + (i117 | i116);
                b = i118 % 128;
                int i119 = i118 % 2;
            }
            int i20 = a;
            int i21 = (((i20 ^ 97) | (i20 & 97)) << 1) - (((~i20) & 97) | (i20 & (-98)));
            b = i21 % 128;
            int i22 = i21 % 2;
            return z2;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type[] typeArr;
            int i = 2 % 2;
            int i2 = a + 103;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            Type type = this.d;
            if (type != null) {
                int i5 = i3 & 13;
                int i6 = -(-(i3 | 13));
                int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                a = i7 % 128;
                typeArr = i7 % 2 == 0 ? new Type[]{type} : new Type[]{type};
                int i8 = (i3 ^ 112) + ((i3 & 112) << 1);
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
            } else {
                typeArr = C0328j.c;
                int i11 = a;
                int i12 = i11 & 49;
                int i13 = (i11 ^ 49) | i12;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = a;
            int i17 = (((i16 ^ 41) | (i16 & 41)) << 1) - (((~i16) & 41) | (i16 & (-42)));
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 75 / 0;
            }
            return typeArr;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            Type[] typeArr;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 49) - (~(-(-((i2 & 49) << 1))))) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                typeArr = new Type[1];
                typeArr[1] = this.c;
            } else {
                typeArr = new Type[]{this.c};
            }
            int i4 = ((i2 | 115) << 1) - (i2 ^ 115);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 72 / 0;
            }
            return typeArr;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = b + 53;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            Object obj = null;
            if (this.d != null) {
                int i5 = ((i3 & 6) + (i3 | 6)) - 1;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    j.w("? super ").append(C0328j.b(this.d));
                    obj.hashCode();
                    throw null;
                }
                StringBuilder sbW = j.w("? super ");
                sbW.append(C0328j.b(this.d));
                String string = sbW.toString();
                int i6 = a;
                int i7 = i6 & 37;
                int i8 = -(-(i6 | 37));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 58 / 0;
                }
                return string;
            }
            if (this.c == Object.class) {
                int i11 = (i3 ^ 51) + ((i3 & 51) << 1);
                int i12 = i11 % 128;
                b = i12;
                if (i11 % 2 != 0) {
                    throw null;
                }
                int i13 = i12 & 47;
                int i14 = ((i12 ^ 47) | i13) << 1;
                int i15 = -((i12 | 47) & (~i13));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 10 / 0;
                }
                return "?";
            }
            StringBuilder sbW2 = j.w("? extends ");
            Type type = this.c;
            int i18 = a;
            int i19 = (((i18 & (-4)) | ((~i18) & 3)) - (~(-(-((i18 & 3) << 1))))) - 1;
            b = i19 % 128;
            if (i19 % 2 != 0) {
                sbW2.append(C0328j.b(type));
                sbW2.toString();
                throw null;
            }
            sbW2.append(C0328j.b(type));
            String string2 = sbW2.toString();
            int i20 = b;
            int i21 = i20 & 39;
            int i22 = ((i20 | 39) & (~i21)) + (i21 << 1);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                return string2;
            }
            throw null;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 11;
            int i4 = ((i3 << 1) - (~(-((~(i2 & 11)) & i3)))) - 1;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            Type type = this.d;
            if (type != null) {
                int i7 = ((i5 ^ 12) + ((i5 & 12) << 1)) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                iHashCode = type.hashCode() + 31;
                int i9 = b;
                int i10 = i9 & 77;
                int i11 = ((i9 | 77) & (~i10)) + (i10 << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = ((i5 | 1) << 1) - (i5 ^ 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                iHashCode = 1;
            }
            int iHashCode2 = this.c.hashCode();
            int i15 = (iHashCode2 & (-32)) | ((~iHashCode2) & 31);
            int i16 = (iHashCode2 & 31) << 1;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            int i18 = (iHashCode | i17) & (~(iHashCode & i17));
            int i19 = b;
            int i20 = i19 & 67;
            int i21 = (i19 ^ 67) | i20;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                return i18;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 1 & 81;
        int i2 = (~i) & (1 | 81);
        int i3 = i << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    public static String b(Type type) {
        String string;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 89;
        int i4 = (i2 ^ 89) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (type instanceof Class) {
            int i7 = i2 + 11;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                string = ((Class) type).getName();
                int i8 = 41 / 0;
            } else {
                string = ((Class) type).getName();
            }
        } else {
            string = type.toString();
            int i9 = a;
            int i10 = i9 & 97;
            int i11 = i10 + ((i9 ^ 97) | i10);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 5 / 2;
            }
        }
        int i13 = b;
        int i14 = i13 | 107;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 107)) & i14);
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 47 / 0;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
    public static void d(Type type) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = ((i2 ^ 41) | i3) << 1;
        int i5 = -((~i3) & (i2 | 41));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (type instanceof Class) {
            int i8 = i2 ^ 9;
            int i9 = -(-((i2 & 9) << 1));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                ((Class) type).isPrimitive();
                throw null;
            }
            if (((Class) type).isPrimitive()) {
                int i11 = a;
                int i12 = (i11 & 115) + (i11 | 115);
                b = i12 % 128;
                int i13 = i12 % 2;
                z = false;
            } else {
                int i14 = a;
                int i15 = i14 & 99;
                int i16 = (((i14 | 99) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            }
        } else {
            int i18 = a;
            int i19 = i18 & 99;
            int i110 = (((i18 | 99) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
            b = i110 % 128;
            int i111 = i110 % 2;
            z = true;
        }
        i.i(z);
        int i20 = b;
        int i21 = (i20 ^ 25) + ((i20 & 25) << 1);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 42 / 0;
        }
    }

    public static Type i(Type type, Class<?> cls, Type type2) throws Throwable {
        int i = 2 % 2;
        Type typeJ = j(type, cls, type2, new HashSet());
        int i2 = b + 119;
        a = i2 % 128;
        int i3 = i2 % 2;
        return typeJ;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.y.j$ble */
    public static final class ble implements ParameterizedType, Serializable {
        private static int a = 0;
        private static int b = 1;
        public final Type c;
        public final Type d;
        public final Type[] e;

        /* JADX WARN: Code duplicated, block: B:17:0x0059  */
        /* JADX WARN: Code duplicated, block: B:20:0x006f  */
        public ble(Type type, Type type2, Type... typeArr) throws CloneNotSupportedException {
            Type typeC;
            int length;
            int i;
            boolean z;
            boolean z2;
            int i2 = 0;
            Object obj = null;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                if (!Modifier.isStatic(cls.getModifiers())) {
                    int i3 = b;
                    int i4 = (((i3 ^ 61) | (i3 & 61)) << 1) - (((~i3) & 61) | (i3 & (-62)));
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        cls.getEnclosingClass();
                        throw null;
                    }
                    if (cls.getEnclosingClass() != null) {
                        int i5 = a;
                        int i6 = i5 & 111;
                        int i7 = (i5 ^ 111) | i6;
                        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                        b = i8 % 128;
                        z = i8 % 2 == 0;
                        int i9 = i5 + 93;
                        b = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = 2 % 2;
                    } else {
                        int i12 = b;
                        int i13 = i12 ^ 97;
                        int i14 = -(-((i12 & 97) << 1));
                        i = ((i13 | i14) << 1) - (i14 ^ i13);
                        a = i % 128;
                        if (i % 2 == 0) {
                            int i15 = 2 % 2;
                        }
                        z = true;
                    }
                } else {
                    int i16 = b;
                    int i17 = i16 ^ 97;
                    int i18 = -(-((i16 & 97) << 1));
                    i = ((i17 | i18) << 1) - (i18 ^ i17);
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i19 = 2 % 2;
                    }
                    z = true;
                }
                if (type == null) {
                    int i20 = a;
                    int i21 = ((i20 ^ 39) | (i20 & 39)) << 1;
                    int i22 = -((i20 & (-40)) | ((~i20) & 39));
                    int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                    int i24 = i23 % 128;
                    b = i24;
                    int i25 = i23 % 2;
                    if (z) {
                        int i26 = i20 & 91;
                        int i27 = (i20 | 91) & (~i26);
                        int i28 = i26 << 1;
                        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                        int i30 = i29 % 128;
                        b = i30;
                        int i31 = i29 % 2;
                        int i32 = (((i30 | 118) << 1) - (i30 ^ 118)) - 1;
                        a = i32 % 128;
                        int i33 = i32 % 2;
                        int i34 = 2 % 2;
                        z2 = true;
                    } else {
                        int i35 = i24 & 47;
                        int i36 = (~i35) & (i24 | 47);
                        int i37 = i35 << 1;
                        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                        a = i38 % 128;
                        if (i38 % 2 == 0) {
                            int i39 = 2 % 2;
                        }
                        z2 = false;
                    }
                } else {
                    z2 = true;
                }
                i.i(z2);
                int i40 = b;
                int i41 = (i40 & (-108)) | ((~i40) & 107);
                int i42 = -(-((i40 & 107) << 1));
                int i43 = (i41 & i42) + (i42 | i41);
                a = i43 % 128;
                int i44 = i43 % 2;
                int i45 = 2 % 2;
            }
            if (type == null) {
                int i46 = a;
                int i47 = (i46 ^ 23) + ((i46 & 23) << 1);
                int i48 = i47 % 128;
                b = i48;
                int i49 = i47 % 2;
                int i50 = (((i48 | 113) << 1) - (~(-(i48 ^ 113)))) - 1;
                a = i50 % 128;
                if (i50 % 2 != 0) {
                    int i51 = 2 % 3;
                } else {
                    int i52 = 2 % 2;
                }
                typeC = null;
            } else {
                typeC = C0328j.c(type);
                int i53 = a + 33;
                b = i53 % 128;
                if (i53 % 2 != 0) {
                    int i54 = 2 % 2;
                }
            }
            this.c = typeC;
            this.d = C0328j.c(type2);
            Object objClone = typeArr.clone();
            int i55 = a;
            int i56 = ((i55 | 49) << 1) - (i55 ^ 49);
            b = i56 % 128;
            if (i56 % 2 == 0) {
                Type[] typeArr2 = (Type[]) objClone;
                this.e = typeArr2;
                length = typeArr2.length;
                i2 = 1;
            } else {
                Type[] typeArr3 = (Type[]) objClone;
                this.e = typeArr3;
                length = typeArr3.length;
            }
            int i57 = i55 & 21;
            int i58 = (((i55 ^ 21) | i57) << 1) - ((i55 | 21) & (~i57));
            b = i58 % 128;
            int i59 = i58 % 2;
            int i60 = 2 % 2;
            while (i2 < length) {
                int i61 = a;
                int i62 = (i61 ^ 117) + ((i61 & 117) << 1);
                b = i62 % 128;
                int i63 = i62 % 2;
                Objects.requireNonNull(this.e[i2]);
                int i64 = b;
                int i65 = i64 & 95;
                int i66 = (i64 | 95) & (~i65);
                int i67 = i65 << 1;
                int i68 = (i66 & i67) + (i66 | i67);
                a = i68 % 128;
                if (i68 % 2 != 0) {
                    C0328j.d(this.e[i2]);
                    obj.hashCode();
                    throw null;
                }
                C0328j.d(this.e[i2]);
                Type[] typeArr4 = this.e;
                int i69 = a + 123;
                b = i69 % 128;
                if (i69 % 2 == 0) {
                    typeArr4[i2] = C0328j.c(typeArr4[i2]);
                    obj.hashCode();
                    throw null;
                }
                typeArr4[i2] = C0328j.c(typeArr4[i2]);
                int i70 = i2 & (-74);
                int i71 = -(-((i2 ^ (-74)) | i70));
                i2 = (i70 & i71) + (i70 | i71) + 75;
                int i72 = a;
                int i73 = i72 & 87;
                int i74 = -(-((i72 ^ 87) | i73));
                int i75 = (i73 & i74) + (i74 | i73);
                b = i75 % 128;
                int i76 = i75 % 2;
            }
            int i77 = a;
            int i78 = (i77 & 3) + (i77 | 3);
            b = i78 % 128;
            if (i78 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 71;
            int i4 = -(-((i2 ^ 71) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            boolean z = false;
            if (i5 % 2 != 0) {
                if (obj instanceof ParameterizedType) {
                    if (!(!C0328j.e(this, (ParameterizedType) obj))) {
                        int i6 = a;
                        int i7 = ((i6 ^ 116) + ((i6 & 116) << 1)) - 1;
                        b = i7 % 128;
                        int i8 = i7 % 2;
                        z = true;
                    }
                }
                int i9 = b;
                int i10 = ((i9 | 69) << 1) - (i9 ^ 69);
                a = i10 % 128;
                int i11 = i10 % 2;
                return z;
            }
            int i12 = 6 / 0;
            if (obj instanceof ParameterizedType) {
                if (!(!C0328j.e(this, (ParameterizedType) obj))) {
                    int i13 = a;
                    int i14 = ((i13 ^ 116) + ((i13 & 116) << 1)) - 1;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                }
            }
            int i16 = b;
            int i17 = ((i16 | 69) << 1) - (i16 ^ 69);
            a = i17 % 128;
            int i18 = i17 % 2;
            return z;
            int i19 = b;
            int i20 = i19 & 117;
            int i21 = (i19 ^ 117) | i20;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            int i110 = b;
            int i111 = ((i110 | 69) << 1) - (i110 ^ 69);
            a = i111 % 128;
            int i112 = i111 % 2;
            return z;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 73) + (i2 | 73);
            a = i3 % 128;
            int i4 = i3 % 2;
            Type[] typeArr = this.e;
            if (i4 == 0) {
                return (Type[]) typeArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 113;
            int i4 = -(-((i2 & 113) << 1));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            Type type = this.c;
            int i7 = i2 | 111;
            int i8 = ((i7 << 1) - (~(-((~(i2 & 111)) & i7)))) - 1;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return type;
            }
            throw null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 ^ 4) + ((i2 & 4) << 1)) ^ (-1));
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            Type type = this.d;
            int i6 = ((i4 | 19) << 1) - (i4 ^ 19);
            a = i6 % 128;
            int i7 = i6 % 2;
            return type;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-94)) | ((~i2) & 93);
            int i4 = (i2 & 93) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                Arrays.hashCode(this.e);
                throw null;
            }
            int iHashCode2 = Arrays.hashCode(this.e);
            int iHashCode3 = this.d.hashCode();
            Type type = this.c;
            if (type != null) {
                int i6 = a;
                int i7 = ((i6 ^ 11) | (i6 & 11)) << 1;
                int i8 = -(((~i6) & 11) | (i6 & (-12)));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    type.hashCode();
                    throw null;
                }
                iHashCode = type.hashCode();
                int i10 = b;
                int i11 = ((i10 ^ 121) | (i10 & 121)) << 1;
                int i12 = -(((~i10) & 121) | (i10 & (-122)));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 2 / 3;
                }
            } else {
                int i15 = a + 77;
                b = i15 % 128;
                int i16 = i15 % 2;
                iHashCode = 0;
            }
            int i17 = (~iHashCode3) & iHashCode2;
            int i18 = (~iHashCode2) & iHashCode3;
            int i19 = (i18 & i17) | (i17 ^ i18);
            int i20 = (iHashCode & (~i19)) | ((~iHashCode) & i19);
            int i21 = a;
            int i22 = i21 & 75;
            int i23 = i21 | 75;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            b = i24 % 128;
            int i25 = i24 % 2;
            return i20;
        }

        public final String toString() {
            int i;
            String strB;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 82) + ((i3 & 82) << 1)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            int length = this.e.length;
            if (length == 0) {
                int i6 = (i3 & 49) + (i3 | 49);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    strB = C0328j.b(this.d);
                    int i7 = 99 / 0;
                } else {
                    strB = C0328j.b(this.d);
                }
                int i8 = a;
                int i9 = i8 & 65;
                int i10 = ((i8 ^ 65) | i9) << 1;
                int i11 = -((i8 | 65) & (~i9));
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 12 / 0;
                }
                return strB;
            }
            int i14 = length + 2;
            StringBuilder sb = new StringBuilder(((i14 ^ (-1)) + (i14 << 1)) * 30);
            int i15 = b;
            int i16 = i15 & 5;
            int i17 = ((i15 ^ 5) | i16) << 1;
            int i18 = -((i15 | 5) & (~i16));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            Object obj = null;
            if (i19 % 2 != 0) {
                sb.append(C0328j.b(this.d));
                obj.hashCode();
                throw null;
            }
            sb.append(C0328j.b(this.d));
            sb.append("<");
            Type[] typeArr = this.e;
            int i20 = a;
            int i21 = i20 & 111;
            int i22 = (((i20 | 111) & (~i21)) - (~(-(-(i21 << 1))))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
            sb.append(C0328j.b(typeArr[0]));
            int i24 = a;
            int i25 = i24 ^ 37;
            int i26 = -(-((i24 & 37) << 1));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = 1;
            while (i29 < length) {
                int i30 = b;
                int i31 = i30 & 69;
                int i32 = (((i30 ^ 69) | i31) << 1) - ((i30 | 69) & (~i31));
                a = i32 % 128;
                int i33 = i32 % 2;
                sb.append(", ");
                Type[] typeArr2 = this.e;
                int i34 = a;
                int i35 = (i34 & 5) + (i34 | 5);
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    sb.append(C0328j.b(typeArr2[i29]));
                    int i36 = (i29 & (-31)) | ((~i29) & 30);
                    int i37 = -(-((i29 & 30) << 1));
                    i = ((i36 | i37) << 1) - (i37 ^ i36);
                } else {
                    sb.append(C0328j.b(typeArr2[i29]));
                    int i38 = ((i29 ^ 1) | (i29 & 1)) << 1;
                    int i39 = -(((~i29) & 1) | (i29 & (-2)));
                    i = (i38 ^ i39) + ((i39 & i38) << 1);
                }
                i29 = i;
            }
            sb.append(">");
            String string = sb.toString();
            int i40 = a;
            int i41 = i40 & 9;
            int i42 = (i40 ^ 9) | i41;
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            b = i43 % 128;
            if (i43 % 2 != 0) {
                return string;
            }
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    public static Type g(Type type, Class<?> cls, Class<?> cls2) throws Throwable {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = ((i2 | 53) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
            if (!(!(type instanceof WildcardType))) {
                type = ((WildcardType) type).getUpperBounds()[0];
                int i6 = a;
                int i7 = (i6 ^ 123) + ((i6 & 123) << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 & 39;
                int i10 = ((i6 | 39) & (~i9)) + (i9 << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
            }
        } else if (!(!(type instanceof WildcardType))) {
            type = ((WildcardType) type).getUpperBounds()[0];
            int i12 = a;
            int i13 = (i12 ^ 123) + ((i12 & 123) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 & 39;
            int i16 = ((i12 | 39) & (~i15)) + (i15 << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        i.i(cls2.isAssignableFrom(cls));
        int i18 = a;
        int i19 = ((i18 ^ 102) + ((i18 & 102) << 1)) - 1;
        b = i19 % 128;
        if (i19 % 2 == 0) {
            i(type, cls, f(type, cls, cls2));
            throw null;
        }
        Type typeI = i(type, cls, f(type, cls, cls2));
        int i20 = b;
        int i21 = ((i20 & 110) + (i20 | 110)) - 1;
        a = i21 % 128;
        if (i21 % 2 == 0) {
            return typeI;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ed A[LOOP:2: B:37:0x00ed->B:57:0x0163, LOOP_START, PHI: r11
  0x00ed: PHI (r11v14 java.lang.Class<?>) = (r11v1 java.lang.Class<?>), (r11v30 java.lang.Class<?>) binds: [B:36:0x00eb, B:57:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163 A[LOOP:2: B:37:0x00ed->B:57:0x0163, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0117 A[EDGE_INSN: B:66:0x0117->B:46:0x0117 BREAK  A[LOOP:0: B:3:0x0003->B:29:0x00b5, LOOP_LABEL: LOOP:0: B:3:0x0003->B:29:0x00b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0117 A[EDGE_INSN: B:67:0x0117->B:46:0x0117 BREAK  A[LOOP:0: B:3:0x0003->B:29:0x00b5, LOOP_LABEL: LOOP:0: B:3:0x0003->B:29:0x00b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x013c A[SYNTHETIC] */
    public static Type f(Type type, Class<?> cls, Class<?> cls2) {
        int i;
        Class<?> superclass;
        int i2;
        Type genericSuperclass;
        Class<?>[] interfaces;
        int length;
        int i3 = 2 % 2;
        loop0: while (true) {
            if (cls2 == cls) {
                int i4 = b;
                int i5 = i4 ^ 75;
                int i6 = ((i4 & 75) | i5) << 1;
                int i7 = -i5;
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                int i9 = i8 % 128;
                a = i9;
                int i10 = i8 % 2;
                int i11 = ((i9 | 3) << 1) - (i9 ^ 3);
                b = i11 % 128;
                int i12 = i11 % 2;
                return type;
            }
            Object obj = null;
            if (!cls2.isInterface()) {
                if (!cls.isInterface()) {
                    while (true) {
                        if (cls != Object.class) {
                            int i13 = b;
                            int i14 = (i13 & (-116)) | ((~i13) & 115);
                            int i15 = (i13 & 115) << 1;
                            i = (i14 & i15) + (i15 | i14);
                            a = i % 128;
                            if (i % 2 != 0) {
                                superclass = cls.getSuperclass();
                                int i16 = 77 / 0;
                                if (superclass == cls2) {
                                    break loop0;
                                }
                                if (cls2.isAssignableFrom(superclass)) {
                                    int i17 = a;
                                    i2 = ((i17 | 45) << 1) - (i17 ^ 45);
                                    b = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        cls.getGenericSuperclass();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    genericSuperclass = cls.getGenericSuperclass();
                                    int i18 = a + 19;
                                    b = i18 % 128;
                                    int i19 = i18 % 2;
                                    break;
                                }
                                int i20 = b;
                                int i21 = i20 ^ 51;
                                int i22 = (i20 & 51) << 1;
                                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                                a = i23 % 128;
                                int i24 = i23 % 2;
                                cls = superclass;
                            } else {
                                superclass = cls.getSuperclass();
                                if (superclass == cls2) {
                                    break loop0;
                                }
                                if (cls2.isAssignableFrom(superclass)) {
                                    int i110 = a;
                                    i2 = ((i110 | 45) << 1) - (i110 ^ 45);
                                    b = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        cls.getGenericSuperclass();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    genericSuperclass = cls.getGenericSuperclass();
                                    int i111 = a + 19;
                                    b = i111 % 128;
                                    int i112 = i111 % 2;
                                    break;
                                    break;
                                }
                                int i25 = b;
                                int i26 = i25 ^ 51;
                                int i27 = (i25 & 51) << 1;
                                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                                a = i28 % 128;
                                int i29 = i28 % 2;
                                cls = superclass;
                            }
                        }
                    }
                }
                int i30 = a;
                int i31 = (-2) - ((((i30 | 82) << 1) - (i30 ^ 82)) ^ (-1));
                b = i31 % 128;
                int i32 = i31 % 2;
                return cls2;
            }
            int i33 = a + 81;
            b = i33 % 128;
            if (i33 % 2 == 0) {
                interfaces = cls.getInterfaces();
                length = interfaces.length;
            } else {
                interfaces = cls.getInterfaces();
                length = interfaces.length;
            }
            int i34 = a;
            int i35 = ((i34 | 107) << 1) - (i34 ^ 107);
            b = i35 % 128;
            int i36 = i35 % 2;
            int i37 = 0;
            while (true) {
                if (i37 >= length) {
                    if (!cls.isInterface()) {
                        while (true) {
                            if (cls != Object.class) {
                                int i113 = b;
                                int i114 = (i113 & (-116)) | ((~i113) & 115);
                                int i115 = (i113 & 115) << 1;
                                i = (i114 & i115) + (i115 | i114);
                                a = i % 128;
                                if (i % 2 != 0) {
                                    superclass = cls.getSuperclass();
                                    int i116 = 77 / 0;
                                    if (superclass == cls2) {
                                        break loop0;
                                        break loop0;
                                    }
                                    if (cls2.isAssignableFrom(superclass)) {
                                        int i117 = a;
                                        i2 = ((i117 | 45) << 1) - (i117 ^ 45);
                                        b = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            cls.getGenericSuperclass();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        genericSuperclass = cls.getGenericSuperclass();
                                        int i118 = a + 19;
                                        b = i118 % 128;
                                        int i119 = i118 % 2;
                                        break;
                                        break;
                                    }
                                    int i210 = b;
                                    int i211 = i210 ^ 51;
                                    int i212 = (i210 & 51) << 1;
                                    int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                                    a = i213 % 128;
                                    int i214 = i213 % 2;
                                    cls = superclass;
                                } else {
                                    superclass = cls.getSuperclass();
                                    if (superclass == cls2) {
                                        break loop0;
                                        break loop0;
                                    }
                                    if (cls2.isAssignableFrom(superclass)) {
                                        int i1110 = a;
                                        i2 = ((i1110 | 45) << 1) - (i1110 ^ 45);
                                        b = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            cls.getGenericSuperclass();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        genericSuperclass = cls.getGenericSuperclass();
                                        int i1111 = a + 19;
                                        b = i1111 % 128;
                                        int i1112 = i1111 % 2;
                                        break;
                                        break;
                                    }
                                    int i215 = b;
                                    int i216 = i215 ^ 51;
                                    int i217 = (i215 & 51) << 1;
                                    int i218 = (i216 ^ i217) + ((i217 & i216) << 1);
                                    a = i218 % 128;
                                    int i219 = i218 % 2;
                                    cls = superclass;
                                }
                            }
                        }
                    }
                    int i38 = a;
                    int i39 = (-2) - ((((i38 | 82) << 1) - (i38 ^ 82)) ^ (-1));
                    b = i39 % 128;
                    int i310 = i39 % 2;
                    return cls2;
                }
                int i40 = a;
                int i41 = i40 & 17;
                int i42 = -(-(i40 | 17));
                int i43 = (i41 & i42) + (i42 | i41);
                b = i43 % 128;
                if (i43 % 2 == 0) {
                    Class<?> cls3 = interfaces[i37];
                    throw null;
                }
                Class<?> cls4 = interfaces[i37];
                if (cls4 == cls2) {
                    Type type2 = cls.getGenericInterfaces()[i37];
                    int i44 = a;
                    int i45 = i44 & 13;
                    int i46 = (i44 | 13) & (~i45);
                    int i47 = -(-(i45 << 1));
                    int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                    b = i48 % 128;
                    if (i48 % 2 != 0) {
                        return type2;
                    }
                    throw null;
                }
                if (!(!cls2.isAssignableFrom(cls4))) {
                    int i49 = b + 31;
                    a = i49 % 128;
                    if (i49 % 2 != 0) {
                        Type type3 = cls.getGenericInterfaces()[i37];
                        Class<?> cls5 = interfaces[i37];
                        obj.hashCode();
                        throw null;
                    }
                    genericSuperclass = cls.getGenericInterfaces()[i37];
                    superclass = interfaces[i37];
                    int i50 = a;
                    int i51 = (i50 ^ 93) + ((i50 & 93) << 1);
                    b = i51 % 128;
                    int i52 = i51 % 2;
                } else {
                    i37 = ((i37 | 1) << 1) - (i37 ^ 1);
                    int i53 = b;
                    int i54 = (((i53 ^ 79) | (i53 & 79)) << 1) - (((~i53) & 79) | (i53 & (-80)));
                    a = i54 % 128;
                    int i55 = i54 % 2;
                }
            }
            Type type4 = genericSuperclass;
            cls = superclass;
            type = type4;
        }
        Type genericSuperclass2 = cls.getGenericSuperclass();
        int i56 = a;
        int i57 = i56 & 23;
        int i58 = ((i56 ^ 23) | i57) << 1;
        int i59 = -((i56 | 23) & (~i57));
        int i60 = (i58 & i59) + (i59 | i58);
        b = i60 % 128;
        if (i60 % 2 == 0) {
            int i61 = 4 / 0;
        }
        return genericSuperclass2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x032c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x0250  */
    public static boolean e(Type type, Type type2) {
        int i;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        while (true) {
            boolean z2 = true;
            if (type == type2) {
                int i4 = b;
                int i5 = i4 & 61;
                int i6 = ((i4 ^ 61) | i5) << 1;
                int i7 = -((i4 | 61) & (~i5));
                int i8 = (i6 & i7) + (i7 | i6);
                int i9 = i8 % 128;
                a = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 93;
                b = i11 % 128;
                int i12 = i11 % 2;
                return true;
            }
            boolean z3 = false;
            if (type instanceof Class) {
                int i13 = a;
                int i14 = (i13 & (-116)) | ((~i13) & 115);
                int i15 = (i13 & 115) << 1;
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                boolean zEquals = type.equals(type2);
                int i18 = a;
                int i19 = i18 & 43;
                int i20 = (i19 - (~((i18 ^ 43) | i19))) - 1;
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 45 / 0;
                }
                return zEquals;
            }
            Object obj = null;
            if (type instanceof ParameterizedType) {
                int i22 = b;
                int i23 = i22 ^ 75;
                int i24 = ((((i22 & 75) | i23) << 1) - (~(-i23))) - 1;
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    boolean z4 = type2 instanceof ParameterizedType;
                    obj.hashCode();
                    throw null;
                }
                if (!(type2 instanceof ParameterizedType)) {
                    int i25 = (i22 | 77) << 1;
                    int i26 = -((i22 & (-78)) | ((~i22) & 77));
                    int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                int i29 = b;
                int i30 = i29 & 81;
                int i31 = (i29 ^ 81) | i30;
                int i32 = (i30 & i31) + (i31 | i30);
                a = i32 % 128;
                int i33 = i32 % 2;
                Type ownerType2 = parameterizedType2.getOwnerType();
                if (ownerType != ownerType2) {
                    int i34 = b;
                    int i35 = ((i34 & 91) - (~(i34 | 91))) - 1;
                    a = i35 % 128;
                    if (i35 % 2 != 0) {
                        int i36 = 91 / 0;
                        if (ownerType != null) {
                            if (!(!ownerType.equals(ownerType2))) {
                                int i37 = b;
                                int i38 = (i37 | 57) << 1;
                                int i39 = -(((~i37) & 57) | (i37 & (-58)));
                                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                                int i41 = i40 % 128;
                                a = i41;
                                int i42 = i40 % 2;
                                i = i41 + 3;
                                b = i % 128;
                                if (i % 2 == 0) {
                                    parameterizedType.getRawType().equals(parameterizedType2.getRawType());
                                    throw null;
                                }
                                if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
                                    int i43 = a;
                                    i2 = (i43 ^ 115) + ((i43 & 115) << 1);
                                    b = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        parameterizedType.getActualTypeArguments();
                                        parameterizedType2.getActualTypeArguments();
                                        throw null;
                                    }
                                    if (!Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                                    }
                                }
                            }
                            int i44 = b;
                            int i45 = i44 & 5;
                            int i46 = (i44 | 5) & (~i45);
                            int i47 = -(-(i45 << 1));
                            int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                            a = i48 % 128;
                            int i49 = i48 % 2;
                            z2 = false;
                        }
                    } else if (ownerType != null) {
                        if (!(!ownerType.equals(ownerType2))) {
                            int i310 = b;
                            int i311 = (i310 | 57) << 1;
                            int i312 = -(((~i310) & 57) | (i310 & (-58)));
                            int i410 = (i311 ^ i312) + ((i312 & i311) << 1);
                            int i411 = i410 % 128;
                            a = i411;
                            int i412 = i410 % 2;
                            i = i411 + 3;
                            b = i % 128;
                            if (i % 2 == 0) {
                                parameterizedType.getRawType().equals(parameterizedType2.getRawType());
                                throw null;
                            }
                            if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
                                int i413 = a;
                                i2 = (i413 ^ 115) + ((i413 & 115) << 1);
                                b = i2 % 128;
                                if (i2 % 2 == 0) {
                                    parameterizedType.getActualTypeArguments();
                                    parameterizedType2.getActualTypeArguments();
                                    throw null;
                                }
                                if (!Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                                }
                            }
                        }
                        int i414 = b;
                        int i415 = i414 & 5;
                        int i416 = (i414 | 5) & (~i415);
                        int i417 = -(-(i415 << 1));
                        int i418 = (i416 ^ i417) + ((i416 & i417) << 1);
                        a = i418 % 128;
                        int i419 = i418 % 2;
                        z2 = false;
                    }
                    int i50 = b;
                    int i51 = i50 & 97;
                    int i52 = (i50 | 97) & (~i51);
                    int i53 = -(-(i51 << 1));
                    int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                    a = i54 % 128;
                    if (i54 % 2 != 0) {
                        int i55 = 3 % 2;
                    }
                    int i4110 = b;
                    int i4111 = i4110 & 5;
                    int i4112 = (i4110 | 5) & (~i4111);
                    int i4113 = -(-(i4111 << 1));
                    int i4114 = (i4112 ^ i4113) + ((i4112 & i4113) << 1);
                    a = i4114 % 128;
                    int i4115 = i4114 % 2;
                    z2 = false;
                } else {
                    int i313 = b;
                    int i314 = (i313 | 57) << 1;
                    int i315 = -(((~i313) & 57) | (i313 & (-58)));
                    int i4116 = (i314 ^ i315) + ((i315 & i314) << 1);
                    int i4117 = i4116 % 128;
                    a = i4117;
                    int i4118 = i4116 % 2;
                    i = i4117 + 3;
                    b = i % 128;
                    if (i % 2 == 0) {
                        parameterizedType.getRawType().equals(parameterizedType2.getRawType());
                        throw null;
                    }
                    if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
                        int i4119 = b;
                        int i41110 = i4119 & 5;
                        int i41111 = (i4119 | 5) & (~i41110);
                        int i41112 = -(-(i41110 << 1));
                        int i41113 = (i41111 ^ i41112) + ((i41111 & i41112) << 1);
                        a = i41113 % 128;
                        int i41114 = i41113 % 2;
                        z2 = false;
                    } else {
                        int i4120 = a;
                        i2 = (i4120 ^ 115) + ((i4120 & 115) << 1);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            parameterizedType.getActualTypeArguments();
                            parameterizedType2.getActualTypeArguments();
                            throw null;
                        }
                        if (!Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                            int i41115 = b;
                            int i41116 = i41115 & 5;
                            int i41117 = (i41115 | 5) & (~i41116);
                            int i41118 = -(-(i41116 << 1));
                            int i41119 = (i41117 ^ i41118) + ((i41117 & i41118) << 1);
                            a = i41119 % 128;
                            int i411110 = i41119 % 2;
                            z2 = false;
                        }
                    }
                }
                int i56 = a + 3;
                b = i56 % 128;
                int i57 = i56 % 2;
                return z2;
            }
            if (!(type instanceof GenericArrayType)) {
                if (type instanceof WildcardType) {
                    int i58 = b + 95;
                    int i59 = i58 % 128;
                    a = i59;
                    if (i58 % 2 != 0) {
                        boolean z5 = type2 instanceof WildcardType;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(type2 instanceof WildcardType)) {
                        int i60 = ((i59 | 48) << 1) - (i59 ^ 48);
                        int i61 = (i60 ^ (-1)) + (i60 << 1);
                        b = i61 % 128;
                        int i62 = i61 % 2;
                        return false;
                    }
                    WildcardType wildcardType = (WildcardType) type;
                    WildcardType wildcardType2 = (WildcardType) type2;
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    int i63 = a + 19;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    if (Arrays.equals(upperBounds, wildcardType2.getUpperBounds())) {
                        int i65 = a;
                        int i66 = i65 & 121;
                        int i67 = (i65 ^ 121) | i66;
                        int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                        b = i68 % 128;
                        int i69 = i68 % 2;
                        if (Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                            int i70 = b + 94;
                            int i71 = (i70 ^ (-1)) + (i70 << 1);
                            int i72 = i71 % 128;
                            a = i72;
                            z = i71 % 2 == 0;
                            int i73 = ((i72 | 107) << 1) - (i72 ^ 107);
                            b = i73 % 128;
                            int i74 = i73 % 2;
                        } else {
                            int i75 = a;
                            int i76 = i75 & 51;
                            int i77 = (i75 ^ 51) | i76;
                            int i78 = (i76 & i77) + (i77 | i76);
                            b = i78 % 128;
                            int i79 = i78 % 2;
                            z = false;
                        }
                    } else {
                        int i710 = a;
                        int i711 = i710 & 51;
                        int i712 = (i710 ^ 51) | i711;
                        int i713 = (i711 & i712) + (i712 | i711);
                        b = i713 % 128;
                        int i714 = i713 % 2;
                        z = false;
                    }
                    int i80 = a;
                    int i81 = (i80 & (-4)) | ((~i80) & 3);
                    int i82 = -(-((i80 & 3) << 1));
                    int i83 = (i81 & i82) + (i82 | i81);
                    b = i83 % 128;
                    if (i83 % 2 == 0) {
                        int i84 = 81 / 0;
                    }
                    return z;
                }
                if (!(type instanceof TypeVariable)) {
                    int i85 = b + 126;
                    int i86 = (i85 ^ (-1)) + (i85 << 1);
                    a = i86 % 128;
                    int i87 = i86 % 2;
                    return false;
                }
                int i88 = b;
                int i89 = i88 & 49;
                int i90 = (~i89) & (i88 | 49);
                int i91 = -(-(i89 << 1));
                int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
                a = i92 % 128;
                if (i92 % 2 != 0) {
                    boolean z6 = type2 instanceof TypeVariable;
                    obj.hashCode();
                    throw null;
                }
                if (!(type2 instanceof TypeVariable)) {
                    int i93 = ((i88 ^ 62) + ((i88 & 62) << 1)) - 1;
                    a = i93 % 128;
                    int i94 = i93 % 2;
                    int i95 = (i88 & (-44)) | ((~i88) & 43);
                    int i96 = -(-((i88 & 43) << 1));
                    int i97 = (i95 & i96) + (i95 | i96);
                    a = i97 % 128;
                    int i98 = i97 % 2;
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                int i99 = b + 49;
                a = i99 % 128;
                int i100 = i99 % 2;
                if (genericDeclaration == typeVariable2.getGenericDeclaration()) {
                    int i101 = b;
                    int i102 = (i101 & 31) + (i101 | 31);
                    a = i102 % 128;
                    if (i102 % 2 != 0) {
                        typeVariable.getName().equals(typeVariable2.getName());
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!typeVariable.getName().equals(typeVariable2.getName()))) {
                        int i103 = a;
                        int i104 = i103 & 119;
                        int i105 = ((i103 ^ 119) | i104) << 1;
                        int i106 = -((i103 | 119) & (~i104));
                        int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                        int i108 = i107 % 128;
                        b = i108;
                        int i109 = i107 % 2;
                        int i110 = i108 & 63;
                        int i111 = (((i108 | 63) & (~i110)) - (~(-(-(i110 << 1))))) - 1;
                        a = i111 % 128;
                        int i112 = i111 % 2;
                        z3 = true;
                    } else {
                        int i113 = b + 97;
                        a = i113 % 128;
                        int i114 = i113 % 2;
                    }
                } else {
                    int i115 = b + 97;
                    a = i115 % 128;
                    int i116 = i115 % 2;
                }
                int i117 = a;
                int i118 = i117 & 7;
                int i119 = (((i117 | 7) & (~i118)) - (~(-(-(i118 << 1))))) - 1;
                b = i119 % 128;
                int i120 = i119 % 2;
                return z3;
            }
            int i121 = b;
            int i122 = i121 & 59;
            int i123 = (i121 ^ 59) | i122;
            int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
            int i125 = i124 % 128;
            a = i125;
            if (i124 % 2 != 0) {
                boolean z7 = type2 instanceof GenericArrayType;
                throw null;
            }
            if (!(type2 instanceof GenericArrayType)) {
                int i126 = (((i125 ^ 37) | (i125 & 37)) << 1) - ((i125 & (-38)) | ((~i125) & 37));
                b = i126 % 128;
                int i127 = i126 % 2;
                int i128 = i125 & 79;
                int i129 = (((~i128) & (i125 | 79)) - (~(-(-(i128 << 1))))) - 1;
                b = i129 % 128;
                if (i129 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            type = ((GenericArrayType) type).getGenericComponentType();
            int i130 = b + 93;
            a = i130 % 128;
            int i131 = i130 % 2;
            type2 = ((GenericArrayType) type2).getGenericComponentType();
            int i132 = a;
            int i133 = (i132 ^ 103) + ((i132 & 103) << 1);
            b = i133 % 128;
            int i134 = i133 % 2;
        }
    }

    public static Type c(Type type) {
        Type type2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = -(-(i2 | 99));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Object obj = null;
        if (!(!(type instanceof Class))) {
            int i8 = i2 & 117;
            int i9 = i2 | 117;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                ((Class) type).isArray();
                obj.hashCode();
                throw null;
            }
            Class cls = (Class) type;
            if (cls.isArray()) {
                type2 = cls;
                bld bldVar = new bld(c(cls.getComponentType()));
                int i11 = b;
                int i12 = ((i11 & (-126)) | ((~i11) & 125)) + ((i11 & 125) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                int i14 = (i11 & 99) + (i11 | 99);
                a = i14 % 128;
                int i15 = i14 % 2;
                type2 = bldVar;
            }
            type2 = cls;
            int i16 = b;
            int i17 = (-2) - ((((i16 | 12) << 1) - (i16 ^ 12)) ^ (-1));
            a = i17 % 128;
            int i18 = i17 % 2;
            return type2;
        }
        if (type instanceof ParameterizedType) {
            int i19 = i2 + 35;
            b = i19 % 128;
            if (i19 % 2 == 0) {
                ((ParameterizedType) type).getOwnerType();
                throw null;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ble bleVar = new ble(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
            int i20 = a;
            int i21 = i20 & 85;
            int i22 = ((i20 ^ 85) | i21) << 1;
            int i23 = -((i20 | 85) & (~i21));
            int i24 = (i22 & i23) + (i23 | i22);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                return bleVar;
            }
            obj.hashCode();
            throw null;
        }
        if (type instanceof GenericArrayType) {
            bld bldVar2 = new bld(((GenericArrayType) type).getGenericComponentType());
            int i25 = b;
            int i26 = i25 & 89;
            int i27 = i26 + ((i25 ^ 89) | i26);
            a = i27 % 128;
            int i28 = i27 % 2;
            return bldVar2;
        }
        if (!(type instanceof WildcardType)) {
            int i29 = i6 & 43;
            int i30 = -(-((i6 ^ 43) | i29));
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            a = i31 % 128;
            if (i31 % 2 != 0) {
                int i32 = 87 / 0;
            }
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        blf blfVar = new blf(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        int i33 = b;
        int i34 = (i33 ^ 77) + ((i33 & 77) << 1);
        a = i34 % 128;
        if (i34 % 2 == 0) {
            return blfVar;
        }
        throw null;
    }

    public static Class<?> h(Type type) {
        Class<?> cls;
        Class<?> cls2;
        String name;
        int i = 2 % 2;
        while (true) {
            Object obj = null;
            if (type instanceof Class) {
                int i2 = a + 7;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    return (Class) type;
                }
                obj.hashCode();
                throw null;
            }
            if (type instanceof ParameterizedType) {
                int i3 = a;
                int i4 = (i3 ^ 5) + ((i3 & 5) << 1);
                b = i4 % 128;
                int i5 = i4 % 2;
                Type rawType = ((ParameterizedType) type).getRawType();
                boolean z = rawType instanceof Class;
                int i6 = b;
                int i7 = i6 & 69;
                int i8 = (i7 - (~(-(-((i6 ^ 69) | i7))))) - 1;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    i.i(z);
                    cls = (Class) rawType;
                    int i9 = 3 / 0;
                } else {
                    i.i(z);
                    cls = (Class) rawType;
                }
                int i10 = a;
                int i11 = (i10 & (-56)) | ((~i10) & 55);
                int i12 = (i10 & 55) << 1;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                int i14 = i13 % 2;
                return cls;
            }
            if (!(!(type instanceof GenericArrayType))) {
                int i15 = a + 13;
                b = i15 % 128;
                Class<?> cls3 = Array.newInstance(h(i15 % 2 == 0 ? ((GenericArrayType) type).getGenericComponentType() : ((GenericArrayType) type).getGenericComponentType()), 0).getClass();
                int i16 = a + 95;
                b = i16 % 128;
                int i17 = i16 % 2;
                return cls3;
            }
            if (type instanceof TypeVariable) {
                int i18 = b;
                int i19 = (i18 & 43) + (i18 | 43);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    cls2 = Object.class;
                    int i20 = 70 / 0;
                } else {
                    cls2 = Object.class;
                }
                int i21 = (i18 & 123) + (i18 | 123);
                a = i21 % 128;
                int i22 = i21 % 2;
                return cls2;
            }
            if (!(type instanceof WildcardType)) {
                if (type == null) {
                    int i23 = a;
                    int i24 = i23 & 47;
                    int i25 = (((i23 | 47) & (~i24)) - (~(i24 << 1))) - 1;
                    int i26 = i25 % 128;
                    b = i26;
                    int i27 = i25 % 2;
                    int i28 = ((i26 ^ 83) | (i26 & 83)) << 1;
                    int i29 = -(((~i26) & 83) | (i26 & (-84)));
                    int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    name = "null";
                } else {
                    name = type.getClass().getName();
                    int i32 = a;
                    int i33 = (i32 ^ 6) + ((i32 & 6) << 1);
                    int i34 = (i33 ^ (-1)) + (i33 << 1);
                    b = i34 % 128;
                    int i35 = i34 % 2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                int i36 = b;
                int i37 = (-2) - (((i36 & 6) + (i36 | 6)) ^ (-1));
                a = i37 % 128;
                if (i37 % 2 != 0) {
                    sb.append(type);
                    sb.append("> is of type ");
                    throw null;
                }
                sb.append(type);
                sb.append("> is of type ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString());
            }
            int i38 = (-2) - ((a + 112) ^ (-1));
            b = i38 % 128;
            int i39 = i38 % 2;
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            type = i39 == 0 ? upperBounds[1] : upperBounds[0];
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x04be  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bf  */
    public static Type j(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) throws Throwable {
        Type type3;
        WildcardType wildcardType;
        Type type4;
        Type[] upperBounds;
        Type type5;
        Type[] lowerBounds;
        ParameterizedType bleVar;
        Type ownerType;
        boolean z;
        int i;
        TypeVariable typeVariable;
        Class cls2;
        int i2 = 2 % 2;
        Type type6 = type2;
        do {
            Throwable th = null;
            if (!(type6 instanceof TypeVariable)) {
                if (!(!(type6 instanceof Class))) {
                    int i3 = a;
                    int i4 = ((i3 ^ 116) + ((i3 & 116) << 1)) - 1;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        ((Class) type6).isArray();
                        th.hashCode();
                        throw null;
                    }
                    Class cls3 = (Class) type6;
                    if (cls3.isArray()) {
                        int i5 = a;
                        int i6 = i5 & 91;
                        int i7 = (((i5 | 91) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
                        b = i7 % 128;
                        int i8 = i7 % 2;
                        Class<?> componentType = cls3.getComponentType();
                        Type typeJ = j(type, cls, componentType, collection);
                        int i9 = a;
                        int i10 = i9 & 79;
                        int i11 = -(-((i9 ^ 79) | i10));
                        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                        b = i12 % 128;
                        if (i12 % 2 == 0) {
                            th.hashCode();
                            throw null;
                        }
                        if (componentType != typeJ) {
                            return new bld(typeJ);
                        }
                        int i13 = i9 & 113;
                        int i14 = (i9 ^ 113) | i13;
                        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        return cls3;
                    }
                }
                if (type6 instanceof GenericArrayType) {
                    int i17 = a;
                    int i18 = i17 & 49;
                    int i19 = (((i17 ^ 49) | i18) << 1) - ((i17 | 49) & (~i18));
                    b = i19 % 128;
                    if (i19 % 2 == 0) {
                        ((GenericArrayType) type6).getGenericComponentType();
                        th.hashCode();
                        throw null;
                    }
                    GenericArrayType genericArrayType = (GenericArrayType) type6;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    int i20 = a;
                    int i21 = (i20 & (-112)) | ((~i20) & 111);
                    int i22 = -(-((i20 & 111) << 1));
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    b = i23 % 128;
                    if (i23 % 2 == 0) {
                        j(type, cls, genericComponentType, collection);
                        throw null;
                    }
                    Type typeJ2 = j(type, cls, genericComponentType, collection);
                    if (genericComponentType == typeJ2) {
                        int i24 = a;
                        int i25 = i24 & 11;
                        int i26 = (i24 | 11) & (~i25);
                        int i27 = -(-(i25 << 1));
                        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        return genericArrayType;
                    }
                    bld bldVar = new bld(typeJ2);
                    int i30 = b;
                    int i31 = i30 ^ 47;
                    int i32 = ((i30 & 47) | i31) << 1;
                    int i33 = -i31;
                    int i34 = (i32 & i33) + (i32 | i33);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    return bldVar;
                }
                if (type6 instanceof ParameterizedType) {
                    int i36 = a + 89;
                    b = i36 % 128;
                    if (i36 % 2 == 0) {
                        bleVar = (ParameterizedType) type6;
                        ownerType = bleVar.getOwnerType();
                        int i37 = 18 / 0;
                    } else {
                        bleVar = (ParameterizedType) type6;
                        ownerType = bleVar.getOwnerType();
                    }
                    Type typeJ3 = j(type, cls, ownerType, collection);
                    if (typeJ3 != ownerType) {
                        int i38 = a;
                        int i39 = ((i38 | 27) << 1) - (i38 ^ 27);
                        b = i39 % 128;
                        int i40 = i39 % 2;
                        z = true;
                    } else {
                        int i41 = a;
                        int i42 = i41 & 77;
                        int i43 = (i41 ^ 77) | i42;
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        b = i44 % 128;
                        if (i44 % 2 == 0) {
                            int i45 = 2 % 5;
                        }
                        z = false;
                    }
                    Type[] actualTypeArguments = bleVar.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    int i46 = a;
                    int i47 = (i46 & (-102)) | ((~i46) & 101);
                    int i48 = (i46 & 101) << 1;
                    int i49 = (i47 & i48) + (i48 | i47);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    int i51 = 0;
                    while (i51 < length) {
                        int i52 = b;
                        int i53 = (((i52 | 46) << 1) - (i52 ^ 46)) - 1;
                        a = i53 % 128;
                        int i54 = i53 % 2;
                        Type typeJ4 = j(type, cls, actualTypeArguments[i51], collection);
                        int i55 = a + 67;
                        int i56 = i55 % 128;
                        b = i56;
                        if (i55 % 2 == 0) {
                            throw th;
                        }
                        int i57 = (i56 ^ 111) + ((i56 & 111) << 1);
                        a = i57 % 128;
                        int i58 = i57 % 2;
                        if (typeJ4 != actualTypeArguments[i51]) {
                            int i59 = ((i56 & 5) - (~(-(-(i56 | 5))))) - 1;
                            a = i59 % 128;
                            if (i59 % 2 != 0) {
                                int i60 = 18 / 0;
                                if (!z) {
                                    int i61 = i56 & 43;
                                    int i62 = (i56 ^ 43) | i61;
                                    i = (i61 & i62) + (i61 | i62);
                                    a = i % 128;
                                    if (i % 2 != 0) {
                                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                        z = false;
                                    } else {
                                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                        z = true;
                                    }
                                }
                            } else if (!z) {
                                int i63 = i56 & 43;
                                int i64 = (i56 ^ 43) | i63;
                                i = (i63 & i64) + (i63 | i64);
                                a = i % 128;
                                if (i % 2 != 0) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = false;
                                } else {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                            }
                            actualTypeArguments[i51] = typeJ4;
                            int i65 = a;
                            int i66 = i65 & 103;
                            int i67 = (((i65 | 103) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
                            b = i67 % 128;
                            int i68 = i67 % 2;
                        }
                        int i69 = i51 & 1;
                        i51 = ((((i51 ^ 1) | i69) << 1) - (~(-((i51 | 1) & (~i69))))) - 1;
                        int i70 = a;
                        int i71 = (((i70 | 22) << 1) - (i70 ^ 22)) - 1;
                        b = i71 % 128;
                        int i72 = i71 % 2;
                        th = null;
                    }
                    if (z) {
                        bleVar = new ble(typeJ3, bleVar.getRawType(), actualTypeArguments);
                        int i73 = b;
                        int i74 = ((i73 ^ 105) - (~((i73 & 105) << 1))) - 1;
                        a = i74 % 128;
                        if (i74 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }
                    int i75 = a;
                    int i76 = ((i75 ^ 29) | (i75 & 29)) << 1;
                    int i77 = -(((~i75) & 29) | (i75 & (-30)));
                    int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                    b = i78 % 128;
                    if (i78 % 2 == 0) {
                        int i79 = 16 / 0;
                    }
                    return bleVar;
                }
                if (!(!(type6 instanceof WildcardType))) {
                    int i80 = b;
                    int i81 = (i80 & 3) + (i80 | 3);
                    a = i81 % 128;
                    int i82 = i81 % 2;
                    wildcardType = (WildcardType) type6;
                    Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    Type[] upperBounds2 = wildcardType.getUpperBounds();
                    int i83 = a;
                    int i84 = (-2) - ((i83 + 28) ^ (-1));
                    b = i84 % 128;
                    int i85 = i84 % 2;
                    if (lowerBounds2.length == 1) {
                        int i86 = i83 & 97;
                        int i87 = ((i83 | 97) & (~i86)) + (i86 << 1);
                        b = i87 % 128;
                        if (i87 % 2 == 0) {
                            type3 = type6;
                            type5 = lowerBounds2[0];
                        } else {
                            type3 = type6;
                            type5 = lowerBounds2[0];
                        }
                        Type typeJ5 = j(type, cls, type5, collection);
                        type3 = wildcardType;
                        if (typeJ5 != lowerBounds2[0]) {
                            int i88 = a + 43;
                            int i89 = i88 % 128;
                            b = i89;
                            if (i88 % 2 == 0) {
                                boolean z2 = typeJ5 instanceof WildcardType;
                                throw null;
                            }
                            if (typeJ5 instanceof WildcardType) {
                                int i90 = ((i89 & (-90)) | ((~i89) & 89)) + ((i89 & 89) << 1);
                                a = i90 % 128;
                                if (i90 % 2 != 0) {
                                    ((WildcardType) typeJ5).getLowerBounds();
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                lowerBounds = ((WildcardType) typeJ5).getLowerBounds();
                                int i91 = a;
                                int i92 = i91 ^ 31;
                                int i93 = ((((i91 & 31) | i92) << 1) - (~(-i92))) - 1;
                                b = i93 % 128;
                                int i94 = i93 % 2;
                            } else {
                                lowerBounds = new Type[]{typeJ5};
                            }
                            blf blfVar = new blf(new Type[]{Object.class}, lowerBounds);
                            int i95 = b;
                            int i96 = i95 ^ 31;
                            int i97 = (((i95 & 31) | i96) << 1) - i96;
                            a = i97 % 128;
                            int i98 = i97 % 2;
                            return blfVar;
                        }
                    } else if (upperBounds2.length == 1) {
                        int i99 = i83 & 23;
                        int i100 = -(-((i83 ^ 23) | i99));
                        int i101 = (i99 ^ i100) + ((i99 & i100) << 1);
                        b = i101 % 128;
                        if (i101 % 2 == 0) {
                            type3 = type6;
                            type3 = wildcardType;
                            type4 = upperBounds2[1];
                        } else {
                            type3 = type6;
                            type3 = wildcardType;
                            type4 = upperBounds2[0];
                        }
                        Type typeJ6 = j(type, cls, type4, collection);
                        type3 = wildcardType;
                        if (typeJ6 != upperBounds2[0]) {
                            int i102 = b;
                            int i103 = i102 & 93;
                            int i104 = i102 | 93;
                            int i105 = (i103 & i104) + (i103 | i104);
                            int i106 = i105 % 128;
                            a = i106;
                            if (i105 % 2 != 0) {
                                boolean z3 = typeJ6 instanceof WildcardType;
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            if (typeJ6 instanceof WildcardType) {
                                int i107 = i106 & 37;
                                int i108 = -(-((i106 ^ 37) | i107));
                                int i109 = ((i107 | i108) << 1) - (i107 ^ i108);
                                b = i109 % 128;
                                int i110 = i109 % 2;
                                upperBounds = ((WildcardType) typeJ6).getUpperBounds();
                            } else {
                                Type[] typeArr = {typeJ6};
                                int i111 = i102 & 109;
                                int i112 = i111 + ((i102 ^ 109) | i111);
                                a = i112 % 128;
                                int i113 = i112 % 2;
                                upperBounds = typeArr;
                            }
                            blf blfVar2 = new blf(upperBounds, c);
                            int i114 = a;
                            int i115 = i114 & 63;
                            int i116 = (i115 - (~(-(-((i114 ^ 63) | i115))))) - 1;
                            b = i116 % 128;
                            int i117 = i116 % 2;
                            return blfVar2;
                        }
                    }
                }
                type3 = type6;
                type3 = wildcardType;
                type3 = type6;
                int i118 = b;
                int i119 = i118 & 69;
                int i120 = i118 | 69;
                int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                a = i121 % 128;
                if (i121 % 2 == 0) {
                    return type3;
                }
                throw null;
            }
            int i122 = a;
            int i123 = i122 & 45;
            int i124 = -(-((i122 ^ 45) | i123));
            int i125 = (i123 & i124) + (i124 | i123);
            b = i125 % 128;
            if (i125 % 2 == 0) {
                collection.contains((TypeVariable) type6);
                throw null;
            }
            typeVariable = (TypeVariable) type6;
            if (collection.contains(typeVariable)) {
                int i126 = a;
                int i127 = i126 & 47;
                int i128 = i127 + ((i126 ^ 47) | i127);
                b = i128 % 128;
                if (i128 % 2 == 0) {
                    int i129 = 98 / 0;
                }
                return type6;
            }
            collection.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            int i130 = b;
            int i131 = (i130 & 83) + (i130 | 83);
            int i132 = i131 % 128;
            a = i132;
            if (i131 % 2 != 0) {
                boolean z4 = genericDeclaration instanceof Class;
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            if (genericDeclaration instanceof Class) {
                int i133 = i132 ^ 29;
                int i134 = ((((i132 & 29) | i133) << 1) - (~(-i133))) - 1;
                int i135 = i134 % 128;
                b = i135;
                int i136 = i134 % 2;
                cls2 = (Class) genericDeclaration;
                int i137 = i135 & 69;
                int i138 = ((i135 ^ 69) | i137) << 1;
                int i139 = -((i135 | 69) & (~i137));
                int i140 = (i138 & i139) + (i139 | i138);
                a = i140 % 128;
                int i141 = i140 % 2;
            } else {
                int i142 = ((i130 & 24) + (i130 | 24)) - 1;
                a = i142 % 128;
                int i143 = i142 % 2;
                cls2 = null;
            }
            if (cls2 != null) {
                int i144 = b;
                int i145 = i144 & 79;
                int i146 = -(-((i144 ^ 79) | i145));
                int i147 = (i145 & i146) + (i146 | i145);
                a = i147 % 128;
                if (i147 % 2 != 0) {
                    Object obj5 = null;
                    boolean z5 = f(type, cls, cls2) instanceof ParameterizedType;
                    obj5.hashCode();
                    throw null;
                }
                Type typeF = f(type, cls, cls2);
                if (!(typeF instanceof ParameterizedType)) {
                    type6 = typeVariable;
                } else {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    int length2 = typeParameters.length;
                    int i148 = a;
                    int i149 = ((i148 & 89) - (~(i148 | 89))) - 1;
                    b = i149 % 128;
                    int i150 = i149 % 2;
                    int i151 = 0;
                    while (true) {
                        if (i151 >= length2) {
                            throw new NoSuchElementException();
                        }
                        int i152 = a;
                        int i153 = i152 & 47;
                        int i154 = -(-(i152 | 47));
                        int i155 = (i153 & i154) + (i154 | i153);
                        b = i155 % 128;
                        if (i155 % 2 == 0) {
                            typeVariable.equals(typeParameters[i151]);
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        if (typeVariable.equals(typeParameters[i151])) {
                            int i156 = b;
                            int i157 = (-2) - (((i156 ^ 42) + ((i156 & 42) << 1)) ^ (-1));
                            a = i157 % 128;
                            int i158 = i157 % 2;
                            type6 = ((ParameterizedType) typeF).getActualTypeArguments()[i151];
                            int i159 = a + 89;
                            b = i159 % 128;
                            if (i159 % 2 != 0) {
                                break;
                            }
                            int i160 = 65 / 0;
                            break;
                        }
                        int i161 = ((i151 & (-3)) + (i151 | (-3))) - 1;
                        int i162 = i161 & 5;
                        i151 = (i162 << 1) + ((i161 | 5) & (~i162));
                        int i163 = b;
                        int i164 = ((i163 & 70) + (i163 | 70)) - 1;
                        a = i164 % 128;
                        int i165 = i164 % 2;
                    }
                }
            } else {
                type6 = typeVariable;
            }
        } while (type6 != typeVariable);
        int i166 = b;
        int i167 = i166 & 103;
        int i168 = -(-((i166 ^ 103) | i167));
        int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
        a = i169 % 128;
        if (i169 % 2 != 0) {
            int i170 = 56 / 0;
        }
        return type6;
    }
}
