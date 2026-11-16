package ivas.gov.bisp.enumeration.p025ay;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ay implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ aI.brx d;
    public final /* synthetic */ String e;
    public final /* synthetic */ aI f;

    public ay(aI aIVar, int i, aI.brx brxVar, String str) {
        this.f = aIVar;
        this.c = i;
        this.d = brxVar;
        this.e = str;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 23;
        int i4 = -(-((i2 & 23) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.f.i = arrayList;
        int i7 = a;
        int i8 = i7 & 47;
        int i9 = (i7 ^ 47) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            if (i12 < this.f.i.size()) {
                int i13 = a;
                int i14 = i13 ^ 9;
                int i15 = ((i13 & 9) | i14) << 1;
                int i16 = -i14;
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    this.f.i.get(i12).getOptionId();
                    throw null;
                }
                int optionId = this.f.i.get(i12).getOptionId();
                int i18 = a;
                int i19 = i18 ^ 81;
                int i20 = -(-((i18 & 81) << 1));
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 61 / 0;
                    if (optionId == this.c) {
                        break;
                    }
                    i12 = (-2) - ((i12 + 2) ^ (-1));
                    int i23 = (((i18 | 110) << 1) - (i18 ^ 110)) - 1;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    if (optionId == this.c) {
                        break;
                    }
                    i12 = (-2) - ((i12 + 2) ^ (-1));
                    int i25 = (((i18 | 110) << 1) - (i18 ^ 110)) - 1;
                    b = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            int i27 = a;
            int i28 = i27 & 33;
            int i29 = -(-((i27 ^ 33) | i28));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            b = i30 % 128;
            int i31 = i30 % 2;
            return;
        }
        aI aIVar = this.f;
        Item item = aIVar.i.get(i12);
        int i32 = b + 83;
        a = i32 % 128;
        if (i32 % 2 == 0) {
            aIVar.j = item.getOption();
            TextView textView = this.d.y;
            throw null;
        }
        aIVar.j = item.getOption();
        this.d.y.setText(this.f.j);
        Item item2 = this.f.i.get(i12);
        int i33 = a + 41;
        b = i33 % 128;
        int i34 = i33 % 2;
        if (item2.getOptionId() != 186) {
            int i35 = b;
            int i36 = i35 | 33;
            int i37 = (i36 << 1) - ((~(i35 & 33)) & i36);
            a = i37 % 128;
            if (i37 % 2 == 0) {
                this.e.equals(this.f.m.r());
                throw null;
            }
            if (!this.e.equals(this.f.m.r())) {
                if (!this.f.n) {
                    int i38 = b;
                    int i39 = i38 & 29;
                    int i40 = (i38 | 29) & (~i39);
                    int i41 = i39 << 1;
                    int i42 = (i40 & i41) + (i40 | i41);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    this.d.D.setVisibility(8);
                    int i44 = a;
                    int i45 = (((i44 | 110) << 1) - (i44 ^ 110)) - 1;
                    b = i45 % 128;
                    if (i45 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                int i210 = a;
                int i211 = i210 & 33;
                int i212 = -(-((i210 ^ 33) | i211));
                int i310 = (i211 ^ i212) + ((i212 & i211) << 1);
                b = i310 % 128;
                int i311 = i310 % 2;
                return;
            }
        }
        this.d.D.setVisibility(8);
        int i46 = a;
        int i47 = i46 & 9;
        int i48 = -(-((i46 ^ 9) | i47));
        int i49 = (i47 & i48) + (i48 | i47);
        b = i49 % 128;
        int i50 = i49 % 2;
    }
}
