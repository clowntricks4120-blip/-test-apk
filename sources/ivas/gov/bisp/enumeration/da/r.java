package ivas.gov.bisp.enumeration.da;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r extends AnimatorListenerAdapter {
    private static int a = 0;
    private static int b = 1;
    public boolean c;
    public final /* synthetic */ ActionMenuView d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ BottomAppBar g;

    public r(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.g = bottomAppBar;
        this.d = actionMenuView;
        this.e = i;
        this.f = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = ((i2 ^ 101) | i3) << 1;
        int i5 = -((i2 | 101) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.c = true;
        int i9 = ((i7 | 81) << 1) - (i7 ^ 81);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z;
        int i = 2 % 2;
        int i2 = b + 121;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.c) {
            int i4 = i3 ^ 77;
            int i5 = (i3 & 77) << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            BottomAppBar bottomAppBar = this.g;
            int i8 = bottomAppBar.ab;
            if (i8 != 0) {
                int i9 = a;
                int i10 = i9 & 57;
                int i11 = (i10 - (~(-(-((i9 ^ 57) | i10))))) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                int i13 = b;
                int i14 = i13 ^ 125;
                int i15 = ((i13 & 125) | i14) << 1;
                int i16 = -i14;
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                a = i17 % 128;
                int i18 = i17 % 2;
                z = false;
            }
            if (i8 != 0) {
                int i19 = b;
                int i20 = i19 & 53;
                int i21 = ((i19 ^ 53) | i20) << 1;
                int i22 = -((i19 | 53) & (~i20));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                a = i23 % 128;
                int i24 = i23 % 2;
                bottomAppBar.ab = 0;
                bottomAppBar.getMenu().clear();
                int i25 = b;
                int i26 = ((i25 & 46) + (i25 | 46)) - 1;
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    bottomAppBar.q(i8);
                    int i27 = 23 / 0;
                } else {
                    bottomAppBar.q(i8);
                }
            }
            BottomAppBar bottomAppBar2 = this.g;
            ActionMenuView actionMenuView = this.d;
            int i28 = a + 79;
            b = i28 % 128;
            int i29 = i28 % 2;
            int i30 = this.e;
            boolean z2 = this.f;
            Objects.requireNonNull(bottomAppBar2);
            e eVar = new e(bottomAppBar2, actionMenuView, i30, z2);
            int i31 = a;
            int i32 = i31 ^ 13;
            int i33 = (((i31 & 13) | i32) << 1) - i32;
            int i34 = i33 % 128;
            b = i34;
            int i35 = i33 % 2;
            if (z) {
                int i36 = i34 & 3;
                int i37 = (i36 - (~(-(-((i34 ^ 3) | i36))))) - 1;
                a = i37 % 128;
                if (i37 % 2 == 0) {
                    actionMenuView.post(eVar);
                    return;
                } else {
                    actionMenuView.post(eVar);
                    int i38 = 80 / 0;
                    return;
                }
            }
            eVar.run();
            int i39 = b;
            int i40 = i39 ^ 29;
            int i41 = (i39 & 29) << 1;
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            a = i42 % 128;
            int i43 = i42 % 2;
        }
        int i44 = b;
        int i45 = i44 & 121;
        int i46 = -(-((i44 ^ 121) | i45));
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        a = i47 % 128;
        if (i47 % 2 != 0) {
            int i48 = 64 / 0;
        }
    }
}
