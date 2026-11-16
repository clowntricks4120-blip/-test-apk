package ivas.gov.bisp.enumeration.p100w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import ivas.gov.bisp.enumeration.p003ac.P;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 0;
    private static int b = 1;
    public String c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public String h;
    public int i;

    public j(String str, int i, Object obj) {
        this.c = str;
        this.d = i;
        e(obj);
    }

    public j(j jVar, Object obj) {
        this.c = jVar.c;
        this.d = jVar.d;
        e(obj);
    }

    public void e(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 74) + (i2 | 74);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            P.c(this.d);
            obj2.hashCode();
            throw null;
        }
        switch (P.c(this.d)) {
            case 0:
                this.e = ((Integer) obj).intValue();
                int i5 = a + 109;
                b = i5 % 128;
                int i6 = i5 % 2;
                return;
            case 1:
                this.f = ((Float) obj).floatValue();
                int i7 = a;
                int i8 = (i7 | 85) << 1;
                int i9 = -(i7 ^ 85);
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            case 2:
            case 3:
                this.i = ((Integer) obj).intValue();
                int i11 = (-2) - ((a + 66) ^ (-1));
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            case 4:
                this.h = (String) obj;
                int i12 = b;
                int i13 = ((i12 ^ 81) | (i12 & 81)) << 1;
                int i14 = -(((~i12) & 81) | (i12 & (-82)));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 75 / 0;
                    return;
                }
                return;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                int i17 = b;
                int i18 = i17 & 89;
                int i19 = i18 + ((i17 ^ 89) | i18);
                a = i19 % 128;
                int i20 = i19 % 2;
                return;
            case 6:
                this.f = ((Float) obj).floatValue();
                int i21 = b;
                int i22 = (((i21 ^ 117) | (i21 & 117)) << 1) - (((~i21) & 117) | (i21 & (-118)));
                a = i22 % 128;
                int i23 = i22 % 2;
                return;
            default:
                int i24 = a;
                int i25 = (i24 | 77) << 1;
                int i26 = -(i24 ^ 77);
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                b = i27 % 128;
                if (i27 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x030f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0318  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v68 */
    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, j> map) {
        j jVar;
        int i;
        int i2;
        Float fValueOf;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 107;
        int i6 = -(-(i4 | 107));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.j);
            throw null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.j);
        int i8 = b;
        int i9 = i8 & 79;
        int i10 = -(-((i8 ^ 79) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        int i13 = a;
        int i14 = (i13 & 81) + (i13 | 81);
        b = i14 % 128;
        ?? r7 = 0;
        int i15 = i14 % 2 == 0 ? 1 : 0;
        String string = 0;
        Object string2 = null;
        int i16 = 0;
        while (i16 < indexCount) {
            int i17 = b;
            int i18 = i17 & 69;
            int i19 = i18 + ((i17 ^ 69) | i18);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                typedArrayObtainStyledAttributes.getIndex(i16);
                throw null;
            }
            int index = typedArrayObtainStyledAttributes.getIndex(i16);
            if (index == 0) {
                int i20 = (-2) - ((b + 114) ^ (-1));
                a = i20 % 128;
                int i21 = i20 % 2;
                string = typedArrayObtainStyledAttributes.getString(index);
                int i22 = b;
                int i23 = i22 & 107;
                int i24 = (i22 ^ 107) | i23;
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    throw null;
                }
                if (string != 0) {
                    int i26 = i22 & 59;
                    int i27 = -(-((i22 ^ 59) | i26));
                    int i28 = (i26 & i27) + (i27 | i26);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    if (string.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        char upperCase = Character.toUpperCase(string.charAt(r7));
                        int i30 = b;
                        int i31 = (i30 ^ 13) + ((i30 & 13) << 1);
                        a = i31 % 128;
                        if (i31 % 2 != 0) {
                            sb.append(upperCase);
                            sb.append(string.substring(r7));
                        } else {
                            sb.append(upperCase);
                            sb.append(string.substring(1));
                        }
                        string = sb.toString();
                        int i32 = a;
                        int i33 = ((i32 ^ 41) | (i32 & 41)) << 1;
                        int i34 = -(((~i32) & 41) | (i32 & (-42)));
                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                    }
                }
            } else {
                if (index == 1) {
                    int i37 = b;
                    int i38 = ((i37 & (-6)) | ((~i37) & 5)) + ((i37 & 5) << 1);
                    a = i38 % 128;
                    if (i38 % 2 != 0) {
                        string2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, r7));
                        i2 = 111;
                    } else {
                        string2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, r7));
                        i2 = 6;
                    }
                    int i39 = b;
                    int i40 = ((i39 | 103) << 1) - (i39 ^ 103);
                    a = i40 % 128;
                    if (i40 % 2 != 0) {
                        int i41 = 59 / r7;
                    }
                } else {
                    int i42 = 3;
                    i2 = 4;
                    if (index == 3) {
                        int i43 = b;
                        int i44 = i43 ^ 117;
                        int i45 = ((i43 & 117) | i44) << 1;
                        int i46 = -i44;
                        int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                        a = i47 % 128;
                        int i48 = i47 % 2;
                        string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, r7));
                        int i49 = b;
                        int i50 = (((i49 | 22) << 1) - (i49 ^ 22)) - 1;
                        a = i50 % 128;
                        if (i50 % 2 != 0) {
                            i42 = 4;
                        }
                    } else if (index == 2) {
                        int i51 = a;
                        int i52 = i51 & 31;
                        int i53 = -(-(i51 | 31));
                        int i54 = (i52 & i53) + (i53 | i52);
                        b = i54 % 128;
                        int i55 = i54 % 2;
                        string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, r7));
                        int i56 = b + 79;
                        int i57 = i56 % 128;
                        a = i57;
                        int i58 = i56 % 2;
                        int i59 = ((i57 | 91) << 1) - (i57 ^ 91);
                        b = i59 % 128;
                        int i60 = i59 % 2;
                    } else {
                        i42 = 7;
                        if (index == 7) {
                            int i61 = a + 25;
                            b = i61 % 128;
                            int i62 = i61 % 2;
                            fValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                            int i63 = a;
                            int i64 = ((i63 ^ 93) - (~((i63 & 93) << 1))) - 1;
                            int i65 = i64 % 128;
                            b = i65;
                            int i66 = i64 % 2;
                            int i67 = i65 + 103;
                            a = i67 % 128;
                            if (i67 % 2 != 0) {
                                int i68 = 2 / 4;
                            }
                        } else if (index == 4) {
                            int i69 = a;
                            int i70 = i69 & 93;
                            int i71 = i69 | 93;
                            int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                            b = i72 % 128;
                            fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, i72 % 2 == 0 ? 2.0f : 0.0f));
                            int i73 = b + 101;
                            a = i73 % 128;
                            int i74 = i73 % 2;
                        } else if (index == 5) {
                            int i75 = a;
                            int i76 = i75 ^ 63;
                            int i77 = -(-((i75 & 63) << 1));
                            int i78 = (i76 & i77) + (i77 | i76);
                            b = i78 % 128;
                            int i79 = i78 % 2;
                            string2 = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                            int i80 = a;
                            int i81 = (i80 ^ 80) + ((i80 & 80) << 1);
                            int i82 = (i81 ^ (-1)) + (i81 << 1);
                            b = i82 % 128;
                            if (i82 % 2 == 0) {
                                throw null;
                            }
                            i15 = 2;
                        } else if (index == 6) {
                            int i83 = b;
                            int i84 = (i83 ^ 115) + ((i83 & 115) << 1);
                            a = i84 % 128;
                            int i85 = i84 % 2;
                            string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                            int i86 = a;
                            int i87 = (-2) - ((-1) ^ (((i86 | 40) << 1) - (i86 ^ 40)));
                            int i88 = i87 % 128;
                            b = i88;
                            int i89 = i87 % 2;
                            int i90 = ((((i88 ^ 49) | (i88 & 49)) << 1) - (~(-(((~i88) & 49) | (i88 & (-50)))))) - 1;
                            a = i90 % 128;
                            int i91 = i90 % 2;
                            i15 = 1;
                        } else {
                            int i92 = a;
                            int i93 = i92 & 9;
                            int i94 = i93 + ((i92 ^ 9) | i93);
                            b = i94 % 128;
                            int i95 = i94 % 2;
                            if (index == 8) {
                                int i96 = ((i92 ^ 58) + ((i92 & 58) << 1)) - 1;
                                b = i96 % 128;
                                int i97 = i96 % 2;
                                string2 = typedArrayObtainStyledAttributes.getString(index);
                                int i98 = a + 63;
                                b = i98 % 128;
                                int i99 = i98 % 2;
                                i15 = 5;
                            }
                        }
                        string2 = fValueOf;
                        int i100 = a;
                        int i101 = i100 & 115;
                        int i102 = (i101 - (~(-(-((i100 ^ 115) | i101))))) - 1;
                        b = i102 % 128;
                        int i103 = i102 % 2;
                    }
                    i15 = i42;
                }
                i15 = i2;
            }
            i16 = ((i16 & (-2)) | ((~i16) & 1)) + ((i16 & 1) << 1);
            int i104 = a;
            int i105 = i104 & 119;
            int i106 = (i104 ^ 119) | i105;
            int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
            b = i107 % 128;
            int i108 = i107 % 2;
            r7 = 0;
            string = string;
        }
        if (string != 0) {
            int i109 = (-2) - ((a + 76) ^ (-1));
            b = i109 % 128;
            if (i109 % 2 == 0) {
                int i110 = 45 / 0;
                if (string2 != null) {
                    jVar = new j(string, i15, string2);
                    int i111 = b;
                    i = ((i111 | 43) << 1) - (((~i111) & 43) | (i111 & (-44)));
                    a = i % 128;
                    if (i % 2 != 0) {
                        map.put(string, jVar);
                        int i112 = 79 / 0;
                    } else {
                        map.put(string, jVar);
                    }
                    int i113 = a;
                    int i114 = ((i113 & (-2)) | ((~i113) & 1)) + ((i113 & 1) << 1);
                    b = i114 % 128;
                    int i115 = i114 % 2;
                }
            } else if (string2 != null) {
                jVar = new j(string, i15, string2);
                int i116 = b;
                i = ((i116 | 43) << 1) - (((~i116) & 43) | (i116 & (-44)));
                a = i % 128;
                if (i % 2 != 0) {
                    map.put(string, jVar);
                    int i117 = 79 / 0;
                } else {
                    map.put(string, jVar);
                }
                int i118 = a;
                int i119 = ((i118 & (-2)) | ((~i118) & 1)) + ((i118 & 1) << 1);
                b = i119 % 128;
                int i1110 = i119 % 2;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        int i120 = b;
        int i121 = (i120 & (-62)) | ((~i120) & 61);
        int i122 = (i120 & 61) << 1;
        int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
        a = i123 % 128;
        int i124 = i123 % 2;
    }
}
