package ivas.gov.bisp.enumeration.rosterActivity;

/* JADX INFO: loaded from: classes.dex */
public class h implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster.o0O0O00 c;

    public h(ActivityRoster.o0O0O00 o0o0o00) {
        this.c = o0o0o00;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = (i2 | 19) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        (i6 % 2 == 0 ? ActivityRoster.this : ActivityRoster.this).sp_work_activity.setSelection(0);
    }
}
