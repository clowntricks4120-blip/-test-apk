package ivas.gov.bisp.enumeration.Q;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.C0283j;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.Q.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0024p extends C0283j {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ com.google.android.material.datepicker.h f;

    public C0024p(com.google.android.material.datepicker.h hVar) {
        this.f = hVar;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public void h(View view, al alVar) {
        String string;
        int i = 2 % 2;
        int i2 = a + 63;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            View.AccessibilityDelegate accessibilityDelegate = this.d;
            AccessibilityNodeInfo accessibilityNodeInfo = alVar.d;
            obj.hashCode();
            throw null;
        }
        this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
        if (this.f.l.getVisibility() == 0) {
            int i3 = b;
            int i4 = ((i3 ^ 38) + ((i3 & 38) << 1)) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                this.f.getString(R.string.mtrl_picker_toggle_to_year_selection);
                obj.hashCode();
                throw null;
            }
            string = this.f.getString(R.string.mtrl_picker_toggle_to_year_selection);
            int i5 = b + 7;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 4;
            }
        } else {
            string = this.f.getString(R.string.mtrl_picker_toggle_to_day_selection);
            int i7 = b;
            int i8 = i7 & 93;
            int i9 = -(-((i7 ^ 93) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 % 3;
            }
        }
        alVar.m(string);
        int i12 = (-2) - ((b + 12) ^ (-1));
        a = i12 % 128;
        int i13 = i12 % 2;
    }
}
