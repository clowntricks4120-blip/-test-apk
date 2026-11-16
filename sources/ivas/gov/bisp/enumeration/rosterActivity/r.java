package ivas.gov.bisp.enumeration.rosterActivity;

import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class r implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster.o0O0O00 c;

    public r(ActivityRoster.o0O0O00 o0o0o00) {
        this.c = o0o0o00;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (i3 - (~((i2 ^ 17) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        ActivityRoster.this.et_hoursWorked.setText(BuildConfig.FLAVOR);
        int i6 = b + 95;
        a = i6 % 128;
        int i7 = i6 % 2;
    }
}
