package ivas.gov.bisp.enumeration.p027b;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.b;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ak {
    private static int a = 0;
    private static int b = 1;
    public static final Class[] c;
    public final Map<String, Object> d;
    public final Map<String, b.aIh> e;
    public final Map<String, Object> f;
    public final b.aIh g;

    static {
        char c2;
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        int i = b + 49;
        a = i % 128;
        if (i % 2 != 0) {
            clsArr[2] = double[].class;
            clsArr[3] = Integer.TYPE;
            clsArr[3] = int[].class;
            clsArr[32] = Long.TYPE;
            c2 = 'h';
        } else {
            clsArr[3] = double[].class;
            clsArr[4] = Integer.TYPE;
            clsArr[5] = int[].class;
            clsArr[6] = Long.TYPE;
            c2 = 7;
        }
        clsArr[c2] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        int i2 = b;
        int i3 = ((i2 & 72) + (i2 | 72)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        int i5 = a;
        int i6 = ((((i5 ^ 117) | (i5 & 117)) << 1) - (~(-((i5 & (-118)) | ((~i5) & 117))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        int i8 = (((i5 & (-108)) | ((~i5) & 107)) - (~((i5 & 107) << 1))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        int i10 = b + 105;
        a = i10 % 128;
        int i11 = i10 % 2;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        int i12 = a;
        int i13 = (-2) - ((((i12 | 70) << 1) - (i12 ^ 70)) ^ (-1));
        b = i13 % 128;
        int i14 = i13 % 2;
        clsArr[26] = SparseArray.class;
        clsArr[27] = Size.class;
        clsArr[28] = SizeF.class;
        c = clsArr;
        int i15 = i12 + 121;
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public ak(Map<String, Object> map) {
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new aZn();
        this.d = new HashMap(map);
    }

    public class aZn implements b.aIh {
        private static int a = 0;
        private static int b = 1;

        public aZn() {
        }

        @Override // androidx.savedstate.b.aIh
        public Bundle b() {
            Bundle bundleB;
            ak akVar;
            String str;
            ah ahVar;
            int i = 2 % 2;
            Set setEntrySet = new HashMap(ak.this.e).entrySet();
            int i2 = b;
            int i3 = i2 & 17;
            int i4 = -(-((i2 ^ 17) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            Iterator it = setEntrySet.iterator();
            int i7 = a;
            int i8 = i7 & 113;
            int i9 = i7 | 113;
            while (true) {
                int i10 = i8 + i9;
                b = i10 % 128;
                int i11 = i10 % 2;
                while (true) {
                    Object obj = null;
                    if (!it.hasNext()) {
                        Set<String> setKeySet = ak.this.d.keySet();
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(setKeySet.size());
                        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
                        int i12 = b;
                        int i13 = ((i12 & 84) + (i12 | 84)) - 1;
                        a = i13 % 128;
                        int i14 = i13 % 2;
                        Iterator<String> it2 = setKeySet.iterator();
                        int i15 = b + 85;
                        a = i15 % 128;
                        int i16 = i15 % 2;
                        while (it2.hasNext()) {
                            int i17 = b;
                            int i18 = i17 & 49;
                            int i19 = -(-(i17 | 49));
                            int i20 = (i18 & i19) + (i19 | i18);
                            a = i20 % 128;
                            if (i20 % 2 != 0) {
                                it2.next();
                                throw null;
                            }
                            String next = it2.next();
                            arrayList.add(next);
                            Map<String, Object> map = ak.this.d;
                            int i21 = b;
                            int i22 = i21 ^ 79;
                            int i23 = ((i21 & 79) | i22) << 1;
                            int i24 = -i22;
                            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                            a = i25 % 128;
                            if (i25 % 2 != 0) {
                                arrayList2.add(map.get(next));
                                int i26 = 11 / 0;
                            } else {
                                arrayList2.add(map.get(next));
                            }
                            int i27 = a;
                            int i28 = i27 ^ 47;
                            int i29 = -(-((i27 & 47) << 1));
                            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                            b = i30 % 128;
                            int i31 = i30 % 2;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("keys", arrayList);
                        int i32 = a + 1;
                        b = i32 % 128;
                        if (i32 % 2 == 0) {
                            bundle.putParcelableArrayList("values", arrayList2);
                            int i33 = 23 / 0;
                        } else {
                            bundle.putParcelableArrayList("values", arrayList2);
                        }
                        return bundle;
                    }
                    int i34 = a;
                    int i35 = i34 ^ 55;
                    int i36 = -(-((i34 & 55) << 1));
                    int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                    b = i37 % 128;
                    int i38 = i37 % 2;
                    Map.Entry entry = (Map.Entry) it.next();
                    Object value = entry.getValue();
                    int i39 = a;
                    int i40 = i39 & 77;
                    int i41 = i39 | 77;
                    int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                    b = i42 % 128;
                    if (i42 % 2 == 0) {
                        ((b.aIh) value).b();
                        obj.hashCode();
                        throw null;
                    }
                    bundleB = ((b.aIh) value).b();
                    akVar = ak.this;
                    str = (String) entry.getKey();
                    int i43 = b;
                    int i44 = i43 ^ 67;
                    int i45 = ((((i43 & 67) | i44) << 1) - (~(-i44))) - 1;
                    a = i45 % 128;
                    if (i45 % 2 != 0) {
                        Objects.requireNonNull(akVar);
                        obj.hashCode();
                        throw null;
                    }
                    Objects.requireNonNull(akVar);
                    if (bundleB != null) {
                        int i46 = b;
                        int i47 = i46 ^ 117;
                        int i48 = -(-((i46 & 117) << 1));
                        int i49 = (i47 & i48) + (i48 | i47);
                        a = i49 % 128;
                        int i50 = i49 % 2;
                        Class[] clsArr = ak.c;
                        int length = clsArr.length;
                        int i51 = a;
                        int i52 = (((i51 & (-62)) | ((~i51) & 61)) - (~(-(-((i51 & 61) << 1))))) - 1;
                        b = i52 % 128;
                        int i53 = i52 % 2;
                        int i54 = 0;
                        while (true) {
                            if (i54 >= length) {
                                StringBuilder sbW = j.w("Can't put value with type ");
                                sbW.append(bundleB.getClass());
                                sbW.append(" into saved state");
                                throw new IllegalArgumentException(sbW.toString());
                            }
                            int i55 = a;
                            int i56 = ((i55 & 116) + (i55 | 116)) - 1;
                            b = i56 % 128;
                            if (i56 % 2 == 0) {
                                int i57 = 75 / 0;
                                if (clsArr[i54].isInstance(bundleB)) {
                                    break;
                                }
                                int i58 = i54 | 1;
                                i54 = (i58 << 1) - ((~(i54 & 1)) & i58);
                                int i59 = b;
                                int i60 = i59 & 85;
                                int i61 = ((i59 ^ 85) | i60) << 1;
                                int i62 = -((i59 | 85) & (~i60));
                                int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                                a = i63 % 128;
                                int i64 = i63 % 2;
                            } else {
                                if (clsArr[i54].isInstance(bundleB)) {
                                    break;
                                }
                                int i510 = i54 | 1;
                                i54 = (i510 << 1) - ((~(i54 & 1)) & i510);
                                int i511 = b;
                                int i65 = i511 & 85;
                                int i66 = ((i511 ^ 85) | i65) << 1;
                                int i67 = -((i511 | 85) & (~i65));
                                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                                a = i68 % 128;
                                int i69 = i68 % 2;
                            }
                        }
                    }
                    Object obj2 = akVar.f.get(str);
                    int i70 = b;
                    int i71 = ((i70 & 124) + (i70 | 124)) - 1;
                    a = i71 % 128;
                    if (i71 % 2 == 0) {
                        ahVar = (ah) obj2;
                        if (ahVar == null) {
                            break;
                        }
                        ahVar.j(bundleB);
                        int i72 = a;
                        int i73 = i72 & 79;
                        int i74 = (((i72 | 79) & (~i73)) - (~(-(-(i73 << 1))))) - 1;
                        b = i74 % 128;
                        int i75 = i74 % 2;
                    } else {
                        ahVar = (ah) obj2;
                        int i76 = 62 / 0;
                        if (ahVar == null) {
                            break;
                        }
                        ahVar.j(bundleB);
                        int i77 = a;
                        int i78 = i77 & 79;
                        int i79 = (((i77 | 79) & (~i78)) - (~(-(-(i78 << 1))))) - 1;
                        b = i79 % 128;
                        int i710 = i79 % 2;
                    }
                }
                akVar.d.put(str, bundleB);
                int i80 = a;
                i8 = i80 ^ 91;
                i9 = (i80 & 91) << 1;
            }
        }
    }

    public ak() {
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new aZn();
        this.d = new HashMap();
    }
}
