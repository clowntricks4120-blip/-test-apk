package ivas.gov.bisp.enumeration.p036bi;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0170aw implements CompoundButton.OnCheckedChangeListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ShockQuestion c;

    public C0170aw(ShockQuestion shockQuestion) {
        this.c = shockQuestion;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 91;
        int i4 = (i2 & 91) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (!compoundButton.isChecked()) {
            this.c.cw.setVisibility(8);
            int i7 = a + 125;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i8 = a;
        int i9 = i8 & 15;
        int i10 = (i8 ^ 15) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        (i11 % 2 != 0 ? this.c : this.c).cw.setVisibility(0);
        int i12 = b;
        int i13 = i12 & 97;
        int i14 = ((((i12 ^ 97) | i13) << 1) - (~(-((i12 | 97) & (~i13))))) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
    }
}
