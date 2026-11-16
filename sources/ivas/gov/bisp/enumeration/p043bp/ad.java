package ivas.gov.bisp.enumeration.p043bp;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.ActivityRoster;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ad implements CompoundButton.OnCheckedChangeListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public ad(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = b + 41;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            Objects.requireNonNull(this.c);
            int i3 = a;
            int i4 = i3 & 61;
            int i5 = (i3 | 61) & (~i4);
            int i6 = -(-(i4 << 1));
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = b;
        int i10 = (i9 & 59) + (i9 | 59);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
