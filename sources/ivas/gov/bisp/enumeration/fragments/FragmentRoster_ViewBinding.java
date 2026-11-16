package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentRoster_ViewBinding implements Unbinder {
    private static int a = 1;
    private static int b;
    private FragmentRoster target;

    public FragmentRoster_ViewBinding(FragmentRoster fragmentRoster, View view) {
        this.target = fragmentRoster;
        fragmentRoster.buttonAddMore = (Button) u.b(u.c(view, R.id.btn_add_more, "field 'buttonAddMore'"), R.id.btn_add_more, "field 'buttonAddMore'", Button.class);
        fragmentRoster.btn_add_nadra = (Button) u.b(u.c(view, R.id.btn_add_nadra, "field 'btn_add_nadra'"), R.id.btn_add_nadra, "field 'btn_add_nadra'", Button.class);
        fragmentRoster.mRecyclerView = (RecyclerView) u.b(u.c(view, R.id.my_recycler_view, "field 'mRecyclerView'"), R.id.my_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 67;
        int i4 = -(-((i2 & 67) << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        FragmentRoster fragmentRoster = this.target;
        if (fragmentRoster == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i7 = (i2 ^ 101) + ((i2 & 101) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        this.target = null;
        fragmentRoster.buttonAddMore = null;
        fragmentRoster.btn_add_nadra = null;
        int i9 = a;
        int i10 = i9 & 41;
        int i11 = ((i9 ^ 41) | i10) << 1;
        int i12 = -((i9 | 41) & (~i10));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        fragmentRoster.mRecyclerView = null;
        if (i14 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
