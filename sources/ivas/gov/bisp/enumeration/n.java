package ivas.gov.bisp.enumeration;

import android.widget.EditText;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class n implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster.o0Oo0oo c;

    public n(ActivityRoster.o0Oo0oo o0oo0oo) {
        this.c = o0oo0oo;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 37;
        int i4 = (((i2 ^ 37) | i3) << 1) - ((i2 | 37) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        EditText editText = ActivityRoster.this.et_hoursWorked;
        int i6 = a;
        int i7 = (i6 ^ 23) + ((i6 & 23) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            editText.setText(BuildConfig.FLAVOR);
        } else {
            editText.setText(BuildConfig.FLAVOR);
            int i8 = 18 / 0;
        }
    }
}
