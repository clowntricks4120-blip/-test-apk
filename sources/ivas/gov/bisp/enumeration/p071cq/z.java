package ivas.gov.bisp.enumeration.p071cq;

import ivas.gov.bisp.enumeration.cO.c;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.p101x.P;
import ivas.gov.bisp.enumeration.p101x.i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class z implements P, i {
    private static int a = 0;
    private static int b = 1;
    public static long[] c = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    public long[] d;
    public byte[] e;
    public int f;
    public int g;
    public boolean h;
    public int i;

    static {
        int i = ((1 ^ 9) | (1 & 9)) << 1;
        int i2 = -((9 & (~1)) | (1 & (-10)));
        int i3 = (i & i2) + (i | i2);
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = i2 | 37;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        StringBuilder sbW = j.w("SHAKE");
        sbW.append(this.i);
        int i7 = b;
        int i8 = (i7 & 23) + (i7 | 23);
        a = i8 % 128;
        int i9 = i8 % 2;
        String string = sbW.toString();
        int i10 = b + 11;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 15;
        int i4 = ((i3 << 1) - (~(-((~(i2 & 15)) & i3)))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.i / 8;
        int i8 = i5 + 57;
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v23 int, still in use, count: 2, list:
          (r2v23 int) from 0x0019: ARITH (r2v23 int) >>> (13 int) A[WRAPPED]
          (r2v23 int) from 0x0024: PHI (r2 I:??) = (r2v4 int), (r2v23 int) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // ivas.gov.bisp.enumeration.p101x.i
    public void e(byte r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p071cq.z.b
            r2 = r1 & (-92)
            int r3 = ~r1
            r3 = r3 & 91
            r2 = r2 | r3
            r3 = r1 & 91
            r4 = 1
            int r3 = r3 << r4
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p071cq.z.a = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L1e
            int r2 = r6.g
            int r3 = r2 >>> 13
            if (r3 != 0) goto La5
            goto L24
        L1e:
            int r2 = r6.g
            int r3 = r2 % 8
            if (r3 != 0) goto La5
        L24:
            boolean r3 = r6.h
            if (r3 != 0) goto L9d
            int r3 = r1 + 4
            r5 = r3 ^ (-1)
            int r3 = r3 << r4
            int r5 = r5 + r3
            int r3 = r5 % 128
            ivas.gov.bisp.enumeration.p071cq.z.a = r3
            int r5 = r5 % r0
            byte[] r3 = r6.e
            int r5 = r2 >>> 3
            r3[r5] = r7
            r7 = r2 ^ 8
            r2 = r2 & 8
            int r2 = r2 << r4
            int r7 = r7 + r2
            r2 = r1 & 121(0x79, float:1.7E-43)
            r5 = r1 | 121(0x79, float:1.7E-43)
            int r2 = r2 + r5
            int r5 = r2 % 128
            ivas.gov.bisp.enumeration.p071cq.z.a = r5
            int r2 = r2 % r0
            r6.g = r7
            int r2 = r6.f
            if (r7 != r2) goto L87
            r7 = r1 & 39
            r1 = r1 ^ 39
            r1 = r1 | r7
            int r1 = -r1
            int r1 = -r1
            r2 = r7 ^ r1
            r7 = r7 & r1
            int r7 = r7 << r4
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.p071cq.z.a = r7
            int r2 = r2 % r0
            r7 = 0
            if (r2 == 0) goto L69
            r6.n(r3, r4)
            r6.g = r7
            goto L6e
        L69:
            r6.n(r3, r7)
            r6.g = r7
        L6e:
            int r7 = ivas.gov.bisp.enumeration.p071cq.z.b
            r1 = r7 & 65
            int r2 = ~r1
            r7 = r7 | 65
            r7 = r7 & r2
            int r1 = r1 << r4
            int r1 = -r1
            int r1 = -r1
            r2 = r7 ^ r1
            r7 = r7 & r1
            int r7 = r7 << r4
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.p071cq.z.a = r7
            int r2 = r2 % r0
            if (r2 == 0) goto L87
            r7 = 3
            int r7 = r7 % r0
        L87:
            int r7 = ivas.gov.bisp.enumeration.p071cq.z.a
            r1 = r7 & 21
            int r2 = ~r1
            r7 = r7 | 21
            r7 = r7 & r2
            int r1 = r1 << r4
            int r1 = -r1
            int r1 = -r1
            r2 = r7 ^ r1
            r7 = r7 & r1
            int r7 = r7 << r4
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.p071cq.z.b = r7
            int r2 = r2 % r0
            return
        L9d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "attempt to absorb while squeezing"
            r7.<init>(r0)
            throw r7
        La5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "attempt to absorb with odd length queue"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p071cq.z.e(byte):void");
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public void f(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = (-2) - (((i9 & 10) + (i9 | 10)) ^ (-1));
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = this.g;
        if (i12 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        int i13 = (-2) - ((((i9 | 66) << 1) - (i9 ^ 66)) ^ (-1));
        a = i13 % 128;
        int i14 = i13 % 2;
        if (!(!this.h)) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i15 = i9 | 67;
        int i16 = ((i15 << 1) - (~(-((~(i9 & 67)) & i15)))) - 1;
        int i17 = i16 % 128;
        a = i17;
        int i18 = i16 % 2;
        int i19 = i12 >>> 3;
        int i20 = this.f >>> 3;
        int i21 = (-2) - (((i17 & 122) + (i17 | 122)) ^ (-1));
        int i22 = i21 % 128;
        b = i22;
        int i23 = i21 % 2;
        int i24 = -i19;
        int i25 = i20 & i24;
        int i26 = (i24 | i20) & (~i25);
        int i27 = i25 << 1;
        int i28 = (i26 & i27) + (i26 | i27);
        if (i2 < i28) {
            int i29 = i17 & 15;
            int i30 = (i17 ^ 15) | i29;
            int i31 = (i29 & i30) + (i30 | i29);
            b = i31 % 128;
            int i32 = i31 % 2;
            System.arraycopy(bArr, i, this.e, i19, i2);
            int i33 = this.g;
            int i34 = b;
            int i35 = i34 & 17;
            int i36 = (i35 - (~((i34 ^ 17) | i35))) - 1;
            int i37 = i36 % 128;
            a = i37;
            if (i36 % 2 != 0) {
                i6 = i33 / (i2 / 3);
            } else {
                int i38 = i2 << 3;
                i6 = ((i33 | i38) << 1) - (i33 ^ i38);
            }
            int i39 = i37 & 99;
            int i40 = (i37 ^ 99) | i39;
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            b = i41 % 128;
            int i42 = i41 % 2;
        } else {
            if (i19 > 0) {
                int i43 = i17 & 111;
                int i44 = ((i17 ^ 111) | i43) << 1;
                int i45 = -((i17 | 111) & (~i43));
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                b = i46 % 128;
                int i47 = i46 % 2;
                byte[] bArr2 = this.e;
                if (i47 == 0) {
                    System.arraycopy(bArr, i, bArr2, i19, i28);
                    i7 = 1;
                } else {
                    System.arraycopy(bArr, i, bArr2, i19, i28);
                    i7 = 0;
                }
                int i48 = a;
                int i49 = ((i48 ^ 9) | (i48 & 9)) << 1;
                int i50 = -(((~i48) & 9) | (i48 & (-10)));
                int i51 = (i49 & i50) + (i50 | i49);
                b = i51 % 128;
                int i52 = i51 % 2;
                int i53 = i28 & i7;
                int i54 = -(-((i7 ^ i28) | i53));
                i3 = ((i53 | i54) << 1) - (i54 ^ i53);
                n(this.e, 0);
                int i55 = b + 1;
                a = i55 % 128;
                int i56 = i55 % 2;
            } else {
                int i57 = i22 & 23;
                int i58 = ((~i57) & (i22 | 23)) + (i57 << 1);
                a = i58 % 128;
                int i59 = i58 % 2;
                i3 = 0;
            }
            while (true) {
                i4 = -i3;
                int i60 = i2 ^ i4;
                int i61 = ((i2 & i4) | i60) << 1;
                int i62 = -i60;
                i5 = ((i61 | i62) << 1) - (i62 ^ i61);
                if (i5 < i20) {
                    break;
                }
                int i63 = a;
                int i64 = (((i63 ^ 87) | (i63 & 87)) << 1) - (((~i63) & 87) | (i63 & (-88)));
                b = i64 % 128;
                int i65 = i64 % 2;
                int i66 = i & i3;
                n(bArr, i66 + ((i ^ i3) | i66));
                int i67 = b;
                int i68 = i67 & 3;
                int i69 = ((~i68) & (i67 | 3)) + (i68 << 1);
                a = i69 % 128;
                int i70 = i69 % 2;
                int i71 = i3 & i20;
                int i72 = (i3 ^ i20) | i71;
                i3 = (i71 ^ i72) + ((i71 & i72) << 1);
                int i73 = (((i67 ^ 117) | (i67 & 117)) << 1) - (((~i67) & 117) | (i67 & (-118)));
                a = i73 % 128;
                int i74 = i73 % 2;
            }
            int i75 = -i4;
            int i76 = i ^ i75;
            System.arraycopy(bArr, (((i & i75) | i76) << 1) - i76, this.e, 0, i5);
            int i77 = a;
            int i78 = i77 & 63;
            int i79 = (i77 ^ 63) | i78;
            int i80 = (i78 & i79) + (i78 | i79);
            b = i80 % 128;
            int i81 = i80 % 2;
            int i82 = i5 << 3;
            int i83 = i77 + 43;
            b = i83 % 128;
            if (i83 % 2 == 0) {
                int i84 = 4 % 2;
            }
            i6 = i82;
        }
        this.g = i6;
        int i85 = b;
        int i86 = (i85 ^ 117) + ((i85 & 117) << 1);
        a = i86 % 128;
        if (i86 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void g() {
        long[] jArr;
        char c2;
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        char c3;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        char c4;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 93;
        int i6 = 1;
        int i7 = ((((i4 ^ 93) | i5) << 1) - (~(-((i4 | 93) & (~i5))))) - 1;
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 != 0) {
            jArr = this.d;
            j = jArr[1];
            i = 1;
            c2 = 4;
            j2 = j;
        } else {
            jArr = this.d;
            long j11 = jArr[0];
            c2 = 2;
            i = 0;
            j = jArr[1];
            j2 = j11;
        }
        long j12 = jArr[c2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        int i9 = (-2) - ((((i8 | 46) << 1) - (i8 ^ 46)) ^ (-1));
        b = i9 % 128;
        char c5 = '=';
        if (i9 % 2 == 0) {
            j3 = jArr[33];
            j4 = jArr[69];
            j5 = jArr[61];
            c3 = 'P';
        } else {
            j3 = jArr[6];
            j4 = jArr[7];
            j5 = jArr[8];
            c3 = '\t';
        }
        long j16 = jArr[c3];
        long j17 = jArr[10];
        long j18 = jArr[11];
        long j19 = jArr[12];
        int i10 = i8 & 91;
        int i11 = (((~i10) & (i8 | 91)) - (~(-(-(i10 << 1))))) - 1;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            j6 = jArr[69];
            j7 = jArr[124];
            j8 = jArr[103];
        } else {
            j6 = jArr[13];
            j7 = jArr[14];
            j8 = jArr[15];
        }
        long j20 = jArr[16];
        long j21 = jArr[17];
        long j22 = jArr[18];
        int i12 = i8 + 103;
        int i13 = i12 % 128;
        b = i13;
        int i14 = i12 % 2;
        long j23 = jArr[19];
        long j24 = jArr[20];
        long j25 = jArr[21];
        long j26 = jArr[22];
        int i15 = i13 | 121;
        int i16 = i15 << 1;
        int i17 = -((~(i13 & 121)) & i15);
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        a = i18 % 128;
        int i19 = 24;
        if (i18 % 2 != 0) {
            j9 = jArr[114];
            j10 = j18;
        } else {
            j9 = jArr[23];
            j10 = jArr[24];
        }
        while (i < i19) {
            int i20 = b;
            int i21 = (((i20 ^ 119) | (i20 & 119)) << 1) - ((i20 & (-120)) | ((~i20) & 119));
            int i22 = i21 % 128;
            a = i22;
            int i23 = i21 % i2;
            long j27 = (((j2 ^ j15) ^ j17) ^ j8) ^ j24;
            long j28 = (((j ^ j3) ^ j18) ^ j20) ^ j25;
            long j29 = (((j12 ^ j4) ^ j19) ^ j21) ^ j26;
            long j30 = (((j13 ^ j5) ^ j6) ^ j22) ^ j9;
            long j31 = (((j14 ^ j16) ^ j7) ^ j23) ^ j10;
            long j32 = ((j28 << i6) | (j28 >>> (-1))) ^ j31;
            long j33 = ((j29 << i6) | (j29 >>> (-1))) ^ j27;
            long j34 = ((j30 << i6) | (j30 >>> (-1))) ^ j28;
            int i24 = (i22 ^ 99) + ((i22 & 99) << i6);
            int i25 = i24 % 128;
            b = i25;
            int i26 = i24 % i2;
            long j35 = ((j31 << i6) | (j31 >>> (-1))) ^ j29;
            long j36 = ((j27 << i6) | (j27 >>> (-1))) ^ j30;
            long j37 = j2 ^ j32;
            long j38 = j15 ^ j32;
            long j39 = j17 ^ j32;
            long j40 = j8 ^ j32;
            long j41 = j24 ^ j32;
            long j42 = j ^ j33;
            long j43 = j3 ^ j33;
            long j44 = j18 ^ j33;
            long j45 = j20 ^ j33;
            long j46 = j25 ^ j33;
            long j47 = j12 ^ j34;
            long j48 = j4 ^ j34;
            long j49 = j19 ^ j34;
            long j50 = j21 ^ j34;
            int i27 = i25 ^ 7;
            int i28 = (i25 & 7) << 1;
            int i29 = (i27 ^ i28) + ((i27 & i28) << i6);
            a = i29 % 128;
            int i30 = i29 % i2;
            long j51 = j26 ^ j34;
            long j52 = j13 ^ j35;
            long j53 = j5 ^ j35;
            long j54 = j6 ^ j35;
            long j55 = j22 ^ j35;
            long j56 = j9 ^ j35;
            long j57 = j14 ^ j36;
            long j58 = j16 ^ j36;
            long j59 = j7 ^ j36;
            long j60 = j23 ^ j36;
            long j61 = j10 ^ j36;
            long j62 = (j42 << i6) | (j42 >>> 63);
            long j63 = (j43 << 44) | (j43 >>> 20);
            int i31 = i;
            long j64 = (j58 << 20) | (j58 >>> 44);
            long j65 = (j51 << c5) | (j51 >>> 3);
            int i32 = (-2) - ((i25 + 34) ^ (-1));
            long[] jArr2 = jArr;
            a = i32 % 128;
            int i33 = i32 % 2;
            long j66 = (j59 << 39) | (j59 >>> 25);
            long j67 = (j41 << 18) | (j41 >>> 46);
            long j68 = (j47 << 62) | (j47 >>> 2);
            long j69 = (j49 << 43) | (j49 >>> 21);
            long j70 = (j54 << 25) | (j54 >>> 39);
            long j71 = (j60 << 8) | (j60 >>> 56);
            long j72 = (j56 << 56) | (j56 >>> 8);
            long j73 = (j40 << 41) | (j40 >>> 23);
            long j74 = (j57 << 27) | (j57 >>> 37);
            int i34 = i25 & 115;
            int i35 = i34 + ((i25 ^ 115) | i34);
            int i36 = i35 % 128;
            a = i36;
            int i37 = i35 % 2;
            long j75 = (j61 << 14) | (j61 >>> 50);
            long j76 = (j46 << 2) | (j46 >>> 62);
            long j77 = (j53 << 55) | (j53 >>> 9);
            long j78 = (j45 << 45) | (j45 >>> 19);
            long j79 = (j38 << 36) | (j38 >>> 28);
            long j80 = (j52 << 28) | (j52 >>> 36);
            long j81 = (j55 << 21) | (j55 >>> 43);
            long j82 = (j50 << 15) | (j50 >>> 49);
            long j83 = (j44 << 10) | (j44 >>> 54);
            long j84 = (j48 << 6) | (j48 >>> 58);
            int i38 = (((i36 | 64) << 1) - (i36 ^ 64)) - 1;
            int i39 = i38 % 128;
            b = i39;
            int i40 = i38 % 2;
            long j85 = (j39 << 3) | (j39 >>> 61);
            long j86 = ((~j81) & j75) ^ j69;
            long j87 = j62 ^ ((~j84) & j70);
            long j88 = ((~j74) & j79) ^ j72;
            long j89 = c[i31];
            int i41 = (-2) - ((((i31 | (-22)) << 1) - (i31 ^ (-22))) ^ (-1));
            int i42 = ((i41 ^ 24) | (i41 & 24)) << 1;
            int i43 = -((i41 & (-25)) | (24 & (~i41)));
            int i44 = (i42 & i43) + (i43 | i42);
            long j90 = ((~j64) & j85) ^ j80;
            long j91 = ((~j71) & j67) ^ j70;
            long j92 = ((~j70) & j71) ^ j84;
            long j93 = j68 ^ ((~j77) & j66);
            long j94 = (~j76) & j68;
            int i45 = i39 + 47;
            int i46 = i45 % 128;
            a = i46;
            int i47 = i45 % 2;
            long j95 = j94 ^ j73;
            long j96 = j71 ^ ((~j67) & j62);
            long j97 = j78 ^ ((~j65) & j80);
            long j98 = ((~j37) & j63) ^ j75;
            long j99 = j83 ^ ((~j82) & j72);
            long j100 = ((~j79) & j83) ^ j74;
            long j101 = ((~j69) & j81) ^ j63;
            long j102 = (j74 & (~j72)) ^ j82;
            long j103 = (j82 & (~j83)) ^ j79;
            long j104 = ~j73;
            int i48 = (((i46 | 58) << 1) - (i46 ^ 58)) - 1;
            b = i48 % 128;
            int i49 = i48 % 2;
            long j105 = j66 ^ (j104 & j76);
            j16 = ((~j80) & j64) ^ j65;
            long j106 = ((~j66) & j73) ^ j77;
            long j107 = ((~j68) & j77) ^ j76;
            long j108 = ((j69 & (~j63)) ^ j37) ^ j89;
            long j109 = ((~j75) & j37) ^ j81;
            j7 = ((~j62) & j84) ^ j67;
            long j110 = ((~j78) & j65) ^ j85;
            j3 = (j78 & (~j85)) ^ j64;
            int i50 = i46 & 87;
            int i51 = ((i46 ^ 87) | i50) << 1;
            int i52 = -((~i50) & (i46 | 87));
            int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
            b = i53 % 128;
            int i54 = i53 % 2;
            i2 = 2;
            j20 = j103;
            j10 = j107;
            j26 = j105;
            i6 = 1;
            j25 = j106;
            j12 = j86;
            i = i44;
            j22 = j102;
            j6 = j96;
            j17 = j87;
            c5 = '=';
            j23 = j88;
            j18 = j92;
            j24 = j93;
            j14 = j98;
            j21 = j99;
            j8 = j100;
            i19 = 24;
            j4 = j110;
            j13 = j109;
            j2 = j108;
            j9 = j95;
            jArr = jArr2;
            j5 = j97;
            j = j101;
            j19 = j91;
            j15 = j90;
        }
        int i55 = i2;
        long[] jArr3 = jArr;
        jArr3[0] = j2;
        jArr3[i6] = j;
        jArr3[i55] = j12;
        int i56 = a + 11;
        int i57 = i56 % 128;
        b = i57;
        int i58 = i56 % i55;
        jArr3[3] = j13;
        jArr3[4] = j14;
        jArr3[5] = j15;
        jArr3[6] = j3;
        int i59 = i57 & 111;
        int i60 = (i57 ^ 111) | i59;
        int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
        a = i61 % 128;
        int i62 = i61 % 2;
        jArr3[7] = j4;
        jArr3[8] = j5;
        jArr3[9] = j16;
        int i63 = (i57 & 104) + (i57 | 104);
        int i64 = (i63 ^ (-1)) + (i63 << 1);
        int i65 = i64 % 128;
        a = i65;
        if (i64 % 2 != 0) {
            jArr3[10] = j17;
            jArr3[125] = j18;
            jArr3[16] = j19;
            c4 = 29;
        } else {
            jArr3[10] = j17;
            jArr3[11] = j18;
            jArr3[12] = j19;
            c4 = '\r';
        }
        jArr3[c4] = j6;
        jArr3[14] = j7;
        jArr3[15] = j8;
        jArr3[16] = j20;
        int i66 = (-2) - (((i65 ^ 8) + ((i65 & 8) << 1)) ^ (-1));
        b = i66 % 128;
        int i67 = i66 % 2;
        jArr3[17] = j21;
        jArr3[18] = j22;
        jArr3[19] = j23;
        int i68 = (i65 & (-90)) | ((~i65) & 89);
        int i69 = (i65 & 89) << 1;
        int i70 = (i68 & i69) + (i69 | i68);
        int i71 = i70 % 128;
        b = i71;
        int i72 = i70 % 2;
        jArr3[20] = j24;
        jArr3[21] = j25;
        jArr3[22] = j26;
        int i73 = i71 & 75;
        int i74 = (i71 | 75) & (~i73);
        int i75 = i73 << 1;
        int i76 = (i74 & i75) + (i74 | i75);
        int i77 = i76 % 128;
        a = i77;
        int i78 = i76 % 2;
        jArr3[23] = j9;
        jArr3[24] = j10;
        int i79 = i77 & 65;
        int i80 = (i77 | 65) & (~i79);
        int i81 = -(-(i79 << 1));
        int i82 = (i80 & i81) + (i80 | i81);
        b = i82 % 128;
        int i83 = i82 % 2;
    }

    public final void q(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 97;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (i != 128) {
            int i6 = i3 & 73;
            int i7 = (i3 ^ 73) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            int i9 = i8 % 128;
            b = i9;
            if (i8 % 2 != 0 ? i != 224 : i != 14640) {
                int i10 = ((i9 | 45) << 1) - (i9 ^ 45);
                a = i10 % 128;
                int i11 = i10 % 2;
                if (i != 256) {
                    int i12 = i9 + 75;
                    int i13 = i12 % 128;
                    a = i13;
                    if (i12 % 2 == 0 ? i != 288 : i != 32441) {
                        if (i != 384) {
                            int i14 = (i13 ^ 79) + ((i13 & 79) << 1);
                            b = i14 % 128;
                            int i15 = i14 % 2;
                            if (i != 512) {
                                throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
                            }
                        }
                    }
                }
            }
        }
        int i16 = -(i << 1);
        int i17 = i16 & 1600;
        r((((i16 | 1600) & (~i17)) - (~(-(-(i17 << 1))))) - 1);
        int i18 = a;
        int i19 = ((i18 ^ 121) | (i18 & 121)) << 1;
        int i20 = -(((~i18) & 121) | (i18 & (-122)));
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[EDGE_INSN: B:36:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:22:0x004b->B:28:0x007a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final void r(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long[] jArr;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = a;
        int i12 = (i11 & 57) + (i11 | 57);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 13 / 0;
            if (i > 0) {
                int i14 = (i11 ^ 59) + ((i11 & 59) << 1);
                i2 = i14 % 128;
                b = i2;
                int i15 = i14 % 2;
                if (i < 1600) {
                    i3 = i2 + 89;
                    i4 = i3 % 128;
                    a = i4;
                    if (i3 % 2 != 0 ? i % 64 == 0 : i - 121 == 0) {
                        i5 = i4 + 11;
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            this.f = i;
                        } else {
                            this.f = i;
                        }
                        i6 = 0;
                        while (true) {
                            jArr = this.d;
                            if (i6 >= jArr.length) {
                                break;
                            }
                            int i16 = a;
                            int i17 = i16 ^ 43;
                            int i18 = ((i16 & 43) | i17) << 1;
                            int i19 = -i17;
                            i9 = (i18 ^ i19) + ((i18 & i19) << 1);
                            int i20 = i9 % 128;
                            b = i20;
                            if (i9 % 2 == 0) {
                                jArr[i6] = 1;
                                i6 += 75;
                            } else {
                                jArr[i6] = 0;
                                i6 = ((i6 & 2) + (i6 | 2)) - 1;
                            }
                            int i21 = i20 & 21;
                            int i22 = (i20 | 21) & (~i21);
                            int i23 = -(-(i21 << 1));
                            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                            a = i24 % 128;
                            int i25 = i24 % 2;
                        }
                        Arrays.fill(this.e, (byte) 0);
                        this.g = 0;
                        int i26 = b;
                        int i27 = (i26 & (-74)) | ((~i26) & 73);
                        int i28 = (i26 & 73) << 1;
                        int i29 = (i27 & i28) + (i28 | i27);
                        int i30 = i29 % 128;
                        a = i30;
                        int i31 = i29 % 2;
                        this.h = false;
                        int i32 = -i;
                        int i33 = i32 & 1600;
                        int i34 = (i32 | 1600) & (~i33);
                        int i35 = i33 << 1;
                        i7 = ((i34 | i35) << 1) - (i34 ^ i35);
                        int i36 = i30 & 119;
                        int i37 = ((i30 ^ 119) | i36) << 1;
                        int i38 = -((i30 | 119) & (~i36));
                        i8 = (i37 & i38) + (i37 | i38);
                        b = i8 % 128;
                        if (i8 % 2 == 0) {
                            this.i = i7 >>> 2;
                            return;
                        } else {
                            this.i = i7 / 2;
                            return;
                        }
                    }
                }
            }
        } else if (i > 0) {
            int i110 = (i11 ^ 59) + ((i11 & 59) << 1);
            i2 = i110 % 128;
            b = i2;
            int i111 = i110 % 2;
            if (i < 1600) {
                i3 = i2 + 89;
                i4 = i3 % 128;
                a = i4;
                if (i3 % 2 != 0) {
                    i5 = i4 + 11;
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        this.f = i;
                    } else {
                        this.f = i;
                    }
                    i6 = 0;
                    while (true) {
                        jArr = this.d;
                        if (i6 >= jArr.length) {
                            break;
                            break;
                        }
                        int i112 = a;
                        int i113 = i112 ^ 43;
                        int i114 = ((i112 & 43) | i113) << 1;
                        int i115 = -i113;
                        i9 = (i114 ^ i115) + ((i114 & i115) << 1);
                        int i210 = i9 % 128;
                        b = i210;
                        if (i9 % 2 == 0) {
                            jArr[i6] = 1;
                            i6 += 75;
                        } else {
                            jArr[i6] = 0;
                            i6 = ((i6 & 2) + (i6 | 2)) - 1;
                        }
                        int i211 = i210 & 21;
                        int i212 = (i210 | 21) & (~i211);
                        int i213 = -(-(i211 << 1));
                        int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                        a = i214 % 128;
                        int i215 = i214 % 2;
                    }
                    Arrays.fill(this.e, (byte) 0);
                    this.g = 0;
                    int i216 = b;
                    int i217 = (i216 & (-74)) | ((~i216) & 73);
                    int i218 = (i216 & 73) << 1;
                    int i219 = (i217 & i218) + (i218 | i217);
                    int i39 = i219 % 128;
                    a = i39;
                    int i310 = i219 % 2;
                    this.h = false;
                    int i311 = -i;
                    int i312 = i311 & 1600;
                    int i313 = (i311 | 1600) & (~i312);
                    int i314 = i312 << 1;
                    i7 = ((i313 | i314) << 1) - (i313 ^ i314);
                    int i315 = i39 & 119;
                    int i316 = ((i39 ^ 119) | i315) << 1;
                    int i317 = -((i39 | 119) & (~i315));
                    i8 = (i316 & i317) + (i316 | i317);
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        this.i = i7 >>> 2;
                        return;
                    } else {
                        this.i = i7 / 2;
                        return;
                    }
                }
                i5 = i4 + 11;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    this.f = i;
                } else {
                    this.f = i;
                }
                i6 = 0;
                while (true) {
                    jArr = this.d;
                    if (i6 >= jArr.length) {
                        break;
                        break;
                    }
                    int i116 = a;
                    int i117 = i116 ^ 43;
                    int i118 = ((i116 & 43) | i117) << 1;
                    int i119 = -i117;
                    i9 = (i118 ^ i119) + ((i118 & i119) << 1);
                    int i2110 = i9 % 128;
                    b = i2110;
                    if (i9 % 2 == 0) {
                        jArr[i6] = 1;
                        i6 += 75;
                    } else {
                        jArr[i6] = 0;
                        i6 = ((i6 & 2) + (i6 | 2)) - 1;
                    }
                    int i2111 = i2110 & 21;
                    int i2112 = (i2110 | 21) & (~i2111);
                    int i2113 = -(-(i2111 << 1));
                    int i2114 = ((i2112 | i2113) << 1) - (i2113 ^ i2112);
                    a = i2114 % 128;
                    int i2115 = i2114 % 2;
                }
                Arrays.fill(this.e, (byte) 0);
                this.g = 0;
                int i2116 = b;
                int i2117 = (i2116 & (-74)) | ((~i2116) & 73);
                int i2118 = (i2116 & 73) << 1;
                int i2119 = (i2117 & i2118) + (i2118 | i2117);
                int i318 = i2119 % 128;
                a = i318;
                int i319 = i2119 % 2;
                this.h = false;
                int i3110 = -i;
                int i3111 = i3110 & 1600;
                int i3112 = (i3110 | 1600) & (~i3111);
                int i3113 = i3111 << 1;
                i7 = ((i3112 | i3113) << 1) - (i3112 ^ i3113);
                int i3114 = i318 & 119;
                int i3115 = ((i318 ^ 119) | i3114) << 1;
                int i3116 = -((i318 | 119) & (~i3114));
                i8 = (i3115 & i3116) + (i3115 | i3116);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    this.i = i7 >>> 2;
                    return;
                } else {
                    this.i = i7 / 2;
                    return;
                }
            }
        }
        throw new IllegalStateException("invalid rate value");
    }

    public final void s() {
        long[] jArr;
        long j;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 77;
        int i4 = -(-((i2 & 77) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        byte[] bArr = this.e;
        int i8 = this.g;
        int i9 = (((i6 ^ 109) | (i6 & 109)) << 1) - (((~i6) & 109) | (i6 & (-110)));
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        int i12 = i8 >>> 3;
        byte b2 = bArr[i12];
        int i13 = (i10 ^ 39) + ((i10 & 39) << 1);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        byte b3 = (byte) (1 << (i8 & 7));
        bArr[i12] = (byte) ((b2 & b3) | (b2 ^ b3));
        int i16 = (((i8 & (-2)) | ((~i8) & 1)) - (~(-(-((i8 & 1) << 1))))) - 1;
        int i17 = ((i14 ^ 4) + ((i14 & 4) << 1)) - 1;
        int i18 = i17 % 128;
        a = i18;
        int i19 = i17 % 2;
        this.g = i16;
        if (i16 == this.f) {
            int i20 = i18 & 103;
            int i21 = (~i20) & (i18 | 103);
            int i22 = -(-(i20 << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            int i24 = i23 % 2;
            n(bArr, 0);
        } else {
            int i25 = i16 >>> 6;
            int i26 = i16 & 63;
            int i27 = (i14 & 105) + (i14 | 105);
            a = i27 % 128;
            int i28 = i27 % 2 != 0 ? 1 : 0;
            int i29 = (i14 ^ 113) + ((i14 & 113) << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 0;
            while (i31 < i25) {
                int i32 = a;
                int i33 = (i32 | 117) << 1;
                int i34 = -(((~i32) & 117) | (i32 & (-118)));
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    long j2 = this.d[i31];
                    throw null;
                }
                long[] jArr2 = this.d;
                jArr2[i31] = jArr2[i31] ^ h.k(this.e, i28);
                i28 = (((i28 ^ 8) | (i28 & 8)) << 1) - (((~i28) & 8) | (i28 & (-9)));
                int i36 = i31 & 17;
                int i37 = ((i31 ^ 17) | i36) << 1;
                int i38 = -((i31 | 17) & (~i36));
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                i31 = ((i39 & (-15)) + (i39 | (-15))) - 1;
                int i40 = a;
                int i41 = i40 & 67;
                int i42 = (i40 | 67) & (~i41);
                int i43 = i41 << 1;
                int i44 = (i42 & i43) + (i42 | i43);
                b = i44 % 128;
                int i45 = i44 % 2;
            }
            p();
            if (i26 > 0) {
                int i46 = b + 1;
                a = i46 % 128;
                if (i46 % 2 != 0) {
                    jArr = this.d;
                    j = jArr[i25];
                } else {
                    jArr = this.d;
                    j = jArr[i25];
                }
                long jK = h.k(this.e, i28) & ((1 << i26) - 1);
                int i47 = a;
                int i48 = i47 & 87;
                int i49 = (i47 | 87) & (~i48);
                int i50 = -(-(i48 << 1));
                int i51 = (i49 & i50) + (i49 | i50);
                int i52 = i51 % 128;
                b = i52;
                int i53 = i51 % 2;
                jArr[i25] = jK ^ j;
                int i54 = i52 & 79;
                int i55 = ((~i54) & (i52 | 79)) + (i54 << 1);
                a = i55 % 128;
                int i56 = i55 % 2;
            }
        }
        long[] jArr3 = this.d;
        int i57 = this.f;
        int i58 = a;
        int i59 = i58 & 9;
        int i60 = (i58 ^ 9) | i59;
        int i61 = (i59 & i60) + (i60 | i59);
        int i62 = i61 % 128;
        b = i62;
        int i63 = i61 % 2;
        int i64 = ((-2) - (i57 ^ (-1))) >>> 6;
        int i65 = ((i62 ^ 85) | (i62 & 85)) << 1;
        int i66 = -((i62 & (-86)) | ((~i62) & 85));
        int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
        a = i67 % 128;
        if (i67 % 2 != 0) {
            jArr3[i64] = jArr3[i64] % Long.MIN_VALUE;
            this.g = 1;
        } else {
            jArr3[i64] = Long.MIN_VALUE ^ jArr3[i64];
            this.g = 0;
        }
        int i68 = i62 + 87;
        int i69 = i68 % 128;
        a = i69;
        if (i68 % 2 != 0) {
            this.h = false;
        } else {
            this.h = true;
        }
        int i70 = (i69 ^ 31) + ((i69 & 31) << 1);
        b = i70 % 128;
        int i71 = i70 % 2;
    }

    public z(int i) {
        if (i != 128) {
            int i2 = b;
            int i3 = i2 & 125;
            int i4 = (i2 ^ 125) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            if (i != 256) {
                StringBuilder sb = new StringBuilder();
                sb.append("'bitLength' ");
                int i7 = b;
                int i8 = (i7 ^ 26) + ((i7 & 26) << 1);
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                sb.append(i);
                sb.append(" not supported for SHAKE");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.d = new long[25];
        this.e = new byte[192];
        q(i);
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int b(byte[] bArr, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 35;
        int i6 = (i4 ^ 35) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = this.i;
            int i9 = i8 & (-57);
            i2 = i9 + ((i8 ^ (-57)) | i9);
        } else {
            i2 = this.i / 8;
        }
        a(bArr, i, i2);
        int i10 = b;
        int i11 = i10 & 17;
        int i12 = (i11 - (~(-(-((i10 ^ 17) | i11))))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = (i10 ^ 49) + ((i10 & 49) << 1);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 71 / 0;
        }
        return i2;
    }

    public byte[] p() {
        long j;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 109;
        int i5 = (((i3 | 109) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        int i6 = i5 % 128;
        a = i6;
        byte[] bArr = new byte[i5 % 2 != 0 ? this.d.length * 79 : this.d.length * 8];
        int i7 = i6 & 27;
        int i8 = ((i6 ^ 27) | i7) << 1;
        int i9 = -((i6 | 27) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            long[] jArr = this.d;
            if (i12 == jArr.length) {
                break;
            }
            int i14 = b;
            int i15 = i14 & 15;
            int i16 = (i14 ^ 15) | i15;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                j = jArr[i12];
                i = (int) (4294967295L + j);
            } else {
                j = jArr[i12];
                i = (int) (j & 4294967295L);
            }
            h.h(i, bArr, i13);
            int i18 = i13 & 4;
            h.h((int) (j >>> 32), bArr, i18 + ((i13 ^ 4) | i18));
            i13 = ((i13 | 8) << 1) - (i13 ^ 8);
            int i19 = b;
            int i20 = i19 & 75;
            int i21 = (i19 ^ 75) | i20;
            int i22 = (i20 & i21) + (i21 | i20);
            int i23 = i22 % 128;
            a = i23;
            int i24 = i22 % 2;
            i12++;
            int i25 = (i23 & (-86)) | ((~i23) & 85);
            int i26 = (i23 & 85) << 1;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = b;
        int i30 = ((i29 ^ 115) | (i29 & 115)) << 1;
        int i31 = -(((~i29) & 115) | (i29 & (-116)));
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        a = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 63 / 0;
        }
        return bArr;
    }

    public final void n(byte[] bArr, int i) {
        long[] jArr;
        long j;
        long jK;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((((i3 ^ 39) | (i3 & 39)) << 1) - (~(-(((~i3) & 39) | (i3 & (-40)))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.f;
        int i8 = i5 & 113;
        int i9 = (i5 | 113) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < (i7 >>> 6)) {
            int i14 = b;
            int i15 = i14 & 83;
            int i16 = i15 + ((i14 ^ 83) | i15);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                jArr = this.d;
                j = jArr[i13];
                jK = h.k(bArr, i);
                int i17 = 67 / 0;
            } else {
                jArr = this.d;
                j = jArr[i13];
                jK = h.k(bArr, i);
            }
            jArr[i13] = j ^ jK;
            int i18 = i & 135;
            int i19 = ((i ^ 135) | i18) << 1;
            int i20 = -((i | 135) & (~i18));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            int i22 = i21 & (-127);
            i = (((~i22) & (i21 | (-127))) - (~(-(-(i22 << 1))))) - 1;
            int i23 = (i13 & (-2)) | ((~i13) & 1);
            int i24 = (i13 & 1) << 1;
            i13 = (i24 | i23) + (i23 & i24);
            int i25 = b + 51;
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        byte[] bArrP = p();
        C0321u c0321u = c.c;
        int length = bArrP.length;
        int i27 = b;
        int i28 = ((i27 ^ 14) + ((i27 & 14) << 1)) - 1;
        a = i28 % 128;
        if (i28 % 2 != 0) {
            p.b(c.b(bArrP, 0, length));
            g();
            int i29 = 58 / 0;
        } else {
            p.b(c.b(bArrP, 0, length));
            g();
        }
        int i30 = a;
        int i31 = i30 & 33;
        int i32 = -(-((i30 ^ 33) | i31));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        b = i33 % 128;
        int i34 = i33 % 2;
    }

    public final void o() {
        int i;
        byte[] bArr;
        long j;
        long j2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 87) + (i3 | 87);
        a = i4 % 128;
        int i5 = i4 % 2;
        g();
        p();
        long[] jArr = this.d;
        int i6 = b;
        int i7 = (i6 & 41) + (i6 | 41);
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 != 0) {
            i = this.f;
            bArr = this.e;
            int i9 = 51 / 0;
        } else {
            i = this.f;
            bArr = this.e;
        }
        int i10 = i8 & 31;
        int i11 = -(-((i8 ^ 31) | i10));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        int i15 = 0;
        while (i14 < (i >>> 6)) {
            int i16 = a;
            int i17 = i16 & 55;
            int i18 = -(-((i16 ^ 55) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                j = jArr[1 % i14];
                j2 = 4294967295L - j;
            } else {
                j = jArr[(-2) - ((0 - (~(-(-i14)))) ^ (-1))];
                j2 = 4294967295L & j;
            }
            h.h((int) j2, bArr, i15);
            int i20 = (int) (j >>> 32);
            int i21 = b;
            int i22 = (-2) - (((i21 ^ 86) + ((i21 & 86) << 1)) ^ (-1));
            a = i22 % 128;
            if (i22 % 2 != 0) {
                h.h(i20, bArr, i15 << 2);
                i15 += 94;
                int i23 = (((i14 ^ 143) | (i14 & 143)) << 1) - (((~i14) & 143) | (i14 & (-144)));
                int i24 = i23 & (-82);
                int i25 = (i23 | (-82)) & (~i24);
                int i26 = -(-(i24 << 1));
                i14 = (i25 & i26) + (i26 | i25);
            } else {
                h.h(i20, bArr, i15 + 4);
                int i27 = (i15 & (-9)) | ((~i15) & 8);
                int i28 = -(-((i15 & 8) << 1));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                int i30 = ((i14 | 2) << 1) - (i14 ^ 2);
                i14 = (i30 ^ (-1)) + (i30 << 1);
                i15 = i29;
            }
        }
        this.g = this.f;
        int i31 = b;
        int i32 = i31 & 43;
        int i33 = ((i31 ^ 43) | i32) << 1;
        int i34 = -((i31 | 43) & (~i32));
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        a = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 4 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p101x.P
    public int a(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 109) << 1) - (i4 ^ 109);
        a = i5 % 128;
        int i6 = i5 % 2;
        boolean z = this.h;
        if (!z) {
            int i7 = i4 & 95;
            int i8 = (~i7) & (i4 | 95);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = this.g;
            if (i12 % 8 != 0) {
                throw new IllegalStateException("attempt to absorb with odd length queue");
            }
            int i13 = i4 & 27;
            int i14 = (i4 | 27) & (~i13);
            int i15 = i13 << 1;
            int i16 = (i14 & i15) + (i14 | i15);
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            if (z) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            int i19 = ((i17 | 23) << 1) - (i17 ^ 23);
            int i20 = i19 % 128;
            b = i20;
            int i21 = i19 % 2;
            this.e[i12 >>> 3] = 15;
            int i22 = i20 ^ 15;
            int i23 = ((i20 & 15) | i22) << 1;
            int i24 = -i22;
            int i25 = (i23 & i24) + (i23 | i24);
            a = i25 % 128;
            if (i25 % 2 != 0) {
                this.g = i12 << 3;
            } else {
                this.g = ((i12 | 4) << 1) - (i12 ^ 4);
            }
        }
        long j = ((long) i2) * 8;
        if (!z) {
            int i26 = a;
            int i27 = i26 & 7;
            int i28 = ((i26 ^ 7) | i27) << 1;
            int i29 = -((i26 | 7) & (~i27));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            int i31 = i30 % 2;
            s();
            int i32 = a;
            int i33 = (i32 ^ 35) + ((i32 & 35) << 1);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        p();
        long j2 = j % 8;
        int i35 = b + 57;
        a = i35 % 128;
        int i36 = i35 % 2;
        long j3 = 0;
        if (j2 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j3 < j) {
            int i37 = a;
            int i38 = i37 + 33;
            b = i38 % 128;
            int i39 = i38 % 2;
            if (this.g == 0) {
                int i40 = i37 & 7;
                int i41 = (i37 ^ 7) | i40;
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                b = i42 % 128;
                int i43 = i42 % 2;
                o();
                int i44 = b + 105;
                a = i44 % 128;
                int i45 = i44 % 2;
            }
            int iMin = (int) Math.min(this.g, j - j3);
            int i46 = b;
            int i47 = (i46 ^ 33) + ((i46 & 33) << 1);
            a = i47 % 128;
            if (i47 % 2 != 0) {
                throw null;
            }
            byte[] bArr2 = this.e;
            int i48 = this.f;
            int i49 = -(~(-this.g));
            int i50 = ((((i48 | i49) << 1) - (i48 ^ i49)) - 1) / 8;
            int i51 = (int) (j3 / 8);
            int i52 = i51 ^ i;
            int i53 = ((i51 & i) | i52) << 1;
            int i54 = -i52;
            int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
            int i56 = i46 & 27;
            int i57 = (i56 - (~((i46 ^ 27) | i56))) - 1;
            a = i57 % 128;
            System.arraycopy(bArr2, i50, bArr, i55, i57 % 2 != 0 ? iMin >> 52 : iMin / 8);
            this.g = (this.g - (~(-iMin))) - 1;
            j3 += (long) iMin;
            int i58 = a;
            int i59 = i58 & 7;
            int i60 = (i58 | 7) & (~i59);
            int i61 = -(-(i59 << 1));
            int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
            b = i62 % 128;
            int i63 = i62 % 2;
        }
        p();
        q(this.i);
        int i64 = (-2) - ((b + 96) ^ (-1));
        a = i64 % 128;
        if (i64 % 2 == 0) {
            return i2;
        }
        throw null;
    }
}
