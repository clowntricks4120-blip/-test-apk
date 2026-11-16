package ivas.gov.bisp.enumeration;

/* JADX INFO: loaded from: classes.dex */
public class s implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster.o0Oo0oo c;

    public s(ActivityRoster.o0Oo0oo o0oo0oo) {
        this.c = o0oo0oo;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 63) + (i2 | 63);
        a = i3 % 128;
        int i4 = i3 % 2;
        ActivityRoster.this.sp_work_activity.setSelection(0);
    }
}
