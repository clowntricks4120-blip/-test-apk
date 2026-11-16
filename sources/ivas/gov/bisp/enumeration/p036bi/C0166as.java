package ivas.gov.bisp.enumeration.p036bi;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.as, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0166as implements CompoundButton.OnCheckedChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ShockQuestion c;

    public C0166as(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 93) + (i2 | 93);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!compoundButton.isChecked()) {
            ShockQuestion shockQuestion = this.c;
            shockQuestion.bL = false;
            LinearLayout linearLayout = shockQuestion.ck;
            int i5 = b;
            int i6 = ((i5 & 78) + (i5 | 78)) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                linearLayout.setVisibility(108);
            } else {
                linearLayout.setVisibility(8);
            }
            int i7 = b + 77;
            a = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = a + 91;
        b = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            ShockQuestion shockQuestion2 = this.c;
            int i10 = shockQuestion2.bq;
            int i11 = shockQuestion2.bt;
            obj.hashCode();
            throw null;
        }
        ShockQuestion shockQuestion3 = this.c;
        int i12 = shockQuestion3.bq;
        int i13 = shockQuestion3.bt;
        int i14 = b;
        int i15 = ((i14 & (-74)) | ((~i14) & 73)) + ((i14 & 73) << 1);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = -(~(-(-shockQuestion3.bu)));
            if (i12 != (((i13 | i16) << 1) - (i13 ^ i16)) - 1) {
                shockQuestion3.bL = true;
                int i17 = a;
                int i18 = i17 & 69;
                int i19 = ((i17 | 69) & (~i18)) + (i18 << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
            }
        } else if (i12 != i13 * shockQuestion3.bu) {
            shockQuestion3.bL = true;
            int i110 = a;
            int i111 = i110 & 69;
            int i112 = ((i110 | 69) & (~i111)) + (i111 << 1);
            b = i112 % 128;
            int i21 = i112 % 2;
        }
        shockQuestion3.ck.setVisibility(0);
        int i22 = a;
        int i23 = ((i22 | 93) << 1) - (i22 ^ 93);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
