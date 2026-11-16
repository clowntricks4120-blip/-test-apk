package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.t;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentAgriculture_ViewBinding implements Unbinder {
    private static int a = 0;
    private static int b = 1;
    private FragmentAgriculture target;
    private View view7f0a009b;

    public FragmentAgriculture_ViewBinding(final FragmentAgriculture fragmentAgriculture, View view) {
        this.target = fragmentAgriculture;
        fragmentAgriculture.spinnerAgri = (Spinner) u.b(u.c(view, R.id.sp_agri_option, "field 'spinnerAgri'"), R.id.sp_agri_option, "field 'spinnerAgri'", Spinner.class);
        View viewC = u.c(view, R.id.btn_proceed, "field 'buttonProceed' and method 'onProceedClick'");
        fragmentAgriculture.buttonProceed = (Button) u.b(viewC, R.id.btn_proceed, "field 'buttonProceed'", Button.class);
        this.view7f0a009b = viewC;
        viewC.setOnClickListener(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentAgriculture_ViewBinding.1
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.V.t
            public void doClick(View view2) {
                int i = 2 % 2;
                int i2 = b;
                int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    fragmentAgriculture.onProceedClick(view2);
                } else {
                    fragmentAgriculture.onProceedClick(view2);
                    int i4 = 53 / 0;
                }
            }
        });
        fragmentAgriculture.recyclerViewMembers = (RecyclerView) u.b(u.c(view, R.id.rv_members, "field 'recyclerViewMembers'"), R.id.rv_members, "field 'recyclerViewMembers'", RecyclerView.class);
        fragmentAgriculture.cardViewMembers = (CardView) u.b(u.c(view, R.id.cv_members, "field 'cardViewMembers'"), R.id.cv_members, "field 'cardViewMembers'", CardView.class);
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = a + 97;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        FragmentAgriculture fragmentAgriculture = this.target;
        if (fragmentAgriculture == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i5 = (i3 ^ 1) + ((i3 & 1) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.target = null;
        fragmentAgriculture.spinnerAgri = null;
        int i7 = b;
        int i8 = (-2) - (((i7 ^ 92) + ((i7 & 92) << 1)) ^ (-1));
        a = i8 % 128;
        if (i8 % 2 != 0) {
            fragmentAgriculture.buttonProceed = null;
            fragmentAgriculture.recyclerViewMembers = null;
            fragmentAgriculture.cardViewMembers = null;
            int i9 = 33 / 0;
        } else {
            fragmentAgriculture.buttonProceed = null;
            fragmentAgriculture.recyclerViewMembers = null;
            fragmentAgriculture.cardViewMembers = null;
        }
        this.view7f0a009b.setOnClickListener(null);
        this.view7f0a009b = null;
        int i10 = a;
        int i11 = (((i10 & (-112)) | ((~i10) & 111)) - (~((i10 & 111) << 1))) - 1;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 83 / 0;
        }
    }
}
