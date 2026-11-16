package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTree_ViewBinding implements Unbinder {
    private static int a = 1;
    private static int b;
    private FragmentTree target;

    public FragmentTree_ViewBinding(FragmentTree fragmentTree, View view) {
        this.target = fragmentTree;
        fragmentTree.linearLayoutTreeView = (LinearLayout) u.b(u.c(view, R.id.ll_tree_view, "field 'linearLayoutTreeView'"), R.id.ll_tree_view, "field 'linearLayoutTreeView'", LinearLayout.class);
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 96) + ((i2 & 96) << 1)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        FragmentTree fragmentTree = this.target;
        if (fragmentTree == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i6 = ((i4 ^ 75) - (~((i4 & 75) << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        this.target = null;
        fragmentTree.linearLayoutTreeView = null;
        int i8 = a;
        int i9 = (i8 | 41) << 1;
        int i10 = -(((~i8) & 41) | (i8 & (-42)));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
    }
}
