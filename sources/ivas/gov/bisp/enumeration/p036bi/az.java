package ivas.gov.bisp.enumeration.p036bi;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;

/* JADX INFO: loaded from: classes.dex */
public class az implements CompoundButton.OnCheckedChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ShockQuestion c;

    public az(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = (((i2 | 35) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!compoundButton.isChecked()) {
            ShockQuestion shockQuestion = this.c;
            shockQuestion.bK = false;
            shockQuestion.bP = false;
            int i6 = a;
            int i7 = (-2) - (((i6 ^ 46) + ((i6 & 46) << 1)) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                shockQuestion.cu.setVisibility(108);
            } else {
                shockQuestion.cu.setVisibility(8);
            }
            int i8 = b;
            int i9 = i8 & 69;
            int i10 = -(-(i8 | 69));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i12 = b + 41;
        a = i12 % 128;
        int i13 = i12 % 2;
        ShockQuestion shockQuestion2 = this.c;
        int i14 = shockQuestion2.aX;
        int i15 = shockQuestion2.bk;
        int i16 = b;
        int i17 = ((i16 ^ 102) + ((i16 & 102) << 1)) - 1;
        a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = -(-shockQuestion2.cq);
        if (i14 != ((i15 | i19) << 1) - (i15 ^ i19)) {
            int i20 = b;
            int i21 = (i20 & (-110)) | ((~i20) & 109);
            int i22 = -(-((i20 & 109) << 1));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            shockQuestion2.bK = true;
            int i25 = a;
            int i26 = (i25 ^ 61) + ((i25 & 61) << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
        }
        shockQuestion2.bP = true;
        shockQuestion2.cu.setVisibility(0);
        int i28 = b;
        int i29 = ((i28 | 79) << 1) - (((~i28) & 79) | (i28 & (-80)));
        a = i29 % 128;
        if (i29 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
