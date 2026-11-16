package ivas.gov.bisp.enumeration.OooOO0o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import ivas.gov.bisp.enumeration.p099u.c;

/* JADX INFO: loaded from: classes.dex */
public class OooOo00$OooO0OO extends FrameLayout implements c {
    private static int a = 0;
    private static int b = 1;
    public final CollapsibleActionView c;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOo00$OooO0OO(View view) {
        super(view.getContext());
        this.c = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // ivas.gov.bisp.enumeration.p099u.c
    public void a() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 99) | (i2 & 99)) << 1;
        int i4 = -(((~i2) & 99) | (i2 & (-100)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.onActionViewCollapsed();
            return;
        }
        this.c.onActionViewCollapsed();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.c
    public void c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = i3 + ((i2 ^ 93) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.c.onActionViewExpanded();
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
