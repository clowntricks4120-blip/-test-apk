package ivas.gov.bisp.enumeration.cJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static int a = 0;
    private static int b = 1;
    public int c = 1;
    public int d = 2;
    public int e = 10;
    public List<Object> f;
    public boolean g;
    public boolean h;
    public bEr[] i;

    public static class bEn implements J, o {
        private static int a = 0;
        private static int b = 1;
        public final J[] c;
        public final o[] d;

        /* JADX WARN: Code duplicated, block: B:12:0x003a A[PHI: r8
  0x003a: PHI (r8v4 java.lang.Object) = (r8v3 java.lang.Object), (r8v36 java.lang.Object) binds: [B:11:0x0038, B:8:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x004c  */
        /* JADX WARN: Code duplicated, block: B:16:0x0050  */
        /* JADX WARN: Code duplicated, block: B:18:0x005e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        /* JADX WARN: Code duplicated, block: B:23:0x008a  */
        /* JADX WARN: Code duplicated, block: B:25:0x009a  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:80:0x00e0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x00cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x006e A[SYNTHETIC] */
        public bEn(List<Object> list) {
            Object obj;
            int i;
            int i2;
            J[] jArr;
            int i3;
            int i4;
            int i5;
            int i6;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            int i7 = 2 % 2;
            int i8 = 0;
            while (true) {
                Object obj2 = null;
                if (i8 >= size) {
                    if (arrayList.size() <= 0) {
                        int i9 = a;
                        int i10 = i9 + 66;
                        int i11 = (i10 ^ (-1)) + (i10 << 1);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            this.c = null;
                            obj2.hashCode();
                            throw null;
                        }
                        this.c = null;
                        int i12 = (i9 & 10) + (i9 | 10);
                        int i13 = (i12 ^ (-1)) + (i12 << 1);
                        b = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = 4 / 3;
                        }
                    } else {
                        Object[] array = arrayList.toArray(new J[arrayList.size()]);
                        int i15 = b;
                        int i16 = (i15 & (-102)) | ((~i15) & 101);
                        int i17 = -(-((i15 & 101) << 1));
                        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                        a = i18 % 128;
                        if (i18 % 2 != 0) {
                            this.c = (J[]) array;
                            int i19 = 74 / 0;
                        } else {
                            this.c = (J[]) array;
                        }
                    }
                    if (arrayList2.size() > 0) {
                        Object[] array2 = arrayList2.toArray(new o[arrayList2.size()]);
                        int i20 = b;
                        int i21 = i20 & 7;
                        int i22 = (~i21) & (i20 | 7);
                        int i23 = i21 << 1;
                        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                        a = i24 % 128;
                        int i25 = i24 % 2;
                        this.d = (o[]) array2;
                        int i26 = (i20 ^ 45) + ((i20 & 45) << 1);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        return;
                    }
                    int i28 = a;
                    int i29 = i28 & 69;
                    int i30 = -(-((i28 ^ 69) | i29));
                    int i31 = (i29 & i30) + (i29 | i30);
                    b = i31 % 128;
                    if (i31 % 2 == 0) {
                        this.d = null;
                        obj2.hashCode();
                        throw null;
                    }
                    this.d = null;
                    int i32 = i28 + 53;
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    return;
                }
                int i34 = b + 9;
                a = i34 % 128;
                if (i34 % 2 != 0) {
                    obj = list.get(i8);
                    int i35 = 10 / 0;
                    if (obj instanceof J) {
                        i = b;
                        int i36 = i & 121;
                        int i37 = (i ^ 121) | i36;
                        i2 = (i36 & i37) + (i36 | i37);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            boolean z = obj instanceof bEn;
                            throw null;
                        }
                        if (obj instanceof bEn) {
                            int i38 = i + 65;
                            a = i38 % 128;
                            int i39 = i38 % 2;
                            jArr = ((bEn) obj).c;
                            if (jArr != null) {
                                int i40 = i + 13;
                                a = i40 % 128;
                                int i41 = i40 % 2;
                                int i42 = i + 27;
                                a = i42 % 128;
                                int i43 = i42 % 2;
                                i3 = 0;
                                while (i3 < jArr.length) {
                                    int i44 = b;
                                    int i45 = i44 & 37;
                                    int i46 = ((i44 ^ 37) | i45) << 1;
                                    int i47 = -((i44 | 37) & (~i45));
                                    i4 = ((i46 | i47) << 1) - (i47 ^ i46);
                                    a = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        arrayList.add(jArr[i3]);
                                        int i48 = i3 & 48;
                                        int i49 = (i3 ^ 48) | i48;
                                        i5 = (i48 & i49) + (i49 | i48);
                                    } else {
                                        arrayList.add(jArr[i3]);
                                        int i50 = (i3 & 66) + (i3 | 66);
                                        int i51 = i50 & (-65);
                                        int i52 = ((i50 ^ (-65)) | i51) << 1;
                                        int i53 = -((i50 | (-65)) & (~i51));
                                        i5 = ((i52 | i53) << 1) - (i52 ^ i53);
                                    }
                                    i3 = i5;
                                    int i54 = a;
                                    i6 = (((i54 ^ 91) | (i54 & 91)) << 1) - (((~i54) & 91) | (i54 & (-92)));
                                    b = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        int i55 = 3 / 2;
                                    }
                                }
                            }
                        } else {
                            arrayList.add(obj);
                            int i56 = b;
                            int i57 = i56 ^ 113;
                            int i58 = (((i56 & 113) | i57) << 1) - i57;
                            a = i58 % 128;
                            int i59 = i58 % 2;
                        }
                    }
                } else {
                    obj = list.get(i8);
                    if (obj instanceof J) {
                        i = b;
                        int i310 = i & 121;
                        int i311 = (i ^ 121) | i310;
                        i2 = (i310 & i311) + (i310 | i311);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            boolean z2 = obj instanceof bEn;
                            throw null;
                        }
                        if (obj instanceof bEn) {
                            int i312 = i + 65;
                            a = i312 % 128;
                            int i313 = i312 % 2;
                            jArr = ((bEn) obj).c;
                            if (jArr != null) {
                                int i410 = i + 13;
                                a = i410 % 128;
                                int i411 = i410 % 2;
                                int i412 = i + 27;
                                a = i412 % 128;
                                int i413 = i412 % 2;
                                i3 = 0;
                                while (i3 < jArr.length) {
                                    int i414 = b;
                                    int i415 = i414 & 37;
                                    int i416 = ((i414 ^ 37) | i415) << 1;
                                    int i417 = -((i414 | 37) & (~i415));
                                    i4 = ((i416 | i417) << 1) - (i417 ^ i416);
                                    a = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        arrayList.add(jArr[i3]);
                                        int i418 = i3 & 48;
                                        int i419 = (i3 ^ 48) | i418;
                                        i5 = (i418 & i419) + (i419 | i418);
                                    } else {
                                        arrayList.add(jArr[i3]);
                                        int i510 = (i3 & 66) + (i3 | 66);
                                        int i511 = i510 & (-65);
                                        int i512 = ((i510 ^ (-65)) | i511) << 1;
                                        int i513 = -((i510 | (-65)) & (~i511));
                                        i5 = ((i512 | i513) << 1) - (i512 ^ i513);
                                    }
                                    i3 = i5;
                                    int i514 = a;
                                    i6 = (((i514 ^ 91) | (i514 & 91)) << 1) - (((~i514) & 91) | (i514 & (-92)));
                                    b = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        int i515 = 3 / 2;
                                    }
                                }
                            }
                        } else {
                            arrayList.add(obj);
                            int i516 = b;
                            int i517 = i516 ^ 113;
                            int i518 = (((i516 & 113) | i517) << 1) - i517;
                            a = i518 % 128;
                            int i519 = i518 % 2;
                        }
                    }
                }
                int i60 = i8 & 1;
                Object obj3 = list.get((i60 - (~(-(-((i8 ^ 1) | i60))))) - 1);
                int i61 = b;
                int i62 = i61 & 85;
                int i63 = i62 + ((i61 ^ 85) | i62);
                a = i63 % 128;
                if (i63 % 2 != 0) {
                    boolean z3 = obj3 instanceof o;
                    throw null;
                }
                if (obj3 instanceof o) {
                    if (!(!(obj3 instanceof bEn))) {
                        int i64 = i61 ^ 13;
                        int i65 = -(-((i61 & 13) << 1));
                        int i66 = ((i64 | i65) << 1) - (i64 ^ i65);
                        a = i66 % 128;
                        if (i66 % 2 != 0) {
                            o[] oVarArr = ((bEn) obj3).d;
                            throw null;
                        }
                        o[] oVarArr2 = ((bEn) obj3).d;
                        if (oVarArr2 != null) {
                            int i67 = i61 ^ 27;
                            int i68 = ((i61 & 27) | i67) << 1;
                            int i69 = -i67;
                            int i70 = (i68 & i69) + (i69 | i68);
                            a = i70 % 128;
                            int i71 = i70 % 2;
                            int i72 = 0;
                            while (i72 < oVarArr2.length) {
                                int i73 = a;
                                int i74 = ((i73 | 118) << 1) - (i73 ^ 118);
                                int i75 = (i74 ^ (-1)) + (i74 << 1);
                                b = i75 % 128;
                                if (i75 % 2 == 0) {
                                    arrayList2.add(oVarArr2[i72]);
                                    i72 = (-2) - ((i72 + 123) ^ (-1));
                                } else {
                                    arrayList2.add(oVarArr2[i72]);
                                    i72++;
                                }
                                int i76 = a;
                                int i77 = ((i76 ^ 17) | (i76 & 17)) << 1;
                                int i78 = -(((~i76) & 17) | (i76 & (-18)));
                                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                                b = i79 % 128;
                                int i80 = i79 % 2;
                            }
                        }
                    } else {
                        arrayList2.add(obj3);
                        int i81 = a;
                        int i82 = (i81 ^ 93) + ((i81 & 93) << 1);
                        b = i82 % 128;
                        int i83 = i82 % 2;
                    }
                }
                int i84 = (i8 ^ 15) + ((i8 & 15) << 1);
                int i85 = (i84 & 12) | ((~i84) & (-13));
                int i86 = (i84 & (-13)) << 1;
                i8 = ((i85 & i86) << 1) + (i85 ^ i86);
                int i87 = a + 47;
                b = i87 % 128;
                int i88 = i87 % 2;
            }
        }
    }

    public interface bEo {
        void b(Set<bEo> set);

        String[] e();
    }

    public static class bEq extends bEp {
        private static int a = 0;
        private static int b = 1;
        public final bEo d;
        public final bEo e;
        public final String[] f;

        public bEq(bEo beo, bEo beo2) {
            int i;
            this.d = beo;
            this.e = beo2;
            HashSet hashSet = new HashSet();
            String[] strArrE = beo.e();
            int length = strArrE.length;
            int i2 = 2 % 2;
            int i3 = 0;
            while (i3 < length) {
                int i4 = b;
                int i5 = ((i4 ^ 27) - (~((i4 & 27) << 1))) - 1;
                a = i5 % 128;
                int i6 = i5 % 2;
                String str = strArrE[i3];
                String[] strArrE2 = this.e.e();
                int i7 = b;
                int i8 = (i7 & 83) + (i7 | 83);
                a = i8 % 128;
                int i9 = i8 % 2;
                int length2 = strArrE2.length;
                int i10 = (i7 ^ 23) + ((i7 & 23) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 0;
                while (i12 < length2) {
                    String str2 = strArrE2[i12];
                    StringBuilder sb = new StringBuilder();
                    int i13 = a;
                    int i14 = ((i13 & 74) + (i13 | 74)) - 1;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    sb.append(str);
                    sb.append(str2);
                    int i16 = a;
                    int i17 = ((i16 ^ 51) | (i16 & 51)) << 1;
                    int i18 = -(((~i16) & 51) | (i16 & (-52)));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    b = i19 % 128;
                    if (i19 % 2 == 0) {
                        hashSet.add(sb.toString());
                        int i20 = i12 + 92;
                        i = ((i20 | (-58)) << 1) - (i20 ^ (-58));
                    } else {
                        hashSet.add(sb.toString());
                        int i21 = i12 & 1;
                        i = i21 + ((i12 ^ 1) | i21);
                    }
                    i12 = i;
                }
                int i22 = (i3 ^ (-104)) + ((i3 & (-104)) << 1);
                i3 = ((i22 | 105) << 1) - (i22 ^ 105);
                int i23 = a;
                int i24 = i23 ^ 73;
                int i25 = -(-((i23 & 73) << 1));
                int i26 = (i24 & i25) + (i25 | i24);
                b = i26 % 128;
                int i27 = i26 % 2;
            }
            Object[] array = hashSet.toArray(new String[hashSet.size()]);
            int i28 = a;
            int i29 = ((i28 ^ 4) + ((i28 & 4) << 1)) - 1;
            b = i29 % 128;
            if (i29 % 2 != 0) {
                this.f = (String[]) array;
            } else {
                this.f = (String[]) array;
                int i30 = 57 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.cJ.a.bEo
        public String[] e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
            a = i3 % 128;
            int i4 = i3 % 2;
            String[] strArr = this.f;
            if (i4 == 0) {
                return (String[]) strArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class bEs implements J, o {
        private static int a = 0;
        private static int b = 1;
        public static final bEs c = new bEs(BuildConfig.FLAVOR);

        static {
            int i = a;
            int i2 = (((i & (-92)) | ((~i) & 91)) - (~(-(-((i & 91) << 1))))) - 1;
            b = i2 % 128;
            int i3 = i2 % 2;
        }

        public bEs(String str) {
        }
    }

    public static class bEt implements J, o {
        private static int a = 1;
        private static int b;
        public final J c;
        public volatile J d;
        public final o e;
        public volatile o f;

        /* JADX WARN: Code duplicated, block: B:12:0x0069  */
        /* JADX WARN: Code duplicated, block: B:15:0x0079  */
        /* JADX WARN: Code duplicated, block: B:21:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:22:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ae A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[EDGE_INSN: B:27:0x00b1->B:19:0x00b1 BREAK  A[LOOP:0: B:13:0x006b->B:28:0x006b], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x006b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0024  */
        /* JADX WARN: Code duplicated, block: B:9:0x004d  */
        public bEt(String str, String str2, String[] strArr, J j, o oVar, boolean z, boolean z2) {
            TreeSet treeSet;
            ArrayList arrayList;
            int i;
            int length;
            int i2;
            int i3;
            if (!str.equals(str2)) {
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                int i4 = b;
                int i5 = ((((i4 ^ 71) | (i4 & 71)) << 1) - (~(-(((~i4) & 71) | (i4 & (-72)))))) - 1;
                a = i5 % 128;
                int i6 = i5 % 2;
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int i7 = b;
                    int i8 = ((i7 | 19) << 1) - (i7 ^ 19);
                    int i9 = i8 % 128;
                    a = i9;
                    int i10 = i8 % 2;
                    length = strArr.length;
                    i2 = (i9 & 9) + (i9 | 9);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i11 = 2 % 2;
                    }
                    while (true) {
                        int i12 = ~length;
                        int i13 = -(-(length << 1));
                        length = (i12 ^ i13) + ((i12 & i13) << 1);
                        if (length >= 0) {
                            break;
                        }
                        int i14 = a;
                        int i15 = i14 & 21;
                        int i16 = (i14 | 21) & (~i15);
                        int i17 = i15 << 1;
                        int i18 = (i16 & i17) + (i16 | i17);
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        treeSet.add(strArr[length]);
                        int i20 = a;
                        i3 = ((((i20 ^ 57) | (i20 & 57)) << 1) - (~(-(((~i20) & 57) | (i20 & (-58)))))) - 1;
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i21 = 2 % 2;
                        }
                    }
                }
                arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                i = a + 5;
                b = i % 128;
                if (i % 2 != 0) {
                    int i22 = 31 / 0;
                }
                int i23 = 2 % 2;
            } else if (strArr != null) {
                int i24 = b;
                int i25 = (((i24 & (-36)) | ((~i24) & 35)) - (~((i24 & 35) << 1))) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
                if (strArr.length != 0) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    int i27 = b;
                    int i28 = ((((i27 ^ 71) | (i27 & 71)) << 1) - (~(-(((~i27) & 71) | (i27 & (-72)))))) - 1;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    treeSet.add(str);
                    treeSet.add(str2);
                    if (strArr != null) {
                        int i30 = b;
                        int i31 = ((i30 | 19) << 1) - (i30 ^ 19);
                        int i32 = i31 % 128;
                        a = i32;
                        int i110 = i31 % 2;
                        length = strArr.length;
                        i2 = (i32 & 9) + (i32 | 9);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i111 = 2 % 2;
                        }
                        while (true) {
                            int i112 = ~length;
                            int i113 = -(-(length << 1));
                            length = (i112 ^ i113) + ((i112 & i113) << 1);
                            if (length >= 0) {
                                break;
                                break;
                            }
                            int i114 = a;
                            int i115 = i114 & 21;
                            int i116 = (i114 | 21) & (~i115);
                            int i117 = i115 << 1;
                            int i118 = (i116 & i117) + (i116 | i117);
                            b = i118 % 128;
                            int i119 = i118 % 2;
                            treeSet.add(strArr[length]);
                            int i210 = a;
                            i3 = ((((i210 ^ 57) | (i210 & 57)) << 1) - (~(-(((~i210) & 57) | (i210 & (-58)))))) - 1;
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i211 = 2 % 2;
                            }
                        }
                    }
                    arrayList = new ArrayList(treeSet);
                    Collections.reverse(arrayList);
                    i = a + 5;
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i212 = 31 / 0;
                    }
                    int i213 = 2 % 2;
                }
            }
            this.c = j;
            this.e = oVar;
            int i33 = a;
            int i34 = (i33 & 65) + (i33 | 65);
            b = i34 % 128;
            int i35 = i34 % 2;
        }
    }

    public static class bEu extends bEp {
        private static int a = 1;
        private static int b;
        public final String d;

        public bEu(String str) {
            this.d = str;
        }

        @Override // ivas.gov.bisp.enumeration.cJ.a.bEo
        public String[] e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 47;
            int i4 = (i2 & 47) << 1;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            String[] strArr = {this.d};
            int i7 = i2 + 65;
            a = i7 % 128;
            int i8 = i7 % 2;
            return strArr;
        }
    }

    static {
        new ConcurrentHashMap();
        int i = b;
        int i2 = (i & 103) + (i | 103);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public a() {
        List<Object> list = this.f;
        if (list == null) {
            this.f = new ArrayList();
            int i = a;
            int i2 = (i & (-44)) | ((~i) & 43);
            int i3 = (i & 43) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
        } else {
            list.clear();
            int i6 = b;
            int i7 = ((i6 ^ 79) | (i6 & 79)) << 1;
            int i8 = -(((~i6) & 79) | (i6 & (-80)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = 2 % 2;
        this.h = false;
        this.g = false;
        int i12 = a;
        int i13 = i12 + 123;
        b = i13 % 128;
        int i14 = i13 % 2;
        this.i = new bEr[10];
        int i15 = ((i12 | 1) << 1) - (1 ^ i12);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public static Object[] d(List<Object> list) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = (i3 - (~(-(-((i2 ^ 119) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        if (size == 0) {
            Object[] objArr = new Object[2];
            bEs bes = bEs.c;
            objArr[0] = bes;
            int i6 = a + 79;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                objArr[1] = bes;
                int i7 = 54 / 0;
            } else {
                objArr[1] = bes;
            }
            return objArr;
        }
        int i8 = a;
        int i9 = i8 & 113;
        int i10 = (i9 - (~((i8 ^ 113) | i9))) - 1;
        b = i10 % 128;
        if (i10 % 2 != 0 ? size != 1 : size != 1) {
            bEn ben = new bEn(list);
            Object[] objArr2 = new Object[2];
            int i11 = b;
            int i12 = i11 & 65;
            int i13 = (i12 - (~(-(-((i11 ^ 65) | i12))))) - 1;
            a = i13 % 128;
            if (i13 % 2 != 0) {
                objArr2[0] = ben;
                objArr2[0] = ben;
            } else {
                objArr2[0] = ben;
                objArr2[1] = ben;
            }
            return objArr2;
        }
        Object[] objArr3 = new Object[2];
        Object obj = list.get(0);
        int i14 = b;
        int i15 = i14 & 53;
        int i16 = (i15 - (~(-(-((i14 ^ 53) | i15))))) - 1;
        a = i16 % 128;
        if (i16 % 2 != 0) {
            objArr3[0] = obj;
            objArr3[1] = list.get(1);
        } else {
            objArr3[0] = obj;
            objArr3[1] = list.get(1);
        }
        int i17 = a;
        int i18 = i17 & 121;
        int i19 = -(-((i17 ^ 121) | i18));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return objArr3;
        }
        throw null;
    }

    public final void h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = ((i2 | 89) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static abstract class bEp implements bEo {
        private static int a = 0;
        private static int b = 1;
        public volatile String[] c;

        /* JADX WARN: Code duplicated, block: B:32:0x0110  */
        /* JADX WARN: Code duplicated, block: B:34:0x011a  */
        /* JADX WARN: Code duplicated, block: B:36:0x0138  */
        /* JADX WARN: Code duplicated, block: B:38:0x014c  */
        /* JADX WARN: Code duplicated, block: B:41:0x0155  */
        /* JADX WARN: Code duplicated, block: B:43:0x0169  */
        /* JADX WARN: Code duplicated, block: B:50:0x017e  */
        /* JADX WARN: Code duplicated, block: B:74:0x01a3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x0177 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x0170 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x018e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x018e A[SYNTHETIC] */
        @Override // ivas.gov.bisp.enumeration.cJ.a.bEo
        public void b(Set<bEo> set) {
            bEo next;
            String[] strArrE;
            int length;
            int i;
            int i2;
            int i3;
            String str;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int i7 = a;
            int i8 = (((i7 & (-102)) | ((~i7) & 101)) - (~((i7 & 101) << 1))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            Object obj = null;
            if (this.c == null) {
                int i10 = b + 107;
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    e();
                    throw null;
                }
                String[] strArrE2 = e();
                int length2 = strArrE2.length;
                int i11 = b;
                int i12 = i11 & 19;
                int i13 = ((i11 ^ 19) | i12) << 1;
                int i14 = -((i11 | 19) & (~i12));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                int length3 = Integer.MAX_VALUE;
                String str2 = null;
                int i17 = 0;
                while (i17 < length2) {
                    int i18 = b;
                    int i19 = ((i18 | 81) << 1) - (i18 ^ 81);
                    a = i19 % 128;
                    if (i19 % 2 != 0) {
                        strArrE2[i17].length();
                        throw null;
                    }
                    String str3 = strArrE2[i17];
                    if (str3.length() < length3) {
                        int i20 = a + 22;
                        int i21 = (i20 ^ (-1)) + (i20 << 1);
                        b = i21 % 128;
                        if (i21 % 2 == 0) {
                            str3.length();
                            obj.hashCode();
                            throw null;
                        }
                        length3 = str3.length();
                        str2 = str3;
                    }
                    int i22 = i17 & 1;
                    int i23 = (i17 | 1) & (~i22);
                    int i24 = i22 << 1;
                    i17 = ((i23 & i24) << 1) + (i23 ^ i24);
                    int i25 = b;
                    int i26 = i25 ^ 83;
                    int i27 = ((i25 & 83) | i26) << 1;
                    int i28 = -i26;
                    int i29 = (i27 & i28) + (i27 | i28);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                }
                HashSet hashSet = new HashSet();
                Iterator<bEo> it = set.iterator();
                int i31 = a;
                int i32 = i31 | 121;
                int i33 = ((i32 << 1) - (~(-((~(i31 & 121)) & i32)))) - 1;
                b = i33 % 128;
                int i34 = i33 % 2;
                while (it.hasNext()) {
                    int i35 = a;
                    int i36 = ((i35 | 54) << 1) - (i35 ^ 54);
                    int i37 = (i36 ^ (-1)) + (i36 << 1);
                    b = i37 % 128;
                    if (i37 % 2 == 0) {
                        next = it.next();
                        int i38 = 63 / 0;
                        if (next != null) {
                            strArrE = next.e();
                            length = strArrE.length;
                            int i39 = b;
                            i = ((i39 & (-86)) | ((~i39) & 85)) + ((i39 & 85) << 1);
                            i2 = i % 128;
                            a = i2;
                            if (i % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i40 = i2 + 117;
                            b = i40 % 128;
                            int i41 = i40 % 2;
                            i3 = 0;
                            while (i3 < length) {
                                int i42 = b;
                                int i43 = (((i42 | 41) << 1) - (~(-(((~i42) & 41) | (i42 & (-42)))))) - 1;
                                a = i43 % 128;
                                int i44 = i43 % 2;
                                str = strArrE[i3];
                                if (str.length() <= length3) {
                                    int i45 = a;
                                    i4 = ((i45 & (-8)) | ((~i45) & 7)) + ((i45 & 7) << 1);
                                    b = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        str.equalsIgnoreCase(str2);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (!str.equalsIgnoreCase(str2)) {
                                        continue;
                                    } else {
                                        int i46 = b;
                                        int i47 = i46 & 17;
                                        int i48 = (i46 ^ 17) | i47;
                                        i5 = (i47 ^ i48) + ((i48 & i47) << 1);
                                        a = i5 % 128;
                                        if (i5 % 2 == 0) {
                                            str.equals(str2);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (!str.equals(str2)) {
                                            hashSet.add(str);
                                            int i49 = a;
                                            int i50 = i49 & 87;
                                            int i51 = i50 + ((i49 ^ 87) | i50);
                                            b = i51 % 128;
                                            int i52 = i51 % 2;
                                        }
                                    }
                                } else {
                                    hashSet.add(str);
                                    int i410 = a;
                                    int i53 = i410 & 87;
                                    int i54 = i53 + ((i410 ^ 87) | i53);
                                    b = i54 % 128;
                                    int i55 = i54 % 2;
                                }
                                i3++;
                                int i56 = a;
                                int i57 = i56 & 75;
                                int i58 = i56 | 75;
                                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                                b = i59 % 128;
                                int i60 = i59 % 2;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        next = it.next();
                        if (next != null) {
                            strArrE = next.e();
                            length = strArrE.length;
                            int i310 = b;
                            i = ((i310 & (-86)) | ((~i310) & 85)) + ((i310 & 85) << 1);
                            i2 = i % 128;
                            a = i2;
                            if (i % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i411 = i2 + 117;
                            b = i411 % 128;
                            int i412 = i411 % 2;
                            i3 = 0;
                            while (i3 < length) {
                                int i413 = b;
                                int i414 = (((i413 | 41) << 1) - (~(-(((~i413) & 41) | (i413 & (-42)))))) - 1;
                                a = i414 % 128;
                                int i415 = i414 % 2;
                                str = strArrE[i3];
                                if (str.length() <= length3) {
                                    int i416 = a;
                                    i4 = ((i416 & (-8)) | ((~i416) & 7)) + ((i416 & 7) << 1);
                                    b = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        str.equalsIgnoreCase(str2);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (!str.equalsIgnoreCase(str2)) {
                                        continue;
                                    } else {
                                        int i417 = b;
                                        int i418 = i417 & 17;
                                        int i419 = (i417 ^ 17) | i418;
                                        i5 = (i418 ^ i419) + ((i419 & i418) << 1);
                                        a = i5 % 128;
                                        if (i5 % 2 == 0) {
                                            str.equals(str2);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (!str.equals(str2)) {
                                            hashSet.add(str);
                                            int i4110 = a;
                                            int i510 = i4110 & 87;
                                            int i511 = i510 + ((i4110 ^ 87) | i510);
                                            b = i511 % 128;
                                            int i512 = i511 % 2;
                                        }
                                    }
                                } else {
                                    hashSet.add(str);
                                    int i4111 = a;
                                    int i513 = i4111 & 87;
                                    int i514 = i513 + ((i4111 ^ 87) | i513);
                                    b = i514 % 128;
                                    int i515 = i514 % 2;
                                }
                                i3++;
                                int i516 = a;
                                int i517 = i516 & 75;
                                int i518 = i516 | 75;
                                int i519 = ((i517 | i518) << 1) - (i518 ^ i517);
                                b = i519 % 128;
                                int i61 = i519 % 2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                Object[] array = hashSet.toArray(new String[hashSet.size()]);
                int i62 = a;
                int i63 = (((i62 | 90) << 1) - (i62 ^ 90)) - 1;
                b = i63 % 128;
                if (i63 % 2 == 0) {
                    this.c = (String[]) array;
                    int i64 = 67 / 0;
                } else {
                    this.c = (String[]) array;
                }
                int i65 = a;
                int i66 = (i65 ^ 83) + ((i65 & 83) << 1);
                b = i66 % 128;
                int i67 = i66 % 2;
            }
            int i68 = b;
            int i69 = i68 & 9;
            int i70 = (i68 | 9) & (~i69);
            int i71 = -(-(i69 << 1));
            int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
            a = i72 % 128;
            if (i72 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a e(J j, o oVar) {
        List<Object> list;
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = (((i2 ^ 41) | i3) << 1) - ((i2 | 41) & (~i3));
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.f.add(j);
            list = this.f;
            int i5 = 60 / 0;
        } else {
            this.f.add(j);
            list = this.f;
        }
        list.add(oVar);
        boolean z2 = this.h;
        int i6 = b;
        int i7 = i6 ^ 77;
        int i8 = -(-((i6 & 77) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        int i10 = i9 % 128;
        a = i10;
        if (i9 % 2 != 0) {
            this.h = z2;
            boolean z3 = this.g;
            int i11 = (z3 ? 1 : 0) & 1;
            z = ((!z3 ? 1 : 0) | i11) & (~i11);
        } else {
            this.h = z2;
            z = this.g;
        }
        this.g = z;
        int i12 = i10 & 35;
        int i13 = -(-((i10 ^ 35) | i12));
        int i14 = (i12 & i13) + (i12 | i13);
        b = i14 % 128;
        int i15 = i14 % 2;
        return this;
    }

    public final void f(int i) {
        bEr[] berArr;
        int i2 = 2 % 2;
        bEr ber = new bEr(this.c, this.d, this.e, false, i, this.i, null, null);
        int i3 = b;
        int i4 = i3 & 109;
        int i5 = (((i3 ^ 109) | i4) << 1) - ((i3 | 109) & (~i4));
        a = i5 % 128;
        if (i5 % 2 != 0) {
            e(ber, ber);
            berArr = this.i;
            int i6 = 62 / 0;
        } else {
            e(ber, ber);
            berArr = this.i;
        }
        berArr[i] = ber;
        int i7 = b + 123;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public a g(String str) {
        Object obj;
        Object obj2;
        int i = 2 % 2;
        bEu beu = new bEu(str);
        List<Object> list = this.f;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = i2 | 99;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            list.size();
            throw null;
        }
        if (list.size() > 0) {
            List<Object> list2 = this.f;
            obj = list2.get((-2) - ((list2.size() - 1) ^ (-1)));
            int i6 = b + 49;
            a = i6 % 128;
            int i7 = i6 % 2;
            List<Object> list3 = this.f;
            int size = list3.size();
            obj2 = list3.get((size ^ (-1)) + (size << 1));
            int i8 = b;
            int i9 = (i8 & 119) + (i8 | 119);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            int i12 = i10 & 117;
            int i13 = ((i10 ^ 117) | i12) << 1;
            int i14 = -((i10 | 117) & (~i12));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = b;
            int i18 = ((i17 & 105) - (~(i17 | 105))) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
            obj = null;
            obj2 = null;
        }
        if (obj != null) {
            int i20 = a;
            int i21 = (i20 ^ 53) + ((i20 & 53) << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
            if (obj2 != null && obj == obj2) {
                int i22 = i20 ^ 123;
                int i23 = (((i20 & 123) | i22) << 1) - i22;
                b = i23 % 128;
                int i24 = i23 % 2;
                if (obj instanceof bEr) {
                    bEr ber = new bEr((bEr) obj, beu);
                    List<Object> list4 = this.f;
                    int i25 = b;
                    int i26 = i25 ^ 107;
                    int i27 = ((((i25 & 107) | i26) << 1) - (~(-i26))) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    int size2 = list4.size();
                    int i29 = size2 ^ (-2);
                    int i30 = (size2 & (-2)) << 1;
                    list4.set(((i29 | i30) << 1) - (i30 ^ i29), ber);
                    int i31 = a + 103;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    List<Object> list5 = this.f;
                    int size3 = list5.size();
                    list5.set((size3 ^ (-1)) + (size3 << 1), ber);
                    int i33 = b + 107;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    this.i[ber.h] = ber;
                    int i35 = a + 27;
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    return this;
                }
            }
        }
        throw new IllegalStateException("No field to apply suffix to");
    }

    public static class bEr implements J, o {
        private static int a = 0;
        private static int b = 1;
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;
        public final bEr[] g;
        public final int h;
        public final bEo i;
        public final bEo j;

        public bEr(int i, int i2, int i3, boolean z, int i4, bEr[] berArr, bEo beo, bEo beo2) {
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = z;
            this.h = i4;
            this.g = berArr;
            this.i = beo;
            this.j = null;
        }

        public bEr(bEr ber, bEo beo) {
            this.c = ber.c;
            this.d = ber.d;
            this.e = ber.e;
            this.f = ber.f;
            this.h = ber.h;
            this.g = ber.g;
            this.i = ber.i;
            bEo beo2 = ber.j;
            if (beo2 != null) {
                bEq beq = new bEq(beo2, beo);
                int i = a;
                int i2 = i | 99;
                int i3 = i2 << 1;
                int i4 = -((~(i & 99)) & i2);
                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                beo = beq;
            }
            this.j = beo;
            int i7 = a;
            int i8 = ((i7 ^ 1) | (i7 & 1)) << 1;
            int i9 = -(((~i7) & 1) | (i7 & (-2)));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    public static ivas.gov.bisp.enumeration.p003ac.e c(List<Object> list, boolean z, boolean z2) {
        int i;
        ivas.gov.bisp.enumeration.p003ac.e eVarC;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 103) + (i4 | 103);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (z) {
            int i6 = i4 & 61;
            int i7 = -(-(i4 | 61));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            if (z2) {
                throw new IllegalStateException("Builder has created neither a printer nor a parser");
            }
        }
        int size = list.size();
        if (size >= 2) {
            int i9 = (-2) - ((b + 96) ^ (-1));
            a = i9 % 128;
            if (i9 % 2 == 0 ? (list.get(0) instanceof bEt) : !(!(list.get(1) instanceof bEt))) {
                int i10 = b;
                int i11 = (-2) - (((i10 & 96) + (i10 | 96)) ^ (-1));
                a = i11 % 128;
                int i12 = i11 % 2;
                bEt bet = (bEt) list.get(0);
                int i13 = a;
                int i14 = (i13 ^ 9) + ((i13 & 9) << 1);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 32 / 0;
                    if (bet.f == null) {
                        i = b + 31;
                        a = i % 128;
                        if (i % 2 == 0) {
                            J j = bet.d;
                            obj.hashCode();
                            throw null;
                        }
                        if (bet.d == null) {
                            eVarC = c(list.subList(2, size), z, z2);
                            int i16 = b;
                            int i17 = i16 & 53;
                            i2 = (((i16 | 53) & (~i17)) - (~(i17 << 1))) - 1;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                Object obj2 = eVarC.d;
                                obj.hashCode();
                                throw null;
                            }
                            J j2 = (J) eVarC.c;
                            Object obj3 = eVarC.d;
                            int i18 = a;
                            int i19 = i18 & 71;
                            int i20 = (i18 | 71) & (~i19);
                            int i21 = -(-(i19 << 1));
                            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                            b = i22 % 128;
                            int i23 = i22 % 2;
                            bet.d = j2;
                            bet.f = (o) obj3;
                            ivas.gov.bisp.enumeration.p003ac.e eVar = new ivas.gov.bisp.enumeration.p003ac.e(bet, bet);
                            int i24 = b;
                            int i25 = (i24 ^ 113) + ((i24 & 113) << 1);
                            a = i25 % 128;
                            int i26 = i25 % 2;
                            return eVar;
                        }
                    }
                } else if (bet.f == null) {
                    i = b + 31;
                    a = i % 128;
                    if (i % 2 == 0) {
                        J j3 = bet.d;
                        obj.hashCode();
                        throw null;
                    }
                    if (bet.d == null) {
                        eVarC = c(list.subList(2, size), z, z2);
                        int i110 = b;
                        int i111 = i110 & 53;
                        i2 = (((i110 | 53) & (~i111)) - (~(i111 << 1))) - 1;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            Object obj4 = eVarC.d;
                            obj.hashCode();
                            throw null;
                        }
                        J j4 = (J) eVarC.c;
                        Object obj5 = eVarC.d;
                        int i112 = a;
                        int i113 = i112 & 71;
                        int i27 = (i112 | 71) & (~i113);
                        int i28 = -(-(i113 << 1));
                        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                        b = i29 % 128;
                        int i210 = i29 % 2;
                        bet.d = j4;
                        bet.f = (o) obj5;
                        ivas.gov.bisp.enumeration.p003ac.e eVar2 = new ivas.gov.bisp.enumeration.p003ac.e(bet, bet);
                        int i211 = b;
                        int i212 = (i211 ^ 113) + ((i211 & 113) << 1);
                        a = i212 % 128;
                        int i213 = i212 % 2;
                        return eVar2;
                    }
                }
            }
        }
        Object[] objArrD = d(list);
        if (z) {
            ivas.gov.bisp.enumeration.p003ac.e eVar3 = new ivas.gov.bisp.enumeration.p003ac.e((J) null, (o) objArrD[1]);
            int i30 = b;
            int i31 = ((i30 & (-42)) | ((~i30) & 41)) + ((i30 & 41) << 1);
            a = i31 % 128;
            if (i31 % 2 == 0) {
                return eVar3;
            }
            throw null;
        }
        if (z2) {
            ivas.gov.bisp.enumeration.p003ac.e eVar4 = new ivas.gov.bisp.enumeration.p003ac.e((J) objArrD[0], (o) null);
            int i32 = a;
            int i33 = ((i32 & 104) + (i32 | 104)) - 1;
            b = i33 % 128;
            if (i33 % 2 != 0) {
                return eVar4;
            }
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p003ac.e eVar5 = new ivas.gov.bisp.enumeration.p003ac.e((J) objArrD[0], (o) objArrD[1]);
        int i34 = a;
        int i35 = i34 ^ 115;
        int i36 = (i34 & 115) << 1;
        int i37 = (i35 & i36) + (i36 | i35);
        b = i37 % 128;
        int i38 = i37 % 2;
        return eVar5;
    }
}
