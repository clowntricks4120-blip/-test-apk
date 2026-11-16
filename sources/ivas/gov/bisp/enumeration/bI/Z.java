package ivas.gov.bisp.enumeration.bI;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Z implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity c;

    public Z(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x017b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0181  */
    /* JADX WARN: Code duplicated, block: B:45:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x025e  */
    /* JADX WARN: Code duplicated, block: B:70:0x028f  */
    /* JADX WARN: Code duplicated, block: B:72:0x029e  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:81:0x02cc A[EDGE_INSN: B:81:0x02cc->B:85:0x02f3 BREAK  A[LOOP:1: B:58:0x021c->B:84:0x02d8]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:94:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x02d8 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        OfflineRosterActivity offlineRosterActivity;
        int i;
        int i2;
        OfflineRosterActivity offlineRosterActivity2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = ((i6 ^ 7) | (i6 & 7)) << 1;
        int i8 = -(((~i6) & 7) | (i6 & (-8)));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        OfflineRosterActivity offlineRosterActivity3 = this.c;
        offlineRosterActivity3.bu = arrayList;
        int i11 = b;
        int i12 = i11 & 107;
        int i13 = ((i11 | 107) & (~i12)) + (i12 << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        offlineRosterActivity3.O(arrayList, offlineRosterActivity3.sp_relation_to_household);
        int i15 = b;
        int i16 = i15 & 55;
        int i17 = ((i15 | 55) & (~i16)) + (i16 << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (true) {
            if (i19 >= this.c.bu.size()) {
                int i20 = b;
                int i21 = ((i20 ^ 95) - (~((i20 & 95) << 1))) - 1;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 5 / 2;
                }
                i19 = -1;
                break;
            }
            int i23 = b;
            int i24 = i23 & 5;
            int i25 = (((i23 | 5) & (~i24)) - (~(i24 << 1))) - 1;
            a = i25 % 128;
            int i26 = i25 % 2;
            int optionId = this.c.bu.get(i19).getOptionId();
            int i27 = b + 19;
            a = i27 % 128;
            int i28 = i27 % 2;
            if (optionId == this.c.aN.relation_to_household_id) {
                break;
            }
            int i29 = a;
            int i30 = (i29 & 47) + (i29 | 47);
            b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = i19 - 3;
            i19 = ((i32 | 4) << 1) - (i32 ^ 4);
            int i33 = ((i29 | 103) << 1) - (i29 ^ 103);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        if (i19 != -1) {
            int i35 = a;
            int i36 = ((i35 ^ 96) + ((i35 & 96) << 1)) - 1;
            b = i36 % 128;
            if (i36 % 2 == 0) {
                this.c.bu.get(i19);
                throw null;
            }
            Item item = this.c.bu.get(i19);
            int i37 = b;
            int i38 = ((i37 | 19) << 1) - (i37 ^ 19);
            a = i38 % 128;
            if (i38 % 2 == 0 ? item.getOptionId() != 186 : item.getOptionId() != 11362) {
                Spinner spinner = this.c.sp_relation_to_household;
                int i39 = ~i19;
                int i40 = -(-(i19 << 1));
                spinner.setSelection((i39 & i40) + (i40 | i39));
                int i41 = b;
                int i42 = ((i41 ^ 59) | (i41 & 59)) << 1;
                int i43 = -(((~i41) & 59) | (i41 & (-60)));
                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                a = i44 % 128;
                int i45 = i44 % 2;
            } else {
                int i46 = a;
                int i47 = ((i46 & 120) + (i46 | 120)) - 1;
                b = i47 % 128;
                int i48 = i47 % 2;
                this.c.sp_relation_to_household.setEnabled(false);
                int i49 = a;
                int i50 = i49 & 19;
                int i51 = ((i49 | 19) & (~i50)) + (i50 << 1);
                b = i51 % 128;
                if (i51 % 2 == 0) {
                    this.c.sp_relation_to_household.setSelection(i19);
                    throw null;
                }
                this.c.sp_relation_to_household.setSelection(i19);
            }
        }
        OfflineRosterActivity offlineRosterActivity4 = this.c;
        int i52 = offlineRosterActivity4.ac;
        if (i52 != 1) {
            int i53 = b;
            int i54 = (((i53 | 26) << 1) - (i53 ^ 26)) - 1;
            a = i54 % 128;
            if (i54 % 2 == 0 ? i52 == 2 : i52 == 4) {
                if (!ag.g) {
                    int i55 = b;
                    int i56 = (-2) - (((i55 ^ 110) + ((i55 & 110) << 1)) ^ (-1));
                    a = i56 % 128;
                    int i57 = i56 % 2;
                    offlineRosterActivity4.et_MemberName.setText(ag.i);
                    offlineRosterActivity = this.c;
                    int i58 = a;
                    int i59 = i58 & 29;
                    i = i59 + ((i58 ^ 29) | i59);
                    b = i % 128;
                    if (i % 2 == 0) {
                        offlineRosterActivity.sp_relation_to_household.setSelection(0);
                    } else {
                        offlineRosterActivity.sp_relation_to_household.setSelection(1);
                    }
                    this.c.linearLayoutCNIC.setVisibility(0);
                    this.c.et_MemberName.setEnabled(true);
                    i2 = b + 111;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.c.sp_relation_to_household.setEnabled(true);
                    } else {
                        this.c.sp_relation_to_household.setEnabled(false);
                    }
                    int i60 = b;
                    int i61 = i60 & 43;
                    int i62 = -(-((i60 ^ 43) | i61));
                    int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                    a = i63 % 128;
                    int i64 = i63 % 2;
                }
            } else if (ag.d) {
                if (!ag.g) {
                    int i510 = b;
                    int i511 = (-2) - (((i510 ^ 110) + ((i510 & 110) << 1)) ^ (-1));
                    a = i511 % 128;
                    int i512 = i511 % 2;
                    offlineRosterActivity4.et_MemberName.setText(ag.i);
                    offlineRosterActivity = this.c;
                    int i513 = a;
                    int i514 = i513 & 29;
                    i = i514 + ((i513 ^ 29) | i514);
                    b = i % 128;
                    if (i % 2 == 0) {
                        offlineRosterActivity.sp_relation_to_household.setSelection(0);
                    } else {
                        offlineRosterActivity.sp_relation_to_household.setSelection(1);
                    }
                    this.c.linearLayoutCNIC.setVisibility(0);
                    this.c.et_MemberName.setEnabled(true);
                    i2 = b + 111;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.c.sp_relation_to_household.setEnabled(true);
                    } else {
                        this.c.sp_relation_to_household.setEnabled(false);
                    }
                    int i65 = b;
                    int i66 = i65 & 43;
                    int i67 = -(-((i65 ^ 43) | i66));
                    int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                    a = i68 % 128;
                    int i69 = i68 % 2;
                }
            }
        } else if (!ag.g) {
            int i515 = b;
            int i516 = (-2) - (((i515 ^ 110) + ((i515 & 110) << 1)) ^ (-1));
            a = i516 % 128;
            int i517 = i516 % 2;
            offlineRosterActivity4.et_MemberName.setText(ag.i);
            offlineRosterActivity = this.c;
            int i518 = a;
            int i519 = i518 & 29;
            i = i519 + ((i518 ^ 29) | i519);
            b = i % 128;
            if (i % 2 == 0) {
                offlineRosterActivity.sp_relation_to_household.setSelection(0);
            } else {
                offlineRosterActivity.sp_relation_to_household.setSelection(1);
            }
            this.c.linearLayoutCNIC.setVisibility(0);
            this.c.et_MemberName.setEnabled(true);
            i2 = b + 111;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                this.c.sp_relation_to_household.setEnabled(true);
            } else {
                this.c.sp_relation_to_household.setEnabled(false);
            }
            int i610 = b;
            int i611 = i610 & 43;
            int i612 = -(-((i610 ^ 43) | i611));
            int i613 = ((i611 | i612) << 1) - (i612 ^ i611);
            a = i613 % 128;
            int i614 = i613 % 2;
        }
        if (!(!ag.g)) {
            int i70 = b;
            int i71 = ((i70 & (-70)) | ((~i70) & 69)) + ((i70 & 69) << 1);
            int i72 = i71 % 128;
            a = i72;
            int i73 = i71 % 2;
            int i74 = (((i72 & (-86)) | ((~i72) & 85)) - (~((i72 & 85) << 1))) - 1;
            b = i74 % 128;
            if (i74 % 2 == 0) {
                int i75 = 4 % 2;
            }
            int i76 = 0;
            while (i76 < this.c.bu.size()) {
                int i77 = a;
                int i78 = ((i77 | 35) << 1) - (i77 ^ 35);
                b = i78 % 128;
                int i79 = i78 % 2;
                Item item2 = this.c.bu.get(i76);
                int i80 = a;
                int i81 = i80 & 79;
                int i82 = (i80 ^ 79) | i81;
                int i83 = (i81 & i82) + (i82 | i81);
                b = i83 % 128;
                if (i83 % 2 == 0) {
                    if (item2.getOptionId() == 27062) {
                        int i84 = a;
                        int i85 = ((i84 & (-70)) | ((~i84) & 69)) + ((i84 & 69) << 1);
                        b = i85 % 128;
                        int i86 = i85 % 2;
                        offlineRosterActivity2 = this.c;
                        if (!offlineRosterActivity2.bc) {
                            offlineRosterActivity2.bu.remove(i76);
                            int i87 = a;
                            int i88 = i87 & 61;
                            int i89 = -(-((i87 ^ 61) | i88));
                            int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                            b = i90 % 128;
                            int i91 = i90 % 2;
                            break;
                        }
                        int i92 = a;
                        i3 = ((i92 & 104) + (i92 | 104)) - 1;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i93 = 14 / 0;
                            if (offlineRosterActivity2.aM != -1) {
                                int i94 = b;
                                int i95 = i94 & 115;
                                int i96 = (((i94 | 115) & (~i95)) - (~(i95 << 1))) - 1;
                                a = i96 % 128;
                                int i97 = i96 % 2;
                                if (offlineRosterActivity2.aN.relation_to_household_id != 186) {
                                    i4 = b + 69;
                                    a = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        offlineRosterActivity2.bu.remove(i76);
                                        break;
                                    } else {
                                        offlineRosterActivity2.bu.remove(i76);
                                        throw null;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (offlineRosterActivity2.aM != -1) {
                            int i98 = b;
                            int i99 = i98 & 115;
                            int i910 = (((i98 | 115) & (~i99)) - (~(i99 << 1))) - 1;
                            a = i910 % 128;
                            int i911 = i910 % 2;
                            if (offlineRosterActivity2.aN.relation_to_household_id != 186) {
                                i4 = b + 69;
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    offlineRosterActivity2.bu.remove(i76);
                                    break;
                                } else {
                                    offlineRosterActivity2.bu.remove(i76);
                                    throw null;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else if (item2.getOptionId() == 186) {
                    int i810 = a;
                    int i811 = ((i810 & (-70)) | ((~i810) & 69)) + ((i810 & 69) << 1);
                    b = i811 % 128;
                    int i812 = i811 % 2;
                    offlineRosterActivity2 = this.c;
                    if (!offlineRosterActivity2.bc) {
                        offlineRosterActivity2.bu.remove(i76);
                        int i813 = a;
                        int i814 = i813 & 61;
                        int i815 = -(-((i813 ^ 61) | i814));
                        int i912 = ((i814 | i815) << 1) - (i815 ^ i814);
                        b = i912 % 128;
                        int i913 = i912 % 2;
                        break;
                    }
                    int i914 = a;
                    i3 = ((i914 & 104) + (i914 | 104)) - 1;
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i915 = 14 / 0;
                        if (offlineRosterActivity2.aM != -1) {
                            int i916 = b;
                            int i917 = i916 & 115;
                            int i918 = (((i916 | 115) & (~i917)) - (~(i917 << 1))) - 1;
                            a = i918 % 128;
                            int i919 = i918 % 2;
                            if (offlineRosterActivity2.aN.relation_to_household_id != 186) {
                                i4 = b + 69;
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    offlineRosterActivity2.bu.remove(i76);
                                    break;
                                } else {
                                    offlineRosterActivity2.bu.remove(i76);
                                    throw null;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (offlineRosterActivity2.aM != -1) {
                        int i9110 = b;
                        int i9111 = i9110 & 115;
                        int i9112 = (((i9110 | 115) & (~i9111)) - (~(i9111 << 1))) - 1;
                        a = i9112 % 128;
                        int i9113 = i9112 % 2;
                        if (offlineRosterActivity2.aN.relation_to_household_id != 186) {
                            i4 = b + 69;
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                offlineRosterActivity2.bu.remove(i76);
                                break;
                            } else {
                                offlineRosterActivity2.bu.remove(i76);
                                throw null;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i76 = (((i76 ^ 1) | (i76 & 1)) << 1) - (((~i76) & 1) | (i76 & (-2)));
                int i100 = a;
                int i101 = (i100 ^ 1) + ((i100 & 1) << 1);
                b = i101 % 128;
                int i102 = i101 % 2;
            }
        }
        OfflineRosterActivity offlineRosterActivity5 = this.c;
        if (offlineRosterActivity5.bc) {
            int i103 = b;
            int i104 = ((((i103 ^ 103) | (i103 & 103)) << 1) - (~(-(((~i103) & 103) | (i103 & (-104)))))) - 1;
            a = i104 % 128;
            int i105 = i104 % 2;
            offlineRosterActivity5.N();
            int i106 = a;
            int i107 = (i106 ^ 49) + ((i106 & 49) << 1);
            b = i107 % 128;
            if (i107 % 2 == 0) {
                int i108 = 4 / 4;
            }
        }
        int i109 = b + 109;
        a = i109 % 128;
        int i110 = i109 % 2;
    }
}
