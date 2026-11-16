package ivas.gov.bisp.enumeration.p006af;

import ivas.gov.bisp.enumeration.bN.D;
import ivas.gov.bisp.enumeration.bS.aU;
import ivas.gov.bisp.enumeration.bV.B;
import ivas.gov.bisp.enumeration.bV.U;
import ivas.gov.bisp.enumeration.o000oo0o.o0OoOoOo;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static int a = 0;
    private static int b = 1;
    public final InputStream c;
    public int d;
    public int e;
    public o0OoOoOo<? super String, Boolean> f;

    public final String d() {
        String strAr;
        int iAvailable;
        int i;
        List listAs;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 & 73) - (~(-(-(i4 | 73))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 8192;
        if (this.e == -1) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.c, U.c), 8192);
            int i8 = a;
            int i9 = i8 & 15;
            int i10 = i9 + ((i8 ^ 15) | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            try {
                strAr = r.W(bufferedReader);
                r.k(bufferedReader, null);
                int i12 = a;
                int i13 = i12 & 39;
                int i14 = ((i12 ^ 39) | i13) << 1;
                int i15 = -((i12 | 39) & (~i13));
                int i16 = (i14 & i15) + (i15 | i14);
                b = i16 % 128;
                int i17 = i16 % 2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r.k(bufferedReader, th);
                    throw th2;
                }
            }
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.e;
            InputStream inputStream = this.c;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                int i18 = b;
                int i19 = i18 & 125;
                int i20 = ((i18 ^ 125) | i19) << 1;
                int i21 = -((~i19) & (i18 | 125));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                a = i22 % 128;
                int i23 = i22 % 2;
                int i24 = ((i18 | 95) << 1) - (i18 ^ 95);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 4 / 5;
                }
                while (true) {
                    int i26 = b;
                    int i27 = (((i26 | 88) << 1) - (i26 ^ 88)) - 1;
                    a = i27 % 128;
                    int i28 = i27 % i2;
                    int i29 = 0;
                    while (System.currentTimeMillis() < jCurrentTimeMillis + j) {
                        int i30 = a;
                        int i31 = (i30 ^ 19) + ((i30 & 19) << 1);
                        int i32 = i31 % 128;
                        b = i32;
                        int i33 = i31 % i2;
                        if (i29 >= i7) {
                            break;
                        }
                        int i34 = (-2) - (((i32 ^ 100) + ((i32 & 100) << 1)) ^ (-1));
                        a = i34 % 128;
                        if (i34 % 2 != 0) {
                            iAvailable = this.c.available();
                            i = 25388;
                        } else {
                            iAvailable = this.c.available();
                            i = i7;
                        }
                        int i35 = -i29;
                        int i36 = i & i35;
                        int i37 = (~i36) & (i35 | i);
                        int i38 = i36 << 1;
                        int i39 = inputStream.read(bArr, i29, Math.min(iAvailable, (i37 ^ i38) + ((i37 & i38) << 1)));
                        if (i39 == -1) {
                            break;
                        }
                        int i40 = b;
                        int i41 = i40 + 17;
                        a = i41 % 128;
                        int i42 = i41 % 2;
                        int i43 = -(-i39);
                        int i44 = i29 | i43;
                        i29 = (i44 << 1) - ((~(i43 & i29)) & i44);
                        int i45 = i40 + 41;
                        a = i45 % 128;
                        int i46 = i45 % 2;
                        i2 = 2;
                        i7 = 8192;
                    }
                    if (i29 == -1) {
                        break;
                    }
                    int i47 = b;
                    int i48 = ((i47 | 65) << 1) - (i47 ^ 65);
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    byteArrayOutputStream.write(bArr, 0, i29);
                    int i50 = b;
                    int i51 = i50 & 49;
                    int i52 = (((i50 | 49) & (~i51)) - (~(-(-(i51 << 1))))) - 1;
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    i2 = 2;
                    i7 = 8192;
                }
                String string = byteArrayOutputStream.toString();
                r.k(inputStream, null);
                int i54 = b;
                int i55 = i54 ^ 105;
                int i56 = ((i54 & 105) | i55) << 1;
                int i57 = -i55;
                int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                a = i58 % 128;
                int i59 = i58 % 2;
                ivas.gov.bisp.enumeration.O.r.m(string, "inputStream.use { input …tput.toString()\n        }");
                int i60 = b + 69;
                a = i60 % 128;
                if (i60 % 2 != 0) {
                    int i61 = 2 / 5;
                }
                strAr = string;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    r.k(inputStream, th3);
                    throw th4;
                }
            }
        }
        o0OoOoOo<? super String, Boolean> o0oooooo = this.f;
        if (o0oooooo != null) {
            int i62 = (-2) - ((b + 82) ^ (-1));
            a = i62 % 128;
            int i63 = i62 % 2;
            List listAu = B.au(strAr, new String[]{"\\r?\\n"}, false, 0, 6);
            List arrayList = new ArrayList();
            int i64 = a;
            int i65 = (((i64 | 126) << 1) - (i64 ^ 126)) - 1;
            b = i65 % 128;
            int i66 = i65 % 2;
            if (i66 == 0) {
                int i67 = 71 / 0;
            }
            for (Object obj : listAu) {
                int i68 = b;
                int i69 = i68 & 69;
                int i70 = (i68 | 69) & (~i69);
                int i71 = i69 << 1;
                int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                a = i72 % 128;
                int i73 = i72 % 2;
                Object objE = o0oooooo.e(obj);
                int i74 = a;
                int i75 = i74 ^ 13;
                int i76 = (i74 & 13) << 1;
                int i77 = (i75 & i76) + (i76 | i75);
                b = i77 % 128;
                int i78 = i77 % 2;
                if (((Boolean) objE).booleanValue()) {
                    int i79 = a;
                    int i80 = (i79 & 79) + (i79 | 79);
                    b = i80 % 128;
                    int i81 = i80 % 2;
                    arrayList.add(obj);
                    int i82 = a + 41;
                    b = i82 % 128;
                    int i83 = i82 % 2;
                }
            }
            int i84 = this.d;
            if (i84 != -1) {
                int i85 = a + 13;
                b = i85 % 128;
                if (i85 % 2 == 0) {
                    listAs = D.as(arrayList, i84);
                    int i86 = 21 / 0;
                } else {
                    listAs = D.as(arrayList, i84);
                }
                arrayList = listAs;
                int i87 = b;
                int i88 = (((i87 | 126) << 1) - (i87 ^ 126)) - 1;
                a = i88 % 128;
                if (i88 % 2 != 0) {
                    int i89 = 5 / 2;
                }
            }
            strAr = D.ar(arrayList, "\n", null, null, 0, null, null, 62);
            int i90 = b;
            int i91 = ((i90 ^ 116) + ((i90 & 116) << 1)) - 1;
            a = i91 % 128;
            if (i91 % 2 != 0) {
                throw null;
            }
        } else if (this.d != -1) {
            int i92 = b;
            int i93 = (i92 & 21) + (i92 | 21);
            int i94 = i93 % 128;
            a = i94;
            int i95 = i93 % 2;
            String[] strArr = {"\\r?\\n"};
            int i96 = i94 & 53;
            int i97 = ((i94 ^ 53) | i96) << 1;
            int i98 = -((i94 | 53) & (~i96));
            int i99 = (i97 & i98) + (i98 | i97);
            b = i99 % 128;
            List listAs2 = i99 % 2 == 0 ? D.as(B.au(strAr, strArr, true, 1, 54), this.d) : D.as(B.au(strAr, strArr, false, 0, 6), this.d);
            int i100 = a;
            int i101 = ((i100 ^ 26) + ((i100 & 26) << 1)) - 1;
            b = i101 % 128;
            strAr = i101 % 2 == 0 ? D.ar(listAs2, "\n", null, null, 1, null, null, 5) : D.ar(listAs2, "\n", null, null, 0, null, null, 62);
            int i102 = a;
            int i103 = (((i102 & (-90)) | ((~i102) & 89)) - (~(-(-((i102 & 89) << 1))))) - 1;
            b = i103 % 128;
            int i104 = i103 % 2;
        }
        int i105 = (-2) - ((a + 108) ^ (-1));
        b = i105 % 128;
        if (i105 % 2 != 0) {
            return strAr;
        }
        throw null;
    }

    public j(InputStream inputStream, int i, int i2, aU aUVar, int i3) {
        if ((i3 & 2) != 0) {
            int i4 = a;
            int i5 = ((i4 ^ 100) + ((i4 & 100) << 1)) - 1;
            int i6 = i5 % 128;
            b = i6;
            if (i5 % 2 == 0) {
                int i7 = 9 / 0;
            }
            int i8 = i6 + 71;
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            i = -1;
        }
        if ((i3 & 4) != 0) {
            int i11 = b;
            int i12 = ((i11 | 81) << 1) - (i11 ^ 81);
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((i11 ^ 61) | (i11 & 61)) << 1;
            int i15 = -(((~i11) & 61) | (i11 & (-62)));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 2 % 2;
            }
            i2 = -1;
        }
        ivas.gov.bisp.enumeration.O.r.n(inputStream, "inputStream");
        this.c = inputStream;
        this.d = i;
        this.e = i2;
        this.f = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(File file) {
        this(new FileInputStream(file), 0, 0, null, 14);
        ivas.gov.bisp.enumeration.O.r.n(file, "file");
    }
}
