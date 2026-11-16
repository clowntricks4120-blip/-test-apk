package ivas.gov.bisp.enumeration.p020at;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class au {
    private static int a = 1;
    private static int b;
    public final String c;
    public final Map<String, bae> d;
    public final Set<baf> e;
    public final Set<bah> f;

    public static class bae {
        private static int a = 1;
        private static int b;
        public final String c;
        public final String d;
        public final int e;
        public final boolean f;
        public final String g;
        public final int h;
        public final int i;

        /* JADX WARN: Code duplicated, block: B:41:0x0123  */
        /* JADX WARN: Code duplicated, block: B:48:0x014a  */
        /* JADX WARN: Code duplicated, block: B:51:0x0167  */
        public bae(String str, String str2, boolean z, int i, String str3, int i2) {
            int i3;
            this.c = str;
            this.d = str2;
            this.f = z;
            this.h = i;
            Object obj = null;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                int i4 = b;
                int i5 = i4 ^ 29;
                int i6 = -(-((i4 & 29) << 1));
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    upperCase.contains("INT");
                    throw null;
                }
                if (upperCase.contains("INT")) {
                    int i8 = a;
                    int i9 = (i8 & (-70)) | ((~i8) & 69);
                    int i10 = -(-((i8 & 69) << 1));
                    int i11 = (i9 & i10) + (i10 | i9);
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 2 % 2;
                    }
                    i3 = 3;
                } else if (!upperCase.contains("CHAR")) {
                    int i13 = a;
                    int i14 = i13 & 25;
                    int i15 = (i13 | 25) & (~i14);
                    int i16 = -(-(i14 << 1));
                    int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                    b = i17 % 128;
                    if (i17 % 2 != 0) {
                        upperCase.contains("CLOB");
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!upperCase.contains("CLOB"))) {
                        int i18 = a;
                        int i19 = i18 & 33;
                        int i20 = (i18 | 33) & (~i19);
                        int i21 = -(-(i19 << 1));
                        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                        b = i22 % 128;
                        int i23 = i22 % 2;
                        int i24 = 2 % 2;
                        i3 = 2;
                    } else {
                        int i25 = a;
                        int i26 = i25 ^ 83;
                        int i27 = -(-((i25 & 83) << 1));
                        int i28 = (i26 & i27) + (i27 | i26);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        if (!(!upperCase.contains("TEXT"))) {
                            int i110 = a;
                            int i111 = i110 & 33;
                            int i210 = (i110 | 33) & (~i111);
                            int i211 = -(-(i111 << 1));
                            int i212 = ((i210 | i211) << 1) - (i210 ^ i211);
                            b = i212 % 128;
                            int i213 = i212 % 2;
                            int i214 = 2 % 2;
                            i3 = 2;
                        } else {
                            int i30 = b;
                            int i31 = i30 & 51;
                            int i32 = (i30 ^ 51) | i31;
                            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                            a = i33 % 128;
                            if (i33 % 2 == 0) {
                                upperCase.contains("BLOB");
                                throw null;
                            }
                            if (upperCase.contains("BLOB")) {
                                i3 = 5;
                            } else {
                                int i34 = b;
                                int i35 = (i34 & (-56)) | ((~i34) & 55);
                                int i36 = -(-((i34 & 55) << 1));
                                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                                a = i37 % 128;
                                if (i37 % 2 == 0) {
                                    upperCase.contains("REAL");
                                    obj.hashCode();
                                    throw null;
                                }
                                if (upperCase.contains("REAL") || upperCase.contains("FLOA")) {
                                    int i38 = a;
                                    int i39 = ((i38 ^ 27) - (~(-(-((i38 & 27) << 1))))) - 1;
                                    b = i39 % 128;
                                    int i40 = i39 % 2;
                                    int i41 = 2 % 2;
                                    i3 = 4;
                                } else {
                                    int i42 = a;
                                    int i43 = i42 & 23;
                                    int i44 = i43 + ((i42 ^ 23) | i43);
                                    b = i44 % 128;
                                    if (i44 % 2 != 0) {
                                        upperCase.contains("DOUB");
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (upperCase.contains("DOUB")) {
                                        int i310 = a;
                                        int i311 = ((i310 ^ 27) - (~(-(-((i310 & 27) << 1))))) - 1;
                                        b = i311 % 128;
                                        int i45 = i311 % 2;
                                        int i46 = 2 % 2;
                                        i3 = 4;
                                    } else {
                                        int i47 = b;
                                        int i48 = i47 ^ 29;
                                        int i49 = ((((i47 & 29) | i48) << 1) - (~(-i48))) - 1;
                                        a = i49 % 128;
                                        int i50 = i49 % 2;
                                        int i51 = (i47 & (-32)) | ((~i47) & 31);
                                        int i52 = (i47 & 31) << 1;
                                        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                                        a = i53 % 128;
                                        int i54 = i53 % 2;
                                        int i55 = 2 % 2;
                                        i3 = 1;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int i112 = a;
                    int i113 = i112 & 33;
                    int i215 = (i112 | 33) & (~i113);
                    int i216 = -(-(i113 << 1));
                    int i217 = ((i215 | i216) << 1) - (i215 ^ i216);
                    b = i217 % 128;
                    int i218 = i217 % 2;
                    int i219 = 2 % 2;
                    i3 = 2;
                }
            } else {
                i3 = 5;
            }
            this.e = i3;
            this.g = str3;
            int i56 = b;
            int i57 = i56 | 51;
            int i58 = i57 << 1;
            int i59 = -(i57 & (~(i56 & 51)));
            int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
            a = i60 % 128;
            int i61 = i60 % 2;
            this.i = i2;
            int i62 = i56 & 9;
            int i63 = i62 + ((i56 ^ 9) | i62);
            a = i63 % 128;
            if (i63 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            StringBuilder sbW;
            String str;
            char c;
            int i = 2 % 2;
            int i2 = b + 93;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                sbW = j.w("Column{name='");
                str = this.c;
                c = 'W';
            } else {
                sbW = j.w("Column{name='");
                str = this.c;
                c = '\'';
            }
            int i3 = a;
            int i4 = i3 | 7;
            int i5 = i4 << 1;
            int i6 = -((~(i3 & 7)) & i4);
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            j.v(sbW, str, c, ", type='");
            j.v(sbW, this.d, '\'', ", affinity='");
            int i9 = a;
            int i10 = i9 & 89;
            int i11 = ((i9 ^ 89) | i10) << 1;
            int i12 = -((i9 | 89) & (~i10));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                sbW.append(this.e);
                sbW.append('s');
            } else {
                sbW.append(this.e);
                sbW.append('\'');
            }
            int i14 = a;
            int i15 = i14 ^ 123;
            int i16 = (((i14 & 123) | i15) << 1) - i15;
            b = i16 % 128;
            int i17 = i16 % 2;
            sbW.append(", notNull=");
            sbW.append(this.f);
            int i18 = b;
            int i19 = (i18 & 17) + (i18 | 17);
            a = i19 % 128;
            int i20 = i19 % 2;
            sbW.append(", primaryKeyPosition=");
            sbW.append(this.h);
            if (i20 == 0) {
                throw null;
            }
            sbW.append(", defaultValue='");
            sbW.append(this.g);
            int i21 = b + 11;
            a = i21 % 128;
            int i22 = i21 % 2;
            sbW.append('\'');
            sbW.append('}');
            int i23 = b;
            int i24 = i23 & 77;
            int i25 = (i23 | 77) & (~i24);
            int i26 = i24 << 1;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
            String string = sbW.toString();
            int i29 = a;
            int i30 = (i29 ^ 87) + ((i29 & 87) << 1);
            b = i30 % 128;
            int i31 = i30 % 2;
            return string;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = a + 103;
            b = i4 % 128;
            int i5 = i4 % 2;
            int iHashCode = this.c.hashCode();
            int i6 = this.e;
            int i7 = b;
            int i8 = i7 & 33;
            int i9 = -(-((i7 ^ 33) | i8));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            if (this.f) {
                int i13 = i11 & 19;
                int i14 = i11 | 19;
                int i15 = (i13 & i14) + (i13 | i14);
                int i16 = i15 % 128;
                b = i16;
                i = i15 % 2 != 0 ? 30934 : 1231;
                int i17 = i16 + 111;
                a = i17 % 128;
                int i18 = i17 % 2;
            } else {
                int i19 = ((i7 ^ 25) | (i7 & 25)) << 1;
                int i20 = -(((~i7) & 25) | (i7 & (-26)));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
                i = 1237;
            }
            int i23 = iHashCode * 31;
            int i24 = -(~(-(-i6)));
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            int i26 = (((i25 ^ (-1)) + (i25 << 1)) * 31) - (~i);
            int i27 = ((i26 ^ (-1)) + (i26 << 1)) * 31;
            int i28 = a;
            int i29 = ((i28 | 77) << 1) - (i28 ^ 77);
            b = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = -(-this.h);
                i2 = (i27 ^ i30) + ((i27 & i30) << 1);
            } else {
                int i31 = -(~(-(-this.h)));
                i2 = ((i27 ^ i31) + ((i27 & i31) << 1)) - 1;
            }
            int i32 = (-2) - ((((i28 | 126) << 1) - (i28 ^ 126)) ^ (-1));
            b = i32 % 128;
            int i33 = i32 % 2;
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        /* JADX WARN: Code duplicated, block: B:21:0x0062  */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x023b, code lost:
        
            r3 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x023c, code lost:
        
            r11 = ivas.gov.bisp.enumeration.at.au.bae.a;
            r1 = (((r11 | 22) << 1) - (r11 ^ 22)) - 1;
            ivas.gov.bisp.enumeration.at.au.bae.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x024a, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x024b, code lost:
        
            r11 = ((ivas.gov.bisp.enumeration.at.au.bae) r11).h;
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0252, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (ivas.gov.bisp.enumeration.at.au.bae.class == r11.getClass()) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        
            if (ivas.gov.bisp.enumeration.at.au.bae.class == r11.getClass()) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        
            r2 = ivas.gov.bisp.enumeration.at.au.bae.b;
            r5 = r2 ^ 15;
            r2 = ((r2 & 15) | r5) << 1;
            r5 = -r5;
            r6 = (r2 & r5) + (r2 | r5);
            r2 = r6 % 128;
            ivas.gov.bisp.enumeration.at.au.bae.a = r2;
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        
            if ((r6 % 2) == 0) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        
            r11 = (ivas.gov.bisp.enumeration.at.au.bae) r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        
            if (r10.h == r11.h) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
        
            r11 = (r2 & 89) + (r2 | 89);
            ivas.gov.bisp.enumeration.at.au.bae.b = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        
            if ((r11 % 2) == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        
            r11 = 60 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
        
            if (r10.c.equals(r11.c) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
        
            r11 = ivas.gov.bisp.enumeration.at.au.bae.b + 47;
            r1 = r11 % 128;
            ivas.gov.bisp.enumeration.at.au.bae.a = r1;
            r11 = r11 % 2;
            r11 = (-2) - ((((r1 | 70) << 1) - (r1 ^ 70)) ^ (-1));
            ivas.gov.bisp.enumeration.at.au.bae.b = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
        
            if ((r11 % 2) != 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
        
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
        
            if (r10.f == r11.f) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
        
            r11 = ivas.gov.bisp.enumeration.at.au.bae.a;
            r1 = r11 & 57;
            r2 = (~r1) & (r11 | 57);
            r1 = r1 << 1;
            r6 = ((r2 | r1) << 1) - (r1 ^ r2);
            ivas.gov.bisp.enumeration.at.au.bae.b = r6 % 128;
            r6 = r6 % 2;
            r1 = ((r11 & 44) + (r11 | 44)) - 1;
            ivas.gov.bisp.enumeration.at.au.bae.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
        
            if ((r1 % 2) != 0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
        
            if (r10.i != 1) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        
            r2 = ivas.gov.bisp.enumeration.at.au.bae.a;
            r6 = r2 + 33;
            ivas.gov.bisp.enumeration.at.au.bae.b = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
        
            if (r11.i != 2) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
        
            r6 = r2 & 113;
            r2 = (((r2 | 113) & (~r6)) - (~(-(-(r6 << 1))))) - 1;
            r6 = r2 % 128;
            ivas.gov.bisp.enumeration.at.au.bae.b = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0108, code lost:
        
            if ((r2 % 2) != 0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
        
            r2 = r10.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
        
            if (r2 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
        
            r8 = (((r6 & (-32)) | ((~r6) & 31)) - (~(-(-((r6 & 31) << 1))))) - 1;
            ivas.gov.bisp.enumeration.at.au.bae.a = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
        
            if (r2.equals(r11.g) == true) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        
            r11 = ivas.gov.bisp.enumeration.at.au.bae.b;
            r1 = ((r11 ^ 107) | (r11 & 107)) << 1;
            r11 = -(((~r11) & 107) | (r11 & (-108)));
            r2 = ((r1 | r11) << 1) - (r11 ^ r1);
            r11 = r2 % 128;
            ivas.gov.bisp.enumeration.at.au.bae.a = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0141, code lost:
        
            if ((r2 % 2) != 0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0143, code lost:
        
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
        
            r11 = r11 + 111;
            ivas.gov.bisp.enumeration.at.au.bae.b = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x014b, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x014f, code lost:
        
            if (r10.i != 2) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0151, code lost:
        
            r2 = ivas.gov.bisp.enumeration.at.au.bae.b;
            r6 = ((r2 | 77) << 1) - (r2 ^ 77);
            ivas.gov.bisp.enumeration.at.au.bae.a = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
        
            if ((r6 % 2) != 0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
        
            if (r11.i != 1) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
        
            if (r11.i != 1) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0169, code lost:
        
            r6 = r2 ^ 35;
            r2 = ((r2 & 35) | r6) << 1;
            r6 = -r6;
            r7 = (r2 ^ r6) + ((r2 & r6) << 1);
            ivas.gov.bisp.enumeration.at.au.bae.a = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x017a, code lost:
        
            if ((r7 % 2) == 0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x017c, code lost:
        
            r2 = r11.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x017e, code lost:
        
            if (r2 == null) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0186, code lost:
        
            if (r2.equals(r10.g) != false) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0188, code lost:
        
            r11 = ivas.gov.bisp.enumeration.at.au.bae.a;
            r1 = r11 & 101;
            r11 = r11 | 101;
            r2 = ((r1 | r11) << 1) - (r11 ^ r1);
            r11 = r2 % 128;
            ivas.gov.bisp.enumeration.at.au.bae.b = r11;
            r2 = r2 % 2;
            r1 = r11 & 25;
            r1 = (r1 - (~(-(-((r11 ^ 25) | r1))))) - 1;
            ivas.gov.bisp.enumeration.at.au.bae.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x01a7, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01a8, code lost:
        
            r11 = r11.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01aa, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01ab, code lost:
        
            r2 = r10.i;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01ad, code lost:
        
            if (r2 == 0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x01af, code lost:
        
            r5 = ivas.gov.bisp.enumeration.at.au.bae.a;
            r6 = r5 & 87;
            r6 = (r6 - (~(-(-((r5 ^ 87) | r6))))) - 1;
            ivas.gov.bisp.enumeration.at.au.bae.b = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01c2, code lost:
        
            if (r2 != r11.i) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01c4, code lost:
        
            r2 = ((r5 & (-10)) | ((~r5) & 9)) + ((r5 & 9) << 1);
            ivas.gov.bisp.enumeration.at.au.bae.b = r2 % 128;
            r2 = r2 % 2;
            r2 = r10.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01d5, code lost:
        
            if (r2 == null) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01d7, code lost:
        
            r5 = r5 + 35;
            ivas.gov.bisp.enumeration.at.au.bae.b = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x01de, code lost:
        
            if ((r5 % 2) == 0) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x01e0, code lost:
        
            r5 = 80 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x01e9, code lost:
        
            if (r2.equals(r11.g) != false) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x01f2, code lost:
        
            if (r2.equals(r11.g) != false) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01f4, code lost:
        
            r11 = ivas.gov.bisp.enumeration.at.au.bae.b + 43;
            ivas.gov.bisp.enumeration.at.au.bae.a = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0200, code lost:
        
            if (r11.g == null) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0202, code lost:
        
            r11 = ivas.gov.bisp.enumeration.at.au.bae.b;
            r1 = (r11 ^ 73) + ((r11 & 73) << 1);
            ivas.gov.bisp.enumeration.at.au.bae.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x020f, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0214, code lost:
        
            if (r10.e == r11.e) goto L100;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0216, code lost:
        
            r11 = ivas.gov.bisp.enumeration.at.au.bae.b;
            r1 = ((r11 & 3) - (~(r11 | 3))) - 1;
            ivas.gov.bisp.enumeration.at.au.bae.a = r1 % 128;
            r1 = r1 % 2;
            r1 = ((r11 ^ 53) | (r11 & 53)) << 1;
            r11 = -(((~r11) & 53) | (r11 & (-54)));
            r2 = (r1 & r11) + (r11 | r1);
            ivas.gov.bisp.enumeration.at.au.bae.a = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 609
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.at.au.bae.equals(java.lang.Object):boolean");
        }
    }

    public static class bag implements Comparable<bag> {
        private static int a = 1;
        private static int b;
        public final int c;
        public final int d;
        public final String e;
        public final String f;

        public bag(int i, int i2, String str, String str2) {
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(bag bagVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 103;
            int i4 = (i2 ^ 103) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            bag bagVar2 = bagVar;
            int i8 = (-2) - ((this.c - (~(-bagVar2.c))) ^ (-1));
            int i9 = ((i6 ^ 51) | (i6 & 51)) << 1;
            int i10 = -((i6 & (-52)) | ((~i6) & 51));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            Object obj = null;
            if (i11 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i8 == 0) {
                i8 = (this.d - (~(-bagVar2.d))) - 1;
                int i12 = i6 + 35;
                b = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = i6 & 95;
            int i15 = ((i6 | 95) & (~i14)) + (i14 << 1);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                return i8;
            }
            throw null;
        }
    }

    public au(String str, Map<String, bae> map, Set<baf> set, Set<bah> set2) {
        Set<bah> setUnmodifiableSet;
        this.c = str;
        this.d = Collections.unmodifiableMap(map);
        this.e = Collections.unmodifiableSet(set);
        if (set2 == null) {
            int i = b;
            int i2 = (((i ^ 83) | (i & 83)) << 1) - (((~i) & 83) | (i & (-84)));
            a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            setUnmodifiableSet = null;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(set2);
            int i5 = a;
            int i6 = i5 & 33;
            int i7 = -(-((i5 ^ 33) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
        this.f = setUnmodifiableSet;
        int i11 = a;
        int i12 = ((i11 & 54) + (i11 | 54)) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 43) + (i2 | 43);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            j.w("TableInfo{name='");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StringBuilder sbW = j.w("TableInfo{name='");
        String str = this.c;
        int i4 = b;
        int i5 = ((i4 | 43) << 1) - (i4 ^ 43);
        a = i5 % 128;
        int i6 = i5 % 2;
        j.v(sbW, str, '\'', ", columns=");
        Map<String, bae> map = this.d;
        int i7 = a;
        int i8 = i7 & 79;
        int i9 = ((i7 ^ 79) | i8) << 1;
        int i10 = -((i7 | 79) & (~i8));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        sbW.append(map);
        sbW.append(", foreignKeys=");
        int i13 = b;
        int i14 = (((i13 ^ 75) | (i13 & 75)) << 1) - (((~i13) & 75) | (i13 & (-76)));
        a = i14 % 128;
        int i15 = i14 % 2;
        sbW.append(this.e);
        if (i15 == 0) {
            int i16 = 98 / 0;
        }
        int i17 = a;
        int i18 = (i17 & (-92)) | ((~i17) & 91);
        int i19 = -(-((i17 & 91) << 1));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        b = i20 % 128;
        int i21 = i20 % 2;
        sbW.append(", indices=");
        Set<bah> set = this.f;
        int i22 = a;
        int i23 = ((i22 | 39) << 1) - (i22 ^ 39);
        b = i23 % 128;
        int i24 = i23 % 2;
        sbW.append(set);
        sbW.append(i24 != 0 ? '5' : '}');
        int i25 = b;
        int i26 = i25 & 75;
        int i27 = (i25 ^ 75) | i26;
        int i28 = (i26 & i27) + (i27 | i26);
        a = i28 % 128;
        int i29 = i28 % 2;
        String string = sbW.toString();
        int i30 = b;
        int i31 = i30 & 41;
        int i32 = (((i30 | 41) & (~i31)) - (~(i31 << 1))) - 1;
        a = i32 % 128;
        int i33 = i32 % 2;
        return string;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 11) + ((i2 & 11) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.c;
        if (str != null) {
            int i6 = ((i2 ^ 64) + ((i2 & 64) << 1)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                str.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode = str.hashCode();
            int i7 = a;
            int i8 = ((i7 ^ 71) - (~((i7 & 71) << 1))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
        } else {
            int i10 = (i4 & 23) + (i4 | 23);
            b = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = 0;
        }
        Map<String, bae> map = this.d;
        if (map != null) {
            int i12 = a;
            int i13 = ((i12 | 77) << 1) - (i12 ^ 77);
            b = i13 % 128;
            int i14 = i13 % 2;
            iHashCode2 = map.hashCode();
            int i15 = b;
            int i16 = i15 & 41;
            int i17 = -(-((i15 ^ 41) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 2 / 4;
            }
        } else {
            int i20 = b;
            int i21 = i20 ^ 1;
            int i22 = ((i20 & 1) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            iHashCode2 = 0;
        }
        Set<baf> set = this.e;
        if (set != null) {
            int i26 = a + 49;
            b = i26 % 128;
            int i27 = i26 % 2;
            iHashCode3 = set.hashCode();
            int i28 = a;
            int i29 = (((i28 ^ 83) | (i28 & 83)) << 1) - (((~i28) & 83) | (i28 & (-84)));
            b = i29 % 128;
            int i30 = i29 % 2;
        } else {
            iHashCode3 = 0;
        }
        int i31 = iHashCode * 31;
        int i32 = -(-iHashCode2);
        int i33 = (((((i31 ^ i32) | (i31 & i32)) << 1) - (~(-(((~i31) & i32) | ((~i32) & i31))))) - 1) * 31;
        int i34 = -(-iHashCode3);
        int i35 = i33 ^ i34;
        int i36 = (i34 & i33) << 1;
        int i37 = (i35 & i36) + (i36 | i35);
        int i38 = a;
        int i39 = i38 & 73;
        int i40 = ((((i38 ^ 73) | i39) << 1) - (~(-((i38 | 73) & (~i39))))) - 1;
        b = i40 % 128;
        if (i40 % 2 != 0) {
            int i41 = 38 / 0;
        }
        return i37;
    }

    public static class baf {
        private static int a = 1;
        private static int b;
        public final String c;
        public final String d;
        public final String e;
        public final List<String> f;
        public final List<String> g;

        public baf(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = Collections.unmodifiableList(list);
            this.g = Collections.unmodifiableList(list2);
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 ^ 40) + ((i2 & 40) << 1)) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode2 = this.c.hashCode();
            String str = this.d;
            int i5 = b;
            int i6 = i5 & 75;
            int i7 = (i5 | 75) & (~i6);
            int i8 = i6 << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            int iHashCode3 = str.hashCode();
            int iHashCode4 = this.e.hashCode();
            int i11 = b;
            int i12 = i11 & 93;
            int i13 = ((i11 | 93) & (~i12)) + (i12 << 1);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                iHashCode = this.f.hashCode();
                int i14 = 76 / 0;
            } else {
                iHashCode = this.f.hashCode();
            }
            int iHashCode5 = this.g.hashCode();
            int i15 = b;
            int i16 = ((i15 | 103) << 1) - (i15 ^ 103);
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            int i19 = -(-(iHashCode2 * 31));
            int i20 = ((~i19) & iHashCode3) | ((~iHashCode3) & i19);
            int i21 = (i19 & iHashCode3) << 1;
            int i22 = ((i20 & i21) + (i21 | i20)) * 31;
            int i23 = iHashCode4 & i22;
            int i24 = ((((i22 | iHashCode4) & (~i23)) - (~(i23 << 1))) - 1) * 31;
            int i25 = (i17 & 7) + (i17 | 7);
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            int i28 = -(-i24);
            int i29 = (iHashCode | i28) << 1;
            int i30 = -((i28 & (~iHashCode)) | ((~i28) & iHashCode));
            int i31 = ((i29 ^ i30) + ((i30 & i29) << 1)) * 31;
            int i32 = (iHashCode5 | i31) << 1;
            int i33 = -(iHashCode5 ^ i31);
            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
            int i35 = ((i26 | 105) << 1) - (i26 ^ 105);
            a = i35 % 128;
            int i36 = i35 % 2;
            return i34;
        }

        public String toString() {
            String str;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 61;
            int i4 = (i3 - (~((i2 ^ 61) | i3))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            StringBuilder sbW = j.w("ForeignKey{referenceTable='");
            String str2 = this.c;
            int i6 = b;
            int i7 = i6 & 125;
            int i8 = (i6 ^ 125) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                j.v(sbW, str2, 'G', ", onDelete='");
            } else {
                j.v(sbW, str2, '\'', ", onDelete='");
            }
            String str3 = this.d;
            int i10 = b + 25;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                j.v(sbW, str3, '1', ", onUpdate='");
                str = this.e;
            } else {
                j.v(sbW, str3, '\'', ", onUpdate='");
                str = this.e;
            }
            j.v(sbW, str, '\'', ", columnNames=");
            List<String> list = this.f;
            int i11 = a;
            int i12 = (-2) - (((i11 & 88) + (i11 | 88)) ^ (-1));
            b = i12 % 128;
            if (i12 % 2 != 0) {
                sbW.append(list);
                sbW.append(", referenceColumnNames=");
                throw null;
            }
            sbW.append(list);
            sbW.append(", referenceColumnNames=");
            int i13 = b + 36;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            sbW.append(this.g);
            int i16 = b + 83;
            a = i16 % 128;
            int i17 = i16 % 2;
            sbW.append('}');
            String string = sbW.toString();
            int i18 = b;
            int i19 = i18 & 67;
            int i20 = -(-((i18 ^ 67) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            a = i21 % 128;
            int i22 = i21 % 2;
            return string;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (ivas.gov.bisp.enumeration.at.au.baf.class == r8.getClass()) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (ivas.gov.bisp.enumeration.at.au.baf.class == r8.getClass()) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            r8 = (ivas.gov.bisp.enumeration.at.au.baf) r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (r7.c.equals(r8.c) != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            r8 = ivas.gov.bisp.enumeration.at.au.baf.b + 35;
            r1 = r8 % 128;
            ivas.gov.bisp.enumeration.at.au.baf.a = r1;
            r8 = r8 % 2;
            r8 = (((r1 | 88) << 1) - (r1 ^ 88)) - 1;
            ivas.gov.bisp.enumeration.at.au.baf.b = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (r7.d.equals(r8.d) != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        
            r8 = ivas.gov.bisp.enumeration.at.au.baf.a;
            r1 = r8 ^ 61;
            r8 = ((r8 & 61) | r1) << 1;
            r1 = -r1;
            r3 = ((r8 | r1) << 1) - (r8 ^ r1);
            ivas.gov.bisp.enumeration.at.au.baf.b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        
            if ((r3 % 2) == 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            if (r7.e.equals(r8.e) == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        
            if (r7.f.equals(r8.f) == true) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
        
            r8 = ivas.gov.bisp.enumeration.at.au.baf.a;
            r1 = r8 & 123;
            r3 = (((~r1) & (r8 | 123)) - (~(-(-(r1 << 1))))) - 1;
            ivas.gov.bisp.enumeration.at.au.baf.b = r3 % 128;
            r3 = r3 % 2;
            r1 = ((r8 | 95) << 1) - (r8 ^ 95);
            ivas.gov.bisp.enumeration.at.au.baf.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        
            r8 = r7.g.equals(r8.g);
            r1 = ivas.gov.bisp.enumeration.at.au.baf.b;
            r4 = r1 & 1;
            r1 = (r1 ^ 1) | r4;
            r2 = (r4 & r1) + (r1 | r4);
            ivas.gov.bisp.enumeration.at.au.baf.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
        
            if ((r2 % 2) == 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
        
            r8 = ivas.gov.bisp.enumeration.at.au.baf.b;
            r1 = ((r8 & 90) + (r8 | 90)) - 1;
            ivas.gov.bisp.enumeration.at.au.baf.a = r1 % 128;
            r1 = r1 % 2;
            r1 = ((r8 | 13) << 1) - (r8 ^ 13);
            ivas.gov.bisp.enumeration.at.au.baf.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.at.au.baf.equals(java.lang.Object):boolean");
        }
    }

    public static class bah {
        private static int a = 1;
        private static int b;
        public final String c;
        public final boolean d;
        public final List<String> e;

        public bah(String str, boolean z, List<String> list) {
            this.c = str;
            this.d = z;
            this.e = list;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 11) + ((i2 & 11) << 1);
            int i4 = i3 % 128;
            a = i4;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i5 = i4 & 95;
                int i6 = (i5 - (~((i4 ^ 95) | i5))) - 1;
                b = i6 % 128;
                return i6 % 2 == 0;
            }
            if (obj != null) {
                int i7 = (-2) - (((i4 & 38) + (i4 | 38)) ^ (-1));
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    obj.getClass();
                    obj2.hashCode();
                    throw null;
                }
                if (bah.class == obj.getClass()) {
                    int i8 = a;
                    int i9 = i8 & 79;
                    int i10 = (((~i9) & (i8 | 79)) - (~(-(-(i9 << 1))))) - 1;
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        boolean z = ((bah) obj).d;
                        obj2.hashCode();
                        throw null;
                    }
                    bah bahVar = (bah) obj;
                    if (this.d != bahVar.d) {
                        int i11 = i8 & 5;
                        int i12 = i11 + ((i8 ^ 5) | i11);
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }
                    if (!this.e.equals(bahVar.e)) {
                        int i14 = a;
                        int i15 = (i14 ^ 53) + ((i14 & 53) << 1);
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        int i17 = (((i14 & (-96)) | ((~i14) & 95)) - (~(-(-((i14 & 95) << 1))))) - 1;
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        return false;
                    }
                    if (!this.c.startsWith("index_")) {
                        boolean zEquals = this.c.equals(bahVar.c);
                        int i19 = b;
                        int i20 = i19 & 23;
                        int i21 = -(-((i19 ^ 23) | i20));
                        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                        a = i22 % 128;
                        if (i22 % 2 != 0) {
                            return zEquals;
                        }
                        throw null;
                    }
                    int i23 = b;
                    int i24 = i23 & 31;
                    int i25 = (((i23 ^ 31) | i24) << 1) - ((i23 | 31) & (~i24));
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    boolean zStartsWith = bahVar.c.startsWith("index_");
                    int i27 = a;
                    int i28 = i27 & 117;
                    int i29 = (i28 - (~((i27 ^ 117) | i28))) - 1;
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        int i30 = 42 / 0;
                    }
                    return zStartsWith;
                }
            }
            int i31 = b;
            int i32 = i31 ^ 77;
            int i33 = (i31 & 77) << 1;
            int i34 = (i32 & i33) + (i33 | i32);
            a = i34 % 128;
            int i35 = i34 % 2;
            return false;
        }

        public String toString() {
            String str;
            char c;
            String string;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            StringBuilder sbW = j.w("Index{name='");
            if (i4 != 0) {
                str = this.c;
                c = 'Q';
            } else {
                str = this.c;
                c = '\'';
            }
            j.v(sbW, str, c, ", unique=");
            sbW.append(this.d);
            int i5 = b;
            int i6 = (i5 ^ 108) + ((i5 & 108) << 1);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            sbW.append(", columns=");
            List<String> list = this.e;
            int i9 = b + 113;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                sbW.append(list);
                sbW.append('j');
                string = sbW.toString();
            } else {
                sbW.append(list);
                sbW.append('}');
                string = sbW.toString();
            }
            int i10 = a;
            int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            return string;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = a + 23;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (this.c.startsWith("index_")) {
                int i4 = b;
                int i5 = i4 & 7;
                int i6 = ((i4 ^ 7) | i5) << 1;
                int i7 = -((~i5) & (i4 | 7));
                int i8 = (i6 & i7) + (i6 | i7);
                a = i8 % 128;
                int i9 = i8 % 2;
                int i10 = (((i4 | 96) << 1) - (i4 ^ 96)) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                iHashCode = -1184239155;
            } else {
                iHashCode = this.c.hashCode();
                int i12 = a;
                int i13 = i12 & 117;
                int i14 = ((i12 | 117) & (~i13)) + (i13 << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            boolean z = this.d;
            int iHashCode2 = this.e.hashCode();
            int i16 = b;
            int i17 = i16 & 95;
            int i18 = i16 | 95;
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = iHashCode >> 100;
                int i21 = -(z ? 1 : 0);
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                return iHashCode2 << ((((i22 & 110) | ((~i22) & (-111))) - (~(-(-((i22 & (-111)) << 1))))) - 1);
            }
            int i23 = ((iHashCode * 31) - (~(-(~(z ? 1 : 0))))) - 1;
            int i24 = -(-(((i23 ^ (-1)) + (i23 << 1)) * 31));
            return (i24 | iHashCode2) + (iHashCode2 & i24);
        }
    }

    public static bah e(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_xinfo(`");
        int i2 = b + 8;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        sb.append(str);
        sb.append("`)");
        int i5 = a;
        int i6 = i5 & 119;
        int i7 = ((i5 | 119) & (~i6)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        Cursor cursorQuery = supportSQLiteDatabase.query(sb.toString());
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int i9 = a;
            int i10 = ((i9 & 112) + (i9 | 112)) - 1;
            b = i10 % 128;
            Object obj = null;
            if (i10 % 2 != 0) {
                cursorQuery.getColumnIndex("cid");
                cursorQuery.getColumnIndex("name");
                throw null;
            }
            int columnIndex2 = cursorQuery.getColumnIndex("cid");
            int columnIndex3 = cursorQuery.getColumnIndex("name");
            int i11 = b;
            int i12 = i11 + 35;
            a = i12 % 128;
            int i13 = i12 % 2;
            if (columnIndex != -1) {
                int i14 = i11 ^ 119;
                int i15 = -(-((i11 & 119) << 1));
                int i16 = (i14 & i15) + (i15 | i14);
                int i17 = i16 % 128;
                a = i17;
                if (i16 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (columnIndex2 != -1) {
                    int i18 = i17 & 15;
                    int i19 = -(-(i17 | 15));
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    if (columnIndex3 != -1) {
                        TreeMap treeMap = new TreeMap();
                        int i22 = a;
                        int i23 = i22 & 121;
                        int i24 = (i22 | 121) & (~i23);
                        int i25 = -(-(i23 << 1));
                        int i26 = (i24 & i25) + (i24 | i25);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        while (!(!cursorQuery.moveToNext())) {
                            int i28 = b;
                            int i29 = i28 & 15;
                            int i30 = (((i28 ^ 15) | i29) << 1) - ((i28 | 15) & (~i29));
                            a = i30 % 128;
                            int i31 = i30 % 2;
                            if (cursorQuery.getInt(columnIndex2) < 0) {
                                int i32 = a;
                                int i33 = i32 & 15;
                                int i34 = ((i32 | 15) & (~i33)) + (i33 << 1);
                                b = i34 % 128;
                                int i35 = i34 % 2;
                            } else {
                                int i36 = cursorQuery.getInt(columnIndex);
                                String string = cursorQuery.getString(columnIndex3);
                                int i37 = a;
                                int i38 = ((i37 & (-42)) | ((~i37) & 41)) + ((i37 & 41) << 1);
                                b = i38 % 128;
                                if (i38 % 2 != 0) {
                                    treeMap.put(Integer.valueOf(i36), string);
                                    int i39 = 42 / 0;
                                } else {
                                    treeMap.put(Integer.valueOf(i36), string);
                                }
                                int i40 = b + 86;
                                int i41 = (i40 ^ (-1)) + (i40 << 1);
                                a = i41 % 128;
                                int i42 = i41 % 2;
                            }
                        }
                        ArrayList arrayList = new ArrayList(treeMap.size());
                        arrayList.addAll(treeMap.values());
                        bah bahVar = new bah(str, z, arrayList);
                        int i43 = a;
                        int i44 = i43 & 89;
                        int i45 = -(-((i43 ^ 89) | i44));
                        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                        b = i46 % 128;
                        int i47 = i46 % 2;
                        cursorQuery.close();
                        int i48 = b;
                        int i49 = (-2) - ((((i48 | 108) << 1) - (i48 ^ 108)) ^ (-1));
                        a = i49 % 128;
                        if (i49 % 2 != 0) {
                            return bahVar;
                        }
                        throw null;
                    }
                }
            }
            cursorQuery.close();
            int i50 = b;
            int i51 = i50 & 47;
            int i52 = -(-((i50 ^ 47) | i51));
            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
            a = i53 % 128;
            if (i53 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r9.c != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
    
        if (r9.d != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        if (r1.equals(r9.e) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010b, code lost:
    
        if (r1.equals(r9.e) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p020at.au.a;
        r1 = r9 & 81;
        r9 = (r9 ^ 81) | r1;
        r5 = ((r1 | r9) << 1) - (r9 ^ r1);
        ivas.gov.bisp.enumeration.p020at.au.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        if (r9.e != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
    
        r1 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
    
        if (r1 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p020at.au.b;
        r5 = r3 + 39;
        ivas.gov.bisp.enumeration.p020at.au.a = r5 % 128;
        r5 = r5 % 2;
        r9 = r9.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0143, code lost:
    
        if (r9 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        r5 = r3 & 119;
        r5 = (r5 - (~(-(-((r3 ^ 119) | r5))))) - 1;
        ivas.gov.bisp.enumeration.p020at.au.a = r5 % 128;
        r5 = r5 % 2;
        r9 = r1.equals(r9);
        r1 = ivas.gov.bisp.enumeration.p020at.au.a;
        r3 = (r1 & (-24)) | ((~r1) & 23);
        r1 = -(-((r1 & 23) << 1));
        r4 = (r3 & r1) + (r1 | r3);
        ivas.gov.bisp.enumeration.p020at.au.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016e, code lost:
    
        if ((r4 % 2) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0170, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0171, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0172, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p020at.au.b;
        r1 = (r9 & 120) + (r9 | 120);
        r9 = (r1 ^ (-1)) + (r1 << 1);
        ivas.gov.bisp.enumeration.p020at.au.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0182, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p020at.au.equals(java.lang.Object):boolean");
    }

    public static List<bag> d(Cursor cursor) {
        int i;
        int i2;
        String string;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (-2) - (((i5 & 26) + (i5 | 26)) ^ (-1));
        b = i6 % 128;
        if (i6 % 2 != 0) {
            cursor.getColumnIndex("id");
            cursor.getColumnIndex("seq");
            throw null;
        }
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        int i7 = a;
        int i8 = ((i7 ^ 65) - (~(-(-((i7 & 65) << 1))))) - 1;
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        int i11 = (i9 & (-100)) | ((~i9) & 99);
        int i12 = (i9 & 99) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i15 < count) {
            int i16 = b;
            int i17 = i16 & 1;
            int i18 = i17 + ((i16 ^ 1) | i17);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                cursor.moveToPosition(i15);
                i = cursor.getInt(columnIndex);
                int i19 = 80 / 0;
            } else {
                cursor.moveToPosition(i15);
                i = cursor.getInt(columnIndex);
            }
            int i20 = b;
            int i21 = (i20 & (-14)) | ((~i20) & 13);
            int i22 = (i20 & 13) << 1;
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            if (i23 % 2 == 0) {
                i2 = cursor.getInt(columnIndex2);
                string = cursor.getString(columnIndex3);
                int i24 = 93 / 0;
            } else {
                i2 = cursor.getInt(columnIndex2);
                string = cursor.getString(columnIndex3);
            }
            bag bagVar = new bag(i, i2, string, cursor.getString(columnIndex4));
            int i25 = a;
            int i26 = i25 ^ 11;
            int i27 = ((i25 & 11) | i26) << 1;
            int i28 = -i26;
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            b = i29 % 128;
            if (i29 % 2 != 0) {
                arrayList.add(bagVar);
                int i30 = i15 ^ 13;
                int i31 = (i15 & 13) << 1;
                i3 = ((i30 | i31) << 1) - (i31 ^ i30);
            } else {
                arrayList.add(bagVar);
                int i32 = ((i15 & 61) + (i15 | 61)) - 1;
                int i33 = i32 ^ (-59);
                int i34 = -(-((i32 & (-59)) << 1));
                i3 = (i33 & i34) + (i33 | i34);
            }
            i15 = i3;
        }
        Collections.sort(arrayList);
        int i35 = a + 115;
        b = i35 % 128;
        int i36 = i35 % 2;
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x053e A[EDGE_INSN: B:194:0x053e->B:148:0x053e BREAK  A[LOOP:3: B:120:0x0461->B:196:0x0461]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0121  */
    public static au c(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        HashSet hashSet;
        boolean z;
        List<bag> list;
        int columnIndex;
        int columnIndex2;
        boolean z2;
        int i = 2;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        int i3 = b;
        int i4 = i3 & 107;
        int i5 = 1;
        int i6 = (((i3 ^ 107) | i4) << 1) - ((i3 | 107) & (~i4));
        a = i6 % 128;
        if (i6 % 2 == 0) {
            sb.append(str);
            sb.append("`)");
            throw null;
        }
        sb.append(str);
        sb.append("`)");
        Cursor cursorQuery = supportSQLiteDatabase.query(sb.toString());
        HashMap map = new HashMap();
        try {
            int columnCount = cursorQuery.getColumnCount();
            int i7 = a + 120;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int i11 = 0;
            if (columnCount > 0) {
                int i12 = i9 + 33;
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    columnIndex = cursorQuery.getColumnIndex("name");
                    columnIndex2 = cursorQuery.getColumnIndex("type");
                    int i13 = 57 / 0;
                } else {
                    columnIndex = cursorQuery.getColumnIndex("name");
                    columnIndex2 = cursorQuery.getColumnIndex("type");
                }
                int i14 = a;
                int i15 = (-2) - (((i14 ^ 84) + ((i14 & 84) << 1)) ^ (-1));
                b = i15 % 128;
                int i16 = i15 % 2;
                int columnIndex3 = cursorQuery.getColumnIndex("notnull");
                int i17 = a;
                int i18 = i17 & 9;
                int i19 = ((i17 ^ 9) | i18) << 1;
                int i20 = -((~i18) & (i17 | 9));
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                b = i21 % 128;
                int i22 = i21 % 2;
                int columnIndex4 = cursorQuery.getColumnIndex("pk");
                int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
                int i23 = b + 56;
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                int i25 = i24 % 128;
                a = i25;
                if (i24 % 2 == 0) {
                    int i26 = 74 / 0;
                }
                int i27 = i25 & 23;
                int i28 = -(-((i25 ^ 23) | i27));
                int i29 = (i27 & i28) + (i28 | i27);
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = 2 / 2;
                }
                while (((cursorQuery.moveToNext() ? 1 : 0) ^ i5) != i5) {
                    int i31 = a + 71;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    String string = cursorQuery.getString(columnIndex);
                    String string2 = cursorQuery.getString(columnIndex2);
                    int i33 = b;
                    int i34 = (i33 ^ 121) + ((i33 & 121) << i5);
                    a = i34 % 128;
                    if (i34 % 2 == 0) {
                        int i35 = 38 / i11;
                        if (cursorQuery.getInt(columnIndex3) != 0) {
                            int i36 = b;
                            int i37 = i36 & 91;
                            int i38 = (i37 - (~((i36 ^ 91) | i37))) - 1;
                            a = i38 % 128;
                            int i39 = i38 % 2;
                            z2 = true;
                        } else {
                            int i40 = a;
                            int i41 = (-2) - ((((i40 | 116) << 1) - (i40 ^ 116)) ^ (-1));
                            b = i41 % 128;
                            int i42 = i41 % 2;
                            z2 = false;
                        }
                    } else if (cursorQuery.getInt(columnIndex3) != 0) {
                        int i310 = b;
                        int i311 = i310 & 91;
                        int i312 = (i311 - (~((i310 ^ 91) | i311))) - 1;
                        a = i312 % 128;
                        int i313 = i312 % 2;
                        z2 = true;
                    } else {
                        int i43 = a;
                        int i44 = (-2) - ((((i43 | 116) << 1) - (i43 ^ 116)) ^ (-1));
                        b = i44 % 128;
                        int i45 = i44 % 2;
                        z2 = false;
                    }
                    bae baeVar = new bae(string, string2, z2, cursorQuery.getInt(columnIndex4), cursorQuery.getString(columnIndex5), 2);
                    int i46 = a;
                    int i47 = (-2) - ((((i46 | 66) << 1) - (i46 ^ 66)) ^ (-1));
                    b = i47 % 128;
                    if (i47 % 2 != 0) {
                        map.put(string, baeVar);
                        throw null;
                    }
                    map.put(string, baeVar);
                    int i48 = a + 124;
                    int i49 = (i48 ^ (-1)) + (i48 << 1);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    i5 = 1;
                    i11 = 0;
                }
            }
            cursorQuery.close();
            HashSet hashSet2 = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            int i51 = b + 15;
            a = i51 % 128;
            if (i51 % 2 == 0) {
                Object obj = null;
                sb2.append("PRAGMA foreign_key_list(`");
                sb2.append(str);
                obj.hashCode();
                throw null;
            }
            sb2.append("PRAGMA foreign_key_list(`");
            sb2.append(str);
            int i52 = b;
            int i53 = ((i52 & 49) - (~(-(-(i52 | 49))))) - 1;
            a = i53 % 128;
            int i54 = i53 % 2;
            sb2.append("`)");
            if (i54 == 0) {
                supportSQLiteDatabase.query(sb2.toString());
                throw null;
            }
            Cursor cursorQuery2 = supportSQLiteDatabase.query(sb2.toString());
            try {
                int columnIndex6 = cursorQuery2.getColumnIndex("id");
                int i55 = a;
                int i56 = (i55 & 109) + (i55 | 109);
                b = i56 % 128;
                if (i56 % 2 != 0) {
                    cursorQuery2.getColumnIndex("seq");
                    cursorQuery2.getColumnIndex("table");
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int columnIndex7 = cursorQuery2.getColumnIndex("seq");
                int columnIndex8 = cursorQuery2.getColumnIndex("table");
                int columnIndex9 = cursorQuery2.getColumnIndex("on_delete");
                int columnIndex10 = cursorQuery2.getColumnIndex("on_update");
                int i57 = a;
                int i58 = i57 & 113;
                int i59 = (~i58) & (i57 | 113);
                int i60 = -(-(i58 << 1));
                int i61 = (i59 & i60) + (i59 | i60);
                b = i61 % 128;
                if (i61 % 2 != 0) {
                    Object obj3 = null;
                    d(cursorQuery2);
                    cursorQuery2.getCount();
                    obj3.hashCode();
                    throw null;
                }
                List<bag> listD = d(cursorQuery2);
                int count = cursorQuery2.getCount();
                int i62 = a + 61;
                int i63 = i62 % 128;
                b = i63;
                int i64 = i63 + 63;
                int i65 = i62 % 2 != 0 ? 1 : 0;
                a = i64 % 128;
                if (i64 % 2 == 0) {
                    int i66 = 2 % 4;
                }
                int i67 = i65;
                while (i67 < count) {
                    int i68 = b + 125;
                    int i69 = count;
                    a = i68 % 128;
                    if (i68 % i == 0) {
                        cursorQuery2.moveToPosition(i67);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    cursorQuery2.moveToPosition(i67);
                    int i70 = b;
                    int i71 = (i70 & 71) + (i70 | 71);
                    a = i71 % 128;
                    int i72 = i71 % i;
                    if (cursorQuery2.getInt(columnIndex7) != 0) {
                        int i73 = a;
                        int i74 = i73 ^ 51;
                        int i75 = -(-((i73 & 51) << 1));
                        int i76 = (i74 ^ i75) + ((i74 & i75) << 1);
                        b = i76 % 128;
                        if (i76 % i != 0) {
                            int i77 = 5 % 5;
                        }
                        list = listD;
                    } else {
                        int i78 = cursorQuery2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) listD).iterator();
                        int i79 = b;
                        int i80 = (-2) - (((i79 ^ 94) + ((i79 & 94) << 1)) ^ (-1));
                        int i81 = i80 % 128;
                        a = i81;
                        if (i80 % 2 == 0) {
                            throw null;
                        }
                        int i82 = i81 + 75;
                        b = i82 % 128;
                        int i83 = i82 % 2;
                        while (it.hasNext()) {
                            int i84 = b;
                            int i85 = ((i84 ^ 5) - (~((i84 & 5) << 1))) - 1;
                            a = i85 % 128;
                            if (i85 % 2 == 0) {
                                int i86 = ((bag) it.next()).c;
                                throw null;
                            }
                            bag bagVar = (bag) it.next();
                            if (bagVar.c == i78) {
                                int i87 = a;
                                int i88 = i87 & 47;
                                int i89 = ((i87 ^ 47) | i88) << 1;
                                int i90 = -((i87 | 47) & (~i88));
                                int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
                                b = i91 % 128;
                                int i92 = i91 % 2;
                                arrayList.add(bagVar.e);
                                int i93 = a;
                                int i94 = i93 & 95;
                                int i95 = ((i93 | 95) & (~i94)) + (i94 << 1);
                                b = i95 % 128;
                                if (i95 % 2 != 0) {
                                    arrayList2.add(bagVar.f);
                                    int i96 = 56 / 0;
                                } else {
                                    arrayList2.add(bagVar.f);
                                }
                                int i97 = a;
                                int i98 = i97 & 89;
                                int i99 = i97 | 89;
                                int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
                                b = i100 % 128;
                                int i101 = i100 % 2;
                            }
                            int i102 = a + 40;
                            int i103 = (i102 ^ (-1)) + (i102 << 1);
                            b = i103 % 128;
                            int i104 = i103 % 2;
                            i78 = i78;
                            listD = listD;
                        }
                        list = listD;
                        baf bafVar = new baf(cursorQuery2.getString(columnIndex8), cursorQuery2.getString(columnIndex9), cursorQuery2.getString(columnIndex10), arrayList, arrayList2);
                        int i105 = b + 69;
                        a = i105 % 128;
                        int i106 = i105 % 2;
                        hashSet2.add(bafVar);
                        int i107 = a + 125;
                        b = i107 % 128;
                        int i108 = i107 % 2;
                    }
                    i67 = (-2) - ((((i67 | 2) << 1) - (i67 ^ 2)) ^ (-1));
                    int i109 = b;
                    int i110 = (i109 & 41) + (i109 | 41);
                    a = i110 % 128;
                    int i111 = i110 % 2;
                    count = i69;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = columnIndex7;
                    listD = list;
                    i = 2;
                }
                cursorQuery2.close();
                StringBuilder sb3 = new StringBuilder();
                int i112 = b;
                int i113 = (((i112 ^ 49) | (i112 & 49)) << 1) - (((~i112) & 49) | (i112 & (-50)));
                a = i113 % 128;
                if (i113 % 2 == 0) {
                    sb3.append("PRAGMA index_list(`");
                    sb3.append(str);
                    throw null;
                }
                sb3.append("PRAGMA index_list(`");
                sb3.append(str);
                sb3.append("`)");
                String string3 = sb3.toString();
                int i114 = b;
                int i115 = i114 ^ 103;
                int i116 = (((i114 & 103) | i115) << 1) - i115;
                a = i116 % 128;
                int i117 = i116 % 2;
                Cursor cursorQuery3 = supportSQLiteDatabase.query(string3);
                try {
                    int columnIndex11 = cursorQuery3.getColumnIndex("name");
                    int i118 = b + 9;
                    a = i118 % 128;
                    if (i118 % 2 == 0) {
                        cursorQuery3.getColumnIndex("origin");
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    int columnIndex12 = cursorQuery3.getColumnIndex("origin");
                    int columnIndex13 = cursorQuery3.getColumnIndex("unique");
                    if (columnIndex11 != -1) {
                        int i119 = b;
                        int i120 = i119 + 1;
                        a = i120 % 128;
                        int i121 = i120 % 2;
                        if (columnIndex12 != -1) {
                            int i122 = ((((i119 ^ 13) | (i119 & 13)) << 1) - (~(-(((~i119) & 13) | (i119 & (-14)))))) - 1;
                            a = i122 % 128;
                            int i123 = i122 % 2;
                            if (columnIndex13 != -1) {
                                HashSet hashSet3 = new HashSet();
                                int i124 = b;
                                int i125 = (i124 & (-28)) | ((~i124) & 27);
                                int i126 = -(-((i124 & 27) << 1));
                                int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                                a = i127 % 128;
                                int i128 = i127 % 2;
                                while (true) {
                                    if (cursorQuery3.moveToNext()) {
                                        int i129 = a;
                                        int i130 = i129 & 25;
                                        int i131 = (i130 - (~((i129 ^ 25) | i130))) - 1;
                                        b = i131 % 128;
                                        if (i131 % 2 != 0) {
                                            "c".equals(cursorQuery3.getString(columnIndex12));
                                            throw null;
                                        }
                                        if ("c".equals(cursorQuery3.getString(columnIndex12))) {
                                            String string4 = cursorQuery3.getString(columnIndex11);
                                            int i132 = a;
                                            int i133 = i132 & 75;
                                            int i134 = -(-((i132 ^ 75) | i133));
                                            int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                                            b = i135 % 128;
                                            if (i135 % 2 != 0) {
                                                if (cursorQuery3.getInt(columnIndex13) == 1) {
                                                    int i136 = b;
                                                    int i137 = i136 & 117;
                                                    int i138 = (i136 | 117) & (~i137);
                                                    int i139 = i137 << 1;
                                                    int i140 = (i138 ^ i139) + ((i138 & i139) << 1);
                                                    a = i140 % 128;
                                                    int i141 = i140 % 2;
                                                    z = true;
                                                } else {
                                                    int i142 = b + 14;
                                                    int i143 = (i142 ^ (-1)) + (i142 << 1);
                                                    a = i143 % 128;
                                                    int i144 = i143 % 2;
                                                    z = false;
                                                }
                                            } else if (cursorQuery3.getInt(columnIndex13) == 1) {
                                                int i1310 = b;
                                                int i1311 = i1310 & 117;
                                                int i1312 = (i1310 | 117) & (~i1311);
                                                int i1313 = i1311 << 1;
                                                int i145 = (i1312 ^ i1313) + ((i1312 & i1313) << 1);
                                                a = i145 % 128;
                                                int i146 = i145 % 2;
                                                z = true;
                                            } else {
                                                int i147 = b + 14;
                                                int i148 = (i147 ^ (-1)) + (i147 << 1);
                                                a = i148 % 128;
                                                int i149 = i148 % 2;
                                                z = false;
                                            }
                                            bah bahVarE = e(supportSQLiteDatabase, string4, z);
                                            if (bahVarE == null) {
                                                break;
                                            }
                                            int i150 = a;
                                            int i151 = i150 & 105;
                                            int i152 = (i150 ^ 105) | i151;
                                            int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                                            b = i153 % 128;
                                            int i154 = i153 % 2;
                                            hashSet3.add(bahVarE);
                                            int i155 = a + 123;
                                            b = i155 % 128;
                                            int i156 = i155 % 2;
                                        } else {
                                            int i157 = a;
                                            int i158 = i157 ^ 81;
                                            int i159 = ((i157 & 81) | i158) << 1;
                                            int i160 = -i158;
                                            int i161 = (i159 ^ i160) + ((i159 & i160) << 1);
                                            b = i161 % 128;
                                            int i162 = i161 % 2;
                                        }
                                    } else {
                                        cursorQuery3.close();
                                        int i163 = a;
                                        int i164 = (i163 & (-12)) | ((~i163) & 11);
                                        int i165 = -(-((i163 & 11) << 1));
                                        int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                                        b = i166 % 128;
                                        if (i166 % 2 != 0) {
                                            int i167 = 4 % 3;
                                        }
                                        hashSet = hashSet3;
                                    }
                                }
                                cursorQuery3.close();
                                int i168 = b;
                                int i169 = ((i168 ^ 117) | (i168 & 117)) << 1;
                                int i170 = -(((~i168) & 117) | (i168 & (-118)));
                                int i171 = (i169 ^ i170) + ((i170 & i169) << 1);
                                a = i171 % 128;
                                int i172 = i171 % 2;
                                hashSet = null;
                            } else {
                                cursorQuery3.close();
                                int i1610 = b;
                                int i1611 = ((i1610 ^ 117) | (i1610 & 117)) << 1;
                                int i173 = -(((~i1610) & 117) | (i1610 & (-118)));
                                int i174 = (i1611 ^ i173) + ((i173 & i1611) << 1);
                                a = i174 % 128;
                                int i175 = i174 % 2;
                                hashSet = null;
                            }
                        } else {
                            cursorQuery3.close();
                            int i1612 = b;
                            int i1613 = ((i1612 ^ 117) | (i1612 & 117)) << 1;
                            int i176 = -(((~i1612) & 117) | (i1612 & (-118)));
                            int i177 = (i1613 ^ i176) + ((i176 & i1613) << 1);
                            a = i177 % 128;
                            int i178 = i177 % 2;
                            hashSet = null;
                        }
                    } else {
                        cursorQuery3.close();
                        int i1614 = b;
                        int i1615 = ((i1614 ^ 117) | (i1614 & 117)) << 1;
                        int i179 = -(((~i1614) & 117) | (i1614 & (-118)));
                        int i1710 = (i1615 ^ i179) + ((i179 & i1615) << 1);
                        a = i1710 % 128;
                        int i1711 = i1710 % 2;
                        hashSet = null;
                    }
                    au auVar = new au(str, map, hashSet2, hashSet);
                    int i180 = b;
                    int i181 = i180 & 83;
                    int i182 = -(-((i180 ^ 83) | i181));
                    int i183 = (i181 & i182) + (i182 | i181);
                    a = i183 % 128;
                    int i184 = i183 % 2;
                    return auVar;
                } catch (Throwable th) {
                    cursorQuery3.close();
                    throw th;
                }
            } catch (Throwable th2) {
                cursorQuery2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorQuery.close();
            throw th3;
        }
    }
}
