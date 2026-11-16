package ivas.gov.bisp.enumeration.bI;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class X implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ double c;
    public final /* synthetic */ OfflineRosterActivity d;

    public X(OfflineRosterActivity offlineRosterActivity, double d) {
        this.d = offlineRosterActivity;
        this.c = d;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        OfflineRosterActivity offlineRosterActivity;
        int optionId;
        OfflineRosterActivity offlineRosterActivity2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 98) << 1) - (i2 ^ 98);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            offlineRosterActivity = this.d;
            offlineRosterActivity.aH = arrayList;
            int i5 = 9 / 0;
        } else {
            offlineRosterActivity = this.d;
            offlineRosterActivity.aH = arrayList;
        }
        Object obj = null;
        if (this.c <= 13.0d) {
            int i6 = b;
            int i7 = i6 | 89;
            int i8 = i7 << 1;
            int i9 = -((~(i6 & 89)) & i7);
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = i11 & 49;
            int i14 = -(-((i11 ^ 49) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 0;
            while (i17 < this.d.aH.size()) {
                int i18 = b;
                int i19 = i18 ^ 57;
                int i20 = ((i18 & 57) | i19) << 1;
                int i21 = -i19;
                int i22 = (i20 & i21) + (i20 | i21);
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    this.d.aH.get(i17);
                    obj.hashCode();
                    throw null;
                }
                if (this.d.aH.get(i17).getOptionId() >= 38) {
                    int i23 = a;
                    int i24 = ((((i23 ^ 115) | (i23 & 115)) << 1) - (~(-(((~i23) & 115) | (i23 & (-116)))))) - 1;
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    this.d.aH.remove(i17);
                    int i26 = b;
                    int i27 = ((((i26 ^ 11) | (i26 & 11)) << 1) - (~(-((i26 & (-12)) | ((~i26) & 11))))) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    i17 = (i17 << 1) + (i17 ^ (-1));
                    int i29 = i26 & 97;
                    int i30 = (i26 ^ 97) | i29;
                    int i31 = (i29 & i30) + (i30 | i29);
                    a = i31 % 128;
                    if (i31 % 2 == 0) {
                        int i32 = 3 / 3;
                    }
                }
                int i33 = i17 & 1;
                i17 = (i33 - (~(-(-((i17 ^ 1) | i33))))) - 1;
                int i34 = a;
                int i35 = ((i34 | 7) << 1) - (i34 ^ 7);
                b = i35 % 128;
                if (i35 % 2 != 0) {
                    int i36 = 4 % 3;
                }
            }
            OfflineRosterActivity offlineRosterActivity3 = this.d;
            ArrayList<Item> arrayList2 = offlineRosterActivity3.aH;
            Spinner spinner = offlineRosterActivity3.sp_highest_education;
            int i37 = b;
            int i38 = i37 & 25;
            int i39 = i38 + ((i37 ^ 25) | i38);
            a = i39 % 128;
            int i40 = i39 % 2;
            offlineRosterActivity3.O(arrayList2, spinner);
            if (this.d.bc) {
                int i41 = a;
                int i42 = (-2) - (((i41 ^ 4) + ((i41 & 4) << 1)) ^ (-1));
                b = i42 % 128;
                int i43 = i42 % 2;
                int i44 = i41 & 121;
                int i45 = -(-((i41 ^ 121) | i44));
                int i46 = (i44 & i45) + (i45 | i44);
                b = i46 % 128;
                int i47 = i46 % 2;
                int i48 = 0;
                while (i48 < this.d.aH.size()) {
                    int i49 = b;
                    int i50 = ((i49 | 105) << 1) - (i49 ^ 105);
                    a = i50 % 128;
                    int i51 = i50 % 2;
                    Item item = this.d.aH.get(i48);
                    int i52 = b;
                    int i53 = (((i52 & (-94)) | ((~i52) & 93)) - (~(-(-((i52 & 93) << 1))))) - 1;
                    a = i53 % 128;
                    if (i53 % 2 == 0) {
                        optionId = item.getOptionId();
                        offlineRosterActivity2 = this.d;
                        int i54 = 14 / 0;
                    } else {
                        optionId = item.getOptionId();
                        offlineRosterActivity2 = this.d;
                    }
                    if (optionId == offlineRosterActivity2.aN.higher_education) {
                        int i55 = a;
                        int i56 = (i55 ^ 57) + ((i55 & 57) << 1);
                        b = i56 % 128;
                        int i57 = i56 % 2;
                        offlineRosterActivity2.sp_highest_education.setSelection(i48);
                        int i58 = a;
                        int i59 = ((i58 & 80) + (i58 | 80)) - 1;
                        b = i59 % 128;
                        if (i59 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i60 = (i48 & 2) + (i48 | 2);
                    i48 = (i60 ^ (-1)) + (i60 << 1);
                    int i61 = b;
                    int i62 = ((i61 & 88) + (i61 | 88)) - 1;
                    a = i62 % 128;
                    int i63 = i62 % 2;
                }
            }
        } else {
            offlineRosterActivity.O(arrayList, offlineRosterActivity.sp_highest_education);
            int i64 = b + 5;
            a = i64 % 128;
            int i65 = i64 % 2;
            if (this.d.bc) {
                int i66 = 0;
                while (i66 < this.d.aH.size()) {
                    int i67 = a;
                    int i68 = ((i67 ^ 26) + ((i67 & 26) << 1)) - 1;
                    b = i68 % 128;
                    int i69 = i68 % 2;
                    int optionId2 = this.d.aH.get(i66).getOptionId();
                    int i70 = a;
                    int i71 = i70 & 113;
                    int i72 = i71 + ((i70 ^ 113) | i71);
                    b = i72 % 128;
                    if (i72 % 2 != 0) {
                        int i73 = this.d.aN.higher_education;
                        obj.hashCode();
                        throw null;
                    }
                    OfflineRosterActivity offlineRosterActivity4 = this.d;
                    if (optionId2 == offlineRosterActivity4.aN.higher_education) {
                        int i74 = a;
                        int i75 = ((i74 & 86) + (i74 | 86)) - 1;
                        b = i75 % 128;
                        if (i75 % 2 != 0) {
                            offlineRosterActivity4.sp_highest_education.setSelection(i66);
                            int i76 = 45 / 0;
                        } else {
                            offlineRosterActivity4.sp_highest_education.setSelection(i66);
                        }
                        int i77 = a;
                        int i78 = (((i77 ^ 59) | (i77 & 59)) << 1) - (((~i77) & 59) | (i77 & (-60)));
                        b = i78 % 128;
                        if (i78 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i79 = i66 ^ 37;
                    int i80 = (i66 & 37) << 1;
                    int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                    int i82 = i81 & (-36);
                    int i83 = -(-(i81 | (-36)));
                    i66 = (i82 | i83) + (i82 & i83);
                    int i84 = b;
                    int i85 = (i84 & (-124)) | ((~i84) & 123);
                    int i86 = (i84 & 123) << 1;
                    int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                    a = i87 % 128;
                    if (i87 % 2 == 0) {
                        int i88 = 3 % 5;
                    }
                }
            }
        }
        int i89 = b;
        int i90 = (((i89 | 83) << 1) - (~(-(i89 ^ 83)))) - 1;
        a = i90 % 128;
        int i91 = i90 % 2;
    }
}
