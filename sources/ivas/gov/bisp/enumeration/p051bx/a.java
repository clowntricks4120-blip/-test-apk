package ivas.gov.bisp.enumeration.p051bx;

import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.fragments.FragmentPictures;
import ivas.gov.bisp.enumeration.models.AgriResource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 9;
        int i4 = (i2 & 9) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this.c == 0) {
            ((AgriResource) this.d).setIsSelected(z ? 1 : 0);
            int i8 = b;
            int i9 = ((i8 & (-98)) | ((~i8) & 97)) + ((i8 & 97) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i10 = (((i6 | 46) << 1) - (i6 ^ 46)) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i6 & 99;
        int i13 = ((i6 ^ 99) | i12) << 1;
        int i14 = -((i6 | 99) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        FragmentPictures.g((FragmentPictures) this.d, compoundButton, z);
        int i17 = a + 107;
        b = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 99 / 0;
        }
    }
}
