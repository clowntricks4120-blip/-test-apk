package ivas.gov.bisp.enumeration.M;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class W extends ClickableSpan {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final al d;
    public final int e;

    public W(int i, al alVar, int i2) {
        this.c = i;
        this.d = alVar;
        this.e = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        int i2 = this.c;
        int i3 = a;
        int i4 = i3 & 3;
        int i5 = (i3 ^ 3) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", i2);
        al alVar = this.d;
        int i8 = this.e;
        int i9 = a;
        int i10 = i9 & 21;
        int i11 = ((i9 ^ 21) | i10) << 1;
        int i12 = -((i9 | 21) & (~i10));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        alVar.d.performAction(i8, bundle);
        int i15 = b + 83;
        a = i15 % 128;
        int i16 = i15 % 2;
    }
}
