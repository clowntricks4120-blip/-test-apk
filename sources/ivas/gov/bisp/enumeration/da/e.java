package ivas.gov.bisp.enumeration.da;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActionMenuView c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ BottomAppBar f;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f = bottomAppBar;
        this.c = actionMenuView;
        int i2 = b;
        int i3 = i2 ^ 117;
        int i4 = -(-((i2 & 117) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d = i;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = -(-((i2 ^ 69) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        ActionMenuView actionMenuView = this.c;
        BottomAppBar bottomAppBar = this.f;
        int i8 = this.d;
        int i9 = (-2) - ((i6 + 50) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
        int iD = bottomAppBar.D(actionMenuView, i8, this.e);
        int i11 = a;
        int i12 = i11 & 17;
        int i13 = ((i11 | 17) & (~i12)) + (i12 << 1);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            actionMenuView.setTranslationX(iD);
        } else {
            actionMenuView.setTranslationX(iD);
            throw null;
        }
    }
}
