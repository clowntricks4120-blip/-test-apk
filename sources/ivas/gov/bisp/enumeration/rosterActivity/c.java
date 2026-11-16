package ivas.gov.bisp.enumeration.rosterActivity;

/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster.o0O0O00 c;

    public c(ActivityRoster.o0O0O00 o0o0o00) {
        this.c = o0o0o00;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-60)) | ((~i2) & 59)) + ((i2 & 59) << 1);
        a = i3 % 128;
        (i3 % 2 != 0 ? ActivityRoster.this : ActivityRoster.this).sp_highest_education.setSelection(0);
    }
}
