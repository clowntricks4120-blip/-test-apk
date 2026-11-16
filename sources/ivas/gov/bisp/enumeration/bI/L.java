package ivas.gov.bisp.enumeration.bI;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class L implements CompoundButton.OnCheckedChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public L(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = ((i2 ^ 111) | i3) << 1;
        int i5 = -((i2 | 111) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (z) {
            int i9 = (-2) - ((i7 + 76) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
            Objects.requireNonNull(this.c);
            int i11 = b;
            int i12 = i11 & 41;
            int i13 = (((i11 ^ 41) | i12) << 1) - ((i11 | 41) & (~i12));
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = i15 & 93;
        int i17 = (i15 ^ 93) | i16;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
    }
}
