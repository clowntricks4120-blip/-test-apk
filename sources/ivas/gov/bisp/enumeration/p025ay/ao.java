package ivas.gov.bisp.enumeration.p025ay;

import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ao implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ aq.bqM d;
    public final /* synthetic */ aq e;

    public ao(aq aqVar, int i, aq.bqM bqm) {
        this.e = aqVar;
        this.c = i;
        this.d = bqm;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 11;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 11)) & i4);
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            this.e.i = arrayList;
            i = 1;
        } else {
            this.e.i = arrayList;
            i = 0;
        }
        while (true) {
            Object obj = null;
            if (i >= this.e.i.size()) {
                int i8 = b;
                int i9 = (((i8 | 122) << 1) - (i8 ^ 122)) - 1;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i10 = a;
            int i11 = i10 & 29;
            int i12 = (i10 ^ 29) | i11;
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            int i14 = i13 % 2;
            Item item = this.e.i.get(i);
            int i15 = a;
            int i16 = i15 & 69;
            int i17 = -(-((i15 ^ 69) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                item.getOptionId();
                obj.hashCode();
                throw null;
            }
            if (item.getOptionId() == this.c) {
                aq aqVar = this.e;
                Item item2 = aqVar.i.get(i);
                int i19 = a;
                int i20 = (i19 | 9) << 1;
                int i21 = -(((~i19) & 9) | (i19 & (-10)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
                aqVar.j = item2.getOption();
                aq.bqM bqm = this.d;
                int i24 = b;
                int i25 = i24 & 53;
                int i26 = -(-(i24 | 53));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                a = i27 % 128;
                int i28 = i27 % 2;
                bqm.y.setText(this.e.j);
                int i29 = b;
                int i30 = (i29 ^ 73) + ((i29 & 73) << 1);
                a = i30 % 128;
                if (i30 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i31 = i & 1;
            int i32 = ((i ^ 1) | i31) << 1;
            int i33 = -((i | 1) & (~i31));
            i = ((i33 & i32) << 1) + (i32 ^ i33);
            int i34 = b;
            int i35 = (i34 ^ 57) + ((i34 & 57) << 1);
            a = i35 % 128;
            int i36 = i35 % 2;
        }
    }
}
