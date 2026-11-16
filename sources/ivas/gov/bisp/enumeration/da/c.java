package ivas.gov.bisp.enumeration.da;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public class c extends FloatingActionButton.OooO00o {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ BottomAppBar d;

    public class bIv extends FloatingActionButton.OooO00o {
        private static int a = 1;
        private static int b;

        public bIv() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OooO00o
        public void c(FloatingActionButton floatingActionButton) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 63) + (i2 | 63);
            b = i3 % 128;
            int i4 = i3 % 2;
            BottomAppBar bottomAppBar = c.this.d;
            if (i4 == 0) {
                BottomAppBar.a(bottomAppBar);
            } else {
                BottomAppBar.a(bottomAppBar);
                throw null;
            }
        }
    }

    public c(BottomAppBar bottomAppBar, int i) {
        this.d = bottomAppBar;
        this.c = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OooO00o
    public void b(FloatingActionButton floatingActionButton) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 39;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 39)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        floatingActionButton.setTranslationX(this.d.E(this.c));
        bIv biv = new bIv();
        int i8 = a;
        int i9 = i8 & 103;
        int i10 = (((i8 | 103) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        floatingActionButton.r(biv, true);
        int i12 = a;
        int i13 = (i12 ^ 59) + ((i12 & 59) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 56 / 0;
        }
    }
}
