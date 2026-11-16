package ivas.gov.bisp.enumeration.p002ab;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p009ai.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class M {
    private static int a = 1;
    private static int b;

    public interface aUN {
    }

    public static final class aUO implements aUN {
        public final aUP[] a;

        public aUO(aUP[] aupArr) {
            this.a = aupArr;
        }
    }

    public static final class aUP {
        public final String a;
        public int b;
        public boolean c;
        public String d;
        public int e;
        public int f;

        public aUP(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.f = i2;
            this.e = i3;
        }
    }

    public static final class aUQ implements aUN {
        public final u a;
        public final int b;
        public final int c;
        public final String d;

        public aUQ(u uVar, int i, int i2, String str) {
            this.a = uVar;
            this.c = i;
            this.b = i2;
            this.d = str;
        }
    }

    public static void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 81) + ((i3 & 81) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = ((i3 | 21) << 1) - (i3 ^ 21);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 1;
        while (i8 > 0) {
            int i9 = b;
            int i10 = ((i9 ^ 103) | (i9 & 103)) << 1;
            int i11 = -(((~i9) & 103) | (i9 & (-104)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            int next = xmlPullParser.next();
            if (next != 2) {
                int i14 = b;
                int i15 = (((i14 & (-108)) | ((~i14) & 107)) - (~(-(-((i14 & 107) << 1))))) - 1;
                a = i15 % 128;
                int i16 = i15 % 2;
                if (next == 3) {
                    int i17 = ((((i14 ^ 7) | (i14 & 7)) << 1) - (~(-(((~i14) & 7) | (i14 & (-8)))))) - 1;
                    a = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = i8 | 121;
                        int i19 = i18 << 1;
                        int i20 = -((~(i8 & 121)) & i18);
                        i = (i19 & i20) + (i20 | i19);
                    } else {
                        i = ((i8 & 54) + (i8 | 54)) - 55;
                    }
                    i8 = i;
                }
            } else {
                int i21 = (i8 ^ 51) + ((i8 & 51) << 1);
                int i22 = i21 ^ (-50);
                int i23 = (i21 & (-50)) << 1;
                i8 = ((i22 & i23) << 1) + (i22 ^ i23);
                int i24 = a;
                int i25 = (i24 | 117) << 1;
                int i26 = -(((~i24) & 117) | (i24 & (-118)));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                b = i27 % 128;
                int i28 = i27 % 2;
            }
        }
        int i29 = a;
        int i30 = ((i29 | 95) << 1) - (i29 ^ 95);
        b = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 24 / 0;
        }
    }

    public static List<byte[]> e(String[] strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = a + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = a;
            int i6 = (i5 & 119) + (i5 | 119);
            b = i6 % 128;
            int i7 = i6 % 2;
            arrayList.add(Base64.decode(strArr[i4], 0));
            int i8 = a;
            int i9 = i8 + 49;
            b = i9 % 128;
            int i10 = i9 % 2;
            i4 = (((i4 & (-2)) | ((~i4) & 1)) - (~((i4 & 1) << 1))) - 1;
            int i11 = ((i8 ^ 88) + ((i8 & 88) << 1)) - 1;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 5 % 5;
            }
        }
        int i13 = (-2) - ((a + 92) ^ (-1));
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 90 / 0;
        }
        return arrayList;
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        int resourceId;
        List<List<byte[]>> listEmptyList;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 103;
        int i5 = (i4 - (~(-(-((i3 ^ 103) | i4))))) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i == 0) {
            List<List<byte[]>> listEmptyList2 = Collections.emptyList();
            int i6 = a;
            int i7 = i6 & 115;
            int i8 = ((i6 ^ 115) | i7) << 1;
            int i9 = -((i6 | 115) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 25 / 0;
            }
            return listEmptyList2;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                int i12 = a;
                int i13 = i12 & 39;
                int i14 = (i13 - (~((i12 ^ 39) | i13))) - 1;
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    listEmptyList = Collections.emptyList();
                    typedArrayObtainTypedArray.recycle();
                    int i15 = 45 / 0;
                } else {
                    listEmptyList = Collections.emptyList();
                    typedArrayObtainTypedArray.recycle();
                }
                return listEmptyList;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                int i16 = a;
                int i17 = i16 & 89;
                int i18 = -(-((i16 ^ 89) | i17));
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
                int i21 = i16 ^ 103;
                int i22 = ((((i16 & 103) | i21) << 1) - (~(-i21))) - 1;
                b = i22 % 128;
                int i23 = i22 % 2;
                int i24 = 0;
                while (i24 < typedArrayObtainTypedArray.length()) {
                    int i25 = a + 31;
                    b = i25 % 128;
                    if (i25 % 2 != 0) {
                        resourceId = typedArrayObtainTypedArray.getResourceId(i24, 0);
                        if (resourceId != 0) {
                            arrayList.add(e(resources.getStringArray(resourceId)));
                            int i26 = a;
                            int i27 = ((i26 & (-124)) | ((~i26) & 123)) + ((i26 & 123) << 1);
                            b = i27 % 128;
                            int i28 = i27 % 2;
                        }
                    } else {
                        resourceId = typedArrayObtainTypedArray.getResourceId(i24, 0);
                        if (resourceId != 0) {
                            arrayList.add(e(resources.getStringArray(resourceId)));
                            int i29 = a;
                            int i210 = ((i29 & (-124)) | ((~i29) & 123)) + ((i29 & 123) << 1);
                            b = i210 % 128;
                            int i211 = i210 % 2;
                        }
                    }
                    i24 = (((i24 & (-2)) | ((~i24) & 1)) - (~(-(-((i24 & 1) << 1))))) - 1;
                    int i30 = b;
                    int i31 = ((i30 | 119) << 1) - (i30 ^ 119);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                }
            } else {
                arrayList.add(e(resources.getStringArray(i)));
                int i33 = b;
                int i34 = ((i33 ^ 31) | (i33 & 31)) << 1;
                int i35 = -((i33 & (-32)) | ((~i33) & 31));
                int i36 = (i34 & i35) + (i34 | i35);
                a = i36 % 128;
                int i37 = i36 % 2;
                int i38 = i33 & 41;
                int i39 = (i33 ^ 41) | i38;
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                a = i40 % 128;
                int i41 = i40 % 2;
            }
            typedArrayObtainTypedArray.recycle();
            int i42 = b;
            int i43 = i42 & 59;
            int i44 = ((i42 | 59) & (~i43)) + (i43 << 1);
            a = i44 % 128;
            int i45 = i44 % 2;
            return arrayList;
        } catch (Throwable th) {
            typedArrayObtainTypedArray.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:109:0x040d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0449 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x044a  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0188  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x023a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0241  */
    /* JADX WARN: Code duplicated, block: B:71:0x0256  */
    /* JADX WARN: Code duplicated, block: B:73:0x0269  */
    /* JADX WARN: Code duplicated, block: B:74:0x026c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0274  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x0312  */
    /* JADX WARN: Code duplicated, block: B:89:0x0327  */
    /* JADX WARN: Code duplicated, block: B:92:0x0330  */
    /* JADX WARN: Code duplicated, block: B:99:0x0382 A[LOOP:3: B:97:0x037c->B:99:0x0382, LOOP_END] */
    public static aUN b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        aUN auo;
        int i;
        String string;
        String string2;
        int integer;
        int i2;
        int integer2;
        String string3;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        TypedArray typedArrayObtainAttributes;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 2 % 2;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
            int i18 = a;
            int i19 = i18 & 49;
            int i20 = (((i18 | 49) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        int i22 = b;
        int i23 = ((i22 | 71) << 1) - (i22 ^ 71);
        a = i23 % 128;
        Object obj = null;
        if (i23 % 2 == 0) {
            xmlPullParser.require(5, null, "font-family");
        } else {
            xmlPullParser.require(2, null, "font-family");
        }
        String name = xmlPullParser.getName();
        int i24 = a;
        int i25 = ((i24 & (-94)) | ((~i24) & 93)) + ((i24 & 93) << 1);
        b = i25 % 128;
        int i26 = i25 % 2;
        if (name.equals("font-family")) {
            int i27 = b;
            int i28 = (i27 & 19) + (i27 | 19);
            a = i28 % 128;
            int i29 = i28 % 2;
            TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.f);
            int i30 = b;
            int i31 = (i30 & (-84)) | ((~i30) & 83);
            int i32 = (i30 & 83) << 1;
            int i33 = (i31 & i32) + (i32 | i31);
            a = i33 % 128;
            if (i33 % 2 == 0) {
                string = typedArrayObtainAttributes2.getString(0);
                string2 = typedArrayObtainAttributes2.getString(3);
            } else {
                string = typedArrayObtainAttributes2.getString(0);
                string2 = typedArrayObtainAttributes2.getString(4);
            }
            int i34 = a;
            int i35 = ((i34 | 11) << 1) - (i34 ^ 11);
            b = i35 % 128;
            int i36 = i35 % 2;
            String string4 = typedArrayObtainAttributes2.getString(5);
            int resourceId = typedArrayObtainAttributes2.getResourceId(1, 0);
            int i37 = a;
            int i38 = ((((i37 ^ 111) | (i37 & 111)) << 1) - (~(-((i37 & (-112)) | (111 & (~i37)))))) - 1;
            b = i38 % 128;
            if (i38 % 2 != 0) {
                integer = typedArrayObtainAttributes2.getInteger(3, 0);
                i2 = 996;
            } else {
                integer = typedArrayObtainAttributes2.getInteger(2, 1);
                i2 = 500;
            }
            int i39 = b;
            int i40 = i39 & 19;
            int i41 = -(-((i39 ^ 19) | i40));
            int i42 = (i40 & i41) + (i40 | i41);
            a = i42 % 128;
            if (i42 % 2 == 0) {
                integer2 = typedArrayObtainAttributes2.getInteger(3, i2);
                string3 = typedArrayObtainAttributes2.getString(67);
            } else {
                integer2 = typedArrayObtainAttributes2.getInteger(3, i2);
                string3 = typedArrayObtainAttributes2.getString(6);
            }
            typedArrayObtainAttributes2.recycle();
            if (string != null) {
                int i43 = b;
                int i44 = (i43 ^ 38) + ((i43 & 38) << 1);
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                a = i45 % 128;
                int i46 = i45 % 2;
                if (string2 != null) {
                    int i47 = i43 + 103;
                    a = i47 % 128;
                    if (i47 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (string4 != null) {
                        while (xmlPullParser.next() != 3) {
                            int i48 = a;
                            int i49 = i48 & 101;
                            int i50 = -(-((i48 ^ 101) | i49));
                            int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                            b = i51 % 128;
                            if (i51 % 2 != 0) {
                                d(xmlPullParser);
                                obj.hashCode();
                                throw null;
                            }
                            d(xmlPullParser);
                            int i52 = a;
                            int i53 = (i52 & 97) + (i52 | 97);
                            b = i53 % 128;
                            int i54 = i53 % 2;
                        }
                        auo = new aUQ(new u(string, string2, string4, c(resources, resourceId)), integer, integer2, string3);
                        int i55 = a;
                        int i56 = ((i55 ^ 66) + ((i55 & 66) << 1)) - 1;
                        b = i56 % 128;
                        if (i56 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                    } else {
                        arrayList = new ArrayList();
                        int i57 = b;
                        int i58 = ((i57 ^ 2) + ((i57 & 2) << 1)) - 1;
                        a = i58 % 128;
                        int i59 = i58 % 2;
                        while (xmlPullParser.next() != 3) {
                            i4 = b + 65;
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                i5 = 4;
                                if (xmlPullParser.getEventType() == 4) {
                                    int i60 = b;
                                    int i61 = ((i60 | 83) << 1) - (i60 ^ 83);
                                    a = i61 % 128;
                                    int i62 = i61 % 2;
                                    if (!xmlPullParser.getName().equals("font")) {
                                        d(xmlPullParser);
                                    } else {
                                        int i63 = b;
                                        i6 = ((i63 | 113) << 1) - (i63 ^ 113);
                                        a = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                        i7 = 8;
                                        if (!typedArrayObtainAttributes.hasValue(8)) {
                                            int i64 = a;
                                            int i65 = i64 & 91;
                                            int i66 = -(-((i64 ^ 91) | i65));
                                            int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                                            b = i67 % 128;
                                            int i68 = i67 % 2;
                                            int i69 = (-2) - ((((i64 | 6) << 1) - (i64 ^ 6)) ^ (-1));
                                            b = i69 % 128;
                                            int i70 = i69 % 2;
                                            i7 = 1;
                                        }
                                        i8 = typedArrayObtainAttributes.getInt(i7, 400);
                                        int i71 = a;
                                        int i72 = (i71 & (-74)) | ((~i71) & 73);
                                        int i73 = (i71 & 73) << 1;
                                        i9 = ((i72 | i73) << 1) - (i73 ^ i72);
                                        b = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            typedArrayObtainAttributes.hasValue(6);
                                            throw null;
                                        }
                                        if (!typedArrayObtainAttributes.hasValue(6)) {
                                            int i74 = b;
                                            int i75 = i74 & 89;
                                            int i76 = -(-((i74 ^ 89) | i75));
                                            int i77 = (i75 & i76) + (i76 | i75);
                                            a = i77 % 128;
                                            int i78 = i77 % 2;
                                            i11 = 2;
                                        } else {
                                            int i79 = b;
                                            i10 = (-2) - (((i79 ^ 120) + ((i79 & 120) << 1)) ^ (-1));
                                            a = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                i11 = 118;
                                            } else {
                                                i11 = 6;
                                            }
                                        }
                                        if (1 == typedArrayObtainAttributes.getInt(i11, 0)) {
                                            int i80 = b;
                                            int i81 = i80 & 79;
                                            int i82 = ((i80 ^ 79) | i81) << 1;
                                            int i83 = -((~i81) & (i80 | 79));
                                            int i84 = (i82 & i83) + (i82 | i83);
                                            a = i84 % 128;
                                            int i85 = i84 % 2;
                                            int i86 = i80 & 79;
                                            int i87 = ((i80 ^ 79) | i86) << 1;
                                            int i88 = -((i80 | 79) & (~i86));
                                            int i89 = (i87 & i88) + (i88 | i87);
                                            a = i89 % 128;
                                            int i90 = i89 % 2;
                                            z = true;
                                        } else {
                                            int i91 = a;
                                            int i92 = (i91 & (-28)) | ((~i91) & 27);
                                            int i93 = -(-((i91 & 27) << 1));
                                            int i94 = (i92 & i93) + (i93 | i92);
                                            b = i94 % 128;
                                            int i95 = i94 % 2;
                                            z = false;
                                        }
                                        if (typedArrayObtainAttributes.hasValue(9)) {
                                            i12 = 9;
                                        } else {
                                            int i96 = a;
                                            int i97 = i96 & 99;
                                            int i98 = (i97 - (~((i96 ^ 99) | i97))) - 1;
                                            int i99 = i98 % 128;
                                            b = i99;
                                            int i100 = i98 % 2;
                                            int i101 = i99 ^ 19;
                                            int i102 = ((i99 & 19) | i101) << 1;
                                            int i103 = -i101;
                                            int i104 = (i102 ^ i103) + ((i102 & i103) << 1);
                                            a = i104 % 128;
                                            int i105 = i104 % 2;
                                            i12 = 3;
                                        }
                                        if (!typedArrayObtainAttributes.hasValue(7)) {
                                            int i106 = a;
                                            int i107 = i106 & 103;
                                            int i108 = ((~i107) & (i106 | 103)) + (i107 << 1);
                                            b = i108 % 128;
                                            int i109 = i108 % 2;
                                            int i110 = (((i106 ^ 27) | (i106 & 27)) << 1) - (((~i106) & 27) | (i106 & (-28)));
                                            b = i110 % 128;
                                            int i111 = i110 % 2;
                                            i13 = i5;
                                        } else {
                                            i13 = 7;
                                        }
                                        String string5 = typedArrayObtainAttributes.getString(i13);
                                        int i112 = typedArrayObtainAttributes.getInt(i12, 0);
                                        i14 = b + 99;
                                        a = i14 % 128;
                                        if (i14 % 2 == 0 ? !(!typedArrayObtainAttributes.hasValue(5)) : !(!typedArrayObtainAttributes.hasValue(5))) {
                                            int i113 = b + 9;
                                            a = i113 % 128;
                                            int i114 = i113 % 2;
                                            i15 = 0;
                                            i16 = 5;
                                        } else {
                                            int i115 = b;
                                            int i116 = ((i115 & 24) + (i115 | 24)) - 1;
                                            a = i116 % 128;
                                            int i117 = i116 % 2;
                                            i15 = 0;
                                            i16 = 0;
                                        }
                                        int resourceId2 = typedArrayObtainAttributes.getResourceId(i16, i15);
                                        int i118 = a;
                                        int i119 = ((i118 ^ 119) - (~((i118 & 119) << 1))) - 1;
                                        b = i119 % 128;
                                        int i120 = i119 % 2;
                                        String string6 = typedArrayObtainAttributes.getString(i16);
                                        typedArrayObtainAttributes.recycle();
                                        int i121 = b;
                                        int i122 = (i121 ^ 79) + ((i121 & 79) << 1);
                                        a = i122 % 128;
                                        int i123 = i122 % 2;
                                        while (xmlPullParser.next() != 3) {
                                            int i124 = a;
                                            int i125 = (i124 ^ 73) + ((i124 & 73) << 1);
                                            b = i125 % 128;
                                            int i126 = i125 % 2;
                                            d(xmlPullParser);
                                            int i127 = a + 97;
                                            b = i127 % 128;
                                            int i128 = i127 % 2;
                                        }
                                        aUP aup = new aUP(string6, i8, z, string5, i112, resourceId2);
                                        int i129 = (-2) - ((a + 94) ^ (-1));
                                        b = i129 % 128;
                                        int i130 = i129 % 2;
                                        arrayList.add(aup);
                                        int i131 = b;
                                        int i132 = i131 & 31;
                                        int i133 = i131 | 31;
                                        int i134 = (i132 & i133) + (i133 | i132);
                                        a = i134 % 128;
                                        int i135 = i134 % 2;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                i5 = 4;
                                if (xmlPullParser.getEventType() == 2) {
                                    int i610 = b;
                                    int i611 = ((i610 | 83) << 1) - (i610 ^ 83);
                                    a = i611 % 128;
                                    int i612 = i611 % 2;
                                    if (!xmlPullParser.getName().equals("font")) {
                                        d(xmlPullParser);
                                    } else {
                                        int i613 = b;
                                        i6 = ((i613 | 113) << 1) - (i613 ^ 113);
                                        a = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                        i7 = 8;
                                        if (!typedArrayObtainAttributes.hasValue(8)) {
                                            int i614 = a;
                                            int i615 = i614 & 91;
                                            int i616 = -(-((i614 ^ 91) | i615));
                                            int i617 = (i615 ^ i616) + ((i615 & i616) << 1);
                                            b = i617 % 128;
                                            int i618 = i617 % 2;
                                            int i619 = (-2) - ((((i614 | 6) << 1) - (i614 ^ 6)) ^ (-1));
                                            b = i619 % 128;
                                            int i710 = i619 % 2;
                                            i7 = 1;
                                        }
                                        i8 = typedArrayObtainAttributes.getInt(i7, 400);
                                        int i711 = a;
                                        int i712 = (i711 & (-74)) | ((~i711) & 73);
                                        int i713 = (i711 & 73) << 1;
                                        i9 = ((i712 | i713) << 1) - (i713 ^ i712);
                                        b = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            typedArrayObtainAttributes.hasValue(6);
                                            throw null;
                                        }
                                        if (!typedArrayObtainAttributes.hasValue(6)) {
                                            int i714 = b;
                                            int i715 = i714 & 89;
                                            int i716 = -(-((i714 ^ 89) | i715));
                                            int i717 = (i715 & i716) + (i716 | i715);
                                            a = i717 % 128;
                                            int i718 = i717 % 2;
                                            i11 = 2;
                                        } else {
                                            int i719 = b;
                                            i10 = (-2) - (((i719 ^ 120) + ((i719 & 120) << 1)) ^ (-1));
                                            a = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                i11 = 118;
                                            } else {
                                                i11 = 6;
                                            }
                                        }
                                        if (1 == typedArrayObtainAttributes.getInt(i11, 0)) {
                                            int i810 = b;
                                            int i811 = i810 & 79;
                                            int i812 = ((i810 ^ 79) | i811) << 1;
                                            int i813 = -((~i811) & (i810 | 79));
                                            int i814 = (i812 & i813) + (i812 | i813);
                                            a = i814 % 128;
                                            int i815 = i814 % 2;
                                            int i816 = i810 & 79;
                                            int i817 = ((i810 ^ 79) | i816) << 1;
                                            int i818 = -((i810 | 79) & (~i816));
                                            int i819 = (i817 & i818) + (i818 | i817);
                                            a = i819 % 128;
                                            int i910 = i819 % 2;
                                            z = true;
                                        } else {
                                            int i911 = a;
                                            int i912 = (i911 & (-28)) | ((~i911) & 27);
                                            int i913 = -(-((i911 & 27) << 1));
                                            int i914 = (i912 & i913) + (i913 | i912);
                                            b = i914 % 128;
                                            int i915 = i914 % 2;
                                            z = false;
                                        }
                                        if (typedArrayObtainAttributes.hasValue(9)) {
                                            int i916 = a;
                                            int i917 = i916 & 99;
                                            int i918 = (i917 - (~((i916 ^ 99) | i917))) - 1;
                                            int i919 = i918 % 128;
                                            b = i919;
                                            int i1010 = i918 % 2;
                                            int i1011 = i919 ^ 19;
                                            int i1012 = ((i919 & 19) | i1011) << 1;
                                            int i1013 = -i1011;
                                            int i1014 = (i1012 ^ i1013) + ((i1012 & i1013) << 1);
                                            a = i1014 % 128;
                                            int i1015 = i1014 % 2;
                                            i12 = 3;
                                        } else {
                                            i12 = 9;
                                        }
                                        if (!typedArrayObtainAttributes.hasValue(7)) {
                                            int i1016 = a;
                                            int i1017 = i1016 & 103;
                                            int i1018 = ((~i1017) & (i1016 | 103)) + (i1017 << 1);
                                            b = i1018 % 128;
                                            int i1019 = i1018 % 2;
                                            int i1110 = (((i1016 ^ 27) | (i1016 & 27)) << 1) - (((~i1016) & 27) | (i1016 & (-28)));
                                            b = i1110 % 128;
                                            int i1111 = i1110 % 2;
                                            i13 = i5;
                                        } else {
                                            i13 = 7;
                                        }
                                        String string7 = typedArrayObtainAttributes.getString(i13);
                                        int i1112 = typedArrayObtainAttributes.getInt(i12, 0);
                                        i14 = b + 99;
                                        a = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            int i1113 = b + 9;
                                            a = i1113 % 128;
                                            int i1114 = i1113 % 2;
                                            i15 = 0;
                                            i16 = 5;
                                        } else {
                                            int i1115 = b + 9;
                                            a = i1115 % 128;
                                            int i1116 = i1115 % 2;
                                            i15 = 0;
                                            i16 = 5;
                                        }
                                        int resourceId3 = typedArrayObtainAttributes.getResourceId(i16, i15);
                                        int i1117 = a;
                                        int i1118 = ((i1117 ^ 119) - (~((i1117 & 119) << 1))) - 1;
                                        b = i1118 % 128;
                                        int i1210 = i1118 % 2;
                                        String string8 = typedArrayObtainAttributes.getString(i16);
                                        typedArrayObtainAttributes.recycle();
                                        int i1211 = b;
                                        int i1212 = (i1211 ^ 79) + ((i1211 & 79) << 1);
                                        a = i1212 % 128;
                                        int i1213 = i1212 % 2;
                                        while (xmlPullParser.next() != 3) {
                                            int i1214 = a;
                                            int i1215 = (i1214 ^ 73) + ((i1214 & 73) << 1);
                                            b = i1215 % 128;
                                            int i1216 = i1215 % 2;
                                            d(xmlPullParser);
                                            int i1217 = a + 97;
                                            b = i1217 % 128;
                                            int i1218 = i1217 % 2;
                                        }
                                        aUP aup2 = new aUP(string8, i8, z, string7, i1112, resourceId3);
                                        int i1219 = (-2) - ((a + 94) ^ (-1));
                                        b = i1219 % 128;
                                        int i136 = i1219 % 2;
                                        arrayList.add(aup2);
                                        int i137 = b;
                                        int i138 = i137 & 31;
                                        int i139 = i137 | 31;
                                        int i1310 = (i138 & i139) + (i139 | i138);
                                        a = i1310 % 128;
                                        int i1311 = i1310 % 2;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            auo = new aUO((aUP[]) arrayList.toArray(new aUP[arrayList.size()]));
                            int i140 = b;
                            int i141 = i140 & 97;
                            int i142 = i141 + ((i140 ^ 97) | i141);
                            a = i142 % 128;
                            int i143 = i142 % 2;
                            int i144 = i140 & 107;
                            int i145 = -(-((i140 ^ 107) | i144));
                            i3 = ((i144 | i145) << 1) - (i145 ^ i144);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i146 = 3 % 5;
                            }
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                    int i510 = b;
                    int i511 = ((i510 ^ 2) + ((i510 & 2) << 1)) - 1;
                    a = i511 % 128;
                    int i512 = i511 % 2;
                    while (xmlPullParser.next() != 3) {
                        i4 = b + 65;
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            i5 = 4;
                            if (xmlPullParser.getEventType() == 4) {
                                int i6110 = b;
                                int i6111 = ((i6110 | 83) << 1) - (i6110 ^ 83);
                                a = i6111 % 128;
                                int i6112 = i6111 % 2;
                                if (!xmlPullParser.getName().equals("font")) {
                                    d(xmlPullParser);
                                } else {
                                    int i6113 = b;
                                    i6 = ((i6113 | 113) << 1) - (i6113 ^ 113);
                                    a = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                    i7 = 8;
                                    if (!typedArrayObtainAttributes.hasValue(8)) {
                                        int i6114 = a;
                                        int i6115 = i6114 & 91;
                                        int i6116 = -(-((i6114 ^ 91) | i6115));
                                        int i6117 = (i6115 ^ i6116) + ((i6115 & i6116) << 1);
                                        b = i6117 % 128;
                                        int i6118 = i6117 % 2;
                                        int i6119 = (-2) - ((((i6114 | 6) << 1) - (i6114 ^ 6)) ^ (-1));
                                        b = i6119 % 128;
                                        int i7110 = i6119 % 2;
                                        i7 = 1;
                                    }
                                    i8 = typedArrayObtainAttributes.getInt(i7, 400);
                                    int i7111 = a;
                                    int i7112 = (i7111 & (-74)) | ((~i7111) & 73);
                                    int i7113 = (i7111 & 73) << 1;
                                    i9 = ((i7112 | i7113) << 1) - (i7113 ^ i7112);
                                    b = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        typedArrayObtainAttributes.hasValue(6);
                                        throw null;
                                    }
                                    if (!typedArrayObtainAttributes.hasValue(6)) {
                                        int i7114 = b;
                                        int i7115 = i7114 & 89;
                                        int i7116 = -(-((i7114 ^ 89) | i7115));
                                        int i7117 = (i7115 & i7116) + (i7116 | i7115);
                                        a = i7117 % 128;
                                        int i7118 = i7117 % 2;
                                        i11 = 2;
                                    } else {
                                        int i7119 = b;
                                        i10 = (-2) - (((i7119 ^ 120) + ((i7119 & 120) << 1)) ^ (-1));
                                        a = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            i11 = 118;
                                        } else {
                                            i11 = 6;
                                        }
                                    }
                                    if (1 == typedArrayObtainAttributes.getInt(i11, 0)) {
                                        int i8110 = b;
                                        int i8111 = i8110 & 79;
                                        int i8112 = ((i8110 ^ 79) | i8111) << 1;
                                        int i8113 = -((~i8111) & (i8110 | 79));
                                        int i8114 = (i8112 & i8113) + (i8112 | i8113);
                                        a = i8114 % 128;
                                        int i8115 = i8114 % 2;
                                        int i8116 = i8110 & 79;
                                        int i8117 = ((i8110 ^ 79) | i8116) << 1;
                                        int i8118 = -((i8110 | 79) & (~i8116));
                                        int i8119 = (i8117 & i8118) + (i8118 | i8117);
                                        a = i8119 % 128;
                                        int i9110 = i8119 % 2;
                                        z = true;
                                    } else {
                                        int i9111 = a;
                                        int i9112 = (i9111 & (-28)) | ((~i9111) & 27);
                                        int i9113 = -(-((i9111 & 27) << 1));
                                        int i9114 = (i9112 & i9113) + (i9113 | i9112);
                                        b = i9114 % 128;
                                        int i9115 = i9114 % 2;
                                        z = false;
                                    }
                                    if (typedArrayObtainAttributes.hasValue(9)) {
                                        int i9116 = a;
                                        int i9117 = i9116 & 99;
                                        int i9118 = (i9117 - (~((i9116 ^ 99) | i9117))) - 1;
                                        int i9119 = i9118 % 128;
                                        b = i9119;
                                        int i10110 = i9118 % 2;
                                        int i10111 = i9119 ^ 19;
                                        int i10112 = ((i9119 & 19) | i10111) << 1;
                                        int i10113 = -i10111;
                                        int i10114 = (i10112 ^ i10113) + ((i10112 & i10113) << 1);
                                        a = i10114 % 128;
                                        int i10115 = i10114 % 2;
                                        i12 = 3;
                                    } else {
                                        i12 = 9;
                                    }
                                    if (!typedArrayObtainAttributes.hasValue(7)) {
                                        int i10116 = a;
                                        int i10117 = i10116 & 103;
                                        int i10118 = ((~i10117) & (i10116 | 103)) + (i10117 << 1);
                                        b = i10118 % 128;
                                        int i10119 = i10118 % 2;
                                        int i1119 = (((i10116 ^ 27) | (i10116 & 27)) << 1) - (((~i10116) & 27) | (i10116 & (-28)));
                                        b = i1119 % 128;
                                        int i11110 = i1119 % 2;
                                        i13 = i5;
                                    } else {
                                        i13 = 7;
                                    }
                                    String string9 = typedArrayObtainAttributes.getString(i13);
                                    int i11111 = typedArrayObtainAttributes.getInt(i12, 0);
                                    i14 = b + 99;
                                    a = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i11112 = b + 9;
                                        a = i11112 % 128;
                                        int i11113 = i11112 % 2;
                                        i15 = 0;
                                        i16 = 5;
                                    } else {
                                        int i11114 = b + 9;
                                        a = i11114 % 128;
                                        int i11115 = i11114 % 2;
                                        i15 = 0;
                                        i16 = 5;
                                    }
                                    int resourceId4 = typedArrayObtainAttributes.getResourceId(i16, i15);
                                    int i11116 = a;
                                    int i11117 = ((i11116 ^ 119) - (~((i11116 & 119) << 1))) - 1;
                                    b = i11117 % 128;
                                    int i12110 = i11117 % 2;
                                    String string10 = typedArrayObtainAttributes.getString(i16);
                                    typedArrayObtainAttributes.recycle();
                                    int i12111 = b;
                                    int i12112 = (i12111 ^ 79) + ((i12111 & 79) << 1);
                                    a = i12112 % 128;
                                    int i12113 = i12112 % 2;
                                    while (xmlPullParser.next() != 3) {
                                        int i12114 = a;
                                        int i12115 = (i12114 ^ 73) + ((i12114 & 73) << 1);
                                        b = i12115 % 128;
                                        int i12116 = i12115 % 2;
                                        d(xmlPullParser);
                                        int i12117 = a + 97;
                                        b = i12117 % 128;
                                        int i12118 = i12117 % 2;
                                    }
                                    aUP aup3 = new aUP(string10, i8, z, string9, i11111, resourceId4);
                                    int i12119 = (-2) - ((a + 94) ^ (-1));
                                    b = i12119 % 128;
                                    int i1312 = i12119 % 2;
                                    arrayList.add(aup3);
                                    int i1313 = b;
                                    int i1314 = i1313 & 31;
                                    int i1315 = i1313 | 31;
                                    int i1316 = (i1314 & i1315) + (i1315 | i1314);
                                    a = i1316 % 128;
                                    int i1317 = i1316 % 2;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            i5 = 4;
                            if (xmlPullParser.getEventType() == 2) {
                                int i61110 = b;
                                int i61111 = ((i61110 | 83) << 1) - (i61110 ^ 83);
                                a = i61111 % 128;
                                int i61112 = i61111 % 2;
                                if (!xmlPullParser.getName().equals("font")) {
                                    d(xmlPullParser);
                                } else {
                                    int i61113 = b;
                                    i6 = ((i61113 | 113) << 1) - (i61113 ^ 113);
                                    a = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                    i7 = 8;
                                    if (!typedArrayObtainAttributes.hasValue(8)) {
                                        int i61114 = a;
                                        int i61115 = i61114 & 91;
                                        int i61116 = -(-((i61114 ^ 91) | i61115));
                                        int i61117 = (i61115 ^ i61116) + ((i61115 & i61116) << 1);
                                        b = i61117 % 128;
                                        int i61118 = i61117 % 2;
                                        int i61119 = (-2) - ((((i61114 | 6) << 1) - (i61114 ^ 6)) ^ (-1));
                                        b = i61119 % 128;
                                        int i71110 = i61119 % 2;
                                        i7 = 1;
                                    }
                                    i8 = typedArrayObtainAttributes.getInt(i7, 400);
                                    int i71111 = a;
                                    int i71112 = (i71111 & (-74)) | ((~i71111) & 73);
                                    int i71113 = (i71111 & 73) << 1;
                                    i9 = ((i71112 | i71113) << 1) - (i71113 ^ i71112);
                                    b = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        typedArrayObtainAttributes.hasValue(6);
                                        throw null;
                                    }
                                    if (!typedArrayObtainAttributes.hasValue(6)) {
                                        int i71114 = b;
                                        int i71115 = i71114 & 89;
                                        int i71116 = -(-((i71114 ^ 89) | i71115));
                                        int i71117 = (i71115 & i71116) + (i71116 | i71115);
                                        a = i71117 % 128;
                                        int i71118 = i71117 % 2;
                                        i11 = 2;
                                    } else {
                                        int i71119 = b;
                                        i10 = (-2) - (((i71119 ^ 120) + ((i71119 & 120) << 1)) ^ (-1));
                                        a = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            i11 = 118;
                                        } else {
                                            i11 = 6;
                                        }
                                    }
                                    if (1 == typedArrayObtainAttributes.getInt(i11, 0)) {
                                        int i81110 = b;
                                        int i81111 = i81110 & 79;
                                        int i81112 = ((i81110 ^ 79) | i81111) << 1;
                                        int i81113 = -((~i81111) & (i81110 | 79));
                                        int i81114 = (i81112 & i81113) + (i81112 | i81113);
                                        a = i81114 % 128;
                                        int i81115 = i81114 % 2;
                                        int i81116 = i81110 & 79;
                                        int i81117 = ((i81110 ^ 79) | i81116) << 1;
                                        int i81118 = -((i81110 | 79) & (~i81116));
                                        int i81119 = (i81117 & i81118) + (i81118 | i81117);
                                        a = i81119 % 128;
                                        int i91110 = i81119 % 2;
                                        z = true;
                                    } else {
                                        int i91111 = a;
                                        int i91112 = (i91111 & (-28)) | ((~i91111) & 27);
                                        int i91113 = -(-((i91111 & 27) << 1));
                                        int i91114 = (i91112 & i91113) + (i91113 | i91112);
                                        b = i91114 % 128;
                                        int i91115 = i91114 % 2;
                                        z = false;
                                    }
                                    if (typedArrayObtainAttributes.hasValue(9)) {
                                        int i91116 = a;
                                        int i91117 = i91116 & 99;
                                        int i91118 = (i91117 - (~((i91116 ^ 99) | i91117))) - 1;
                                        int i91119 = i91118 % 128;
                                        b = i91119;
                                        int i101110 = i91118 % 2;
                                        int i101111 = i91119 ^ 19;
                                        int i101112 = ((i91119 & 19) | i101111) << 1;
                                        int i101113 = -i101111;
                                        int i101114 = (i101112 ^ i101113) + ((i101112 & i101113) << 1);
                                        a = i101114 % 128;
                                        int i101115 = i101114 % 2;
                                        i12 = 3;
                                    } else {
                                        i12 = 9;
                                    }
                                    if (!typedArrayObtainAttributes.hasValue(7)) {
                                        int i101116 = a;
                                        int i101117 = i101116 & 103;
                                        int i101118 = ((~i101117) & (i101116 | 103)) + (i101117 << 1);
                                        b = i101118 % 128;
                                        int i101119 = i101118 % 2;
                                        int i11118 = (((i101116 ^ 27) | (i101116 & 27)) << 1) - (((~i101116) & 27) | (i101116 & (-28)));
                                        b = i11118 % 128;
                                        int i11119 = i11118 % 2;
                                        i13 = i5;
                                    } else {
                                        i13 = 7;
                                    }
                                    String string11 = typedArrayObtainAttributes.getString(i13);
                                    int i111110 = typedArrayObtainAttributes.getInt(i12, 0);
                                    i14 = b + 99;
                                    a = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i111111 = b + 9;
                                        a = i111111 % 128;
                                        int i111112 = i111111 % 2;
                                        i15 = 0;
                                        i16 = 5;
                                    } else {
                                        int i111113 = b + 9;
                                        a = i111113 % 128;
                                        int i111114 = i111113 % 2;
                                        i15 = 0;
                                        i16 = 5;
                                    }
                                    int resourceId5 = typedArrayObtainAttributes.getResourceId(i16, i15);
                                    int i111115 = a;
                                    int i111116 = ((i111115 ^ 119) - (~((i111115 & 119) << 1))) - 1;
                                    b = i111116 % 128;
                                    int i121110 = i111116 % 2;
                                    String string12 = typedArrayObtainAttributes.getString(i16);
                                    typedArrayObtainAttributes.recycle();
                                    int i121111 = b;
                                    int i121112 = (i121111 ^ 79) + ((i121111 & 79) << 1);
                                    a = i121112 % 128;
                                    int i121113 = i121112 % 2;
                                    while (xmlPullParser.next() != 3) {
                                        int i121114 = a;
                                        int i121115 = (i121114 ^ 73) + ((i121114 & 73) << 1);
                                        b = i121115 % 128;
                                        int i121116 = i121115 % 2;
                                        d(xmlPullParser);
                                        int i121117 = a + 97;
                                        b = i121117 % 128;
                                        int i121118 = i121117 % 2;
                                    }
                                    aUP aup4 = new aUP(string12, i8, z, string11, i111110, resourceId5);
                                    int i121119 = (-2) - ((a + 94) ^ (-1));
                                    b = i121119 % 128;
                                    int i1318 = i121119 % 2;
                                    arrayList.add(aup4);
                                    int i1319 = b;
                                    int i13110 = i1319 & 31;
                                    int i13111 = i1319 | 31;
                                    int i13112 = (i13110 & i13111) + (i13111 | i13110);
                                    a = i13112 % 128;
                                    int i13113 = i13112 % 2;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        auo = new aUO((aUP[]) arrayList.toArray(new aUP[arrayList.size()]));
                        int i147 = b;
                        int i148 = i147 & 97;
                        int i149 = i148 + ((i147 ^ 97) | i148);
                        a = i149 % 128;
                        int i1410 = i149 % 2;
                        int i1411 = i147 & 107;
                        int i1412 = -(-((i147 ^ 107) | i1411));
                        i3 = ((i1411 | i1412) << 1) - (i1412 ^ i1411);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i1413 = 3 % 5;
                        }
                    }
                }
            } else {
                arrayList = new ArrayList();
                int i513 = b;
                int i514 = ((i513 ^ 2) + ((i513 & 2) << 1)) - 1;
                a = i514 % 128;
                int i515 = i514 % 2;
                while (xmlPullParser.next() != 3) {
                    i4 = b + 65;
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        i5 = 4;
                        if (xmlPullParser.getEventType() == 4) {
                            int i611110 = b;
                            int i611111 = ((i611110 | 83) << 1) - (i611110 ^ 83);
                            a = i611111 % 128;
                            int i611112 = i611111 % 2;
                            if (!xmlPullParser.getName().equals("font")) {
                                d(xmlPullParser);
                            } else {
                                int i611113 = b;
                                i6 = ((i611113 | 113) << 1) - (i611113 ^ 113);
                                a = i6 % 128;
                                if (i6 % 2 != 0) {
                                    resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                    obj.hashCode();
                                    throw null;
                                }
                                typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                i7 = 8;
                                if (!typedArrayObtainAttributes.hasValue(8)) {
                                    int i611114 = a;
                                    int i611115 = i611114 & 91;
                                    int i611116 = -(-((i611114 ^ 91) | i611115));
                                    int i611117 = (i611115 ^ i611116) + ((i611115 & i611116) << 1);
                                    b = i611117 % 128;
                                    int i611118 = i611117 % 2;
                                    int i611119 = (-2) - ((((i611114 | 6) << 1) - (i611114 ^ 6)) ^ (-1));
                                    b = i611119 % 128;
                                    int i711110 = i611119 % 2;
                                    i7 = 1;
                                }
                                i8 = typedArrayObtainAttributes.getInt(i7, 400);
                                int i711111 = a;
                                int i711112 = (i711111 & (-74)) | ((~i711111) & 73);
                                int i711113 = (i711111 & 73) << 1;
                                i9 = ((i711112 | i711113) << 1) - (i711113 ^ i711112);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    typedArrayObtainAttributes.hasValue(6);
                                    throw null;
                                }
                                if (!typedArrayObtainAttributes.hasValue(6)) {
                                    int i711114 = b;
                                    int i711115 = i711114 & 89;
                                    int i711116 = -(-((i711114 ^ 89) | i711115));
                                    int i711117 = (i711115 & i711116) + (i711116 | i711115);
                                    a = i711117 % 128;
                                    int i711118 = i711117 % 2;
                                    i11 = 2;
                                } else {
                                    int i711119 = b;
                                    i10 = (-2) - (((i711119 ^ 120) + ((i711119 & 120) << 1)) ^ (-1));
                                    a = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        i11 = 118;
                                    } else {
                                        i11 = 6;
                                    }
                                }
                                if (1 == typedArrayObtainAttributes.getInt(i11, 0)) {
                                    int i811110 = b;
                                    int i811111 = i811110 & 79;
                                    int i811112 = ((i811110 ^ 79) | i811111) << 1;
                                    int i811113 = -((~i811111) & (i811110 | 79));
                                    int i811114 = (i811112 & i811113) + (i811112 | i811113);
                                    a = i811114 % 128;
                                    int i811115 = i811114 % 2;
                                    int i811116 = i811110 & 79;
                                    int i811117 = ((i811110 ^ 79) | i811116) << 1;
                                    int i811118 = -((i811110 | 79) & (~i811116));
                                    int i811119 = (i811117 & i811118) + (i811118 | i811117);
                                    a = i811119 % 128;
                                    int i911110 = i811119 % 2;
                                    z = true;
                                } else {
                                    int i911111 = a;
                                    int i911112 = (i911111 & (-28)) | ((~i911111) & 27);
                                    int i911113 = -(-((i911111 & 27) << 1));
                                    int i911114 = (i911112 & i911113) + (i911113 | i911112);
                                    b = i911114 % 128;
                                    int i911115 = i911114 % 2;
                                    z = false;
                                }
                                if (typedArrayObtainAttributes.hasValue(9)) {
                                    int i911116 = a;
                                    int i911117 = i911116 & 99;
                                    int i911118 = (i911117 - (~((i911116 ^ 99) | i911117))) - 1;
                                    int i911119 = i911118 % 128;
                                    b = i911119;
                                    int i1011110 = i911118 % 2;
                                    int i1011111 = i911119 ^ 19;
                                    int i1011112 = ((i911119 & 19) | i1011111) << 1;
                                    int i1011113 = -i1011111;
                                    int i1011114 = (i1011112 ^ i1011113) + ((i1011112 & i1011113) << 1);
                                    a = i1011114 % 128;
                                    int i1011115 = i1011114 % 2;
                                    i12 = 3;
                                } else {
                                    i12 = 9;
                                }
                                if (!typedArrayObtainAttributes.hasValue(7)) {
                                    int i1011116 = a;
                                    int i1011117 = i1011116 & 103;
                                    int i1011118 = ((~i1011117) & (i1011116 | 103)) + (i1011117 << 1);
                                    b = i1011118 % 128;
                                    int i1011119 = i1011118 % 2;
                                    int i111117 = (((i1011116 ^ 27) | (i1011116 & 27)) << 1) - (((~i1011116) & 27) | (i1011116 & (-28)));
                                    b = i111117 % 128;
                                    int i111118 = i111117 % 2;
                                    i13 = i5;
                                } else {
                                    i13 = 7;
                                }
                                String string13 = typedArrayObtainAttributes.getString(i13);
                                int i111119 = typedArrayObtainAttributes.getInt(i12, 0);
                                i14 = b + 99;
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i1111110 = b + 9;
                                    a = i1111110 % 128;
                                    int i1111111 = i1111110 % 2;
                                    i15 = 0;
                                    i16 = 5;
                                } else {
                                    int i1111112 = b + 9;
                                    a = i1111112 % 128;
                                    int i1111113 = i1111112 % 2;
                                    i15 = 0;
                                    i16 = 5;
                                }
                                int resourceId6 = typedArrayObtainAttributes.getResourceId(i16, i15);
                                int i1111114 = a;
                                int i1111115 = ((i1111114 ^ 119) - (~((i1111114 & 119) << 1))) - 1;
                                b = i1111115 % 128;
                                int i1211110 = i1111115 % 2;
                                String string14 = typedArrayObtainAttributes.getString(i16);
                                typedArrayObtainAttributes.recycle();
                                int i1211111 = b;
                                int i1211112 = (i1211111 ^ 79) + ((i1211111 & 79) << 1);
                                a = i1211112 % 128;
                                int i1211113 = i1211112 % 2;
                                while (xmlPullParser.next() != 3) {
                                    int i1211114 = a;
                                    int i1211115 = (i1211114 ^ 73) + ((i1211114 & 73) << 1);
                                    b = i1211115 % 128;
                                    int i1211116 = i1211115 % 2;
                                    d(xmlPullParser);
                                    int i1211117 = a + 97;
                                    b = i1211117 % 128;
                                    int i1211118 = i1211117 % 2;
                                }
                                aUP aup5 = new aUP(string14, i8, z, string13, i111119, resourceId6);
                                int i1211119 = (-2) - ((a + 94) ^ (-1));
                                b = i1211119 % 128;
                                int i13114 = i1211119 % 2;
                                arrayList.add(aup5);
                                int i13115 = b;
                                int i13116 = i13115 & 31;
                                int i13117 = i13115 | 31;
                                int i13118 = (i13116 & i13117) + (i13117 | i13116);
                                a = i13118 % 128;
                                int i13119 = i13118 % 2;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i5 = 4;
                        if (xmlPullParser.getEventType() == 2) {
                            int i6111110 = b;
                            int i6111111 = ((i6111110 | 83) << 1) - (i6111110 ^ 83);
                            a = i6111111 % 128;
                            int i6111112 = i6111111 % 2;
                            if (!xmlPullParser.getName().equals("font")) {
                                d(xmlPullParser);
                            } else {
                                int i6111113 = b;
                                i6 = ((i6111113 | 113) << 1) - (i6111113 ^ 113);
                                a = i6 % 128;
                                if (i6 % 2 != 0) {
                                    resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                    obj.hashCode();
                                    throw null;
                                }
                                typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
                                i7 = 8;
                                if (!typedArrayObtainAttributes.hasValue(8)) {
                                    int i6111114 = a;
                                    int i6111115 = i6111114 & 91;
                                    int i6111116 = -(-((i6111114 ^ 91) | i6111115));
                                    int i6111117 = (i6111115 ^ i6111116) + ((i6111115 & i6111116) << 1);
                                    b = i6111117 % 128;
                                    int i6111118 = i6111117 % 2;
                                    int i6111119 = (-2) - ((((i6111114 | 6) << 1) - (i6111114 ^ 6)) ^ (-1));
                                    b = i6111119 % 128;
                                    int i7111110 = i6111119 % 2;
                                    i7 = 1;
                                }
                                i8 = typedArrayObtainAttributes.getInt(i7, 400);
                                int i7111111 = a;
                                int i7111112 = (i7111111 & (-74)) | ((~i7111111) & 73);
                                int i7111113 = (i7111111 & 73) << 1;
                                i9 = ((i7111112 | i7111113) << 1) - (i7111113 ^ i7111112);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    typedArrayObtainAttributes.hasValue(6);
                                    throw null;
                                }
                                if (!typedArrayObtainAttributes.hasValue(6)) {
                                    int i7111114 = b;
                                    int i7111115 = i7111114 & 89;
                                    int i7111116 = -(-((i7111114 ^ 89) | i7111115));
                                    int i7111117 = (i7111115 & i7111116) + (i7111116 | i7111115);
                                    a = i7111117 % 128;
                                    int i7111118 = i7111117 % 2;
                                    i11 = 2;
                                } else {
                                    int i7111119 = b;
                                    i10 = (-2) - (((i7111119 ^ 120) + ((i7111119 & 120) << 1)) ^ (-1));
                                    a = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        i11 = 118;
                                    } else {
                                        i11 = 6;
                                    }
                                }
                                if (1 == typedArrayObtainAttributes.getInt(i11, 0)) {
                                    int i8111110 = b;
                                    int i8111111 = i8111110 & 79;
                                    int i8111112 = ((i8111110 ^ 79) | i8111111) << 1;
                                    int i8111113 = -((~i8111111) & (i8111110 | 79));
                                    int i8111114 = (i8111112 & i8111113) + (i8111112 | i8111113);
                                    a = i8111114 % 128;
                                    int i8111115 = i8111114 % 2;
                                    int i8111116 = i8111110 & 79;
                                    int i8111117 = ((i8111110 ^ 79) | i8111116) << 1;
                                    int i8111118 = -((i8111110 | 79) & (~i8111116));
                                    int i8111119 = (i8111117 & i8111118) + (i8111118 | i8111117);
                                    a = i8111119 % 128;
                                    int i9111110 = i8111119 % 2;
                                    z = true;
                                } else {
                                    int i9111111 = a;
                                    int i9111112 = (i9111111 & (-28)) | ((~i9111111) & 27);
                                    int i9111113 = -(-((i9111111 & 27) << 1));
                                    int i9111114 = (i9111112 & i9111113) + (i9111113 | i9111112);
                                    b = i9111114 % 128;
                                    int i9111115 = i9111114 % 2;
                                    z = false;
                                }
                                if (typedArrayObtainAttributes.hasValue(9)) {
                                    int i9111116 = a;
                                    int i9111117 = i9111116 & 99;
                                    int i9111118 = (i9111117 - (~((i9111116 ^ 99) | i9111117))) - 1;
                                    int i9111119 = i9111118 % 128;
                                    b = i9111119;
                                    int i10111110 = i9111118 % 2;
                                    int i10111111 = i9111119 ^ 19;
                                    int i10111112 = ((i9111119 & 19) | i10111111) << 1;
                                    int i10111113 = -i10111111;
                                    int i10111114 = (i10111112 ^ i10111113) + ((i10111112 & i10111113) << 1);
                                    a = i10111114 % 128;
                                    int i10111115 = i10111114 % 2;
                                    i12 = 3;
                                } else {
                                    i12 = 9;
                                }
                                if (!typedArrayObtainAttributes.hasValue(7)) {
                                    int i10111116 = a;
                                    int i10111117 = i10111116 & 103;
                                    int i10111118 = ((~i10111117) & (i10111116 | 103)) + (i10111117 << 1);
                                    b = i10111118 % 128;
                                    int i10111119 = i10111118 % 2;
                                    int i1111116 = (((i10111116 ^ 27) | (i10111116 & 27)) << 1) - (((~i10111116) & 27) | (i10111116 & (-28)));
                                    b = i1111116 % 128;
                                    int i1111117 = i1111116 % 2;
                                    i13 = i5;
                                } else {
                                    i13 = 7;
                                }
                                String string15 = typedArrayObtainAttributes.getString(i13);
                                int i1111118 = typedArrayObtainAttributes.getInt(i12, 0);
                                i14 = b + 99;
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i1111119 = b + 9;
                                    a = i1111119 % 128;
                                    int i11111110 = i1111119 % 2;
                                    i15 = 0;
                                    i16 = 5;
                                } else {
                                    int i11111111 = b + 9;
                                    a = i11111111 % 128;
                                    int i11111112 = i11111111 % 2;
                                    i15 = 0;
                                    i16 = 5;
                                }
                                int resourceId7 = typedArrayObtainAttributes.getResourceId(i16, i15);
                                int i11111113 = a;
                                int i11111114 = ((i11111113 ^ 119) - (~((i11111113 & 119) << 1))) - 1;
                                b = i11111114 % 128;
                                int i12111110 = i11111114 % 2;
                                String string16 = typedArrayObtainAttributes.getString(i16);
                                typedArrayObtainAttributes.recycle();
                                int i12111111 = b;
                                int i12111112 = (i12111111 ^ 79) + ((i12111111 & 79) << 1);
                                a = i12111112 % 128;
                                int i12111113 = i12111112 % 2;
                                while (xmlPullParser.next() != 3) {
                                    int i12111114 = a;
                                    int i12111115 = (i12111114 ^ 73) + ((i12111114 & 73) << 1);
                                    b = i12111115 % 128;
                                    int i12111116 = i12111115 % 2;
                                    d(xmlPullParser);
                                    int i12111117 = a + 97;
                                    b = i12111117 % 128;
                                    int i12111118 = i12111117 % 2;
                                }
                                aUP aup6 = new aUP(string16, i8, z, string15, i1111118, resourceId7);
                                int i12111119 = (-2) - ((a + 94) ^ (-1));
                                b = i12111119 % 128;
                                int i131110 = i12111119 % 2;
                                arrayList.add(aup6);
                                int i131111 = b;
                                int i131112 = i131111 & 31;
                                int i131113 = i131111 | 31;
                                int i131114 = (i131112 & i131113) + (i131113 | i131112);
                                a = i131114 % 128;
                                int i131115 = i131114 % 2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    auo = new aUO((aUP[]) arrayList.toArray(new aUP[arrayList.size()]));
                    int i1414 = b;
                    int i1415 = i1414 & 97;
                    int i1416 = i1415 + ((i1414 ^ 97) | i1415);
                    a = i1416 % 128;
                    int i1417 = i1416 % 2;
                    int i1418 = i1414 & 107;
                    int i1419 = -(-((i1414 ^ 107) | i1418));
                    i3 = ((i1418 | i1419) << 1) - (i1419 ^ i1418);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i14110 = 3 % 5;
                    }
                }
            }
            int i150 = a;
            int i151 = i150 ^ 7;
            int i152 = ((i150 & 7) | i151) << 1;
            int i153 = -i151;
            i = (i152 ^ i153) + ((i152 & i153) << 1);
            b = i % 128;
            if (i % 2 == 0) {
                return auo;
            }
            throw null;
        }
        d(xmlPullParser);
        int i154 = b;
        int i155 = i154 ^ 55;
        int i156 = ((i154 & 55) | i155) << 1;
        int i157 = -i155;
        int i158 = (i156 & i157) + (i156 | i157);
        a = i158 % 128;
        int i159 = i158 % 2;
        int i160 = b;
        int i161 = (((i160 | 28) << 1) - (i160 ^ 28)) - 1;
        a = i161 % 128;
        int i162 = i161 % 2;
        auo = null;
        int i1510 = a;
        int i1511 = i1510 ^ 7;
        int i1512 = ((i1510 & 7) | i1511) << 1;
        int i1513 = -i1511;
        i = (i1512 ^ i1513) + ((i1512 & i1513) << 1);
        b = i % 128;
        if (i % 2 == 0) {
            return auo;
        }
        throw null;
    }
}
