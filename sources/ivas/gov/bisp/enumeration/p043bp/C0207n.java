package ivas.gov.bisp.enumeration.p043bp;

import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.Roster;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0207n implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ double c;
    public final /* synthetic */ ActivityRoster d;

    public C0207n(ActivityRoster activityRoster, double d) {
        this.d = activityRoster;
        this.c = d;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        ActivityRoster activityRoster;
        double d;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 89) | (i2 & 89)) << 1;
        int i4 = -(((~i2) & 89) | (i2 & (-90)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = 0;
        if (i5 % 2 == 0) {
            activityRoster = this.d;
            activityRoster.aP = arrayList;
            d = this.c;
            int i7 = 20 / 0;
        } else {
            activityRoster = this.d;
            activityRoster.aP = arrayList;
            d = this.c;
        }
        int i8 = b;
        int i9 = (i8 | 125) << 1;
        int i10 = -(((~i8) & 125) | (i8 & (-126)));
        int i11 = (i9 & i10) + (i10 | i9);
        int i12 = i11 % 128;
        a = i12;
        Object obj = null;
        if (i11 % 2 == 0 ? d > 13.0d : d > 13.0d) {
            activityRoster.E(arrayList, activityRoster.sp_highest_education);
            int i13 = a + 108;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                boolean z = this.d.aU;
                throw null;
            }
            if (!(!this.d.aU)) {
                while (i6 < this.d.aP.size()) {
                    int i15 = a + 101;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    Item item = this.d.aP.get(i6);
                    int i17 = b;
                    int i18 = (((i17 | 94) << 1) - (i17 ^ 94)) - 1;
                    a = i18 % 128;
                    if (i18 % 2 != 0) {
                        item.getOptionId();
                        Roster roster = this.d.bn;
                        obj.hashCode();
                        throw null;
                    }
                    int optionId = item.getOptionId();
                    ActivityRoster activityRoster2 = this.d;
                    Roster roster2 = activityRoster2.bn;
                    int i19 = b;
                    int i20 = i19 & 103;
                    int i21 = (i19 | 103) & (~i20);
                    int i22 = i20 << 1;
                    int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                    a = i23 % 128;
                    if (i23 % 2 != 0) {
                        int i24 = roster2.higher_education;
                        obj.hashCode();
                        throw null;
                    }
                    if (optionId == roster2.higher_education) {
                        activityRoster2.sp_highest_education.setSelection(i6);
                        int i25 = a;
                        int i26 = i25 ^ 85;
                        int i27 = -(-((i25 & 85) << 1));
                        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        return;
                    }
                    int i30 = i6 & 89;
                    int i31 = (i30 - (~(-(-((i6 ^ 89) | i30))))) - 1;
                    int i32 = (i31 | (-88)) << 1;
                    int i33 = -(i31 ^ (-88));
                    i6 = (i32 & i33) + (i33 | i32);
                    int i34 = b;
                    int i35 = i34 & 105;
                    int i36 = (i34 | 105) & (~i35);
                    int i37 = -(-(i35 << 1));
                    int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                }
            }
        } else {
            int i40 = i12 + 125;
            b = i40 % 128;
            int i41 = i40 % 2;
            int i42 = 0;
            while (i42 < this.d.aP.size()) {
                int i43 = a + 121;
                b = i43 % 128;
                if (i43 % 2 == 0) {
                    ArrayList<Item> arrayList2 = this.d.aP;
                    throw null;
                }
                ArrayList<Item> arrayList3 = this.d.aP;
                int i44 = b;
                int i45 = (i44 ^ 45) + ((i44 & 45) << 1);
                a = i45 % 128;
                int i46 = i45 % 2;
                int optionId2 = arrayList3.get(i42).getOptionId();
                if (i46 == 0 ? optionId2 >= 38 : optionId2 >= 31) {
                    this.d.aP.remove(i42);
                    int i47 = a;
                    int i48 = i47 & 5;
                    int i49 = (i47 | 5) & (~i48);
                    int i50 = i48 << 1;
                    int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                    int i52 = i51 % 128;
                    b = i52;
                    int i53 = i51 % 2;
                    i42 = (i42 << 1) + (i42 ^ (-1));
                    int i54 = ((i52 & (-66)) | ((~i52) & 65)) + ((i52 & 65) << 1);
                    a = i54 % 128;
                    if (i54 % 2 != 0) {
                        int i55 = 3 % 4;
                    }
                }
                int i56 = i42 & 1;
                i42 = ((((i42 ^ 1) | i56) << 1) - (~(-((i42 | 1) & (~i56))))) - 1;
                int i57 = b;
                int i58 = i57 & 113;
                int i59 = -(-((i57 ^ 113) | i58));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                a = i60 % 128;
                if (i60 % 2 != 0) {
                    int i61 = 5 / 5;
                }
            }
            ActivityRoster activityRoster3 = this.d;
            activityRoster3.E(activityRoster3.aP, activityRoster3.sp_highest_education);
            int i62 = a;
            int i63 = (i62 ^ 79) + ((i62 & 79) << 1);
            b = i63 % 128;
            if (i63 % 2 == 0) {
                boolean z2 = this.d.aU;
                obj.hashCode();
                throw null;
            }
            if (this.d.aU) {
                int i64 = a;
                int i65 = i64 & 3;
                int i66 = ((i64 ^ 3) | i65) << 1;
                int i67 = -((i64 | 3) & (~i65));
                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                b = i68 % 128;
                int i69 = i68 % 2;
                int i70 = 0;
                while (i70 < this.d.aP.size()) {
                    int i71 = b + 37;
                    a = i71 % 128;
                    int i72 = i71 % 2;
                    int optionId3 = this.d.aP.get(i70).getOptionId();
                    int i73 = b;
                    int i74 = (i73 ^ 77) + ((i73 & 77) << 1);
                    a = i74 % 128;
                    if (i74 % 2 != 0) {
                        int i75 = this.d.bn.higher_education;
                        throw null;
                    }
                    ActivityRoster activityRoster4 = this.d;
                    if (optionId3 == activityRoster4.bn.higher_education) {
                        int i76 = a;
                        int i77 = ((i76 | 21) << 1) - (((~i76) & 21) | (i76 & (-22)));
                        b = i77 % 128;
                        int i78 = i77 % 2;
                        activityRoster4.sp_highest_education.setSelection(i70);
                        int i79 = a;
                        int i80 = i79 & 13;
                        int i81 = i79 | 13;
                        int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                        b = i82 % 128;
                        if (i82 % 2 == 0) {
                            int i83 = 41 / 0;
                            return;
                        }
                        return;
                    }
                    int i84 = i70 ^ 1;
                    int i85 = (i70 & 1) << 1;
                    i70 = ((i85 & i84) << 1) + (i84 ^ i85);
                    int i86 = b;
                    int i87 = i86 & 101;
                    int i88 = ((i86 ^ 101) | i87) << 1;
                    int i89 = -((i86 | 101) & (~i87));
                    int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                    a = i90 % 128;
                    int i91 = i90 % 2;
                }
            }
        }
        int i92 = b;
        int i93 = ((i92 ^ 77) - (~((i92 & 77) << 1))) - 1;
        a = i93 % 128;
        if (i93 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
