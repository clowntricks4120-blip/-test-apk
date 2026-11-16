package ivas.gov.bisp.enumeration.activitybase;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.utils.SessionManager;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 1;
    private static int b;
    public int c = 0;
    public Boolean d = Boolean.FALSE;
    public CountDownTimer e;
    public aPw f;
    public Activity g;

    public interface aPw {
        void timerFinish();
    }

    public c(Activity activity, aPw apw) {
        this.g = activity;
        this.f = apw;
    }

    public class baM extends CountDownTimer {
        private static int a = 1;
        private static int b;

        public baM(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 73;
            int i4 = ((i2 | 73) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            String string;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-22)) | ((~i2) & 21);
            int i4 = -(-((i2 & 21) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            c cVar = c.this;
            if (cVar.c == 0) {
                int i7 = a;
                int i8 = (i7 ^ 55) + ((i7 & 55) << 1);
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    cVar.f.timerFinish();
                    int i9 = 42 / 0;
                } else {
                    cVar.f.timerFinish();
                }
                int i10 = b + 5;
                a = i10 % 128;
                int i11 = i10 % 2;
            } else {
                Activity activity = c.this.g;
                w wVar = new w(activity, new SessionManager(activity));
                int i12 = a;
                int i13 = i12 & 97;
                int i14 = -(-((i12 ^ 97) | i13));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                b = i15 % 128;
                int i16 = i15 % 2;
                wVar.execute(new Void[0]);
                int i17 = b;
                int i18 = i17 ^ 31;
                int i19 = (i17 & 31) << 1;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
            }
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("completed!!");
            c cVar2 = c.this;
            int i22 = a;
            int i23 = i22 ^ 3;
            int i24 = -(-((i22 & 3) << 1));
            int i25 = (i23 & i24) + (i24 | i23);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                sbW.append(cVar2.d);
                string = sbW.toString();
                int i26 = 6 / 0;
            } else {
                sbW.append(cVar2.d);
                string = sbW.toString();
            }
            Log.e("timer::", string);
            int i27 = b;
            int i28 = i27 & 49;
            int i29 = -(-((i27 ^ 49) | i28));
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
    }

    public void c() {
        int i = 2 % 2;
        d();
        baM bam = new baM(300000L, 1000L);
        int i2 = b + 49;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.e = bam.start();
            return;
        }
        this.e = bam.start();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((i2 + 6) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        CountDownTimer countDownTimer = this.e;
        if (countDownTimer != null) {
            int i4 = ((i2 | 43) << 1) - (i2 ^ 43);
            b = i4 % 128;
            int i5 = i4 % 2;
            countDownTimer.cancel();
            this.e = null;
            Boolean bool = Boolean.FALSE;
            int i6 = b + 111;
            a = i6 % 128;
            int i7 = i6 % 2;
            this.d = bool;
            Log.e("timer", "timerfinished");
            int i8 = b;
            int i9 = (i8 | 23) << 1;
            int i10 = -(i8 ^ 23);
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = ((i13 ^ 27) - (~(-(-((i13 & 27) << 1))))) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
    }
}
