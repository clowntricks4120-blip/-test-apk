package ivas.gov.bisp.enumeration.p036bi;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;

/* JADX INFO: loaded from: classes.dex */
public class aA implements CompoundButton.OnCheckedChangeListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ShockQuestion c;

    public aA(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 71) << 1) - (i2 ^ 71);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            compoundButton.isChecked();
            obj.hashCode();
            throw null;
        }
        if (!compoundButton.isChecked()) {
            ShockQuestion shockQuestion = this.c;
            shockQuestion.bO = false;
            LinearLayout linearLayout = shockQuestion.cs;
            int i4 = a;
            int i5 = i4 & 37;
            int i6 = (i4 ^ 37) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            linearLayout.setVisibility(8);
            int i9 = a + 71;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i10 = a;
        int i11 = i10 & 81;
        int i12 = -(-((i10 ^ 81) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        ShockQuestion shockQuestion2 = this.c;
        if (i14 != 0) {
            int i15 = shockQuestion2.bC;
            int i16 = shockQuestion2.bE;
            obj.hashCode();
            throw null;
        }
        int i17 = shockQuestion2.bC;
        int i18 = shockQuestion2.bE;
        int i19 = shockQuestion2.bD;
        int i20 = i18 & i19;
        if (i17 != i20 + ((i18 ^ i19) | i20)) {
            int i21 = b;
            int i22 = i21 & 49;
            int i23 = (i21 | 49) & (~i22);
            int i24 = -(-(i22 << 1));
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                shockQuestion2.bO = false;
            } else {
                shockQuestion2.bO = true;
            }
            int i26 = a;
            int i27 = (((i26 | 114) << 1) - (i26 ^ 114)) - 1;
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        shockQuestion2.cs.setVisibility(0);
        int i29 = b;
        int i30 = ((i29 | 99) << 1) - (i29 ^ 99);
        a = i30 % 128;
        int i31 = i30 % 2;
    }
}
