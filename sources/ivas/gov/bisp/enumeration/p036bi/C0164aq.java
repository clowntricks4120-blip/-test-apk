package ivas.gov.bisp.enumeration.p036bi;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0164aq implements CompoundButton.OnCheckedChangeListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ShockQuestion c;

    public C0164aq(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = (i2 ^ 79) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            compoundButton.isChecked();
            obj.hashCode();
            throw null;
        }
        if (!compoundButton.isChecked()) {
            ShockQuestion shockQuestion = this.c;
            shockQuestion.bM = false;
            LinearLayout linearLayout = shockQuestion.cf;
            int i6 = a;
            int i7 = i6 & 1;
            int i8 = (i6 | 1) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            linearLayout.setVisibility(8);
            int i12 = a;
            int i13 = ((i12 & 31) - (~(i12 | 31))) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i14 = a + 101;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            ShockQuestion shockQuestion2 = this.c;
            int i15 = shockQuestion2.bm;
            int i16 = shockQuestion2.bn;
            throw null;
        }
        ShockQuestion shockQuestion3 = this.c;
        int i17 = shockQuestion3.bm;
        int i18 = shockQuestion3.bn;
        int i19 = a;
        int i20 = ((i19 ^ 33) | (i19 & 33)) << 1;
        int i21 = -(((~i19) & 33) | (i19 & (-34)));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
        if (i17 != i18 + shockQuestion3.bp) {
            int i24 = b;
            int i25 = i24 & 63;
            int i26 = i25 + ((i24 ^ 63) | i25);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                shockQuestion3.bM = false;
            } else {
                shockQuestion3.bM = true;
            }
        }
        shockQuestion3.cf.setVisibility(0);
        int i27 = a;
        int i28 = i27 & 37;
        int i29 = (i27 ^ 37) | i28;
        int i30 = (i28 & i29) + (i29 | i28);
        b = i30 % 128;
        if (i30 % 2 != 0) {
            throw null;
        }
    }
}
