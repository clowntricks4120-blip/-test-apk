package ivas.gov.bisp.enumeration.p085h;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class ap implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Activity c;

    public ap(Activity activity) {
        this.c = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (i3 - (~((i2 ^ 45) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.isFinishing();
            throw null;
        }
        if (!this.c.isFinishing() && !H.c(this.c)) {
            int i5 = b + 115;
            a = i5 % 128;
            int i6 = i5 % 2;
            this.c.recreate();
            int i7 = a;
            int i8 = (i7 ^ 55) + ((i7 & 55) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b + 99;
        a = i10 % 128;
        int i11 = i10 % 2;
    }
}
