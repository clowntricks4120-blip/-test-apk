package ivas.gov.bisp.enumeration.fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class FragmentIqrarNama extends Fragment implements e {
    private static int a = 0;
    private static int b = 1;
    private View parentView = null;

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = i3 + ((i2 ^ 9) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 81;
        int i7 = ((i2 ^ 81) | i6) << 1;
        int i8 = -((i2 | 81) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-82)) | ((~i2) & 81);
        int i4 = (i2 & 81) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = ((i2 ^ 69) | i3) << 1;
        int i5 = -((i2 | 69) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 63) + (i2 | 63);
        a = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (this.parentView == null) {
                int i5 = i2 + 17;
                a = i5 % 128;
                View viewInflate = i5 % 2 != 0 ? layoutInflater.inflate(R.layout.fragment_iqrar_nama, viewGroup, true) : layoutInflater.inflate(R.layout.fragment_iqrar_nama, viewGroup, false);
                int i6 = b;
                int i7 = (i6 ^ 53) + ((i6 & 53) << 1);
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    this.parentView = viewInflate;
                    ButterKnife.c(this, viewInflate);
                    throw null;
                }
                this.parentView = viewInflate;
                ButterKnife.c(this, viewInflate);
            }
        } catch (Exception unused) {
        }
        View view = this.parentView;
        int i8 = a;
        int i9 = i8 & 57;
        int i10 = (i8 | 57) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        return view;
    }
}
