package ivas.gov.bisp.enumeration.U;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    private static int a = 1;
    private static int b;
    public TextInputLayout c;
    public Context d;
    public CheckableImageButton e;
    public final int f;

    public l(TextInputLayout textInputLayout, int i) {
        this.c = textInputLayout;
        this.d = textInputLayout.getContext();
        this.e = textInputLayout.getEndIconView();
        this.f = i;
    }

    public abstract void c();

    public boolean d(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 31) << 1) - (i3 ^ 31);
        a = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public void e(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 115;
        int i4 = ((((i2 & 115) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
    }
}
