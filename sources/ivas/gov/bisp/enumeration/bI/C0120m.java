package ivas.gov.bisp.enumeration.bI;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bI.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0120m implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ double c;
    public final /* synthetic */ ActivityRoster d;

    public C0120m(ActivityRoster activityRoster, double d) {
        this.d = activityRoster;
        this.c = d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 107) + (i2 | 107);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.d.aQ = arrayList;
            throw null;
        }
        ActivityRoster activityRoster = this.d;
        activityRoster.aQ = arrayList;
        double d = this.c;
        int i4 = a;
        int i5 = (i4 ^ 101) + ((i4 & 101) << 1);
        b = i5 % 128;
        int i6 = 0;
        if (i5 % 2 == 0 ? d > 13.0d : d > 13.0d) {
            activityRoster.R(arrayList, activityRoster.sp_highest_education);
            ActivityRoster activityRoster2 = this.d;
            int i7 = a;
            int i8 = (((i7 | 80) << 1) - (i7 ^ 80)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            if (activityRoster2.aX) {
                while (i6 < this.d.aQ.size()) {
                    int i10 = b;
                    int i11 = i10 & 111;
                    int i12 = ((i10 | 111) & (~i11)) + (i11 << 1);
                    a = i12 % 128;
                    if (i12 % 2 == 0) {
                        this.d.aQ.get(i6);
                        obj.hashCode();
                        throw null;
                    }
                    Item item = this.d.aQ.get(i6);
                    int i13 = a;
                    int i14 = ((i13 & 27) - (~(i13 | 27))) - 1;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    int optionId = item.getOptionId();
                    ActivityRoster activityRoster3 = this.d;
                    int i16 = b;
                    int i17 = i16 & 95;
                    int i18 = i16 | 95;
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    a = i19 % 128;
                    if (i19 % 2 == 0) {
                        int i20 = activityRoster3.bk.higher_education;
                        obj.hashCode();
                        throw null;
                    }
                    if (optionId == activityRoster3.bk.higher_education) {
                        int i21 = b;
                        int i22 = (i21 & (-52)) | ((~i21) & 51);
                        int i23 = (i21 & 51) << 1;
                        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                        a = i24 % 128;
                        if (i24 % 2 != 0) {
                            activityRoster3.sp_highest_education.setSelection(i6);
                            return;
                        } else {
                            activityRoster3.sp_highest_education.setSelection(i6);
                            obj.hashCode();
                            throw null;
                        }
                    }
                    i6 = ((i6 | 1) << 1) - (i6 ^ 1);
                    int i25 = a;
                    int i26 = i25 ^ 43;
                    int i27 = -(-((i25 & 43) << 1));
                    int i28 = (i26 & i27) + (i27 | i26);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
        } else {
            int i30 = i4 & 93;
            int i31 = i30 + ((i4 ^ 93) | i30);
            b = i31 % 128;
            int i32 = i31 % 2;
            int i33 = 0;
            while (i33 < this.d.aQ.size()) {
                int i34 = a;
                int i35 = (((i34 | 64) << 1) - (i34 ^ 64)) - 1;
                b = i35 % 128;
                if (i35 % 2 != 0) {
                    ArrayList<Item> arrayList2 = this.d.aQ;
                    obj.hashCode();
                    throw null;
                }
                ArrayList<Item> arrayList3 = this.d.aQ;
                int i36 = b;
                int i37 = i36 & 49;
                int i38 = ((i36 | 49) & (~i37)) + (i37 << 1);
                a = i38 % 128;
                if (i38 % 2 == 0) {
                    if (arrayList3.get(i33).getOptionId() >= 91) {
                        int i39 = b;
                        int i40 = (i39 & 51) + (i39 | 51);
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        this.d.aQ.remove(i33);
                        int i42 = b;
                        int i43 = ((((i42 ^ 23) | (i42 & 23)) << 1) - (~(-(((~i42) & 23) | (i42 & (-24)))))) - 1;
                        int i44 = i43 % 128;
                        a = i44;
                        int i45 = i43 % 2;
                        i33--;
                        int i46 = (i44 ^ 87) + ((i44 & 87) << 1);
                        b = i46 % 128;
                        int i47 = i46 % 2;
                    }
                } else if (arrayList3.get(i33).getOptionId() >= 38) {
                    int i310 = b;
                    int i48 = (i310 & 51) + (i310 | 51);
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    this.d.aQ.remove(i33);
                    int i410 = b;
                    int i411 = ((((i410 ^ 23) | (i410 & 23)) << 1) - (~(-(((~i410) & 23) | (i410 & (-24)))))) - 1;
                    int i412 = i411 % 128;
                    a = i412;
                    int i413 = i411 % 2;
                    i33--;
                    int i414 = (i412 ^ 87) + ((i412 & 87) << 1);
                    b = i414 % 128;
                    int i415 = i414 % 2;
                }
                i33 = ((i33 & 1) << 1) + (i33 ^ 1);
                int i50 = a;
                int i51 = ((i50 ^ 67) | (i50 & 67)) << 1;
                int i52 = -(((~i50) & 67) | (i50 & (-68)));
                int i53 = (i51 & i52) + (i52 | i51);
                b = i53 % 128;
                int i54 = i53 % 2;
            }
            ActivityRoster activityRoster4 = this.d;
            ArrayList<Item> arrayList4 = activityRoster4.aQ;
            Spinner spinner = activityRoster4.sp_highest_education;
            int i55 = b;
            int i56 = ((i55 | 125) << 1) - (i55 ^ 125);
            a = i56 % 128;
            int i57 = i56 % 2;
            activityRoster4.R(arrayList4, spinner);
            if (!(!this.d.aX)) {
                int i58 = b;
                int i59 = (i58 & (-82)) | ((~i58) & 81);
                int i60 = -(-((i58 & 81) << 1));
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                int i62 = i61 % 128;
                a = i62;
                int i63 = i61 % 2;
                int i64 = i62 + 107;
                b = i64 % 128;
                int i65 = i64 % 2;
                while (i6 < this.d.aQ.size()) {
                    int i66 = a;
                    int i67 = ((i66 ^ 87) | (i66 & 87)) << 1;
                    int i68 = -(((~i66) & 87) | (i66 & (-88)));
                    int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                    b = i69 % 128;
                    int i70 = i69 % 2;
                    Item item2 = this.d.aQ.get(i6);
                    int i71 = a;
                    int i72 = i71 & 87;
                    int i73 = -(-((i71 ^ 87) | i72));
                    int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                    b = i74 % 128;
                    int i75 = i74 % 2;
                    int optionId2 = item2.getOptionId();
                    ActivityRoster activityRoster5 = this.d;
                    Roster roster = activityRoster5.bk;
                    int i76 = b;
                    int i77 = (i76 | 93) << 1;
                    int i78 = -(((~i76) & 93) | (i76 & (-94)));
                    int i79 = (i77 & i78) + (i78 | i77);
                    a = i79 % 128;
                    if (i79 % 2 == 0) {
                        int i80 = roster.higher_education;
                        throw null;
                    }
                    if (optionId2 == roster.higher_education) {
                        int i81 = a;
                        int i82 = ((i81 ^ 81) | (i81 & 81)) << 1;
                        int i83 = -(((~i81) & 81) | (i81 & (-82)));
                        int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                        b = i84 % 128;
                        int i85 = i84 % 2;
                        activityRoster5.sp_highest_education.setSelection(i6);
                        int i86 = (-2) - ((a + 108) ^ (-1));
                        b = i86 % 128;
                        int i87 = i86 % 2;
                        return;
                    }
                    int i88 = (i6 ^ (-84)) + ((i6 & (-84)) << 1);
                    i6 = (i88 ^ 85) + ((i88 & 85) << 1);
                    int i89 = a;
                    int i90 = i89 & 61;
                    int i91 = -(-((i89 ^ 61) | i90));
                    int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                    b = i92 % 128;
                    int i93 = i92 % 2;
                }
            }
        }
        int i94 = a;
        int i95 = i94 & 123;
        int i96 = (((i94 | 123) & (~i95)) - (~(-(-(i95 << 1))))) - 1;
        b = i96 % 128;
        int i97 = i96 % 2;
    }
}
