package ivas.gov.bisp.enumeration.p013am;

import androidx.emoji2.text.f;
import ivas.gov.bisp.enumeration.p014an.ar;
import ivas.gov.bisp.enumeration.p014an.as;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class P {
    private static int a = 0;
    private static int b = 1;
    public static final ThreadLocal<ar> c = new ThreadLocal<>();
    public final int d;
    public final f e;
    public volatile int f = 0;

    static {
        int i = b;
        int i2 = ((i & (-4)) | ((~i) & 3)) + ((i & 3) << 1);
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    public P(f fVar, int i) {
        this.e = fVar;
        this.d = i;
    }

    public short e() {
        ar arVarG;
        int i;
        short s;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 57) << 1) - (i3 ^ 57);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            arVarG = g();
            i = 95;
        } else {
            arVarG = g();
            i = 14;
        }
        int iC = arVarG.c(i);
        if (iC != 0) {
            int i5 = a;
            int i6 = (((i5 | 56) << 1) - (i5 ^ 56)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            ByteBuffer byteBuffer = arVarG.d;
            int i8 = -(-arVarG.c);
            int i9 = iC & i8;
            s = byteBuffer.getShort(((i8 | iC) & (~i9)) + (i9 << 1));
            int i10 = a + 81;
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = b;
            int i13 = i12 & 97;
            int i14 = (i12 | 97) & (~i13);
            int i15 = i13 << 1;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            a = i16 % 128;
            int i17 = i16 % 2;
            s = 0;
        }
        int i18 = a;
        int i19 = i18 & 11;
        int i20 = i18 | 11;
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        int i22 = i21 % 2;
        return s;
    }

    public int f() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-24)) | ((~i3) & 23);
        int i5 = -(-((i3 & 23) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        ar arVarG = g();
        int iC = arVarG.c(4);
        if (iC != 0) {
            int i8 = b;
            int i9 = i8 & 41;
            int i10 = ((i8 ^ 41) | i9) << 1;
            int i11 = -((i8 | 41) & (~i9));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            ByteBuffer byteBuffer = arVarG.d;
            int i14 = arVarG.c;
            int i15 = iC & i14;
            i = byteBuffer.getInt(((((iC ^ i14) | i15) << 1) - (~(-((i14 | iC) & (~i15))))) - 1);
            int i16 = a;
            int i17 = i16 & 39;
            int i18 = (((i16 | 39) & (~i17)) - (~(i17 << 1))) - 1;
            int i19 = i18 % 128;
            b = i19;
            if (i18 % 2 == 0) {
                int i20 = 24 / 0;
            }
            int i21 = (((i19 & (-118)) | ((~i19) & 117)) - (~(-(-((i19 & 117) << 1))))) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
        } else {
            int i23 = b;
            int i24 = (((i23 & (-114)) | ((~i23) & 113)) - (~((i23 & 113) << 1))) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
            i = 0;
        }
        int i26 = b + 59;
        a = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 99 / 0;
        }
        return i;
    }

    public int c(int i) {
        int i2;
        ByteBuffer byteBuffer;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (i6 & 7) + (i6 | 7);
        b = i7 % 128;
        int i8 = i7 % 2;
        ar arVarG = g();
        int iC = arVarG.c(16);
        if (iC != 0) {
            int i9 = a;
            int i10 = i9 & 15;
            int i11 = i9 | 15;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                byteBuffer = arVarG.d;
                int i13 = arVarG.c;
                int i14 = iC & i13;
                int i15 = -(-((i13 ^ iC) | i14));
                i3 = i14 & i15;
                i4 = i15 | i14;
            } else {
                byteBuffer = arVarG.d;
                int i16 = arVarG.c;
                int i17 = iC & i16;
                int i18 = -(-((i16 ^ iC) | i17));
                i3 = i17 ^ i18;
                i4 = (i18 & i17) << 1;
            }
            int i19 = i3 + i4;
            int i20 = a;
            int i21 = i20 ^ 15;
            int i22 = -(-((i20 & 15) << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            int i24 = i23 % 2;
            int i25 = byteBuffer.getInt(i19);
            int i26 = i * 4;
            int i27 = a;
            int i28 = i27 | 101;
            int i29 = ((i28 << 1) - (~(-((~(i27 & 101)) & i28)))) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
            int i31 = ((i25 ^ i19) | (i25 & i19)) << 1;
            int i32 = -(((~i25) & i19) | ((~i19) & i25));
            int i33 = -(-((i31 ^ i32) + ((i32 & i31) << 1) + 4));
            int i34 = (i26 | i33) << 1;
            int i35 = -(((~i26) & i33) | ((~i33) & i26));
            i2 = byteBuffer.getInt(((i34 | i35) << 1) - (i35 ^ i34));
            int i36 = a;
            int i37 = i36 & 87;
            int i38 = -(-((i36 ^ 87) | i37));
            int i39 = (i37 & i38) + (i38 | i37);
            b = i39 % 128;
            int i40 = i39 % 2;
        } else {
            int i41 = b;
            int i42 = i41 & 77;
            int i43 = (((i41 ^ 77) | i42) << 1) - ((i41 | 77) & (~i42));
            a = i43 % 128;
            int i44 = i43 % 2;
            i2 = 0;
        }
        int i45 = a;
        int i46 = i45 & 65;
        int i47 = (i45 | 65) & (~i46);
        int i48 = i46 << 1;
        int i49 = (i47 & i48) + (i47 | i48);
        b = i49 % 128;
        if (i49 % 2 == 0) {
            int i50 = 6 / 0;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0091  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a1  */
    public int d() {
        ar arVarG;
        int iC;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 33) | (i3 & 33)) << 1) - (((~i3) & 33) | (i3 & (-34)));
        b = i4 % 128;
        if (i4 % 2 == 0) {
            arVarG = g();
            iC = arVarG.c(63);
        } else {
            arVarG = g();
            iC = arVarG.c(16);
        }
        int i5 = b;
        int i6 = (-2) - (((i5 & 24) + (i5 | 24)) ^ (-1));
        int i7 = i6 % 128;
        a = i7;
        int i8 = 0;
        if (i6 % 2 != 0) {
            int i9 = 97 / 0;
            if (iC != 0) {
                int i10 = arVarG.c;
                int i11 = iC & i10;
                int i12 = (iC ^ i10) | i11;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                ByteBuffer byteBuffer = arVarG.d;
                int i14 = b;
                int i15 = i14 ^ 41;
                int i16 = (i14 & 41) << 1;
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                i8 = arVarG.d.getInt((byteBuffer.getInt(i13) - (~(-(-i13)))) - 1);
                int i19 = b;
                int i20 = ((i19 | 107) << 1) - (i19 ^ 107);
                int i21 = i20 % 128;
                a = i21;
                int i22 = i20 % 2;
                int i23 = (i21 & 63) + (63 | i21);
                b = i23 % 128;
                int i24 = i23 % 2;
            } else {
                int i25 = i7 & 71;
                i = ((~i25) & (i7 | 71)) + (i25 << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    int i26 = 3 % 3;
                }
            }
        } else if (iC != 0) {
            int i110 = arVarG.c;
            int i111 = iC & i110;
            int i112 = (iC ^ i110) | i111;
            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
            ByteBuffer byteBuffer2 = arVarG.d;
            int i114 = b;
            int i115 = i114 ^ 41;
            int i116 = (i114 & 41) << 1;
            int i117 = (i115 & i116) + (i116 | i115);
            a = i117 % 128;
            int i118 = i117 % 2;
            i8 = arVarG.d.getInt((byteBuffer2.getInt(i113) - (~(-(-i113)))) - 1);
            int i119 = b;
            int i27 = ((i119 | 107) << 1) - (i119 ^ 107);
            int i28 = i27 % 128;
            a = i28;
            int i29 = i27 % 2;
            int i210 = (i28 & 63) + (63 | i28);
            b = i210 % 128;
            int i211 = i210 % 2;
        } else {
            int i212 = i7 & 71;
            i = ((~i212) & (i7 | 71)) + (i212 << 1);
            b = i % 128;
            if (i % 2 == 0) {
                int i213 = 3 % 3;
            }
        }
        int i30 = a;
        int i31 = ((i30 | 27) << 1) - (i30 ^ 27);
        b = i31 % 128;
        if (i31 % 2 != 0) {
            return i8;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        int i2 = b;
        int i3 = ((i2 ^ 113) - (~(-(-((i2 & 113) << 1))))) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            sb.append(", id:");
            Integer.toHexString(f());
            obj.hashCode();
            throw null;
        }
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iD = d();
        int i4 = a;
        int i5 = ((i4 | 93) << 1) - (i4 ^ 93);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 6;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < iD) {
            int i11 = b;
            int i12 = (i11 & 15) + (i11 | 15);
            a = i12 % 128;
            int i13 = i12 % 2;
            sb.append(Integer.toHexString(c(i10)));
            int i14 = a;
            int i15 = (i14 & 18) + (i14 | 18);
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            sb.append(" ");
            i10 = ((i10 & 49) + (i10 | 49)) - 48;
            int i18 = a;
            int i19 = i18 ^ 35;
            int i20 = ((i18 & 35) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        String string = sb.toString();
        int i24 = b;
        int i25 = i24 & 21;
        int i26 = ((i24 | 21) & (~i25)) + (i25 << 1);
        a = i26 % 128;
        if (i26 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final ar g() {
        int iC;
        int i;
        ByteBuffer byteBuffer;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 81) << 1) - (i3 ^ 81);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            c.get();
            throw null;
        }
        ThreadLocal<ar> threadLocal = c;
        ar arVar = threadLocal.get();
        if (arVar == null) {
            arVar = new ar();
            threadLocal.set(arVar);
            int i5 = b;
            int i6 = (i5 ^ 9) + ((i5 & 9) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        as asVar = this.e.a;
        int i8 = this.d;
        int i9 = a + 94;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        b = i10 % 128;
        if (i10 % 2 != 0 ? (iC = asVar.c(6)) != 0 : (iC = asVar.c(123)) != 0) {
            int i11 = asVar.c;
            int i12 = (iC | i11) << 1;
            int i13 = -(iC ^ i11);
            int i14 = (i12 & i13) + (i13 | i12);
            ByteBuffer byteBuffer2 = asVar.d;
            int i15 = b + 51;
            a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = byteBuffer2.getInt(i14);
            int i18 = (i17 ^ i14) + ((i17 & i14) << 1) + 5;
            int i19 = (i8 * 4) + (i18 ^ (-1)) + (i18 << 1);
            ByteBuffer byteBuffer3 = asVar.d;
            int i20 = a;
            int i21 = i20 & 25;
            int i22 = -(-((i20 ^ 25) | i21));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                i = byteBuffer3.getInt(i19);
                byteBuffer = asVar.d;
                int i24 = 13 / 0;
            } else {
                i = byteBuffer3.getInt(i19);
                byteBuffer = asVar.d;
            }
            int i25 = -(-i19);
            int i26 = i & i25;
            int i27 = ((i ^ i25) | i26) << 1;
            int i28 = -((i25 | i) & (~i26));
            arVar.d((i27 ^ i28) + ((i28 & i27) << 1), byteBuffer);
            int i29 = a + 107;
            b = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = b;
        int i32 = i31 & 113;
        int i33 = ((((i31 ^ 113) | i32) << 1) - (~(-((i31 | 113) & (~i32))))) - 1;
        a = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 47 / 0;
        }
        return arVar;
    }
}
