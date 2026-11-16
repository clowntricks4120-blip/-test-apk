package ivas.gov.bisp.enumeration.bV;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bL.aE;
import ivas.gov.bisp.enumeration.bU.z;
import ivas.gov.bisp.enumeration.o000o0oo.o00OO00O;
import ivas.gov.bisp.enumeration.o000oo0o.o0O000Oo;
import ivas.gov.bisp.enumeration.o000ooO.o0O0O00;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements o0O0O00<z> {
    private static int a = 1;
    private static int b;
    public final CharSequence c;
    public final int d;
    public final int e;
    public final o0O000Oo<CharSequence, Integer, o00OO00O<Integer, Integer>> f;

    /* JADX WARN: Multi-variable type inference failed */
    public ad(CharSequence charSequence, int i, int i2, o0O000Oo<? super CharSequence, ? super Integer, o00OO00O<Integer, Integer>> o0o000oo) {
        r.n(charSequence, "input");
        this.c = charSequence;
        this.d = i;
        this.e = i2;
        this.f = o0o000oo;
    }

    public final Iterator<z> iterator() {
        int i = 2 % 2;
        byH byh = new byH();
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = -(-((i2 ^ 59) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        return byh;
    }

    public static final class byH implements Iterator<z> {
        private static int a = 1;
        private static int b;
        public int c = -1;
        public int d;
        public int e;
        public int f;
        public z g;

        /* JADX WARN: Code duplicated, block: B:11:0x0038  */
        /* JADX WARN: Code duplicated, block: B:9:0x0020  */
        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 35) + (i3 | 35);
            b = i4 % 128;
            boolean z = false;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
                if (this.c == -1) {
                    c();
                    int i6 = b;
                    int i7 = i6 ^ 107;
                    int i8 = ((i6 & 107) | i7) << 1;
                    int i9 = -i7;
                    i = ((i8 | i9) << 1) - (i8 ^ i9);
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i10 = 3 % 5;
                    }
                }
            } else if (this.c == -1) {
                c();
                int i11 = b;
                int i12 = i11 ^ 107;
                int i13 = ((i11 & 107) | i12) << 1;
                int i14 = -i12;
                i = ((i13 | i14) << 1) - (i13 ^ i14);
                a = i % 128;
                if (i % 2 == 0) {
                    int i15 = 3 % 5;
                }
            }
            if (this.c != 1) {
                int i16 = b;
                int i17 = i16 & 59;
                int i18 = (i16 ^ 59) | i17;
                int i19 = (i17 & i18) + (i17 | i18);
                a = i19 % 128;
                int i20 = i19 % 2;
                int i21 = (-2) - (((i16 ^ 58) + ((i16 & 58) << 1)) ^ (-1));
                a = i21 % 128;
                int i22 = i21 % 2;
            } else {
                z = true;
            }
            int i23 = b;
            int i24 = i23 & 59;
            int i25 = ((i23 ^ 59) | i24) << 1;
            int i26 = -((i23 | 59) & (~i24));
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            return z;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0058  */
        /* JADX WARN: Code duplicated, block: B:19:0x0060  */
        /* JADX WARN: Code duplicated, block: B:20:0x0097  */
        /* JADX WARN: Code duplicated, block: B:22:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:24:0x00de  */
        /* JADX WARN: Code duplicated, block: B:26:0x0115  */
        /* JADX WARN: Code duplicated, block: B:27:0x0126  */
        /* JADX WARN: Code duplicated, block: B:29:0x012e  */
        /* JADX WARN: Code duplicated, block: B:31:0x014d  */
        /* JADX WARN: Code duplicated, block: B:33:0x015b  */
        /* JADX WARN: Code duplicated, block: B:35:0x017a  */
        /* JADX WARN: Code duplicated, block: B:36:0x017d  */
        /* JADX WARN: Code duplicated, block: B:39:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:42:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:44:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:48:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:50:0x0204  */
        /* JADX WARN: Multi-variable type inference failed */
        public final void c() {
            ad adVar;
            o0O000Oo<CharSequence, Integer, o00OO00O<Integer, Integer>> o0o000oo;
            int i;
            aE aEVar;
            int i2;
            int iIntValue;
            int i3;
            int iIntValue2;
            int i4;
            z zVar;
            int i5;
            int i6;
            int i7;
            int i8;
            z zVar2;
            int i9;
            int i10;
            int i11;
            int i12 = 2 % 2;
            int i13 = a + 30;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            int i15 = i14 % 128;
            b = i15;
            int i16 = i14 % 2;
            int i17 = this.e;
            int i18 = 0;
            Object obj = null;
            if (i17 < 0) {
                int i19 = i15 | 69;
                int i20 = ((i19 << 1) - (~(-((~(i15 & 69)) & i19)))) - 1;
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    this.c = 1;
                } else {
                    this.c = 0;
                }
                this.g = null;
                return;
            }
            ad adVar2 = ad.this;
            int i21 = adVar2.e;
            if (i21 > 0) {
                int i22 = a;
                int i23 = i22 & 29;
                int i24 = (i22 | 29) & (~i23);
                int i25 = i23 << 1;
                int i26 = (i24 & i25) + (i24 | i25);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    this.f = 0;
                    i11 = 0;
                } else {
                    i11 = this.f - (-1);
                    this.f = i11;
                }
                if (i11 >= i21) {
                    z zVar3 = new z(this.d, B.ay(ad.this.c));
                    int i27 = b;
                    int i28 = i27 & 89;
                    int i29 = (((~i28) & (i27 | 89)) - (~(-(-(i28 << 1))))) - 1;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    this.g = zVar3;
                    this.e = -1;
                    int i31 = (-2) - ((((i27 | 68) << 1) - (i27 ^ 68)) ^ (-1));
                    a = i31 % 128;
                    int i32 = i31 % 2;
                } else if (i17 > adVar2.c.length()) {
                    z zVar4 = new z(this.d, B.ay(ad.this.c));
                    int i210 = b;
                    int i211 = i210 & 89;
                    int i212 = (((~i211) & (i210 | 89)) - (~(-(-(i211 << 1))))) - 1;
                    a = i212 % 128;
                    int i33 = i212 % 2;
                    this.g = zVar4;
                    this.e = -1;
                    int i34 = (-2) - ((((i210 | 68) << 1) - (i210 ^ 68)) ^ (-1));
                    a = i34 % 128;
                    int i35 = i34 % 2;
                } else {
                    adVar = ad.this;
                    o0o000oo = adVar.f;
                    int i36 = a;
                    int i37 = i36 ^ 61;
                    i = ((((i36 & 61) | i37) << 1) - (~(-i37))) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        CharSequence charSequence = adVar.c;
                        obj.hashCode();
                        throw null;
                    }
                    CharSequence charSequence2 = adVar.c;
                    int i38 = this.e;
                    int i39 = b;
                    int i40 = i39 & 3;
                    int i41 = (i40 - (~(-(-((i39 ^ 3) | i40))))) - 1;
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    aEVar = (aE) o0o000oo.b(charSequence2, Integer.valueOf(i38));
                    i2 = a;
                    int i43 = ((i2 ^ 57) - (~((i2 & 57) << 1))) - 1;
                    b = i43 % 128;
                    int i44 = i43 % 2;
                    if (aEVar == null) {
                        int i45 = i2 & 27;
                        int i46 = ((i2 ^ 27) | i45) << 1;
                        int i47 = -((i2 | 27) & (~i45));
                        int i48 = (i46 & i47) + (i46 | i47);
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        zVar2 = new z(this.d, B.ay(ad.this.c));
                        int i50 = b;
                        int i51 = i50 & 123;
                        i9 = (((i50 ^ 123) | i51) << 1) - ((i50 | 123) & (~i51));
                        i10 = i9 % 128;
                        a = i10;
                        if (i9 % 2 != 0) {
                            this.g = zVar2;
                            this.e = -1;
                            obj.hashCode();
                            throw null;
                        }
                        this.g = zVar2;
                        this.e = -1;
                        int i52 = ((i10 | 87) << 1) - (i10 ^ 87);
                        b = i52 % 128;
                        int i53 = i52 % 2;
                    } else {
                        iIntValue = ((Number) aEVar.c).intValue();
                        int i54 = b;
                        int i55 = i54 & 49;
                        int i56 = (i54 | 49) & (~i55);
                        int i57 = -(-(i55 << 1));
                        i3 = ((i56 | i57) << 1) - (i56 ^ i57);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            ((Number) aEVar.d).intValue();
                            throw null;
                        }
                        iIntValue2 = ((Number) aEVar.d).intValue();
                        i4 = this.d;
                        if (iIntValue <= Integer.MIN_VALUE) {
                            int i58 = a;
                            int i59 = (i58 & 39) + (i58 | 39);
                            b = i59 % 128;
                            int i60 = i59 % 2;
                            z zVar5 = z.g;
                            zVar = z.f;
                            int i61 = a;
                            int i62 = i61 & 85;
                            i8 = i62 + ((i61 ^ 85) | i62);
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i63 = 3 / 2;
                            }
                        } else {
                            int i64 = iIntValue ^ (-1);
                            z zVar6 = new z(i4, ((i64 | iIntValue) << 1) - i64);
                            int i65 = b + 59;
                            a = i65 % 128;
                            int i66 = i65 % 2;
                            zVar = zVar6;
                        }
                        this.g = zVar;
                        int i67 = -(-iIntValue2);
                        i5 = ((iIntValue & i67) - (~(-(-(iIntValue | i67))))) - 1;
                        int i68 = b;
                        i6 = (i68 ^ 113) + ((i68 & 113) << 1);
                        i7 = i6 % 128;
                        a = i7;
                        if (i6 % 2 == 0) {
                            this.d = i5;
                            int i69 = 1 / 0;
                            if (iIntValue2 == 0) {
                                int i70 = i7 & 31;
                                int i71 = i70 + ((i7 ^ 31) | i70);
                                int i72 = i71 % 128;
                                b = i72;
                                int i73 = i71 % 2;
                                int i74 = i72 & 49;
                                int i75 = (i74 - (~(-(-((i72 ^ 49) | i74))))) - 1;
                                a = i75 % 128;
                                int i76 = i75 % 2;
                                i18 = 1;
                            }
                        } else {
                            this.d = i5;
                            if (iIntValue2 == 0) {
                                int i77 = i7 & 31;
                                int i78 = i77 + ((i7 ^ 31) | i77);
                                int i79 = i78 % 128;
                                b = i79;
                                int i710 = i78 % 2;
                                int i711 = i79 & 49;
                                int i712 = (i711 - (~(-(-((i79 ^ 49) | i711))))) - 1;
                                a = i712 % 128;
                                int i713 = i712 % 2;
                                i18 = 1;
                            }
                        }
                        this.e = ((((~i18) & i5) | ((~i5) & i18)) - (~((i5 & i18) << 1))) - 1;
                        int i80 = b;
                        int i81 = (i80 & 105) + (i80 | 105);
                        a = i81 % 128;
                        int i82 = i81 % 2;
                    }
                }
            } else if (i17 > adVar2.c.length()) {
                z zVar7 = new z(this.d, B.ay(ad.this.c));
                int i213 = b;
                int i214 = i213 & 89;
                int i215 = (((~i214) & (i213 | 89)) - (~(-(-(i214 << 1))))) - 1;
                a = i215 % 128;
                int i310 = i215 % 2;
                this.g = zVar7;
                this.e = -1;
                int i311 = (-2) - ((((i213 | 68) << 1) - (i213 ^ 68)) ^ (-1));
                a = i311 % 128;
                int i312 = i311 % 2;
            } else {
                adVar = ad.this;
                o0o000oo = adVar.f;
                int i313 = a;
                int i314 = i313 ^ 61;
                i = ((((i313 & 61) | i314) << 1) - (~(-i314))) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    CharSequence charSequence3 = adVar.c;
                    obj.hashCode();
                    throw null;
                }
                CharSequence charSequence4 = adVar.c;
                int i315 = this.e;
                int i316 = b;
                int i410 = i316 & 3;
                int i411 = (i410 - (~(-(-((i316 ^ 3) | i410))))) - 1;
                a = i411 % 128;
                int i412 = i411 % 2;
                aEVar = (aE) o0o000oo.b(charSequence4, Integer.valueOf(i315));
                i2 = a;
                int i413 = ((i2 ^ 57) - (~((i2 & 57) << 1))) - 1;
                b = i413 % 128;
                int i414 = i413 % 2;
                if (aEVar == null) {
                    int i415 = i2 & 27;
                    int i416 = ((i2 ^ 27) | i415) << 1;
                    int i417 = -((i2 | 27) & (~i415));
                    int i418 = (i416 & i417) + (i416 | i417);
                    b = i418 % 128;
                    int i419 = i418 % 2;
                    zVar2 = new z(this.d, B.ay(ad.this.c));
                    int i510 = b;
                    int i511 = i510 & 123;
                    i9 = (((i510 ^ 123) | i511) << 1) - ((i510 | 123) & (~i511));
                    i10 = i9 % 128;
                    a = i10;
                    if (i9 % 2 != 0) {
                        this.g = zVar2;
                        this.e = -1;
                        obj.hashCode();
                        throw null;
                    }
                    this.g = zVar2;
                    this.e = -1;
                    int i512 = ((i10 | 87) << 1) - (i10 ^ 87);
                    b = i512 % 128;
                    int i513 = i512 % 2;
                } else {
                    iIntValue = ((Number) aEVar.c).intValue();
                    int i514 = b;
                    int i515 = i514 & 49;
                    int i516 = (i514 | 49) & (~i515);
                    int i517 = -(-(i515 << 1));
                    i3 = ((i516 | i517) << 1) - (i516 ^ i517);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        ((Number) aEVar.d).intValue();
                        throw null;
                    }
                    iIntValue2 = ((Number) aEVar.d).intValue();
                    i4 = this.d;
                    if (iIntValue <= Integer.MIN_VALUE) {
                        int i518 = a;
                        int i519 = (i518 & 39) + (i518 | 39);
                        b = i519 % 128;
                        int i610 = i519 % 2;
                        z zVar8 = z.g;
                        zVar = z.f;
                        int i611 = a;
                        int i612 = i611 & 85;
                        i8 = i612 + ((i611 ^ 85) | i612);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i613 = 3 / 2;
                        }
                    } else {
                        int i614 = iIntValue ^ (-1);
                        z zVar9 = new z(i4, ((i614 | iIntValue) << 1) - i614);
                        int i615 = b + 59;
                        a = i615 % 128;
                        int i616 = i615 % 2;
                        zVar = zVar9;
                    }
                    this.g = zVar;
                    int i617 = -(-iIntValue2);
                    i5 = ((iIntValue & i617) - (~(-(-(iIntValue | i617))))) - 1;
                    int i618 = b;
                    i6 = (i618 ^ 113) + ((i618 & 113) << 1);
                    i7 = i6 % 128;
                    a = i7;
                    if (i6 % 2 == 0) {
                        this.d = i5;
                        int i619 = 1 / 0;
                        if (iIntValue2 == 0) {
                            int i714 = i7 & 31;
                            int i715 = i714 + ((i7 ^ 31) | i714);
                            int i716 = i715 % 128;
                            b = i716;
                            int i717 = i715 % 2;
                            int i718 = i716 & 49;
                            int i719 = (i718 - (~(-(-((i716 ^ 49) | i718))))) - 1;
                            a = i719 % 128;
                            int i7110 = i719 % 2;
                            i18 = 1;
                        }
                    } else {
                        this.d = i5;
                        if (iIntValue2 == 0) {
                            int i7111 = i7 & 31;
                            int i7112 = i7111 + ((i7 ^ 31) | i7111);
                            int i7113 = i7112 % 128;
                            b = i7113;
                            int i7114 = i7112 % 2;
                            int i7115 = i7113 & 49;
                            int i7116 = (i7115 - (~(-(-((i7113 ^ 49) | i7115))))) - 1;
                            a = i7116 % 128;
                            int i7117 = i7116 % 2;
                            i18 = 1;
                        }
                    }
                    this.e = ((((~i18) & i5) | ((~i5) & i18)) - (~((i5 & i18) << 1))) - 1;
                    int i83 = b;
                    int i84 = (i83 & 105) + (i83 | 105);
                    a = i84 % 128;
                    int i85 = i84 % 2;
                }
            }
            this.c = 1;
            int i86 = a;
            int i87 = (i86 ^ 87) + ((i86 & 87) << 1);
            b = i87 % 128;
            int i88 = i87 % 2;
        }

        @Override // java.util.Iterator
        public final z next() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 43;
            int i4 = i2 | 43;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            if (this.c == -1) {
                int i8 = (i6 ^ 119) + ((i6 & 119) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                c();
                int i10 = a;
                int i11 = i10 | 37;
                int i12 = (i11 << 1) - ((~(i10 & 37)) & i11);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
            if (this.c == 0) {
                throw new NoSuchElementException();
            }
            int i14 = b;
            int i15 = i14 & 49;
            int i16 = ((((i14 ^ 49) | i15) << 1) - (~(-((i14 | 49) & (~i15))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            z zVar = this.g;
            r.e(zVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            int i18 = b;
            int i19 = i18 & 9;
            int i20 = i19 + ((i18 ^ 9) | i19);
            a = i20 % 128;
            Object obj = null;
            if (i20 % 2 != 0) {
                this.g = null;
                this.c = -1;
                return zVar;
            }
            this.g = null;
            this.c = -1;
            obj.hashCode();
            throw null;
        }

        public byH() {
            int i = ad.this.d;
            int length = ad.this.c.length();
            if (length < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot coerce value to an empty range: maximum ");
                int i2 = a;
                int i3 = i2 & 1;
                int i4 = (i2 | 1) & (~i3);
                int i5 = -(-(i3 << 1));
                int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                b = i6 % 128;
                int i7 = i6 % 2;
                sb.append(length);
                sb.append(" is less than minimum ");
                sb.append(0);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString());
            }
            if (i < 0) {
                int i8 = b;
                int i9 = i8 ^ 77;
                int i10 = -(-((i8 & 77) << 1));
                int i11 = (i9 & i10) + (i9 | i10);
                a = i11 % 128;
                int i12 = i11 % 2;
                int i13 = i8 ^ 83;
                int i14 = ((i8 & 83) | i13) << 1;
                int i15 = -i13;
                int i16 = (i14 & i15) + (i14 | i15);
                a = i16 % 128;
                int i17 = i16 % 2;
                int i18 = 2 % 2;
                i = 0;
            } else if (i > length) {
                int i19 = b + 45;
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 61 / 0;
                }
                int i21 = 2 % 2;
                i = length;
            }
            this.d = i;
            this.e = i;
            int i22 = a;
            int i23 = ((i22 | 119) << 1) - (i22 ^ 119);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
