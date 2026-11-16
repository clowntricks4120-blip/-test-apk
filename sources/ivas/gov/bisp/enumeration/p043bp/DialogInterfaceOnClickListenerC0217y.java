package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0217y implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int j;
    public static final /* synthetic */ DialogInterfaceOnClickListenerC0217y d = new DialogInterfaceOnClickListenerC0217y(0);
    public static final /* synthetic */ DialogInterfaceOnClickListenerC0217y e = new DialogInterfaceOnClickListenerC0217y(1);
    public static final /* synthetic */ DialogInterfaceOnClickListenerC0217y g = new DialogInterfaceOnClickListenerC0217y(2);
    public static final /* synthetic */ DialogInterfaceOnClickListenerC0217y f = new DialogInterfaceOnClickListenerC0217y(3);
    public static final /* synthetic */ DialogInterfaceOnClickListenerC0217y h = new DialogInterfaceOnClickListenerC0217y(4);
    public static final /* synthetic */ DialogInterfaceOnClickListenerC0217y i = new DialogInterfaceOnClickListenerC0217y(5);
    public static final /* synthetic */ DialogInterfaceOnClickListenerC0217y c = new DialogInterfaceOnClickListenerC0217y(6);

    static {
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = (i2 ^ 5) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0217y(int i2) {
        this.j = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 + 119;
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.j;
        if (i7 == 0) {
            int i8 = ActivityRoster.af;
            dialogInterface.dismiss();
            int i9 = b;
            int i10 = (i9 ^ 3) + ((i9 & 3) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        if (i7 == 1) {
            int i12 = UpdateRosterActivity.af;
            dialogInterface.dismiss();
            int i13 = a;
            int i14 = i13 & 35;
            int i15 = ((i13 | 35) & (~i14)) + (i14 << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 50 / 0;
                return;
            }
            return;
        }
        if (i7 == 2) {
            int i17 = DobDiscrepancy.ac;
            dialogInterface.dismiss();
            int i18 = a;
            int i19 = i18 & 1;
            int i20 = (i18 | 1) & (~i19);
            int i21 = -(-(i19 << 1));
            int i22 = (i20 & i21) + (i20 | i21);
            b = i22 % 128;
            int i23 = i22 % 2;
            return;
        }
        Object obj = null;
        if (i7 == 3) {
            Pattern pattern = ChangePasswordActivity.r;
            dialogInterface.dismiss();
            int i24 = a;
            int i25 = (i24 ^ 51) + ((i24 & 51) << 1);
            b = i25 % 128;
            if (i25 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (i7 == 4) {
            Pattern pattern2 = PasswordResetActivity.s;
            dialogInterface.dismiss();
            int i26 = b;
            int i27 = i26 & 125;
            int i28 = i27 + ((i26 ^ 125) | i27);
            a = i28 % 128;
            if (i28 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (i7 == 5) {
            int i29 = ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster.af;
            dialogInterface.dismiss();
            int i30 = b;
            int i31 = ((((i30 ^ 73) | (i30 & 73)) << 1) - (~(-(((~i30) & 73) | (i30 & (-74)))))) - 1;
            a = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 98 / 0;
                return;
            }
            return;
        }
        int i33 = i4 ^ 93;
        int i34 = ((i4 & 93) | i33) << 1;
        int i35 = -i33;
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        a = i36 % 128;
        int i37 = i36 % 2;
        int i38 = i4 + 97;
        a = i38 % 128;
        if (i38 % 2 == 0) {
            int i39 = OfflineRosterActivity.af;
            dialogInterface.dismiss();
            obj.hashCode();
            throw null;
        }
        int i40 = OfflineRosterActivity.af;
        dialogInterface.dismiss();
        int i41 = b;
        int i42 = (i41 & 121) + (i41 | 121);
        a = i42 % 128;
        int i43 = i42 % 2;
    }
}
