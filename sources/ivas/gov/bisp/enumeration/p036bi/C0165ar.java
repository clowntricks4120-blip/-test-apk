package ivas.gov.bisp.enumeration.p036bi;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0165ar implements CompoundButton.OnCheckedChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ShockQuestion c;

    public C0165ar(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 43;
        int i4 = (i2 | 43) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            compoundButton.isChecked();
            obj.hashCode();
            throw null;
        }
        if (!compoundButton.isChecked()) {
            ShockQuestion shockQuestion = this.c;
            shockQuestion.bN = false;
            LinearLayout linearLayout = shockQuestion.ci;
            int i7 = a;
            int i8 = (((i7 | 16) << 1) - (i7 ^ 16)) - 1;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                linearLayout.setVisibility(8);
                return;
            } else {
                linearLayout.setVisibility(8);
                throw null;
            }
        }
        ShockQuestion shockQuestion2 = this.c;
        int i9 = shockQuestion2.bv;
        int i10 = shockQuestion2.br;
        int i11 = shockQuestion2.bx;
        int i12 = a;
        int i13 = (-2) - ((i12 + 30) ^ (-1));
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = -(-i11);
        if (i9 != (i10 & i15) + (i10 | i15)) {
            int i16 = i12 ^ 61;
            int i17 = ((i12 & 61) | i16) << 1;
            int i18 = -i16;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                shockQuestion2.bN = false;
            } else {
                shockQuestion2.bN = true;
            }
            int i20 = a;
            int i21 = i20 & 83;
            int i22 = (i20 ^ 83) | i21;
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        shockQuestion2.ci.setVisibility(0);
        int i25 = a;
        int i26 = i25 & 47;
        int i27 = (((i25 ^ 47) | i26) << 1) - ((i25 | 47) & (~i26));
        b = i27 % 128;
        int i28 = i27 % 2;
    }
}
