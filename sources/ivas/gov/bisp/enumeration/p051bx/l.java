package ivas.gov.bisp.enumeration.p051bx;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.adapters.AdapterAgriResource;
import ivas.gov.bisp.enumeration.adapters.AdapterMainMenu;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(RecyclerView.OooO oooO, int i, int i2) {
        this.c = i2;
        this.e = oooO;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 21;
        int i4 = (i2 ^ 21) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.c == 0) {
            AdapterAgriResource adapterAgriResource = (AdapterAgriResource) this.e;
            int i7 = this.d;
            int i8 = ((i6 | 106) << 1) - (i6 ^ 106);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            adapterAgriResource.h.c(i7);
            int i11 = b + 3;
            a = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        int i13 = i6 & 73;
        int i14 = (((i6 ^ 73) | i13) << 1) - ((~i13) & (i6 | 73));
        a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (((i6 | 48) << 1) - (i6 ^ 48)) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
        AdapterMainMenu adapterMainMenu = (AdapterMainMenu) this.e;
        int i18 = this.d;
        Objects.requireNonNull(adapterMainMenu);
        int i19 = b + 49;
        a = i19 % 128;
        int i20 = i19 % 2;
        try {
            adapterMainMenu.f.c(i18);
            int i21 = a;
            int i22 = ((i21 & (-90)) | ((~i21) & 89)) + ((i21 & 89) << 1);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 21 / 0;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }
}
