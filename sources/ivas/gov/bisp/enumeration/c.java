package ivas.gov.bisp.enumeration;

/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster.o0Oo0oo c;

    public c(ActivityRoster.o0Oo0oo o0oo0oo) {
        this.c = o0oo0oo;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = ((((i2 ^ 25) | i3) << 1) - (~(-((i2 | 25) & (~i3))))) - 1;
        a = i4 % 128;
        (i4 % 2 == 0 ? ActivityRoster.this : ActivityRoster.this).sp_highest_education.setSelection(0);
        int i5 = b;
        int i6 = (i5 & 41) + (i5 | 41);
        a = i6 % 128;
        int i7 = i6 % 2;
    }
}
