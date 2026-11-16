package ivas.gov.bisp.enumeration.p007ag;

import android.graphics.Rect;
import ivas.gov.bisp.enumeration.Oooo0o0.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static int a = 1;
    private static int b;
    public static final ThreadLocal<o0ooOOo<Rect, Rect>> c = new ThreadLocal<>();

    static {
        int i = b + 111;
        a = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
