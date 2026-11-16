package ivas.gov.bisp.enumeration.p043bp;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.ActivityRoster;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class D implements CompoundButton.OnCheckedChangeListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public D(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 15;
        int i4 = ((i2 & 15) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!z)) {
            int i7 = ((i2 ^ 71) | (i2 & 71)) << 1;
            int i8 = -(((~i2) & 71) | (i2 & (-72)));
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            Objects.requireNonNull(this.c);
            if (i10 == 0) {
                int i11 = 80 / 0;
            }
        }
        int i12 = a;
        int i13 = (i12 ^ 31) + ((i12 & 31) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
    }
}
