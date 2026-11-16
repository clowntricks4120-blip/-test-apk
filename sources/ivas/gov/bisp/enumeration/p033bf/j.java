package ivas.gov.bisp.enumeration.p033bf;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 1;
    private static int b;
    public static final TimeZone c = TimeZone.getTimeZone("UTC");

    static {
        int i = b;
        int i2 = ((i ^ 41) - (~(-(-((i & 41) << 1))))) - 1;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005b  */
    public static boolean b(String str, int i, char c2) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 81;
        int i5 = ((i3 | 81) & (~i4)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (i < str.length()) {
            int i7 = a;
            int i8 = (i7 & 109) + (i7 | 109);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                str.charAt(i);
                throw null;
            }
            if (str.charAt(i) == c2) {
                int i9 = b;
                int i10 = ((i9 ^ 83) | (i9 & 83)) << 1;
                int i11 = -(((~i9) & 83) | (i9 & (-84)));
                int i12 = (i10 & i11) + (i11 | i10);
                int i13 = i12 % 128;
                a = i13;
                int i14 = i12 % 2;
                int i15 = i13 & 31;
                int i16 = (i13 ^ 31) | i15;
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                int i18 = i17 % 2;
                z = true;
            } else {
                int i19 = b;
                int i20 = i19 & 67;
                int i21 = -(-((i19 ^ 67) | i20));
                int i22 = (i20 & i21) + (i21 | i20);
                a = i22 % 128;
                int i23 = i22 % 2;
                z = false;
            }
        } else {
            int i110 = b;
            int i24 = i110 & 67;
            int i25 = -(-((i110 ^ 67) | i24));
            int i26 = (i24 & i25) + (i25 | i24);
            a = i26 % 128;
            int i27 = i26 % 2;
            z = false;
        }
        int i28 = a;
        int i29 = i28 & 115;
        int i30 = ((((i28 ^ 115) | i29) << 1) - (~(-((i28 | 115) & (~i29))))) - 1;
        b = i30 % 128;
        int i31 = i30 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1 A[SYNTHETIC] */
    public static int d(String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int iDigit;
        int i10;
        int i11;
        int i12;
        int iDigit2;
        int i13;
        int i14;
        int i15 = 2 % 2;
        int i16 = a;
        int i17 = (i16 & (-66)) | ((~i16) & 65);
        int i18 = (i16 & 65) << 1;
        int i19 = (i17 & i18) + (i17 | i18);
        b = i19 % 128;
        Object obj = null;
        if (i19 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i >= 0) {
            int i20 = i16 + 99;
            b = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 11 / 0;
                if (i2 <= str.length()) {
                    if (i <= i2) {
                        i3 = a;
                        int i22 = (-2) - ((((i3 | 80) << 1) - (i3 ^ 80)) ^ (-1));
                        i4 = i22 % 128;
                        b = i4;
                        int i23 = i22 % 2;
                        if (i < i2) {
                            int i24 = i3 & 1;
                            int i25 = ((i3 ^ 1) | i24) << 1;
                            int i26 = -((i3 | 1) & (~i24));
                            i12 = (i25 & i26) + (i26 | i25);
                            b = i12 % 128;
                            if (i12 % 2 != 0) {
                                i5 = i / 0;
                                iDigit2 = Character.digit(str.charAt(i), 4);
                            } else {
                                i5 = i + 1;
                                iDigit2 = Character.digit(str.charAt(i), 10);
                            }
                            if (iDigit2 >= 0) {
                                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Invalid number: ");
                                sbW.append(str.substring(i, i2));
                                throw new NumberFormatException(sbW.toString());
                            }
                            i13 = a;
                            i14 = i13 + 17;
                            b = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            i6 = -iDigit2;
                            int i27 = i13 + 47;
                            b = i27 % 128;
                            int i28 = i27 % 2;
                        } else {
                            int i29 = i4 & 111;
                            int i30 = (i29 - (~((i4 ^ 111) | i29))) - 1;
                            a = i30 % 128;
                            int i31 = i30 % 2;
                            i5 = i;
                            i6 = 0;
                        }
                        while (i5 < i2) {
                            int i32 = b;
                            int i33 = ((i32 ^ 100) + ((i32 & 100) << 1)) - 1;
                            a = i33 % 128;
                            i9 = i33 % 2;
                            cCharAt = str.charAt(i5);
                            if (i9 == 0) {
                                iDigit = Character.digit(cCharAt, 49);
                            } else {
                                iDigit = Character.digit(cCharAt, 10);
                            }
                            i10 = a;
                            i11 = i10 + 1;
                            b = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i34 = 93 / 0;
                                if (iDigit >= 0) {
                                    StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("Invalid number: ");
                                    sbW2.append(str.substring(i, i2));
                                    throw new NumberFormatException(sbW2.toString());
                                }
                                int i35 = ((i6 * 10) - (~(-(~(-iDigit))))) - 1;
                                i6 = (i35 << 1) + (i35 ^ (-1));
                                i5 = ((i5 & 2) + (i5 | 2)) - 1;
                                int i36 = ((i10 | 73) << 1) - (((~i10) & 73) | (i10 & (-74)));
                                b = i36 % 128;
                                int i37 = i36 % 2;
                            } else {
                                if (iDigit >= 0) {
                                    StringBuilder sbW3 = ivas.gov.bisp.enumeration.p091n.j.w("Invalid number: ");
                                    sbW3.append(str.substring(i, i2));
                                    throw new NumberFormatException(sbW3.toString());
                                }
                                int i38 = ((i6 * 10) - (~(-(~(-iDigit))))) - 1;
                                i6 = (i38 << 1) + (i38 ^ (-1));
                                i5 = ((i5 & 2) + (i5 | 2)) - 1;
                                int i39 = ((i10 | 73) << 1) - (((~i10) & 73) | (i10 & (-74)));
                                b = i39 % 128;
                                int i310 = i39 % 2;
                            }
                        }
                        i7 = -i6;
                        int i40 = b;
                        i8 = (i40 & 61) + (i40 | 61);
                        a = i8 % 128;
                        if (i8 % 2 != 0) {
                            return i7;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            } else if (i2 <= str.length()) {
                if (i <= i2) {
                    i3 = a;
                    int i210 = (-2) - ((((i3 | 80) << 1) - (i3 ^ 80)) ^ (-1));
                    i4 = i210 % 128;
                    b = i4;
                    int i211 = i210 % 2;
                    if (i < i2) {
                        int i212 = i3 & 1;
                        int i213 = ((i3 ^ 1) | i212) << 1;
                        int i214 = -((i3 | 1) & (~i212));
                        i12 = (i213 & i214) + (i214 | i213);
                        b = i12 % 128;
                        if (i12 % 2 != 0) {
                            i5 = i / 0;
                            iDigit2 = Character.digit(str.charAt(i), 4);
                        } else {
                            i5 = i + 1;
                            iDigit2 = Character.digit(str.charAt(i), 10);
                        }
                        if (iDigit2 >= 0) {
                            StringBuilder sbW4 = ivas.gov.bisp.enumeration.p091n.j.w("Invalid number: ");
                            sbW4.append(str.substring(i, i2));
                            throw new NumberFormatException(sbW4.toString());
                        }
                        i13 = a;
                        i14 = i13 + 17;
                        b = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                        i6 = -iDigit2;
                        int i215 = i13 + 47;
                        b = i215 % 128;
                        int i216 = i215 % 2;
                    } else {
                        int i217 = i4 & 111;
                        int i311 = (i217 - (~((i4 ^ 111) | i217))) - 1;
                        a = i311 % 128;
                        int i312 = i311 % 2;
                        i5 = i;
                        i6 = 0;
                    }
                    while (i5 < i2) {
                        int i313 = b;
                        int i314 = ((i313 ^ 100) + ((i313 & 100) << 1)) - 1;
                        a = i314 % 128;
                        i9 = i314 % 2;
                        cCharAt = str.charAt(i5);
                        if (i9 == 0) {
                            iDigit = Character.digit(cCharAt, 49);
                        } else {
                            iDigit = Character.digit(cCharAt, 10);
                        }
                        i10 = a;
                        i11 = i10 + 1;
                        b = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i315 = 93 / 0;
                            if (iDigit >= 0) {
                                StringBuilder sbW5 = ivas.gov.bisp.enumeration.p091n.j.w("Invalid number: ");
                                sbW5.append(str.substring(i, i2));
                                throw new NumberFormatException(sbW5.toString());
                            }
                            int i316 = ((i6 * 10) - (~(-(~(-iDigit))))) - 1;
                            i6 = (i316 << 1) + (i316 ^ (-1));
                            i5 = ((i5 & 2) + (i5 | 2)) - 1;
                            int i317 = ((i10 | 73) << 1) - (((~i10) & 73) | (i10 & (-74)));
                            b = i317 % 128;
                            int i318 = i317 % 2;
                        } else {
                            if (iDigit >= 0) {
                                StringBuilder sbW6 = ivas.gov.bisp.enumeration.p091n.j.w("Invalid number: ");
                                sbW6.append(str.substring(i, i2));
                                throw new NumberFormatException(sbW6.toString());
                            }
                            int i319 = ((i6 * 10) - (~(-(~(-iDigit))))) - 1;
                            i6 = (i319 << 1) + (i319 ^ (-1));
                            i5 = ((i5 & 2) + (i5 | 2)) - 1;
                            int i3110 = ((i10 | 73) << 1) - (((~i10) & 73) | (i10 & (-74)));
                            b = i3110 % 128;
                            int i3111 = i3110 % 2;
                        }
                    }
                    i7 = -i6;
                    int i41 = b;
                    i8 = (i41 & 61) + (i41 | 61);
                    a = i8 % 128;
                    if (i8 % 2 != 0) {
                        return i7;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        throw new NumberFormatException(str);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0374  */
    /* JADX WARN: Code duplicated, block: B:126:0x0383 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TRY_ENTER, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0389  */
    /* JADX WARN: Code duplicated, block: B:129:0x038a A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0392 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TRY_LEAVE, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:133:0x03bd A[PHI: r5
  0x03bd: PHI (r5v42 char) = (r5v41 char), (r5v78 char) binds: [B:130:0x0390, B:127:0x0387] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:137:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:140:0x03da  */
    /* JADX WARN: Code duplicated, block: B:148:0x041e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0420 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0450  */
    /* JADX WARN: Code duplicated, block: B:164:0x047d  */
    /* JADX WARN: Code duplicated, block: B:167:0x048f  */
    /* JADX WARN: Code duplicated, block: B:168:0x04a8 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:170:0x04be A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:178:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x0551  */
    /* JADX WARN: Code duplicated, block: B:189:0x055b A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:192:0x057b A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:194:0x059e A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TRY_LEAVE, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:197:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:202:0x05b6 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, NumberFormatException -> 0x0120, IndexOutOfBoundsException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x011d, blocks: (B:3:0x000b, B:6:0x0022, B:12:0x0039, B:13:0x0043, B:16:0x005e, B:24:0x0092, B:28:0x00b1, B:34:0x00d7, B:36:0x00dd, B:38:0x00fe, B:41:0x0114, B:42:0x0117, B:43:0x011a, B:55:0x0140, B:59:0x017f, B:61:0x0197, B:65:0x01a8, B:67:0x01ae, B:75:0x01d6, B:83:0x020a, B:89:0x0244, B:92:0x0269, B:105:0x02ce, B:107:0x02ee, B:122:0x036e, B:126:0x0383, B:131:0x0392, B:182:0x0519, B:184:0x0534, B:188:0x0552, B:190:0x0564, B:189:0x055b, B:143:0x03df, B:144:0x03fa, B:145:0x03fb, B:161:0x0468, B:165:0x0487, B:170:0x04be, B:172:0x04cf, B:174:0x04eb, B:179:0x0509, B:192:0x057b, B:193:0x059d, B:168:0x04a8, B:149:0x0420, B:151:0x0432, B:155:0x0453, B:129:0x038a, B:194:0x059e, B:198:0x05b2, B:202:0x05b6, B:104:0x02c9, B:64:0x01a0, B:29:0x00b6, B:19:0x0065, B:9:0x002d), top: B:228:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:215:0x0628  */
    /* JADX WARN: Code duplicated, block: B:217:0x0653  */
    /* JADX WARN: Code duplicated, block: B:220:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    public static Date c(String str, ParsePosition parsePosition) throws ParseException {
        String string;
        StringBuilder sbW;
        String name;
        int i;
        int iD;
        int iD2;
        int iD3;
        int i2;
        int iD4;
        int iD5;
        IllegalArgumentException illegalArgumentException;
        int i3;
        int i4;
        char cCharAt;
        String strSubstring;
        int length;
        int i5;
        int i6;
        TimeZone timeZone;
        int i7;
        String string2;
        TimeZone timeZone2;
        String id;
        int i8;
        GregorianCalendar gregorianCalendar;
        int i9;
        char cCharAt2;
        int length2;
        int i10;
        int i11 = 2 % 2;
        Object obj = null;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int i13 = b;
            int i14 = ((i13 & 32) + (i13 | 32)) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                iD = d(str, index, i12);
                if (b(str, i12, 'Y')) {
                    int i15 = ((i12 | 2) << 1) - (i12 ^ 2);
                    i12 = (i15 ^ (-1)) + (i15 << 1);
                }
            } else {
                iD = d(str, index, i12);
                if (!(!b(str, i12, '-'))) {
                    int i16 = ((i12 | 2) << 1) - (i12 ^ 2);
                    i12 = (i16 ^ (-1)) + (i16 << 1);
                }
            }
            int i17 = ((i12 & 3) + (i12 | 3)) - 1;
            int iD6 = d(str, i12, i17);
            int i18 = (-2) - ((b + 16) ^ (-1));
            a = i18 % 128;
            if (i18 % 2 == 0) {
                if (b(str, i17, '%')) {
                    int i19 = i17 & 1;
                    int i20 = (i17 | 1) & (~i19);
                    int i21 = -(-(i19 << 1));
                    i17 = (i20 | i21) + (i20 & i21);
                    int i22 = a + 23;
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
            } else if (b(str, i17, '-')) {
                int i110 = i17 & 1;
                int i24 = (i17 | 1) & (~i110);
                int i25 = -(-(i110 << 1));
                i17 = (i24 | i25) + (i24 & i25);
                int i26 = a + 23;
                b = i26 % 128;
                int i27 = i26 % 2;
            }
            int i28 = i17 & 2;
            int i29 = ((i17 ^ 2) | i28) << 1;
            int i30 = -((~i28) & (i17 | 2));
            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
            int iD7 = d(str, i17, i31);
            int i32 = a;
            int i33 = ((i32 ^ 1) | (i32 & 1)) << 1;
            int i34 = -(((~i32) & 1) | (i32 & (-2)));
            int i35 = (i33 & i34) + (i34 | i33);
            b = i35 % 128;
            boolean zB = i35 % 2 != 0 ? b(str, i31, 'e') : b(str, i31, 'T');
            int i36 = a + 125;
            int i37 = i36 % 128;
            b = i37;
            int i38 = i36 % 2;
            if (!zB) {
                int i39 = i37 & 11;
                int i40 = i39 + ((i37 ^ 11) | i39);
                a = i40 % 128;
                if (i40 % 2 == 0) {
                    str.length();
                    obj.hashCode();
                    throw null;
                }
                if (str.length() <= i31) {
                    int i41 = ~iD6;
                    int i42 = -(-(iD6 << 1));
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(iD, (i41 ^ i42) + ((i42 & i41) << 1), iD7);
                    int i43 = a;
                    int i44 = i43 ^ 107;
                    int i45 = -(-((i43 & 107) << 1));
                    int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                    b = i46 % 128;
                    int i47 = i46 % 2;
                    parsePosition.setIndex(i31);
                    Date time = gregorianCalendar2.getTime();
                    int i48 = b;
                    int i49 = ((i48 & 106) + (i48 | 106)) - 1;
                    a = i49 % 128;
                    int i50 = i49 % 2;
                    return time;
                }
            }
            if (zB) {
                int i51 = a;
                int i52 = ((i51 & 73) - (~(-(-(i51 | 73))))) - 1;
                b = i52 % 128;
                int i53 = i52 % 2;
                int i54 = i31 + 1;
                int i55 = i31 + 3;
                iD3 = d(str, i54, i55);
                if (b(str, i55, ':')) {
                    int i56 = a;
                    int i57 = (i56 & 69) + (i56 | 69);
                    int i58 = i57 % 128;
                    b = i58;
                    int i59 = i57 % 2;
                    int i60 = (i55 & (-2)) | ((~i55) & 1);
                    int i61 = (i55 & 1) << 1;
                    i55 = (i60 & i61) + (i60 | i61);
                    int i62 = i58 & 27;
                    int i63 = i62 + ((i58 ^ 27) | i62);
                    a = i63 % 128;
                    int i64 = i63 % 2;
                }
                int i65 = i55 & 2;
                int i66 = ((i55 ^ 2) | i65) << 1;
                int i67 = -((~i65) & (i55 | 2));
                int i68 = (i66 & i67) + (i66 | i67);
                iD2 = d(str, i55, i68);
                int i69 = a;
                int i70 = ((~i69) & 39) | (i69 & (-40));
                int i71 = (i69 & 39) << 1;
                int i72 = (i70 & i71) + (i70 | i71);
                b = i72 % 128;
                int i73 = i72 % 2;
                i31 = b(str, i68, ':') ^ true ? i68 : (((i68 | 2) << 1) - (i68 ^ 2)) - 1;
                if (str.length() > i31 && (cCharAt2 = str.charAt(i31)) != 'Z') {
                    int i74 = a;
                    int i75 = ((i74 & 82) + (i74 | 82)) - 1;
                    int i76 = i75 % 128;
                    b = i76;
                    int i77 = i75 % 2;
                    if (cCharAt2 != '+' && cCharAt2 != '-') {
                        int i78 = (i76 ^ 121) + ((i76 & 121) << 1);
                        a = i78 % 128;
                        i2 = i78 % 2 == 0 ? i31 / 4 : ((i31 | 2) << 1) - (i31 ^ 2);
                        iD5 = d(str, i31, i2);
                        if (iD5 > 59) {
                            int i79 = a + 81;
                            int i80 = i79 % 128;
                            b = i80;
                            int i81 = i79 % 2;
                            if (iD5 < 63) {
                                int i82 = i80 ^ 59;
                                int i83 = (i82 | (i80 & 59)) << 1;
                                int i84 = -i82;
                                int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                                a = i85 % 128;
                                int i86 = i85 % 2;
                                iD5 = 59;
                            }
                        }
                        if (b(str, i2, '.')) {
                            int i87 = a;
                            int i88 = (i87 & 103) + (i87 | 103);
                            b = i88 % 128;
                            if (i88 % 2 != 0) {
                                int i89 = i2 & 1;
                                int i90 = (i2 | 1) & (~i89);
                                int i91 = i89 << 1;
                                length2 = (i90 & i91) + (i90 | i91);
                                i10 = length2;
                            } else {
                                int i92 = (-2) - (((i2 & 2) + (i2 | 2)) ^ (-1));
                                int i93 = i92 ^ 1;
                                int i94 = ((i92 & 1) | i93) << 1;
                                int i95 = -i93;
                                length2 = (i95 | i94) + (i94 & i95);
                                i10 = i92;
                            }
                            while (true) {
                                if (length2 >= str.length()) {
                                    length2 = str.length();
                                    break;
                                }
                                int i96 = b;
                                int i97 = ((i96 ^ 3) | (i96 & 3)) << 1;
                                int i98 = -((i96 & (-4)) | (3 & (~i96)));
                                int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                                a = i99 % 128;
                                int i100 = i99 % 2;
                                char cCharAt3 = str.charAt(length2);
                                if (cCharAt3 < '0') {
                                    break;
                                }
                                int i101 = a;
                                int i102 = i101 ^ 123;
                                int i103 = (((i102 | (i101 & 123)) << 1) - (~(-i102))) - 1;
                                int i104 = i103 % 128;
                                b = i104;
                                if (i103 % 2 != 0) {
                                    if (cCharAt3 > 'p') {
                                        int i105 = (((i101 ^ 79) | (i101 & 79)) << 1) - ((i101 & (-80)) | ((~i101) & 79));
                                        b = i105 % 128;
                                        int i106 = i105 % 2;
                                        break;
                                    }
                                    int i107 = (length2 | 1) << 1;
                                    int i108 = -(length2 ^ 1);
                                    length2 = (i107 ^ i108) + ((i107 & i108) << 1);
                                    int i109 = i104 & 41;
                                    int i111 = (i104 | 41) & (~i109);
                                    int i112 = -(-(i109 << 1));
                                    int i113 = (i111 & i112) + (i111 | i112);
                                    a = i113 % 128;
                                    int i114 = i113 % 2;
                                } else {
                                    if (cCharAt3 > '9') {
                                        int i1010 = (((i101 ^ 79) | (i101 & 79)) << 1) - ((i101 & (-80)) | ((~i101) & 79));
                                        b = i1010 % 128;
                                        int i1011 = i1010 % 2;
                                        break;
                                    }
                                    int i1012 = (length2 | 1) << 1;
                                    int i1013 = -(length2 ^ 1);
                                    length2 = (i1012 ^ i1013) + ((i1012 & i1013) << 1);
                                    int i1014 = i104 & 41;
                                    int i115 = (i104 | 41) & (~i1014);
                                    int i116 = -(-(i1014 << 1));
                                    int i117 = (i115 & i116) + (i115 | i116);
                                    a = i117 % 128;
                                    int i118 = i117 % 2;
                                }
                            }
                            int iMin = Math.min(length2, (((i10 & (-4)) | ((~i10) & 3)) - (~((i10 & 3) << 1))) - 1);
                            int i119 = b;
                            int i120 = ((i119 & 85) - (~(-(-(i119 | 85))))) - 1;
                            a = i120 % 128;
                            int i121 = i120 % 2;
                            iD4 = d(str, i10, iMin);
                            int i122 = -(~(-i10));
                            int i123 = (-2) - ((((iMin | i122) << 1) - (iMin ^ i122)) ^ (-1));
                            if (i123 != 1) {
                                int i124 = a;
                                int i125 = ((i124 & 50) + (i124 | 50)) - 1;
                                b = i125 % 128;
                                int i126 = i125 % 2;
                                if (i123 == 2) {
                                    iD4 *= 10;
                                    int i127 = (i124 | 55) << 1;
                                    int i128 = -(((~i124) & 55) | (i124 & (-56)));
                                    int i129 = ((i127 | i128) << 1) - (i127 ^ i128);
                                    b = i129 % 128;
                                    int i130 = i129 % 2;
                                }
                            } else {
                                iD4 *= 100;
                                int i131 = a;
                                int i132 = i131 ^ 37;
                                int i133 = (((i131 & 37) | i132) << 1) - i132;
                                b = i133 % 128;
                                int i134 = i133 % 2;
                            }
                            i2 = length2;
                        } else {
                            iD4 = 0;
                        }
                    }
                    if (str.length() > i2) {
                        illegalArgumentException = new IllegalArgumentException("No time zone indicator");
                        i3 = b + 123;
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        throw illegalArgumentException;
                    }
                    int i135 = b + 24;
                    i4 = (i135 ^ (-1)) + (i135 << 1);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        cCharAt = str.charAt(i2);
                        if (cCharAt == 1) {
                            timeZone = c;
                            i7 = (((i2 ^ 1) | (i2 & 1)) << 1) - (((~i2) & 1) | (i2 & (-2)));
                            int i136 = b;
                            int i137 = ((i136 ^ 85) | (i136 & 85)) << 1;
                            int i138 = -((85 & (~i136)) | (i136 & (-86)));
                            int i139 = (i137 ^ i138) + ((i138 & i137) << 1);
                            a = i139 % 128;
                            int i140 = i139 % 2;
                        } else {
                            if (cCharAt != '+') {
                                int i141 = a;
                                int i142 = i141 & 25;
                                int i143 = -(-(i141 | 25));
                                i8 = ((i142 | i143) << 1) - (i143 ^ i142);
                                b = i8 % 128;
                                if (i8 % 2 != 0 ? cCharAt != '-' : cCharAt != 'v') {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Invalid time zone indicator '");
                                    sb.append(cCharAt);
                                    sb.append("'");
                                    throw new IndexOutOfBoundsException(sb.toString());
                                }
                            }
                            strSubstring = str.substring(i2);
                            length = strSubstring.length();
                            int i144 = b;
                            int i145 = (((31 & (~i144)) | (i144 & (-32))) - (~(-(-((i144 & 31) << 1))))) - 1;
                            a = i145 % 128;
                            int i146 = i145 % 2;
                            if (length >= 5) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(strSubstring);
                                int i147 = a + 17;
                                b = i147 % 128;
                                int i148 = i147 % 2;
                                sb2.append("00");
                                strSubstring = sb2.toString();
                                int i149 = a;
                                int i150 = i149 & 93;
                                i5 = (((i149 ^ 93) | i150) << 1) - ((~i150) & (i149 | 93));
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i151 = 82 / 0;
                                }
                                int i152 = (-2) - (((i149 ^ 78) + ((i149 & 78) << 1)) ^ (-1));
                                b = i152 % 128;
                                int i153 = i152 % 2;
                            }
                            i6 = (i2 - (~(-(~(-(-strSubstring.length())))))) - 2;
                            if ("+0000".equals(strSubstring)) {
                                timeZone = c;
                                int i154 = b;
                                int i155 = i154 ^ 7;
                                int i156 = ((((i154 & 7) | i155) << 1) - (~(-i155))) - 1;
                                a = i156 % 128;
                                int i157 = i156 % 2;
                                i7 = i6;
                            } else {
                                int i158 = a + 89;
                                b = i158 % 128;
                                int i159 = i158 % 2;
                                if ("+00:00".equals(strSubstring)) {
                                    int i160 = b;
                                    int i161 = i160 & 59;
                                    int i162 = ((i160 ^ 59) | i161) << 1;
                                    int i163 = -((i160 | 59) & (~i161));
                                    int i164 = (i162 ^ i163) + ((i163 & i162) << 1);
                                    a = i164 % 128;
                                    int i165 = i164 % 2;
                                    timeZone = c;
                                    int i1510 = b;
                                    int i1511 = i1510 ^ 7;
                                    int i1512 = ((((i1510 & 7) | i1511) << 1) - (~(-i1511))) - 1;
                                    a = i1512 % 128;
                                    int i1513 = i1512 % 2;
                                    i7 = i6;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    int i166 = a + 71;
                                    b = i166 % 128;
                                    int i167 = i166 % 2;
                                    sb3.append("GMT");
                                    sb3.append(strSubstring);
                                    string2 = sb3.toString();
                                    timeZone2 = TimeZone.getTimeZone(string2);
                                    id = timeZone2.getID();
                                    int i168 = a + 119;
                                    b = i168 % 128;
                                    int i169 = i168 % 2;
                                    if (!id.equals(string2)) {
                                        int i170 = a;
                                        int i171 = i170 & 35;
                                        int i172 = -(-((i170 ^ 35) | i171));
                                        int i173 = ((i171 | i172) << 1) - (i172 ^ i171);
                                        b = i173 % 128;
                                        int i174 = i173 % 2;
                                        if (!id.replace(":", BuildConfig.FLAVOR).equals(string2)) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("Mismatching time zone indicator: ");
                                            sb4.append(string2);
                                            sb4.append(" given, resolves to ");
                                            sb4.append(timeZone2.getID());
                                            throw new IndexOutOfBoundsException(sb4.toString());
                                        }
                                    }
                                    i7 = i6;
                                    timeZone = timeZone2;
                                }
                            }
                        }
                    } else {
                        cCharAt = str.charAt(i2);
                        if (cCharAt == 'Z') {
                            timeZone = c;
                            i7 = (((i2 ^ 1) | (i2 & 1)) << 1) - (((~i2) & 1) | (i2 & (-2)));
                            int i1310 = b;
                            int i1311 = ((i1310 ^ 85) | (i1310 & 85)) << 1;
                            int i1312 = -((85 & (~i1310)) | (i1310 & (-86)));
                            int i1313 = (i1311 ^ i1312) + ((i1312 & i1311) << 1);
                            a = i1313 % 128;
                            int i1410 = i1313 % 2;
                        } else {
                            if (cCharAt != '+') {
                                int i1411 = a;
                                int i1412 = i1411 & 25;
                                int i1413 = -(-(i1411 | 25));
                                i8 = ((i1412 | i1413) << 1) - (i1413 ^ i1412);
                                b = i8 % 128;
                                if (i8 % 2 != 0) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Invalid time zone indicator '");
                                    sb5.append(cCharAt);
                                    sb5.append("'");
                                    throw new IndexOutOfBoundsException(sb5.toString());
                                }
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Invalid time zone indicator '");
                                sb6.append(cCharAt);
                                sb6.append("'");
                                throw new IndexOutOfBoundsException(sb6.toString());
                            }
                            strSubstring = str.substring(i2);
                            length = strSubstring.length();
                            int i1414 = b;
                            int i1415 = (((31 & (~i1414)) | (i1414 & (-32))) - (~(-(-((i1414 & 31) << 1))))) - 1;
                            a = i1415 % 128;
                            int i1416 = i1415 % 2;
                            if (length >= 5) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(strSubstring);
                                int i1417 = a + 17;
                                b = i1417 % 128;
                                int i1418 = i1417 % 2;
                                sb7.append("00");
                                strSubstring = sb7.toString();
                                int i1419 = a;
                                int i1514 = i1419 & 93;
                                i5 = (((i1419 ^ 93) | i1514) << 1) - ((~i1514) & (i1419 | 93));
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i1515 = 82 / 0;
                                }
                                int i1516 = (-2) - (((i1419 ^ 78) + ((i1419 & 78) << 1)) ^ (-1));
                                b = i1516 % 128;
                                int i1517 = i1516 % 2;
                            }
                            i6 = (i2 - (~(-(~(-(-strSubstring.length())))))) - 2;
                            if ("+0000".equals(strSubstring)) {
                                timeZone = c;
                                int i1518 = b;
                                int i1519 = i1518 ^ 7;
                                int i15110 = ((((i1518 & 7) | i1519) << 1) - (~(-i1519))) - 1;
                                a = i15110 % 128;
                                int i15111 = i15110 % 2;
                                i7 = i6;
                            } else {
                                int i1520 = a + 89;
                                b = i1520 % 128;
                                int i1521 = i1520 % 2;
                                if ("+00:00".equals(strSubstring)) {
                                    int i1610 = b;
                                    int i1611 = i1610 & 59;
                                    int i1612 = ((i1610 ^ 59) | i1611) << 1;
                                    int i1613 = -((i1610 | 59) & (~i1611));
                                    int i1614 = (i1612 ^ i1613) + ((i1613 & i1612) << 1);
                                    a = i1614 % 128;
                                    int i1615 = i1614 % 2;
                                    timeZone = c;
                                    int i15112 = b;
                                    int i15113 = i15112 ^ 7;
                                    int i15114 = ((((i15112 & 7) | i15113) << 1) - (~(-i15113))) - 1;
                                    a = i15114 % 128;
                                    int i15115 = i15114 % 2;
                                    i7 = i6;
                                } else {
                                    StringBuilder sb8 = new StringBuilder();
                                    int i1616 = a + 71;
                                    b = i1616 % 128;
                                    int i1617 = i1616 % 2;
                                    sb8.append("GMT");
                                    sb8.append(strSubstring);
                                    string2 = sb8.toString();
                                    timeZone2 = TimeZone.getTimeZone(string2);
                                    id = timeZone2.getID();
                                    int i1618 = a + 119;
                                    b = i1618 % 128;
                                    int i1619 = i1618 % 2;
                                    if (!id.equals(string2)) {
                                        int i175 = a;
                                        int i176 = i175 & 35;
                                        int i177 = -(-((i175 ^ 35) | i176));
                                        int i178 = ((i176 | i177) << 1) - (i177 ^ i176);
                                        b = i178 % 128;
                                        int i179 = i178 % 2;
                                        if (!id.replace(":", BuildConfig.FLAVOR).equals(string2)) {
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append("Mismatching time zone indicator: ");
                                            sb9.append(string2);
                                            sb9.append(" given, resolves to ");
                                            sb9.append(timeZone2.getID());
                                            throw new IndexOutOfBoundsException(sb9.toString());
                                        }
                                    }
                                    i7 = i6;
                                    timeZone = timeZone2;
                                }
                            }
                        }
                    }
                    gregorianCalendar = new GregorianCalendar(timeZone);
                    gregorianCalendar.setLenient(false);
                    int i180 = a;
                    int i181 = i180 ^ 15;
                    int i182 = ((((i180 & 15) | i181) << 1) - (~(-i181))) - 1;
                    b = i182 % 128;
                    int i183 = i182 % 2;
                    gregorianCalendar.set(1, iD);
                    int i184 = (iD6 ^ (-1)) | iD6;
                    gregorianCalendar.set(2, (iD6 & i184) + (i184 | iD6));
                    int i185 = b;
                    i9 = ((i185 & 8) + (i185 | 8)) - 1;
                    a = i9 % 128;
                    if (i9 % 2 == 0) {
                        gregorianCalendar.set(3, iD7);
                        gregorianCalendar.set(99, iD3);
                    } else {
                        gregorianCalendar.set(5, iD7);
                        gregorianCalendar.set(11, iD3);
                    }
                    gregorianCalendar.set(12, iD2);
                    gregorianCalendar.set(13, iD5);
                    gregorianCalendar.set(14, iD4);
                    parsePosition.setIndex(i7);
                    return gregorianCalendar.getTime();
                }
                int i186 = a;
                int i187 = i186 & 91;
                int i188 = ((((i186 ^ 91) | i187) << 1) - (~(-((i186 | 91) & (~i187))))) - 1;
                b = i188 % 128;
                int i189 = i188 % 2;
            } else {
                iD2 = 0;
                iD3 = 0;
            }
            int i190 = a;
            int i191 = i190 & 13;
            int i192 = (i190 ^ 13) | i191;
            int i193 = (i191 & i192) + (i192 | i191);
            b = i193 % 128;
            if (i193 % 2 != 0) {
                int i194 = 30 / 0;
            }
            i2 = i31;
            iD4 = 0;
            iD5 = 0;
            if (str.length() > i2) {
                illegalArgumentException = new IllegalArgumentException("No time zone indicator");
                i3 = b + 123;
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                throw illegalArgumentException;
            }
            int i1314 = b + 24;
            i4 = (i1314 ^ (-1)) + (i1314 << 1);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                cCharAt = str.charAt(i2);
                if (cCharAt == 1) {
                    timeZone = c;
                    i7 = (((i2 ^ 1) | (i2 & 1)) << 1) - (((~i2) & 1) | (i2 & (-2)));
                    int i1315 = b;
                    int i1316 = ((i1315 ^ 85) | (i1315 & 85)) << 1;
                    int i1317 = -((85 & (~i1315)) | (i1315 & (-86)));
                    int i1318 = (i1316 ^ i1317) + ((i1317 & i1316) << 1);
                    a = i1318 % 128;
                    int i14110 = i1318 % 2;
                } else {
                    if (cCharAt != '+') {
                        int i14111 = a;
                        int i14112 = i14111 & 25;
                        int i14113 = -(-(i14111 | 25));
                        i8 = ((i14112 | i14113) << 1) - (i14113 ^ i14112);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append("Invalid time zone indicator '");
                            sb10.append(cCharAt);
                            sb10.append("'");
                            throw new IndexOutOfBoundsException(sb10.toString());
                        }
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("Invalid time zone indicator '");
                        sb11.append(cCharAt);
                        sb11.append("'");
                        throw new IndexOutOfBoundsException(sb11.toString());
                    }
                    strSubstring = str.substring(i2);
                    length = strSubstring.length();
                    int i14114 = b;
                    int i14115 = (((31 & (~i14114)) | (i14114 & (-32))) - (~(-(-((i14114 & 31) << 1))))) - 1;
                    a = i14115 % 128;
                    int i14116 = i14115 % 2;
                    if (length >= 5) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append(strSubstring);
                        int i14117 = a + 17;
                        b = i14117 % 128;
                        int i14118 = i14117 % 2;
                        sb12.append("00");
                        strSubstring = sb12.toString();
                        int i14119 = a;
                        int i15116 = i14119 & 93;
                        i5 = (((i14119 ^ 93) | i15116) << 1) - ((~i15116) & (i14119 | 93));
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i15117 = 82 / 0;
                        }
                        int i15118 = (-2) - (((i14119 ^ 78) + ((i14119 & 78) << 1)) ^ (-1));
                        b = i15118 % 128;
                        int i15119 = i15118 % 2;
                    }
                    i6 = (i2 - (~(-(~(-(-strSubstring.length())))))) - 2;
                    if ("+0000".equals(strSubstring)) {
                        timeZone = c;
                        int i151110 = b;
                        int i151111 = i151110 ^ 7;
                        int i151112 = ((((i151110 & 7) | i151111) << 1) - (~(-i151111))) - 1;
                        a = i151112 % 128;
                        int i151113 = i151112 % 2;
                        i7 = i6;
                    } else {
                        int i1522 = a + 89;
                        b = i1522 % 128;
                        int i1523 = i1522 % 2;
                        if ("+00:00".equals(strSubstring)) {
                            int i16110 = b;
                            int i16111 = i16110 & 59;
                            int i16112 = ((i16110 ^ 59) | i16111) << 1;
                            int i16113 = -((i16110 | 59) & (~i16111));
                            int i16114 = (i16112 ^ i16113) + ((i16113 & i16112) << 1);
                            a = i16114 % 128;
                            int i16115 = i16114 % 2;
                            timeZone = c;
                            int i151114 = b;
                            int i151115 = i151114 ^ 7;
                            int i151116 = ((((i151114 & 7) | i151115) << 1) - (~(-i151115))) - 1;
                            a = i151116 % 128;
                            int i151117 = i151116 % 2;
                            i7 = i6;
                        } else {
                            StringBuilder sb13 = new StringBuilder();
                            int i16116 = a + 71;
                            b = i16116 % 128;
                            int i16117 = i16116 % 2;
                            sb13.append("GMT");
                            sb13.append(strSubstring);
                            string2 = sb13.toString();
                            timeZone2 = TimeZone.getTimeZone(string2);
                            id = timeZone2.getID();
                            int i16118 = a + 119;
                            b = i16118 % 128;
                            int i16119 = i16118 % 2;
                            if (!id.equals(string2)) {
                                int i1710 = a;
                                int i1711 = i1710 & 35;
                                int i1712 = -(-((i1710 ^ 35) | i1711));
                                int i1713 = ((i1711 | i1712) << 1) - (i1712 ^ i1711);
                                b = i1713 % 128;
                                int i1714 = i1713 % 2;
                                if (!id.replace(":", BuildConfig.FLAVOR).equals(string2)) {
                                    StringBuilder sb14 = new StringBuilder();
                                    sb14.append("Mismatching time zone indicator: ");
                                    sb14.append(string2);
                                    sb14.append(" given, resolves to ");
                                    sb14.append(timeZone2.getID());
                                    throw new IndexOutOfBoundsException(sb14.toString());
                                }
                            }
                            i7 = i6;
                            timeZone = timeZone2;
                        }
                    }
                }
            } else {
                cCharAt = str.charAt(i2);
                if (cCharAt == 'Z') {
                    timeZone = c;
                    i7 = (((i2 ^ 1) | (i2 & 1)) << 1) - (((~i2) & 1) | (i2 & (-2)));
                    int i1319 = b;
                    int i13110 = ((i1319 ^ 85) | (i1319 & 85)) << 1;
                    int i13111 = -((85 & (~i1319)) | (i1319 & (-86)));
                    int i13112 = (i13110 ^ i13111) + ((i13111 & i13110) << 1);
                    a = i13112 % 128;
                    int i141110 = i13112 % 2;
                } else {
                    if (cCharAt != '+') {
                        int i141111 = a;
                        int i141112 = i141111 & 25;
                        int i141113 = -(-(i141111 | 25));
                        i8 = ((i141112 | i141113) << 1) - (i141113 ^ i141112);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append("Invalid time zone indicator '");
                            sb15.append(cCharAt);
                            sb15.append("'");
                            throw new IndexOutOfBoundsException(sb15.toString());
                        }
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append("Invalid time zone indicator '");
                        sb16.append(cCharAt);
                        sb16.append("'");
                        throw new IndexOutOfBoundsException(sb16.toString());
                    }
                    strSubstring = str.substring(i2);
                    length = strSubstring.length();
                    int i141114 = b;
                    int i141115 = (((31 & (~i141114)) | (i141114 & (-32))) - (~(-(-((i141114 & 31) << 1))))) - 1;
                    a = i141115 % 128;
                    int i141116 = i141115 % 2;
                    if (length >= 5) {
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append(strSubstring);
                        int i141117 = a + 17;
                        b = i141117 % 128;
                        int i141118 = i141117 % 2;
                        sb17.append("00");
                        strSubstring = sb17.toString();
                        int i141119 = a;
                        int i151118 = i141119 & 93;
                        i5 = (((i141119 ^ 93) | i151118) << 1) - ((~i151118) & (i141119 | 93));
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i151119 = 82 / 0;
                        }
                        int i151120 = (-2) - (((i141119 ^ 78) + ((i141119 & 78) << 1)) ^ (-1));
                        b = i151120 % 128;
                        int i151121 = i151120 % 2;
                    }
                    i6 = (i2 - (~(-(~(-(-strSubstring.length())))))) - 2;
                    if ("+0000".equals(strSubstring)) {
                        timeZone = c;
                        int i1511110 = b;
                        int i1511111 = i1511110 ^ 7;
                        int i1511112 = ((((i1511110 & 7) | i1511111) << 1) - (~(-i1511111))) - 1;
                        a = i1511112 % 128;
                        int i1511113 = i1511112 % 2;
                        i7 = i6;
                    } else {
                        int i1524 = a + 89;
                        b = i1524 % 128;
                        int i1525 = i1524 % 2;
                        if ("+00:00".equals(strSubstring)) {
                            int i161110 = b;
                            int i161111 = i161110 & 59;
                            int i161112 = ((i161110 ^ 59) | i161111) << 1;
                            int i161113 = -((i161110 | 59) & (~i161111));
                            int i161114 = (i161112 ^ i161113) + ((i161113 & i161112) << 1);
                            a = i161114 % 128;
                            int i161115 = i161114 % 2;
                            timeZone = c;
                            int i1511114 = b;
                            int i1511115 = i1511114 ^ 7;
                            int i1511116 = ((((i1511114 & 7) | i1511115) << 1) - (~(-i1511115))) - 1;
                            a = i1511116 % 128;
                            int i1511117 = i1511116 % 2;
                            i7 = i6;
                        } else {
                            StringBuilder sb18 = new StringBuilder();
                            int i161116 = a + 71;
                            b = i161116 % 128;
                            int i161117 = i161116 % 2;
                            sb18.append("GMT");
                            sb18.append(strSubstring);
                            string2 = sb18.toString();
                            timeZone2 = TimeZone.getTimeZone(string2);
                            id = timeZone2.getID();
                            int i161118 = a + 119;
                            b = i161118 % 128;
                            int i161119 = i161118 % 2;
                            if (!id.equals(string2)) {
                                int i1715 = a;
                                int i1716 = i1715 & 35;
                                int i1717 = -(-((i1715 ^ 35) | i1716));
                                int i1718 = ((i1716 | i1717) << 1) - (i1717 ^ i1716);
                                b = i1718 % 128;
                                int i1719 = i1718 % 2;
                                if (!id.replace(":", BuildConfig.FLAVOR).equals(string2)) {
                                    StringBuilder sb19 = new StringBuilder();
                                    sb19.append("Mismatching time zone indicator: ");
                                    sb19.append(string2);
                                    sb19.append(" given, resolves to ");
                                    sb19.append(timeZone2.getID());
                                    throw new IndexOutOfBoundsException(sb19.toString());
                                }
                            }
                            i7 = i6;
                            timeZone = timeZone2;
                        }
                    }
                }
            }
            gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            int i1810 = a;
            int i1811 = i1810 ^ 15;
            int i1812 = ((((i1810 & 15) | i1811) << 1) - (~(-i1811))) - 1;
            b = i1812 % 128;
            int i1813 = i1812 % 2;
            gregorianCalendar.set(1, iD);
            int i1814 = (iD6 ^ (-1)) | iD6;
            gregorianCalendar.set(2, (iD6 & i1814) + (i1814 | iD6));
            int i1815 = b;
            i9 = ((i1815 & 8) + (i1815 | 8)) - 1;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                gregorianCalendar.set(3, iD7);
                gregorianCalendar.set(99, iD3);
            } else {
                gregorianCalendar.set(5, iD7);
                gregorianCalendar.set(11, iD3);
            }
            gregorianCalendar.set(12, iD2);
            gregorianCalendar.set(13, iD5);
            gregorianCalendar.set(14, iD4);
            parsePosition.setIndex(i7);
            return gregorianCalendar.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException e) {
            if (str == null) {
                int i195 = a;
                int i196 = ((i195 ^ 97) | (i195 & 97)) << 1;
                int i197 = -(((~i195) & 97) | (i195 & (-98)));
                int i198 = (i196 & i197) + (i197 | i196);
                b = i198 % 128;
                int i199 = i198 % 2;
                string = null;
            } else {
                StringBuilder sb20 = new StringBuilder();
                int i200 = b + 79;
                a = i200 % 128;
                int i201 = i200 % 2;
                sb20.append('\"');
                sb20.append(str);
                int i202 = a;
                int i203 = ((i202 & 36) + (i202 | 36)) - 1;
                b = i203 % 128;
                int i204 = i203 % 2;
                sb20.append('\"');
                string = sb20.toString();
            }
            String message = e.getMessage();
            if (message != null) {
                int i205 = b;
                int i206 = i205 ^ 103;
                int i207 = (i205 & 103) << 1;
                int i208 = (i206 ^ i207) + ((i207 & i206) << 1);
                a = i208 % 128;
                if (i208 % 2 == 0) {
                    message.isEmpty();
                    throw null;
                }
                if (message.isEmpty()) {
                    sbW = ivas.gov.bisp.enumeration.p091n.j.w("(");
                    name = e.getClass().getName();
                    int i209 = a;
                    i = ((((i209 ^ 55) | (i209 & 55)) << 1) - (~(-(((~i209) & 55) | (i209 & (-56)))))) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        sbW.append(name);
                        sbW.append(")");
                        sbW.toString();
                        throw null;
                    }
                    sbW.append(name);
                    sbW.append(")");
                    message = sbW.toString();
                    int i210 = a;
                    int i211 = ((i210 | 89) << 1) - (i210 ^ 89);
                    b = i211 % 128;
                    int i212 = i211 % 2;
                }
            } else {
                sbW = ivas.gov.bisp.enumeration.p091n.j.w("(");
                name = e.getClass().getName();
                int i2010 = a;
                i = ((((i2010 ^ 55) | (i2010 & 55)) << 1) - (~(-(((~i2010) & 55) | (i2010 & (-56)))))) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    sbW.append(name);
                    sbW.append(")");
                    sbW.toString();
                    throw null;
                }
                sbW.append(name);
                sbW.append(")");
                message = sbW.toString();
                int i213 = a;
                int i214 = ((i213 | 89) << 1) - (i213 ^ 89);
                b = i214 % 128;
                int i215 = i214 % 2;
            }
            StringBuilder sb21 = new StringBuilder();
            sb21.append("Failed to parse date [");
            int i216 = a;
            int i217 = i216 & 77;
            int i218 = i217 + ((i216 ^ 77) | i217);
            b = i218 % 128;
            int i219 = i218 % 2;
            sb21.append(string);
            sb21.append("]: ");
            sb21.append(message);
            ParseException parseException = new ParseException(sb21.toString(), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }
}
