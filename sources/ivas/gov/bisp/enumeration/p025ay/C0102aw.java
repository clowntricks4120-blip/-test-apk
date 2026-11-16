package ivas.gov.bisp.enumeration.p025ay;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ay.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0102aw implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ aI.brx d;
    public final /* synthetic */ aI e;

    public C0102aw(aI aIVar, int i, aI.brx brxVar) {
        this.e = aIVar;
        this.c = i;
        this.d = brxVar;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        aI aIVar;
        Item item;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (i2 ^ 65) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.h = arrayList;
        int i7 = 0;
        while (i7 < this.e.h.size()) {
            int i8 = a;
            int i9 = i8 ^ 13;
            int i10 = (((i8 & 13) | i9) << 1) - i9;
            b = i10 % 128;
            int i11 = i10 % 2;
            int optionId = this.e.h.get(i7).getOptionId();
            int i12 = b + 116;
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            if (optionId == this.c) {
                int i16 = ((i14 | 103) << 1) - (i14 ^ 103);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    aIVar = this.e;
                    item = aIVar.h.get(i7);
                    int i17 = 42 / 0;
                } else {
                    aIVar = this.e;
                    item = aIVar.h.get(i7);
                }
                aIVar.k = item.getOption();
                TextView textView = this.d.z;
                int i18 = a;
                int i19 = i18 & 105;
                int i20 = (i19 - (~((i18 ^ 105) | i19))) - 1;
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    textView.setText(this.e.k);
                    int i21 = 68 / 0;
                } else {
                    textView.setText(this.e.k);
                }
                int i22 = b;
                int i23 = (((i22 & (-46)) | ((~i22) & 45)) - (~(-(-((i22 & 45) << 1))))) - 1;
                a = i23 % 128;
                int i24 = i23 % 2;
                return;
            }
            int i25 = i7 & 1;
            int i26 = (i7 ^ 1) | i25;
            i7 = ((i26 & i25) << 1) + (i25 ^ i26);
            int i27 = ((i14 & 60) + (i14 | 60)) - 1;
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = a;
        int i30 = i29 & 55;
        int i31 = (i30 - (~(-(-((i29 ^ 55) | i30))))) - 1;
        b = i31 % 128;
        int i32 = i31 % 2;
    }
}
