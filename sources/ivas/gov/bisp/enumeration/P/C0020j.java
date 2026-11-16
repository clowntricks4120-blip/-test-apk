package ivas.gov.bisp.enumeration.P;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.p081d.C0283j;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.P.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0020j extends C0283j {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ CheckableImageButton f;

    public C0020j(CheckableImageButton checkableImageButton) {
        this.f = checkableImageButton;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public void g(View view, AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 83) << 1) - (i2 ^ 83);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
            throw null;
        }
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f.isChecked());
        int i4 = b;
        int i5 = i4 & 117;
        int i6 = -(-((i4 ^ 117) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public void h(View view, al alVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 61) + (i2 | 61);
        b = i3 % 128;
        int i4 = i3 % 2;
        View.AccessibilityDelegate accessibilityDelegate = this.d;
        AccessibilityNodeInfo accessibilityNodeInfo = alVar.d;
        int i5 = a + 39;
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            throw null;
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        alVar.d.setCheckable(this.f.b);
        int i6 = b;
        int i7 = i6 & 99;
        int i8 = ((i6 | 99) & (~i7)) + (i7 << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            this.f.isChecked();
            AccessibilityNodeInfo accessibilityNodeInfo2 = alVar.d;
            throw null;
        }
        alVar.d.setChecked(this.f.isChecked());
        int i9 = a + 115;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
