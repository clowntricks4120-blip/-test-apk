package ivas.gov.bisp.enumeration.I;

import android.content.Context;
import android.content.Intent;
import ivas.gov.bisp.enumeration.OooO0o0.OooO0o;
import ivas.gov.bisp.enumeration.p086i.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends OooO0o<String[], Map<String, Boolean>> {
    private static int a = 0;
    private static int b = 1;

    public final Intent c(Context context, Object obj) {
        int i = 2 % 2;
        Intent intent = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS");
        int i2 = a;
        int i3 = (i2 & (-42)) | ((~i2) & 41);
        int i4 = (i2 & 41) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Intent intentPutExtra = intent.putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
        int i7 = b;
        int i8 = i7 & 45;
        int i9 = ((i7 ^ 45) | i8) << 1;
        int i10 = -((i7 | 45) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return intentPutExtra;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x011e  */
    public final r.aQb d(Context context, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = a + 109;
        int i4 = i3 % 128;
        b = i4;
        r.aQb aqb = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String[] strArr = (String[]) obj;
        if (strArr != null) {
            int i5 = (((i4 | 56) << 1) - (i4 ^ 56)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            if (strArr.length != 0) {
                ivas.gov.bisp.enumeration.p001aa.r rVar = new ivas.gov.bisp.enumeration.p001aa.r();
                int length = strArr.length;
                int i7 = b;
                int i8 = (i7 ^ 111) + ((i7 & 111) << 1);
                a = i8 % 128;
                boolean z2 = i8 % 2 == 0;
                int i9 = i7 + 31;
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = b;
                    int i13 = (i12 & 59) + (i12 | 59);
                    a = i13 % 128;
                    if (i13 % 2 != 0) {
                        l.b(context, strArr[i11]);
                        throw null;
                    }
                    String str = strArr[i11];
                    if (l.b(context, str) == 0) {
                        int i14 = b;
                        int i15 = i14 & 65;
                        int i16 = (((i14 ^ 65) | i15) << 1) - ((~i15) & (i14 | 65));
                        a = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = i14 + 23;
                        a = i18 % 128;
                        int i19 = i18 % 2;
                        z = true;
                    } else {
                        int i20 = b;
                        int i21 = (((i20 ^ 65) | (i20 & 65)) << 1) - (((~i20) & 65) | (i20 & (-66)));
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        z = false;
                    }
                    rVar.put(str, Boolean.valueOf(z));
                    if (!z) {
                        int i23 = a;
                        int i24 = (((i23 | 20) << 1) - (i23 ^ 20)) - 1;
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        int i26 = (((i23 | 28) << 1) - (i23 ^ 28)) - 1;
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        z2 = false;
                    }
                    int i28 = i11 | (-51);
                    int i29 = (i28 << 1) - ((~(i11 & (-51))) & i28);
                    int i30 = i29 ^ 52;
                    int i31 = -(-((i29 & 52) << 1));
                    i11 = ((i30 & i31) << 1) + (i30 ^ i31);
                    int i32 = a;
                    int i33 = i32 & 103;
                    int i34 = ((i32 ^ 103) | i33) << 1;
                    int i35 = -((i32 | 103) & (~i33));
                    int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                    b = i36 % 128;
                    int i37 = i36 % 2;
                }
                if (z2) {
                    aqb = new r.aQb(rVar);
                    int i38 = b;
                    int i39 = ((((i38 ^ 81) | (i38 & 81)) << 1) - (~(-(((~i38) & 81) | (i38 & (-82)))))) - 1;
                    a = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    int i41 = b;
                    int i42 = i41 & 71;
                    int i43 = ((i41 ^ 71) | i42) << 1;
                    int i44 = -((i41 | 71) & (~i42));
                    i = (i43 ^ i44) + ((i44 & i43) << 1);
                    a = i % 128;
                }
            } else {
                aqb = new r.aQb(Collections.emptyMap());
                int i45 = a;
                int i46 = (i45 & (-68)) | ((~i45) & 67);
                int i47 = (i45 & 67) << 1;
                i = (i46 ^ i47) + ((i47 & i46) << 1);
                b = i % 128;
            }
            int i48 = i % 2;
        } else {
            aqb = new r.aQb(Collections.emptyMap());
            int i49 = a;
            int i410 = (i49 & (-68)) | ((~i49) & 67);
            int i411 = (i49 & 67) << 1;
            i = (i410 ^ i411) + ((i411 & i410) << 1);
            b = i % 128;
            int i412 = i % 2;
        }
        int i50 = a;
        int i51 = i50 & 51;
        int i52 = (i50 | 51) & (~i51);
        int i53 = -(-(i51 << 1));
        int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
        b = i54 % 128;
        int i55 = i54 % 2;
        return aqb;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0102  */
    /* JADX WARN: Code duplicated, block: B:30:0x011f  */
    public final Object e(int i, Intent intent) {
        Map mapEmptyMap;
        int i2;
        Object obj;
        boolean z;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 67) + (i4 | 67);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj2 = null;
        if (i == -1) {
            int i7 = ((i4 ^ 87) | (i4 & 87)) << 1;
            int i8 = -(((~i4) & 87) | (i4 & (-88)));
            int i9 = (i7 & i8) + (i7 | i8);
            int i10 = i9 % 128;
            a = i10;
            if (i9 % 2 != 0) {
                throw null;
            }
            if (intent != null) {
                int i11 = (i10 & (-80)) | ((~i10) & 79);
                int i12 = (i10 & 79) << 1;
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    obj2.hashCode();
                    throw null;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra != null) {
                    int i14 = a;
                    int i15 = i14 & 107;
                    int i16 = (i15 - (~((i14 ^ 107) | i15))) - 1;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    if (stringArrayExtra != null) {
                        HashMap map = new HashMap();
                        int length = stringArrayExtra.length;
                        int i18 = b;
                        int i19 = i18 & 107;
                        int i20 = (((i18 | 107) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
                        a = i20 % 128;
                        int i21 = i20 % 2;
                        int i22 = 0;
                        while (i22 < length) {
                            int i23 = b;
                            int i24 = i23 ^ 33;
                            int i25 = ((i23 & 33) | i24) << 1;
                            int i26 = -i24;
                            int i27 = (i25 & i26) + (i26 | i25);
                            int i28 = i27 % 128;
                            a = i28;
                            if (i27 % 2 != 0) {
                                String str = stringArrayExtra[i22];
                                int i29 = intArrayExtra[i22];
                                obj2.hashCode();
                                throw null;
                            }
                            String str2 = stringArrayExtra[i22];
                            if (intArrayExtra[i22] == 0) {
                                int i30 = i23 & 29;
                                int i31 = i30 + ((i23 ^ 29) | i30);
                                a = i31 % 128;
                                int i32 = i31 % 2;
                                z = true;
                            } else {
                                int i33 = ((((i28 ^ 87) | (i28 & 87)) << 1) - (~(-(((~i28) & 87) | (i28 & (-88)))))) - 1;
                                b = i33 % 128;
                                int i34 = i33 % 2;
                                z = false;
                            }
                            map.put(str2, Boolean.valueOf(z));
                            int i35 = b + 25;
                            int i36 = i35 % 128;
                            a = i36;
                            int i37 = i35 % 2;
                            i22 = ((i22 | 1) << 1) - (((~i22) & 1) | (i22 & (-2)));
                            int i38 = i36 & 99;
                            int i39 = (i36 ^ 99) | i38;
                            int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                            b = i40 % 128;
                            int i41 = i40 % 2;
                        }
                        int i42 = b;
                        int i43 = (i42 & 71) + (i42 | 71);
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        obj = map;
                    } else {
                        mapEmptyMap = Collections.emptyMap();
                        int i45 = a;
                        int i46 = i45 & 49;
                        int i47 = ((i45 ^ 49) | i46) << 1;
                        int i48 = -((i45 | 49) & (~i46));
                        i2 = (i47 ^ i48) + ((i48 & i47) << 1);
                        b = i2 % 128;
                        obj = mapEmptyMap;
                        if (i2 % 2 == 0) {
                            int i49 = 4 / 3;
                            obj = mapEmptyMap;
                        }
                    }
                } else {
                    mapEmptyMap = Collections.emptyMap();
                    int i410 = a;
                    int i411 = i410 & 49;
                    int i412 = ((i410 ^ 49) | i411) << 1;
                    int i413 = -((i410 | 49) & (~i411));
                    i2 = (i412 ^ i413) + ((i413 & i412) << 1);
                    b = i2 % 128;
                    obj = mapEmptyMap;
                    if (i2 % 2 == 0) {
                        int i414 = 4 / 3;
                        obj = mapEmptyMap;
                    }
                }
            } else {
                mapEmptyMap = Collections.emptyMap();
                int i415 = a;
                int i416 = i415 & 49;
                int i417 = ((i415 ^ 49) | i416) << 1;
                int i418 = -((i415 | 49) & (~i416));
                i2 = (i417 ^ i418) + ((i418 & i417) << 1);
                b = i2 % 128;
                obj = mapEmptyMap;
                if (i2 % 2 == 0) {
                    int i419 = 4 / 3;
                    obj = mapEmptyMap;
                }
            }
        } else {
            mapEmptyMap = Collections.emptyMap();
            int i4110 = a;
            int i4111 = i4110 & 49;
            int i4112 = ((i4110 ^ 49) | i4111) << 1;
            int i4113 = -((i4110 | 49) & (~i4111));
            i2 = (i4112 ^ i4113) + ((i4113 & i4112) << 1);
            b = i2 % 128;
            obj = mapEmptyMap;
            if (i2 % 2 == 0) {
                int i4114 = 4 / 3;
                obj = mapEmptyMap;
            }
        }
        int i50 = a + 93;
        b = i50 % 128;
        if (i50 % 2 != 0) {
            return obj;
        }
        obj2.hashCode();
        throw null;
    }
}
