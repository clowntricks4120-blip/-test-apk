package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q extends O implements Iterable {
    private static int a = 1;
    private static int b;
    public i[] c;

    public class bAH implements Enumeration {
        private static int a = 0;
        private static int b = 1;
        public int c = 0;

        public bAH() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            boolean z;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 119;
            int i4 = ((i2 | 119) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            if (this.c < Q.this.c.length) {
                int i6 = b;
                int i7 = i6 & 17;
                int i8 = i6 | 17;
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = (i6 & (-40)) | ((~i6) & 39);
                int i12 = -(-((i6 & 39) << 1));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 4;
                }
                z = true;
            } else {
                int i15 = b;
                int i16 = i15 & 109;
                int i17 = (i15 | 109) & (~i16);
                int i18 = i16 << 1;
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                a = i19 % 128;
                int i20 = i19 % 2;
                z = false;
            }
            int i21 = b;
            int i22 = ((i21 ^ 77) | (i21 & 77)) << 1;
            int i23 = -(((~i21) & 77) | (i21 & (-78)));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            a = i24 % 128;
            if (i24 % 2 == 0) {
                return z;
            }
            throw null;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = 2 % 2;
            int i2 = b + 39;
            a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.c;
            i[] iVarArr = Q.this.c;
            int i5 = b + 19;
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 != 0) {
                int length = iVarArr.length;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i4 >= iVarArr.length) {
                throw new NoSuchElementException();
            }
            int i7 = i4 ^ 1;
            int i8 = ((i4 & 1) | i7) << 1;
            int i9 = -i7;
            this.c = (i8 & i9) + (i9 | i8);
            i iVar = iVarArr[i4];
            int i10 = i6 ^ 51;
            int i11 = (i6 & 51) << 1;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            return iVar;
        }
    }

    public Q() {
        this.c = C0270p.c;
    }

    public Q(C0270p c0270p) {
        Objects.requireNonNull(c0270p, "'elementVector' cannot be null");
        this.c = c0270p.e();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a A[LOOP:0: B:3:0x0003->B:17:0x003a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[Catch: IOException -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0086, blocks: (B:22:0x0063, B:27:0x0088), top: B:53:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[Catch: IOException -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0086, blocks: (B:22:0x0063, B:27:0x0088), top: B:53:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if ((r2 instanceof ivas.gov.bisp.enumeration.p063ci.Q) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        if ((r2 instanceof ivas.gov.bisp.enumeration.p063ci.Q) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p063ci.Q.a;
        r3 = r6 & 115;
        r3 = (r3 - (~(-(-((r6 ^ 115) | r3))))) - 1;
        ivas.gov.bisp.enumeration.p063ci.Q.b = r3 % 128;
        r2 = (ivas.gov.bisp.enumeration.p063ci.Q) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if ((r3 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p063ci.Q o(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.Q.o(java.lang.Object):ivas.gov.bisp.enumeration.ci.Q");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b5 A[PHI: r6
  0x00b5: PHI (r6v10 ivas.gov.bisp.enumeration.ci.O) = (r6v5 ivas.gov.bisp.enumeration.ci.O), (r6v12 ivas.gov.bisp.enumeration.ci.O) binds: [B:21:0x00b3, B:18:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        O oF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 37;
        int i4 = ((i2 ^ 37) | i3) << 1;
        int i5 = -((i2 | 37) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (!(o2 instanceof Q)) {
            int i9 = ((i7 & 56) + (i7 | 56)) - 1;
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = ((i10 ^ 73) | (i10 & 73)) << 1;
            int i13 = -(((~i10) & 73) | (i10 & (-74)));
            int i14 = (i12 & i13) + (i12 | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        Q q = (Q) o2;
        int size = size();
        if (q.size() != size) {
            int i16 = b;
            int i17 = (i16 & 113) + (i16 | 113);
            a = i17 % 128;
            return i17 % 2 == 0;
        }
        int i18 = b;
        int i19 = ((i18 & 74) + (i18 | 74)) - 1;
        a = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 0;
        while (i21 < size) {
            int i22 = b;
            int i23 = i22 & 95;
            int i24 = ((i22 ^ 95) | i23) << 1;
            int i25 = -((i22 | 95) & (~i23));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            a = i26 % 128;
            int i27 = i26 % 2;
            O oF2 = this.c[i21].f();
            i[] iVarArr = q.c;
            int i28 = b;
            int i29 = (i28 ^ 107) + ((i28 & 107) << 1);
            a = i29 % 128;
            if (i29 % 2 == 0) {
                oF = iVarArr[i21].f();
                int i30 = 95 / 0;
                if (oF2 != oF) {
                    int i31 = a + 21;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    if (!oF2.h(oF)) {
                        int i33 = a;
                        int i34 = ((i33 ^ 80) + ((i33 & 80) << 1)) - 1;
                        b = i34 % 128;
                        int i35 = i34 % 2;
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                oF = iVarArr[i21].f();
                if (oF2 != oF) {
                    int i36 = a + 21;
                    b = i36 % 128;
                    int i37 = i36 % 2;
                    if (!oF2.h(oF)) {
                        int i38 = a;
                        int i39 = ((i38 ^ 80) + ((i38 & 80) << 1)) - 1;
                        b = i39 % 128;
                        int i310 = i39 % 2;
                        return false;
                    }
                } else {
                    continue;
                }
            }
            i21 = (((i21 | 50) << 1) - (i21 ^ 50)) - 49;
            int i40 = b;
            int i41 = ((i40 & (-118)) | ((~i40) & 117)) + ((i40 & 117) << 1);
            a = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = a;
        int i44 = ((i43 ^ 23) | (i43 & 23)) << 1;
        int i45 = -(((~i43) & 23) | (i43 & (-24)));
        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
        b = i46 % 128;
        int i47 = i46 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int length;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (((i4 ^ 119) | (i4 & 119)) << 1) - ((i4 & (-120)) | ((~i4) & 119));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            length = this.c.length;
            i = (length ^ 1) + ((length & 1) << 1);
        } else {
            length = this.c.length;
            i = ((((length ^ 1) | (length & 1)) << 1) - (~(-((length & (-2)) | ((~length) & 1))))) - 1;
        }
        int i6 = (i4 | 43) << 1;
        int i7 = -(((~i4) & 43) | (i4 & (-44)));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 3 % 5;
        }
        while (true) {
            length = (length << 1) + (~length);
            i2 = b;
            if (length < 0) {
                break;
            }
            int i10 = (i2 ^ 1) + ((i2 & 1) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i * 257;
            O oF = this.c[length].f();
            int i13 = a;
            int i14 = i13 & 41;
            int i15 = ((i13 | 41) & (~i14)) + (i14 << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            int iHashCode = oF.hashCode();
            i = (~(i12 & iHashCode)) & (iHashCode | i12);
            int i17 = b + 113;
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = i2 & 59;
        int i20 = ((((i2 ^ 59) | i19) << 1) - (~(-((i2 | 59) & (~i19))))) - 1;
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        int i = 2 % 2;
        j.bEM bem = new j.bEM(this.c);
        int i2 = b;
        int i3 = ((i2 | 52) << 1) - (i2 ^ 52);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        return bem;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 109;
        b = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        ar arVar = new ar(this.c, false);
        int i2 = a;
        int i3 = ((i2 ^ 49) | (i2 & 49)) << 1;
        int i4 = -(((~i2) & 49) | (i2 & (-50)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return arVar;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        ac acVar = new ac(this.c, false);
        int i2 = b;
        int i3 = (i2 & (-2)) | ((~i2) & 1);
        int i4 = -(-((i2 & 1) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        return acVar;
    }

    public Enumeration r() {
        int i = 2 % 2;
        bAH bah = new bAH();
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (i2 ^ 17) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        return bah;
    }

    public int size() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 71) << 1) - (i2 ^ 71);
        a = i3 % 128;
        int i4 = i3 % 2;
        i[] iVarArr = this.c;
        if (i4 != 0) {
            return iVarArr.length;
        }
        int length = iVarArr.length;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 78) + (i3 | 78)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int size = size();
        int i6 = 0;
        if (size == 0) {
            int i7 = b;
            int i8 = i7 + 81;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 89 / 0;
            }
            int i10 = ((((i7 ^ 55) | (i7 & 55)) << 1) - (~(-(((~i7) & 55) | (i7 & (-56)))))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i12 = b;
        int i13 = ((i12 & 126) + (i12 | 126)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        stringBuffer.append('[');
        int i15 = b;
        int i16 = i15 ^ 49;
        int i17 = (i15 & 49) << 1;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        while (true) {
            int i19 = i18 % 2;
            stringBuffer.append(this.c[i6]);
            i = a;
            int i20 = (i ^ 119) + ((i & 119) << 1);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                i6 += 120;
                if (i6 >= size) {
                    break;
                }
                stringBuffer.append(", ");
                int i21 = a;
                int i22 = i21 & 37;
                int i23 = ((i21 ^ 37) | i22) << 1;
                int i24 = -((i21 | 37) & (~i22));
                i18 = ((i23 | i24) << 1) - (i24 ^ i23);
                b = i18 % 128;
            } else {
                i6++;
                if (i6 >= size) {
                    break;
                }
                stringBuffer.append(", ");
                int i25 = a;
                int i26 = i25 & 37;
                int i27 = ((i25 ^ 37) | i26) << 1;
                int i28 = -((i25 | 37) & (~i26));
                i18 = ((i27 | i28) << 1) - (i28 ^ i27);
                b = i18 % 128;
            }
        }
        int i29 = i + 97;
        b = i29 % 128;
        int i30 = i29 % 2;
        stringBuffer.append(']');
        String string = stringBuffer.toString();
        int i31 = b;
        int i32 = i31 & 37;
        int i33 = -(-((i31 ^ 37) | i32));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        a = i34 % 128;
        int i35 = i34 % 2;
        return string;
    }

    public i u(int i) {
        i iVar;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 125;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            iVar = this.c[i];
            int i5 = 13 / 0;
        } else {
            iVar = this.c[i];
        }
        int i6 = i3 ^ 11;
        int i7 = (i3 & 11) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return iVar;
    }

    public i[] v() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 123) + (i2 | 123);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        i[] iVarArr = this.c;
        int i6 = i4 | 109;
        int i7 = ((i6 << 1) - (~(-((~(i4 & 109)) & i6)))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 92 / 0;
        }
        return iVarArr;
    }

    public Q(i[] iVarArr, boolean z) {
        if (z) {
            if (iVarArr.length <= 0) {
                int i = a;
                int i2 = (i & 115) + (i | 115);
                b = i2 % 128;
                int i3 = i2 % 2;
                iVarArr = C0270p.c;
                int i4 = b;
                int i5 = ((i4 & 90) + (i4 | 90)) - 1;
                a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } else {
                iVarArr = (i[]) iVarArr.clone();
                int i8 = b;
                int i9 = ((i8 | 83) << 1) - (i8 ^ 83);
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            }
        }
        this.c = iVarArr;
        int i12 = a;
        int i13 = i12 ^ 99;
        int i14 = (i12 & 99) << 1;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 79 / 0;
        }
    }
}
