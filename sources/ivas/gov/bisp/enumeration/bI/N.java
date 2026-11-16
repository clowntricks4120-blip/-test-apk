package ivas.gov.bisp.enumeration.bI;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class N implements CompoundButton.OnCheckedChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public N(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((i2 + 82) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (z) {
            int i5 = i2 + 24;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                Objects.requireNonNull(this.c);
                obj.hashCode();
                throw null;
            }
            Objects.requireNonNull(this.c);
        }
        int i7 = b + 91;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
