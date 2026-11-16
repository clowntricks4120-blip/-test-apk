package ivas.gov.bisp.enumeration.Q;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public class z extends RecyclerView.o00O0O {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ com.google.android.material.datepicker.z c;
    public final /* synthetic */ MaterialButton d;
    public final /* synthetic */ com.google.android.material.datepicker.h e;

    public z(com.google.android.material.datepicker.h hVar, com.google.android.material.datepicker.z zVar, MaterialButton materialButton) {
        this.e = hVar;
        this.c = zVar;
        this.d = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public void b(RecyclerView recyclerView, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - ((i3 + 22) ^ (-1));
        a = i4 % 128;
        int i5 = i4 % 2;
        if (i == 0) {
            int i6 = i3 + 91;
            a = i6 % 128;
            int i7 = i6 % 2;
            recyclerView.announceForAccessibility(this.d.getText());
            int i8 = a;
            int i9 = i8 & 63;
            int i10 = (i8 | 63) & (~i9);
            int i11 = i9 << 1;
            int i12 = (i10 & i11) + (i10 | i11);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a;
        int i15 = ((i14 | 26) << 1) - (i14 ^ 26);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public void c(RecyclerView recyclerView, int i, int i2) {
        int iBr;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 61;
        int i6 = (i4 ^ 61) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (i < 0) {
            iBr = this.e.d().aW();
            int i8 = b;
            int i9 = i8 & 53;
            int i10 = -(-((i8 ^ 53) | i9));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            iBr = this.e.d().br();
            int i13 = a;
            int i14 = (i13 ^ 99) + ((i13 & 99) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        com.google.android.material.datepicker.h hVar = this.e;
        J jH = this.c.h(iBr);
        int i16 = a;
        int i17 = ((i16 ^ 91) | (i16 & 91)) << 1;
        int i18 = -(((~i16) & 91) | (i16 & (-92)));
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        int i20 = i19 % 2;
        hVar.f = jH;
        MaterialButton materialButton = this.d;
        int i21 = a + 95;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            J j = this.c.f.b;
            obj.hashCode();
            throw null;
        }
        com.google.android.material.datepicker.z zVar = this.c;
        J j2 = zVar.f.b;
        int i22 = b + 31;
        a = i22 % 128;
        if (i22 % 2 == 0) {
            j2.i(iBr).g(zVar.d);
            throw null;
        }
        String strG = j2.i(iBr).g(zVar.d);
        int i23 = a;
        int i24 = (i23 ^ 53) + ((i23 & 53) << 1);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            materialButton.setText(strG);
        } else {
            materialButton.setText(strG);
            int i25 = 41 / 0;
        }
    }
}
