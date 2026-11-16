package ivas.gov.bisp.enumeration.Q;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class N extends LinearLayoutManager {
    private static int E = 1;
    private static int F;

    public class bep extends androidx.recyclerview.widget.r {
        private static int p = 1;
        private static int q;

        public bep(N n, Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public float g(DisplayMetrics displayMetrics) {
            int i = 2 % 2;
            int i2 = q;
            int i3 = i2 & 83;
            int i4 = -(-((i2 ^ 83) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            p = i5 % 128;
            int i6 = i5 % 2;
            float f = 100.0f / displayMetrics.densityDpi;
            int i7 = p;
            int i8 = i7 & 67;
            int i9 = -(-(i7 | 67));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            q = i10 % 128;
            int i11 = i10 % 2;
            return f;
        }
    }

    public N(Context context, int i, boolean z) {
        super(i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ap(RecyclerView recyclerView, RecyclerView.o0Oo0oo o0oo0oo, int i) {
        int i2 = 2 % 2;
        bep bepVar = new bep(this, recyclerView.getContext());
        int i3 = F;
        int i4 = i3 & 111;
        int i5 = (i3 ^ 111) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        E = i6 % 128;
        int i7 = i6 % 2;
        bepVar.a = i;
        ao(bepVar);
        int i8 = F;
        int i9 = i8 ^ 1;
        int i10 = -(-((i8 & 1) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        E = i11 % 128;
        int i12 = i11 % 2;
    }
}
