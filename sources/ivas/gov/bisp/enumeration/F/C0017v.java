package ivas.gov.bisp.enumeration.F;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h;
import androidx.savedstate.b;
import ivas.gov.bisp.enumeration.OoooOOo.o000000O;
import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p054c.c;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.F.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0017v implements c {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ FragmentActivity c;

    public C0017v(FragmentActivity fragmentActivity) {
        this.c = fragmentActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p054c.c
    public void b(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        o000000O<?> o000000o = this.c.j.c;
        h hVar = o000000o.d;
        int i5 = b + 71;
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        hVar.e(o000000o, o000000o, null);
        b bVar = this.c.e.b;
        int i7 = a;
        int i8 = ((i7 | 37) << 1) - (i7 ^ 37);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            bVar.b("android:support:fragments");
            obj.hashCode();
            throw null;
        }
        Bundle bundleB = bVar.b("android:support:fragments");
        if (bundleB == null) {
            int i9 = a;
            int i10 = ((i9 ^ 114) + ((i9 & 114) << 1)) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 54 / 0;
                return;
            }
            return;
        }
        Parcelable parcelable = bundleB.getParcelable("android:support:fragments");
        FragmentActivity fragmentActivity = this.c;
        int i12 = b + 55;
        a = i12 % 128;
        int i13 = i12 % 2;
        o000000O<?> o000000o2 = fragmentActivity.j.c;
        if (!(o000000o2 instanceof InterfaceC0106f)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        int i14 = a + 123;
        b = i14 % 128;
        int i15 = i14 % 2;
        o000000o2.d.aa(parcelable);
        int i16 = b;
        int i17 = i16 & 85;
        int i18 = -(-((i16 ^ 85) | i17));
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        if (i19 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
