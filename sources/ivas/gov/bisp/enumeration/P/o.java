package ivas.gov.bisp.enumeration.P;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ View c;

    public o(View view) {
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = b + 109;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.c.getContext().getSystemService("input_method");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ((InputMethodManager) this.c.getContext().getSystemService("input_method")).showSoftInput(this.c, 1);
        int i3 = b;
        int i4 = (i3 & 83) + (i3 | 83);
        a = i4 % 128;
        int i5 = i4 % 2;
    }
}
