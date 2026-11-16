package ivas.gov.bisp.enumeration.p088k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0318p {
    private static int a = 1;
    private static int b;
    public final CheckedTextView c;
    public boolean g;
    public ColorStateList d = null;
    public PorterDuff.Mode e = null;
    public boolean f = false;
    public boolean h = false;

    public C0318p(CheckedTextView checkedTextView) {
        this.c = checkedTextView;
    }

    public void c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 71) + (i2 | 71);
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable checkMarkDrawable = this.c.getCheckMarkDrawable();
        Object obj = null;
        if (checkMarkDrawable != null) {
            int i5 = b;
            int i6 = ((i5 | 7) << 1) - (i5 ^ 7);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.f || this.h) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (!(!this.f)) {
                    int i7 = a;
                    int i8 = (i7 & (-126)) | ((~i7) & 125);
                    int i9 = -(-((i7 & 125) << 1));
                    int i10 = (i8 & i9) + (i9 | i8);
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        drawableMutate.setTintList(this.d);
                        obj.hashCode();
                        throw null;
                    }
                    drawableMutate.setTintList(this.d);
                    int i11 = a + 77;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                }
                if (!(!this.h)) {
                    int i13 = b + 61;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    drawableMutate.setTintMode(this.e);
                    int i15 = a;
                    int i16 = i15 ^ 67;
                    int i17 = ((i15 & 67) | i16) << 1;
                    int i18 = -i16;
                    int i19 = (i17 & i18) + (i17 | i18);
                    b = i19 % 128;
                    int i20 = i19 % 2;
                }
                if (!(!drawableMutate.isStateful())) {
                    int i21 = b;
                    int i22 = (i21 & 25) + (i21 | 25);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    int[] drawableState = this.c.getDrawableState();
                    if (i23 == 0) {
                        drawableMutate.setState(drawableState);
                        int i24 = 32 / 0;
                    } else {
                        drawableMutate.setState(drawableState);
                    }
                    int i25 = a;
                    int i26 = (i25 & 115) + (i25 | 115);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                }
                this.c.setCheckMarkDrawable(drawableMutate);
                int i28 = a;
                int i29 = i28 & 57;
                int i30 = -(-((i28 ^ 57) | i29));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
            }
        }
        int i33 = b;
        int i34 = ((i33 & (-126)) | ((~i33) & 125)) + ((i33 & 125) << 1);
        a = i34 % 128;
        if (i34 % 2 == 0) {
            throw null;
        }
    }
}
