package ivas.gov.bisp.enumeration.U;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class P implements View.OnTouchListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ AutoCompleteTextView c;
    public final /* synthetic */ com.google.android.material.textfield.c d;

    public P(com.google.android.material.textfield.c cVar, AutoCompleteTextView autoCompleteTextView) {
        this.d = cVar;
        this.c = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = b + 81;
        a = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent.getAction() == 1) {
            int i4 = a;
            int i5 = ((i4 ^ 34) + ((i4 & 34) << 1)) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            if (this.d.i()) {
                int i7 = a + 45;
                b = i7 % 128;
                int i8 = i7 % 2;
                this.d.j = false;
                int i9 = a;
                int i10 = i9 & 1;
                int i11 = ((i9 ^ 1) | i10) << 1;
                int i12 = -((i9 | 1) & (~i10));
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            com.google.android.material.textfield.c.h(this.d, this.c);
            int i15 = b;
            int i16 = ((i15 | 55) << 1) - (i15 ^ 55);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b + 77;
        a = i18 % 128;
        if (i18 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
