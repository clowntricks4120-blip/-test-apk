package ivas.gov.bisp.enumeration.rosterActivity;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster.o0O0O00 c;

    public e(ActivityRoster.o0O0O00 o0o0o00) {
        this.c = o0o0o00;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = (i2 ^ 107) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        ActivityRoster.this.sp_employment_status.setSelection(0);
        int i7 = b + 33;
        a = i7 % 128;
        int i8 = i7 % 2;
    }
}
