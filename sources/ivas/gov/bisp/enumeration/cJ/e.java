package ivas.gov.bisp.enumeration.cJ;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public final ivas.gov.bisp.enumeration.p096p.h d;
    public final long e;
    public final Locale f;
    public final int g;
    public Integer h;
    public AbstractC0242a i;
    public Integer j;
    public bDJ[] k;
    public boolean l;
    public Object m;

    public class bDK {
        public final AbstractC0242a a;
        public final Integer b;
        public final bDJ[] c;
        public final int d;

        public bDK() {
            this.a = e.this.i;
            this.b = e.this.h;
            this.c = e.this.k;
            this.d = e.this.c;
        }
    }

    public e(long j, ivas.gov.bisp.enumeration.p096p.h hVar, Locale locale, Integer num, int i) {
        ivas.gov.bisp.enumeration.p096p.h hVarB = ivas.gov.bisp.enumeration.cP.u.b(hVar);
        this.e = j;
        AbstractC0242a abstractC0242aAp = hVarB.ap();
        this.d = hVarB.ba();
        if (locale == null) {
            locale = Locale.getDefault();
            int i2 = b;
            int i3 = ((i2 ^ 65) | (i2 & 65)) << 1;
            int i4 = -(((~i2) & 65) | (i2 & (-66)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.f = locale;
        this.g = i;
        int i8 = a;
        int i9 = i8 + 81;
        b = i9 % 128;
        int i10 = i9 % 2;
        this.i = abstractC0242aAp;
        this.j = num;
        bDJ[] bdjArr = new bDJ[8];
        int i11 = ((i8 & (-90)) | ((~i8) & 89)) + ((i8 & 89) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            this.k = bdjArr;
        } else {
            this.k = bdjArr;
            int i12 = 30 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    public static int c(ivas.gov.bisp.enumeration.cP.J j, ivas.gov.bisp.enumeration.cP.J j2) {
        int i;
        int i2 = 2 % 2;
        int i3 = a + 67;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (j != null) {
            int i6 = (i4 & 89) + (i4 | 89);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (j.j()) {
                int i8 = b;
                int i9 = i8 & 87;
                int i10 = (i9 - (~((i8 ^ 87) | i9))) - 1;
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 58 / 0;
                    if (j2 != null) {
                        int i12 = i8 & 107;
                        int i13 = (i8 | 107) & (~i12);
                        int i14 = -(-(i12 << 1));
                        i = (i13 & i14) + (i14 | i13);
                        a = i % 128;
                        if (i % 2 == 0) {
                            j2.j();
                            throw null;
                        }
                        if (j2.j()) {
                            int i15 = -j.compareTo(j2);
                            int i16 = a;
                            int i17 = (((i16 ^ 53) | (i16 & 53)) << 1) - (((~i16) & 53) | (i16 & (-54)));
                            b = i17 % 128;
                            int i18 = i17 % 2;
                            return i15;
                        }
                    }
                } else if (j2 != null) {
                    int i19 = i8 & 107;
                    int i110 = (i8 | 107) & (~i19);
                    int i111 = -(-(i19 << 1));
                    i = (i110 & i111) + (i111 | i110);
                    a = i % 128;
                    if (i % 2 == 0) {
                        j2.j();
                        throw null;
                    }
                    if (j2.j()) {
                        int i112 = -j.compareTo(j2);
                        int i113 = a;
                        int i114 = (((i113 ^ 53) | (i113 & 53)) << 1) - (((~i113) & 53) | (i113 & (-54)));
                        b = i114 % 128;
                        int i115 = i114 % 2;
                        return i112;
                    }
                }
                int i20 = a + 31;
                b = i20 % 128;
                int i21 = i20 % 2;
                return 1;
            }
        }
        if (j2 != null) {
            int i22 = b;
            int i23 = i22 & 29;
            int i24 = -(-((i22 ^ 29) | i23));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            a = i25 % 128;
            if (i25 % 2 != 0) {
                j2.j();
                obj.hashCode();
                throw null;
            }
            if (j2.j()) {
                int i26 = b;
                int i27 = ((i26 ^ 40) + ((i26 & 40) << 1)) - 1;
                a = i27 % 128;
                int i28 = i27 % 2;
                int i29 = i26 & 117;
                int i30 = i29 + ((i26 ^ 117) | i29);
                a = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 44 / 0;
                }
                return -1;
            }
        }
        int i32 = b;
        int i33 = i32 ^ 17;
        int i34 = ((i32 & 17) | i33) << 1;
        int i35 = -i33;
        int i36 = (i34 & i35) + (i34 | i35);
        a = i36 % 128;
        if (i36 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public void h(AbstractC0246t abstractC0246t, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 43) + ((i3 & 43) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        bDJ bdjE = e();
        ivas.gov.bisp.enumeration.cP.P pC = abstractC0246t.c(this.d);
        int i6 = b;
        int i7 = i6 & 65;
        int i8 = i7 + ((i6 ^ 65) | i7);
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            bdjE.c = pC;
            bdjE.d = i;
            obj.hashCode();
            throw null;
        }
        bdjE.c = pC;
        bdjE.d = i;
        bdjE.e = null;
        bdjE.f = null;
        int i9 = b;
        int i10 = ((i9 ^ 29) | (i9 & 29)) << 1;
        int i11 = -(((~i9) & 29) | (i9 & (-30)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void g(Integer num) {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 18) ^ (-1));
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.m = null;
        this.h = num;
        int i5 = i3 + 25;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static class bDJ implements Comparable<bDJ> {
        private static int a = 1;
        private static int b;
        public ivas.gov.bisp.enumeration.cP.P c;
        public int d;
        public String e;
        public Locale f;

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(bDJ bdj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 58) + (i2 | 58);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            int iC = c(bdj);
            int i6 = a;
            int i7 = i6 & 33;
            int i8 = i7 + ((i6 ^ 33) | i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return iC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public long d(long j, boolean z) {
            long jC;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 51) - (~(i2 | 51))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            String str = this.e;
            if (str == null) {
                int i5 = (i2 ^ 13) + ((i2 & 13) << 1);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    this.c.B(j, this.d);
                    throw null;
                }
                jC = this.c.B(j, this.d);
            } else {
                jC = this.c.C(j, str, this.f);
                int i6 = b;
                int i7 = i6 & 103;
                int i8 = -(-((i6 ^ 103) | i7));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
            }
            if (z) {
                int i11 = a;
                int i12 = (-2) - (((i11 & 60) + (i11 | 60)) ^ (-1));
                b = i12 % 128;
                int i13 = i12 % 2;
                jC = this.c.y(jC);
                int i14 = b;
                int i15 = ((i14 | 75) << 1) - (((~i14) & 75) | (i14 & (-76)));
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = a;
            int i18 = ((i17 ^ 93) | (i17 & 93)) << 1;
            int i19 = -(((~i17) & 93) | (i17 & (-94)));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 93 / 0;
            }
            return jC;
        }

        public int c(bDJ bdj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 43;
            int i4 = -(-((i2 ^ 43) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                ivas.gov.bisp.enumeration.cP.P p = bdj.c;
                this.c.s();
                throw null;
            }
            ivas.gov.bisp.enumeration.cP.P p2 = bdj.c;
            ivas.gov.bisp.enumeration.cP.J jS = this.c.s();
            int i6 = b;
            int i7 = i6 & 55;
            int i8 = ((i6 ^ 55) | i7) << 1;
            int i9 = -((i6 | 55) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                e.c(jS, p2.s());
                throw null;
            }
            int iC = e.c(jS, p2.s());
            if (iC != 0) {
                int i11 = b;
                int i12 = (i11 ^ 11) + ((i11 & 11) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                return iC;
            }
            ivas.gov.bisp.enumeration.cP.J jM = this.c.m();
            ivas.gov.bisp.enumeration.cP.J jM2 = p2.m();
            int i14 = a;
            int i15 = (i14 ^ 41) + ((i14 & 41) << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                e.c(jM, jM2);
                obj.hashCode();
                throw null;
            }
            int iC2 = e.c(jM, jM2);
            int i16 = a;
            int i17 = i16 ^ 85;
            int i18 = ((i16 & 85) | i17) << 1;
            int i19 = -i17;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            b = i20 % 128;
            int i21 = i20 % 2;
            return iC2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r2 r6
  0x0026: PHI (r2v5 ivas.gov.bisp.enumeration.cJ.e$bDJ[]) = (r2v4 ivas.gov.bisp.enumeration.cJ.e$bDJ[]), (r2v31 ivas.gov.bisp.enumeration.cJ.e$bDJ[]) binds: [B:8:0x0024, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r6v1 int) = (r6v0 int), (r6v4 int) binds: [B:8:0x0024, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public final bDJ e() {
        bDJ[] bdjArr;
        int i;
        bDJ bdj;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 | 89) << 1) - (i5 ^ 89);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0) {
            bdjArr = this.k;
            i = this.c;
            if (i != bdjArr.length) {
                if (this.l) {
                }
            }
            this.m = null;
            bdj = bdjArr[i];
            int i8 = b;
            i2 = ((i8 | 7) << 1) - (i8 ^ 7);
            a = i2 % 128;
            if (i2 % 2 != 0) {
                int i9 = 52 / 0;
                if (bdj == null) {
                    bdj = new bDJ();
                    bdjArr[i] = bdj;
                    int i10 = b;
                    int i11 = ((i10 & 117) - (~(-(-(i10 | 117))))) - 1;
                    a = i11 % 128;
                    int i12 = i11 % 2;
                }
            } else if (bdj == null) {
                bdj = new bDJ();
                bdjArr[i] = bdj;
                int i13 = b;
                int i14 = ((i13 & 117) - (~(-(-(i13 | 117))))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = (i & (-2)) | ((~i) & 1);
            int i17 = -(-((i & 1) << 1));
            this.c = ((i16 | i17) << 1) - (i16 ^ i17);
            int i18 = b;
            int i19 = (i18 ^ 96) + ((i18 & 96) << 1);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            return bdj;
        }
        bdjArr = this.k;
        i = this.c;
        int i22 = 59 / 0;
        if (i != bdjArr.length) {
            if (this.l) {
            }
        }
        this.m = null;
        bdj = bdjArr[i];
        int i23 = b;
        i2 = ((i23 | 7) << 1) - (i23 ^ 7);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            int i24 = 52 / 0;
            if (bdj == null) {
                bdj = new bDJ();
                bdjArr[i] = bdj;
                int i110 = b;
                int i111 = ((i110 & 117) - (~(-(-(i110 | 117))))) - 1;
                a = i111 % 128;
                int i112 = i111 % 2;
            }
        } else if (bdj == null) {
            bdj = new bDJ();
            bdjArr[i] = bdj;
            int i113 = b;
            int i114 = ((i113 & 117) - (~(-(-(i113 | 117))))) - 1;
            a = i114 % 128;
            int i115 = i114 % 2;
        }
        int i116 = (i & (-2)) | ((~i) & 1);
        int i117 = -(-((i & 1) << 1));
        this.c = ((i116 | i117) << 1) - (i116 ^ i117);
        int i118 = b;
        int i119 = (i118 ^ 96) + ((i118 & 96) << 1);
        int i25 = (i119 ^ (-1)) + (i119 << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
        return bdj;
        if (i == bdjArr.length) {
            int i27 = ((i7 & 41) - (~(i7 | 41))) - 1;
            b = i27 % 128;
            i3 = i27 % 2 == 0 ? i % 3 : i * 2;
        } else {
            int length = bdjArr.length;
            int i28 = i5 & 73;
            int i29 = (i5 ^ 73) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            a = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 3 % 4;
            }
            i3 = length;
        }
        bDJ[] bdjArr2 = new bDJ[i3];
        System.arraycopy(bdjArr, 0, bdjArr2, 0, i);
        int i32 = b;
        int i33 = (((i32 & (-96)) | ((~i32) & 95)) - (~((i32 & 95) << 1))) - 1;
        int i34 = i33 % 128;
        a = i34;
        int i35 = i33 % 2;
        this.k = bdjArr2;
        this.l = false;
        int i36 = (i34 & 45) + (i34 | 45);
        b = i36 % 128;
        int i37 = i36 % 2;
        bdjArr = bdjArr2;
        this.m = null;
        bdj = bdjArr[i];
        int i210 = b;
        i2 = ((i210 | 7) << 1) - (i210 ^ 7);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            int i211 = 52 / 0;
            if (bdj == null) {
                bdj = new bDJ();
                bdjArr[i] = bdj;
                int i1110 = b;
                int i1111 = ((i1110 & 117) - (~(-(-(i1110 | 117))))) - 1;
                a = i1111 % 128;
                int i1112 = i1111 % 2;
            }
        } else if (bdj == null) {
            bdj = new bDJ();
            bdjArr[i] = bdj;
            int i1113 = b;
            int i1114 = ((i1113 & 117) - (~(-(-(i1113 | 117))))) - 1;
            a = i1114 % 128;
            int i1115 = i1114 % 2;
        }
        int i1116 = (i & (-2)) | ((~i) & 1);
        int i1117 = -(-((i & 1) << 1));
        this.c = ((i1116 | i1117) << 1) - (i1116 ^ i1117);
        int i1118 = b;
        int i1119 = (i1118 ^ 96) + ((i1118 & 96) << 1);
        int i212 = (i1119 ^ (-1)) + (i1119 << 1);
        a = i212 % 128;
        int i213 = i212 % 2;
        return bdj;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
    public boolean f(Object obj) {
        int i;
        bDK bdk;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & (-46)) | ((~i5) & 45);
        int i7 = -(-((i5 & 45) << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 25 / 0;
            if (!(!(obj instanceof bDK))) {
                i = ((i5 ^ 44) + ((i5 & 44) << 1)) - 1;
                b = i % 128;
                if (i % 2 != 0) {
                    e eVar = e.this;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                bdk = (bDK) obj;
                if (this != e.this) {
                    this.i = bdk.a;
                    Integer num = bdk.b;
                    int i10 = b;
                    int i11 = i10 & 125;
                    int i12 = -(-(i10 | 125));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    this.h = num;
                    this.k = bdk.c;
                    int i15 = a + 29;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    i2 = bdk.d;
                    if (i2 < this.c) {
                        int i17 = b;
                        int i18 = i17 & 37;
                        int i19 = (~i18) & (i17 | 37);
                        int i20 = -(-(i18 << 1));
                        i3 = (i19 & i20) + (i20 | i19);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.l = false;
                        } else {
                            this.l = true;
                        }
                        int i21 = ((i17 ^ 77) | (i17 & 77)) << 1;
                        int i22 = -(((~i17) & 77) | (i17 & (-78)));
                        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                        a = i23 % 128;
                        int i24 = i23 % 2;
                    }
                    this.c = i2;
                    int i25 = a;
                    int i26 = (i25 & (-24)) | ((~i25) & 23);
                    int i27 = (i25 & 23) << 1;
                    int i28 = (i26 & i27) + (i26 | i27);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = i25 + 11;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    this.m = obj;
                    return true;
                }
                int i32 = a;
                int i33 = (i32 & 33) + (i32 | 33);
                int i34 = i33 % 128;
                b = i34;
                int i35 = i33 % 2;
                int i36 = i34 + 33;
                a = i36 % 128;
                int i37 = i36 % 2;
            }
        } else if (obj instanceof bDK) {
            i = ((i5 ^ 44) + ((i5 & 44) << 1)) - 1;
            b = i % 128;
            if (i % 2 != 0) {
                e eVar2 = e.this;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            bdk = (bDK) obj;
            if (this != e.this) {
                this.i = bdk.a;
                Integer num2 = bdk.b;
                int i110 = b;
                int i111 = i110 & 125;
                int i112 = -(-(i110 | 125));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                a = i113 % 128;
                int i114 = i113 % 2;
                this.h = num2;
                this.k = bdk.c;
                int i115 = a + 29;
                b = i115 % 128;
                int i116 = i115 % 2;
                i2 = bdk.d;
                if (i2 < this.c) {
                    int i117 = b;
                    int i118 = i117 & 37;
                    int i119 = (~i118) & (i117 | 37);
                    int i210 = -(-(i118 << 1));
                    i3 = (i119 & i210) + (i210 | i119);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        this.l = false;
                    } else {
                        this.l = true;
                    }
                    int i211 = ((i117 ^ 77) | (i117 & 77)) << 1;
                    int i212 = -(((~i117) & 77) | (i117 & (-78)));
                    int i213 = ((i211 | i212) << 1) - (i211 ^ i212);
                    a = i213 % 128;
                    int i214 = i213 % 2;
                }
                this.c = i2;
                int i215 = a;
                int i216 = (i215 & (-24)) | ((~i215) & 23);
                int i217 = (i215 & 23) << 1;
                int i218 = (i216 & i217) + (i216 | i217);
                b = i218 % 128;
                int i219 = i218 % 2;
                int i38 = i215 + 11;
                b = i38 % 128;
                int i39 = i38 % 2;
                this.m = obj;
                return true;
            }
            int i310 = a;
            int i311 = (i310 & 33) + (i310 | 33);
            int i312 = i311 % 128;
            b = i312;
            int i313 = i311 % 2;
            int i314 = i312 + 33;
            a = i314 % 128;
            int i315 = i314 % 2;
        }
        int i40 = a;
        int i41 = (-2) - (((i40 & 18) + (i40 | 18)) ^ (-1));
        b = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = 92 / 0;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x028e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0292  */
    /* JADX WARN: Code duplicated, block: B:79:0x02af A[Catch: o00O0O -> 0x023b, TRY_ENTER, TryCatch #1 {o00O0O -> 0x023b, blocks: (B:55:0x021b, B:66:0x0272, B:68:0x027d, B:79:0x02af, B:90:0x02f5, B:82:0x02b6, B:74:0x0284), top: B:145:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b6 A[Catch: o00O0O -> 0x023b, TRY_LEAVE, TryCatch #1 {o00O0O -> 0x023b, blocks: (B:55:0x021b, B:66:0x0272, B:68:0x027d, B:79:0x02af, B:90:0x02f5, B:82:0x02b6, B:74:0x0284), top: B:145:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:85:0x02c4 A[PHI: r14
  0x02c4: PHI (r14v16 ivas.gov.bisp.enumeration.cJ.e$bDJ) = (r14v9 ivas.gov.bisp.enumeration.cJ.e$bDJ), (r14v17 ivas.gov.bisp.enumeration.cJ.e$bDJ) binds: [B:84:0x02c2, B:81:0x02b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x02db A[PHI: r14
  0x02db: PHI (r14v10 ivas.gov.bisp.enumeration.cJ.e$bDJ) = (r14v9 ivas.gov.bisp.enumeration.cJ.e$bDJ), (r14v17 ivas.gov.bisp.enumeration.cJ.e$bDJ) binds: [B:84:0x02c2, B:80:0x02b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f2  */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0436, code lost:
    
        if (r0 != r19.i.n(r9)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x043f, code lost:
    
        if (r0 != r19.i.n(r9)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0441, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("Illegal instant due to time zone offset transition (");
        r0.append(r19.i);
        r5 = ivas.gov.bisp.enumeration.cJ.e.a + 111;
        ivas.gov.bisp.enumeration.cJ.e.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0455, code lost:
    
        if ((r5 % 2) != 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0457, code lost:
    
        r0.append('K');
        r0 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0461, code lost:
    
        r0.append(')');
        r0 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x046a, code lost:
    
        r5 = ivas.gov.bisp.enumeration.cJ.e.b;
        r6 = (((r5 | 83) << 1) - (~(-(r5 ^ 83)))) - 1;
        ivas.gov.bisp.enumeration.cJ.e.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x047a, code lost:
    
        if (r21 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x047c, code lost:
    
        r5 = new java.lang.StringBuilder();
        r6 = ivas.gov.bisp.enumeration.cJ.e.a;
        r9 = r6 & 5;
        r8 = ((r6 ^ 5) | r9) << 1;
        r4 = -((5 | r6) & (~r9));
        r6 = ((r8 | r4) << 1) - (r4 ^ r8);
        ivas.gov.bisp.enumeration.cJ.e.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0497, code lost:
    
        if ((r6 % 2) != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0499, code lost:
    
        r5.append("Cannot parse \"");
        r5.append((java.lang.Object) r21);
        r2 = 10 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04a4, code lost:
    
        r5.append("Cannot parse \"");
        r5.append((java.lang.Object) r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04aa, code lost:
    
        r5.append("\": ");
        r5.append(r0);
        r0 = ivas.gov.bisp.enumeration.cJ.e.a;
        r2 = r0 ^ 71;
        r0 = ((r0 & 71) | r2) << 1;
        r2 = -r2;
        r4 = (r0 ^ r2) + ((r0 & r2) << 1);
        ivas.gov.bisp.enumeration.cJ.e.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04c5, code lost:
    
        if ((r4 % 2) != 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04c7, code lost:
    
        r0 = r5.toString();
        r2 = 93 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04d0, code lost:
    
        r0 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04d9, code lost:
    
        throw new ivas.gov.bisp.enumeration.cP.N(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long d(boolean r20, java.lang.CharSequence r21) {
        /*
            Method dump skipped, instruction units count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.e.d(boolean, java.lang.CharSequence):long");
    }
}
