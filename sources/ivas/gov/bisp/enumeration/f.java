package ivas.gov.bisp.enumeration;

/* JADX INFO: loaded from: classes.dex */
public class f implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster.o0Oo0oo c;

    public f(ActivityRoster.o0Oo0oo o0oo0oo) {
        this.c = o0oo0oo;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 87;
        int i4 = (i2 & 87) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        (i5 % 2 != 0 ? ActivityRoster.this : ActivityRoster.this).sp_attended_school.setSelection(0);
    }
}
