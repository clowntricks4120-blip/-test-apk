package ivas.gov.bisp.enumeration.p036bi;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0168au implements CompoundButton.OnCheckedChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ShockQuestion c;

    public C0168au(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005d  */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 29;
        int i4 = -(-(i2 | 29));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (!compoundButton.isChecked()) {
            ShockQuestion shockQuestion = this.c;
            shockQuestion.bK = false;
            shockQuestion.bM = false;
            int i7 = a;
            int i8 = (i7 & (-58)) | ((~i7) & 57);
            int i9 = (i7 & 57) << 1;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                shockQuestion.cd.setVisibility(0);
                return;
            } else {
                shockQuestion.cd.setVisibility(8);
                return;
            }
        }
        int i11 = b;
        int i12 = (i11 & (-8)) | ((~i11) & 7);
        int i13 = (i11 & 7) << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        ShockQuestion shockQuestion2 = this.c;
        int i16 = shockQuestion2.aX;
        int i17 = shockQuestion2.bk;
        int i18 = a;
        int i19 = (i18 ^ 15) + ((i18 & 15) << 1);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = -(-shockQuestion2.cq);
            int i21 = ((~i20) & i17) | ((~i17) & i20);
            int i22 = -(-((i17 & i20) << 1));
            if (i16 != (i21 & i22) + (i22 | i21)) {
                shockQuestion2.bK = true;
                int i23 = b;
                int i24 = i23 & 83;
                int i25 = ((i23 | 83) & (~i24)) + (i24 << 1);
                a = i25 % 128;
                int i26 = i25 % 2;
            }
        } else if (i16 != i17 % shockQuestion2.cq) {
            shockQuestion2.bK = true;
            int i27 = b;
            int i28 = i27 & 83;
            int i29 = ((i27 | 83) & (~i28)) + (i28 << 1);
            a = i29 % 128;
            int i210 = i29 % 2;
        }
        if (shockQuestion2.bm != (shockQuestion2.bn - (~(-(-shockQuestion2.bp)))) - 1) {
            int i30 = b;
            int i31 = i30 & 17;
            int i32 = i31 + ((i30 ^ 17) | i31);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                shockQuestion2.bM = false;
            } else {
                shockQuestion2.bM = true;
            }
        }
        shockQuestion2.cd.setVisibility(0);
        int i33 = a;
        int i34 = (i33 & 103) + (i33 | 103);
        b = i34 % 128;
        if (i34 % 2 == 0) {
            int i35 = 92 / 0;
        }
    }
}
