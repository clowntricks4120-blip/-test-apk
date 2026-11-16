package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.models.Roster;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0212s implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityRoster d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0212s(ActivityRoster activityRoster, int i) {
        this.c = i;
        this.d = activityRoster;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 49) + ((i3 & 49) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.c;
        if (i6 == 0) {
            ActivityRoster activityRoster = this.d;
            int i7 = ActivityRoster.af;
            activityRoster.finish();
            int i8 = a;
            int i9 = (i8 & (-102)) | ((~i8) & 101);
            int i10 = -(-((i8 & 101) << 1));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 8 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        if (i6 == 1) {
            ActivityRoster activityRoster2 = this.d;
            int i13 = ActivityRoster.af;
            activityRoster2.scanClicked(null);
            int i14 = a;
            int i15 = ((i14 ^ 101) | (i14 & 101)) << 1;
            int i16 = -(((~i14) & 101) | (i14 & (-102)));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            return;
        }
        int i19 = i3 & 45;
        int i20 = i19 + ((i3 ^ 45) | i19);
        b = i20 % 128;
        int i21 = i20 % 2;
        ActivityRoster activityRoster3 = this.d;
        activityRoster3.bm = true;
        ArrayList<Roster> arrayList = new ArrayList<>();
        int i22 = a + 1;
        b = i22 % 128;
        if (i22 % 2 == 0) {
            activityRoster3.bj = arrayList;
            arrayList.add(activityRoster3.bn);
            obj.hashCode();
            throw null;
        }
        activityRoster3.bj = arrayList;
        arrayList.add(activityRoster3.bn);
        activityRoster3.Q();
        dialogInterface.dismiss();
        int i23 = a;
        int i24 = i23 & 53;
        int i25 = ((i23 | 53) & (~i24)) + (i24 << 1);
        b = i25 % 128;
        int i26 = i25 % 2;
    }
}
