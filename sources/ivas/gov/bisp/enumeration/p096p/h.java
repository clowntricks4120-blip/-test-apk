package ivas.gov.bisp.enumeration.p096p;

import android.graphics.Path;
import android.graphics.Typeface;
import ivas.gov.bisp.enumeration.bF.c;
import ivas.gov.bisp.enumeration.cP.A;
import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.J;
import ivas.gov.bisp.enumeration.cP.P;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.BeneficiaryEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.IndividualNadraDataWithRelation;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.NadraFamilyData;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.TabletLogEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.district;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.locality;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.not_at_home;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offline_survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offlinesurvey;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.sync;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.tehsil;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.vilages;
import ivas.gov.bisp.enumeration.p022av.M;
import ivas.gov.bisp.enumeration.p023aw.e;
import ivas.gov.bisp.enumeration.p032be.j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    private static int a = 1;
    private static int b;
    public static h c;

    public static long[] c(byte[] bArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-94)) | ((~i2) & 93)) + ((i2 & 93) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        long[] jArr = new long[2];
        int i6 = i4 + 24;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 2) {
            int i11 = a;
            int i12 = i11 | 31;
            int i13 = i12 << 1;
            int i14 = -((~(i11 & 31)) & i12);
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            jArr[i9] = f(bArr, i10);
            int i17 = i10 & (-76);
            int i18 = (i10 ^ (-76)) | i17;
            int i19 = (i17 & i18) + (i18 | i17);
            int i20 = i19 & 84;
            i10 = i20 + ((i19 ^ 84) | i20);
            int i21 = ((i9 ^ (-115)) | (i9 & (-115))) << 1;
            int i22 = -(((~i9) & (-115)) | (i9 & 114));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            int i24 = (i23 | 116) << 1;
            int i25 = -((i23 & (-117)) | ((~i23) & 116));
            i9 = ((i24 | i25) << 1) - (i24 ^ i25);
            int i26 = a + 87;
            b = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = a;
        int i29 = ((i28 & (-12)) | ((~i28) & 11)) + ((i28 & 11) << 1);
        b = i29 % 128;
        if (i29 % 2 != 0) {
            int i30 = 42 / 0;
        }
        return jArr;
    }

    public static int e(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 123;
        int i5 = (i4 - (~(-(-((i3 ^ 123) | i4))))) - 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        byte b2 = bArr[i];
        int i8 = i & 1;
        int i9 = -(-((i ^ 1) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        byte b3 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i6 & 99;
        int i13 = -(-(i6 | 99));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        byte b4 = bArr[i11];
        int i17 = i11 & 1;
        int i18 = ((i11 ^ 1) | i17) << 1;
        int i19 = -((i11 | 1) & (~i17));
        int i20 = bArr[((i18 | i19) << 1) - (i19 ^ i18)] & 255;
        int i21 = i15 | 89;
        int i22 = (i21 << 1) - (i21 & (~(i15 & 89)));
        b = i22 % 128;
        int i23 = i22 % 2;
        int i24 = b2 << 24;
        int i25 = (b3 & 255) << 16;
        int i26 = i24 & i25;
        int i27 = (i25 | i24) & (~i26);
        int i28 = (i27 & i26) | (i27 ^ i26);
        int i29 = (i15 & 75) + (i15 | 75);
        b = i29 % 128;
        if (i29 % 2 != 0) {
            int i30 = b4 & 12107;
            int i31 = (~i30) & (b4 | 12107);
            return i20 & i28 & (((i30 & i31) | (i31 ^ i30)) << 89);
        }
        int i32 = (b4 & 255) << 8;
        int i33 = i28 & i32;
        int i34 = (i28 | i32) & (~i33);
        int i35 = (i34 & i33) | (i34 ^ i33);
        return (i20 & i35) | (i20 ^ i35);
    }

    public static long f(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 ^ 85) | (i5 & 85)) << 1;
        int i7 = -(((~i5) & 85) | (i5 & (-86)));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        int iE = e(bArr, i);
        if (i9 == 0) {
            i2 = (i | 5) << 1;
            i3 = i ^ 5;
        } else {
            int i10 = i | 4;
            int i11 = i10 << 1;
            int i12 = -((~(i & 4)) & i10);
            i2 = (i11 | i12) << 1;
            i3 = i12 ^ i11;
        }
        int iE2 = e(bArr, i2 - i3);
        int i13 = a;
        int i14 = ((i13 ^ 85) | (i13 & 85)) << 1;
        int i15 = -((i13 & (-86)) | (85 & (~i13)));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        b = i16 % 128;
        int i17 = i16 % 2;
        long j = ((long) iE2) & 4294967295L;
        int i18 = i13 & 47;
        int i19 = ((((i13 ^ 47) | i18) << 1) - (~(-((i13 | 47) & (~i18))))) - 1;
        int i20 = i19 % 128;
        b = i20;
        long j2 = (((long) iE) & 4294967295L) << 32;
        long j3 = i19 % 2 != 0 ? j - j2 : j | j2;
        int i21 = (-2) - (((i20 & 80) + (i20 | 80)) ^ (-1));
        a = i21 % 128;
        int i22 = i21 % 2;
        return j3;
    }

    public static long g(long j, long j2, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 51) + ((i3 & 51) << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        long j3 = j2 & ((j >>> i) ^ j);
        int i7 = i5 + 85;
        b = i7 % 128;
        int i8 = i7 % 2;
        long j4 = j ^ (j3 ^ (j3 << i));
        int i9 = i5 + 115;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 90 / 0;
        }
        return j4;
    }

    public static void h(int i, byte[] bArr, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 47;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        bArr[i2] = (byte) i;
        int i7 = i2 ^ (-54);
        int i8 = (i2 & (-54)) << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        int i10 = i9 ^ 55;
        int i11 = (i9 & 55) << 1;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i5 + 11;
        b = i13 % 128;
        int i14 = i13 % 2;
        bArr[i12] = (byte) (i >>> 8);
        int i15 = (i12 ^ 1) + ((i12 & 1) << 1);
        int i16 = i5 + 55;
        b = i16 % 128;
        int i17 = i16 % 2;
        bArr[i15] = (byte) (i >>> 16);
        bArr[(i15 ^ 1) + ((i15 & 1) << 1)] = (byte) (i >>> 24);
        int i18 = i5 & 79;
        int i19 = (~i18) & (i5 | 79);
        int i20 = -(-(i18 << 1));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void i(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a + 61;
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            bArr[i2] = (byte) (i / 104);
            int i8 = i2 ^ 34;
            int i9 = (i2 & 34) << 1;
            i3 = (i8 ^ i9) + ((i9 & i8) << 1);
            i4 = 99;
        } else {
            bArr[i2] = (byte) (i >>> 24);
            int i10 = i2 ^ 1;
            int i11 = ((i2 & 1) | i10) << 1;
            int i12 = -i10;
            i3 = (i11 ^ i12) + ((i11 & i12) << 1);
            i4 = 16;
        }
        int i13 = i7 & 93;
        int i14 = (i13 - (~(-(-((i7 ^ 93) | i13))))) - 1;
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        bArr[i3] = (byte) (i >>> i4);
        int i17 = i3 ^ 1;
        int i18 = ((i3 & 1) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 & i19) + (i19 | i18);
        bArr[i20] = (byte) (i >>> 8);
        int i21 = i15 & 101;
        int i22 = (~i21) & (i15 | 101);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 & i23) + (i23 | i22);
        b = i24 % 128;
        if (i24 % 2 != 0) {
            bArr[0] = (byte) i;
            return;
        }
        int i25 = (i20 & (-2)) | ((~i20) & 1);
        int i26 = -(-((i20 & 1) << 1));
        bArr[(i25 & i26) + (i25 | i26)] = (byte) i;
    }

    public static int j(byte[] bArr, int i) {
        byte b2;
        int i2;
        byte b3;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b + 117;
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        byte b4 = bArr[i];
        int i9 = i ^ 1;
        int i10 = -(-((i & 1) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        byte b5 = bArr[i11];
        int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
        int i13 = i7 & 87;
        int i14 = (i7 | 87) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        int i17 = i16 % 128;
        b = i17;
        if (i16 % 2 != 0) {
            b2 = bArr[i12];
            i2 = bArr[i12 << 1] << 106;
            b3 = 14981;
        } else {
            b2 = bArr[i12];
            i2 = bArr[((i12 & 2) + (i12 | 2)) - 1] << 24;
            b3 = 255;
        }
        int i18 = b4 & b3;
        int i19 = (b5 & 255) << 8;
        int i20 = i18 & i19;
        int i21 = (i19 | i18) & (~i20);
        int i22 = (i21 & i20) | (i21 ^ i20);
        int i23 = b2 & 255;
        int i24 = i17 & 55;
        int i25 = i17 | 55;
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        a = i26 % 128;
        if (i26 % 2 == 0) {
            int i27 = i22 & ((b2 & 49) + (i23 | 49));
            int i28 = (~i27) & i2;
            int i29 = (~i2) & i27;
            i3 = i28 ^ i29;
            i4 = i29 & i28;
        } else {
            int i30 = i22 ^ (i23 << 16);
            int i31 = i2 & i30;
            int i32 = (i2 | i30) & (~i31);
            i3 = i32 ^ i31;
            i4 = i32 & i31;
        }
        int i33 = i4 | i3;
        int i34 = i17 & 25;
        int i35 = -(-(i17 | 25));
        int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
        a = i36 % 128;
        int i37 = i36 % 2;
        return i33;
    }

    public static long k(byte[] bArr, int i) {
        long j;
        char c2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-112)) | ((~i3) & 111)) + ((i3 & 111) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int iJ = j(bArr, i);
        int i6 = i & 4;
        int iJ2 = j(bArr, i6 + ((i ^ 4) | i6));
        int i7 = a;
        int i8 = i7 ^ 51;
        int i9 = (i7 & 51) << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            j = ((long) iJ2) & 4294967295L;
            c2 = '(';
        } else {
            j = ((long) iJ2) & 4294967295L;
            c2 = ' ';
        }
        long j2 = j << c2;
        long j3 = iJ;
        int i11 = i7 & 5;
        int i12 = (i7 | 5) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i13 | i12);
        int i15 = i14 % 128;
        b = i15;
        long j4 = i14 % 2 != 0 ? j2 ^ (j3 * 4294967295L) : (j3 & 4294967295L) | j2;
        int i16 = (i15 & (-56)) | ((~i15) & 55);
        int i17 = -(-((i15 & 55) << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        return j4;
    }

    public static void l(long j, byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 49;
        int i5 = i4 + ((i3 ^ 49) | i4);
        a = i5 % 128;
        i((int) (i5 % 2 == 0 ? j >> 69 : j >>> 32), bArr, i);
        int i6 = b + 15;
        a = i6 % 128;
        int i7 = i6 % 2;
        i((int) (j & 4294967295L), bArr, (i & 4) + (i | 4));
        int i8 = b;
        int i9 = i8 & 61;
        int i10 = -(-(i8 | 61));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 98 / 0;
        }
    }

    public static void m(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 ^ 119;
        int i7 = ((((i5 & 119) | i6) << 1) - (~(-i6))) - 1;
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = i8 & 63;
        int i11 = (i8 | 63) & (~i10);
        int i12 = i10 << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (true) {
            byte b2 = bArr[i15];
            int i16 = (i - (~(-(~(-(-i15)))))) - 1;
            byte b3 = bArr2[(i16 ^ (-1)) + (i16 << 1)];
            int i17 = (~b3) & b2;
            int i18 = (~b2) & b3;
            bArr[i15] = (byte) ((i18 & i17) | (i17 ^ i18));
            int i19 = i15 + 1;
            int i20 = b;
            int i21 = ((i20 & 46) + (i20 | 46)) - 1;
            a = i21 % 128;
            if (i21 % 2 == 0) {
                byte b4 = bArr[i19];
                int i22 = -(~(-i19));
                byte b5 = bArr2[(((i | i22) << 1) - (i22 ^ i)) - 1];
                int i23 = b4 & b5;
                bArr[i19] = (byte) (((b4 ^ b5) | i23) & (~i23));
                int i24 = ((i19 & (-76)) | ((~i19) & 75)) + ((i19 & 75) << 1);
                i2 = ((i24 ^ 19) + ((i24 & 19) << 1)) - 1;
            } else {
                bArr[i19] = (byte) (bArr[i19] ^ bArr2[(i - (~(-(-i19)))) - 1]);
                i2 = i15 + 2;
            }
            byte b6 = bArr[i2];
            int i25 = -(-i2);
            int i26 = i & i25;
            int i27 = -(-((i25 ^ i) | i26));
            byte b7 = bArr2[(i26 & i27) + (i27 | i26)];
            int i28 = (~b7) & b6;
            int i29 = (~b6) & b7;
            bArr[i2] = (byte) ((i29 & i28) | (i28 ^ i29));
            int i30 = i2 & (-94);
            int i31 = i30 + ((i2 ^ (-94)) | i30);
            int i32 = (i31 & 95) + (i31 | 95);
            int i33 = (i20 ^ 119) + ((i20 & 119) << 1);
            int i34 = i33 % 128;
            a = i34;
            if (i33 % 2 == 0) {
                byte b8 = bArr[i32];
                byte b9 = bArr2[i / i32];
                int i35 = b8 ^ b9;
                int i36 = b8 & b9;
                bArr[i32] = (byte) ((i36 & i35) | (i35 ^ i36));
            } else {
                byte b10 = bArr[i32];
                int i37 = -(-i32);
                int i38 = i & i37;
                int i39 = ((i ^ i37) | i38) << 1;
                int i40 = -((i37 | i) & (~i38));
                bArr[i32] = (byte) (b10 ^ bArr2[(i39 ^ i40) + ((i40 & i39) << 1)]);
            }
            int i41 = i34 & 75;
            int i42 = i34 | 75;
            int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
            i3 = i43 % 128;
            b = i3;
            int i44 = i43 % 2;
            int i45 = (i32 | 1) + (i32 & 1);
            if (i45 >= 16) {
                break;
            } else {
                i15 = i45;
            }
        }
        int i46 = i3 + 65;
        a = i46 % 128;
        if (i46 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void n(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 2 % 2;
        while (true) {
            i3--;
            if (i3 < 0) {
                int i5 = a;
                int i6 = ((i5 | 71) << 1) - (i5 ^ 71);
                b = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            int i8 = a;
            int i9 = i8 & 45;
            int i10 = ((i8 ^ 45) | i9) << 1;
            int i11 = -((~i9) & (i8 | 45));
            int i12 = (i10 & i11) + (i10 | i11);
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = -(-i3);
            int i15 = (i ^ i14) + ((i & i14) << 1);
            byte b2 = bArr[i15];
            int i16 = i8 + 125;
            b = i16 % 128;
            int i17 = i16 % 2;
            int i18 = -(~i14);
            byte b3 = bArr2[((i2 & i18) + (i18 | i2)) - 1];
            bArr[i15] = (byte) ((b3 & (~b2)) | ((~b3) & b2));
            int i19 = (i8 & 41) + (i8 | 41);
            b = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    public static void p(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 91;
        int i6 = (i4 ^ 91) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2 == 0 ? 1 : 0;
        while (true) {
            byte b2 = bArr[i8];
            byte b3 = bArr2[i8];
            int i9 = b2 & b3;
            bArr[i8] = (byte) (((b2 ^ b3) | i9) & (~i9));
            int i10 = i8 + 1;
            int i11 = a;
            int i12 = i11 & 93;
            int i13 = (i12 - (~(-(-((i11 ^ 93) | i12))))) - 1;
            int i14 = i13 % 128;
            b = i14;
            if (i13 % 2 != 0) {
                byte b4 = bArr[i10];
                byte b5 = bArr2[i10];
                bArr[i10] = (byte) (((~b4) & b5) | ((~b5) & b4));
                int i15 = i10 & 116;
                int i16 = (i10 ^ 116) | i15;
                i = ((i15 | i16) << 1) - (i15 ^ i16);
            } else {
                bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
                i = i8 + 2;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i17 = i & 1;
            int i18 = (((~i17) & (i | 1)) - (~(-(-(i17 << 1))))) - 1;
            int i19 = i14 & 33;
            int i20 = -(-((i14 ^ 33) | i19));
            int i21 = (i19 & i20) + (i19 | i20);
            i2 = i21 % 128;
            a = i2;
            if (i21 % 2 == 0) {
                bArr[i18] = (byte) (bArr[i18] & bArr2[i18]);
            } else {
                byte b6 = bArr[i18];
                byte b7 = bArr2[i18];
                bArr[i18] = (byte) ((b6 | b7) & (~(b6 & b7)));
            }
            int i22 = (i18 & (-2)) | ((~i18) & 1);
            int i23 = (i18 & 1) << 1;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            if (i24 >= 16) {
                break;
            } else {
                i8 = i24;
            }
        }
        int i25 = i2 & 121;
        int i26 = -(-((i2 ^ 121) | i25));
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            throw null;
        }
    }

    public static long q(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = i2 | 121;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        long j8 = j & 1229782938247303441L;
        long j9 = j & 2459565876494606882L;
        long j10 = j & 4919131752989213764L;
        int i7 = i2 + 25;
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 != 0) {
            j3 = j - (-8608480567731124088L);
            j4 = j2 * 1229782938247303441L;
            j5 = j2 - 2459565876494606882L;
        } else {
            j3 = j & (-8608480567731124088L);
            j4 = j2 & 1229782938247303441L;
            j5 = j2 & 2459565876494606882L;
        }
        long j11 = j2 & 4919131752989213764L;
        long j12 = j2 & (-8608480567731124088L);
        int i9 = i8 ^ 17;
        int i10 = (i9 | (i8 & 17)) << 1;
        int i11 = -i9;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        long j13 = ((((j8 * j4) ^ (j9 * j12)) ^ (j10 * j11)) ^ (j3 * j5)) & 1229782938247303441L;
        int i14 = (i8 & (-118)) | (117 & (~i8));
        int i15 = -(-((i8 & 117) << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        int i17 = i16 % 128;
        a = i17;
        if (i16 % 2 == 0) {
            j6 = (j8 | j5) + j9 + j4 + (j10 / j12);
            j7 = j3 / j11;
        } else {
            j6 = ((j8 * j5) ^ (j9 * j4)) ^ (j10 * j12);
            j7 = j3 * j11;
        }
        int i18 = i17 & 77;
        int i19 = i18 + ((i17 ^ 77) | i18);
        int i20 = i19 % 128;
        b = i20;
        int i21 = i19 % 2;
        long j14 = j13 | (2459565876494606882L & (j6 ^ j7)) | (((((j8 * j11) ^ (j9 * j5)) ^ (j10 * j4)) ^ (j3 * j12)) & 4919131752989213764L);
        long j15 = (j8 * j12) ^ (j9 * j11);
        int i22 = (i20 & 19) + (i20 | 19);
        a = i22 % 128;
        long j16 = i22 % 2 == 0 ? j14 % (((j15 ^ (j10 | j5)) | (j3 / j4)) - (-8608480567731124088L)) : j14 | (((j15 ^ (j10 * j5)) ^ (j3 * j4)) & (-8608480567731124088L));
        int i23 = i20 & 59;
        int i24 = ((i20 | 59) & (~i23)) + (i23 << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
        return j16;
    }

    public abstract void A();

    public abstract void B();

    public abstract void C();

    public abstract void D();

    public abstract void E();

    public abstract void F();

    public abstract void G();

    public abstract void H();

    public abstract void I();

    public abstract void J();

    public abstract void K();

    public abstract void L(long j);

    public abstract void M();

    public abstract void N(int i);

    public abstract P O();

    public abstract List P();

    public abstract List Q();

    public abstract J R();

    public abstract void S(Runnable runnable);

    public abstract e T(M m, Map map);

    public abstract List U();

    public abstract List V();

    public abstract List W();

    public abstract List X();

    public abstract List Y();

    public abstract List Z();

    public abstract J aA();

    public abstract P aB();

    public abstract Object aC(Class cls);

    public abstract P aD();

    public abstract P aE();

    public abstract J aF();

    public abstract void aG(Typeface typeface, boolean z);

    public abstract void aH(int i);

    public abstract void aI(c cVar);

    public abstract void aJ(boolean z, String str);

    public abstract P aK();

    public abstract void aL(j jVar);

    public abstract P aM();

    public abstract int aN(long j, String str);

    public abstract J aO();

    public abstract long aP(A a2, long j);

    public abstract int aQ(long j, int i, int i2);

    public abstract J aR();

    public abstract int aS(long j, int i, int i2);

    public abstract P aT();

    public abstract J aU();

    public abstract P aV();

    public abstract P aW();

    public abstract P aX();

    public abstract J aY();

    public abstract P aZ();

    public abstract long aa(int i, int i2, int i3, int i4);

    public abstract List ab();

    public abstract List ac();

    public abstract BeneficiaryEntity ad(String str);

    public abstract long ae(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract NadraFamilyData af(String str);

    public abstract List ag(int i);

    public abstract List ah(String str);

    public abstract List ai(int i);

    public abstract List aj(int i);

    public abstract List ak(int i);

    public abstract Path al(float f, float f2, float f3, float f4);

    public abstract List am(String str);

    public abstract long an();

    public abstract List ao();

    public abstract AbstractC0242a ap();

    public abstract int aq();

    public abstract List ar();

    public abstract P as();

    public abstract J at();

    public abstract P au();

    public abstract long[] av(ArrayList arrayList);

    public abstract void aw(List list);

    public abstract long ax(vilages vilagesVar);

    public abstract void ay(List list);

    public abstract boolean az();

    public abstract h ba();

    public abstract P bb();

    public abstract long bc(tehsil tehsilVar);

    public abstract P bd();

    public abstract h be(AbstractC0242a abstractC0242a);

    public abstract IndividualNadraDataWithRelation bf(String str);

    public abstract P bg();

    public abstract J bh();

    public abstract void bi(BeneficiaryEntity beneficiaryEntity);

    public abstract void bj(NadraFamilyData nadraFamilyData);

    public abstract void bk(locality localityVar);

    public abstract long bl(district districtVar);

    public abstract long bm(TabletLogEntity tabletLogEntity);

    public abstract void bn(survey_count survey_countVar);

    public abstract void bo(ArrayList arrayList);

    public abstract void bp(survey surveyVar);

    public abstract J bq();

    public abstract void br(offlinesurvey offlinesurveyVar);

    public abstract void bs(offline_survey_count offline_survey_countVar);

    public abstract long bt(province provinceVar);

    public abstract void bu(List list);

    public abstract void bv(sync syncVar);

    public abstract P bw();

    public abstract not_at_home r(String str, String str2, String str3);

    public abstract J s();

    public abstract P t();

    public abstract P u();

    public abstract P v();

    public abstract P w();

    public abstract P x();

    public abstract P y();

    public abstract J z();

    public static void d(Class cls) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-86)) | ((~i2) & 85);
        int i4 = -(-((i2 & 85) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Interface can't be instantiated! Interface name: ");
            sbW.append(cls.getName());
            throw new UnsupportedOperationException(sbW.toString());
        }
        int i7 = b;
        int i8 = ((i7 & 16) + (i7 | 16)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        if (Modifier.isAbstract(modifiers)) {
            StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("Abstract class can't be instantiated! Class name: ");
            sbW2.append(cls.getName());
            throw new UnsupportedOperationException(sbW2.toString());
        }
        int i10 = b;
        int i11 = i10 & 53;
        int i12 = -(-((i10 ^ 53) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long j;
        long jReverse;
        long jReverse2;
        long jReverse3;
        long jReverse4;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = -(-((i2 ^ 85) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr2[0];
        long j5 = jArr2[1];
        long jReverse5 = Long.reverse(j2);
        int i7 = a + 51;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            jReverse = Long.reverse(j3);
            j = j3;
            jReverse2 = Long.reverse(j4);
            jReverse3 = Long.reverse(j5);
            jReverse4 = Long.reverse(q(jReverse5, jReverse2));
            int i8 = 36 / 0;
        } else {
            j = j3;
            jReverse = Long.reverse(j);
            jReverse2 = Long.reverse(j4);
            jReverse3 = Long.reverse(j5);
            jReverse4 = Long.reverse(q(jReverse5, jReverse2));
        }
        long j6 = jReverse3;
        long jQ = q(j2, j4) << 1;
        long jReverse6 = Long.reverse(q(jReverse, j6));
        int i9 = b;
        int i10 = i9 ^ 75;
        int i11 = (i9 & 75) << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        long j7 = j;
        long jQ2 = q(j7, j5);
        long j8 = jQ2 << 1;
        long jReverse7 = Long.reverse(q(jReverse5 ^ jReverse, j6 ^ jReverse2));
        int i14 = a;
        int i15 = (((i14 | 38) << 1) - (i14 ^ 38)) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
        long jQ3 = (q(j2 ^ j7, j4 ^ j5) << 1) ^ ((jReverse6 ^ jQ) ^ j8);
        int i17 = a;
        int i18 = i17 & 11;
        int i19 = ((i17 ^ 11) | i18) << 1;
        int i20 = -((i17 | 11) & (~i18));
        int i21 = (i19 & i20) + (i20 | i19);
        int i22 = i21 % 128;
        b = i22;
        int i23 = i21 % 2;
        long j9 = jQ3 ^ ((jQ2 << 63) ^ (jQ2 << 58));
        jArr[0] = jReverse4 ^ ((j9 >>> 7) ^ (((j9 >>> 1) ^ j9) ^ (j9 >>> 2)));
        int i24 = ((i22 & (-62)) | ((~i22) & 61)) + ((i22 & 61) << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
        int i26 = i22 & 85;
        int i27 = i26 + ((i22 ^ 85) | i26);
        int i28 = i27 % 128;
        a = i28;
        int i29 = i27 % 2;
        jArr[1] = ((jReverse7 ^ ((jQ ^ jReverse4) ^ jReverse6)) ^ (((j8 ^ (j8 >>> 1)) ^ (j8 >>> 2)) ^ (j8 >>> 7))) ^ (((j9 << 62) ^ (j9 << 63)) ^ (j9 << 57));
        int i30 = ((i28 & (-12)) | ((~i28) & 11)) + ((i28 & 11) << 1);
        b = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 36 / 0;
        }
    }
}
