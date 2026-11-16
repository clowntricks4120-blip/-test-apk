package ivas.gov.bisp.enumeration.p022av;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.av.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0095o {
    private static int a = 1;
    private static int b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;
    public final List<C0097t> f;
    public final boolean g;

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    public C0095o(int i, byte[] bArr, Map<String, String> map, List<C0097t> list, boolean z, long j) {
        int i2;
        this.c = i;
        this.d = bArr;
        this.e = map;
        if (list == null) {
            this.f = null;
            int i3 = b;
            int i4 = i3 & 17;
            int i5 = -(-((i3 ^ 17) | i4));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
            }
            this.g = z;
            int i7 = b;
            int i8 = (i7 | 95) << 1;
            int i9 = -(((~i7) & 95) | (i7 & (-96)));
            i2 = (i8 & i9) + (i9 | i8);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i10 = 40 / 0;
            }
        }
        this.f = Collections.unmodifiableList(list);
        int i11 = a;
        int i12 = ((i11 & 106) + (i11 | 106)) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 2 % 2;
        this.g = z;
        int i15 = b;
        int i16 = (i15 | 95) << 1;
        int i17 = -(((~i15) & 95) | (i15 & (-96)));
        i2 = (i16 & i17) + (i17 | i16);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            int i18 = 40 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0095o(int i, byte[] bArr, boolean z, long j, List<C0097t> list) {
        C0097t next;
        Map mapEmptyMap = null;
        if (list != null) {
            if (list.isEmpty()) {
                int i2 = b;
                int i3 = (i2 | 87) << 1;
                int i4 = -(((~i2) & 87) | (i2 & (-88)));
                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    Collections.emptyMap();
                    mapEmptyMap.hashCode();
                    throw null;
                }
                mapEmptyMap = Collections.emptyMap();
                int i6 = 2 % 2;
            } else {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                int i7 = a;
                int i8 = ((i7 & 76) + (i7 | 76)) - 1;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    list.iterator();
                    mapEmptyMap.hashCode();
                    throw null;
                }
                Iterator<C0097t> it = list.iterator();
                int i9 = 2 % 2;
                while (it.hasNext()) {
                    int i10 = a;
                    int i11 = i10 & 19;
                    int i12 = (i10 ^ 19) | i11;
                    int i13 = (i11 & i12) + (i12 | i11);
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        next = it.next();
                        int i14 = 38 / 0;
                    } else {
                        next = it.next();
                    }
                    String str = next.c;
                    String str2 = next.d;
                    int i15 = b;
                    int i16 = i15 & 111;
                    int i17 = (i15 | 111) & (~i16);
                    int i18 = -(-(i16 << 1));
                    int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    treeMap.put(str, str2);
                    int i21 = b;
                    int i22 = i21 & 49;
                    int i23 = ((i21 | 49) & (~i22)) + (i22 << 1);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                }
                mapEmptyMap = treeMap;
            }
            this(i, bArr, mapEmptyMap, list, z, j);
        }
        int i25 = b;
        int i26 = (i25 & 36) + (i25 | 36);
        int i27 = (i26 ^ (-1)) + (i26 << 1);
        int i28 = i27 % 128;
        a = i28;
        int i29 = i27 % 2;
        int i30 = (i28 ^ 11) + ((i28 & 11) << 1);
        b = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 2 % 2;
        }
        int i32 = a;
        int i33 = i32 & 35;
        int i34 = (i32 ^ 35) | i33;
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        b = i35 % 128;
        int i36 = i35 % 2;
        int i37 = 2 % 2;
        this(i, bArr, mapEmptyMap, list, z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public C0095o(byte[] bArr, Map<String, String> map) {
        List listEmptyList = null;
        if (map != null) {
            if (map.isEmpty()) {
                int i = b + 10;
                int i2 = (i ^ (-1)) + (i << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    Collections.emptyList();
                    listEmptyList.hashCode();
                    throw null;
                }
                listEmptyList = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                int i3 = a;
                int i4 = i3 & 1;
                int i5 = ((i3 ^ 1) | i4) << 1;
                int i6 = -((i3 | 1) & (~i4));
                int i7 = (i5 & i6) + (i6 | i5);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    map.entrySet().iterator();
                    listEmptyList.hashCode();
                    throw null;
                }
                int i8 = a;
                int i9 = i8 & 43;
                int i10 = ((i8 | 43) & (~i9)) + (i9 << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C0097t c0097t = new C0097t(entry.getKey(), entry.getValue());
                    int i13 = b;
                    int i14 = i13 & 35;
                    int i15 = i14 + ((i13 ^ 35) | i14);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(c0097t);
                    int i17 = a;
                    int i18 = ((i17 | 37) << 1) - (i17 ^ 37);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
                listEmptyList = arrayList;
            }
            int i20 = 2 % 2;
            this(200, bArr, map, listEmptyList, false, 0L);
        }
        int i21 = a;
        int i22 = (((i21 | 77) << 1) - (~(-(((~i21) & 77) | (i21 & (-78)))))) - 1;
        int i23 = i22 % 128;
        b = i23;
        if (i22 % 2 != 0) {
            listEmptyList.hashCode();
            throw null;
        }
        int i24 = (((i23 | 27) << 1) - (~(-(((~i23) & 27) | (i23 & (-28)))))) - 1;
        a = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 2 % 2;
        }
        int i26 = b;
        int i27 = (i26 ^ 99) + ((i26 & 99) << 1);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 4 / 4;
        } else {
            int i29 = 2 % 2;
        }
        this(200, bArr, map, listEmptyList, false, 0L);
    }
}
