package ivas.gov.bisp.enumeration.bU;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i implements Iterable<Integer> {
    private static int a = 1;
    private static int b;
    public final int c;
    public final int d;
    public final int e;

    public i(int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        int i5 = a;
        int i6 = (((i5 | 58) << 1) - (i5 ^ 58)) - 1;
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.c = i;
        if (i3 > 0) {
            int i9 = i7 ^ 97;
            int i10 = (i7 & 97) << 1;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            int i12 = i11 % 128;
            a = i12;
            int i13 = i11 % 2;
            if (i < i2) {
                int i14 = (i12 ^ 74) + ((i12 & 74) << 1);
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
                int iN = ivas.gov.bisp.enumeration.O.i.n(i2, i3);
                int i17 = -ivas.gov.bisp.enumeration.O.i.n(i, i3);
                int i18 = ((iN ^ i17) | (iN & i17)) << 1;
                int i19 = -((i17 & (~iN)) | ((~i17) & iN));
                int iN2 = ivas.gov.bisp.enumeration.O.i.n((i18 & i19) + (i19 | i18), i3);
                int i20 = b;
                int i21 = i20 + 111;
                a = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = -(~(-iN2));
                    i4 = ((i2 ^ i22) + ((i22 & i2) << 1)) - 1;
                } else {
                    int i23 = -iN2;
                    i4 = ((i2 | i23) << 1) - (i23 ^ i2);
                }
                i2 = i4;
                int i24 = (i20 ^ 67) + ((i20 & 67) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 2 % 2;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            int i27 = i5 & 3;
            int i28 = (i5 | 3) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            b = i30 % 128;
            if (i30 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i > i2) {
                int i31 = -i3;
                int iN3 = ivas.gov.bisp.enumeration.O.i.n(i, i31);
                int iN4 = ivas.gov.bisp.enumeration.O.i.n(i2, i31);
                int i32 = b;
                int i33 = ((i32 & (-22)) | ((~i32) & 21)) + ((i32 & 21) << 1);
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    i2 %= ivas.gov.bisp.enumeration.O.i.n(iN3 >> iN4, i31);
                } else {
                    int iN5 = ivas.gov.bisp.enumeration.O.i.n((iN3 - (~(-iN4))) - 1, i31);
                    int i34 = i2 ^ iN5;
                    int i35 = (iN5 & i2) << 1;
                    i2 = (i34 ^ i35) + ((i35 & i34) << 1);
                }
                int i36 = 2 % 2;
            }
        }
        this.d = i2;
        this.e = i3;
        int i37 = a + 67;
        b = i37 % 128;
        if (i37 % 2 != 0) {
            int i38 = 88 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 30) + ((i2 & 30) << 1);
        int i4 = -1;
        int i5 = i3 - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
            if (isEmpty()) {
                int i7 = b;
                int i8 = (i7 & 35) + (i7 | 35);
                a = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = this.c * 31;
                int i11 = this.d;
                int i12 = b;
                int i13 = i12 & 9;
                int i14 = -(-(i12 | 9));
                int i15 = (i13 & i14) + (i14 | i13);
                int i16 = i15 % 128;
                a = i16;
                int i17 = i15 % 2;
                int i18 = -(-i11);
                int i19 = (((i10 | i18) << 1) - (i10 ^ i18)) * 31;
                int i20 = this.e;
                i4 = ((i20 & i19) << 1) + (i19 ^ i20);
                int i21 = i16 ^ 67;
                int i22 = ((i16 & 67) | i21) << 1;
                int i23 = -i21;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                int i25 = i24 % 2;
            }
        } else if (isEmpty()) {
            int i26 = b;
            int i27 = (i26 & 35) + (i26 | 35);
            a = i27 % 128;
            int i28 = i27 % 2;
        } else {
            int i110 = this.c * 31;
            int i111 = this.d;
            int i112 = b;
            int i113 = i112 & 9;
            int i114 = -(-(i112 | 9));
            int i115 = (i113 & i114) + (i114 | i113);
            int i116 = i115 % 128;
            a = i116;
            int i117 = i115 % 2;
            int i118 = -(-i111);
            int i119 = (((i110 | i118) << 1) - (i110 ^ i118)) * 31;
            int i29 = this.e;
            i4 = ((i29 & i119) << 1) + (i119 ^ i29);
            int i210 = i116 ^ 67;
            int i211 = ((i116 & 67) | i210) << 1;
            int i212 = -i210;
            int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
            b = i213 % 128;
            int i214 = i213 % 2;
        }
        int i30 = a;
        int i31 = (((i30 | 74) << 1) - (i30 ^ 74)) - 1;
        b = i31 % 128;
        int i32 = i31 % 2;
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    public boolean isEmpty() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 110) + ((i2 & 110) << 1)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this.e > 0) {
            int i5 = (i2 & 17) + (i2 | 17);
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (this.c > this.d) {
                int i7 = (i6 & (-96)) | ((~i6) & 95);
                int i8 = (i6 & 95) << 1;
                int i9 = (i7 & i8) + (i7 | i8);
                b = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                int i11 = i2 + 3;
                a = i11 % 128;
                int i12 = i11 % 2;
                z = false;
            }
        } else if (this.c >= this.d) {
            int i13 = i2 + 3;
            a = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        } else {
            z = true;
        }
        int i15 = b;
        int i16 = (i15 ^ 75) + ((i15 & 75) << 1);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        int i = 2 % 2;
        p pVar = new p(this.c, this.d, this.e);
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = (i2 | 57) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        return pVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0068  */
    /* JADX WARN: Code duplicated, block: B:16:0x007e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public String toString() {
        StringBuilder sb;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = ((i7 ^ 120) + ((i7 & 120) << 1)) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 19 / 0;
            if (this.e > 0) {
                sb = new StringBuilder();
                int i10 = this.c;
                int i11 = b;
                int i12 = i11 & 31;
                int i13 = ((((i11 ^ 31) | i12) << 1) - (~(-((i11 | 31) & (~i12))))) - 1;
                a = i13 % 128;
                i = i13 % 2;
                sb.append(i10);
                sb.append("..");
                if (i != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                sb.append(this.d);
                sb.append(" step ");
                int i14 = a;
                int i15 = i14 & 71;
                int i16 = (i14 ^ 71) | i15;
                int i17 = (i15 & i16) + (i15 | i16);
                b = i17 % 128;
                i2 = i17 % 2;
                i3 = this.e;
                if (i2 != 0) {
                    int i18 = 77 / 0;
                }
                int i19 = i14 ^ 55;
                int i20 = (i14 & 55) << 1;
                i4 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i4 % 128;
            } else {
                sb = new StringBuilder();
                int i21 = this.c;
                int i22 = b + 9;
                a = i22 % 128;
                i5 = i22 % 2;
                sb.append(i21);
                sb.append(" downTo ");
                if (i5 == 0) {
                    int i23 = 67 / 0;
                }
                sb.append(this.d);
                sb.append(" step ");
                int i24 = a;
                int i25 = i24 & 29;
                int i26 = (((i24 ^ 29) | i25) << 1) - ((i24 | 29) & (~i25));
                int i27 = i26 % 128;
                b = i27;
                int i28 = i26 % 2;
                i3 = -this.e;
                int i29 = ((i27 ^ 15) | (i27 & 15)) << 1;
                int i30 = -(((~i27) & 15) | (i27 & (-16)));
                i4 = ((i29 | i30) << 1) - (i30 ^ i29);
                a = i4 % 128;
            }
        } else if (this.e > 0) {
            sb = new StringBuilder();
            int i110 = this.c;
            int i111 = b;
            int i112 = i111 & 31;
            int i113 = ((((i111 ^ 31) | i112) << 1) - (~(-((i111 | 31) & (~i112))))) - 1;
            a = i113 % 128;
            i = i113 % 2;
            sb.append(i110);
            sb.append("..");
            if (i != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            sb.append(this.d);
            sb.append(" step ");
            int i114 = a;
            int i115 = i114 & 71;
            int i116 = (i114 ^ 71) | i115;
            int i117 = (i115 & i116) + (i115 | i116);
            b = i117 % 128;
            i2 = i117 % 2;
            i3 = this.e;
            if (i2 != 0) {
                int i118 = 77 / 0;
            }
            int i119 = i114 ^ 55;
            int i210 = (i114 & 55) << 1;
            i4 = ((i119 | i210) << 1) - (i210 ^ i119);
            b = i4 % 128;
        } else {
            sb = new StringBuilder();
            int i211 = this.c;
            int i212 = b + 9;
            a = i212 % 128;
            i5 = i212 % 2;
            sb.append(i211);
            sb.append(" downTo ");
            if (i5 == 0) {
                int i213 = 67 / 0;
            }
            sb.append(this.d);
            sb.append(" step ");
            int i214 = a;
            int i215 = i214 & 29;
            int i216 = (((i214 ^ 29) | i215) << 1) - ((i214 | 29) & (~i215));
            int i217 = i216 % 128;
            b = i217;
            int i218 = i216 % 2;
            i3 = -this.e;
            int i219 = ((i217 ^ 15) | (i217 & 15)) << 1;
            int i31 = -(((~i217) & 15) | (i217 & (-16)));
            i4 = ((i219 | i31) << 1) - (i31 ^ i219);
            a = i4 % 128;
        }
        int i32 = i4 % 2;
        sb.append(i3);
        String string = sb.toString();
        int i33 = b;
        int i34 = (-2) - ((((i33 | 116) << 1) - (i33 ^ 116)) ^ (-1));
        a = i34 % 128;
        int i35 = i34 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    public boolean equals(Object obj) {
        i iVar;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 39;
        int i6 = -(-(i4 | 39));
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        boolean z = false;
        if (obj instanceof i) {
            int i9 = (i4 ^ 49) + ((i4 & 49) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            if (isEmpty()) {
                int i11 = a;
                int i12 = i11 & 107;
                int i13 = i12 + ((i11 ^ 107) | i12);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    ((i) obj).isEmpty();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!((i) obj).isEmpty()) {
                    iVar = (i) obj;
                    if (this.c == iVar.c) {
                        int i14 = b;
                        int i15 = i14 & 11;
                        int i16 = i15 + ((i14 ^ 11) | i15);
                        a = i16 % 128;
                        i = i16 % 2;
                        i2 = this.d;
                        if (i == 0) {
                            int i17 = 21 / 0;
                            if (i2 == iVar.d) {
                                if (this.e == iVar.e) {
                                }
                            }
                        } else if (i2 == iVar.d) {
                            if (this.e == iVar.e) {
                            }
                        }
                    }
                    int i18 = b;
                    int i19 = i18 & 21;
                    int i20 = i19 + ((i18 ^ 21) | i19);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                }
                int i22 = a;
                int i23 = (((i22 ^ 3) | (i22 & 3)) << 1) - (((~i22) & 3) | (i22 & (-4)));
                b = i23 % 128;
                int i24 = i23 % 2;
                z = true;
            } else {
                iVar = (i) obj;
                if (this.c == iVar.c) {
                    int i110 = b;
                    int i111 = i110 & 11;
                    int i112 = i111 + ((i110 ^ 11) | i111);
                    a = i112 % 128;
                    i = i112 % 2;
                    i2 = this.d;
                    if (i == 0) {
                        int i113 = 21 / 0;
                        if (i2 == iVar.d) {
                            if (this.e == iVar.e) {
                                int i25 = a;
                                int i26 = (((i25 ^ 3) | (i25 & 3)) << 1) - (((~i25) & 3) | (i25 & (-4)));
                                b = i26 % 128;
                                int i27 = i26 % 2;
                                z = true;
                            }
                        }
                    } else if (i2 == iVar.d) {
                        if (this.e == iVar.e) {
                            int i28 = a;
                            int i29 = (((i28 ^ 3) | (i28 & 3)) << 1) - (((~i28) & 3) | (i28 & (-4)));
                            b = i29 % 128;
                            int i210 = i29 % 2;
                            z = true;
                        }
                    }
                }
                int i114 = b;
                int i115 = i114 & 21;
                int i211 = i115 + ((i114 ^ 21) | i115);
                a = i211 % 128;
                int i212 = i211 % 2;
            }
        } else {
            int i116 = b;
            int i117 = i116 & 21;
            int i213 = i117 + ((i116 ^ 21) | i117);
            a = i213 % 128;
            int i214 = i213 % 2;
        }
        int i30 = b;
        int i31 = ((i30 & (-86)) | ((~i30) & 85)) + ((i30 & 85) << 1);
        a = i31 % 128;
        int i32 = i31 % 2;
        return z;
    }
}
