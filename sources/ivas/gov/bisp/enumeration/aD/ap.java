package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o00Ooo;
import ivas.gov.bisp.enumeration.o000O000.o00oOoo;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ap extends o00oOoo<o00Ooo.OooO00o<Object>, Object> {
    private static int a = 1;
    private static int b;

    public ap(int i) {
        super(i, null);
    }

    public void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = (i2 ^ 101) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (!this.h) {
            int i7 = a;
            int i8 = (i7 & (-124)) | ((~i7) & 123);
            int i9 = (i7 & 123) << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i7 & 103;
            int i13 = i12 + ((i7 ^ 103) | i12);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 / 2;
            }
            int i15 = 0;
            while (i15 < f()) {
                int i16 = a;
                int i17 = i16 & 121;
                int i18 = i17 + ((i16 ^ 121) | i17);
                b = i18 % 128;
                int i19 = i18 % 2;
                Map.Entry entryG = g(i15);
                C0056m.bkw bkwVar = (C0056m.bkw) entryG.getKey();
                int i20 = a;
                int i21 = (i20 & 13) + (i20 | 13);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    bkwVar.o();
                    obj.hashCode();
                    throw null;
                }
                if (!(!bkwVar.o())) {
                    int i22 = b;
                    int i23 = i22 & 31;
                    int i24 = (((i22 ^ 31) | i23) << 1) - ((i22 | 31) & (~i23));
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    List listUnmodifiableList = Collections.unmodifiableList((List) entryG.getValue());
                    int i26 = b;
                    int i27 = i26 & 39;
                    int i28 = ((i26 ^ 39) | i27) << 1;
                    int i29 = -((i26 | 39) & (~i27));
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    entryG.setValue(listUnmodifiableList);
                    int i32 = a;
                    int i33 = i32 ^ 3;
                    int i34 = ((i32 & 3) | i33) << 1;
                    int i35 = -i33;
                    int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                    b = i36 % 128;
                    int i37 = i36 % 2;
                }
                int i38 = i15 + 2;
                i15 = (i38 << 1) + (i38 ^ (-1));
                int i39 = b;
                int i40 = i39 & 25;
                int i41 = (i39 | 25) & (~i40);
                int i42 = -(-(i40 << 1));
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                a = i43 % 128;
                int i44 = i43 % 2;
            }
            Iterator it = h().iterator();
            int i45 = a;
            int i46 = ((i45 | 101) << 1) - ((101 & (~i45)) | (i45 & (-102)));
            b = i46 % 128;
            if (i46 % 2 != 0) {
                int i47 = 2 % 4;
            }
            while (!(!it.hasNext())) {
                int i48 = b;
                int i49 = ((i48 ^ 67) | (i48 & 67)) << 1;
                int i50 = -(((~i48) & 67) | (i48 & (-68)));
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                a = i51 % 128;
                if (i51 % 2 == 0) {
                    ((Map.Entry) it.next()).getKey();
                    obj.hashCode();
                    throw null;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                int i52 = a;
                int i53 = i52 & 73;
                int i54 = i52 | 73;
                int i55 = (i53 & i54) + (i54 | i53);
                b = i55 % 128;
                if (i55 % 2 != 0) {
                    ((C0056m.bkw) key).o();
                    obj.hashCode();
                    throw null;
                }
                if (((C0056m.bkw) key).o()) {
                    int i56 = a;
                    int i57 = (i56 ^ 81) + ((i56 & 81) << 1);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    List listUnmodifiableList2 = Collections.unmodifiableList((List) entry.getValue());
                    int i59 = b;
                    int i60 = (((i59 | 66) << 1) - (i59 ^ 66)) - 1;
                    a = i60 % 128;
                    int i61 = i60 % 2;
                    entry.setValue(listUnmodifiableList2);
                    int i62 = b;
                    int i63 = i62 & 103;
                    int i64 = (i62 | 103) & (~i63);
                    int i65 = -(-(i63 << 1));
                    int i66 = (i64 & i65) + (i64 | i65);
                    a = i66 % 128;
                    int i67 = i66 % 2;
                }
            }
        }
        super.c();
        int i68 = b;
        int i69 = (i68 & (-66)) | ((~i68) & 65);
        int i70 = -(-((i68 & 65) << 1));
        int i71 = (i69 & i70) + (i70 | i69);
        a = i71 % 128;
        if (i71 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
