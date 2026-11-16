package ivas.gov.bisp.enumeration.bI;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bI.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0123q implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity c;

    public C0123q(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00df  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:26:0x0108  */
    /* JADX WARN: Code duplicated, block: B:28:0x011b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0123  */
    /* JADX WARN: Code duplicated, block: B:33:0x0127  */
    /* JADX WARN: Code duplicated, block: B:39:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x017a  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x003b A[DONT_INVERT, PHI: r12
  0x003b: PHI (r12v2 int) = (r12v1 int), (r12v62 int) binds: [B:8:0x0039, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        Object obj;
        int i2;
        int i3;
        int i4;
        OfflineRosterActivity offlineRosterActivity;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = a;
        int i9 = (i8 ^ 50) + ((i8 & 50) << 1);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        OfflineRosterActivity offlineRosterActivity2 = this.c;
        offlineRosterActivity2.bu = arrayList;
        BISPApplication bISPApplication = offlineRosterActivity2.bv;
        int i12 = b;
        int i13 = ((i12 & 40) + (i12 | 40)) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            bISPApplication.V = arrayList;
            i = offlineRosterActivity2.ac;
            if (i != 1) {
                if (i != 2) {
                    int i14 = b;
                    int i15 = ((i14 ^ 29) | (i14 & 29)) << 1;
                    int i16 = -(((~i14) & 29) | (i14 & (-30)));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    if (ag.d) {
                    }
                }
            }
            obj = null;
            if (ag.g) {
                i3 = 0;
                while (i3 < this.c.bu.size()) {
                    i4 = (-2) - ((b + 84) ^ (-1));
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        this.c.bu.get(i3);
                        obj.hashCode();
                        throw null;
                    }
                    if (this.c.bu.get(i3).getOptionId() == 186) {
                        int i19 = b;
                        int i20 = ((i19 ^ 15) - (~(-(-((i19 & 15) << 1))))) - 1;
                        a = i20 % 128;
                        int i21 = i20 % 2;
                        offlineRosterActivity = this.c;
                        if (!offlineRosterActivity.bc) {
                            offlineRosterActivity.bu.remove(i3);
                            int i22 = b;
                            i5 = ((i22 & 38) + (i22 | 38)) - 1;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        int i23 = a;
                        int i24 = i23 & 83;
                        int i25 = (i23 ^ 83) | i24;
                        i6 = (i24 & i25) + (i25 | i24);
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i26 = 71 / 0;
                            if (offlineRosterActivity.aM != -1) {
                                int i27 = a + 57;
                                b = i27 % 128;
                                int i28 = i27 % 2;
                                if (offlineRosterActivity.aN.relation_to_household_id != 186) {
                                    int i29 = b;
                                    int i30 = i29 & 25;
                                    int i31 = (i29 | 25) & (~i30);
                                    int i32 = -(-(i30 << 1));
                                    int i33 = (i31 & i32) + (i31 | i32);
                                    a = i33 % 128;
                                    int i34 = i33 % 2;
                                    offlineRosterActivity.bu.remove(i3);
                                    int i35 = a;
                                    int i36 = (i35 & (-30)) | ((~i35) & 29);
                                    int i37 = -(-((i35 & 29) << 1));
                                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                                    b = i38 % 128;
                                    int i39 = i38 % 2;
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else if (offlineRosterActivity.aM != -1) {
                            int i210 = a + 57;
                            b = i210 % 128;
                            int i211 = i210 % 2;
                            if (offlineRosterActivity.aN.relation_to_household_id != 186) {
                                int i212 = b;
                                int i310 = i212 & 25;
                                int i311 = (i212 | 25) & (~i310);
                                int i312 = -(-(i310 << 1));
                                int i313 = (i311 & i312) + (i311 | i312);
                                a = i313 % 128;
                                int i314 = i313 % 2;
                                offlineRosterActivity.bu.remove(i3);
                                int i315 = a;
                                int i316 = (i315 & (-30)) | ((~i315) & 29);
                                int i317 = -(-((i315 & 29) << 1));
                                int i318 = (i316 ^ i317) + ((i317 & i316) << 1);
                                b = i318 % 128;
                                int i319 = i318 % 2;
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                    int i40 = i3 & 118;
                    int i41 = (i3 | 118) & (~i40);
                    int i42 = i40 << 1;
                    int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                    i3 = (((i43 & 116) | ((~i43) & (-117))) - (~(-(-((i43 & (-117)) << 1))))) - 1;
                    int i44 = a;
                    int i45 = ((i44 & (-10)) | ((~i44) & 9)) + ((i44 & 9) << 1);
                    b = i45 % 128;
                    int i46 = i45 % 2;
                }
            }
            int i47 = b;
            int i48 = i47 & 83;
            int i49 = (i47 ^ 83) | i48;
            i2 = (i48 & i49) + (i49 | i48);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        bISPApplication.V = arrayList;
        i = offlineRosterActivity2.ac;
        if (i != 1) {
            if (i != 2) {
                int i110 = b;
                int i111 = ((i110 ^ 29) | (i110 & 29)) << 1;
                int i112 = -(((~i110) & 29) | (i110 & (-30)));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                a = i113 % 128;
                int i114 = i113 % 2;
                if (ag.d) {
                }
            }
        }
        obj = null;
        if (ag.g) {
            i3 = 0;
            while (i3 < this.c.bu.size()) {
                i4 = (-2) - ((b + 84) ^ (-1));
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    this.c.bu.get(i3);
                    obj.hashCode();
                    throw null;
                }
                if (this.c.bu.get(i3).getOptionId() == 186) {
                    int i115 = b;
                    int i213 = ((i115 ^ 15) - (~(-(-((i115 & 15) << 1))))) - 1;
                    a = i213 % 128;
                    int i214 = i213 % 2;
                    offlineRosterActivity = this.c;
                    if (!offlineRosterActivity.bc) {
                        offlineRosterActivity.bu.remove(i3);
                        int i215 = b;
                        i5 = ((i215 & 38) + (i215 | 38)) - 1;
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    int i216 = a;
                    int i217 = i216 & 83;
                    int i218 = (i216 ^ 83) | i217;
                    i6 = (i217 & i218) + (i218 | i217);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i219 = 71 / 0;
                        if (offlineRosterActivity.aM != -1) {
                            int i2110 = a + 57;
                            b = i2110 % 128;
                            int i2111 = i2110 % 2;
                            if (offlineRosterActivity.aN.relation_to_household_id != 186) {
                                int i2112 = b;
                                int i3110 = i2112 & 25;
                                int i3111 = (i2112 | 25) & (~i3110);
                                int i3112 = -(-(i3110 << 1));
                                int i3113 = (i3111 & i3112) + (i3111 | i3112);
                                a = i3113 % 128;
                                int i3114 = i3113 % 2;
                                offlineRosterActivity.bu.remove(i3);
                                int i3115 = a;
                                int i3116 = (i3115 & (-30)) | ((~i3115) & 29);
                                int i3117 = -(-((i3115 & 29) << 1));
                                int i3118 = (i3116 ^ i3117) + ((i3117 & i3116) << 1);
                                b = i3118 % 128;
                                int i3119 = i3118 % 2;
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (offlineRosterActivity.aM != -1) {
                        int i2113 = a + 57;
                        b = i2113 % 128;
                        int i2114 = i2113 % 2;
                        if (offlineRosterActivity.aN.relation_to_household_id != 186) {
                            int i2115 = b;
                            int i31110 = i2115 & 25;
                            int i31111 = (i2115 | 25) & (~i31110);
                            int i31112 = -(-(i31110 << 1));
                            int i31113 = (i31111 & i31112) + (i31111 | i31112);
                            a = i31113 % 128;
                            int i31114 = i31113 % 2;
                            offlineRosterActivity.bu.remove(i3);
                            int i31115 = a;
                            int i31116 = (i31115 & (-30)) | ((~i31115) & 29);
                            int i31117 = -(-((i31115 & 29) << 1));
                            int i31118 = (i31116 ^ i31117) + ((i31117 & i31116) << 1);
                            b = i31118 % 128;
                            int i31119 = i31118 % 2;
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                int i410 = i3 & 118;
                int i411 = (i3 | 118) & (~i410);
                int i412 = i410 << 1;
                int i413 = ((i411 | i412) << 1) - (i411 ^ i412);
                i3 = (((i413 & 116) | ((~i413) & (-117))) - (~(-(-((i413 & (-117)) << 1))))) - 1;
                int i414 = a;
                int i415 = ((i414 & (-10)) | ((~i414) & 9)) + ((i414 & 9) << 1);
                b = i415 % 128;
                int i416 = i415 % 2;
            }
        }
        int i417 = b;
        int i418 = i417 & 83;
        int i419 = (i417 ^ 83) | i418;
        i2 = (i418 & i419) + (i419 | i418);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
        if (!ag.g) {
            int i50 = a;
            int i51 = (-2) - (((i50 ^ 48) + ((i50 & 48) << 1)) ^ (-1));
            b = i51 % 128;
            int i52 = i51 % 2;
            offlineRosterActivity2.et_MemberName.setText(ag.i);
            Spinner spinner = this.c.sp_relation_to_household;
            int i53 = a;
            int i54 = i53 & 19;
            int i55 = (i54 - (~(-(-((i53 ^ 19) | i54))))) - 1;
            b = i55 % 128;
            int i56 = i55 % 2;
            spinner.setSelection(1);
            this.c.linearLayoutCNIC.setVisibility(0);
            int i57 = a + 45;
            b = i57 % 128;
            int i58 = i57 % 2;
            this.c.et_MemberName.setEnabled(true);
            Spinner spinner2 = this.c.sp_relation_to_household;
            int i59 = a;
            int i60 = (i59 ^ 97) + ((i59 & 97) << 1);
            b = i60 % 128;
            int i61 = i60 % 2;
            spinner2.setEnabled(false);
            int i62 = a + 91;
            b = i62 % 128;
            int i63 = i62 % 2;
        }
        obj = null;
        if (ag.g) {
            i3 = 0;
            while (i3 < this.c.bu.size()) {
                i4 = (-2) - ((b + 84) ^ (-1));
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    this.c.bu.get(i3);
                    obj.hashCode();
                    throw null;
                }
                if (this.c.bu.get(i3).getOptionId() == 186) {
                    int i116 = b;
                    int i2116 = ((i116 ^ 15) - (~(-(-((i116 & 15) << 1))))) - 1;
                    a = i2116 % 128;
                    int i2117 = i2116 % 2;
                    offlineRosterActivity = this.c;
                    if (!offlineRosterActivity.bc) {
                        offlineRosterActivity.bu.remove(i3);
                        int i2118 = b;
                        i5 = ((i2118 & 38) + (i2118 | 38)) - 1;
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    int i2119 = a;
                    int i2120 = i2119 & 83;
                    int i2121 = (i2119 ^ 83) | i2120;
                    i6 = (i2120 & i2121) + (i2121 | i2120);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i2122 = 71 / 0;
                        if (offlineRosterActivity.aM != -1) {
                            int i21110 = a + 57;
                            b = i21110 % 128;
                            int i21111 = i21110 % 2;
                            if (offlineRosterActivity.aN.relation_to_household_id != 186) {
                                int i21112 = b;
                                int i311110 = i21112 & 25;
                                int i311111 = (i21112 | 25) & (~i311110);
                                int i311112 = -(-(i311110 << 1));
                                int i311113 = (i311111 & i311112) + (i311111 | i311112);
                                a = i311113 % 128;
                                int i311114 = i311113 % 2;
                                offlineRosterActivity.bu.remove(i3);
                                int i311115 = a;
                                int i311116 = (i311115 & (-30)) | ((~i311115) & 29);
                                int i311117 = -(-((i311115 & 29) << 1));
                                int i311118 = (i311116 ^ i311117) + ((i311117 & i311116) << 1);
                                b = i311118 % 128;
                                int i311119 = i311118 % 2;
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (offlineRosterActivity.aM != -1) {
                        int i21113 = a + 57;
                        b = i21113 % 128;
                        int i21114 = i21113 % 2;
                        if (offlineRosterActivity.aN.relation_to_household_id != 186) {
                            int i21115 = b;
                            int i3111110 = i21115 & 25;
                            int i3111111 = (i21115 | 25) & (~i3111110);
                            int i3111112 = -(-(i3111110 << 1));
                            int i3111113 = (i3111111 & i3111112) + (i3111111 | i3111112);
                            a = i3111113 % 128;
                            int i3111114 = i3111113 % 2;
                            offlineRosterActivity.bu.remove(i3);
                            int i3111115 = a;
                            int i3111116 = (i3111115 & (-30)) | ((~i3111115) & 29);
                            int i3111117 = -(-((i3111115 & 29) << 1));
                            int i3111118 = (i3111116 ^ i3111117) + ((i3111117 & i3111116) << 1);
                            b = i3111118 % 128;
                            int i3111119 = i3111118 % 2;
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                int i4110 = i3 & 118;
                int i4111 = (i3 | 118) & (~i4110);
                int i4112 = i4110 << 1;
                int i4113 = ((i4111 | i4112) << 1) - (i4111 ^ i4112);
                i3 = (((i4113 & 116) | ((~i4113) & (-117))) - (~(-(-((i4113 & (-117)) << 1))))) - 1;
                int i4114 = a;
                int i4115 = ((i4114 & (-10)) | ((~i4114) & 9)) + ((i4114 & 9) << 1);
                b = i4115 % 128;
                int i4116 = i4115 % 2;
            }
        }
        int i4117 = b;
        int i4118 = i4117 & 83;
        int i4119 = (i4117 ^ 83) | i4118;
        i2 = (i4118 & i4119) + (i4119 | i4118);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
