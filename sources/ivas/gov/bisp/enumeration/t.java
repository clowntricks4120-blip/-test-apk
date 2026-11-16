package ivas.gov.bisp.enumeration;

/* JADX INFO: loaded from: classes.dex */
public class t implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster.o0Oo0oo c;

    public t(ActivityRoster.o0Oo0oo o0oo0oo) {
        this.c = o0oo0oo;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b + 75;
        a = i2 % 128;
        int i3 = i2 % 2;
        ActivityRoster.this.sp_employment_status.setSelection(0);
        int i4 = b;
        int i5 = i4 & 95;
        int i6 = -(-((i4 ^ 95) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }
}
