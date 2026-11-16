package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.cJ.c;
import ivas.gov.bisp.enumeration.cQ.p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.ToString;

/* JADX INFO: loaded from: classes.dex */
public final class O extends p implements Serializable {
    private static int a = 1;
    private static int b;
    public static final Set<x> c;
    public final long d;
    public final h e;
    public transient int f;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        x xVar = x.c;
        int i = a;
        int i2 = ((i & (-26)) | ((~i) & 25)) + ((i & 25) << 1);
        b = i2 % 128;
        if (i2 % 2 != 0) {
            hashSet.add(xVar);
            hashSet.add(x.i);
            int i3 = 92 / 0;
        } else {
            hashSet.add(xVar);
            hashSet.add(x.i);
        }
        hashSet.add(x.h);
        x xVar2 = x.g;
        int i4 = a + 49;
        b = i4 % 128;
        int i5 = i4 % 2;
        hashSet.add(xVar2);
        hashSet.add(x.f);
        int i6 = b;
        int i7 = (i6 & (-92)) | ((~i6) & 91);
        int i8 = (i6 & 91) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        hashSet.add(x.e);
        x xVar3 = x.d;
        int i11 = b;
        int i12 = ((i11 & (-14)) | ((~i11) & 13)) + ((i11 & 13) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            hashSet.add(xVar3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hashSet.add(xVar3);
        int i13 = a + 97;
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O() {
        this(System.currentTimeMillis(), ivas.gov.bisp.enumeration.cR.N.bz());
        AtomicReference<Map<String, AbstractC0242a>> atomicReference = u.c;
    }

    @Override // ivas.gov.bisp.enumeration.cP.A
    public final h b() {
        int i = 2 % 2;
        int i2 = b + 51;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        h hVar = this.e;
        int i5 = i3 & 59;
        int i6 = i3 | 59;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return hVar;
    }

    @Override // ivas.gov.bisp.enumeration.cQ.p
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.f;
        if (iHashCode == 0) {
            iHashCode = super.hashCode();
            this.f = iHashCode;
            int i4 = a + 59;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = b;
        int i7 = i6 & 83;
        int i8 = (i6 | 83) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return iHashCode;
    }

    @Override // ivas.gov.bisp.enumeration.cP.A
    public final int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 55;
        int i4 = ((i2 ^ 55) | i3) << 1;
        int i5 = -((i2 | 55) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        return i6 % 2 != 0 ? 5 : 3;
    }

    @Override // ivas.gov.bisp.enumeration.cP.A
    public final int v(AbstractC0246t abstractC0246t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 76) + ((i2 & 76) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (abstractC0246t == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        int i5 = (i2 | 15) << 1;
        int i6 = -(i2 ^ 15);
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            h(abstractC0246t);
            throw null;
        }
        if (!h(abstractC0246t)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field '");
            sb.append(abstractC0246t);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
        P pC = abstractC0246t.c(this.e);
        long j = this.d;
        int i8 = a;
        int i9 = (i8 ^ 75) + ((i8 & 75) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return pC.f(j);
        }
        pC.f(j);
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.A
    public final int e(int i) {
        int iF;
        int iF2;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 61) | (i3 & 61)) << 1;
        int i5 = -(((~i3) & 61) | (i3 & (-62)));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (i == 0) {
            P pBd = this.e.bd();
            long j = this.d;
            int i8 = b;
            int i9 = i8 & 99;
            int i10 = (i9 - (~((i8 ^ 99) | i9))) - 1;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                iF = pBd.f(j);
                int i11 = 44 / 0;
            } else {
                iF = pBd.f(j);
            }
            int i12 = a;
            int i13 = ((i12 | 13) << 1) - (i12 ^ 13);
            b = i13 % 128;
            int i14 = i13 % 2;
            return iF;
        }
        int i15 = (i7 & 51) + (i7 | 51);
        a = i15 % 128;
        if (i15 % 2 != 0 ? i == 1 : i == 1) {
            P pAD = this.e.aD();
            long j2 = this.d;
            int i16 = b;
            int i17 = i16 ^ 93;
            int i18 = (i16 & 93) << 1;
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            int i20 = i19 % 2;
            int iF3 = pAD.f(j2);
            int i21 = a + 13;
            b = i21 % 128;
            int i22 = i21 % 2;
            return iF3;
        }
        if (i != 2) {
            throw new IndexOutOfBoundsException(j.o("Invalid index: ", i));
        }
        int i23 = i7 & 53;
        int i24 = i23 + ((i7 ^ 53) | i23);
        a = i24 % 128;
        int i25 = i24 % 2;
        P pX = this.e.x();
        long j3 = this.d;
        int i26 = a;
        int i27 = (-2) - ((((i26 | 4) << 1) - (i26 ^ 4)) ^ (-1));
        b = i27 % 128;
        if (i27 % 2 != 0) {
            iF2 = pX.f(j3);
            int i28 = 54 / 0;
        } else {
            iF2 = pX.f(j3);
        }
        int i29 = a;
        int i30 = i29 & 35;
        int i31 = (i29 ^ 35) | i30;
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        b = i32 % 128;
        if (i32 % 2 == 0) {
            return iF2;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.A
    public final boolean h(AbstractC0246t abstractC0246t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 39) << 1) - (i2 ^ 39);
        b = i3 % 128;
        int i4 = i3 % 2;
        if (abstractC0246t == null) {
            int i5 = i2 + 73;
            b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        x xVar = ((AbstractC0246t.bFe) abstractC0246t).B;
        HashSet hashSet = (HashSet) c;
        int i7 = a;
        int i8 = i7 ^ 67;
        int i9 = ((i7 & 67) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        if (!hashSet.contains(xVar)) {
            int i13 = b;
            int i14 = i13 & 125;
            int i15 = (i13 | 125) & (~i14);
            int i16 = i14 << 1;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            long jH = xVar.c(this.e).h();
            int i19 = a;
            int i20 = ((i19 & (-18)) | ((~i19) & 17)) + ((i19 & 17) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            long jH2 = this.e.z().h();
            int i22 = a;
            int i23 = i22 + 89;
            b = i23 % 128;
            if (i23 % 2 != 0) {
                throw null;
            }
            if (jH < jH2) {
                int i24 = i22 + 103;
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 23 / 0;
                }
                return false;
            }
        }
        boolean zX = abstractC0246t.c(this.e).x();
        int i26 = b;
        int i27 = i26 & 115;
        int i28 = (((i26 | 115) & (~i27)) - (~(i27 << 1))) - 1;
        a = i28 % 128;
        if (i28 % 2 != 0) {
            return zX;
        }
        throw null;
    }

    public O(long j, h hVar) {
        h hVarB = u.b(hVar);
        long jL = hVarB.ap().l(AbstractC0242a.c, j);
        h hVarBa = hVarB.ba();
        this.d = hVarBa.x().y(jL);
        this.e = hVarBa;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    @Override // ivas.gov.bisp.enumeration.cQ.p
    public final boolean equals(Object obj) {
        boolean z;
        O o2;
        h hVar;
        h hVar2;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (-2) - ((((i5 | 20) << 1) - (i5 ^ 20)) ^ (-1));
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            if (this != obj) {
                z = false;
                if (obj instanceof O) {
                    int i8 = ((i5 | 51) << 1) - (i5 ^ 51);
                    int i9 = i8 % 128;
                    b = i9;
                    int i10 = i8 % 2;
                    o2 = (O) obj;
                    hVar = this.e;
                    hVar2 = o2.e;
                    int i11 = i9 | 9;
                    int i12 = i11 << 1;
                    int i13 = -((~(i9 & 9)) & i11);
                    int i14 = (i12 & i13) + (i13 | i12);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    if (hVar.equals(hVar2)) {
                        int i16 = b;
                        i = ((i16 | 25) << 1) - (i16 ^ 25);
                        i2 = i % 128;
                        a = i2;
                        if (i % 2 != 0) {
                            long j = o2.d;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (this.d != o2.d) {
                            int i17 = ((i2 ^ 63) | (i2 & 63)) << 1;
                            int i18 = -(((~i2) & 63) | (i2 & (-64)));
                            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                            b = i19 % 128;
                            int i20 = i19 % 2;
                            z = false;
                        }
                        int i21 = b;
                        int i22 = i21 & 57;
                        int i23 = -(-((i21 ^ 57) | i22));
                        i3 = ((i22 | i23) << 1) - (i23 ^ i22);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i24 = 36 / 0;
                        }
                        return z;
                    }
                }
                boolean zEquals = super.equals(obj);
                int i25 = a;
                int i26 = i25 & 1;
                int i27 = (((i25 | 1) & (~i26)) - (~(i26 << 1))) - 1;
                b = i27 % 128;
                int i28 = i27 % 2;
                return zEquals;
            }
            int i29 = i7 & 13;
            int i30 = -(-((i7 ^ 13) | i29));
            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
            a = i31 % 128;
            int i32 = i31 % 2;
            return true;
        }
        if (this != obj) {
            z = true;
            if (obj instanceof O) {
                int i33 = ((i5 | 51) << 1) - (i5 ^ 51);
                int i34 = i33 % 128;
                b = i34;
                int i110 = i33 % 2;
                o2 = (O) obj;
                hVar = this.e;
                hVar2 = o2.e;
                int i111 = i34 | 9;
                int i112 = i111 << 1;
                int i113 = -((~(i34 & 9)) & i111);
                int i114 = (i112 & i113) + (i113 | i112);
                a = i114 % 128;
                int i115 = i114 % 2;
                if (hVar.equals(hVar2)) {
                    int i116 = b;
                    i = ((i116 | 25) << 1) - (i116 ^ 25);
                    i2 = i % 128;
                    a = i2;
                    if (i % 2 != 0) {
                        long j2 = o2.d;
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (this.d != o2.d) {
                        int i117 = ((i2 ^ 63) | (i2 & 63)) << 1;
                        int i118 = -(((~i2) & 63) | (i2 & (-64)));
                        int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                        b = i119 % 128;
                        int i210 = i119 % 2;
                        z = false;
                    }
                    int i211 = b;
                    int i212 = i211 & 57;
                    int i213 = -(-((i211 ^ 57) | i212));
                    i3 = ((i212 | i213) << 1) - (i213 ^ i212);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i214 = 36 / 0;
                    }
                    return z;
                }
            }
            boolean zEquals2 = super.equals(obj);
            int i215 = a;
            int i216 = i215 & 1;
            int i217 = (((i215 | 1) & (~i216)) - (~(i216 << 1))) - 1;
            b = i217 % 128;
            int i218 = i217 % 2;
            return zEquals2;
        }
        int i219 = i7 & 13;
        int i35 = -(-((i7 ^ 13) | i219));
        int i36 = (i219 ^ i35) + ((i219 & i35) << 1);
        a = i36 % 128;
        int i37 = i36 % 2;
        return true;
    }

    @ToString
    public final String toString() {
        int i = 2 % 2;
        c cVar = ivas.gov.bisp.enumeration.cJ.P.q;
        StringBuilder sb = new StringBuilder(cVar.i().p());
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = (((i2 | 107) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        try {
            cVar.i().f(sb, this, cVar.e);
            int i6 = b + 75;
            a = i6 % 128;
            int i7 = i6 % 2;
        } catch (IOException unused) {
        }
        String string = sb.toString();
        int i8 = b;
        int i9 = (((i8 | 34) << 1) - (i8 ^ 34)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:30:0x0108  */
    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:42:0x0174  */
    /* JADX WARN: Code duplicated, block: B:44:0x0188  */
    /* JADX WARN: Code duplicated, block: B:46:0x019b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0205  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3 A[SYNTHETIC] */
    @Override // java.lang.Comparable
    public final int compareTo(A a2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = i8 & 7;
        int i10 = -(-((i8 ^ 7) | i9));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        A a3 = a2;
        int i14 = 0;
        if (this == a3) {
            int i15 = i12 ^ 69;
            int i16 = ((i12 & 69) | i15) << 1;
            int i17 = -i15;
            int i18 = (i16 & i17) + (i17 | i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = (i12 & 118) + (i12 | 118);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
        } else {
            Object obj = null;
            if (a3 instanceof O) {
                int i23 = ((i8 | 55) << 1) - (i8 ^ 55);
                int i24 = i23 % 128;
                a = i24;
                int i25 = i23 % 2;
                O o2 = (O) a3;
                h hVar = this.e;
                h hVar2 = o2.e;
                int i26 = i24 + 51;
                b = i26 % 128;
                int i27 = i26 % 2;
                if (hVar.equals(hVar2)) {
                    int i28 = b;
                    int i29 = i28 | 59;
                    int i30 = i29 << 1;
                    int i31 = -((~(i28 & 59)) & i29);
                    int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                    int i33 = i32 % 128;
                    a = i33;
                    if (i32 % 2 == 0) {
                        long j = o2.d;
                        obj.hashCode();
                        throw null;
                    }
                    long j2 = this.d;
                    long j3 = o2.d;
                    if (j2 < j3) {
                        int i34 = a;
                        int i35 = ((i34 | 13) << 1) - (i34 ^ 13);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        i14 = -1;
                    } else if (j2 == j3) {
                        int i37 = (i33 & 32) + (i33 | 32);
                        int i38 = (i37 ^ (-1)) + (i37 << 1);
                        int i39 = i38 % 128;
                        b = i39;
                        i14 = (i38 % 2 == 0 ? 1 : 0) ^ 1;
                        int i40 = i39 & 29;
                        int i41 = -(-((i39 ^ 29) | i40));
                        int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                        a = i42 % 128;
                        int i43 = i42 % 2;
                    } else {
                        int i44 = a;
                        int i45 = i44 & 109;
                        i6 = (i45 - (~((i44 ^ 109) | i45))) - 1;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i46 = 5 % 5;
                        }
                        i14 = 1;
                    }
                } else if (this == a3) {
                    int i47 = b;
                    int i48 = i47 + 107;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    int i50 = i47 & 117;
                    int i51 = ((((i47 ^ 117) | i50) << 1) - (~(-((i47 | 117) & (~i50))))) - 1;
                    a = i51 % 128;
                    int i52 = i51 % 2;
                } else {
                    if (3 == a3.size()) {
                        throw new ClassCastException("ReadablePartial objects must have matching field types");
                    }
                    int i53 = a;
                    int i54 = i53 & 33;
                    int i55 = i54 + ((i53 ^ 33) | i54);
                    b = i55 % 128;
                    int i56 = i55 % 2;
                    int i57 = ((i53 & 114) + (i53 | 114)) - 1;
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    i = 0;
                    while (i < 3) {
                        int i59 = a;
                        int i60 = i59 & 13;
                        i4 = (((i59 | 13) & (~i60)) - (~(-(-(i60 << 1))))) - 1;
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            n(i);
                            a3.n(i);
                            obj.hashCode();
                            throw null;
                        }
                        if (n(i) == a3.n(i)) {
                            throw new ClassCastException("ReadablePartial objects must have matching field types");
                        }
                        int i61 = a;
                        int i62 = i61 & 93;
                        int i63 = -(-((i61 ^ 93) | i62));
                        i5 = (i62 ^ i63) + ((i63 & i62) << 1);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i64 = ((i ^ 29) | (i & 29)) << 1;
                            int i65 = -(((~i) & 29) | (i & (-30)));
                            i = ((i64 | i65) << 1) - (i65 ^ i64);
                        } else {
                            int i66 = i | 126;
                            int i67 = (i66 << 1) - ((~(i & 126)) & i66);
                            int i68 = i67 & (-125);
                            i = (i68 - (~((i67 ^ (-125)) | i68))) - 1;
                        }
                    }
                    int i69 = b;
                    int i70 = (((i69 | 25) << 1) - (~(-(((~i69) & 25) | (i69 & (-26)))))) - 1;
                    a = i70 % 128;
                    int i71 = i70 % 2;
                    i2 = 0;
                    while (true) {
                        if (i2 < 3) {
                            int i72 = a + 75;
                            b = i72 % 128;
                            int i73 = i72 % 2;
                            if (e(i2) <= a3.e(i2)) {
                                int i74 = b;
                                i3 = ((i74 & (-70)) | ((~i74) & 69)) + ((i74 & 69) << 1);
                                a = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i75 = 21 / 0;
                                    if (e(i2) >= a3.e(i2)) {
                                        i2 = (((i2 | 1) << 1) - (~(-(((~i2) & 1) | (i2 & (-2)))))) - 1;
                                        int i76 = a;
                                        int i77 = i76 ^ 25;
                                        int i78 = ((i76 & 25) | i77) << 1;
                                        int i79 = -i77;
                                        int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                                        b = i80 % 128;
                                        int i81 = i80 % 2;
                                    } else {
                                        int i310 = a;
                                        int i311 = ((i310 | 13) << 1) - (i310 ^ 13);
                                        b = i311 % 128;
                                        int i312 = i311 % 2;
                                        i14 = -1;
                                    }
                                } else if (e(i2) >= a3.e(i2)) {
                                    i2 = (((i2 | 1) << 1) - (~(-(((~i2) & 1) | (i2 & (-2)))))) - 1;
                                    int i710 = a;
                                    int i711 = i710 ^ 25;
                                    int i712 = ((i710 & 25) | i711) << 1;
                                    int i713 = -i711;
                                    int i82 = ((i712 | i713) << 1) - (i712 ^ i713);
                                    b = i82 % 128;
                                    int i83 = i82 % 2;
                                } else {
                                    int i313 = a;
                                    int i314 = ((i313 | 13) << 1) - (i313 ^ 13);
                                    b = i314 % 128;
                                    int i315 = i314 % 2;
                                    i14 = -1;
                                }
                            } else {
                                int i410 = a;
                                int i411 = i410 & 109;
                                i6 = (i411 - (~((i410 ^ 109) | i411))) - 1;
                                b = i6 % 128;
                                if (i6 % 2 != 0) {
                                    int i412 = 5 % 5;
                                }
                                i14 = 1;
                            }
                        }
                    }
                }
            } else if (this == a3) {
                int i413 = b;
                int i414 = i413 + 107;
                a = i414 % 128;
                int i415 = i414 % 2;
                int i510 = i413 & 117;
                int i511 = ((((i413 ^ 117) | i510) << 1) - (~(-((i413 | 117) & (~i510))))) - 1;
                a = i511 % 128;
                int i512 = i511 % 2;
            } else {
                if (3 == a3.size()) {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
                int i513 = a;
                int i514 = i513 & 33;
                int i515 = i514 + ((i513 ^ 33) | i514);
                b = i515 % 128;
                int i516 = i515 % 2;
                int i517 = ((i513 & 114) + (i513 | 114)) - 1;
                b = i517 % 128;
                int i518 = i517 % 2;
                i = 0;
                while (i < 3) {
                    int i519 = a;
                    int i610 = i519 & 13;
                    i4 = (((i519 | 13) & (~i610)) - (~(-(-(i610 << 1))))) - 1;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        n(i);
                        a3.n(i);
                        obj.hashCode();
                        throw null;
                    }
                    if (n(i) == a3.n(i)) {
                        throw new ClassCastException("ReadablePartial objects must have matching field types");
                    }
                    int i611 = a;
                    int i612 = i611 & 93;
                    int i613 = -(-((i611 ^ 93) | i612));
                    i5 = (i612 ^ i613) + ((i613 & i612) << 1);
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i614 = ((i ^ 29) | (i & 29)) << 1;
                        int i615 = -(((~i) & 29) | (i & (-30)));
                        i = ((i614 | i615) << 1) - (i615 ^ i614);
                    } else {
                        int i616 = i | 126;
                        int i617 = (i616 << 1) - ((~(i & 126)) & i616);
                        int i618 = i617 & (-125);
                        i = (i618 - (~((i617 ^ (-125)) | i618))) - 1;
                    }
                }
                int i619 = b;
                int i714 = (((i619 | 25) << 1) - (~(-(((~i619) & 25) | (i619 & (-26)))))) - 1;
                a = i714 % 128;
                int i715 = i714 % 2;
                i2 = 0;
                while (true) {
                    if (i2 < 3) {
                        int i716 = a + 75;
                        b = i716 % 128;
                        int i717 = i716 % 2;
                        if (e(i2) <= a3.e(i2)) {
                            int i718 = b;
                            i3 = ((i718 & (-70)) | ((~i718) & 69)) + ((i718 & 69) << 1);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i719 = 21 / 0;
                                if (e(i2) >= a3.e(i2)) {
                                    i2 = (((i2 | 1) << 1) - (~(-(((~i2) & 1) | (i2 & (-2)))))) - 1;
                                    int i7110 = a;
                                    int i7111 = i7110 ^ 25;
                                    int i7112 = ((i7110 & 25) | i7111) << 1;
                                    int i7113 = -i7111;
                                    int i84 = ((i7112 | i7113) << 1) - (i7112 ^ i7113);
                                    b = i84 % 128;
                                    int i85 = i84 % 2;
                                } else {
                                    int i316 = a;
                                    int i317 = ((i316 | 13) << 1) - (i316 ^ 13);
                                    b = i317 % 128;
                                    int i318 = i317 % 2;
                                    i14 = -1;
                                }
                            } else if (e(i2) >= a3.e(i2)) {
                                i2 = (((i2 | 1) << 1) - (~(-(((~i2) & 1) | (i2 & (-2)))))) - 1;
                                int i7114 = a;
                                int i7115 = i7114 ^ 25;
                                int i7116 = ((i7114 & 25) | i7115) << 1;
                                int i7117 = -i7115;
                                int i86 = ((i7116 | i7117) << 1) - (i7116 ^ i7117);
                                b = i86 % 128;
                                int i87 = i86 % 2;
                            } else {
                                int i319 = a;
                                int i3110 = ((i319 | 13) << 1) - (i319 ^ 13);
                                b = i3110 % 128;
                                int i3111 = i3110 % 2;
                                i14 = -1;
                            }
                        } else {
                            int i416 = a;
                            int i417 = i416 & 109;
                            i6 = (i417 - (~((i416 ^ 109) | i417))) - 1;
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i418 = 5 % 5;
                            }
                            i14 = 1;
                        }
                    }
                }
            }
        }
        int i88 = b;
        int i89 = ((i88 | 73) << 1) - (i88 ^ 73);
        a = i89 % 128;
        int i90 = i89 % 2;
        return i14;
    }
}
