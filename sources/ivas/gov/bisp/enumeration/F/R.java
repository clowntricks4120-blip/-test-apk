package ivas.gov.bisp.enumeration.F;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.d;
import androidx.savedstate.b;

/* JADX INFO: loaded from: classes.dex */
public class R implements b.aIh {
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public final /* synthetic */ FragmentActivity c;

    public R(FragmentActivity fragmentActivity) {
        this.c = fragmentActivity;
    }

    @Override // androidx.savedstate.b.aIh
    public Bundle b() {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        FragmentActivity fragmentActivity = this.c;
        int i2 = a;
        int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        while (FragmentActivity.i(fragmentActivity.k(), d.aMa.CREATED)) {
        }
        int i5 = a;
        int i6 = (i5 & (-28)) | ((~i5) & 27);
        int i7 = (i5 & 27) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            this.c.k.j(d.aLZ.ON_STOP);
            obj.hashCode();
            throw null;
        }
        this.c.k.j(d.aLZ.ON_STOP);
        FragmentActivity fragmentActivity2 = this.c;
        int i9 = b;
        int i10 = i9 & 85;
        int i11 = ((i9 | 85) & (~i10)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            fragmentActivity2.j.c.d.ab();
            throw null;
        }
        Parcelable parcelableAb = fragmentActivity2.j.c.d.ab();
        if (parcelableAb != null) {
            int i12 = a + 77;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                bundle.putParcelable("android:support:fragments", parcelableAb);
                throw null;
            }
            bundle.putParcelable("android:support:fragments", parcelableAb);
        }
        int i13 = a;
        int i14 = i13 | 97;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 97)) & i14);
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            return bundle;
        }
        throw null;
    }
}
