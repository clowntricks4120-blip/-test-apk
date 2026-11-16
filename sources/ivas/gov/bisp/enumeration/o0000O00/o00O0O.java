package ivas.gov.bisp.enumeration.o0000O00;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class o00O0O extends ImageButton {
    private static int a = 1;
    private static int b;
    public int c;

    public o00O0O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = getVisibility();
    }

    public final int getUserSetVisibility() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 87) | (i2 & 87)) << 1) - ((i2 & (-88)) | ((~i2) & 87));
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.c;
        int i6 = i2 & 107;
        int i7 = ((i2 ^ 107) | i6) << 1;
        int i8 = -((i2 | 107) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void d(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = a + 29;
        b = i3 % 128;
        int i4 = i3 % 2;
        super.setVisibility(i);
        if (!(!z)) {
            int i5 = b + 107;
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            this.c = i;
            if (i7 == 0) {
                int i8 = 6 / 0;
            }
            int i9 = (((i6 | 3) << 1) - (~(-((i6 & (-4)) | ((~i6) & 3))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = i11 & 17;
        int i13 = (((i11 | 17) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 53;
        int i5 = i4 + ((i3 ^ 53) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.setVisibility(i);
        this.c = i;
        int i7 = a;
        int i8 = i7 & 119;
        int i9 = (i7 ^ 119) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 84 / 0;
        }
    }

    public o00O0O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = getVisibility();
    }
}
