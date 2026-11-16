package ivas.gov.bisp.enumeration.rosterActivity;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.rosterActivity.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0326p implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity.OooOo c;

    public RunnableC0326p(OfflineRosterActivity.OooOo oooOo) {
        this.c = oooOo;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 60) << 1) - (i2 ^ 60);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        OfflineRosterActivity.this.sp_highest_education.setSelection(0);
        int i6 = a;
        int i7 = i6 | 33;
        int i8 = ((i7 << 1) - (~(-((~(i6 & 33)) & i7)))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
