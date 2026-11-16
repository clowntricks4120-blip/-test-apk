package ivas.gov.bisp.enumeration.p047bt;

import android.widget.TextView;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ r.brG d;
    public final /* synthetic */ r e;

    public c(r rVar, int i, r.brG brg) {
        this.e = rVar;
        this.c = i;
        this.d = brg;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        TextView textView;
        String str;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 11;
        int i5 = i4 + ((i3 ^ 11) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.h = arrayList;
        int i7 = a;
        int i8 = (i7 ^ 85) + ((i7 & 85) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (true) {
            if (i10 >= this.e.h.size()) {
                int i11 = b;
                int i12 = (i11 | 47) << 1;
                int i13 = -(i11 ^ 47);
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 88 / 0;
                    return;
                }
                return;
            }
            int i16 = b;
            int i17 = i16 & 105;
            int i18 = (i17 - (~((i16 ^ 105) | i17))) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
            int optionId = this.e.h.get(i10).getOptionId();
            i = b;
            int i20 = ((((i ^ 53) | (i & 53)) << 1) - (~(-((i & (-54)) | ((~i) & 53))))) - 1;
            int i21 = i20 % 128;
            a = i21;
            if (i20 % 2 != 0) {
                int i22 = 80 / 0;
                if (optionId == this.c) {
                    break;
                }
                int i23 = i10 & 1;
                int i24 = (i10 | 1) & (~i23);
                int i25 = i23 << 1;
                i10 = ((i24 & i25) << 1) + (i24 ^ i25);
                int i26 = i21 & 13;
                int i27 = i26 + ((i21 ^ 13) | i26);
                b = i27 % 128;
                int i28 = i27 % 2;
            } else {
                if (optionId == this.c) {
                    break;
                }
                int i29 = i10 & 1;
                int i210 = (i10 | 1) & (~i29);
                int i211 = i29 << 1;
                i10 = ((i210 & i211) << 1) + (i210 ^ i211);
                int i212 = i21 & 13;
                int i213 = i212 + ((i21 ^ 13) | i212);
                b = i213 % 128;
                int i214 = i213 % 2;
            }
        }
        int i30 = (i ^ 55) + ((i & 55) << 1);
        a = i30 % 128;
        if (i30 % 2 != 0) {
            this.e.h.get(i10).getOption();
            throw null;
        }
        r rVar = this.e;
        String option = rVar.h.get(i10).getOption();
        int i31 = b + 81;
        a = i31 % 128;
        if (i31 % 2 != 0) {
            rVar.k = option;
            textView = this.d.z;
            str = this.e.k;
            int i32 = 96 / 0;
        } else {
            rVar.k = option;
            textView = this.d.z;
            str = this.e.k;
        }
        textView.setText(str);
        int i33 = b;
        int i34 = (i33 | 47) << 1;
        int i35 = -(((~i33) & 47) | (i33 & (-48)));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        a = i36 % 128;
        if (i36 % 2 != 0) {
            throw null;
        }
    }
}
