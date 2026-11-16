package ivas.gov.bisp.enumeration.p036bi;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0171ax implements CompoundButton.OnCheckedChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ShockQuestion c;

    public C0171ax(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 20) + (i2 | 20)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        if (!compoundButton.isChecked()) {
            ShockQuestion shockQuestion = this.c;
            shockQuestion.bS = false;
            int i5 = a;
            int i6 = ((((i5 ^ 85) | (i5 & 85)) << 1) - (~(-(((~i5) & 85) | (i5 & (-86)))))) - 1;
            b = i6 % 128;
            shockQuestion.cp.setVisibility(i6 % 2 == 0 ? 72 : 8);
            int i7 = b + 18;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        int i10 = (-2) - ((a + 76) ^ (-1));
        b = i10 % 128;
        int i11 = i10 % 2;
        ShockQuestion shockQuestion2 = this.c;
        shockQuestion2.bS = true;
        int i12 = a;
        int i13 = i12 & 95;
        int i14 = (i12 | 95) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        shockQuestion2.cp.setVisibility(0);
        int i18 = a;
        int i19 = i18 & 31;
        int i20 = ((i18 ^ 31) | i19) << 1;
        int i21 = -((i18 | 31) & (~i19));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        b = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }
}
