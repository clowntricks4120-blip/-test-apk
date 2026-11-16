package ivas.gov.bisp.enumeration.bI;

import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bI.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0125v implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public C0125v(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = (i2 | 17) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.aJ = arrayList;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityRoster activityRoster = this.c;
        activityRoster.aJ = arrayList;
        activityRoster.bN.R = arrayList;
        int i7 = b;
        int i8 = (i7 ^ 29) + ((i7 & 29) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }
}
