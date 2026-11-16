package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.preference.PreferenceManager;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.sqlite.db.SupportSQLiteQuery;
import ivas.gov.bisp.enumeration.K.J;
import ivas.gov.bisp.enumeration.bM.L;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0321u implements SupportSQLiteQuery {
    private static int a = 1;
    private static int b;
    public Object c;
    public Object d;

    public C0321u(int i) {
        char c;
        if (i != 5) {
            return;
        }
        this.c = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.d = new byte[128];
        int i2 = 2 % 2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte[] bArr = (byte[]) this.d;
            if (i4 >= bArr.length) {
                break;
            }
            int i5 = b;
            int i6 = ((i5 | 89) << 1) - (i5 ^ 89);
            a = i6 % 128;
            int i7 = i6 % 2;
            bArr[i4] = -1;
            int i8 = i4 & 3;
            int i9 = (i4 ^ 3) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            int i11 = i10 & (-2);
            int i12 = (~i11) & (i10 | (-2));
            int i13 = -(-(i11 << 1));
            i4 = ((i12 | i13) << 1) - (i13 ^ i12);
            int i14 = i5 + 81;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 2 % 4;
            }
        }
        while (true) {
            byte[] bArr2 = (byte[]) this.c;
            if (i3 >= bArr2.length) {
                break;
            }
            int i16 = b;
            int i17 = i16 & 39;
            int i18 = (((i16 ^ 39) | i17) << 1) - ((i16 | 39) & (~i17));
            int i19 = i18 % 128;
            a = i19;
            if (i18 % 2 == 0) {
                ((byte[]) this.d)[bArr2[i3]] = (byte) i3;
                int i20 = (i3 | 53) << 1;
                int i21 = -(i3 ^ 53);
                i3 = (i20 ^ i21) + ((i21 & i20) << 1);
            } else {
                ((byte[]) this.d)[bArr2[i3]] = (byte) i3;
                i3 = (i3 ^ 1) + ((i3 & 1) << 1);
            }
            int i22 = ((i19 ^ 49) | (i19 & 49)) << 1;
            int i23 = -(((~i19) & 49) | (i19 & (-50)));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        byte[] bArr3 = (byte[]) this.d;
        int i26 = a;
        int i27 = i26 ^ 57;
        int i28 = ((i26 & 57) | i27) << 1;
        int i29 = -i27;
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        int i31 = i30 % 128;
        b = i31;
        int i32 = i30 % 2;
        bArr3[65] = bArr3[97];
        bArr3[66] = bArr3[98];
        int i33 = i31 & 121;
        int i34 = ((i31 ^ 121) | i33) << 1;
        int i35 = -((i31 | 121) & (~i33));
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        int i37 = i36 % 128;
        a = i37;
        if (i36 % 2 == 0) {
            bArr3[42] = bArr3[67];
            c = '`';
        } else {
            bArr3[67] = bArr3[99];
            c = 'D';
        }
        int i38 = i37 & 105;
        int i39 = -(-((i37 ^ 105) | i38));
        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
        int i41 = i40 % 128;
        b = i41;
        int i42 = i40 % 2;
        bArr3[c] = bArr3[100];
        bArr3[69] = bArr3[101];
        int i43 = i41 ^ 109;
        int i44 = ((i41 & 109) | i43) << 1;
        int i45 = -i43;
        int i46 = (i44 & i45) + (i45 | i44);
        a = i46 % 128;
        int i47 = i46 % 2;
        bArr3[70] = bArr3[102];
        int i48 = ((i41 & 10) + (i41 | 10)) - 1;
        a = i48 % 128;
        if (i48 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int b() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 65) + ((i3 & 65) << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Object obj = this.d;
        if (((Object[]) obj) == null) {
            int i7 = (-2) - ((i5 + 56) ^ (-1));
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = (-2) - ((((i8 | 44) << 1) - (i8 ^ 44)) ^ (-1));
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 / 2;
            }
            i = 0;
        } else {
            int length = ((Object[]) obj).length;
            int i12 = i3 + 19;
            a = i12 % 128;
            int i13 = i12 % 2;
            i = length;
        }
        int i14 = b;
        int i15 = i14 & 93;
        int i16 = i15 + ((i14 ^ 93) | i15);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            return i;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 25;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = (String) this.c;
        int i5 = i2 + 87;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0118  */
    /* JADX WARN: Code duplicated, block: B:45:0x0159  */
    /* JADX WARN: Code duplicated, block: B:46:0x0167  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x0217  */
    /* JADX WARN: Code duplicated, block: B:66:0x021e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0259  */
    /* JADX WARN: Code duplicated, block: B:75:0x0288  */
    /* JADX WARN: Code duplicated, block: B:86:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r3
  0x0029: PHI (r3v5 java.lang.Object[]) = (r3v4 java.lang.Object[]), (r3v9 java.lang.Object[]) binds: [B:8:0x0027, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void e(J j) {
        Object[] objArr;
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        StringBuilder sb;
        int i11;
        long j2;
        int i12;
        long jByteValue;
        int i13;
        int i14;
        int i15;
        int i16 = 2 % 2;
        int i17 = a;
        int i18 = i17 & 97;
        int i19 = (i17 ^ 97) | i18;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        int i21 = i20 % 128;
        b = i21;
        Object obj2 = null;
        if (i20 % 2 != 0) {
            objArr = (Object[]) this.d;
            int i22 = 53 / 0;
            if (objArr != null) {
                length = objArr.length;
                i = (((i21 | 98) << 1) - (i21 ^ 98)) - 1;
                a = i % 128;
                if (i % 2 == 0) {
                    int i23 = 4 % 2;
                }
                i2 = 0;
                while (i2 < length) {
                    i3 = b;
                    i4 = (((i3 ^ 51) | (i3 & 51)) << 1) - ((i3 & (-52)) | ((~i3) & 51));
                    i5 = i4 % 128;
                    a = i5;
                    if (i4 % 2 == 0) {
                        obj = objArr[i2];
                        int i24 = i2 & 130;
                        int i25 = (i2 ^ 130) | i24;
                        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                        int i27 = i26 & (-102);
                        i2 = i27 + ((i26 ^ (-102)) | i27);
                        if (obj == null) {
                            int i28 = i5 + 17;
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            j.bindNull(i2);
                            int i30 = a;
                            int i31 = i30 & 73;
                            int i32 = -(-((i30 ^ 73) | i31));
                            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                            b = i33 % 128;
                            int i34 = i33 % 2;
                        } else if (obj instanceof byte[]) {
                            int i35 = ((i3 ^ 79) | (i3 & 79)) << 1;
                            int i36 = -(((~i3) & 79) | (i3 & (-80)));
                            i6 = ((i35 | i36) << 1) - (i36 ^ i35);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                j.bindBlob(i2, (byte[]) obj);
                                int i37 = 11 / 0;
                            } else {
                                j.bindBlob(i2, (byte[]) obj);
                            }
                        } else {
                            if (!(!(obj instanceof Float))) {
                                int i38 = ((i3 | 73) << 1) - (i3 ^ 73);
                                a = i38 % 128;
                                int i39 = i38 % 2;
                                j.bindDouble(i2, ((Float) obj).floatValue());
                                int i40 = a;
                                int i41 = i40 & 63;
                                i7 = (i40 | 63) & (~i41);
                                i8 = -(-(i41 << 1));
                                i9 = i7 | i8;
                            } else if (obj instanceof Double) {
                                i15 = (((i3 ^ 67) | (i3 & 67)) << 1) - (((~i3) & 67) | (i3 & (-68)));
                                a = i15 % 128;
                                if (i15 % 2 != 0) {
                                    j.bindDouble(i2, ((Double) obj).doubleValue());
                                    throw null;
                                }
                                j.bindDouble(i2, ((Double) obj).doubleValue());
                                int i42 = a;
                                int i43 = i42 & 83;
                                int i44 = (((i42 ^ 83) | i43) << 1) - ((i42 | 83) & (~i43));
                                b = i44 % 128;
                                int i45 = i44 % 2;
                            } else if (!(obj instanceof Long)) {
                                int i46 = ((i5 ^ 57) | (i5 & 57)) << 1;
                                int i47 = -(((~i5) & 57) | (i5 & (-58)));
                                int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                                b = i48 % 128;
                                int i49 = i48 % 2;
                                j.bindLong(i2, ((Long) obj).longValue());
                                int i50 = a + 19;
                                b = i50 % 128;
                                int i51 = i50 % 2;
                            } else if (obj instanceof Integer) {
                                i14 = ((i3 & (-116)) | ((~i3) & 115)) + ((i3 & 115) << 1);
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    j.bindLong(i2, ((Integer) obj).intValue());
                                    int i52 = 57 / 0;
                                } else {
                                    j.bindLong(i2, ((Integer) obj).intValue());
                                }
                                int i53 = a;
                                int i54 = ((i53 & 43) - (~(i53 | 43))) - 1;
                                b = i54 % 128;
                                int i55 = i54 % 2;
                            } else if (obj instanceof Short) {
                                int i56 = i5 & 109;
                                int i57 = (i56 - (~(-(-((i5 ^ 109) | i56))))) - 1;
                                b = i57 % 128;
                                int i58 = i57 % 2;
                                j.bindLong(i2, ((Short) obj).shortValue());
                                int i59 = a + 99;
                                b = i59 % 128;
                                int i60 = i59 % 2;
                            } else if (!(obj instanceof Byte)) {
                                int i61 = (i5 | 121) << 1;
                                int i62 = -(((~i5) & 121) | (i5 & (-122)));
                                i12 = (i61 ^ i62) + ((i61 & i62) << 1);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    ((Byte) obj).byteValue();
                                    obj2.hashCode();
                                    throw null;
                                }
                                jByteValue = ((Byte) obj).byteValue();
                                int i63 = a;
                                int i64 = i63 & 55;
                                int i65 = (i63 ^ 55) | i64;
                                i13 = (i64 ^ i65) + ((i65 & i64) << 1);
                                b = i13 % 128;
                                if (i13 % 2 != 0) {
                                    j.bindLong(i2, jByteValue);
                                    int i66 = 32 / 0;
                                } else {
                                    j.bindLong(i2, jByteValue);
                                }
                            } else if (!(obj instanceof String)) {
                                i10 = (i5 & 9) + (i5 | 9);
                                b = i10 % 128;
                                if (i10 % 2 == 0) {
                                    j.bindString(i2, (String) obj);
                                    throw null;
                                }
                                j.bindString(i2, (String) obj);
                                int i67 = a;
                                i8 = i67 & 111;
                                i7 = (i67 ^ 111) | i8;
                                i9 = i8 | i7;
                            } else {
                                if (obj instanceof Boolean) {
                                    sb = new StringBuilder();
                                    int i68 = b;
                                    i11 = ((i68 & 114) + (i68 | 114)) - 1;
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        sb.append("Cannot bind ");
                                        sb.append(obj);
                                        throw null;
                                    }
                                    sb.append("Cannot bind ");
                                    sb.append(obj);
                                    sb.append(" at index ");
                                    sb.append(i2);
                                    int i69 = a;
                                    int i70 = i69 & 71;
                                    int i71 = i70 + ((i69 ^ 71) | i70);
                                    b = i71 % 128;
                                    int i72 = i71 % 2;
                                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
                                    sb.append(" string");
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                int i73 = (i3 ^ 47) + ((i3 & 47) << 1);
                                a = i73 % 128;
                                int i74 = i73 % 2;
                                if (!((Boolean) obj).booleanValue()) {
                                    int i75 = b;
                                    int i76 = (i75 & 69) + (i75 | 69);
                                    a = i76 % 128;
                                    int i77 = i76 % 2;
                                    j2 = 0;
                                } else {
                                    int i78 = a;
                                    int i79 = i78 & 99;
                                    int i80 = (i79 - (~(-(-((i78 ^ 99) | i79))))) - 1;
                                    b = i80 % 128;
                                    int i81 = i80 % 2;
                                    int i82 = i78 + 49;
                                    b = i82 % 128;
                                    int i83 = i82 % 2;
                                    j2 = 1;
                                }
                                j.bindLong(i2, j2);
                                int i84 = b + 83;
                                a = i84 % 128;
                                int i85 = i84 % 2;
                            }
                            int i86 = (i9 << 1) - (i7 ^ i8);
                            b = i86 % 128;
                            int i87 = i86 % 2;
                        }
                    } else {
                        obj = objArr[i2];
                        int i88 = (((i2 & 101) | ((~i2) & (-102))) - (~(-(-((i2 & (-102)) << 1))))) - 1;
                        i2 = (((i88 | 104) << 1) - (i88 ^ 104)) - 1;
                        if (obj == null) {
                            int i210 = i5 + 17;
                            b = i210 % 128;
                            int i211 = i210 % 2;
                            j.bindNull(i2);
                            int i310 = a;
                            int i311 = i310 & 73;
                            int i312 = -(-((i310 ^ 73) | i311));
                            int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                            b = i313 % 128;
                            int i314 = i313 % 2;
                        } else if (obj instanceof byte[]) {
                            int i315 = ((i3 ^ 79) | (i3 & 79)) << 1;
                            int i316 = -(((~i3) & 79) | (i3 & (-80)));
                            i6 = ((i315 | i316) << 1) - (i316 ^ i315);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                j.bindBlob(i2, (byte[]) obj);
                                int i317 = 11 / 0;
                            } else {
                                j.bindBlob(i2, (byte[]) obj);
                            }
                        } else {
                            if (!(!(obj instanceof Float))) {
                                int i318 = ((i3 | 73) << 1) - (i3 ^ 73);
                                a = i318 % 128;
                                int i319 = i318 % 2;
                                j.bindDouble(i2, ((Float) obj).floatValue());
                                int i410 = a;
                                int i411 = i410 & 63;
                                i7 = (i410 | 63) & (~i411);
                                i8 = -(-(i411 << 1));
                                i9 = i7 | i8;
                            } else if (obj instanceof Double) {
                                i15 = (((i3 ^ 67) | (i3 & 67)) << 1) - (((~i3) & 67) | (i3 & (-68)));
                                a = i15 % 128;
                                if (i15 % 2 != 0) {
                                    j.bindDouble(i2, ((Double) obj).doubleValue());
                                    throw null;
                                }
                                j.bindDouble(i2, ((Double) obj).doubleValue());
                                int i412 = a;
                                int i413 = i412 & 83;
                                int i414 = (((i412 ^ 83) | i413) << 1) - ((i412 | 83) & (~i413));
                                b = i414 % 128;
                                int i415 = i414 % 2;
                            } else if (!(obj instanceof Long)) {
                                int i416 = ((i5 ^ 57) | (i5 & 57)) << 1;
                                int i417 = -(((~i5) & 57) | (i5 & (-58)));
                                int i418 = (i416 ^ i417) + ((i416 & i417) << 1);
                                b = i418 % 128;
                                int i419 = i418 % 2;
                                j.bindLong(i2, ((Long) obj).longValue());
                                int i510 = a + 19;
                                b = i510 % 128;
                                int i511 = i510 % 2;
                            } else if (obj instanceof Integer) {
                                i14 = ((i3 & (-116)) | ((~i3) & 115)) + ((i3 & 115) << 1);
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    j.bindLong(i2, ((Integer) obj).intValue());
                                    int i512 = 57 / 0;
                                } else {
                                    j.bindLong(i2, ((Integer) obj).intValue());
                                }
                                int i513 = a;
                                int i514 = ((i513 & 43) - (~(i513 | 43))) - 1;
                                b = i514 % 128;
                                int i515 = i514 % 2;
                            } else if (obj instanceof Short) {
                                int i516 = i5 & 109;
                                int i517 = (i516 - (~(-(-((i5 ^ 109) | i516))))) - 1;
                                b = i517 % 128;
                                int i518 = i517 % 2;
                                j.bindLong(i2, ((Short) obj).shortValue());
                                int i519 = a + 99;
                                b = i519 % 128;
                                int i610 = i519 % 2;
                            } else if (!(obj instanceof Byte)) {
                                int i611 = (i5 | 121) << 1;
                                int i612 = -(((~i5) & 121) | (i5 & (-122)));
                                i12 = (i611 ^ i612) + ((i611 & i612) << 1);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    ((Byte) obj).byteValue();
                                    obj2.hashCode();
                                    throw null;
                                }
                                jByteValue = ((Byte) obj).byteValue();
                                int i613 = a;
                                int i614 = i613 & 55;
                                int i615 = (i613 ^ 55) | i614;
                                i13 = (i614 ^ i615) + ((i615 & i614) << 1);
                                b = i13 % 128;
                                if (i13 % 2 != 0) {
                                    j.bindLong(i2, jByteValue);
                                    int i616 = 32 / 0;
                                } else {
                                    j.bindLong(i2, jByteValue);
                                }
                            } else if (!(obj instanceof String)) {
                                i10 = (i5 & 9) + (i5 | 9);
                                b = i10 % 128;
                                if (i10 % 2 == 0) {
                                    j.bindString(i2, (String) obj);
                                    throw null;
                                }
                                j.bindString(i2, (String) obj);
                                int i617 = a;
                                i8 = i617 & 111;
                                i7 = (i617 ^ 111) | i8;
                                i9 = i8 | i7;
                            } else {
                                if (obj instanceof Boolean) {
                                    sb = new StringBuilder();
                                    int i618 = b;
                                    i11 = ((i618 & 114) + (i618 | 114)) - 1;
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        sb.append("Cannot bind ");
                                        sb.append(obj);
                                        throw null;
                                    }
                                    sb.append("Cannot bind ");
                                    sb.append(obj);
                                    sb.append(" at index ");
                                    sb.append(i2);
                                    int i619 = a;
                                    int i710 = i619 & 71;
                                    int i711 = i710 + ((i619 ^ 71) | i710);
                                    b = i711 % 128;
                                    int i712 = i711 % 2;
                                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
                                    sb.append(" string");
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                int i713 = (i3 ^ 47) + ((i3 & 47) << 1);
                                a = i713 % 128;
                                int i714 = i713 % 2;
                                if (!((Boolean) obj).booleanValue()) {
                                    int i715 = b;
                                    int i716 = (i715 & 69) + (i715 | 69);
                                    a = i716 % 128;
                                    int i717 = i716 % 2;
                                    j2 = 0;
                                } else {
                                    int i718 = a;
                                    int i719 = i718 & 99;
                                    int i89 = (i719 - (~(-(-((i718 ^ 99) | i719))))) - 1;
                                    b = i89 % 128;
                                    int i810 = i89 % 2;
                                    int i811 = i718 + 49;
                                    b = i811 % 128;
                                    int i812 = i811 % 2;
                                    j2 = 1;
                                }
                                j.bindLong(i2, j2);
                                int i813 = b + 83;
                                a = i813 % 128;
                                int i814 = i813 % 2;
                            }
                            int i815 = (i9 << 1) - (i7 ^ i8);
                            b = i815 % 128;
                            int i816 = i815 % 2;
                        }
                    }
                }
            }
        } else {
            objArr = (Object[]) this.d;
            if (objArr != null) {
                length = objArr.length;
                i = (((i21 | 98) << 1) - (i21 ^ 98)) - 1;
                a = i % 128;
                if (i % 2 == 0) {
                    int i212 = 4 % 2;
                }
                i2 = 0;
                while (i2 < length) {
                    i3 = b;
                    i4 = (((i3 ^ 51) | (i3 & 51)) << 1) - ((i3 & (-52)) | ((~i3) & 51));
                    i5 = i4 % 128;
                    a = i5;
                    if (i4 % 2 == 0) {
                        obj = objArr[i2];
                        int i213 = i2 & 130;
                        int i214 = (i2 ^ 130) | i213;
                        int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
                        int i216 = i215 & (-102);
                        i2 = i216 + ((i215 ^ (-102)) | i216);
                        if (obj == null) {
                            int i217 = i5 + 17;
                            b = i217 % 128;
                            int i218 = i217 % 2;
                            j.bindNull(i2);
                            int i3110 = a;
                            int i3111 = i3110 & 73;
                            int i3112 = -(-((i3110 ^ 73) | i3111));
                            int i3113 = (i3111 ^ i3112) + ((i3112 & i3111) << 1);
                            b = i3113 % 128;
                            int i3114 = i3113 % 2;
                        } else if (obj instanceof byte[]) {
                            int i3115 = ((i3 ^ 79) | (i3 & 79)) << 1;
                            int i3116 = -(((~i3) & 79) | (i3 & (-80)));
                            i6 = ((i3115 | i3116) << 1) - (i3116 ^ i3115);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                j.bindBlob(i2, (byte[]) obj);
                                int i3117 = 11 / 0;
                            } else {
                                j.bindBlob(i2, (byte[]) obj);
                            }
                        } else {
                            if (!(!(obj instanceof Float))) {
                                int i3118 = ((i3 | 73) << 1) - (i3 ^ 73);
                                a = i3118 % 128;
                                int i3119 = i3118 % 2;
                                j.bindDouble(i2, ((Float) obj).floatValue());
                                int i4110 = a;
                                int i4111 = i4110 & 63;
                                i7 = (i4110 | 63) & (~i4111);
                                i8 = -(-(i4111 << 1));
                                i9 = i7 | i8;
                            } else if (obj instanceof Double) {
                                i15 = (((i3 ^ 67) | (i3 & 67)) << 1) - (((~i3) & 67) | (i3 & (-68)));
                                a = i15 % 128;
                                if (i15 % 2 != 0) {
                                    j.bindDouble(i2, ((Double) obj).doubleValue());
                                    throw null;
                                }
                                j.bindDouble(i2, ((Double) obj).doubleValue());
                                int i4112 = a;
                                int i4113 = i4112 & 83;
                                int i4114 = (((i4112 ^ 83) | i4113) << 1) - ((i4112 | 83) & (~i4113));
                                b = i4114 % 128;
                                int i4115 = i4114 % 2;
                            } else if (!(obj instanceof Long)) {
                                int i4116 = ((i5 ^ 57) | (i5 & 57)) << 1;
                                int i4117 = -(((~i5) & 57) | (i5 & (-58)));
                                int i4118 = (i4116 ^ i4117) + ((i4116 & i4117) << 1);
                                b = i4118 % 128;
                                int i4119 = i4118 % 2;
                                j.bindLong(i2, ((Long) obj).longValue());
                                int i5110 = a + 19;
                                b = i5110 % 128;
                                int i5111 = i5110 % 2;
                            } else if (obj instanceof Integer) {
                                i14 = ((i3 & (-116)) | ((~i3) & 115)) + ((i3 & 115) << 1);
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    j.bindLong(i2, ((Integer) obj).intValue());
                                    int i5112 = 57 / 0;
                                } else {
                                    j.bindLong(i2, ((Integer) obj).intValue());
                                }
                                int i5113 = a;
                                int i5114 = ((i5113 & 43) - (~(i5113 | 43))) - 1;
                                b = i5114 % 128;
                                int i5115 = i5114 % 2;
                            } else if (obj instanceof Short) {
                                int i5116 = i5 & 109;
                                int i5117 = (i5116 - (~(-(-((i5 ^ 109) | i5116))))) - 1;
                                b = i5117 % 128;
                                int i5118 = i5117 % 2;
                                j.bindLong(i2, ((Short) obj).shortValue());
                                int i5119 = a + 99;
                                b = i5119 % 128;
                                int i6110 = i5119 % 2;
                            } else if (!(obj instanceof Byte)) {
                                int i6111 = (i5 | 121) << 1;
                                int i6112 = -(((~i5) & 121) | (i5 & (-122)));
                                i12 = (i6111 ^ i6112) + ((i6111 & i6112) << 1);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    ((Byte) obj).byteValue();
                                    obj2.hashCode();
                                    throw null;
                                }
                                jByteValue = ((Byte) obj).byteValue();
                                int i6113 = a;
                                int i6114 = i6113 & 55;
                                int i6115 = (i6113 ^ 55) | i6114;
                                i13 = (i6114 ^ i6115) + ((i6115 & i6114) << 1);
                                b = i13 % 128;
                                if (i13 % 2 != 0) {
                                    j.bindLong(i2, jByteValue);
                                    int i6116 = 32 / 0;
                                } else {
                                    j.bindLong(i2, jByteValue);
                                }
                            } else if (!(obj instanceof String)) {
                                i10 = (i5 & 9) + (i5 | 9);
                                b = i10 % 128;
                                if (i10 % 2 == 0) {
                                    j.bindString(i2, (String) obj);
                                    throw null;
                                }
                                j.bindString(i2, (String) obj);
                                int i6117 = a;
                                i8 = i6117 & 111;
                                i7 = (i6117 ^ 111) | i8;
                                i9 = i8 | i7;
                            } else {
                                if (obj instanceof Boolean) {
                                    sb = new StringBuilder();
                                    int i6118 = b;
                                    i11 = ((i6118 & 114) + (i6118 | 114)) - 1;
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        sb.append("Cannot bind ");
                                        sb.append(obj);
                                        throw null;
                                    }
                                    sb.append("Cannot bind ");
                                    sb.append(obj);
                                    sb.append(" at index ");
                                    sb.append(i2);
                                    int i6119 = a;
                                    int i7110 = i6119 & 71;
                                    int i7111 = i7110 + ((i6119 ^ 71) | i7110);
                                    b = i7111 % 128;
                                    int i7112 = i7111 % 2;
                                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
                                    sb.append(" string");
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                int i7113 = (i3 ^ 47) + ((i3 & 47) << 1);
                                a = i7113 % 128;
                                int i7114 = i7113 % 2;
                                if (!((Boolean) obj).booleanValue()) {
                                    int i7115 = b;
                                    int i7116 = (i7115 & 69) + (i7115 | 69);
                                    a = i7116 % 128;
                                    int i7117 = i7116 % 2;
                                    j2 = 0;
                                } else {
                                    int i7118 = a;
                                    int i7119 = i7118 & 99;
                                    int i817 = (i7119 - (~(-(-((i7118 ^ 99) | i7119))))) - 1;
                                    b = i817 % 128;
                                    int i818 = i817 % 2;
                                    int i819 = i7118 + 49;
                                    b = i819 % 128;
                                    int i8110 = i819 % 2;
                                    j2 = 1;
                                }
                                j.bindLong(i2, j2);
                                int i8111 = b + 83;
                                a = i8111 % 128;
                                int i8112 = i8111 % 2;
                            }
                            int i8113 = (i9 << 1) - (i7 ^ i8);
                            b = i8113 % 128;
                            int i8114 = i8113 % 2;
                        }
                    } else {
                        obj = objArr[i2];
                        int i820 = (((i2 & 101) | ((~i2) & (-102))) - (~(-(-((i2 & (-102)) << 1))))) - 1;
                        i2 = (((i820 | 104) << 1) - (i820 ^ 104)) - 1;
                        if (obj == null) {
                            int i219 = i5 + 17;
                            b = i219 % 128;
                            int i2110 = i219 % 2;
                            j.bindNull(i2);
                            int i31110 = a;
                            int i31111 = i31110 & 73;
                            int i31112 = -(-((i31110 ^ 73) | i31111));
                            int i31113 = (i31111 ^ i31112) + ((i31112 & i31111) << 1);
                            b = i31113 % 128;
                            int i31114 = i31113 % 2;
                        } else if (obj instanceof byte[]) {
                            int i31115 = ((i3 ^ 79) | (i3 & 79)) << 1;
                            int i31116 = -(((~i3) & 79) | (i3 & (-80)));
                            i6 = ((i31115 | i31116) << 1) - (i31116 ^ i31115);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                j.bindBlob(i2, (byte[]) obj);
                                int i31117 = 11 / 0;
                            } else {
                                j.bindBlob(i2, (byte[]) obj);
                            }
                        } else {
                            if (!(!(obj instanceof Float))) {
                                int i31118 = ((i3 | 73) << 1) - (i3 ^ 73);
                                a = i31118 % 128;
                                int i31119 = i31118 % 2;
                                j.bindDouble(i2, ((Float) obj).floatValue());
                                int i41110 = a;
                                int i41111 = i41110 & 63;
                                i7 = (i41110 | 63) & (~i41111);
                                i8 = -(-(i41111 << 1));
                                i9 = i7 | i8;
                            } else if (obj instanceof Double) {
                                i15 = (((i3 ^ 67) | (i3 & 67)) << 1) - (((~i3) & 67) | (i3 & (-68)));
                                a = i15 % 128;
                                if (i15 % 2 != 0) {
                                    j.bindDouble(i2, ((Double) obj).doubleValue());
                                    throw null;
                                }
                                j.bindDouble(i2, ((Double) obj).doubleValue());
                                int i41112 = a;
                                int i41113 = i41112 & 83;
                                int i41114 = (((i41112 ^ 83) | i41113) << 1) - ((i41112 | 83) & (~i41113));
                                b = i41114 % 128;
                                int i41115 = i41114 % 2;
                            } else if (!(obj instanceof Long)) {
                                int i41116 = ((i5 ^ 57) | (i5 & 57)) << 1;
                                int i41117 = -(((~i5) & 57) | (i5 & (-58)));
                                int i41118 = (i41116 ^ i41117) + ((i41116 & i41117) << 1);
                                b = i41118 % 128;
                                int i41119 = i41118 % 2;
                                j.bindLong(i2, ((Long) obj).longValue());
                                int i51110 = a + 19;
                                b = i51110 % 128;
                                int i51111 = i51110 % 2;
                            } else if (obj instanceof Integer) {
                                i14 = ((i3 & (-116)) | ((~i3) & 115)) + ((i3 & 115) << 1);
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    j.bindLong(i2, ((Integer) obj).intValue());
                                    int i51112 = 57 / 0;
                                } else {
                                    j.bindLong(i2, ((Integer) obj).intValue());
                                }
                                int i51113 = a;
                                int i51114 = ((i51113 & 43) - (~(i51113 | 43))) - 1;
                                b = i51114 % 128;
                                int i51115 = i51114 % 2;
                            } else if (obj instanceof Short) {
                                int i51116 = i5 & 109;
                                int i51117 = (i51116 - (~(-(-((i5 ^ 109) | i51116))))) - 1;
                                b = i51117 % 128;
                                int i51118 = i51117 % 2;
                                j.bindLong(i2, ((Short) obj).shortValue());
                                int i51119 = a + 99;
                                b = i51119 % 128;
                                int i61110 = i51119 % 2;
                            } else if (!(obj instanceof Byte)) {
                                int i61111 = (i5 | 121) << 1;
                                int i61112 = -(((~i5) & 121) | (i5 & (-122)));
                                i12 = (i61111 ^ i61112) + ((i61111 & i61112) << 1);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    ((Byte) obj).byteValue();
                                    obj2.hashCode();
                                    throw null;
                                }
                                jByteValue = ((Byte) obj).byteValue();
                                int i61113 = a;
                                int i61114 = i61113 & 55;
                                int i61115 = (i61113 ^ 55) | i61114;
                                i13 = (i61114 ^ i61115) + ((i61115 & i61114) << 1);
                                b = i13 % 128;
                                if (i13 % 2 != 0) {
                                    j.bindLong(i2, jByteValue);
                                    int i61116 = 32 / 0;
                                } else {
                                    j.bindLong(i2, jByteValue);
                                }
                            } else if (!(obj instanceof String)) {
                                i10 = (i5 & 9) + (i5 | 9);
                                b = i10 % 128;
                                if (i10 % 2 == 0) {
                                    j.bindString(i2, (String) obj);
                                    throw null;
                                }
                                j.bindString(i2, (String) obj);
                                int i61117 = a;
                                i8 = i61117 & 111;
                                i7 = (i61117 ^ 111) | i8;
                                i9 = i8 | i7;
                            } else {
                                if (obj instanceof Boolean) {
                                    sb = new StringBuilder();
                                    int i61118 = b;
                                    i11 = ((i61118 & 114) + (i61118 | 114)) - 1;
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        sb.append("Cannot bind ");
                                        sb.append(obj);
                                        throw null;
                                    }
                                    sb.append("Cannot bind ");
                                    sb.append(obj);
                                    sb.append(" at index ");
                                    sb.append(i2);
                                    int i61119 = a;
                                    int i71110 = i61119 & 71;
                                    int i71111 = i71110 + ((i61119 ^ 71) | i71110);
                                    b = i71111 % 128;
                                    int i71112 = i71111 % 2;
                                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
                                    sb.append(" string");
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                int i71113 = (i3 ^ 47) + ((i3 & 47) << 1);
                                a = i71113 % 128;
                                int i71114 = i71113 % 2;
                                if (!((Boolean) obj).booleanValue()) {
                                    int i71115 = b;
                                    int i71116 = (i71115 & 69) + (i71115 | 69);
                                    a = i71116 % 128;
                                    int i71117 = i71116 % 2;
                                    j2 = 0;
                                } else {
                                    int i71118 = a;
                                    int i71119 = i71118 & 99;
                                    int i8115 = (i71119 - (~(-(-((i71118 ^ 99) | i71119))))) - 1;
                                    b = i8115 % 128;
                                    int i8116 = i8115 % 2;
                                    int i8117 = i71118 + 49;
                                    b = i8117 % 128;
                                    int i8118 = i8117 % 2;
                                    j2 = 1;
                                }
                                j.bindLong(i2, j2);
                                int i8119 = b + 83;
                                a = i8119 % 128;
                                int i81110 = i8119 % 2;
                            }
                            int i81111 = (i9 << 1) - (i7 ^ i8);
                            b = i81111 % 128;
                            int i81112 = i81111 % 2;
                        }
                    }
                }
            }
        }
        int i90 = b + 54;
        int i91 = (i90 ^ (-1)) + (i90 << 1);
        a = i91 % 128;
        if (i91 % 2 == 0) {
            throw null;
        }
    }

    public KeyListener k(KeyListener keyListener) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 3;
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = keyListener instanceof NumberKeyListener;
        if ((((z ? 1 : 0) | 1) & (~((z ? 1 : 0) & 1))) != 0) {
            int i5 = ((i2 & 92) + (i2 | 92)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            keyListener = ((L) this.d).a.c(keyListener);
            int i7 = a + 111;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = b;
        int i10 = i9 ^ 101;
        int i11 = ((i9 & 101) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        a = i13 % 128;
        int i14 = i13 % 2;
        return keyListener;
    }

    public void n(byte[] bArr) {
        long[][] jArr;
        byte b2;
        long[] jArr2;
        long j;
        long j2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 58) + ((i2 & 58) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            jArr = (long[][]) this.d;
            b2 = bArr[28];
        } else {
            jArr = (long[][]) this.d;
            b2 = bArr[15];
        }
        int i4 = i2 + 9;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = b2 & 22779;
            jArr2 = jArr[((b2 ^ 22779) | i5) & (~i5)];
            j = jArr2[1];
        } else {
            jArr2 = jArr[b2 & 255];
            j = jArr2[0];
        }
        long j3 = jArr2[1];
        int i6 = ((i2 ^ 81) | (i2 & 81)) << 1;
        int i7 = -(((~i2) & 81) | (i2 & (-82)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 14;
        while (i10 >= 0) {
            int i11 = b;
            int i12 = ((i11 ^ 77) - (~(-(-((i11 & 77) << 1))))) - 1;
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            long[] jArr3 = ((long[][]) this.d)[bArr[i10] & 255];
            int i15 = (i13 & (-42)) | ((~i13) & 41);
            int i16 = -(-((i13 & 41) << 1));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            int i18 = i17 % 128;
            b = i18;
            int i19 = i17 % 2;
            long j4 = j3 << 56;
            long j5 = (j3 >>> 8) | (j << 56);
            int i20 = i18 + 43;
            a = i20 % 128;
            if (i20 % 2 == 0) {
                long j6 = jArr3[0];
                j3 = j5 & j6;
                j2 = (j >>> 109) | j6;
            } else {
                j3 = j5 ^ jArr3[1];
                j2 = (j >>> 8) ^ jArr3[0];
            }
            int i21 = i18 + 49;
            a = i21 % 128;
            int i22 = i21 % 2;
            j = (((j2 ^ j4) ^ (j4 >>> 1)) ^ (j4 >>> 2)) ^ (j4 >>> 7);
            i10 = ((i10 << 1) - i10) - 1;
            int i23 = i18 & 17;
            int i24 = (i18 | 17) & (~i23);
            int i25 = i23 << 1;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            a = i26 % 128;
            int i27 = i26 % 2;
        }
        h.l(j, bArr, 0);
        h.l(j3, bArr, 8);
        int i28 = a;
        int i29 = i28 & 11;
        int i30 = -(-((i28 ^ 11) | i29));
        int i31 = (i29 & i30) + (i30 | i29);
        b = i31 % 128;
        int i32 = i31 % 2;
    }

    public InputConnection o(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnectionD;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (i3 - (~(-(-((i2 ^ 91) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        L l = (L) this.d;
        Objects.requireNonNull(l);
        int i6 = a;
        int i7 = ((((i6 ^ 45) | (i6 & 45)) << 1) - (~(-(((~i6) & 45) | (i6 & (-46)))))) - 1;
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        if (inputConnection == null) {
            int i10 = (i8 & 124) + (i8 | 124);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = (i8 & 67) + (i8 | 67);
            a = i13 % 128;
            int i14 = i13 % 2;
            inputConnectionD = null;
        } else {
            inputConnectionD = l.a.d(inputConnection, editorInfo);
            int i15 = b;
            int i16 = ((i15 ^ 68) + ((i15 & 68) << 1)) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = a;
        int i19 = (i18 ^ 73) + ((i18 & 73) << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
        return inputConnectionD;
    }

    public void p(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-20)) | ((~i2) & 19)) - (~((i2 & 19) << 1))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        ((L) this.d).a.e(z);
        int i5 = b + 75;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
    }

    public /* synthetic */ C0321u(String str) {
        this.c = str;
        this.d = null;
    }

    public byte[] g() throws CharConversionException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = i3 + ((i2 ^ 111) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.c;
            String str = (String) this.d;
            int i6 = (((i2 | 90) << 1) - (i2 ^ 90)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            Object obj = null;
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", (String) this.d));
                int i8 = b;
                int i9 = ((((i8 ^ 63) | (i8 & 63)) << 1) - (~(-(((~i8) & 63) | (i8 & (-64)))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                throw fileNotFoundException;
            }
            int i11 = a;
            int i12 = ((i11 ^ 60) + ((i11 & 60) << 1)) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            byte[] bArrZ = r.z(string);
            int i14 = a;
            int i15 = i14 & 125;
            int i16 = -(-((i14 ^ 125) | i15));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                return bArrZ;
            }
            obj.hashCode();
            throw null;
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", (String) this.d));
        }
    }

    public TextClassifier m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.d;
        if (((TextClassifier) obj2) != null) {
            TextClassifier textClassifier = (TextClassifier) obj2;
            int i4 = ((i2 & 85) - (~(i2 | 85))) - 1;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
            }
            return textClassifier;
        }
        int i6 = i2 + 51;
        b = i6 % 128;
        int i7 = i6 % 2;
        Context context = ((TextView) this.c).getContext();
        int i8 = b;
        int i9 = (((i8 & (-58)) | ((~i8) & 57)) - (~((i8 & 57) << 1))) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            TextClassifier textClassifier2 = textClassificationManager.getTextClassifier();
            int i10 = a;
            int i11 = (i10 ^ 43) + ((i10 & 43) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            return textClassifier2;
        }
        TextClassifier textClassifier3 = TextClassifier.NO_OP;
        int i13 = a;
        int i14 = (i13 & (-98)) | ((~i13) & 97);
        int i15 = -(-((i13 & 97) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        return textClassifier3;
    }

    public C0321u(TextView textView) {
        this.c = textView;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a A[Catch: all -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0096, blocks: (B:7:0x0043, B:18:0x006a, B:10:0x004d), top: B:29:0x003b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.content.res.TypedArray] */
    public void l(AttributeSet attributeSet, int i) {
        boolean zHasValue;
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 92) + ((i3 & 92) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            ((EditText) this.c).getContext();
            int[] iArr = ivas.gov.bisp.enumeration.p006af.h.c;
            obj.hashCode();
            throw null;
        }
        Context context = ((EditText) this.c).getContext();
        int[] iArr2 = ivas.gov.bisp.enumeration.p006af.h.c;
        int i6 = a;
        int i7 = (i6 | 57) << 1;
        int i8 = -(((~i6) & 57) | (i6 & (-58)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        try {
            if (i9 % 2 != 0) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 1);
                zHasValue = typedArrayObtainStyledAttributes.hasValue(119);
                z = false;
                attributeSet = typedArrayObtainStyledAttributes;
            } else {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                zHasValue = typedArrayObtainStyledAttributes2.hasValue(14);
                z = true;
                attributeSet = typedArrayObtainStyledAttributes2;
            }
            int i10 = a;
            int i11 = i10 & 17;
            int i12 = i11 + ((i10 ^ 17) | i11);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 27 / 0;
                if (!(!zHasValue)) {
                    z = attributeSet.getBoolean(14, true);
                    int i14 = b;
                    int i15 = i14 ^ 21;
                    int i16 = ((((i14 & 21) | i15) << 1) - (~(-i15))) - 1;
                    a = i16 % 128;
                    int i17 = i16 % 2;
                }
            } else if (zHasValue) {
                z = attributeSet.getBoolean(14, true);
                int i18 = b;
                int i19 = i18 ^ 21;
                int i110 = ((((i18 & 21) | i19) << 1) - (~(-i19))) - 1;
                a = i110 % 128;
                int i111 = i110 % 2;
            }
            attributeSet.recycle();
            p(z);
            int i20 = a;
            int i21 = (i20 ^ 41) + ((i20 & 41) << 1);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            attributeSet.recycle();
            throw th;
        }
    }

    public /* synthetic */ C0321u(Context context, String str, String str2) {
        this.d = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.c = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            int i = a;
            int i2 = i & 71;
            int i3 = -(-((i ^ 71) | i2));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.c = applicationContext.getSharedPreferences(str2, 0);
        int i6 = a;
        int i7 = ((i6 | 109) << 1) - (i6 ^ 109);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public /* synthetic */ C0321u(EditText editText) {
        this.c = editText;
        this.d = new L(editText, false);
    }
}
