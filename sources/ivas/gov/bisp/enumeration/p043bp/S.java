package ivas.gov.bisp.enumeration.p043bp;

import android.os.CountDownTimer;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class S extends CountDownTimer {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityBeginSurvey c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(ActivityBeginSurvey activityBeginSurvey, long j, long j2) {
        super(j, j2);
        this.c = activityBeginSurvey;
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        int i = 2 % 2;
        int i2 = b + 51;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.c.aw.l.h(-1).setEnabled(false);
        int i4 = b;
        int i5 = i4 | 69;
        int i6 = i5 << 1;
        int i7 = -((~(i4 & 69)) & i5);
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        b bVar = this.c.aw.l;
        StringBuilder sbW = j.w("اثا ثہ جات اور متفرق معلومات  (");
        int i10 = a;
        int i11 = i10 & 1;
        int i12 = ((i10 ^ 1) | i11) << 1;
        int i13 = -((i10 | 1) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        sbW.append((int) (j / 1000));
        int i16 = b;
        int i17 = (i16 & (-112)) | ((~i16) & 111);
        int i18 = -(-((i16 & 111) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        int i20 = i19 % 2;
        sbW.append(")");
        bVar.setTitle(sbW.toString());
        int i21 = b;
        int i22 = i21 & 111;
        int i23 = (((i21 | 111) & (~i22)) - (~(i22 << 1))) - 1;
        a = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 87 / 0;
        }
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 61;
        int i4 = (((i2 | 61) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.c.aw.l.setTitle("اثا ثہ جات اور متفرق معلومات");
            int i5 = 4 / 0;
        } else {
            this.c.aw.l.setTitle("اثا ثہ جات اور متفرق معلومات");
        }
        Button buttonH = this.c.aw.l.h(-1);
        int i6 = a;
        int i7 = (-2) - (((i6 & 16) + (i6 | 16)) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 == 0) {
            buttonH.setEnabled(false);
        } else {
            buttonH.setEnabled(true);
        }
        b bVar = this.c.aw.l;
        int i8 = a;
        int i9 = i8 & 79;
        int i10 = (((i8 | 79) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        Button buttonH2 = bVar.h(-1);
        AppCompatActivity appCompatActivity = this.c.ae;
        Object obj = l.c;
        int i12 = (-2) - ((a + 64) ^ (-1));
        b = i12 % 128;
        if (i12 % 2 == 0) {
            buttonH2.setBackgroundColor(l.aUI.b(appCompatActivity, R.color.colorButtonGreen));
            int i13 = 73 / 0;
        } else {
            buttonH2.setBackgroundColor(l.aUI.b(appCompatActivity, R.color.colorButtonGreen));
        }
        Button buttonH3 = this.c.aw.l.h(-1);
        int i14 = a;
        int i15 = i14 & 81;
        int i16 = ((i14 | 81) & (~i15)) + (i15 << 1);
        b = i16 % 128;
        Object obj2 = null;
        if (i16 % 2 == 0) {
            l.aUI.b(this.c.ae, R.color.white);
            obj2.hashCode();
            throw null;
        }
        int iB = l.aUI.b(this.c.ae, R.color.white);
        int i17 = b;
        int i18 = (((i17 & (-104)) | ((~i17) & 103)) - (~((i17 & 103) << 1))) - 1;
        a = i18 % 128;
        if (i18 % 2 == 0) {
            buttonH3.setTextColor(iB);
        } else {
            buttonH3.setTextColor(iB);
            throw null;
        }
    }
}
