package com.google.android.material.timepicker;

import android.view.View;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.C0283j;

/* JADX INFO: loaded from: classes.dex */
public class c extends C0283j {
    public final /* synthetic */ ClockFaceView a;

    public c(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public void h(View view, al alVar) {
        this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            alVar.d.setTraversalAfter(this.a.w.get(iIntValue - 1));
        }
        alVar.l(al.aXE.c(0, 1, iIntValue, 1, false, view.isSelected()));
    }
}
