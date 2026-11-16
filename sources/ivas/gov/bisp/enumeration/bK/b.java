package ivas.gov.bisp.enumeration.bK;

import android.util.Base64;
import ivas.gov.bisp.enumeration.o00O0O0o.OooO;
import ivas.gov.bisp.enumeration.o00O0O0o.OooOO0O;
import ivas.gov.bisp.enumeration.p070cp.j;
import ivas.gov.bisp.enumeration.p072cr.c;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final byte[] a;
    public static final int b = 231;
    private static int c = 1;
    private static int d;
    public static int e;

    static {
        byte[] bArr = {65, 19, -61, 123, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -40, -21, -1, -21, 0, 10, 16, -18, -16, 7, -14, -1};
        a = bArr;
        int i = (~0) & 51;
        int i2 = -(-0);
        int i3 = (i & i2) + (i | i2);
        c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 % 5;
        } else {
            int i5 = 2 % 2;
        }
        int i6 = 77 << 1;
        int i7 = -((~0) & 77);
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        c = i8 % 128;
        int i9 = i8 % 2;
        try {
            byte b2 = bArr[12];
            byte b3 = b2;
            byte b4 = b3;
            int i10 = (0 - (-20)) - 1;
            c = i10 % 128;
            int i11 = i10 % 2;
            int i12 = -(b3 * 4);
            int i13 = i12 ^ 3;
            int i14 = -(-((i12 & 3) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            int i16 = 47 % 128;
            c = i16;
            int i17 = 47 % 2;
            int i18 = b2 * 2;
            int i19 = (i18 ^ (-21)) + ((i18 & (-21)) << 1) + 127;
            int i20 = ((i16 | 61) << 1) - (i16 ^ 61);
            d = i20 % 128;
            int i21 = i20 % 2;
            int i22 = -(b4 * 3);
            int i23 = ((26 | i22) << 1) - (i22 ^ 26);
            byte[] bArr2 = new byte[i23];
            int i24 = ((i23 ^ (-126)) | (i23 & (-126))) << 1;
            int i25 = -(((~i23) & (-126)) | (i23 & 125));
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            int i27 = i26 & 125;
            int i28 = -(-(i26 | 125));
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            int i30 = 0;
            while (true) {
                bArr2[i30] = (byte) i19;
                if (i30 == i29) {
                    break;
                }
                i15 = ((i15 & 1) << 1) + (i15 ^ 1);
                int i31 = i30 + 9;
                i30 = ((i31 | (-8)) << 1) - (((~i31) & (-8)) | (i31 & 7));
                byte b5 = bArr[i15];
                int i32 = c + 17;
                d = i32 % 128;
                int i33 = i32 % 2;
                int i34 = 2 % 2;
                int i35 = i19 + (-b5);
                int i36 = (i35 & 2) | ((~i35) & (-3));
                int i37 = (i35 & (-3)) << 1;
                i19 = (i36 ^ i37) + ((i36 & i37) << 1);
                int i38 = c;
                int i39 = (i38 & 3) + (i38 | 3);
                d = i39 % 128;
                if (i39 % 2 == 0) {
                    int i40 = 2 % 2;
                }
            }
            String str = new String(bArr2, 0);
            int i41 = c;
            int i42 = i41 & 21;
            int i43 = ((((i41 ^ 21) | i42) << 1) - (~(-((i41 | 21) & (~i42))))) - 1;
            d = i43 % 128;
            if (i43 % 2 == 0) {
                int i44 = 2 % 2;
            }
            Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            int i45 = d;
            int i46 = i45 & 67;
            int i47 = -(-((i45 ^ 67) | i46));
            int i48 = (i46 & i47) + (i47 | i46);
            int i49 = i48 % 128;
            c = i49;
            int i50 = i48 % 2;
            e = 128;
            int i51 = i49 & 45;
            int i52 = (i49 ^ 45) | i51;
            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
            d = i53 % 128;
            if (i53 % 2 != 0) {
                int i54 = 51 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static byte[] b(String str) {
        int length;
        byte[] bArr;
        int i;
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 & 35;
        int i5 = (i3 ^ 35) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        c = i6 % 128;
        if (i6 % 2 == 0) {
            length = str.length();
            bArr = new byte[length % 4];
            i = 1;
        } else {
            length = str.length();
            bArr = new byte[length / 2];
            i = 0;
        }
        int i7 = c + 45;
        d = i7 % 128;
        int i8 = i7 % 2;
        while (i < length) {
            int i9 = c;
            int i10 = ((i9 ^ 51) | (i9 & 51)) << 1;
            int i11 = -(((~i9) & 51) | (i9 & (-52)));
            int i12 = (i10 & i11) + (i11 | i10);
            d = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i / 2;
            char cCharAt = str.charAt(i);
            int i15 = c;
            int i16 = ((i15 & 64) + (i15 | 64)) - 1;
            d = i16 % 128;
            int i17 = i16 % 2;
            int iDigit = Character.digit(cCharAt, 16);
            int i18 = d;
            int i19 = ((((i18 ^ 115) | (i18 & 115)) << 1) - (~(-(((~i18) & 115) | (i18 & (-116)))))) - 1;
            c = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i ^ 1;
            int i22 = (i & 1) << 1;
            int iDigit2 = Character.digit(str.charAt(((i21 | i22) << 1) - (i21 ^ i22)), 16);
            int i23 = c;
            int i24 = i23 ^ 65;
            int i25 = -(-((i23 & 65) << 1));
            int i26 = (i24 & i25) + (i24 | i25);
            d = i26 % 128;
            if (i26 % 2 != 0) {
                bArr[i14] = (byte) (iDigit2 / (iDigit << 4));
                int i27 = i & 65;
                int i28 = (i27 - (~(-(-((i ^ 65) | i27))))) - 1;
                int i29 = i28 & 55;
                int i30 = ((i28 ^ 55) | i29) << 1;
                int i31 = -((i28 | 55) & (~i29));
                i = (i30 & i31) + (i30 | i31);
            } else {
                bArr[i14] = (byte) (iDigit2 + (iDigit << 4));
                int i32 = i & 14;
                int i33 = (((i | 14) & (~i32)) - (~(-(-(i32 << 1))))) - 1;
                i = (((i33 & 11) | ((~i33) & (-12))) - (~((i33 & (-12)) << 1))) - 1;
            }
            int i34 = i23 & 13;
            int i35 = -(-((i23 ^ 13) | i34));
            int i36 = (i34 & i35) + (i34 | i35);
            d = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = d;
        int i39 = ((i38 ^ 125) | (i38 & 125)) << 1;
        int i40 = -(((~i38) & 125) | (i38 & (-126)));
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        c = i41 % 128;
        int i42 = i41 % 2;
        return bArr;
    }

    public static String d(String str, byte[] bArr, byte[] bArr2) {
        String strEncodeToString;
        int i = 2 % 2;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            j jVar = new j(new ivas.gov.bisp.enumeration.dh.j());
            ivas.gov.bisp.enumeration.p072cr.j jVar2 = new ivas.gov.bisp.enumeration.p072cr.j(new c(bArr), e, bArr2, null);
            int i2 = d;
            int i3 = (i2 & (-74)) | ((~i2) & 73);
            int i4 = (i2 & 73) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            c = i5 % 128;
            if (i5 % 2 == 0) {
                jVar.j(false, jVar2);
            } else {
                jVar.j(true, jVar2);
            }
            byte[] bArr3 = new byte[jVar.h(bytes.length)];
            int iM = jVar.m(bytes, 0, bytes.length, bArr3, 0);
            int i6 = d;
            int i7 = i6 & 51;
            int i8 = i7 + ((i6 ^ 51) | i7);
            c = i8 % 128;
            if (i8 % 2 == 0) {
                jVar.e(bArr3, iM);
                strEncodeToString = Base64.encodeToString(bArr3, 1);
            } else {
                jVar.e(bArr3, iM);
                strEncodeToString = Base64.encodeToString(bArr3, 0);
            }
            int i9 = c;
            int i10 = ((i9 ^ 97) | (i9 & 97)) << 1;
            int i11 = -(((~i9) & 97) | (i9 & (-98)));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            d = i12 % 128;
            int i13 = i12 % 2;
        } catch (UnsupportedEncodingException | IllegalArgumentException | IllegalStateException | OooO | OooOO0O unused) {
            strEncodeToString = BuildConfig.FLAVOR;
            int i14 = d;
            int i15 = i14 & 119;
            int i16 = (i14 | 119) & (~i15);
            int i17 = i15 << 1;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            c = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = d;
        int i21 = i20 & 49;
        int i22 = i20 | 49;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        c = i23 % 128;
        int i24 = i23 % 2;
        return strEncodeToString;
    }

    public static String c(String str, byte[] bArr, byte[] bArr2) {
        String str2;
        int i = 2 % 2;
        Object obj = null;
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            j jVar = new j(new ivas.gov.bisp.enumeration.dh.j());
            ivas.gov.bisp.enumeration.p072cr.j jVar2 = new ivas.gov.bisp.enumeration.p072cr.j(new c(bArr), e, bArr2, null);
            int i2 = c;
            int i3 = i2 & 41;
            int i4 = (i3 - (~(-(-((i2 ^ 41) | i3))))) - 1;
            d = i4 % 128;
            int i5 = i4 % 2;
            jVar.j(false, jVar2);
            byte[] bArr3 = new byte[jVar.h(bArrDecode.length)];
            int i6 = d;
            int i7 = i6 & 95;
            int i8 = -(-((i6 ^ 95) | i7));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            c = i9 % 128;
            jVar.e(bArr3, i9 % 2 == 0 ? jVar.m(bArrDecode, 1, bArrDecode.length, bArr3, 0) : jVar.m(bArrDecode, 0, bArrDecode.length, bArr3, 0));
            str2 = new String(bArr3, Charset.forName("UTF-8"));
            int i10 = d;
            int i11 = i10 & 43;
            int i12 = i11 + ((i10 ^ 43) | i11);
            c = i12 % 128;
            int i13 = i12 % 2;
        } catch (IllegalArgumentException | IllegalStateException | OooO | OooOO0O unused) {
            int i14 = d;
            int i15 = ((i14 ^ 73) | (i14 & 73)) << 1;
            int i16 = -(((~i14) & 73) | (i14 & (-74)));
            int i17 = (i15 & i16) + (i16 | i15);
            c = i17 % 128;
            int i18 = i17 % 2;
            str2 = BuildConfig.FLAVOR;
        }
        int i19 = c;
        int i20 = (i19 ^ 57) + ((i19 & 57) << 1);
        d = i20 % 128;
        if (i20 % 2 == 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }
}
