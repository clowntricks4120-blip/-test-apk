package ivas.gov.bisp.enumeration.p051bx;

import android.view.View;
import ivas.gov.bisp.enumeration.adapters.AdapterAgriCrop;
import ivas.gov.bisp.enumeration.adapters.AdapterMapListing;
import ivas.gov.bisp.enumeration.adapters.AdapterRosterList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u(Object obj, int i, int i2) {
        this.c = i2;
        this.e = obj;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 114) + ((i2 & 114) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = this.c;
        if (i6 == 0) {
            AdapterAgriCrop.ViewHolder viewHolder = (AdapterAgriCrop.ViewHolder) this.e;
            int i7 = this.d;
            int i8 = i5 + 103;
            b = i8 % 128;
            int i9 = i8 % 2;
            viewHolder.u.h.c(i7);
            int i10 = a;
            int i11 = i10 & 89;
            int i12 = (((i10 ^ 89) | i11) << 1) - ((i10 | 89) & (~i11));
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 83 / 0;
                return;
            }
            return;
        }
        if (i6 == 1) {
            AdapterMapListing adapterMapListing = (AdapterMapListing) this.e;
            int i14 = this.d;
            int i15 = i5 & 103;
            int i16 = (((i5 ^ 103) | i15) << 1) - ((i5 | 103) & (~i15));
            b = i16 % 128;
            int i17 = i16 % 2;
            Objects.requireNonNull(adapterMapListing);
            try {
                adapterMapListing.g.c(i14);
                int i18 = a + 97;
                b = i18 % 128;
                int i19 = i18 % 2;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        int i20 = i5 ^ 29;
        int i21 = (((i5 & 29) | i20) << 1) - i20;
        b = i21 % 128;
        int i22 = i21 % 2;
        int i23 = i5 & 17;
        int i24 = ((((i5 ^ 17) | i23) << 1) - (~(-((i5 | 17) & (~i23))))) - 1;
        b = i24 % 128;
        if (i24 % 2 == 0) {
            AdapterRosterList.OooO00o oooO00o = ((AdapterRosterList) this.e).h;
            obj.hashCode();
            throw null;
        }
        AdapterRosterList adapterRosterList = (AdapterRosterList) this.e;
        int i25 = this.d;
        AdapterRosterList.OooO00o oooO00o2 = adapterRosterList.h;
        int i26 = b;
        int i27 = i26 & 23;
        int i28 = (i26 | 23) & (~i27);
        int i29 = i27 << 1;
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        a = i30 % 128;
        if (i30 % 2 != 0) {
            adapterRosterList.f.get(i25).getCnic();
            throw null;
        }
        oooO00o2.onEditClick(i25, adapterRosterList.f.get(i25).getCnic().replace("-", BuildConfig.FLAVOR));
        int i31 = a;
        int i32 = ((i31 & 97) - (~(i31 | 97))) - 1;
        b = i32 % 128;
        int i33 = i32 % 2;
    }
}
