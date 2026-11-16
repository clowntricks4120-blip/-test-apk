package ivas.gov.bisp.enumeration.rosterActivity;

/* JADX INFO: loaded from: classes.dex */
public class j implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster.o0O0O00 c;

    public j(ActivityRoster.o0O0O00 o0o0o00) {
        this.c = o0o0o00;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b + 92;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        ActivityRoster.this.sp_attended_school.setSelection(0);
        int i5 = a;
        int i6 = (i5 & 25) + (i5 | 25);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
