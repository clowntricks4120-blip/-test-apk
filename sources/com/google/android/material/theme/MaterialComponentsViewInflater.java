package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import ivas.gov.bisp.enumeration.OooOOO0.OooO;
import ivas.gov.bisp.enumeration.OooOOO0.OooO0OO;
import ivas.gov.bisp.enumeration.OooOOO0.o000OOo;
import ivas.gov.bisp.enumeration.OooOOO0.o00Ooo;
import ivas.gov.bisp.enumeration.o00000.OooO00o;
import ivas.gov.bisp.enumeration.o0000OOo.o000oOoO;
import ivas.gov.bisp.enumeration.p087j.O;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends O {
    @Override // ivas.gov.bisp.enumeration.p087j.O
    public OooO0OO c(Context context, AttributeSet attributeSet) {
        return new o000oOoO(context, attributeSet);
    }

    @Override // ivas.gov.bisp.enumeration.p087j.O
    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // ivas.gov.bisp.enumeration.p087j.O
    public OooO e(Context context, AttributeSet attributeSet) {
        return new OooO00o(context, attributeSet);
    }

    @Override // ivas.gov.bisp.enumeration.p087j.O
    public o00Ooo f(Context context, AttributeSet attributeSet) {
        return new ivas.gov.bisp.enumeration.o0000O0.OooO00o(context, attributeSet);
    }

    @Override // ivas.gov.bisp.enumeration.p087j.O
    public o000OOo h(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
