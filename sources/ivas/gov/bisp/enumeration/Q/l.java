package ivas.gov.bisp.enumeration.Q;

import android.view.View;
import android.widget.Button;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public class l implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ com.google.android.material.datepicker.e c;

    public l(com.google.android.material.datepicker.e eVar) {
        this.c = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Button button;
        r rVarE;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = (i2 | 39) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            com.google.android.material.datepicker.e eVar = this.c;
            button = eVar.q;
            rVarE = eVar.e();
            int i7 = 74 / 0;
        } else {
            com.google.android.material.datepicker.e eVar2 = this.c;
            button = eVar2.q;
            rVarE = eVar2.e();
        }
        int i8 = b + 73;
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            button.setEnabled(rVarE.q());
            CheckableImageButton checkableImageButton = this.c.p;
            obj.hashCode();
            throw null;
        }
        button.setEnabled(rVarE.q());
        CheckableImageButton checkableImageButton2 = this.c.p;
        int i9 = b;
        int i10 = i9 | 9;
        int i11 = i10 << 1;
        int i12 = -((~(i9 & 9)) & i10);
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            checkableImageButton2.toggle();
            CheckableImageButton checkableImageButton3 = this.c.p;
            obj.hashCode();
            throw null;
        }
        checkableImageButton2.toggle();
        com.google.android.material.datepicker.e eVar3 = this.c;
        CheckableImageButton checkableImageButton4 = eVar3.p;
        int i14 = a;
        int i15 = ((i14 & (-80)) | ((~i14) & 79)) + ((i14 & 79) << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            eVar3.h(checkableImageButton4);
            this.c.f();
        } else {
            eVar3.h(checkableImageButton4);
            this.c.f();
            obj.hashCode();
            throw null;
        }
    }
}
