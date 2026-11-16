package ivas.gov.bisp.enumeration.V;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements View.OnClickListener {
    private static final Runnable ENABLE_AGAIN = new Runnable() { // from class: ivas.gov.bisp.enumeration.V.P
        private static int a = 0;
        private static int b = 1;

        static {
            int i = b;
            int i2 = i & 43;
            int i3 = i2 + ((i ^ 43) | i2);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 57) << 1) - (i2 ^ 57);
            b = i3 % 128;
            int i4 = i3 % 2;
            t.c();
            int i5 = b;
            int i6 = i5 | 29;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 29)) & i6);
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
    };
    private static int b = 0;
    private static int c = 1;
    public static boolean enabled = true;

    static {
        int i = b + 65;
        c = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = (i2 ^ 77) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        c = i5 % 128;
        int i6 = i5 % 2;
        lambda$static$0();
        int i7 = b;
        int i8 = ((i7 | 79) << 1) - (i7 ^ 79);
        c = i8 % 128;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ void lambda$static$0() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = -(-(i2 | 69));
        int i5 = (i3 & i4) + (i3 | i4);
        c = i5 % 128;
        int i6 = i5 % 2;
        enabled = true;
        int i7 = i2 & 109;
        int i8 = ((((i2 ^ 109) | i7) << 1) - (~(-((i2 | 109) & (~i7))))) - 1;
        c = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 53 / 0;
        }
    }

    public abstract void doClick(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 13;
        int i4 = (i3 - (~(-(-((i2 ^ 13) | i3))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (enabled) {
            int i6 = i5 & 7;
            int i7 = ((i5 ^ 7) | i6) << 1;
            int i8 = -((i5 | 7) & (~i6));
            int i9 = (i7 & i8) + (i8 | i7);
            c = i9 % 128;
            if (i9 % 2 == 0) {
                enabled = false;
                runnable = ENABLE_AGAIN;
            } else {
                enabled = false;
                runnable = ENABLE_AGAIN;
            }
            view.post(runnable);
            doClick(view);
        }
        int i10 = b;
        int i11 = i10 & 29;
        int i12 = (i10 | 29) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        c = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }
}
