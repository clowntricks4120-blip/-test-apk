package ivas.gov.bisp.enumeration.p036bi;

import android.os.CountDownTimer;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.CitizenData;
import java.util.Iterator;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class aQ extends CountDownTimer {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateRosterActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aQ(UpdateRosterActivity updateRosterActivity, long j, long j2) {
        super(j, j2);
        this.c = updateRosterActivity;
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 13) + (i2 | 13);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 107) << 1) - (i2 ^ 107);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.c.bg.f().iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<CitizenData> it = this.c.bg.f().iterator();
        int i4 = b;
        int i5 = i4 & 47;
        int i6 = (i4 | 47) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        String str = BuildConfig.FLAVOR;
        boolean z = false;
        while (it.hasNext()) {
            int i10 = b;
            int i11 = i10 & 91;
            int i12 = (i10 ^ 91) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                String str2 = it.next().cnic;
                obj.hashCode();
                throw null;
            }
            CitizenData next = it.next();
            String str3 = next.cnic;
            String str4 = this.c.bo;
            int i14 = a;
            int i15 = (i14 & 103) + (i14 | 103);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                str3.equals(str4);
                throw null;
            }
            if (str3.equals(str4)) {
                int i16 = b;
                int i17 = i16 & 123;
                int i18 = (i16 | 123) & (~i17);
                int i19 = i17 << 1;
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                str = next.data;
                int i22 = a;
                int i23 = ((i22 | 5) << 1) - (i22 ^ 5);
                b = i23 % 128;
                int i24 = i23 % 2;
                z = true;
            }
        }
        this.c.bu.dismiss();
        if (!z) {
            UpdateRosterActivity updateRosterActivity = this.c;
            UpdateRosterActivity.v(updateRosterActivity, updateRosterActivity.bo);
            int i25 = a;
            int i26 = (i25 ^ 93) + ((i25 & 93) << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
            return;
        }
        int i28 = b;
        int i29 = (i28 ^ 91) + ((i28 & 91) << 1);
        a = i29 % 128;
        int i30 = i29 % 2;
        UpdateRosterActivity.u(this.c, str, false);
        int i31 = a;
        int i32 = ((i31 ^ 76) + ((i31 & 76) << 1)) - 1;
        b = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 28 / 0;
        }
    }
}
