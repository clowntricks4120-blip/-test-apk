package ivas.gov.bisp.enumeration.F;

import android.animation.Animator;
import androidx.fragment.app.e;
import ivas.gov.bisp.enumeration.H.c;

/* JADX INFO: loaded from: classes.dex */
public class S implements c.aKS {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Animator c;

    public S(e eVar, Animator animator) {
        this.c = animator;
    }

    @Override // ivas.gov.bisp.enumeration.H.c.aKS
    public void onCancel() {
        int i = 2 % 2;
        int i2 = b + 33;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.c.end();
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
    }
}
